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
package org.apache.camel.component.aws2.eventbridge.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.aws2.eventbridge.EventbridgeComponent;
import org.apache.camel.component.aws2.eventbridge.EventbridgeOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import software.amazon.awssdk.core.Protocol;

/**
 * Manage AWS Eventbridge cluster instances using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws2-eventbridge")
public class EventbridgeComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-eventbridge component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Setting the autoDiscoverClient mechanism, if true, the component will
     * look for a client instance in the registry automatically otherwise it
     * will skip that checking.
     */
    private Boolean autoDiscoverClient = true;
    /**
     * Component configuration. The option is a
     * org.apache.camel.component.aws2.eventbridge.EventbridgeConfiguration
     * type.
     */
    private String configuration;
    /**
     * To use a existing configured AWS Eventbridge as client. The option is a
     * software.amazon.awssdk.services.eventbridge.EventBridgeClient type.
     */
    private String eventbridgeClient;
    /**
     * EventPattern File
     */
    private String eventPatternFile;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * The operation to perform
     */
    private EventbridgeOperations operation = EventbridgeOperations.putRule;
    /**
     * If we want to use a POJO request as body or not
     */
    private Boolean pojoRequest = false;
    /**
     * To define a proxy host when instantiating the Eventbridge client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the Eventbridge client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the Eventbridge client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * The region in which Eventbridge client needs to work. When using this
     * parameter, the configuration will expect the lowercase name of the region
     * (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;

    public Boolean getAutoDiscoverClient() {
        return autoDiscoverClient;
    }

    public void setAutoDiscoverClient(Boolean autoDiscoverClient) {
        this.autoDiscoverClient = autoDiscoverClient;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getEventbridgeClient() {
        return eventbridgeClient;
    }

    public void setEventbridgeClient(String eventbridgeClient) {
        this.eventbridgeClient = eventbridgeClient;
    }

    public String getEventPatternFile() {
        return eventPatternFile;
    }

    public void setEventPatternFile(String eventPatternFile) {
        this.eventPatternFile = eventPatternFile;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public EventbridgeOperations getOperation() {
        return operation;
    }

    public void setOperation(EventbridgeOperations operation) {
        this.operation = operation;
    }

    public Boolean getPojoRequest() {
        return pojoRequest;
    }

    public void setPojoRequest(Boolean pojoRequest) {
        this.pojoRequest = pojoRequest;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    @Deprecated
    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}