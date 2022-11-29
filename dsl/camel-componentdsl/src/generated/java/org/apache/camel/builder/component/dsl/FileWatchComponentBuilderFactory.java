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
import org.apache.camel.component.file.watch.FileWatchComponent;

/**
 * Get notified about file events in a directory using
 * java.nio.file.WatchService.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface FileWatchComponentBuilderFactory {

    /**
     * File Watch (camel-file-watch)
     * Get notified about file events in a directory using
     * java.nio.file.WatchService.
     * 
     * Category: file
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-file-watch
     * 
     * @return the dsl builder
     */
    static FileWatchComponentBuilder fileWatch() {
        return new FileWatchComponentBuilderImpl();
    }

    /**
     * Builder for the File Watch component.
     */
    interface FileWatchComponentBuilder
            extends
                ComponentBuilder<FileWatchComponent> {
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
        default FileWatchComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The number of concurrent consumers. Increase this value, if your
         * route is slow to prevent buffering in queue.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default FileWatchComponentBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Reference to io.methvin.watcher.hashing.FileHasher. This prevents
         * emitting duplicate events on some platforms. For working with large
         * files and if you dont need detect multiple modifications per second
         * per file, use #lastModifiedTimeFileHasher. You can also provide
         * custom implementation in registry.
         * 
         * The option is a:
         * &lt;code&gt;io.methvin.watcher.hashing.FileHasher&lt;/code&gt; type.
         * 
         * Default: #murmur3FFileHasher
         * Group: consumer
         * 
         * @param fileHasher the value to set
         * @return the dsl builder
         */
        default FileWatchComponentBuilder fileHasher(
                io.methvin.watcher.hashing.FileHasher fileHasher) {
            doSetProperty("fileHasher", fileHasher);
            return this;
        }
        /**
         * The number of threads polling WatchService. Increase this value, if
         * you see OVERFLOW messages in log.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param pollThreads the value to set
         * @return the dsl builder
         */
        default FileWatchComponentBuilder pollThreads(int pollThreads) {
            doSetProperty("pollThreads", pollThreads);
            return this;
        }
        /**
         * Maximum size of queue between WatchService and consumer. Unbounded by
         * default.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 2147483647
         * Group: consumer
         * 
         * @param queueSize the value to set
         * @return the dsl builder
         */
        default FileWatchComponentBuilder queueSize(int queueSize) {
            doSetProperty("queueSize", queueSize);
            return this;
        }
        /**
         * Enables or disables file hashing to detect duplicate events. If you
         * disable this, you can get some events multiple times on some
         * platforms and JDKs. Check java.nio.file.WatchService limitations for
         * your target platform.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param useFileHashing the value to set
         * @return the dsl builder
         */
        default FileWatchComponentBuilder useFileHashing(boolean useFileHashing) {
            doSetProperty("useFileHashing", useFileHashing);
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
        default FileWatchComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class FileWatchComponentBuilderImpl
            extends
                AbstractComponentBuilder<FileWatchComponent>
            implements
                FileWatchComponentBuilder {
        @Override
        protected FileWatchComponent buildConcreteComponent() {
            return new FileWatchComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((FileWatchComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "concurrentConsumers": ((FileWatchComponent) component).setConcurrentConsumers((int) value); return true;
            case "fileHasher": ((FileWatchComponent) component).setFileHasher((io.methvin.watcher.hashing.FileHasher) value); return true;
            case "pollThreads": ((FileWatchComponent) component).setPollThreads((int) value); return true;
            case "queueSize": ((FileWatchComponent) component).setQueueSize((int) value); return true;
            case "useFileHashing": ((FileWatchComponent) component).setUseFileHashing((boolean) value); return true;
            case "autowiredEnabled": ((FileWatchComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}