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
package org.apache.camel.component.stitch.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.stitch.StitchComponent;
import org.apache.camel.component.stitch.StitchConfiguration;
import org.apache.camel.component.stitch.client.StitchClient;
import org.apache.camel.component.stitch.client.StitchRegion;
import org.apache.camel.component.stitch.client.models.StitchSchema;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

/**
 * Stitch is a cloud ETL service that integrates various data sources into a
 * central data warehouse through various integrations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.stitch")
public class StitchComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the stitch component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The component configurations. The option is a
     * org.apache.camel.component.stitch.StitchConfiguration type.
     */
    private StitchConfiguration configuration;
    /**
     * A collection of comma separated strings representing the Primary Key
     * fields in the source table. Stitch use these Primary Keys to de-dupe data
     * during loading If not provided, the table will be loaded in an
     * append-only manner.
     */
    private String keyNames;
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
     * Stitch account region, e.g: europe
     */
    private StitchRegion region = StitchRegion.EUROPE;
    /**
     * A schema that describes the record(s). The option is a
     * org.apache.camel.component.stitch.client.models.StitchSchema type.
     */
    private StitchSchema stitchSchema;
    /**
     * ConnectionProvider contain configuration for the HttpClient like Maximum
     * connection limit .. etc, you can inject this ConnectionProvider and the
     * StitchClient will initialize HttpClient with this ConnectionProvider. The
     * option is a reactor.netty.resources.ConnectionProvider type.
     */
    private ConnectionProvider connectionProvider;
    /**
     * Reactor Netty HttpClient, you can injected it if you want to have custom
     * HttpClient. The option is a reactor.netty.http.client.HttpClient type.
     */
    private HttpClient httpClient;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Set a custom StitchClient that implements
     * org.apache.camel.component.stitch.client.StitchClient interface. The
     * option is a org.apache.camel.component.stitch.client.StitchClient type.
     */
    private StitchClient stitchClient;
    /**
     * Stitch access token for the Stitch Import API
     */
    private String token;

    public StitchConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(StitchConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getKeyNames() {
        return keyNames;
    }

    public void setKeyNames(String keyNames) {
        this.keyNames = keyNames;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public StitchRegion getRegion() {
        return region;
    }

    public void setRegion(StitchRegion region) {
        this.region = region;
    }

    public StitchSchema getStitchSchema() {
        return stitchSchema;
    }

    public void setStitchSchema(StitchSchema stitchSchema) {
        this.stitchSchema = stitchSchema;
    }

    public ConnectionProvider getConnectionProvider() {
        return connectionProvider;
    }

    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public StitchClient getStitchClient() {
        return stitchClient;
    }

    public void setStitchClient(StitchClient stitchClient) {
        this.stitchClient = stitchClient;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}