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
package org.apache.camel.component.gson.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Marshal POJOs to JSON and back using Gson
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.gson")
public class GsonDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the gson data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To enable pretty printing output nicely formatted. Is by default false.
     */
    private Boolean prettyPrint = false;
    /**
     * Class name of the java type to use when unmarshalling
     */
    private String unmarshalType;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format. For example application/xml for data formats
     * marshalling to XML, or application/json for data formats marshalling to
     * JSON
     */
    private Boolean contentTypeHeader = true;
    /**
     * To configure the date format while marshall or unmarshall Date fields in
     * JSON using Gson
     */
    private String dateFormatPattern;

    public Boolean getPrettyPrint() {
        return prettyPrint;
    }

    public void setPrettyPrint(Boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public String getUnmarshalType() {
        return unmarshalType;
    }

    public void setUnmarshalType(String unmarshalType) {
        this.unmarshalType = unmarshalType;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }

    public String getDateFormatPattern() {
        return dateFormatPattern;
    }

    public void setDateFormatPattern(String dateFormatPattern) {
        this.dateFormatPattern = dateFormatPattern;
    }
}