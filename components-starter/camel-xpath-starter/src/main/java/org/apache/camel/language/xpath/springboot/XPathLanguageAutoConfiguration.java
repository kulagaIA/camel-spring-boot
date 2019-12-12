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
package org.apache.camel.language.xpath.springboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.language.xpath.XPathLanguage;
import org.apache.camel.spi.HasId;
import org.apache.camel.spi.LanguageCustomizer;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.LanguageConfigurationProperties;
import org.apache.camel.spring.boot.util.CamelPropertiesHelper;
import org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans;
import org.apache.camel.spring.boot.util.GroupCondition;
import org.apache.camel.spring.boot.util.HierarchicalPropertiesEvaluator;
import org.apache.camel.support.IntrospectionSupport;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@Configuration
@Conditional({ConditionalOnCamelContextAndAutoConfigurationBeans.class,
        XPathLanguageAutoConfiguration.GroupConditions.class})
@AutoConfigureAfter(CamelAutoConfiguration.class)
@EnableConfigurationProperties({LanguageConfigurationProperties.class,
        XPathLanguageConfiguration.class})
public class XPathLanguageAutoConfiguration {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(XPathLanguageAutoConfiguration.class);
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private CamelContext camelContext;
    @Autowired
    private XPathLanguageConfiguration configuration;
    @Autowired(required = false)
    private List<LanguageCustomizer<XPathLanguage>> customizers;

    static class GroupConditions extends GroupCondition {
        public GroupConditions() {
            super("camel.component", "camel.component.xpath");
        }
    }

    @Bean(name = "xpath-language")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @ConditionalOnMissingBean(XPathLanguage.class)
    public XPathLanguage configureXPathLanguage() throws Exception {
        XPathLanguage language = new XPathLanguage();
        if (CamelContextAware.class.isAssignableFrom(XPathLanguage.class)) {
            CamelContextAware contextAware = CamelContextAware.class
                    .cast(language);
            if (contextAware != null) {
                contextAware.setCamelContext(camelContext);
            }
        }
        Map<String, Object> parameters = new HashMap<>();
        IntrospectionSupport.getProperties(configuration, parameters, null,
                false);
        CamelPropertiesHelper.setCamelProperties(camelContext, language,
                parameters, false);
        if (ObjectHelper.isNotEmpty(customizers)) {
            for (LanguageCustomizer<XPathLanguage> customizer : customizers) {
                boolean useCustomizer = (customizer instanceof HasId)
                        ? HierarchicalPropertiesEvaluator.evaluate(
                                applicationContext.getEnvironment(),
                                "camel.language.customizer",
                                "camel.language.xpath.customizer",
                                ((HasId) customizer).getId())
                        : HierarchicalPropertiesEvaluator.evaluate(
                                applicationContext.getEnvironment(),
                                "camel.language.customizer",
                                "camel.language.xpath.customizer");
                if (useCustomizer) {
                    LOGGER.debug("Configure language {}, with customizer {}",
                            language, customizer);
                    customizer.customize(language);
                }
            }
        }
        return language;
    }
}