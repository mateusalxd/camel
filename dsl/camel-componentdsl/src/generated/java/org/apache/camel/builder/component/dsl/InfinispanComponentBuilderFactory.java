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
import org.apache.camel.component.infinispan.remote.InfinispanRemoteComponent;

/**
 * Read and write from/to Infinispan distributed key/value store and data grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface InfinispanComponentBuilderFactory {

    /**
     * Infinispan (camel-infinispan)
     * Read and write from/to Infinispan distributed key/value store and data
     * grid.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.13
     * Maven coordinates: org.apache.camel:camel-infinispan
     * 
     * @return the dsl builder
     */
    static InfinispanComponentBuilder infinispan() {
        return new InfinispanComponentBuilderImpl();
    }

    /**
     * Builder for the Infinispan component.
     */
    interface InfinispanComponentBuilder
            extends
                ComponentBuilder<InfinispanRemoteComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder configuration(
                org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Specifies the host of the cache on Infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hosts the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder hosts(java.lang.String hosts) {
            doSetProperty("hosts", hosts);
            return this;
        }
        /**
         * Specifies the query builder.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.InfinispanQueryBuilder&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param queryBuilder the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder queryBuilder(
                org.apache.camel.component.infinispan.InfinispanQueryBuilder queryBuilder) {
            doSetProperty("queryBuilder", queryBuilder);
            return this;
        }
        /**
         * Define if we are connecting to a secured Infinispan instance.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param secure the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
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
        default InfinispanComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Returns the custom listener in use, if provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param customListener the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder customListener(
                org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener customListener) {
            doSetProperty("customListener", customListener);
            return this;
        }
        /**
         * Specifies the set of event types to register by the consumer.Multiple
         * event can be separated by comma. The possible event types are:
         * CLIENT_CACHE_ENTRY_CREATED, CLIENT_CACHE_ENTRY_MODIFIED,
         * CLIENT_CACHE_ENTRY_REMOVED, CLIENT_CACHE_ENTRY_EXPIRED,
         * CLIENT_CACHE_FAILOVER.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder eventTypes(
                java.lang.String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * Set a specific default value for some producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultValue the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder defaultValue(
                java.lang.Object defaultValue) {
            doSetProperty("defaultValue", defaultValue);
            return this;
        }
        /**
         * Set a specific key for producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
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
        default InfinispanComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set a specific old value for some producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param oldValue the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder oldValue(java.lang.Object oldValue) {
            doSetProperty("oldValue", oldValue);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.InfinispanOperation&lt;/code&gt; type.
         * 
         * Default: PUT
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder operation(
                org.apache.camel.component.infinispan.InfinispanOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set a specific value for producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder value(java.lang.Object value) {
            doSetProperty("value", value);
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
        default InfinispanComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Specifies the cache Container to connect.
         * 
         * The option is a:
         * &lt;code&gt;org.infinispan.client.hotrod.RemoteCacheManager&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param cacheContainer the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder cacheContainer(
                org.infinispan.client.hotrod.RemoteCacheManager cacheContainer) {
            doSetProperty("cacheContainer", cacheContainer);
            return this;
        }
        /**
         * The CacheContainer configuration. Used if the cacheContainer is not
         * defined.
         * 
         * The option is a:
         * &lt;code&gt;org.infinispan.client.hotrod.configuration.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param cacheContainerConfiguration the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder cacheContainerConfiguration(
                org.infinispan.client.hotrod.configuration.Configuration cacheContainerConfiguration) {
            doSetProperty("cacheContainerConfiguration", cacheContainerConfiguration);
            return this;
        }
        /**
         * Implementation specific properties for the CacheManager.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configurationProperties the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder configurationProperties(
                java.util.Map<java.lang.String, java.lang.String> configurationProperties) {
            doSetProperty("configurationProperties", configurationProperties);
            return this;
        }
        /**
         * An implementation specific URI for the CacheManager.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configurationUri the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * A comma separated list of org.infinispan.client.hotrod.Flag to be
         * applied by default on each cache invocation.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param flags the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder flags(java.lang.String flags) {
            doSetProperty("flags", flags);
            return this;
        }
        /**
         * Set a specific remappingFunction to use in a compute operation.
         * 
         * The option is a:
         * &lt;code&gt;java.util.function.BiFunction&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param remappingFunction the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder remappingFunction(
                java.util.function.BiFunction remappingFunction) {
            doSetProperty("remappingFunction", remappingFunction);
            return this;
        }
        /**
         * Store the operation result in a header instead of the message body.
         * By default, resultHeader == null and the query result is stored in
         * the message body, any existing content in the message body is
         * discarded. If resultHeader is set, the value is used as the name of
         * the header to store the query result and the original message body is
         * preserved. This value can be overridden by an in message header
         * named: CamelInfinispanOperationResultHeader.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resultHeader the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder resultHeader(
                java.lang.String resultHeader) {
            doSetProperty("resultHeader", resultHeader);
            return this;
        }
        /**
         * Define the password to access the infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Define the SASL Mechanism to access the infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param saslMechanism the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder saslMechanism(
                java.lang.String saslMechanism) {
            doSetProperty("saslMechanism", saslMechanism);
            return this;
        }
        /**
         * Define the security realm to access the infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param securityRealm the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder securityRealm(
                java.lang.String securityRealm) {
            doSetProperty("securityRealm", securityRealm);
            return this;
        }
        /**
         * Define the security server name to access the infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param securityServerName the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder securityServerName(
                java.lang.String securityServerName) {
            doSetProperty("securityServerName", securityServerName);
            return this;
        }
        /**
         * Define the username to access the infinispan instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default InfinispanComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class InfinispanComponentBuilderImpl
            extends
                AbstractComponentBuilder<InfinispanRemoteComponent>
            implements
                InfinispanComponentBuilder {
        @Override
        protected InfinispanRemoteComponent buildConcreteComponent() {
            return new InfinispanRemoteComponent();
        }
        private org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration getOrCreateConfiguration(
                org.apache.camel.component.infinispan.remote.InfinispanRemoteComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((InfinispanRemoteComponent) component).setConfiguration((org.apache.camel.component.infinispan.remote.InfinispanRemoteConfiguration) value); return true;
            case "hosts": getOrCreateConfiguration((InfinispanRemoteComponent) component).setHosts((java.lang.String) value); return true;
            case "queryBuilder": getOrCreateConfiguration((InfinispanRemoteComponent) component).setQueryBuilder((org.apache.camel.component.infinispan.InfinispanQueryBuilder) value); return true;
            case "secure": getOrCreateConfiguration((InfinispanRemoteComponent) component).setSecure((boolean) value); return true;
            case "bridgeErrorHandler": ((InfinispanRemoteComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "customListener": getOrCreateConfiguration((InfinispanRemoteComponent) component).setCustomListener((org.apache.camel.component.infinispan.remote.InfinispanRemoteCustomListener) value); return true;
            case "eventTypes": getOrCreateConfiguration((InfinispanRemoteComponent) component).setEventTypes((java.lang.String) value); return true;
            case "defaultValue": getOrCreateConfiguration((InfinispanRemoteComponent) component).setDefaultValue((java.lang.Object) value); return true;
            case "key": getOrCreateConfiguration((InfinispanRemoteComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((InfinispanRemoteComponent) component).setLazyStartProducer((boolean) value); return true;
            case "oldValue": getOrCreateConfiguration((InfinispanRemoteComponent) component).setOldValue((java.lang.Object) value); return true;
            case "operation": getOrCreateConfiguration((InfinispanRemoteComponent) component).setOperation((org.apache.camel.component.infinispan.InfinispanOperation) value); return true;
            case "value": getOrCreateConfiguration((InfinispanRemoteComponent) component).setValue((java.lang.Object) value); return true;
            case "autowiredEnabled": ((InfinispanRemoteComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "cacheContainer": getOrCreateConfiguration((InfinispanRemoteComponent) component).setCacheContainer((org.infinispan.client.hotrod.RemoteCacheManager) value); return true;
            case "cacheContainerConfiguration": getOrCreateConfiguration((InfinispanRemoteComponent) component).setCacheContainerConfiguration((org.infinispan.client.hotrod.configuration.Configuration) value); return true;
            case "configurationProperties": getOrCreateConfiguration((InfinispanRemoteComponent) component).setConfigurationProperties((java.util.Map) value); return true;
            case "configurationUri": getOrCreateConfiguration((InfinispanRemoteComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "flags": getOrCreateConfiguration((InfinispanRemoteComponent) component).setFlags((java.lang.String) value); return true;
            case "remappingFunction": getOrCreateConfiguration((InfinispanRemoteComponent) component).setRemappingFunction((java.util.function.BiFunction) value); return true;
            case "resultHeader": getOrCreateConfiguration((InfinispanRemoteComponent) component).setResultHeader((java.lang.String) value); return true;
            case "password": getOrCreateConfiguration((InfinispanRemoteComponent) component).setPassword((java.lang.String) value); return true;
            case "saslMechanism": getOrCreateConfiguration((InfinispanRemoteComponent) component).setSaslMechanism((java.lang.String) value); return true;
            case "securityRealm": getOrCreateConfiguration((InfinispanRemoteComponent) component).setSecurityRealm((java.lang.String) value); return true;
            case "securityServerName": getOrCreateConfiguration((InfinispanRemoteComponent) component).setSecurityServerName((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((InfinispanRemoteComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}