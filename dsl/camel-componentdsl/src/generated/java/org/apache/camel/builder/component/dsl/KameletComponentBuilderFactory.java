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

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.kamelet.KameletComponent;

/**
 * To call Kamelets
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface KameletComponentBuilderFactory {

    /**
     * Kamelet (camel-kamelet)
     * To call Kamelets
     * 
     * Category: core
     * Since: 3.8
     * Maven coordinates: org.apache.camel:camel-kamelet
     * 
     * @return the dsl builder
     */
    static KameletComponentBuilder kamelet() {
        return new KameletComponentBuilderImpl();
    }

    /**
     * Builder for the Kamelet component.
     */
    interface KameletComponentBuilder
            extends
                ComponentBuilder<KameletComponent> {
        /**
         * The location(s) of the Kamelets on the file system. Multiple
         * locations can be set separated by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: classpath:/kamelets
         * Group: common
         * 
         * @param location the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder location(java.lang.String location) {
            doSetProperty("location", location);
            return this;
        }
        /**
         * Set route local parameters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param routeProperties the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder routeProperties(
                java.util.Map<java.lang.String, java.util.Properties> routeProperties) {
            doSetProperty("routeProperties", routeProperties);
            return this;
        }
        /**
         * Set template local parameters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.util.Properties&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param templateProperties the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder templateProperties(
                java.util.Map<java.lang.String, java.util.Properties> templateProperties) {
            doSetProperty("templateProperties", templateProperties);
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
        default KameletComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If sending a message to a kamelet endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param block the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder block(boolean block) {
            doSetProperty("block", block);
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
        default KameletComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
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
        default KameletComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To plugin a custom listener for when the Kamelet component is loading
         * Kamelets from external resources.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.RouteTemplateLoaderListener&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param routeTemplateLoaderListener the value to set
         * @return the dsl builder
         */
        default KameletComponentBuilder routeTemplateLoaderListener(
                org.apache.camel.spi.RouteTemplateLoaderListener routeTemplateLoaderListener) {
            doSetProperty("routeTemplateLoaderListener", routeTemplateLoaderListener);
            return this;
        }
    }

    class KameletComponentBuilderImpl
            extends
                AbstractComponentBuilder<KameletComponent>
            implements
                KameletComponentBuilder {
        @Override
        protected KameletComponent buildConcreteComponent() {
            return new KameletComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "location": ((KameletComponent) component).setLocation((java.lang.String) value); return true;
            case "routeProperties": ((KameletComponent) component).setRouteProperties((java.util.Map) value); return true;
            case "templateProperties": ((KameletComponent) component).setTemplateProperties((java.util.Map) value); return true;
            case "bridgeErrorHandler": ((KameletComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "block": ((KameletComponent) component).setBlock((boolean) value); return true;
            case "lazyStartProducer": ((KameletComponent) component).setLazyStartProducer((boolean) value); return true;
            case "timeout": ((KameletComponent) component).setTimeout((long) value); return true;
            case "autowiredEnabled": ((KameletComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "routeTemplateLoaderListener": ((KameletComponent) component).setRouteTemplateLoaderListener((org.apache.camel.spi.RouteTemplateLoaderListener) value); return true;
            default: return false;
            }
        }
    }
}