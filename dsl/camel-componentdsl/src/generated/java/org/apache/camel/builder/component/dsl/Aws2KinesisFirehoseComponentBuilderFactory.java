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
import org.apache.camel.component.aws2.firehose.KinesisFirehose2Component;

/**
 * Produce data to AWS Kinesis Firehose streams using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2KinesisFirehoseComponentBuilderFactory {

    /**
     * AWS Kinesis Firehose (camel-aws2-kinesis)
     * Produce data to AWS Kinesis Firehose streams using AWS SDK version 2.x.
     * 
     * Category: cloud,messaging
     * Since: 3.2
     * Maven coordinates: org.apache.camel:camel-aws2-kinesis
     * 
     * @return the dsl builder
     */
    static Aws2KinesisFirehoseComponentBuilder aws2KinesisFirehose() {
        return new Aws2KinesisFirehoseComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Kinesis Firehose component.
     */
    interface Aws2KinesisFirehoseComponentBuilder
            extends
                ComponentBuilder<KinesisFirehose2Component> {
        /**
         * Amazon Kinesis Firehose client to use for all requests for this
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.firehose.FirehoseClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonKinesisFirehoseClient the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder amazonKinesisFirehoseClient(
                software.amazon.awssdk.services.firehose.FirehoseClient amazonKinesisFirehoseClient) {
            doSetProperty("amazonKinesisFirehoseClient", amazonKinesisFirehoseClient);
            return this;
        }
        /**
         * This option will set the CBOR_ENABLED property during the execution.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param cborEnabled the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder cborEnabled(
                boolean cborEnabled) {
            doSetProperty("cborEnabled", cborEnabled);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder configuration(
                org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
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
        default Aws2KinesisFirehoseComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to do in case the user don't want to send only a
         * record.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder operation(
                org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis Firehose
         * client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Kinesis Firehose client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder region(
                java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the Kinesis Firehose client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
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
        default Aws2KinesisFirehoseComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2KinesisFirehoseComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2KinesisFirehoseComponentBuilderImpl
            extends
                AbstractComponentBuilder<KinesisFirehose2Component>
            implements
                Aws2KinesisFirehoseComponentBuilder {
        @Override
        protected KinesisFirehose2Component buildConcreteComponent() {
            return new KinesisFirehose2Component();
        }
        private org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.firehose.KinesisFirehose2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonKinesisFirehoseClient": getOrCreateConfiguration((KinesisFirehose2Component) component).setAmazonKinesisFirehoseClient((software.amazon.awssdk.services.firehose.FirehoseClient) value); return true;
            case "cborEnabled": getOrCreateConfiguration((KinesisFirehose2Component) component).setCborEnabled((boolean) value); return true;
            case "configuration": ((KinesisFirehose2Component) component).setConfiguration((org.apache.camel.component.aws2.firehose.KinesisFirehose2Configuration) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((KinesisFirehose2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "lazyStartProducer": ((KinesisFirehose2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((KinesisFirehose2Component) component).setOperation((org.apache.camel.component.aws2.firehose.KinesisFirehose2Operations) value); return true;
            case "proxyHost": getOrCreateConfiguration((KinesisFirehose2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((KinesisFirehose2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((KinesisFirehose2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((KinesisFirehose2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((KinesisFirehose2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((KinesisFirehose2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((KinesisFirehose2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "autowiredEnabled": ((KinesisFirehose2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((KinesisFirehose2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((KinesisFirehose2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}