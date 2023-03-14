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

/**
 * 在某个节点执行完的前后加入的处理，详情见：<img src="https://user-images.githubusercontent.com/48643103/224947072-eecc4165-ebed-4bc3-be70-57da2690b932.png">插件和拦截器（客户端）</img>
 */
public interface ActivePostProcess {

    /**
     * Client: 在准备完成数据之前调用<br>
     * Server: 在绑定到端口之前<br>
     *
     * @param request request
     * @return 是否继续执行。
     */
    default boolean preHandler(Request request) {
        return true;
    }

    /**
     * Client: 收到响应后的操作<br>
     * Server: 绑定端口后的操作<br>
     *
     * @param request  request
     * @param response response
     */
    default void postHandler(Request request, Response response) {
        // NO SOMETHING
    }

    /**
     * 异常时调用
     *
     * @param request  request
     * @param response response
     * @param e        Exception
     */
    default void afterCompletion(Request request, Response response, Exception e) {
        // NO SOMETHING
    }
}
