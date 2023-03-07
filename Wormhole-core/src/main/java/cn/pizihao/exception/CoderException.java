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

package cn.pizihao.exception;

/**
 * 在解码和编码过程中，如果发生异常，则抛出类型为{@link CoderException}的异常，
 * 它与{@link RuntimeException}没有什么不同，但是异常的类型更明确
 */
public class CoderException extends RuntimeException {

    private static final long serialVersionUID = 8247610319171014183L;

    public CoderException() {
        super();
    }

    public CoderException(String message) {
        super(message);
    }

    public CoderException(Throwable e) {
        super(e.getMessage(), e);
    }

    public CoderException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public CoderException(String message, Throwable throwable, boolean enableSuppression, boolean writableStackTrace) {
        super(message, throwable, enableSuppression, writableStackTrace);
    }

}
