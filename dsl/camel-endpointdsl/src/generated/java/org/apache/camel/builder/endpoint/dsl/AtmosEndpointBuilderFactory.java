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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import jakarta.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Integrate with EMC's ViPR object data services using the Atmos Client.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtmosEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Atmos component.
     */
    public interface AtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedAtmosEndpointConsumerBuilder advanced() {
            return (AdvancedAtmosEndpointConsumerBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param fullTokenId the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointConsumerBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AtmosEndpointConsumerBuilder basic() {
            return (AtmosEndpointConsumerBuilder) this;
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
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uri the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointConsumerBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Atmos component.
     */
    public interface AtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAtmosEndpointProducerBuilder advanced() {
            return (AdvancedAtmosEndpointProducerBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param fullTokenId the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointProducerBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AtmosEndpointProducerBuilder basic() {
            return (AtmosEndpointProducerBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uri the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointProducerBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Atmos component.
     */
    public interface AtmosEndpointBuilder
            extends
                AtmosEndpointConsumerBuilder,
                AtmosEndpointProducerBuilder {
        default AdvancedAtmosEndpointBuilder advanced() {
            return (AdvancedAtmosEndpointBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param fullTokenId the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param sslValidation the value to set
         * @return the dsl builder
         */
        default AtmosEndpointBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atmos component.
     */
    public interface AdvancedAtmosEndpointBuilder
            extends
                AdvancedAtmosEndpointConsumerBuilder,
                AdvancedAtmosEndpointProducerBuilder {
        default AtmosEndpointBuilder basic() {
            return (AtmosEndpointBuilder) this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uri the value to set
         * @return the dsl builder
         */
        default AdvancedAtmosEndpointBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }

    public interface AtmosBuilders {
        /**
         * Atmos (camel-atmos)
         * Integrate with EMC's ViPR object data services using the Atmos
         * Client.
         * 
         * Category: cloud,file
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-atmos
         * 
         * @return the dsl builder for the headers' name.
         */
        default AtmosHeaderNameBuilder atmos() {
            return AtmosHeaderNameBuilder.INSTANCE;
        }
        /**
         * Atmos (camel-atmos)
         * Integrate with EMC's ViPR object data services using the Atmos
         * Client.
         * 
         * Category: cloud,file
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-atmos
         * 
         * Syntax: <code>atmos:name/operation</code>
         * 
         * Path parameter: name
         * Atmos name
         * 
         * Path parameter: operation (required)
         * Operation to perform
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param path name/operation
         * @return the dsl builder
         */
        default AtmosEndpointBuilder atmos(String path) {
            return AtmosEndpointBuilderFactory.endpointBuilder("atmos", path);
        }
        /**
         * Atmos (camel-atmos)
         * Integrate with EMC's ViPR object data services using the Atmos
         * Client.
         * 
         * Category: cloud,file
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-atmos
         * 
         * Syntax: <code>atmos:name/operation</code>
         * 
         * Path parameter: name
         * Atmos name
         * 
         * Path parameter: operation (required)
         * Operation to perform
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name/operation
         * @return the dsl builder
         */
        default AtmosEndpointBuilder atmos(String componentName, String path) {
            return AtmosEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Atmos component.
     */
    public static class AtmosHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final AtmosHeaderNameBuilder INSTANCE = new AtmosHeaderNameBuilder();

        /**
         * The name of the remote path downloaded in case of a single file.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code DOWNLOADED_FILE}.
         */
        public String downloadedFile() {
            return "DOWNLOADED_FILE";
        }

        /**
         * The name of the remote paths downloaded in case of multiple files
         * (one per line).
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code DOWNLOADED_FILES}.
         */
        public String downloadedFiles() {
            return "DOWNLOADED_FILES";
        }

        /**
         * The name of the remote path uploaded in case of a single file.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code UPLOADED_FILE}.
         */
        public String uploadedFile() {
            return "UPLOADED_FILE";
        }

        /**
         * The name of the remote paths uploaded in case of multiple files (one
         * per line).
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code UPLOADED_FILES}.
         */
        public String uploadedFiles() {
            return "UPLOADED_FILES";
        }

        /**
         * The remote path deleted on Atmos.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code DELETED_PATH}.
         */
        public String deletedPath() {
            return "DELETED_PATH";
        }

        /**
         * The moved path.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code MOVED_PATH}.
         */
        public String movedPath() {
            return "MOVED_PATH";
        }
    }
    static AtmosEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class AtmosEndpointBuilderImpl extends AbstractEndpointBuilder implements AtmosEndpointBuilder, AdvancedAtmosEndpointBuilder {
            public AtmosEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new AtmosEndpointBuilderImpl(path);
    }
}