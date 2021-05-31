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
package org.apache.dubbo.rpc.cluster.filter;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.utils.UrlUtils;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.ProtocolServer;
import org.apache.dubbo.rpc.RpcException;

import java.util.List;
import java.util.Objects;

import static org.apache.dubbo.common.constants.CommonConstants.SERVICE_FILTER_KEY;
import static org.apache.dubbo.rpc.cluster.Constants.PEER_KEY;

/**
 * ListenerProtocol
 * 服务引用和暴露的方法上加上了过滤器功能
 */
@Activate(order = 100)
public class ProtocolFilterWrapper implements Protocol {

    private final Protocol protocol;
    private static final FilterChainBuilder builder
            = ExtensionLoader.getExtensionLoader(FilterChainBuilder.class).getDefaultExtension();

    public ProtocolFilterWrapper(Protocol protocol) {
        if (protocol == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        this.protocol = protocol;
    }

    @Override
    public int getDefaultPort() {
        return protocol.getDefaultPort();
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        // 如果是注册中心，则直接暴露服务
        if (UrlUtils.isRegistry(invoker.getUrl())) {
            return protocol.export(invoker);
        }
        // 服务提供侧暴露服务，     组装过滤器
        return protocol.export(builder.buildInvokerChain(invoker, SERVICE_FILTER_KEY, CommonConstants.PROVIDER));
    }

    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        // 如果是注册中心，则直接引用
        if (UrlUtils.isRegistry(url)) {
            return protocol.refer(type, url);
        }
        // if it's peer-to-peer url
        if (!Objects.isNull(url.getAttribute(PEER_KEY))) {
            return builder.buildInvokerChain(protocol.refer(type, url), SERVICE_FILTER_KEY, CommonConstants.CONSUMER);
        }
        return protocol.refer(type, url);
    }

    @Override
    public void destroy() {
        protocol.destroy();
    }

    @Override
    public List<ProtocolServer> getServers() {
        return protocol.getServers();
    }

}
