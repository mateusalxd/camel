/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import jakarta.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.websocket.WebsocketComponent;

/**
 * Expose websocket endpoints using Jetty.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface WebsocketComponentBuilderFactory {

    /**
     * Jetty Websocket (camel-websocket)
     * Expose websocket endpoints using Jetty.
     * 
     * Category: websocket
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-websocket
     * 
     * @return the dsl builder
     */
    static WebsocketComponentBuilder websocket() {
        return new WebsocketComponentBuilderImpl();
    }

    /**
     * Builder for the Jetty Websocket component.
     */
    interface WebsocketComponentBuilder
            extends
                ComponentBuilder<WebsocketComponent> {
        /**
         * The hostname. The default value is 0.0.0.0.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 0.0.0.0
         * Group: common
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder host(java.lang.String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * The port number. The default value is 9292.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 9292
         * Group: common
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder port(java.lang.Integer port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Set a resource path for static resources (such as .html files etc).
         * The resources can be loaded from classpath, if you prefix with
         * classpath:, otherwise the resources is loaded from file system or
         * from JAR files. For example to load from root classpath use
         * classpath:., or classpath:WEB-INF/static If not configured (eg null)
         * then no static resource is in use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param staticResources the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder staticResources(
                java.lang.String staticResources) {
            doSetProperty("staticResources", staticResources);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * If this option is true, Jetty JMX support will be enabled for this
         * endpoint. See Jetty JMX support for more details.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param enableJmx the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder enableJmx(boolean enableJmx) {
            doSetProperty("enableJmx", enableJmx);
            return this;
        }
        /**
         * To set a value for maximum number of threads in server thread pool.
         * MaxThreads/minThreads or threadPool fields are required due to switch
         * to Jetty9. The default values for maxThreads is 1 2 noCores.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param maxThreads the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder maxThreads(
                java.lang.Integer maxThreads) {
            doSetProperty("maxThreads", maxThreads);
            return this;
        }
        /**
         * To set a value for minimum number of threads in server thread pool.
         * MaxThreads/minThreads or threadPool fields are required due to switch
         * to Jetty9. The default values for minThreads is 1.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param minThreads the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder minThreads(
                java.lang.Integer minThreads) {
            doSetProperty("minThreads", minThreads);
            return this;
        }
        /**
         * This is a comma-separated list of subprotocols that are supported by
         * the application. The list is in priority order. The first subprotocol
         * on this list that is proposed by the client is the one that will be
         * accepted. If no subprotocol on this list is proposed by the client,
         * then the websocket connection is refused. The special value 'any'
         * means that any subprotocol is acceptable. 'any' can be used on its
         * own, or as a failsafe at the end of a list of more specific
         * protocols. 'any' will also match the case where no subprotocol is
         * proposed by the client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: any
         * Group: advanced
         * 
         * @param subprotocol the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder subprotocol(
                java.lang.String subprotocol) {
            doSetProperty("subprotocol", subprotocol);
            return this;
        }
        /**
         * To use a custom thread pool for the server. MaxThreads/minThreads or
         * threadPool fields are required due to switch to Jetty9.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.jetty.util.thread.ThreadPool&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param threadPool the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder threadPool(
                org.eclipse.jetty.util.thread.ThreadPool threadPool) {
            doSetProperty("threadPool", threadPool);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * The password for the keystore when using SSL.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslKeyPassword the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder sslKeyPassword(
                java.lang.String sslKeyPassword) {
            doSetProperty("sslKeyPassword", sslKeyPassword);
            return this;
        }
        /**
         * The path to the keystore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslKeystore the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder sslKeystore(
                java.lang.String sslKeystore) {
            doSetProperty("sslKeystore", sslKeystore);
            return this;
        }
        /**
         * The password when using SSL.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslPassword the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder sslPassword(
                java.lang.String sslPassword) {
            doSetProperty("sslPassword", sslPassword);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useGlobalSslContextParameters the value to set
         * @return the dsl builder
         */
        default WebsocketComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class WebsocketComponentBuilderImpl
            extends
                AbstractComponentBuilder<WebsocketComponent>
            implements
                WebsocketComponentBuilder {
        @Override
        protected WebsocketComponent buildConcreteComponent() {
            return new WebsocketComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "host": ((WebsocketComponent) component).setHost((java.lang.String) value); return true;
            case "port": ((WebsocketComponent) component).setPort((java.lang.Integer) value); return true;
            case "bridgeErrorHandler": ((WebsocketComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "staticResources": ((WebsocketComponent) component).setStaticResources((java.lang.String) value); return true;
            case "lazyStartProducer": ((WebsocketComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((WebsocketComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "enableJmx": ((WebsocketComponent) component).setEnableJmx((boolean) value); return true;
            case "maxThreads": ((WebsocketComponent) component).setMaxThreads((java.lang.Integer) value); return true;
            case "minThreads": ((WebsocketComponent) component).setMinThreads((java.lang.Integer) value); return true;
            case "subprotocol": ((WebsocketComponent) component).setSubprotocol((java.lang.String) value); return true;
            case "threadPool": ((WebsocketComponent) component).setThreadPool((org.eclipse.jetty.util.thread.ThreadPool) value); return true;
            case "sslContextParameters": ((WebsocketComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "sslKeyPassword": ((WebsocketComponent) component).setSslKeyPassword((java.lang.String) value); return true;
            case "sslKeystore": ((WebsocketComponent) component).setSslKeystore((java.lang.String) value); return true;
            case "sslPassword": ((WebsocketComponent) component).setSslPassword((java.lang.String) value); return true;
            case "useGlobalSslContextParameters": ((WebsocketComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}