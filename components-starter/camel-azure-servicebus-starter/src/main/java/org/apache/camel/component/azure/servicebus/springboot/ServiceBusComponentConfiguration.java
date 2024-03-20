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
package org.apache.camel.component.azure.servicebus.springboot;

import java.time.Duration;
import java.time.OffsetDateTime;
import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.ClientOptions;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.messaging.servicebus.ServiceBusSenderAsyncClient;
import com.azure.messaging.servicebus.ServiceBusTransactionContext;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;
import org.apache.camel.component.azure.servicebus.CredentialType;
import org.apache.camel.component.azure.servicebus.ServiceBusComponent;
import org.apache.camel.component.azure.servicebus.ServiceBusConfiguration;
import org.apache.camel.component.azure.servicebus.ServiceBusConsumerOperationDefinition;
import org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition;
import org.apache.camel.component.azure.servicebus.ServiceBusType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send and receive messages to/from Azure Service Bus.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.azure-servicebus")
public class ServiceBusComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the azure-servicebus component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the retry options for Service Bus clients. If not specified, the
     * default retry options are used. The option is a
     * com.azure.core.amqp.AmqpRetryOptions type.
     */
    private AmqpRetryOptions amqpRetryOptions;
    /**
     * Sets the transport type by which all the communication with Azure Service
     * Bus occurs. Default value is AMQP.
     */
    private AmqpTransportType amqpTransportType = AmqpTransportType.AMQP;
    /**
     * Sets the ClientOptions to be sent from the client built from this
     * builder, enabling customization of certain properties, as well as support
     * the addition of custom header information. The option is a
     * com.azure.core.util.ClientOptions type.
     */
    private ClientOptions clientOptions;
    /**
     * The component configurations. The option is a
     * org.apache.camel.component.azure.servicebus.ServiceBusConfiguration type.
     */
    private ServiceBusConfiguration configuration;
    /**
     * Sets the proxy configuration to use for ServiceBusSenderAsyncClient. When
     * a proxy is configured, AMQP_WEB_SOCKETS must be used for the transport
     * type. The option is a com.azure.core.amqp.ProxyOptions type.
     */
    private ProxyOptions proxyOptions;
    /**
     * The service bus type of connection to execute. Queue is for typical queue
     * option and topic for subscription based model.
     */
    private ServiceBusType serviceBusType = ServiceBusType.queue;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Sets the desired operation to be used in the consumer
     */
    private ServiceBusConsumerOperationDefinition consumerOperation = ServiceBusConsumerOperationDefinition.receiveMessages;
    /**
     * Disables auto-complete and auto-abandon of received messages. By default,
     * a successfully processed message is completed. If an error happens when
     * the message is abandoned.
     */
    private Boolean disableAutoComplete = false;
    /**
     * Enable application level deadlettering to the subscription deadletter
     * subqueue if deadletter related headers are set.
     */
    private Boolean enableDeadLettering = false;
    /**
     * Sets the amount of time to continue auto-renewing the lock. Setting ZERO
     * disables auto-renewal. For ServiceBus receive mode (RECEIVE_AND_DELETE
     * RECEIVE_AND_DELETE), auto-renewal is disabled.
     */
    private Duration maxAutoLockRenewDuration;
    /**
     * Set the max number of messages to be peeked during the peek operation.
     */
    private Integer peekNumMaxMessages;
    /**
     * Sets the prefetch count of the receiver. For both PEEK_LOCK PEEK_LOCK and
     * RECEIVE_AND_DELETE RECEIVE_AND_DELETE receive modes the default value is
     * 1. Prefetch speeds up the message flow by aiming to have a message
     * readily available for local retrieval when and before the application
     * asks for one using receive message. Setting a non-zero value will
     * prefetch that number of messages. Setting the value to zero turns
     * prefetch off.
     */
    private Integer prefetchCount;
    /**
     * Sets the receiverAsyncClient in order to consume messages by the
     * consumer. The option is a
     * com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient type.
     */
    private ServiceBusReceiverAsyncClient receiverAsyncClient;
    /**
     * Sets the receive mode for the receiver.
     */
    private ServiceBusReceiveMode serviceBusReceiveMode = ServiceBusReceiveMode.PEEK_LOCK;
    /**
     * Sets the type of the SubQueue to connect to.
     */
    private SubQueue subQueue;
    /**
     * Sets the name of the subscription in the topic to listen to.
     * topicOrQueueName and serviceBusType=topic must also be set. This property
     * is required if serviceBusType=topic and the consumer is in use.
     */
    private String subscriptionName;
    /**
     * If the consumer has connection failure to Azure ServiceBus, then delay
     * (millis) some time before re-connecting.
     */
    private Integer reconnectDelay = 5000;
    /**
     * Set binary mode. If true, message body will be sent as byte. By default,
     * it is false.
     */
    private Boolean binary = false;
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
     * Sets the desired operation to be used in the producer
     */
    private ServiceBusProducerOperationDefinition producerOperation = ServiceBusProducerOperationDefinition.sendMessages;
    /**
     * Sets OffsetDateTime at which the message should appear in the Service Bus
     * queue or topic.
     */
    private OffsetDateTime scheduledEnqueueTime;
    /**
     * Sets SenderAsyncClient to be used in the producer. The option is a
     * com.azure.messaging.servicebus.ServiceBusSenderAsyncClient type.
     */
    private ServiceBusSenderAsyncClient senderAsyncClient;
    /**
     * Represents transaction in service. This object just contains transaction
     * id. The option is a
     * com.azure.messaging.servicebus.ServiceBusTransactionContext type.
     */
    private ServiceBusTransactionContext serviceBusTransactionContext;
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
     * Sets the connection string for a Service Bus namespace or a specific
     * Service Bus resource.
     */
    private String connectionString;
    /**
     * Determines the credential strategy to adopt
     */
    private CredentialType credentialType = CredentialType.CONNECTION_STRING;
    /**
     * Fully Qualified Namespace of the service bus
     */
    private String fullyQualifiedNamespace;
    /**
     * A TokenCredential for Azure AD authentication. The option is a
     * com.azure.core.credential.TokenCredential type.
     */
    private TokenCredential tokenCredential;

    public AmqpRetryOptions getAmqpRetryOptions() {
        return amqpRetryOptions;
    }

    public void setAmqpRetryOptions(AmqpRetryOptions amqpRetryOptions) {
        this.amqpRetryOptions = amqpRetryOptions;
    }

    public AmqpTransportType getAmqpTransportType() {
        return amqpTransportType;
    }

    public void setAmqpTransportType(AmqpTransportType amqpTransportType) {
        this.amqpTransportType = amqpTransportType;
    }

    public ClientOptions getClientOptions() {
        return clientOptions;
    }

    public void setClientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ServiceBusConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ServiceBusConfiguration configuration) {
        this.configuration = configuration;
    }

    public ProxyOptions getProxyOptions() {
        return proxyOptions;
    }

    public void setProxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
    }

    public ServiceBusType getServiceBusType() {
        return serviceBusType;
    }

    public void setServiceBusType(ServiceBusType serviceBusType) {
        this.serviceBusType = serviceBusType;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public ServiceBusConsumerOperationDefinition getConsumerOperation() {
        return consumerOperation;
    }

    public void setConsumerOperation(
            ServiceBusConsumerOperationDefinition consumerOperation) {
        this.consumerOperation = consumerOperation;
    }

    public Boolean getDisableAutoComplete() {
        return disableAutoComplete;
    }

    public void setDisableAutoComplete(Boolean disableAutoComplete) {
        this.disableAutoComplete = disableAutoComplete;
    }

    public Boolean getEnableDeadLettering() {
        return enableDeadLettering;
    }

    public void setEnableDeadLettering(Boolean enableDeadLettering) {
        this.enableDeadLettering = enableDeadLettering;
    }

    public Duration getMaxAutoLockRenewDuration() {
        return maxAutoLockRenewDuration;
    }

    public void setMaxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
        this.maxAutoLockRenewDuration = maxAutoLockRenewDuration;
    }

    public Integer getPeekNumMaxMessages() {
        return peekNumMaxMessages;
    }

    public void setPeekNumMaxMessages(Integer peekNumMaxMessages) {
        this.peekNumMaxMessages = peekNumMaxMessages;
    }

    public Integer getPrefetchCount() {
        return prefetchCount;
    }

    public void setPrefetchCount(Integer prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    public ServiceBusReceiverAsyncClient getReceiverAsyncClient() {
        return receiverAsyncClient;
    }

    public void setReceiverAsyncClient(
            ServiceBusReceiverAsyncClient receiverAsyncClient) {
        this.receiverAsyncClient = receiverAsyncClient;
    }

    public ServiceBusReceiveMode getServiceBusReceiveMode() {
        return serviceBusReceiveMode;
    }

    public void setServiceBusReceiveMode(
            ServiceBusReceiveMode serviceBusReceiveMode) {
        this.serviceBusReceiveMode = serviceBusReceiveMode;
    }

    public SubQueue getSubQueue() {
        return subQueue;
    }

    public void setSubQueue(SubQueue subQueue) {
        this.subQueue = subQueue;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Integer getReconnectDelay() {
        return reconnectDelay;
    }

    public void setReconnectDelay(Integer reconnectDelay) {
        this.reconnectDelay = reconnectDelay;
    }

    public Boolean getBinary() {
        return binary;
    }

    public void setBinary(Boolean binary) {
        this.binary = binary;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public ServiceBusProducerOperationDefinition getProducerOperation() {
        return producerOperation;
    }

    public void setProducerOperation(
            ServiceBusProducerOperationDefinition producerOperation) {
        this.producerOperation = producerOperation;
    }

    public OffsetDateTime getScheduledEnqueueTime() {
        return scheduledEnqueueTime;
    }

    public void setScheduledEnqueueTime(OffsetDateTime scheduledEnqueueTime) {
        this.scheduledEnqueueTime = scheduledEnqueueTime;
    }

    public ServiceBusSenderAsyncClient getSenderAsyncClient() {
        return senderAsyncClient;
    }

    public void setSenderAsyncClient(
            ServiceBusSenderAsyncClient senderAsyncClient) {
        this.senderAsyncClient = senderAsyncClient;
    }

    public ServiceBusTransactionContext getServiceBusTransactionContext() {
        return serviceBusTransactionContext;
    }

    public void setServiceBusTransactionContext(
            ServiceBusTransactionContext serviceBusTransactionContext) {
        this.serviceBusTransactionContext = serviceBusTransactionContext;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public CredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public String getFullyQualifiedNamespace() {
        return fullyQualifiedNamespace;
    }

    public void setFullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
    }

    public TokenCredential getTokenCredential() {
        return tokenCredential;
    }

    public void setTokenCredential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
    }
}