/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.pizihao.chain;

import cn.pizihao.request.Request;
import cn.pizihao.response.Response;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 处理器链可在不同场景中更方便地处理处理器<br>
 * 参考资源：SpringHandlerExecutionChain
 *
 * @see ActivePostProcess
 */
@Slf4j
public final class ActiveProcessChain {

    /**
     * 将应用于其指定程序的拦截器器集合。<br>
     * 拦截器将在不同的场合对服务器端和客户端执行不同的操作。
     */
    List<ActivePostProcess> processes;

    /**
     * 索引 <br>
     * 标识{@link ActivePostProcess#preHandler(Request)}处理的执行位置<br>
     */
    int index = -1;

    public ActiveProcessChain(List<ActivePostProcess> processes) {
        this.processes = processes;
    }

    public ActiveProcessChain(ActivePostProcess... processes) {
        this((processes != null ? Arrays.asList(processes) : Collections.emptyList()));
    }

    /**
     * 调用已经注册的拦截器的前置方法
     */
    public boolean applyPreHandle(Request request) {
        for (int i = 0; i < this.processes.size(); i++) {
            ActivePostProcess handle = processes.get(i);
            if (!handle.preHandler(request)) {
                afterCompletion(request, null, null);
                return false;
            }
            this.index = i;
        }
        return true;
    }

    /**
     * 调用已经注册的拦截器的后置方法
     */
    public void applyPostHandle(Request request, Response response) {
        for (int i = processes.size() - 1; i >= 0; i--) {
            ActivePostProcess handle = processes.get(i);
            handle.postHandler(request, response);
        }
    }

    /**
     * 在映射的ActivePostProcess上触发afterCompletion回调， 将仅为已经调用过preHandle所有拦截器调用afterCompletion
     */
    public void afterCompletion(Request request, Response response, Exception ex) {
        for (int i = this.index; i >= 0; i--) {
            ActivePostProcess handle = processes.get(i);
            try {
                handle.afterCompletion(request, response, ex);
            } catch (Throwable e) {
                log.error("HandlerInterceptor.afterCompletion threw exception", e);
            }
        }
    }

}
