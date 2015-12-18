//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.17 时间 03:29:05 PM CST 
//


package org.apache.activemq.schema.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="deadLetterStrategy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}discarding"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}individualDeadLetterStrategy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}sharedDeadLetterStrategy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destination" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dispatchPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}priorityDispatchPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}priorityNetworkDispatchPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}roundRobinDispatchPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleDispatchPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}strictOrderDispatchPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="messageEvictionStrategy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}oldestMessageEvictionStrategy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}oldestMessageWithLowestPriorityEvictionStrategy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}uniquePropertyMessageEvictionStrategy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="messageGroupMapFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}cachedMessageGroupMapFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}messageGroupHashBucketFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleMessageGroupMapFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="networkBridgeFilterFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}conditionalNetworkBridgeFilterFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}defaultNetworkBridgeFilterFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="pendingDurableSubscriberPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}fileDurableSubscriberCursor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}storeDurableSubscriberCursor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}vmDurableCursor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="pendingMessageLimitStrategy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}constantPendingMessageLimitStrategy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}prefetchRatePendingMessageLimitStrategy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="pendingQueuePolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}fileQueueCursor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}storeCursor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}vmQueueCursor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="pendingSubscriberPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}fileCursor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}vmCursor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="slowConsumerStrategy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}abortSlowAckConsumerStrategy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}abortSlowConsumerStrategy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="subscriptionRecoveryPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}fixedCountSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}fixedSizedSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lastImageSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}noSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queryBasedSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}retainedMessageSubscriptionRecoveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}timedSubscriptionRecoveryPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="advisoryForConsumed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryForDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryForDiscardingMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryForFastProducers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryForSlowConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryWhenFull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allConsumersExclusiveByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="alwaysRetroactive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="blockedProducerWarningInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="consumersBeforeDispatchStarts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cursorMemoryHighWaterMark" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="deadLetterStrategy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dispatchPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doOptimzeMessageStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="durableTopicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="enableAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="expireMessagesPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="gcInactiveDestinations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gcWithNetworkConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="inactiveTimeoutBeforeGC" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="inactiveTimoutBeforeGC" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lazyDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxBrowsePageSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxExpirePageSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxProducersToAudit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxQueueAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="memoryLimit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageEvictionStrategy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageGroupMapFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageGroupMapFactoryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minimumMessageSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="networkBridgeFilterFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optimizeMessageStoreInFlightLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="optimizedDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pendingDurableSubscriberPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pendingMessageLimitStrategy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pendingQueuePolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pendingSubscriberPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistJMSRedelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="prioritizedMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="producerFlowControl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="queue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueBrowserPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="queuePrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="reduceMemoryFootprint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sendAdvisoryIfNoConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="slowConsumerStrategy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="storeUsageHighWaterMark" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="strictOrderDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="subscriptionRecoveryPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tempTopic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timeBeforeDispatchStarts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="useCache" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useConsumerPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="usePrefetchExtension" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deadLetterStrategyOrDestinationOrDispatchPolicy"
})
@XmlRootElement(name = "policyEntry")
public class DtoPolicyEntry implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "pendingMessageLimitStrategy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "destination", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "pendingDurableSubscriberPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "networkBridgeFilterFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "dispatchPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "pendingSubscriberPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "pendingQueuePolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "subscriptionRecoveryPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "slowConsumerStrategy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "deadLetterStrategy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "messageGroupMapFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "messageEvictionStrategy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> deadLetterStrategyOrDestinationOrDispatchPolicy;
    @XmlAttribute(name = "advisoryForConsumed")
    protected Boolean advisoryForConsumed;
    @XmlAttribute(name = "advisoryForDelivery")
    protected Boolean advisoryForDelivery;
    @XmlAttribute(name = "advisoryForDiscardingMessages")
    protected Boolean advisoryForDiscardingMessages;
    @XmlAttribute(name = "advisoryForFastProducers")
    protected Boolean advisoryForFastProducers;
    @XmlAttribute(name = "advisoryForSlowConsumers")
    protected Boolean advisoryForSlowConsumers;
    @XmlAttribute(name = "advisoryWhenFull")
    protected Boolean advisoryWhenFull;
    @XmlAttribute(name = "allConsumersExclusiveByDefault")
    protected Boolean allConsumersExclusiveByDefault;
    @XmlAttribute(name = "alwaysRetroactive")
    protected Boolean alwaysRetroactive;
    @XmlAttribute(name = "blockedProducerWarningInterval")
    protected Long blockedProducerWarningInterval;
    @XmlAttribute(name = "consumersBeforeDispatchStarts")
    protected BigInteger consumersBeforeDispatchStarts;
    @XmlAttribute(name = "cursorMemoryHighWaterMark")
    protected BigInteger cursorMemoryHighWaterMark;
    @XmlAttribute(name = "deadLetterStrategy")
    protected String deadLetterStrategy;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "dispatchPolicy")
    protected String dispatchPolicy;
    @XmlAttribute(name = "doOptimzeMessageStorage")
    protected Boolean doOptimzeMessageStorage;
    @XmlAttribute(name = "durableTopicPrefetch")
    protected BigInteger durableTopicPrefetch;
    @XmlAttribute(name = "enableAudit")
    protected Boolean enableAudit;
    @XmlAttribute(name = "expireMessagesPeriod")
    protected Long expireMessagesPeriod;
    @XmlAttribute(name = "gcInactiveDestinations")
    protected Boolean gcInactiveDestinations;
    @XmlAttribute(name = "gcWithNetworkConsumers")
    protected Boolean gcWithNetworkConsumers;
    @XmlAttribute(name = "inactiveTimeoutBeforeGC")
    protected Long inactiveTimeoutBeforeGC;
    @XmlAttribute(name = "inactiveTimoutBeforeGC")
    protected Long inactiveTimoutBeforeGC;
    @XmlAttribute(name = "lazyDispatch")
    protected Boolean lazyDispatch;
    @XmlAttribute(name = "maxAuditDepth")
    protected BigInteger maxAuditDepth;
    @XmlAttribute(name = "maxBrowsePageSize")
    protected BigInteger maxBrowsePageSize;
    @XmlAttribute(name = "maxExpirePageSize")
    protected BigInteger maxExpirePageSize;
    @XmlAttribute(name = "maxPageSize")
    protected BigInteger maxPageSize;
    @XmlAttribute(name = "maxProducersToAudit")
    protected BigInteger maxProducersToAudit;
    @XmlAttribute(name = "maxQueueAuditDepth")
    protected BigInteger maxQueueAuditDepth;
    @XmlAttribute(name = "memoryLimit")
    protected String memoryLimit;
    @XmlAttribute(name = "messageEvictionStrategy")
    protected String messageEvictionStrategy;
    @XmlAttribute(name = "messageGroupMapFactory")
    protected String messageGroupMapFactory;
    @XmlAttribute(name = "messageGroupMapFactoryType")
    protected String messageGroupMapFactoryType;
    @XmlAttribute(name = "minimumMessageSize")
    protected Long minimumMessageSize;
    @XmlAttribute(name = "networkBridgeFilterFactory")
    protected String networkBridgeFilterFactory;
    @XmlAttribute(name = "optimizeMessageStoreInFlightLimit")
    protected BigInteger optimizeMessageStoreInFlightLimit;
    @XmlAttribute(name = "optimizedDispatch")
    protected Boolean optimizedDispatch;
    @XmlAttribute(name = "pendingDurableSubscriberPolicy")
    protected String pendingDurableSubscriberPolicy;
    @XmlAttribute(name = "pendingMessageLimitStrategy")
    protected String pendingMessageLimitStrategy;
    @XmlAttribute(name = "pendingQueuePolicy")
    protected String pendingQueuePolicy;
    @XmlAttribute(name = "pendingSubscriberPolicy")
    protected String pendingSubscriberPolicy;
    @XmlAttribute(name = "persistJMSRedelivered")
    protected Boolean persistJMSRedelivered;
    @XmlAttribute(name = "prioritizedMessages")
    protected Boolean prioritizedMessages;
    @XmlAttribute(name = "producerFlowControl")
    protected Boolean producerFlowControl;
    @XmlAttribute(name = "queue")
    protected String queue;
    @XmlAttribute(name = "queueBrowserPrefetch")
    protected BigInteger queueBrowserPrefetch;
    @XmlAttribute(name = "queuePrefetch")
    protected BigInteger queuePrefetch;
    @XmlAttribute(name = "reduceMemoryFootprint")
    protected Boolean reduceMemoryFootprint;
    @XmlAttribute(name = "sendAdvisoryIfNoConsumers")
    protected Boolean sendAdvisoryIfNoConsumers;
    @XmlAttribute(name = "slowConsumerStrategy")
    protected String slowConsumerStrategy;
    @XmlAttribute(name = "storeUsageHighWaterMark")
    protected BigInteger storeUsageHighWaterMark;
    @XmlAttribute(name = "strictOrderDispatch")
    protected Boolean strictOrderDispatch;
    @XmlAttribute(name = "subscriptionRecoveryPolicy")
    protected String subscriptionRecoveryPolicy;
    @XmlAttribute(name = "tempQueue")
    protected Boolean tempQueue;
    @XmlAttribute(name = "tempTopic")
    protected Boolean tempTopic;
    @XmlAttribute(name = "timeBeforeDispatchStarts")
    protected BigInteger timeBeforeDispatchStarts;
    @XmlAttribute(name = "topic")
    protected String topic;
    @XmlAttribute(name = "topicPrefetch")
    protected BigInteger topicPrefetch;
    @XmlAttribute(name = "useCache")
    protected Boolean useCache;
    @XmlAttribute(name = "useConsumerPriority")
    protected Boolean useConsumerPriority;
    @XmlAttribute(name = "usePrefetchExtension")
    protected Boolean usePrefetchExtension;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the deadLetterStrategyOrDestinationOrDispatchPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadLetterStrategyOrDestinationOrDispatchPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadLetterStrategyOrDestinationOrDispatchPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingDurableSubscriberPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.DispatchPolicy }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.SubscriptionRecoveryPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.SlowConsumerStrategy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.MessageEvictionStrategy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingMessageLimitStrategy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.Destination }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.NetworkBridgeFilterFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingSubscriberPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingQueuePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.DeadLetterStrategy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPolicyEntry.MessageGroupMapFactory }{@code >}
     * 
     * 
     */
    public List<Object> getDeadLetterStrategyOrDestinationOrDispatchPolicy() {
        if (deadLetterStrategyOrDestinationOrDispatchPolicy == null) {
            deadLetterStrategyOrDestinationOrDispatchPolicy = new ArrayList<Object>();
        }
        return this.deadLetterStrategyOrDestinationOrDispatchPolicy;
    }

    /**
     * 获取advisoryForConsumed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForConsumed() {
        return advisoryForConsumed;
    }

    /**
     * 设置advisoryForConsumed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForConsumed(Boolean value) {
        this.advisoryForConsumed = value;
    }

    /**
     * 获取advisoryForDelivery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForDelivery() {
        return advisoryForDelivery;
    }

    /**
     * 设置advisoryForDelivery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForDelivery(Boolean value) {
        this.advisoryForDelivery = value;
    }

    /**
     * 获取advisoryForDiscardingMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForDiscardingMessages() {
        return advisoryForDiscardingMessages;
    }

    /**
     * 设置advisoryForDiscardingMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForDiscardingMessages(Boolean value) {
        this.advisoryForDiscardingMessages = value;
    }

    /**
     * 获取advisoryForFastProducers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForFastProducers() {
        return advisoryForFastProducers;
    }

    /**
     * 设置advisoryForFastProducers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForFastProducers(Boolean value) {
        this.advisoryForFastProducers = value;
    }

    /**
     * 获取advisoryForSlowConsumers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForSlowConsumers() {
        return advisoryForSlowConsumers;
    }

    /**
     * 设置advisoryForSlowConsumers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForSlowConsumers(Boolean value) {
        this.advisoryForSlowConsumers = value;
    }

    /**
     * 获取advisoryWhenFull属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryWhenFull() {
        return advisoryWhenFull;
    }

    /**
     * 设置advisoryWhenFull属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryWhenFull(Boolean value) {
        this.advisoryWhenFull = value;
    }

    /**
     * 获取allConsumersExclusiveByDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllConsumersExclusiveByDefault() {
        return allConsumersExclusiveByDefault;
    }

    /**
     * 设置allConsumersExclusiveByDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllConsumersExclusiveByDefault(Boolean value) {
        this.allConsumersExclusiveByDefault = value;
    }

    /**
     * 获取alwaysRetroactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysRetroactive() {
        return alwaysRetroactive;
    }

    /**
     * 设置alwaysRetroactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysRetroactive(Boolean value) {
        this.alwaysRetroactive = value;
    }

    /**
     * 获取blockedProducerWarningInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBlockedProducerWarningInterval() {
        return blockedProducerWarningInterval;
    }

    /**
     * 设置blockedProducerWarningInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBlockedProducerWarningInterval(Long value) {
        this.blockedProducerWarningInterval = value;
    }

    /**
     * 获取consumersBeforeDispatchStarts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumersBeforeDispatchStarts() {
        return consumersBeforeDispatchStarts;
    }

    /**
     * 设置consumersBeforeDispatchStarts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumersBeforeDispatchStarts(BigInteger value) {
        this.consumersBeforeDispatchStarts = value;
    }

    /**
     * 获取cursorMemoryHighWaterMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCursorMemoryHighWaterMark() {
        return cursorMemoryHighWaterMark;
    }

    /**
     * 设置cursorMemoryHighWaterMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCursorMemoryHighWaterMark(BigInteger value) {
        this.cursorMemoryHighWaterMark = value;
    }

    /**
     * 获取deadLetterStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadLetterStrategy() {
        return deadLetterStrategy;
    }

    /**
     * 设置deadLetterStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadLetterStrategy(String value) {
        this.deadLetterStrategy = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取dispatchPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchPolicy() {
        return dispatchPolicy;
    }

    /**
     * 设置dispatchPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchPolicy(String value) {
        this.dispatchPolicy = value;
    }

    /**
     * 获取doOptimzeMessageStorage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoOptimzeMessageStorage() {
        return doOptimzeMessageStorage;
    }

    /**
     * 设置doOptimzeMessageStorage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoOptimzeMessageStorage(Boolean value) {
        this.doOptimzeMessageStorage = value;
    }

    /**
     * 获取durableTopicPrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurableTopicPrefetch() {
        return durableTopicPrefetch;
    }

    /**
     * 设置durableTopicPrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurableTopicPrefetch(BigInteger value) {
        this.durableTopicPrefetch = value;
    }

    /**
     * 获取enableAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAudit() {
        return enableAudit;
    }

    /**
     * 设置enableAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAudit(Boolean value) {
        this.enableAudit = value;
    }

    /**
     * 获取expireMessagesPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpireMessagesPeriod() {
        return expireMessagesPeriod;
    }

    /**
     * 设置expireMessagesPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpireMessagesPeriod(Long value) {
        this.expireMessagesPeriod = value;
    }

    /**
     * 获取gcInactiveDestinations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGcInactiveDestinations() {
        return gcInactiveDestinations;
    }

    /**
     * 设置gcInactiveDestinations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGcInactiveDestinations(Boolean value) {
        this.gcInactiveDestinations = value;
    }

    /**
     * 获取gcWithNetworkConsumers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGcWithNetworkConsumers() {
        return gcWithNetworkConsumers;
    }

    /**
     * 设置gcWithNetworkConsumers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGcWithNetworkConsumers(Boolean value) {
        this.gcWithNetworkConsumers = value;
    }

    /**
     * 获取inactiveTimeoutBeforeGC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInactiveTimeoutBeforeGC() {
        return inactiveTimeoutBeforeGC;
    }

    /**
     * 设置inactiveTimeoutBeforeGC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInactiveTimeoutBeforeGC(Long value) {
        this.inactiveTimeoutBeforeGC = value;
    }

    /**
     * 获取inactiveTimoutBeforeGC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInactiveTimoutBeforeGC() {
        return inactiveTimoutBeforeGC;
    }

    /**
     * 设置inactiveTimoutBeforeGC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInactiveTimoutBeforeGC(Long value) {
        this.inactiveTimoutBeforeGC = value;
    }

    /**
     * 获取lazyDispatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLazyDispatch() {
        return lazyDispatch;
    }

    /**
     * 设置lazyDispatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLazyDispatch(Boolean value) {
        this.lazyDispatch = value;
    }

    /**
     * 获取maxAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAuditDepth() {
        return maxAuditDepth;
    }

    /**
     * 设置maxAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAuditDepth(BigInteger value) {
        this.maxAuditDepth = value;
    }

    /**
     * 获取maxBrowsePageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxBrowsePageSize() {
        return maxBrowsePageSize;
    }

    /**
     * 设置maxBrowsePageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxBrowsePageSize(BigInteger value) {
        this.maxBrowsePageSize = value;
    }

    /**
     * 获取maxExpirePageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxExpirePageSize() {
        return maxExpirePageSize;
    }

    /**
     * 设置maxExpirePageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxExpirePageSize(BigInteger value) {
        this.maxExpirePageSize = value;
    }

    /**
     * 获取maxPageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPageSize() {
        return maxPageSize;
    }

    /**
     * 设置maxPageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPageSize(BigInteger value) {
        this.maxPageSize = value;
    }

    /**
     * 获取maxProducersToAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxProducersToAudit() {
        return maxProducersToAudit;
    }

    /**
     * 设置maxProducersToAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxProducersToAudit(BigInteger value) {
        this.maxProducersToAudit = value;
    }

    /**
     * 获取maxQueueAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxQueueAuditDepth() {
        return maxQueueAuditDepth;
    }

    /**
     * 设置maxQueueAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxQueueAuditDepth(BigInteger value) {
        this.maxQueueAuditDepth = value;
    }

    /**
     * 获取memoryLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryLimit() {
        return memoryLimit;
    }

    /**
     * 设置memoryLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryLimit(String value) {
        this.memoryLimit = value;
    }

    /**
     * 获取messageEvictionStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEvictionStrategy() {
        return messageEvictionStrategy;
    }

    /**
     * 设置messageEvictionStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEvictionStrategy(String value) {
        this.messageEvictionStrategy = value;
    }

    /**
     * 获取messageGroupMapFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGroupMapFactory() {
        return messageGroupMapFactory;
    }

    /**
     * 设置messageGroupMapFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGroupMapFactory(String value) {
        this.messageGroupMapFactory = value;
    }

    /**
     * 获取messageGroupMapFactoryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGroupMapFactoryType() {
        return messageGroupMapFactoryType;
    }

    /**
     * 设置messageGroupMapFactoryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGroupMapFactoryType(String value) {
        this.messageGroupMapFactoryType = value;
    }

    /**
     * 获取minimumMessageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumMessageSize() {
        return minimumMessageSize;
    }

    /**
     * 设置minimumMessageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumMessageSize(Long value) {
        this.minimumMessageSize = value;
    }

    /**
     * 获取networkBridgeFilterFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkBridgeFilterFactory() {
        return networkBridgeFilterFactory;
    }

    /**
     * 设置networkBridgeFilterFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkBridgeFilterFactory(String value) {
        this.networkBridgeFilterFactory = value;
    }

    /**
     * 获取optimizeMessageStoreInFlightLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimizeMessageStoreInFlightLimit() {
        return optimizeMessageStoreInFlightLimit;
    }

    /**
     * 设置optimizeMessageStoreInFlightLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimizeMessageStoreInFlightLimit(BigInteger value) {
        this.optimizeMessageStoreInFlightLimit = value;
    }

    /**
     * 获取optimizedDispatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizedDispatch() {
        return optimizedDispatch;
    }

    /**
     * 设置optimizedDispatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizedDispatch(Boolean value) {
        this.optimizedDispatch = value;
    }

    /**
     * 获取pendingDurableSubscriberPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingDurableSubscriberPolicy() {
        return pendingDurableSubscriberPolicy;
    }

    /**
     * 设置pendingDurableSubscriberPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingDurableSubscriberPolicy(String value) {
        this.pendingDurableSubscriberPolicy = value;
    }

    /**
     * 获取pendingMessageLimitStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingMessageLimitStrategy() {
        return pendingMessageLimitStrategy;
    }

    /**
     * 设置pendingMessageLimitStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingMessageLimitStrategy(String value) {
        this.pendingMessageLimitStrategy = value;
    }

    /**
     * 获取pendingQueuePolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingQueuePolicy() {
        return pendingQueuePolicy;
    }

    /**
     * 设置pendingQueuePolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingQueuePolicy(String value) {
        this.pendingQueuePolicy = value;
    }

    /**
     * 获取pendingSubscriberPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingSubscriberPolicy() {
        return pendingSubscriberPolicy;
    }

    /**
     * 设置pendingSubscriberPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingSubscriberPolicy(String value) {
        this.pendingSubscriberPolicy = value;
    }

    /**
     * 获取persistJMSRedelivered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistJMSRedelivered() {
        return persistJMSRedelivered;
    }

    /**
     * 设置persistJMSRedelivered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistJMSRedelivered(Boolean value) {
        this.persistJMSRedelivered = value;
    }

    /**
     * 获取prioritizedMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrioritizedMessages() {
        return prioritizedMessages;
    }

    /**
     * 设置prioritizedMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrioritizedMessages(Boolean value) {
        this.prioritizedMessages = value;
    }

    /**
     * 获取producerFlowControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProducerFlowControl() {
        return producerFlowControl;
    }

    /**
     * 设置producerFlowControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducerFlowControl(Boolean value) {
        this.producerFlowControl = value;
    }

    /**
     * 获取queue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * 设置queue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * 获取queueBrowserPrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueBrowserPrefetch() {
        return queueBrowserPrefetch;
    }

    /**
     * 设置queueBrowserPrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueBrowserPrefetch(BigInteger value) {
        this.queueBrowserPrefetch = value;
    }

    /**
     * 获取queuePrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueuePrefetch() {
        return queuePrefetch;
    }

    /**
     * 设置queuePrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueuePrefetch(BigInteger value) {
        this.queuePrefetch = value;
    }

    /**
     * 获取reduceMemoryFootprint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReduceMemoryFootprint() {
        return reduceMemoryFootprint;
    }

    /**
     * 设置reduceMemoryFootprint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReduceMemoryFootprint(Boolean value) {
        this.reduceMemoryFootprint = value;
    }

    /**
     * 获取sendAdvisoryIfNoConsumers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAdvisoryIfNoConsumers() {
        return sendAdvisoryIfNoConsumers;
    }

    /**
     * 设置sendAdvisoryIfNoConsumers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAdvisoryIfNoConsumers(Boolean value) {
        this.sendAdvisoryIfNoConsumers = value;
    }

    /**
     * 获取slowConsumerStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlowConsumerStrategy() {
        return slowConsumerStrategy;
    }

    /**
     * 设置slowConsumerStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlowConsumerStrategy(String value) {
        this.slowConsumerStrategy = value;
    }

    /**
     * 获取storeUsageHighWaterMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreUsageHighWaterMark() {
        return storeUsageHighWaterMark;
    }

    /**
     * 设置storeUsageHighWaterMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreUsageHighWaterMark(BigInteger value) {
        this.storeUsageHighWaterMark = value;
    }

    /**
     * 获取strictOrderDispatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrictOrderDispatch() {
        return strictOrderDispatch;
    }

    /**
     * 设置strictOrderDispatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrictOrderDispatch(Boolean value) {
        this.strictOrderDispatch = value;
    }

    /**
     * 获取subscriptionRecoveryPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionRecoveryPolicy() {
        return subscriptionRecoveryPolicy;
    }

    /**
     * 设置subscriptionRecoveryPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionRecoveryPolicy(String value) {
        this.subscriptionRecoveryPolicy = value;
    }

    /**
     * 获取tempQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempQueue() {
        return tempQueue;
    }

    /**
     * 设置tempQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempQueue(Boolean value) {
        this.tempQueue = value;
    }

    /**
     * 获取tempTopic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempTopic() {
        return tempTopic;
    }

    /**
     * 设置tempTopic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempTopic(Boolean value) {
        this.tempTopic = value;
    }

    /**
     * 获取timeBeforeDispatchStarts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeBeforeDispatchStarts() {
        return timeBeforeDispatchStarts;
    }

    /**
     * 设置timeBeforeDispatchStarts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeBeforeDispatchStarts(BigInteger value) {
        this.timeBeforeDispatchStarts = value;
    }

    /**
     * 获取topic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置topic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * 获取topicPrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopicPrefetch() {
        return topicPrefetch;
    }

    /**
     * 设置topicPrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopicPrefetch(BigInteger value) {
        this.topicPrefetch = value;
    }

    /**
     * 获取useCache属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCache() {
        return useCache;
    }

    /**
     * 设置useCache属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCache(Boolean value) {
        this.useCache = value;
    }

    /**
     * 获取useConsumerPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseConsumerPriority() {
        return useConsumerPriority;
    }

    /**
     * 设置useConsumerPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseConsumerPriority(Boolean value) {
        this.useConsumerPriority = value;
    }

    /**
     * 获取usePrefetchExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePrefetchExtension() {
        return usePrefetchExtension;
    }

    /**
     * 设置usePrefetchExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePrefetchExtension(Boolean value) {
        this.usePrefetchExtension = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Object> theDeadLetterStrategyOrDestinationOrDispatchPolicy;
            theDeadLetterStrategyOrDestinationOrDispatchPolicy = (((this.deadLetterStrategyOrDestinationOrDispatchPolicy!= null)&&(!this.deadLetterStrategyOrDestinationOrDispatchPolicy.isEmpty()))?this.getDeadLetterStrategyOrDestinationOrDispatchPolicy():null);
            strategy.appendField(locator, this, "deadLetterStrategyOrDestinationOrDispatchPolicy", buffer, theDeadLetterStrategyOrDestinationOrDispatchPolicy);
        }
        {
            Boolean theAdvisoryForConsumed;
            theAdvisoryForConsumed = this.isAdvisoryForConsumed();
            strategy.appendField(locator, this, "advisoryForConsumed", buffer, theAdvisoryForConsumed);
        }
        {
            Boolean theAdvisoryForDelivery;
            theAdvisoryForDelivery = this.isAdvisoryForDelivery();
            strategy.appendField(locator, this, "advisoryForDelivery", buffer, theAdvisoryForDelivery);
        }
        {
            Boolean theAdvisoryForDiscardingMessages;
            theAdvisoryForDiscardingMessages = this.isAdvisoryForDiscardingMessages();
            strategy.appendField(locator, this, "advisoryForDiscardingMessages", buffer, theAdvisoryForDiscardingMessages);
        }
        {
            Boolean theAdvisoryForFastProducers;
            theAdvisoryForFastProducers = this.isAdvisoryForFastProducers();
            strategy.appendField(locator, this, "advisoryForFastProducers", buffer, theAdvisoryForFastProducers);
        }
        {
            Boolean theAdvisoryForSlowConsumers;
            theAdvisoryForSlowConsumers = this.isAdvisoryForSlowConsumers();
            strategy.appendField(locator, this, "advisoryForSlowConsumers", buffer, theAdvisoryForSlowConsumers);
        }
        {
            Boolean theAdvisoryWhenFull;
            theAdvisoryWhenFull = this.isAdvisoryWhenFull();
            strategy.appendField(locator, this, "advisoryWhenFull", buffer, theAdvisoryWhenFull);
        }
        {
            Boolean theAllConsumersExclusiveByDefault;
            theAllConsumersExclusiveByDefault = this.isAllConsumersExclusiveByDefault();
            strategy.appendField(locator, this, "allConsumersExclusiveByDefault", buffer, theAllConsumersExclusiveByDefault);
        }
        {
            Boolean theAlwaysRetroactive;
            theAlwaysRetroactive = this.isAlwaysRetroactive();
            strategy.appendField(locator, this, "alwaysRetroactive", buffer, theAlwaysRetroactive);
        }
        {
            Long theBlockedProducerWarningInterval;
            theBlockedProducerWarningInterval = this.getBlockedProducerWarningInterval();
            strategy.appendField(locator, this, "blockedProducerWarningInterval", buffer, theBlockedProducerWarningInterval);
        }
        {
            BigInteger theConsumersBeforeDispatchStarts;
            theConsumersBeforeDispatchStarts = this.getConsumersBeforeDispatchStarts();
            strategy.appendField(locator, this, "consumersBeforeDispatchStarts", buffer, theConsumersBeforeDispatchStarts);
        }
        {
            BigInteger theCursorMemoryHighWaterMark;
            theCursorMemoryHighWaterMark = this.getCursorMemoryHighWaterMark();
            strategy.appendField(locator, this, "cursorMemoryHighWaterMark", buffer, theCursorMemoryHighWaterMark);
        }
        {
            String theDeadLetterStrategy;
            theDeadLetterStrategy = this.getDeadLetterStrategy();
            strategy.appendField(locator, this, "deadLetterStrategy", buffer, theDeadLetterStrategy);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            String theDispatchPolicy;
            theDispatchPolicy = this.getDispatchPolicy();
            strategy.appendField(locator, this, "dispatchPolicy", buffer, theDispatchPolicy);
        }
        {
            Boolean theDoOptimzeMessageStorage;
            theDoOptimzeMessageStorage = this.isDoOptimzeMessageStorage();
            strategy.appendField(locator, this, "doOptimzeMessageStorage", buffer, theDoOptimzeMessageStorage);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            strategy.appendField(locator, this, "durableTopicPrefetch", buffer, theDurableTopicPrefetch);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            strategy.appendField(locator, this, "enableAudit", buffer, theEnableAudit);
        }
        {
            Long theExpireMessagesPeriod;
            theExpireMessagesPeriod = this.getExpireMessagesPeriod();
            strategy.appendField(locator, this, "expireMessagesPeriod", buffer, theExpireMessagesPeriod);
        }
        {
            Boolean theGcInactiveDestinations;
            theGcInactiveDestinations = this.isGcInactiveDestinations();
            strategy.appendField(locator, this, "gcInactiveDestinations", buffer, theGcInactiveDestinations);
        }
        {
            Boolean theGcWithNetworkConsumers;
            theGcWithNetworkConsumers = this.isGcWithNetworkConsumers();
            strategy.appendField(locator, this, "gcWithNetworkConsumers", buffer, theGcWithNetworkConsumers);
        }
        {
            Long theInactiveTimeoutBeforeGC;
            theInactiveTimeoutBeforeGC = this.getInactiveTimeoutBeforeGC();
            strategy.appendField(locator, this, "inactiveTimeoutBeforeGC", buffer, theInactiveTimeoutBeforeGC);
        }
        {
            Long theInactiveTimoutBeforeGC;
            theInactiveTimoutBeforeGC = this.getInactiveTimoutBeforeGC();
            strategy.appendField(locator, this, "inactiveTimoutBeforeGC", buffer, theInactiveTimoutBeforeGC);
        }
        {
            Boolean theLazyDispatch;
            theLazyDispatch = this.isLazyDispatch();
            strategy.appendField(locator, this, "lazyDispatch", buffer, theLazyDispatch);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            strategy.appendField(locator, this, "maxAuditDepth", buffer, theMaxAuditDepth);
        }
        {
            BigInteger theMaxBrowsePageSize;
            theMaxBrowsePageSize = this.getMaxBrowsePageSize();
            strategy.appendField(locator, this, "maxBrowsePageSize", buffer, theMaxBrowsePageSize);
        }
        {
            BigInteger theMaxExpirePageSize;
            theMaxExpirePageSize = this.getMaxExpirePageSize();
            strategy.appendField(locator, this, "maxExpirePageSize", buffer, theMaxExpirePageSize);
        }
        {
            BigInteger theMaxPageSize;
            theMaxPageSize = this.getMaxPageSize();
            strategy.appendField(locator, this, "maxPageSize", buffer, theMaxPageSize);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            strategy.appendField(locator, this, "maxProducersToAudit", buffer, theMaxProducersToAudit);
        }
        {
            BigInteger theMaxQueueAuditDepth;
            theMaxQueueAuditDepth = this.getMaxQueueAuditDepth();
            strategy.appendField(locator, this, "maxQueueAuditDepth", buffer, theMaxQueueAuditDepth);
        }
        {
            String theMemoryLimit;
            theMemoryLimit = this.getMemoryLimit();
            strategy.appendField(locator, this, "memoryLimit", buffer, theMemoryLimit);
        }
        {
            String theMessageEvictionStrategy;
            theMessageEvictionStrategy = this.getMessageEvictionStrategy();
            strategy.appendField(locator, this, "messageEvictionStrategy", buffer, theMessageEvictionStrategy);
        }
        {
            String theMessageGroupMapFactory;
            theMessageGroupMapFactory = this.getMessageGroupMapFactory();
            strategy.appendField(locator, this, "messageGroupMapFactory", buffer, theMessageGroupMapFactory);
        }
        {
            String theMessageGroupMapFactoryType;
            theMessageGroupMapFactoryType = this.getMessageGroupMapFactoryType();
            strategy.appendField(locator, this, "messageGroupMapFactoryType", buffer, theMessageGroupMapFactoryType);
        }
        {
            Long theMinimumMessageSize;
            theMinimumMessageSize = this.getMinimumMessageSize();
            strategy.appendField(locator, this, "minimumMessageSize", buffer, theMinimumMessageSize);
        }
        {
            String theNetworkBridgeFilterFactory;
            theNetworkBridgeFilterFactory = this.getNetworkBridgeFilterFactory();
            strategy.appendField(locator, this, "networkBridgeFilterFactory", buffer, theNetworkBridgeFilterFactory);
        }
        {
            BigInteger theOptimizeMessageStoreInFlightLimit;
            theOptimizeMessageStoreInFlightLimit = this.getOptimizeMessageStoreInFlightLimit();
            strategy.appendField(locator, this, "optimizeMessageStoreInFlightLimit", buffer, theOptimizeMessageStoreInFlightLimit);
        }
        {
            Boolean theOptimizedDispatch;
            theOptimizedDispatch = this.isOptimizedDispatch();
            strategy.appendField(locator, this, "optimizedDispatch", buffer, theOptimizedDispatch);
        }
        {
            String thePendingDurableSubscriberPolicy;
            thePendingDurableSubscriberPolicy = this.getPendingDurableSubscriberPolicy();
            strategy.appendField(locator, this, "pendingDurableSubscriberPolicy", buffer, thePendingDurableSubscriberPolicy);
        }
        {
            String thePendingMessageLimitStrategy;
            thePendingMessageLimitStrategy = this.getPendingMessageLimitStrategy();
            strategy.appendField(locator, this, "pendingMessageLimitStrategy", buffer, thePendingMessageLimitStrategy);
        }
        {
            String thePendingQueuePolicy;
            thePendingQueuePolicy = this.getPendingQueuePolicy();
            strategy.appendField(locator, this, "pendingQueuePolicy", buffer, thePendingQueuePolicy);
        }
        {
            String thePendingSubscriberPolicy;
            thePendingSubscriberPolicy = this.getPendingSubscriberPolicy();
            strategy.appendField(locator, this, "pendingSubscriberPolicy", buffer, thePendingSubscriberPolicy);
        }
        {
            Boolean thePersistJMSRedelivered;
            thePersistJMSRedelivered = this.isPersistJMSRedelivered();
            strategy.appendField(locator, this, "persistJMSRedelivered", buffer, thePersistJMSRedelivered);
        }
        {
            Boolean thePrioritizedMessages;
            thePrioritizedMessages = this.isPrioritizedMessages();
            strategy.appendField(locator, this, "prioritizedMessages", buffer, thePrioritizedMessages);
        }
        {
            Boolean theProducerFlowControl;
            theProducerFlowControl = this.isProducerFlowControl();
            strategy.appendField(locator, this, "producerFlowControl", buffer, theProducerFlowControl);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            strategy.appendField(locator, this, "queue", buffer, theQueue);
        }
        {
            BigInteger theQueueBrowserPrefetch;
            theQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            strategy.appendField(locator, this, "queueBrowserPrefetch", buffer, theQueueBrowserPrefetch);
        }
        {
            BigInteger theQueuePrefetch;
            theQueuePrefetch = this.getQueuePrefetch();
            strategy.appendField(locator, this, "queuePrefetch", buffer, theQueuePrefetch);
        }
        {
            Boolean theReduceMemoryFootprint;
            theReduceMemoryFootprint = this.isReduceMemoryFootprint();
            strategy.appendField(locator, this, "reduceMemoryFootprint", buffer, theReduceMemoryFootprint);
        }
        {
            Boolean theSendAdvisoryIfNoConsumers;
            theSendAdvisoryIfNoConsumers = this.isSendAdvisoryIfNoConsumers();
            strategy.appendField(locator, this, "sendAdvisoryIfNoConsumers", buffer, theSendAdvisoryIfNoConsumers);
        }
        {
            String theSlowConsumerStrategy;
            theSlowConsumerStrategy = this.getSlowConsumerStrategy();
            strategy.appendField(locator, this, "slowConsumerStrategy", buffer, theSlowConsumerStrategy);
        }
        {
            BigInteger theStoreUsageHighWaterMark;
            theStoreUsageHighWaterMark = this.getStoreUsageHighWaterMark();
            strategy.appendField(locator, this, "storeUsageHighWaterMark", buffer, theStoreUsageHighWaterMark);
        }
        {
            Boolean theStrictOrderDispatch;
            theStrictOrderDispatch = this.isStrictOrderDispatch();
            strategy.appendField(locator, this, "strictOrderDispatch", buffer, theStrictOrderDispatch);
        }
        {
            String theSubscriptionRecoveryPolicy;
            theSubscriptionRecoveryPolicy = this.getSubscriptionRecoveryPolicy();
            strategy.appendField(locator, this, "subscriptionRecoveryPolicy", buffer, theSubscriptionRecoveryPolicy);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
        }
        {
            BigInteger theTimeBeforeDispatchStarts;
            theTimeBeforeDispatchStarts = this.getTimeBeforeDispatchStarts();
            strategy.appendField(locator, this, "timeBeforeDispatchStarts", buffer, theTimeBeforeDispatchStarts);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            strategy.appendField(locator, this, "topicPrefetch", buffer, theTopicPrefetch);
        }
        {
            Boolean theUseCache;
            theUseCache = this.isUseCache();
            strategy.appendField(locator, this, "useCache", buffer, theUseCache);
        }
        {
            Boolean theUseConsumerPriority;
            theUseConsumerPriority = this.isUseConsumerPriority();
            strategy.appendField(locator, this, "useConsumerPriority", buffer, theUseConsumerPriority);
        }
        {
            Boolean theUsePrefetchExtension;
            theUsePrefetchExtension = this.isUsePrefetchExtension();
            strategy.appendField(locator, this, "usePrefetchExtension", buffer, theUsePrefetchExtension);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theDeadLetterStrategyOrDestinationOrDispatchPolicy;
            theDeadLetterStrategyOrDestinationOrDispatchPolicy = (((this.deadLetterStrategyOrDestinationOrDispatchPolicy!= null)&&(!this.deadLetterStrategyOrDestinationOrDispatchPolicy.isEmpty()))?this.getDeadLetterStrategyOrDestinationOrDispatchPolicy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterStrategyOrDestinationOrDispatchPolicy", theDeadLetterStrategyOrDestinationOrDispatchPolicy), currentHashCode, theDeadLetterStrategyOrDestinationOrDispatchPolicy);
        }
        {
            Boolean theAdvisoryForConsumed;
            theAdvisoryForConsumed = this.isAdvisoryForConsumed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForConsumed", theAdvisoryForConsumed), currentHashCode, theAdvisoryForConsumed);
        }
        {
            Boolean theAdvisoryForDelivery;
            theAdvisoryForDelivery = this.isAdvisoryForDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForDelivery", theAdvisoryForDelivery), currentHashCode, theAdvisoryForDelivery);
        }
        {
            Boolean theAdvisoryForDiscardingMessages;
            theAdvisoryForDiscardingMessages = this.isAdvisoryForDiscardingMessages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForDiscardingMessages", theAdvisoryForDiscardingMessages), currentHashCode, theAdvisoryForDiscardingMessages);
        }
        {
            Boolean theAdvisoryForFastProducers;
            theAdvisoryForFastProducers = this.isAdvisoryForFastProducers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForFastProducers", theAdvisoryForFastProducers), currentHashCode, theAdvisoryForFastProducers);
        }
        {
            Boolean theAdvisoryForSlowConsumers;
            theAdvisoryForSlowConsumers = this.isAdvisoryForSlowConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForSlowConsumers", theAdvisoryForSlowConsumers), currentHashCode, theAdvisoryForSlowConsumers);
        }
        {
            Boolean theAdvisoryWhenFull;
            theAdvisoryWhenFull = this.isAdvisoryWhenFull();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryWhenFull", theAdvisoryWhenFull), currentHashCode, theAdvisoryWhenFull);
        }
        {
            Boolean theAllConsumersExclusiveByDefault;
            theAllConsumersExclusiveByDefault = this.isAllConsumersExclusiveByDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allConsumersExclusiveByDefault", theAllConsumersExclusiveByDefault), currentHashCode, theAllConsumersExclusiveByDefault);
        }
        {
            Boolean theAlwaysRetroactive;
            theAlwaysRetroactive = this.isAlwaysRetroactive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alwaysRetroactive", theAlwaysRetroactive), currentHashCode, theAlwaysRetroactive);
        }
        {
            Long theBlockedProducerWarningInterval;
            theBlockedProducerWarningInterval = this.getBlockedProducerWarningInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blockedProducerWarningInterval", theBlockedProducerWarningInterval), currentHashCode, theBlockedProducerWarningInterval);
        }
        {
            BigInteger theConsumersBeforeDispatchStarts;
            theConsumersBeforeDispatchStarts = this.getConsumersBeforeDispatchStarts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumersBeforeDispatchStarts", theConsumersBeforeDispatchStarts), currentHashCode, theConsumersBeforeDispatchStarts);
        }
        {
            BigInteger theCursorMemoryHighWaterMark;
            theCursorMemoryHighWaterMark = this.getCursorMemoryHighWaterMark();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cursorMemoryHighWaterMark", theCursorMemoryHighWaterMark), currentHashCode, theCursorMemoryHighWaterMark);
        }
        {
            String theDeadLetterStrategy;
            theDeadLetterStrategy = this.getDeadLetterStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterStrategy", theDeadLetterStrategy), currentHashCode, theDeadLetterStrategy);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            String theDispatchPolicy;
            theDispatchPolicy = this.getDispatchPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispatchPolicy", theDispatchPolicy), currentHashCode, theDispatchPolicy);
        }
        {
            Boolean theDoOptimzeMessageStorage;
            theDoOptimzeMessageStorage = this.isDoOptimzeMessageStorage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doOptimzeMessageStorage", theDoOptimzeMessageStorage), currentHashCode, theDoOptimzeMessageStorage);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableTopicPrefetch", theDurableTopicPrefetch), currentHashCode, theDurableTopicPrefetch);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableAudit", theEnableAudit), currentHashCode, theEnableAudit);
        }
        {
            Long theExpireMessagesPeriod;
            theExpireMessagesPeriod = this.getExpireMessagesPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expireMessagesPeriod", theExpireMessagesPeriod), currentHashCode, theExpireMessagesPeriod);
        }
        {
            Boolean theGcInactiveDestinations;
            theGcInactiveDestinations = this.isGcInactiveDestinations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcInactiveDestinations", theGcInactiveDestinations), currentHashCode, theGcInactiveDestinations);
        }
        {
            Boolean theGcWithNetworkConsumers;
            theGcWithNetworkConsumers = this.isGcWithNetworkConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcWithNetworkConsumers", theGcWithNetworkConsumers), currentHashCode, theGcWithNetworkConsumers);
        }
        {
            Long theInactiveTimeoutBeforeGC;
            theInactiveTimeoutBeforeGC = this.getInactiveTimeoutBeforeGC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inactiveTimeoutBeforeGC", theInactiveTimeoutBeforeGC), currentHashCode, theInactiveTimeoutBeforeGC);
        }
        {
            Long theInactiveTimoutBeforeGC;
            theInactiveTimoutBeforeGC = this.getInactiveTimoutBeforeGC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inactiveTimoutBeforeGC", theInactiveTimoutBeforeGC), currentHashCode, theInactiveTimoutBeforeGC);
        }
        {
            Boolean theLazyDispatch;
            theLazyDispatch = this.isLazyDispatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lazyDispatch", theLazyDispatch), currentHashCode, theLazyDispatch);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAuditDepth", theMaxAuditDepth), currentHashCode, theMaxAuditDepth);
        }
        {
            BigInteger theMaxBrowsePageSize;
            theMaxBrowsePageSize = this.getMaxBrowsePageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxBrowsePageSize", theMaxBrowsePageSize), currentHashCode, theMaxBrowsePageSize);
        }
        {
            BigInteger theMaxExpirePageSize;
            theMaxExpirePageSize = this.getMaxExpirePageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxExpirePageSize", theMaxExpirePageSize), currentHashCode, theMaxExpirePageSize);
        }
        {
            BigInteger theMaxPageSize;
            theMaxPageSize = this.getMaxPageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxPageSize", theMaxPageSize), currentHashCode, theMaxPageSize);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxProducersToAudit", theMaxProducersToAudit), currentHashCode, theMaxProducersToAudit);
        }
        {
            BigInteger theMaxQueueAuditDepth;
            theMaxQueueAuditDepth = this.getMaxQueueAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxQueueAuditDepth", theMaxQueueAuditDepth), currentHashCode, theMaxQueueAuditDepth);
        }
        {
            String theMemoryLimit;
            theMemoryLimit = this.getMemoryLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryLimit", theMemoryLimit), currentHashCode, theMemoryLimit);
        }
        {
            String theMessageEvictionStrategy;
            theMessageEvictionStrategy = this.getMessageEvictionStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageEvictionStrategy", theMessageEvictionStrategy), currentHashCode, theMessageEvictionStrategy);
        }
        {
            String theMessageGroupMapFactory;
            theMessageGroupMapFactory = this.getMessageGroupMapFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageGroupMapFactory", theMessageGroupMapFactory), currentHashCode, theMessageGroupMapFactory);
        }
        {
            String theMessageGroupMapFactoryType;
            theMessageGroupMapFactoryType = this.getMessageGroupMapFactoryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageGroupMapFactoryType", theMessageGroupMapFactoryType), currentHashCode, theMessageGroupMapFactoryType);
        }
        {
            Long theMinimumMessageSize;
            theMinimumMessageSize = this.getMinimumMessageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumMessageSize", theMinimumMessageSize), currentHashCode, theMinimumMessageSize);
        }
        {
            String theNetworkBridgeFilterFactory;
            theNetworkBridgeFilterFactory = this.getNetworkBridgeFilterFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkBridgeFilterFactory", theNetworkBridgeFilterFactory), currentHashCode, theNetworkBridgeFilterFactory);
        }
        {
            BigInteger theOptimizeMessageStoreInFlightLimit;
            theOptimizeMessageStoreInFlightLimit = this.getOptimizeMessageStoreInFlightLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizeMessageStoreInFlightLimit", theOptimizeMessageStoreInFlightLimit), currentHashCode, theOptimizeMessageStoreInFlightLimit);
        }
        {
            Boolean theOptimizedDispatch;
            theOptimizedDispatch = this.isOptimizedDispatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizedDispatch", theOptimizedDispatch), currentHashCode, theOptimizedDispatch);
        }
        {
            String thePendingDurableSubscriberPolicy;
            thePendingDurableSubscriberPolicy = this.getPendingDurableSubscriberPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pendingDurableSubscriberPolicy", thePendingDurableSubscriberPolicy), currentHashCode, thePendingDurableSubscriberPolicy);
        }
        {
            String thePendingMessageLimitStrategy;
            thePendingMessageLimitStrategy = this.getPendingMessageLimitStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pendingMessageLimitStrategy", thePendingMessageLimitStrategy), currentHashCode, thePendingMessageLimitStrategy);
        }
        {
            String thePendingQueuePolicy;
            thePendingQueuePolicy = this.getPendingQueuePolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pendingQueuePolicy", thePendingQueuePolicy), currentHashCode, thePendingQueuePolicy);
        }
        {
            String thePendingSubscriberPolicy;
            thePendingSubscriberPolicy = this.getPendingSubscriberPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pendingSubscriberPolicy", thePendingSubscriberPolicy), currentHashCode, thePendingSubscriberPolicy);
        }
        {
            Boolean thePersistJMSRedelivered;
            thePersistJMSRedelivered = this.isPersistJMSRedelivered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistJMSRedelivered", thePersistJMSRedelivered), currentHashCode, thePersistJMSRedelivered);
        }
        {
            Boolean thePrioritizedMessages;
            thePrioritizedMessages = this.isPrioritizedMessages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prioritizedMessages", thePrioritizedMessages), currentHashCode, thePrioritizedMessages);
        }
        {
            Boolean theProducerFlowControl;
            theProducerFlowControl = this.isProducerFlowControl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerFlowControl", theProducerFlowControl), currentHashCode, theProducerFlowControl);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
        }
        {
            BigInteger theQueueBrowserPrefetch;
            theQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueBrowserPrefetch", theQueueBrowserPrefetch), currentHashCode, theQueueBrowserPrefetch);
        }
        {
            BigInteger theQueuePrefetch;
            theQueuePrefetch = this.getQueuePrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queuePrefetch", theQueuePrefetch), currentHashCode, theQueuePrefetch);
        }
        {
            Boolean theReduceMemoryFootprint;
            theReduceMemoryFootprint = this.isReduceMemoryFootprint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reduceMemoryFootprint", theReduceMemoryFootprint), currentHashCode, theReduceMemoryFootprint);
        }
        {
            Boolean theSendAdvisoryIfNoConsumers;
            theSendAdvisoryIfNoConsumers = this.isSendAdvisoryIfNoConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendAdvisoryIfNoConsumers", theSendAdvisoryIfNoConsumers), currentHashCode, theSendAdvisoryIfNoConsumers);
        }
        {
            String theSlowConsumerStrategy;
            theSlowConsumerStrategy = this.getSlowConsumerStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "slowConsumerStrategy", theSlowConsumerStrategy), currentHashCode, theSlowConsumerStrategy);
        }
        {
            BigInteger theStoreUsageHighWaterMark;
            theStoreUsageHighWaterMark = this.getStoreUsageHighWaterMark();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeUsageHighWaterMark", theStoreUsageHighWaterMark), currentHashCode, theStoreUsageHighWaterMark);
        }
        {
            Boolean theStrictOrderDispatch;
            theStrictOrderDispatch = this.isStrictOrderDispatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strictOrderDispatch", theStrictOrderDispatch), currentHashCode, theStrictOrderDispatch);
        }
        {
            String theSubscriptionRecoveryPolicy;
            theSubscriptionRecoveryPolicy = this.getSubscriptionRecoveryPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriptionRecoveryPolicy", theSubscriptionRecoveryPolicy), currentHashCode, theSubscriptionRecoveryPolicy);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
        }
        {
            BigInteger theTimeBeforeDispatchStarts;
            theTimeBeforeDispatchStarts = this.getTimeBeforeDispatchStarts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeBeforeDispatchStarts", theTimeBeforeDispatchStarts), currentHashCode, theTimeBeforeDispatchStarts);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicPrefetch", theTopicPrefetch), currentHashCode, theTopicPrefetch);
        }
        {
            Boolean theUseCache;
            theUseCache = this.isUseCache();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCache", theUseCache), currentHashCode, theUseCache);
        }
        {
            Boolean theUseConsumerPriority;
            theUseConsumerPriority = this.isUseConsumerPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useConsumerPriority", theUseConsumerPriority), currentHashCode, theUseConsumerPriority);
        }
        {
            Boolean theUsePrefetchExtension;
            theUsePrefetchExtension = this.isUsePrefetchExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usePrefetchExtension", theUsePrefetchExtension), currentHashCode, theUsePrefetchExtension);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DtoPolicyEntry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPolicyEntry that = ((DtoPolicyEntry) object);
        {
            List<Object> lhsDeadLetterStrategyOrDestinationOrDispatchPolicy;
            lhsDeadLetterStrategyOrDestinationOrDispatchPolicy = (((this.deadLetterStrategyOrDestinationOrDispatchPolicy!= null)&&(!this.deadLetterStrategyOrDestinationOrDispatchPolicy.isEmpty()))?this.getDeadLetterStrategyOrDestinationOrDispatchPolicy():null);
            List<Object> rhsDeadLetterStrategyOrDestinationOrDispatchPolicy;
            rhsDeadLetterStrategyOrDestinationOrDispatchPolicy = (((that.deadLetterStrategyOrDestinationOrDispatchPolicy!= null)&&(!that.deadLetterStrategyOrDestinationOrDispatchPolicy.isEmpty()))?that.getDeadLetterStrategyOrDestinationOrDispatchPolicy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterStrategyOrDestinationOrDispatchPolicy", lhsDeadLetterStrategyOrDestinationOrDispatchPolicy), LocatorUtils.property(thatLocator, "deadLetterStrategyOrDestinationOrDispatchPolicy", rhsDeadLetterStrategyOrDestinationOrDispatchPolicy), lhsDeadLetterStrategyOrDestinationOrDispatchPolicy, rhsDeadLetterStrategyOrDestinationOrDispatchPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForConsumed;
            lhsAdvisoryForConsumed = this.isAdvisoryForConsumed();
            Boolean rhsAdvisoryForConsumed;
            rhsAdvisoryForConsumed = that.isAdvisoryForConsumed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForConsumed", lhsAdvisoryForConsumed), LocatorUtils.property(thatLocator, "advisoryForConsumed", rhsAdvisoryForConsumed), lhsAdvisoryForConsumed, rhsAdvisoryForConsumed)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForDelivery;
            lhsAdvisoryForDelivery = this.isAdvisoryForDelivery();
            Boolean rhsAdvisoryForDelivery;
            rhsAdvisoryForDelivery = that.isAdvisoryForDelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForDelivery", lhsAdvisoryForDelivery), LocatorUtils.property(thatLocator, "advisoryForDelivery", rhsAdvisoryForDelivery), lhsAdvisoryForDelivery, rhsAdvisoryForDelivery)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForDiscardingMessages;
            lhsAdvisoryForDiscardingMessages = this.isAdvisoryForDiscardingMessages();
            Boolean rhsAdvisoryForDiscardingMessages;
            rhsAdvisoryForDiscardingMessages = that.isAdvisoryForDiscardingMessages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForDiscardingMessages", lhsAdvisoryForDiscardingMessages), LocatorUtils.property(thatLocator, "advisoryForDiscardingMessages", rhsAdvisoryForDiscardingMessages), lhsAdvisoryForDiscardingMessages, rhsAdvisoryForDiscardingMessages)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForFastProducers;
            lhsAdvisoryForFastProducers = this.isAdvisoryForFastProducers();
            Boolean rhsAdvisoryForFastProducers;
            rhsAdvisoryForFastProducers = that.isAdvisoryForFastProducers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForFastProducers", lhsAdvisoryForFastProducers), LocatorUtils.property(thatLocator, "advisoryForFastProducers", rhsAdvisoryForFastProducers), lhsAdvisoryForFastProducers, rhsAdvisoryForFastProducers)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForSlowConsumers;
            lhsAdvisoryForSlowConsumers = this.isAdvisoryForSlowConsumers();
            Boolean rhsAdvisoryForSlowConsumers;
            rhsAdvisoryForSlowConsumers = that.isAdvisoryForSlowConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForSlowConsumers", lhsAdvisoryForSlowConsumers), LocatorUtils.property(thatLocator, "advisoryForSlowConsumers", rhsAdvisoryForSlowConsumers), lhsAdvisoryForSlowConsumers, rhsAdvisoryForSlowConsumers)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryWhenFull;
            lhsAdvisoryWhenFull = this.isAdvisoryWhenFull();
            Boolean rhsAdvisoryWhenFull;
            rhsAdvisoryWhenFull = that.isAdvisoryWhenFull();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryWhenFull", lhsAdvisoryWhenFull), LocatorUtils.property(thatLocator, "advisoryWhenFull", rhsAdvisoryWhenFull), lhsAdvisoryWhenFull, rhsAdvisoryWhenFull)) {
                return false;
            }
        }
        {
            Boolean lhsAllConsumersExclusiveByDefault;
            lhsAllConsumersExclusiveByDefault = this.isAllConsumersExclusiveByDefault();
            Boolean rhsAllConsumersExclusiveByDefault;
            rhsAllConsumersExclusiveByDefault = that.isAllConsumersExclusiveByDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allConsumersExclusiveByDefault", lhsAllConsumersExclusiveByDefault), LocatorUtils.property(thatLocator, "allConsumersExclusiveByDefault", rhsAllConsumersExclusiveByDefault), lhsAllConsumersExclusiveByDefault, rhsAllConsumersExclusiveByDefault)) {
                return false;
            }
        }
        {
            Boolean lhsAlwaysRetroactive;
            lhsAlwaysRetroactive = this.isAlwaysRetroactive();
            Boolean rhsAlwaysRetroactive;
            rhsAlwaysRetroactive = that.isAlwaysRetroactive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alwaysRetroactive", lhsAlwaysRetroactive), LocatorUtils.property(thatLocator, "alwaysRetroactive", rhsAlwaysRetroactive), lhsAlwaysRetroactive, rhsAlwaysRetroactive)) {
                return false;
            }
        }
        {
            Long lhsBlockedProducerWarningInterval;
            lhsBlockedProducerWarningInterval = this.getBlockedProducerWarningInterval();
            Long rhsBlockedProducerWarningInterval;
            rhsBlockedProducerWarningInterval = that.getBlockedProducerWarningInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blockedProducerWarningInterval", lhsBlockedProducerWarningInterval), LocatorUtils.property(thatLocator, "blockedProducerWarningInterval", rhsBlockedProducerWarningInterval), lhsBlockedProducerWarningInterval, rhsBlockedProducerWarningInterval)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumersBeforeDispatchStarts;
            lhsConsumersBeforeDispatchStarts = this.getConsumersBeforeDispatchStarts();
            BigInteger rhsConsumersBeforeDispatchStarts;
            rhsConsumersBeforeDispatchStarts = that.getConsumersBeforeDispatchStarts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumersBeforeDispatchStarts", lhsConsumersBeforeDispatchStarts), LocatorUtils.property(thatLocator, "consumersBeforeDispatchStarts", rhsConsumersBeforeDispatchStarts), lhsConsumersBeforeDispatchStarts, rhsConsumersBeforeDispatchStarts)) {
                return false;
            }
        }
        {
            BigInteger lhsCursorMemoryHighWaterMark;
            lhsCursorMemoryHighWaterMark = this.getCursorMemoryHighWaterMark();
            BigInteger rhsCursorMemoryHighWaterMark;
            rhsCursorMemoryHighWaterMark = that.getCursorMemoryHighWaterMark();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cursorMemoryHighWaterMark", lhsCursorMemoryHighWaterMark), LocatorUtils.property(thatLocator, "cursorMemoryHighWaterMark", rhsCursorMemoryHighWaterMark), lhsCursorMemoryHighWaterMark, rhsCursorMemoryHighWaterMark)) {
                return false;
            }
        }
        {
            String lhsDeadLetterStrategy;
            lhsDeadLetterStrategy = this.getDeadLetterStrategy();
            String rhsDeadLetterStrategy;
            rhsDeadLetterStrategy = that.getDeadLetterStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterStrategy", lhsDeadLetterStrategy), LocatorUtils.property(thatLocator, "deadLetterStrategy", rhsDeadLetterStrategy), lhsDeadLetterStrategy, rhsDeadLetterStrategy)) {
                return false;
            }
        }
        {
            String lhsDestination;
            lhsDestination = this.getDestination();
            String rhsDestination;
            rhsDestination = that.getDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            String lhsDispatchPolicy;
            lhsDispatchPolicy = this.getDispatchPolicy();
            String rhsDispatchPolicy;
            rhsDispatchPolicy = that.getDispatchPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispatchPolicy", lhsDispatchPolicy), LocatorUtils.property(thatLocator, "dispatchPolicy", rhsDispatchPolicy), lhsDispatchPolicy, rhsDispatchPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsDoOptimzeMessageStorage;
            lhsDoOptimzeMessageStorage = this.isDoOptimzeMessageStorage();
            Boolean rhsDoOptimzeMessageStorage;
            rhsDoOptimzeMessageStorage = that.isDoOptimzeMessageStorage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doOptimzeMessageStorage", lhsDoOptimzeMessageStorage), LocatorUtils.property(thatLocator, "doOptimzeMessageStorage", rhsDoOptimzeMessageStorage), lhsDoOptimzeMessageStorage, rhsDoOptimzeMessageStorage)) {
                return false;
            }
        }
        {
            BigInteger lhsDurableTopicPrefetch;
            lhsDurableTopicPrefetch = this.getDurableTopicPrefetch();
            BigInteger rhsDurableTopicPrefetch;
            rhsDurableTopicPrefetch = that.getDurableTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durableTopicPrefetch", lhsDurableTopicPrefetch), LocatorUtils.property(thatLocator, "durableTopicPrefetch", rhsDurableTopicPrefetch), lhsDurableTopicPrefetch, rhsDurableTopicPrefetch)) {
                return false;
            }
        }
        {
            Boolean lhsEnableAudit;
            lhsEnableAudit = this.isEnableAudit();
            Boolean rhsEnableAudit;
            rhsEnableAudit = that.isEnableAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableAudit", lhsEnableAudit), LocatorUtils.property(thatLocator, "enableAudit", rhsEnableAudit), lhsEnableAudit, rhsEnableAudit)) {
                return false;
            }
        }
        {
            Long lhsExpireMessagesPeriod;
            lhsExpireMessagesPeriod = this.getExpireMessagesPeriod();
            Long rhsExpireMessagesPeriod;
            rhsExpireMessagesPeriod = that.getExpireMessagesPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expireMessagesPeriod", lhsExpireMessagesPeriod), LocatorUtils.property(thatLocator, "expireMessagesPeriod", rhsExpireMessagesPeriod), lhsExpireMessagesPeriod, rhsExpireMessagesPeriod)) {
                return false;
            }
        }
        {
            Boolean lhsGcInactiveDestinations;
            lhsGcInactiveDestinations = this.isGcInactiveDestinations();
            Boolean rhsGcInactiveDestinations;
            rhsGcInactiveDestinations = that.isGcInactiveDestinations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcInactiveDestinations", lhsGcInactiveDestinations), LocatorUtils.property(thatLocator, "gcInactiveDestinations", rhsGcInactiveDestinations), lhsGcInactiveDestinations, rhsGcInactiveDestinations)) {
                return false;
            }
        }
        {
            Boolean lhsGcWithNetworkConsumers;
            lhsGcWithNetworkConsumers = this.isGcWithNetworkConsumers();
            Boolean rhsGcWithNetworkConsumers;
            rhsGcWithNetworkConsumers = that.isGcWithNetworkConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcWithNetworkConsumers", lhsGcWithNetworkConsumers), LocatorUtils.property(thatLocator, "gcWithNetworkConsumers", rhsGcWithNetworkConsumers), lhsGcWithNetworkConsumers, rhsGcWithNetworkConsumers)) {
                return false;
            }
        }
        {
            Long lhsInactiveTimeoutBeforeGC;
            lhsInactiveTimeoutBeforeGC = this.getInactiveTimeoutBeforeGC();
            Long rhsInactiveTimeoutBeforeGC;
            rhsInactiveTimeoutBeforeGC = that.getInactiveTimeoutBeforeGC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inactiveTimeoutBeforeGC", lhsInactiveTimeoutBeforeGC), LocatorUtils.property(thatLocator, "inactiveTimeoutBeforeGC", rhsInactiveTimeoutBeforeGC), lhsInactiveTimeoutBeforeGC, rhsInactiveTimeoutBeforeGC)) {
                return false;
            }
        }
        {
            Long lhsInactiveTimoutBeforeGC;
            lhsInactiveTimoutBeforeGC = this.getInactiveTimoutBeforeGC();
            Long rhsInactiveTimoutBeforeGC;
            rhsInactiveTimoutBeforeGC = that.getInactiveTimoutBeforeGC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inactiveTimoutBeforeGC", lhsInactiveTimoutBeforeGC), LocatorUtils.property(thatLocator, "inactiveTimoutBeforeGC", rhsInactiveTimoutBeforeGC), lhsInactiveTimoutBeforeGC, rhsInactiveTimoutBeforeGC)) {
                return false;
            }
        }
        {
            Boolean lhsLazyDispatch;
            lhsLazyDispatch = this.isLazyDispatch();
            Boolean rhsLazyDispatch;
            rhsLazyDispatch = that.isLazyDispatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lazyDispatch", lhsLazyDispatch), LocatorUtils.property(thatLocator, "lazyDispatch", rhsLazyDispatch), lhsLazyDispatch, rhsLazyDispatch)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxAuditDepth;
            lhsMaxAuditDepth = this.getMaxAuditDepth();
            BigInteger rhsMaxAuditDepth;
            rhsMaxAuditDepth = that.getMaxAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAuditDepth", lhsMaxAuditDepth), LocatorUtils.property(thatLocator, "maxAuditDepth", rhsMaxAuditDepth), lhsMaxAuditDepth, rhsMaxAuditDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxBrowsePageSize;
            lhsMaxBrowsePageSize = this.getMaxBrowsePageSize();
            BigInteger rhsMaxBrowsePageSize;
            rhsMaxBrowsePageSize = that.getMaxBrowsePageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxBrowsePageSize", lhsMaxBrowsePageSize), LocatorUtils.property(thatLocator, "maxBrowsePageSize", rhsMaxBrowsePageSize), lhsMaxBrowsePageSize, rhsMaxBrowsePageSize)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxExpirePageSize;
            lhsMaxExpirePageSize = this.getMaxExpirePageSize();
            BigInteger rhsMaxExpirePageSize;
            rhsMaxExpirePageSize = that.getMaxExpirePageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxExpirePageSize", lhsMaxExpirePageSize), LocatorUtils.property(thatLocator, "maxExpirePageSize", rhsMaxExpirePageSize), lhsMaxExpirePageSize, rhsMaxExpirePageSize)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxPageSize;
            lhsMaxPageSize = this.getMaxPageSize();
            BigInteger rhsMaxPageSize;
            rhsMaxPageSize = that.getMaxPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxPageSize", lhsMaxPageSize), LocatorUtils.property(thatLocator, "maxPageSize", rhsMaxPageSize), lhsMaxPageSize, rhsMaxPageSize)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxProducersToAudit;
            lhsMaxProducersToAudit = this.getMaxProducersToAudit();
            BigInteger rhsMaxProducersToAudit;
            rhsMaxProducersToAudit = that.getMaxProducersToAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxProducersToAudit", lhsMaxProducersToAudit), LocatorUtils.property(thatLocator, "maxProducersToAudit", rhsMaxProducersToAudit), lhsMaxProducersToAudit, rhsMaxProducersToAudit)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxQueueAuditDepth;
            lhsMaxQueueAuditDepth = this.getMaxQueueAuditDepth();
            BigInteger rhsMaxQueueAuditDepth;
            rhsMaxQueueAuditDepth = that.getMaxQueueAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxQueueAuditDepth", lhsMaxQueueAuditDepth), LocatorUtils.property(thatLocator, "maxQueueAuditDepth", rhsMaxQueueAuditDepth), lhsMaxQueueAuditDepth, rhsMaxQueueAuditDepth)) {
                return false;
            }
        }
        {
            String lhsMemoryLimit;
            lhsMemoryLimit = this.getMemoryLimit();
            String rhsMemoryLimit;
            rhsMemoryLimit = that.getMemoryLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryLimit", lhsMemoryLimit), LocatorUtils.property(thatLocator, "memoryLimit", rhsMemoryLimit), lhsMemoryLimit, rhsMemoryLimit)) {
                return false;
            }
        }
        {
            String lhsMessageEvictionStrategy;
            lhsMessageEvictionStrategy = this.getMessageEvictionStrategy();
            String rhsMessageEvictionStrategy;
            rhsMessageEvictionStrategy = that.getMessageEvictionStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageEvictionStrategy", lhsMessageEvictionStrategy), LocatorUtils.property(thatLocator, "messageEvictionStrategy", rhsMessageEvictionStrategy), lhsMessageEvictionStrategy, rhsMessageEvictionStrategy)) {
                return false;
            }
        }
        {
            String lhsMessageGroupMapFactory;
            lhsMessageGroupMapFactory = this.getMessageGroupMapFactory();
            String rhsMessageGroupMapFactory;
            rhsMessageGroupMapFactory = that.getMessageGroupMapFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageGroupMapFactory", lhsMessageGroupMapFactory), LocatorUtils.property(thatLocator, "messageGroupMapFactory", rhsMessageGroupMapFactory), lhsMessageGroupMapFactory, rhsMessageGroupMapFactory)) {
                return false;
            }
        }
        {
            String lhsMessageGroupMapFactoryType;
            lhsMessageGroupMapFactoryType = this.getMessageGroupMapFactoryType();
            String rhsMessageGroupMapFactoryType;
            rhsMessageGroupMapFactoryType = that.getMessageGroupMapFactoryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageGroupMapFactoryType", lhsMessageGroupMapFactoryType), LocatorUtils.property(thatLocator, "messageGroupMapFactoryType", rhsMessageGroupMapFactoryType), lhsMessageGroupMapFactoryType, rhsMessageGroupMapFactoryType)) {
                return false;
            }
        }
        {
            Long lhsMinimumMessageSize;
            lhsMinimumMessageSize = this.getMinimumMessageSize();
            Long rhsMinimumMessageSize;
            rhsMinimumMessageSize = that.getMinimumMessageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumMessageSize", lhsMinimumMessageSize), LocatorUtils.property(thatLocator, "minimumMessageSize", rhsMinimumMessageSize), lhsMinimumMessageSize, rhsMinimumMessageSize)) {
                return false;
            }
        }
        {
            String lhsNetworkBridgeFilterFactory;
            lhsNetworkBridgeFilterFactory = this.getNetworkBridgeFilterFactory();
            String rhsNetworkBridgeFilterFactory;
            rhsNetworkBridgeFilterFactory = that.getNetworkBridgeFilterFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkBridgeFilterFactory", lhsNetworkBridgeFilterFactory), LocatorUtils.property(thatLocator, "networkBridgeFilterFactory", rhsNetworkBridgeFilterFactory), lhsNetworkBridgeFilterFactory, rhsNetworkBridgeFilterFactory)) {
                return false;
            }
        }
        {
            BigInteger lhsOptimizeMessageStoreInFlightLimit;
            lhsOptimizeMessageStoreInFlightLimit = this.getOptimizeMessageStoreInFlightLimit();
            BigInteger rhsOptimizeMessageStoreInFlightLimit;
            rhsOptimizeMessageStoreInFlightLimit = that.getOptimizeMessageStoreInFlightLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizeMessageStoreInFlightLimit", lhsOptimizeMessageStoreInFlightLimit), LocatorUtils.property(thatLocator, "optimizeMessageStoreInFlightLimit", rhsOptimizeMessageStoreInFlightLimit), lhsOptimizeMessageStoreInFlightLimit, rhsOptimizeMessageStoreInFlightLimit)) {
                return false;
            }
        }
        {
            Boolean lhsOptimizedDispatch;
            lhsOptimizedDispatch = this.isOptimizedDispatch();
            Boolean rhsOptimizedDispatch;
            rhsOptimizedDispatch = that.isOptimizedDispatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizedDispatch", lhsOptimizedDispatch), LocatorUtils.property(thatLocator, "optimizedDispatch", rhsOptimizedDispatch), lhsOptimizedDispatch, rhsOptimizedDispatch)) {
                return false;
            }
        }
        {
            String lhsPendingDurableSubscriberPolicy;
            lhsPendingDurableSubscriberPolicy = this.getPendingDurableSubscriberPolicy();
            String rhsPendingDurableSubscriberPolicy;
            rhsPendingDurableSubscriberPolicy = that.getPendingDurableSubscriberPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pendingDurableSubscriberPolicy", lhsPendingDurableSubscriberPolicy), LocatorUtils.property(thatLocator, "pendingDurableSubscriberPolicy", rhsPendingDurableSubscriberPolicy), lhsPendingDurableSubscriberPolicy, rhsPendingDurableSubscriberPolicy)) {
                return false;
            }
        }
        {
            String lhsPendingMessageLimitStrategy;
            lhsPendingMessageLimitStrategy = this.getPendingMessageLimitStrategy();
            String rhsPendingMessageLimitStrategy;
            rhsPendingMessageLimitStrategy = that.getPendingMessageLimitStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pendingMessageLimitStrategy", lhsPendingMessageLimitStrategy), LocatorUtils.property(thatLocator, "pendingMessageLimitStrategy", rhsPendingMessageLimitStrategy), lhsPendingMessageLimitStrategy, rhsPendingMessageLimitStrategy)) {
                return false;
            }
        }
        {
            String lhsPendingQueuePolicy;
            lhsPendingQueuePolicy = this.getPendingQueuePolicy();
            String rhsPendingQueuePolicy;
            rhsPendingQueuePolicy = that.getPendingQueuePolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pendingQueuePolicy", lhsPendingQueuePolicy), LocatorUtils.property(thatLocator, "pendingQueuePolicy", rhsPendingQueuePolicy), lhsPendingQueuePolicy, rhsPendingQueuePolicy)) {
                return false;
            }
        }
        {
            String lhsPendingSubscriberPolicy;
            lhsPendingSubscriberPolicy = this.getPendingSubscriberPolicy();
            String rhsPendingSubscriberPolicy;
            rhsPendingSubscriberPolicy = that.getPendingSubscriberPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pendingSubscriberPolicy", lhsPendingSubscriberPolicy), LocatorUtils.property(thatLocator, "pendingSubscriberPolicy", rhsPendingSubscriberPolicy), lhsPendingSubscriberPolicy, rhsPendingSubscriberPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsPersistJMSRedelivered;
            lhsPersistJMSRedelivered = this.isPersistJMSRedelivered();
            Boolean rhsPersistJMSRedelivered;
            rhsPersistJMSRedelivered = that.isPersistJMSRedelivered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistJMSRedelivered", lhsPersistJMSRedelivered), LocatorUtils.property(thatLocator, "persistJMSRedelivered", rhsPersistJMSRedelivered), lhsPersistJMSRedelivered, rhsPersistJMSRedelivered)) {
                return false;
            }
        }
        {
            Boolean lhsPrioritizedMessages;
            lhsPrioritizedMessages = this.isPrioritizedMessages();
            Boolean rhsPrioritizedMessages;
            rhsPrioritizedMessages = that.isPrioritizedMessages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prioritizedMessages", lhsPrioritizedMessages), LocatorUtils.property(thatLocator, "prioritizedMessages", rhsPrioritizedMessages), lhsPrioritizedMessages, rhsPrioritizedMessages)) {
                return false;
            }
        }
        {
            Boolean lhsProducerFlowControl;
            lhsProducerFlowControl = this.isProducerFlowControl();
            Boolean rhsProducerFlowControl;
            rhsProducerFlowControl = that.isProducerFlowControl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerFlowControl", lhsProducerFlowControl), LocatorUtils.property(thatLocator, "producerFlowControl", rhsProducerFlowControl), lhsProducerFlowControl, rhsProducerFlowControl)) {
                return false;
            }
        }
        {
            String lhsQueue;
            lhsQueue = this.getQueue();
            String rhsQueue;
            rhsQueue = that.getQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                return false;
            }
        }
        {
            BigInteger lhsQueueBrowserPrefetch;
            lhsQueueBrowserPrefetch = this.getQueueBrowserPrefetch();
            BigInteger rhsQueueBrowserPrefetch;
            rhsQueueBrowserPrefetch = that.getQueueBrowserPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueBrowserPrefetch", lhsQueueBrowserPrefetch), LocatorUtils.property(thatLocator, "queueBrowserPrefetch", rhsQueueBrowserPrefetch), lhsQueueBrowserPrefetch, rhsQueueBrowserPrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsQueuePrefetch;
            lhsQueuePrefetch = this.getQueuePrefetch();
            BigInteger rhsQueuePrefetch;
            rhsQueuePrefetch = that.getQueuePrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queuePrefetch", lhsQueuePrefetch), LocatorUtils.property(thatLocator, "queuePrefetch", rhsQueuePrefetch), lhsQueuePrefetch, rhsQueuePrefetch)) {
                return false;
            }
        }
        {
            Boolean lhsReduceMemoryFootprint;
            lhsReduceMemoryFootprint = this.isReduceMemoryFootprint();
            Boolean rhsReduceMemoryFootprint;
            rhsReduceMemoryFootprint = that.isReduceMemoryFootprint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reduceMemoryFootprint", lhsReduceMemoryFootprint), LocatorUtils.property(thatLocator, "reduceMemoryFootprint", rhsReduceMemoryFootprint), lhsReduceMemoryFootprint, rhsReduceMemoryFootprint)) {
                return false;
            }
        }
        {
            Boolean lhsSendAdvisoryIfNoConsumers;
            lhsSendAdvisoryIfNoConsumers = this.isSendAdvisoryIfNoConsumers();
            Boolean rhsSendAdvisoryIfNoConsumers;
            rhsSendAdvisoryIfNoConsumers = that.isSendAdvisoryIfNoConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendAdvisoryIfNoConsumers", lhsSendAdvisoryIfNoConsumers), LocatorUtils.property(thatLocator, "sendAdvisoryIfNoConsumers", rhsSendAdvisoryIfNoConsumers), lhsSendAdvisoryIfNoConsumers, rhsSendAdvisoryIfNoConsumers)) {
                return false;
            }
        }
        {
            String lhsSlowConsumerStrategy;
            lhsSlowConsumerStrategy = this.getSlowConsumerStrategy();
            String rhsSlowConsumerStrategy;
            rhsSlowConsumerStrategy = that.getSlowConsumerStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "slowConsumerStrategy", lhsSlowConsumerStrategy), LocatorUtils.property(thatLocator, "slowConsumerStrategy", rhsSlowConsumerStrategy), lhsSlowConsumerStrategy, rhsSlowConsumerStrategy)) {
                return false;
            }
        }
        {
            BigInteger lhsStoreUsageHighWaterMark;
            lhsStoreUsageHighWaterMark = this.getStoreUsageHighWaterMark();
            BigInteger rhsStoreUsageHighWaterMark;
            rhsStoreUsageHighWaterMark = that.getStoreUsageHighWaterMark();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storeUsageHighWaterMark", lhsStoreUsageHighWaterMark), LocatorUtils.property(thatLocator, "storeUsageHighWaterMark", rhsStoreUsageHighWaterMark), lhsStoreUsageHighWaterMark, rhsStoreUsageHighWaterMark)) {
                return false;
            }
        }
        {
            Boolean lhsStrictOrderDispatch;
            lhsStrictOrderDispatch = this.isStrictOrderDispatch();
            Boolean rhsStrictOrderDispatch;
            rhsStrictOrderDispatch = that.isStrictOrderDispatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strictOrderDispatch", lhsStrictOrderDispatch), LocatorUtils.property(thatLocator, "strictOrderDispatch", rhsStrictOrderDispatch), lhsStrictOrderDispatch, rhsStrictOrderDispatch)) {
                return false;
            }
        }
        {
            String lhsSubscriptionRecoveryPolicy;
            lhsSubscriptionRecoveryPolicy = this.getSubscriptionRecoveryPolicy();
            String rhsSubscriptionRecoveryPolicy;
            rhsSubscriptionRecoveryPolicy = that.getSubscriptionRecoveryPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriptionRecoveryPolicy", lhsSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "subscriptionRecoveryPolicy", rhsSubscriptionRecoveryPolicy), lhsSubscriptionRecoveryPolicy, rhsSubscriptionRecoveryPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsTempQueue;
            lhsTempQueue = this.isTempQueue();
            Boolean rhsTempQueue;
            rhsTempQueue = that.isTempQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                return false;
            }
        }
        {
            Boolean lhsTempTopic;
            lhsTempTopic = this.isTempTopic();
            Boolean rhsTempTopic;
            rhsTempTopic = that.isTempTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                return false;
            }
        }
        {
            BigInteger lhsTimeBeforeDispatchStarts;
            lhsTimeBeforeDispatchStarts = this.getTimeBeforeDispatchStarts();
            BigInteger rhsTimeBeforeDispatchStarts;
            rhsTimeBeforeDispatchStarts = that.getTimeBeforeDispatchStarts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeBeforeDispatchStarts", lhsTimeBeforeDispatchStarts), LocatorUtils.property(thatLocator, "timeBeforeDispatchStarts", rhsTimeBeforeDispatchStarts), lhsTimeBeforeDispatchStarts, rhsTimeBeforeDispatchStarts)) {
                return false;
            }
        }
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            BigInteger lhsTopicPrefetch;
            lhsTopicPrefetch = this.getTopicPrefetch();
            BigInteger rhsTopicPrefetch;
            rhsTopicPrefetch = that.getTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicPrefetch", lhsTopicPrefetch), LocatorUtils.property(thatLocator, "topicPrefetch", rhsTopicPrefetch), lhsTopicPrefetch, rhsTopicPrefetch)) {
                return false;
            }
        }
        {
            Boolean lhsUseCache;
            lhsUseCache = this.isUseCache();
            Boolean rhsUseCache;
            rhsUseCache = that.isUseCache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCache", lhsUseCache), LocatorUtils.property(thatLocator, "useCache", rhsUseCache), lhsUseCache, rhsUseCache)) {
                return false;
            }
        }
        {
            Boolean lhsUseConsumerPriority;
            lhsUseConsumerPriority = this.isUseConsumerPriority();
            Boolean rhsUseConsumerPriority;
            rhsUseConsumerPriority = that.isUseConsumerPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useConsumerPriority", lhsUseConsumerPriority), LocatorUtils.property(thatLocator, "useConsumerPriority", rhsUseConsumerPriority), lhsUseConsumerPriority, rhsUseConsumerPriority)) {
                return false;
            }
        }
        {
            Boolean lhsUsePrefetchExtension;
            lhsUsePrefetchExtension = this.isUsePrefetchExtension();
            Boolean rhsUsePrefetchExtension;
            rhsUsePrefetchExtension = that.isUsePrefetchExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usePrefetchExtension", lhsUsePrefetchExtension), LocatorUtils.property(thatLocator, "usePrefetchExtension", rhsUsePrefetchExtension), lhsUsePrefetchExtension, rhsUsePrefetchExtension)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}discarding"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}individualDeadLetterStrategy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}sharedDeadLetterStrategy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "discarding",
        "individualDeadLetterStrategy",
        "sharedDeadLetterStrategy",
        "any"
    })
    public static class DeadLetterStrategy
        implements Equals, HashCode, ToString
    {

        protected DtoDiscarding discarding;
        protected DtoIndividualDeadLetterStrategy individualDeadLetterStrategy;
        protected DtoSharedDeadLetterStrategy sharedDeadLetterStrategy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取discarding属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDiscarding }
         *     
         */
        public DtoDiscarding getDiscarding() {
            return discarding;
        }

        /**
         * 设置discarding属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDiscarding }
         *     
         */
        public void setDiscarding(DtoDiscarding value) {
            this.discarding = value;
        }

        /**
         * 获取individualDeadLetterStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoIndividualDeadLetterStrategy }
         *     
         */
        public DtoIndividualDeadLetterStrategy getIndividualDeadLetterStrategy() {
            return individualDeadLetterStrategy;
        }

        /**
         * 设置individualDeadLetterStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoIndividualDeadLetterStrategy }
         *     
         */
        public void setIndividualDeadLetterStrategy(DtoIndividualDeadLetterStrategy value) {
            this.individualDeadLetterStrategy = value;
        }

        /**
         * 获取sharedDeadLetterStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSharedDeadLetterStrategy }
         *     
         */
        public DtoSharedDeadLetterStrategy getSharedDeadLetterStrategy() {
            return sharedDeadLetterStrategy;
        }

        /**
         * 设置sharedDeadLetterStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSharedDeadLetterStrategy }
         *     
         */
        public void setSharedDeadLetterStrategy(DtoSharedDeadLetterStrategy value) {
            this.sharedDeadLetterStrategy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoDiscarding theDiscarding;
                theDiscarding = this.getDiscarding();
                strategy.appendField(locator, this, "discarding", buffer, theDiscarding);
            }
            {
                DtoIndividualDeadLetterStrategy theIndividualDeadLetterStrategy;
                theIndividualDeadLetterStrategy = this.getIndividualDeadLetterStrategy();
                strategy.appendField(locator, this, "individualDeadLetterStrategy", buffer, theIndividualDeadLetterStrategy);
            }
            {
                DtoSharedDeadLetterStrategy theSharedDeadLetterStrategy;
                theSharedDeadLetterStrategy = this.getSharedDeadLetterStrategy();
                strategy.appendField(locator, this, "sharedDeadLetterStrategy", buffer, theSharedDeadLetterStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoDiscarding theDiscarding;
                theDiscarding = this.getDiscarding();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discarding", theDiscarding), currentHashCode, theDiscarding);
            }
            {
                DtoIndividualDeadLetterStrategy theIndividualDeadLetterStrategy;
                theIndividualDeadLetterStrategy = this.getIndividualDeadLetterStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "individualDeadLetterStrategy", theIndividualDeadLetterStrategy), currentHashCode, theIndividualDeadLetterStrategy);
            }
            {
                DtoSharedDeadLetterStrategy theSharedDeadLetterStrategy;
                theSharedDeadLetterStrategy = this.getSharedDeadLetterStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sharedDeadLetterStrategy", theSharedDeadLetterStrategy), currentHashCode, theSharedDeadLetterStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.DeadLetterStrategy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.DeadLetterStrategy that = ((DtoPolicyEntry.DeadLetterStrategy) object);
            {
                DtoDiscarding lhsDiscarding;
                lhsDiscarding = this.getDiscarding();
                DtoDiscarding rhsDiscarding;
                rhsDiscarding = that.getDiscarding();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "discarding", lhsDiscarding), LocatorUtils.property(thatLocator, "discarding", rhsDiscarding), lhsDiscarding, rhsDiscarding)) {
                    return false;
                }
            }
            {
                DtoIndividualDeadLetterStrategy lhsIndividualDeadLetterStrategy;
                lhsIndividualDeadLetterStrategy = this.getIndividualDeadLetterStrategy();
                DtoIndividualDeadLetterStrategy rhsIndividualDeadLetterStrategy;
                rhsIndividualDeadLetterStrategy = that.getIndividualDeadLetterStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "individualDeadLetterStrategy", lhsIndividualDeadLetterStrategy), LocatorUtils.property(thatLocator, "individualDeadLetterStrategy", rhsIndividualDeadLetterStrategy), lhsIndividualDeadLetterStrategy, rhsIndividualDeadLetterStrategy)) {
                    return false;
                }
            }
            {
                DtoSharedDeadLetterStrategy lhsSharedDeadLetterStrategy;
                lhsSharedDeadLetterStrategy = this.getSharedDeadLetterStrategy();
                DtoSharedDeadLetterStrategy rhsSharedDeadLetterStrategy;
                rhsSharedDeadLetterStrategy = that.getSharedDeadLetterStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedDeadLetterStrategy", lhsSharedDeadLetterStrategy), LocatorUtils.property(thatLocator, "sharedDeadLetterStrategy", rhsSharedDeadLetterStrategy), lhsSharedDeadLetterStrategy, rhsSharedDeadLetterStrategy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "queue",
        "tempQueue",
        "tempTopic",
        "topic",
        "any"
    })
    public static class Destination
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
        protected DtoTempQueue tempQueue;
        protected DtoTempTopic tempTopic;
        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取queue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoQueue }
         *     
         */
        public DtoQueue getQueue() {
            return queue;
        }

        /**
         * 设置queue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoQueue }
         *     
         */
        public void setQueue(DtoQueue value) {
            this.queue = value;
        }

        /**
         * 获取tempQueue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempQueue }
         *     
         */
        public DtoTempQueue getTempQueue() {
            return tempQueue;
        }

        /**
         * 设置tempQueue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempQueue }
         *     
         */
        public void setTempQueue(DtoTempQueue value) {
            this.tempQueue = value;
        }

        /**
         * 获取tempTopic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempTopic }
         *     
         */
        public DtoTempTopic getTempTopic() {
            return tempTopic;
        }

        /**
         * 设置tempTopic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempTopic }
         *     
         */
        public void setTempTopic(DtoTempTopic value) {
            this.tempTopic = value;
        }

        /**
         * 获取topic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTopic }
         *     
         */
        public DtoTopic getTopic() {
            return topic;
        }

        /**
         * 设置topic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTopic }
         *     
         */
        public void setTopic(DtoTopic value) {
            this.topic = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoQueue theQueue;
                theQueue = this.getQueue();
                strategy.appendField(locator, this, "queue", buffer, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
            }
            {
                DtoTopic theTopic;
                theTopic = this.getTopic();
                strategy.appendField(locator, this, "topic", buffer, theTopic);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoQueue theQueue;
                theQueue = this.getQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
            }
            {
                DtoTopic theTopic;
                theTopic = this.getTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.Destination)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.Destination that = ((DtoPolicyEntry.Destination) object);
            {
                DtoQueue lhsQueue;
                lhsQueue = this.getQueue();
                DtoQueue rhsQueue;
                rhsQueue = that.getQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                    return false;
                }
            }
            {
                DtoTempQueue lhsTempQueue;
                lhsTempQueue = this.getTempQueue();
                DtoTempQueue rhsTempQueue;
                rhsTempQueue = that.getTempQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                    return false;
                }
            }
            {
                DtoTempTopic lhsTempTopic;
                lhsTempTopic = this.getTempTopic();
                DtoTempTopic rhsTempTopic;
                rhsTempTopic = that.getTempTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                    return false;
                }
            }
            {
                DtoTopic lhsTopic;
                lhsTopic = this.getTopic();
                DtoTopic rhsTopic;
                rhsTopic = that.getTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}priorityDispatchPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}priorityNetworkDispatchPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}roundRobinDispatchPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleDispatchPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}strictOrderDispatchPolicy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priorityDispatchPolicy",
        "priorityNetworkDispatchPolicy",
        "roundRobinDispatchPolicy",
        "simpleDispatchPolicy",
        "strictOrderDispatchPolicy",
        "any"
    })
    public static class DispatchPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoPriorityDispatchPolicy priorityDispatchPolicy;
        protected DtoPriorityNetworkDispatchPolicy priorityNetworkDispatchPolicy;
        protected DtoRoundRobinDispatchPolicy roundRobinDispatchPolicy;
        protected DtoSimpleDispatchPolicy simpleDispatchPolicy;
        protected DtoStrictOrderDispatchPolicy strictOrderDispatchPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取priorityDispatchPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPriorityDispatchPolicy }
         *     
         */
        public DtoPriorityDispatchPolicy getPriorityDispatchPolicy() {
            return priorityDispatchPolicy;
        }

        /**
         * 设置priorityDispatchPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPriorityDispatchPolicy }
         *     
         */
        public void setPriorityDispatchPolicy(DtoPriorityDispatchPolicy value) {
            this.priorityDispatchPolicy = value;
        }

        /**
         * 获取priorityNetworkDispatchPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPriorityNetworkDispatchPolicy }
         *     
         */
        public DtoPriorityNetworkDispatchPolicy getPriorityNetworkDispatchPolicy() {
            return priorityNetworkDispatchPolicy;
        }

        /**
         * 设置priorityNetworkDispatchPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPriorityNetworkDispatchPolicy }
         *     
         */
        public void setPriorityNetworkDispatchPolicy(DtoPriorityNetworkDispatchPolicy value) {
            this.priorityNetworkDispatchPolicy = value;
        }

        /**
         * 获取roundRobinDispatchPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRoundRobinDispatchPolicy }
         *     
         */
        public DtoRoundRobinDispatchPolicy getRoundRobinDispatchPolicy() {
            return roundRobinDispatchPolicy;
        }

        /**
         * 设置roundRobinDispatchPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRoundRobinDispatchPolicy }
         *     
         */
        public void setRoundRobinDispatchPolicy(DtoRoundRobinDispatchPolicy value) {
            this.roundRobinDispatchPolicy = value;
        }

        /**
         * 获取simpleDispatchPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSimpleDispatchPolicy }
         *     
         */
        public DtoSimpleDispatchPolicy getSimpleDispatchPolicy() {
            return simpleDispatchPolicy;
        }

        /**
         * 设置simpleDispatchPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSimpleDispatchPolicy }
         *     
         */
        public void setSimpleDispatchPolicy(DtoSimpleDispatchPolicy value) {
            this.simpleDispatchPolicy = value;
        }

        /**
         * 获取strictOrderDispatchPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStrictOrderDispatchPolicy }
         *     
         */
        public DtoStrictOrderDispatchPolicy getStrictOrderDispatchPolicy() {
            return strictOrderDispatchPolicy;
        }

        /**
         * 设置strictOrderDispatchPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStrictOrderDispatchPolicy }
         *     
         */
        public void setStrictOrderDispatchPolicy(DtoStrictOrderDispatchPolicy value) {
            this.strictOrderDispatchPolicy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoPriorityDispatchPolicy thePriorityDispatchPolicy;
                thePriorityDispatchPolicy = this.getPriorityDispatchPolicy();
                strategy.appendField(locator, this, "priorityDispatchPolicy", buffer, thePriorityDispatchPolicy);
            }
            {
                DtoPriorityNetworkDispatchPolicy thePriorityNetworkDispatchPolicy;
                thePriorityNetworkDispatchPolicy = this.getPriorityNetworkDispatchPolicy();
                strategy.appendField(locator, this, "priorityNetworkDispatchPolicy", buffer, thePriorityNetworkDispatchPolicy);
            }
            {
                DtoRoundRobinDispatchPolicy theRoundRobinDispatchPolicy;
                theRoundRobinDispatchPolicy = this.getRoundRobinDispatchPolicy();
                strategy.appendField(locator, this, "roundRobinDispatchPolicy", buffer, theRoundRobinDispatchPolicy);
            }
            {
                DtoSimpleDispatchPolicy theSimpleDispatchPolicy;
                theSimpleDispatchPolicy = this.getSimpleDispatchPolicy();
                strategy.appendField(locator, this, "simpleDispatchPolicy", buffer, theSimpleDispatchPolicy);
            }
            {
                DtoStrictOrderDispatchPolicy theStrictOrderDispatchPolicy;
                theStrictOrderDispatchPolicy = this.getStrictOrderDispatchPolicy();
                strategy.appendField(locator, this, "strictOrderDispatchPolicy", buffer, theStrictOrderDispatchPolicy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoPriorityDispatchPolicy thePriorityDispatchPolicy;
                thePriorityDispatchPolicy = this.getPriorityDispatchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priorityDispatchPolicy", thePriorityDispatchPolicy), currentHashCode, thePriorityDispatchPolicy);
            }
            {
                DtoPriorityNetworkDispatchPolicy thePriorityNetworkDispatchPolicy;
                thePriorityNetworkDispatchPolicy = this.getPriorityNetworkDispatchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priorityNetworkDispatchPolicy", thePriorityNetworkDispatchPolicy), currentHashCode, thePriorityNetworkDispatchPolicy);
            }
            {
                DtoRoundRobinDispatchPolicy theRoundRobinDispatchPolicy;
                theRoundRobinDispatchPolicy = this.getRoundRobinDispatchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roundRobinDispatchPolicy", theRoundRobinDispatchPolicy), currentHashCode, theRoundRobinDispatchPolicy);
            }
            {
                DtoSimpleDispatchPolicy theSimpleDispatchPolicy;
                theSimpleDispatchPolicy = this.getSimpleDispatchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleDispatchPolicy", theSimpleDispatchPolicy), currentHashCode, theSimpleDispatchPolicy);
            }
            {
                DtoStrictOrderDispatchPolicy theStrictOrderDispatchPolicy;
                theStrictOrderDispatchPolicy = this.getStrictOrderDispatchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strictOrderDispatchPolicy", theStrictOrderDispatchPolicy), currentHashCode, theStrictOrderDispatchPolicy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.DispatchPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.DispatchPolicy that = ((DtoPolicyEntry.DispatchPolicy) object);
            {
                DtoPriorityDispatchPolicy lhsPriorityDispatchPolicy;
                lhsPriorityDispatchPolicy = this.getPriorityDispatchPolicy();
                DtoPriorityDispatchPolicy rhsPriorityDispatchPolicy;
                rhsPriorityDispatchPolicy = that.getPriorityDispatchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "priorityDispatchPolicy", lhsPriorityDispatchPolicy), LocatorUtils.property(thatLocator, "priorityDispatchPolicy", rhsPriorityDispatchPolicy), lhsPriorityDispatchPolicy, rhsPriorityDispatchPolicy)) {
                    return false;
                }
            }
            {
                DtoPriorityNetworkDispatchPolicy lhsPriorityNetworkDispatchPolicy;
                lhsPriorityNetworkDispatchPolicy = this.getPriorityNetworkDispatchPolicy();
                DtoPriorityNetworkDispatchPolicy rhsPriorityNetworkDispatchPolicy;
                rhsPriorityNetworkDispatchPolicy = that.getPriorityNetworkDispatchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "priorityNetworkDispatchPolicy", lhsPriorityNetworkDispatchPolicy), LocatorUtils.property(thatLocator, "priorityNetworkDispatchPolicy", rhsPriorityNetworkDispatchPolicy), lhsPriorityNetworkDispatchPolicy, rhsPriorityNetworkDispatchPolicy)) {
                    return false;
                }
            }
            {
                DtoRoundRobinDispatchPolicy lhsRoundRobinDispatchPolicy;
                lhsRoundRobinDispatchPolicy = this.getRoundRobinDispatchPolicy();
                DtoRoundRobinDispatchPolicy rhsRoundRobinDispatchPolicy;
                rhsRoundRobinDispatchPolicy = that.getRoundRobinDispatchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "roundRobinDispatchPolicy", lhsRoundRobinDispatchPolicy), LocatorUtils.property(thatLocator, "roundRobinDispatchPolicy", rhsRoundRobinDispatchPolicy), lhsRoundRobinDispatchPolicy, rhsRoundRobinDispatchPolicy)) {
                    return false;
                }
            }
            {
                DtoSimpleDispatchPolicy lhsSimpleDispatchPolicy;
                lhsSimpleDispatchPolicy = this.getSimpleDispatchPolicy();
                DtoSimpleDispatchPolicy rhsSimpleDispatchPolicy;
                rhsSimpleDispatchPolicy = that.getSimpleDispatchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleDispatchPolicy", lhsSimpleDispatchPolicy), LocatorUtils.property(thatLocator, "simpleDispatchPolicy", rhsSimpleDispatchPolicy), lhsSimpleDispatchPolicy, rhsSimpleDispatchPolicy)) {
                    return false;
                }
            }
            {
                DtoStrictOrderDispatchPolicy lhsStrictOrderDispatchPolicy;
                lhsStrictOrderDispatchPolicy = this.getStrictOrderDispatchPolicy();
                DtoStrictOrderDispatchPolicy rhsStrictOrderDispatchPolicy;
                rhsStrictOrderDispatchPolicy = that.getStrictOrderDispatchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "strictOrderDispatchPolicy", lhsStrictOrderDispatchPolicy), LocatorUtils.property(thatLocator, "strictOrderDispatchPolicy", rhsStrictOrderDispatchPolicy), lhsStrictOrderDispatchPolicy, rhsStrictOrderDispatchPolicy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}oldestMessageEvictionStrategy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}oldestMessageWithLowestPriorityEvictionStrategy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}uniquePropertyMessageEvictionStrategy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oldestMessageEvictionStrategy",
        "oldestMessageWithLowestPriorityEvictionStrategy",
        "uniquePropertyMessageEvictionStrategy",
        "any"
    })
    public static class MessageEvictionStrategy
        implements Equals, HashCode, ToString
    {

        protected DtoOldestMessageEvictionStrategy oldestMessageEvictionStrategy;
        protected DtoOldestMessageWithLowestPriorityEvictionStrategy oldestMessageWithLowestPriorityEvictionStrategy;
        protected DtoUniquePropertyMessageEvictionStrategy uniquePropertyMessageEvictionStrategy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取oldestMessageEvictionStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoOldestMessageEvictionStrategy }
         *     
         */
        public DtoOldestMessageEvictionStrategy getOldestMessageEvictionStrategy() {
            return oldestMessageEvictionStrategy;
        }

        /**
         * 设置oldestMessageEvictionStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoOldestMessageEvictionStrategy }
         *     
         */
        public void setOldestMessageEvictionStrategy(DtoOldestMessageEvictionStrategy value) {
            this.oldestMessageEvictionStrategy = value;
        }

        /**
         * 获取oldestMessageWithLowestPriorityEvictionStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoOldestMessageWithLowestPriorityEvictionStrategy }
         *     
         */
        public DtoOldestMessageWithLowestPriorityEvictionStrategy getOldestMessageWithLowestPriorityEvictionStrategy() {
            return oldestMessageWithLowestPriorityEvictionStrategy;
        }

        /**
         * 设置oldestMessageWithLowestPriorityEvictionStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoOldestMessageWithLowestPriorityEvictionStrategy }
         *     
         */
        public void setOldestMessageWithLowestPriorityEvictionStrategy(DtoOldestMessageWithLowestPriorityEvictionStrategy value) {
            this.oldestMessageWithLowestPriorityEvictionStrategy = value;
        }

        /**
         * 获取uniquePropertyMessageEvictionStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoUniquePropertyMessageEvictionStrategy }
         *     
         */
        public DtoUniquePropertyMessageEvictionStrategy getUniquePropertyMessageEvictionStrategy() {
            return uniquePropertyMessageEvictionStrategy;
        }

        /**
         * 设置uniquePropertyMessageEvictionStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoUniquePropertyMessageEvictionStrategy }
         *     
         */
        public void setUniquePropertyMessageEvictionStrategy(DtoUniquePropertyMessageEvictionStrategy value) {
            this.uniquePropertyMessageEvictionStrategy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoOldestMessageEvictionStrategy theOldestMessageEvictionStrategy;
                theOldestMessageEvictionStrategy = this.getOldestMessageEvictionStrategy();
                strategy.appendField(locator, this, "oldestMessageEvictionStrategy", buffer, theOldestMessageEvictionStrategy);
            }
            {
                DtoOldestMessageWithLowestPriorityEvictionStrategy theOldestMessageWithLowestPriorityEvictionStrategy;
                theOldestMessageWithLowestPriorityEvictionStrategy = this.getOldestMessageWithLowestPriorityEvictionStrategy();
                strategy.appendField(locator, this, "oldestMessageWithLowestPriorityEvictionStrategy", buffer, theOldestMessageWithLowestPriorityEvictionStrategy);
            }
            {
                DtoUniquePropertyMessageEvictionStrategy theUniquePropertyMessageEvictionStrategy;
                theUniquePropertyMessageEvictionStrategy = this.getUniquePropertyMessageEvictionStrategy();
                strategy.appendField(locator, this, "uniquePropertyMessageEvictionStrategy", buffer, theUniquePropertyMessageEvictionStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoOldestMessageEvictionStrategy theOldestMessageEvictionStrategy;
                theOldestMessageEvictionStrategy = this.getOldestMessageEvictionStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oldestMessageEvictionStrategy", theOldestMessageEvictionStrategy), currentHashCode, theOldestMessageEvictionStrategy);
            }
            {
                DtoOldestMessageWithLowestPriorityEvictionStrategy theOldestMessageWithLowestPriorityEvictionStrategy;
                theOldestMessageWithLowestPriorityEvictionStrategy = this.getOldestMessageWithLowestPriorityEvictionStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oldestMessageWithLowestPriorityEvictionStrategy", theOldestMessageWithLowestPriorityEvictionStrategy), currentHashCode, theOldestMessageWithLowestPriorityEvictionStrategy);
            }
            {
                DtoUniquePropertyMessageEvictionStrategy theUniquePropertyMessageEvictionStrategy;
                theUniquePropertyMessageEvictionStrategy = this.getUniquePropertyMessageEvictionStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uniquePropertyMessageEvictionStrategy", theUniquePropertyMessageEvictionStrategy), currentHashCode, theUniquePropertyMessageEvictionStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.MessageEvictionStrategy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.MessageEvictionStrategy that = ((DtoPolicyEntry.MessageEvictionStrategy) object);
            {
                DtoOldestMessageEvictionStrategy lhsOldestMessageEvictionStrategy;
                lhsOldestMessageEvictionStrategy = this.getOldestMessageEvictionStrategy();
                DtoOldestMessageEvictionStrategy rhsOldestMessageEvictionStrategy;
                rhsOldestMessageEvictionStrategy = that.getOldestMessageEvictionStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oldestMessageEvictionStrategy", lhsOldestMessageEvictionStrategy), LocatorUtils.property(thatLocator, "oldestMessageEvictionStrategy", rhsOldestMessageEvictionStrategy), lhsOldestMessageEvictionStrategy, rhsOldestMessageEvictionStrategy)) {
                    return false;
                }
            }
            {
                DtoOldestMessageWithLowestPriorityEvictionStrategy lhsOldestMessageWithLowestPriorityEvictionStrategy;
                lhsOldestMessageWithLowestPriorityEvictionStrategy = this.getOldestMessageWithLowestPriorityEvictionStrategy();
                DtoOldestMessageWithLowestPriorityEvictionStrategy rhsOldestMessageWithLowestPriorityEvictionStrategy;
                rhsOldestMessageWithLowestPriorityEvictionStrategy = that.getOldestMessageWithLowestPriorityEvictionStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oldestMessageWithLowestPriorityEvictionStrategy", lhsOldestMessageWithLowestPriorityEvictionStrategy), LocatorUtils.property(thatLocator, "oldestMessageWithLowestPriorityEvictionStrategy", rhsOldestMessageWithLowestPriorityEvictionStrategy), lhsOldestMessageWithLowestPriorityEvictionStrategy, rhsOldestMessageWithLowestPriorityEvictionStrategy)) {
                    return false;
                }
            }
            {
                DtoUniquePropertyMessageEvictionStrategy lhsUniquePropertyMessageEvictionStrategy;
                lhsUniquePropertyMessageEvictionStrategy = this.getUniquePropertyMessageEvictionStrategy();
                DtoUniquePropertyMessageEvictionStrategy rhsUniquePropertyMessageEvictionStrategy;
                rhsUniquePropertyMessageEvictionStrategy = that.getUniquePropertyMessageEvictionStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "uniquePropertyMessageEvictionStrategy", lhsUniquePropertyMessageEvictionStrategy), LocatorUtils.property(thatLocator, "uniquePropertyMessageEvictionStrategy", rhsUniquePropertyMessageEvictionStrategy), lhsUniquePropertyMessageEvictionStrategy, rhsUniquePropertyMessageEvictionStrategy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}cachedMessageGroupMapFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}messageGroupHashBucketFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleMessageGroupMapFactory"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cachedMessageGroupMapFactory",
        "messageGroupHashBucketFactory",
        "simpleMessageGroupMapFactory",
        "any"
    })
    public static class MessageGroupMapFactory
        implements Equals, HashCode, ToString
    {

        protected DtoCachedMessageGroupMapFactory cachedMessageGroupMapFactory;
        protected DtoMessageGroupHashBucketFactory messageGroupHashBucketFactory;
        protected DtoSimpleMessageGroupMapFactory simpleMessageGroupMapFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取cachedMessageGroupMapFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoCachedMessageGroupMapFactory }
         *     
         */
        public DtoCachedMessageGroupMapFactory getCachedMessageGroupMapFactory() {
            return cachedMessageGroupMapFactory;
        }

        /**
         * 设置cachedMessageGroupMapFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoCachedMessageGroupMapFactory }
         *     
         */
        public void setCachedMessageGroupMapFactory(DtoCachedMessageGroupMapFactory value) {
            this.cachedMessageGroupMapFactory = value;
        }

        /**
         * 获取messageGroupHashBucketFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMessageGroupHashBucketFactory }
         *     
         */
        public DtoMessageGroupHashBucketFactory getMessageGroupHashBucketFactory() {
            return messageGroupHashBucketFactory;
        }

        /**
         * 设置messageGroupHashBucketFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMessageGroupHashBucketFactory }
         *     
         */
        public void setMessageGroupHashBucketFactory(DtoMessageGroupHashBucketFactory value) {
            this.messageGroupHashBucketFactory = value;
        }

        /**
         * 获取simpleMessageGroupMapFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSimpleMessageGroupMapFactory }
         *     
         */
        public DtoSimpleMessageGroupMapFactory getSimpleMessageGroupMapFactory() {
            return simpleMessageGroupMapFactory;
        }

        /**
         * 设置simpleMessageGroupMapFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSimpleMessageGroupMapFactory }
         *     
         */
        public void setSimpleMessageGroupMapFactory(DtoSimpleMessageGroupMapFactory value) {
            this.simpleMessageGroupMapFactory = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoCachedMessageGroupMapFactory theCachedMessageGroupMapFactory;
                theCachedMessageGroupMapFactory = this.getCachedMessageGroupMapFactory();
                strategy.appendField(locator, this, "cachedMessageGroupMapFactory", buffer, theCachedMessageGroupMapFactory);
            }
            {
                DtoMessageGroupHashBucketFactory theMessageGroupHashBucketFactory;
                theMessageGroupHashBucketFactory = this.getMessageGroupHashBucketFactory();
                strategy.appendField(locator, this, "messageGroupHashBucketFactory", buffer, theMessageGroupHashBucketFactory);
            }
            {
                DtoSimpleMessageGroupMapFactory theSimpleMessageGroupMapFactory;
                theSimpleMessageGroupMapFactory = this.getSimpleMessageGroupMapFactory();
                strategy.appendField(locator, this, "simpleMessageGroupMapFactory", buffer, theSimpleMessageGroupMapFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoCachedMessageGroupMapFactory theCachedMessageGroupMapFactory;
                theCachedMessageGroupMapFactory = this.getCachedMessageGroupMapFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cachedMessageGroupMapFactory", theCachedMessageGroupMapFactory), currentHashCode, theCachedMessageGroupMapFactory);
            }
            {
                DtoMessageGroupHashBucketFactory theMessageGroupHashBucketFactory;
                theMessageGroupHashBucketFactory = this.getMessageGroupHashBucketFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageGroupHashBucketFactory", theMessageGroupHashBucketFactory), currentHashCode, theMessageGroupHashBucketFactory);
            }
            {
                DtoSimpleMessageGroupMapFactory theSimpleMessageGroupMapFactory;
                theSimpleMessageGroupMapFactory = this.getSimpleMessageGroupMapFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleMessageGroupMapFactory", theSimpleMessageGroupMapFactory), currentHashCode, theSimpleMessageGroupMapFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.MessageGroupMapFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.MessageGroupMapFactory that = ((DtoPolicyEntry.MessageGroupMapFactory) object);
            {
                DtoCachedMessageGroupMapFactory lhsCachedMessageGroupMapFactory;
                lhsCachedMessageGroupMapFactory = this.getCachedMessageGroupMapFactory();
                DtoCachedMessageGroupMapFactory rhsCachedMessageGroupMapFactory;
                rhsCachedMessageGroupMapFactory = that.getCachedMessageGroupMapFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "cachedMessageGroupMapFactory", lhsCachedMessageGroupMapFactory), LocatorUtils.property(thatLocator, "cachedMessageGroupMapFactory", rhsCachedMessageGroupMapFactory), lhsCachedMessageGroupMapFactory, rhsCachedMessageGroupMapFactory)) {
                    return false;
                }
            }
            {
                DtoMessageGroupHashBucketFactory lhsMessageGroupHashBucketFactory;
                lhsMessageGroupHashBucketFactory = this.getMessageGroupHashBucketFactory();
                DtoMessageGroupHashBucketFactory rhsMessageGroupHashBucketFactory;
                rhsMessageGroupHashBucketFactory = that.getMessageGroupHashBucketFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "messageGroupHashBucketFactory", lhsMessageGroupHashBucketFactory), LocatorUtils.property(thatLocator, "messageGroupHashBucketFactory", rhsMessageGroupHashBucketFactory), lhsMessageGroupHashBucketFactory, rhsMessageGroupHashBucketFactory)) {
                    return false;
                }
            }
            {
                DtoSimpleMessageGroupMapFactory lhsSimpleMessageGroupMapFactory;
                lhsSimpleMessageGroupMapFactory = this.getSimpleMessageGroupMapFactory();
                DtoSimpleMessageGroupMapFactory rhsSimpleMessageGroupMapFactory;
                rhsSimpleMessageGroupMapFactory = that.getSimpleMessageGroupMapFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleMessageGroupMapFactory", lhsSimpleMessageGroupMapFactory), LocatorUtils.property(thatLocator, "simpleMessageGroupMapFactory", rhsSimpleMessageGroupMapFactory), lhsSimpleMessageGroupMapFactory, rhsSimpleMessageGroupMapFactory)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}conditionalNetworkBridgeFilterFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}defaultNetworkBridgeFilterFactory"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conditionalNetworkBridgeFilterFactory",
        "defaultNetworkBridgeFilterFactory",
        "any"
    })
    public static class NetworkBridgeFilterFactory
        implements Equals, HashCode, ToString
    {

        protected DtoConditionalNetworkBridgeFilterFactory conditionalNetworkBridgeFilterFactory;
        protected DtoDefaultNetworkBridgeFilterFactory defaultNetworkBridgeFilterFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取conditionalNetworkBridgeFilterFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoConditionalNetworkBridgeFilterFactory }
         *     
         */
        public DtoConditionalNetworkBridgeFilterFactory getConditionalNetworkBridgeFilterFactory() {
            return conditionalNetworkBridgeFilterFactory;
        }

        /**
         * 设置conditionalNetworkBridgeFilterFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoConditionalNetworkBridgeFilterFactory }
         *     
         */
        public void setConditionalNetworkBridgeFilterFactory(DtoConditionalNetworkBridgeFilterFactory value) {
            this.conditionalNetworkBridgeFilterFactory = value;
        }

        /**
         * 获取defaultNetworkBridgeFilterFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDefaultNetworkBridgeFilterFactory }
         *     
         */
        public DtoDefaultNetworkBridgeFilterFactory getDefaultNetworkBridgeFilterFactory() {
            return defaultNetworkBridgeFilterFactory;
        }

        /**
         * 设置defaultNetworkBridgeFilterFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDefaultNetworkBridgeFilterFactory }
         *     
         */
        public void setDefaultNetworkBridgeFilterFactory(DtoDefaultNetworkBridgeFilterFactory value) {
            this.defaultNetworkBridgeFilterFactory = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoConditionalNetworkBridgeFilterFactory theConditionalNetworkBridgeFilterFactory;
                theConditionalNetworkBridgeFilterFactory = this.getConditionalNetworkBridgeFilterFactory();
                strategy.appendField(locator, this, "conditionalNetworkBridgeFilterFactory", buffer, theConditionalNetworkBridgeFilterFactory);
            }
            {
                DtoDefaultNetworkBridgeFilterFactory theDefaultNetworkBridgeFilterFactory;
                theDefaultNetworkBridgeFilterFactory = this.getDefaultNetworkBridgeFilterFactory();
                strategy.appendField(locator, this, "defaultNetworkBridgeFilterFactory", buffer, theDefaultNetworkBridgeFilterFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoConditionalNetworkBridgeFilterFactory theConditionalNetworkBridgeFilterFactory;
                theConditionalNetworkBridgeFilterFactory = this.getConditionalNetworkBridgeFilterFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionalNetworkBridgeFilterFactory", theConditionalNetworkBridgeFilterFactory), currentHashCode, theConditionalNetworkBridgeFilterFactory);
            }
            {
                DtoDefaultNetworkBridgeFilterFactory theDefaultNetworkBridgeFilterFactory;
                theDefaultNetworkBridgeFilterFactory = this.getDefaultNetworkBridgeFilterFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultNetworkBridgeFilterFactory", theDefaultNetworkBridgeFilterFactory), currentHashCode, theDefaultNetworkBridgeFilterFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.NetworkBridgeFilterFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.NetworkBridgeFilterFactory that = ((DtoPolicyEntry.NetworkBridgeFilterFactory) object);
            {
                DtoConditionalNetworkBridgeFilterFactory lhsConditionalNetworkBridgeFilterFactory;
                lhsConditionalNetworkBridgeFilterFactory = this.getConditionalNetworkBridgeFilterFactory();
                DtoConditionalNetworkBridgeFilterFactory rhsConditionalNetworkBridgeFilterFactory;
                rhsConditionalNetworkBridgeFilterFactory = that.getConditionalNetworkBridgeFilterFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionalNetworkBridgeFilterFactory", lhsConditionalNetworkBridgeFilterFactory), LocatorUtils.property(thatLocator, "conditionalNetworkBridgeFilterFactory", rhsConditionalNetworkBridgeFilterFactory), lhsConditionalNetworkBridgeFilterFactory, rhsConditionalNetworkBridgeFilterFactory)) {
                    return false;
                }
            }
            {
                DtoDefaultNetworkBridgeFilterFactory lhsDefaultNetworkBridgeFilterFactory;
                lhsDefaultNetworkBridgeFilterFactory = this.getDefaultNetworkBridgeFilterFactory();
                DtoDefaultNetworkBridgeFilterFactory rhsDefaultNetworkBridgeFilterFactory;
                rhsDefaultNetworkBridgeFilterFactory = that.getDefaultNetworkBridgeFilterFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultNetworkBridgeFilterFactory", lhsDefaultNetworkBridgeFilterFactory), LocatorUtils.property(thatLocator, "defaultNetworkBridgeFilterFactory", rhsDefaultNetworkBridgeFilterFactory), lhsDefaultNetworkBridgeFilterFactory, rhsDefaultNetworkBridgeFilterFactory)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}fileDurableSubscriberCursor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}storeDurableSubscriberCursor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}vmDurableCursor"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileDurableSubscriberCursor",
        "storeDurableSubscriberCursor",
        "vmDurableCursor",
        "any"
    })
    public static class PendingDurableSubscriberPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoFileDurableSubscriberCursor fileDurableSubscriberCursor;
        protected DtoStoreDurableSubscriberCursor storeDurableSubscriberCursor;
        protected DtoVmDurableCursor vmDurableCursor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取fileDurableSubscriberCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFileDurableSubscriberCursor }
         *     
         */
        public DtoFileDurableSubscriberCursor getFileDurableSubscriberCursor() {
            return fileDurableSubscriberCursor;
        }

        /**
         * 设置fileDurableSubscriberCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFileDurableSubscriberCursor }
         *     
         */
        public void setFileDurableSubscriberCursor(DtoFileDurableSubscriberCursor value) {
            this.fileDurableSubscriberCursor = value;
        }

        /**
         * 获取storeDurableSubscriberCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStoreDurableSubscriberCursor }
         *     
         */
        public DtoStoreDurableSubscriberCursor getStoreDurableSubscriberCursor() {
            return storeDurableSubscriberCursor;
        }

        /**
         * 设置storeDurableSubscriberCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStoreDurableSubscriberCursor }
         *     
         */
        public void setStoreDurableSubscriberCursor(DtoStoreDurableSubscriberCursor value) {
            this.storeDurableSubscriberCursor = value;
        }

        /**
         * 获取vmDurableCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoVmDurableCursor }
         *     
         */
        public DtoVmDurableCursor getVmDurableCursor() {
            return vmDurableCursor;
        }

        /**
         * 设置vmDurableCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoVmDurableCursor }
         *     
         */
        public void setVmDurableCursor(DtoVmDurableCursor value) {
            this.vmDurableCursor = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoFileDurableSubscriberCursor theFileDurableSubscriberCursor;
                theFileDurableSubscriberCursor = this.getFileDurableSubscriberCursor();
                strategy.appendField(locator, this, "fileDurableSubscriberCursor", buffer, theFileDurableSubscriberCursor);
            }
            {
                DtoStoreDurableSubscriberCursor theStoreDurableSubscriberCursor;
                theStoreDurableSubscriberCursor = this.getStoreDurableSubscriberCursor();
                strategy.appendField(locator, this, "storeDurableSubscriberCursor", buffer, theStoreDurableSubscriberCursor);
            }
            {
                DtoVmDurableCursor theVmDurableCursor;
                theVmDurableCursor = this.getVmDurableCursor();
                strategy.appendField(locator, this, "vmDurableCursor", buffer, theVmDurableCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoFileDurableSubscriberCursor theFileDurableSubscriberCursor;
                theFileDurableSubscriberCursor = this.getFileDurableSubscriberCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileDurableSubscriberCursor", theFileDurableSubscriberCursor), currentHashCode, theFileDurableSubscriberCursor);
            }
            {
                DtoStoreDurableSubscriberCursor theStoreDurableSubscriberCursor;
                theStoreDurableSubscriberCursor = this.getStoreDurableSubscriberCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeDurableSubscriberCursor", theStoreDurableSubscriberCursor), currentHashCode, theStoreDurableSubscriberCursor);
            }
            {
                DtoVmDurableCursor theVmDurableCursor;
                theVmDurableCursor = this.getVmDurableCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vmDurableCursor", theVmDurableCursor), currentHashCode, theVmDurableCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.PendingDurableSubscriberPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.PendingDurableSubscriberPolicy that = ((DtoPolicyEntry.PendingDurableSubscriberPolicy) object);
            {
                DtoFileDurableSubscriberCursor lhsFileDurableSubscriberCursor;
                lhsFileDurableSubscriberCursor = this.getFileDurableSubscriberCursor();
                DtoFileDurableSubscriberCursor rhsFileDurableSubscriberCursor;
                rhsFileDurableSubscriberCursor = that.getFileDurableSubscriberCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fileDurableSubscriberCursor", lhsFileDurableSubscriberCursor), LocatorUtils.property(thatLocator, "fileDurableSubscriberCursor", rhsFileDurableSubscriberCursor), lhsFileDurableSubscriberCursor, rhsFileDurableSubscriberCursor)) {
                    return false;
                }
            }
            {
                DtoStoreDurableSubscriberCursor lhsStoreDurableSubscriberCursor;
                lhsStoreDurableSubscriberCursor = this.getStoreDurableSubscriberCursor();
                DtoStoreDurableSubscriberCursor rhsStoreDurableSubscriberCursor;
                rhsStoreDurableSubscriberCursor = that.getStoreDurableSubscriberCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "storeDurableSubscriberCursor", lhsStoreDurableSubscriberCursor), LocatorUtils.property(thatLocator, "storeDurableSubscriberCursor", rhsStoreDurableSubscriberCursor), lhsStoreDurableSubscriberCursor, rhsStoreDurableSubscriberCursor)) {
                    return false;
                }
            }
            {
                DtoVmDurableCursor lhsVmDurableCursor;
                lhsVmDurableCursor = this.getVmDurableCursor();
                DtoVmDurableCursor rhsVmDurableCursor;
                rhsVmDurableCursor = that.getVmDurableCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vmDurableCursor", lhsVmDurableCursor), LocatorUtils.property(thatLocator, "vmDurableCursor", rhsVmDurableCursor), lhsVmDurableCursor, rhsVmDurableCursor)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}constantPendingMessageLimitStrategy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}prefetchRatePendingMessageLimitStrategy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "constantPendingMessageLimitStrategy",
        "prefetchRatePendingMessageLimitStrategy",
        "any"
    })
    public static class PendingMessageLimitStrategy
        implements Equals, HashCode, ToString
    {

        protected DtoConstantPendingMessageLimitStrategy constantPendingMessageLimitStrategy;
        protected DtoPrefetchRatePendingMessageLimitStrategy prefetchRatePendingMessageLimitStrategy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取constantPendingMessageLimitStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoConstantPendingMessageLimitStrategy }
         *     
         */
        public DtoConstantPendingMessageLimitStrategy getConstantPendingMessageLimitStrategy() {
            return constantPendingMessageLimitStrategy;
        }

        /**
         * 设置constantPendingMessageLimitStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoConstantPendingMessageLimitStrategy }
         *     
         */
        public void setConstantPendingMessageLimitStrategy(DtoConstantPendingMessageLimitStrategy value) {
            this.constantPendingMessageLimitStrategy = value;
        }

        /**
         * 获取prefetchRatePendingMessageLimitStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPrefetchRatePendingMessageLimitStrategy }
         *     
         */
        public DtoPrefetchRatePendingMessageLimitStrategy getPrefetchRatePendingMessageLimitStrategy() {
            return prefetchRatePendingMessageLimitStrategy;
        }

        /**
         * 设置prefetchRatePendingMessageLimitStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPrefetchRatePendingMessageLimitStrategy }
         *     
         */
        public void setPrefetchRatePendingMessageLimitStrategy(DtoPrefetchRatePendingMessageLimitStrategy value) {
            this.prefetchRatePendingMessageLimitStrategy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoConstantPendingMessageLimitStrategy theConstantPendingMessageLimitStrategy;
                theConstantPendingMessageLimitStrategy = this.getConstantPendingMessageLimitStrategy();
                strategy.appendField(locator, this, "constantPendingMessageLimitStrategy", buffer, theConstantPendingMessageLimitStrategy);
            }
            {
                DtoPrefetchRatePendingMessageLimitStrategy thePrefetchRatePendingMessageLimitStrategy;
                thePrefetchRatePendingMessageLimitStrategy = this.getPrefetchRatePendingMessageLimitStrategy();
                strategy.appendField(locator, this, "prefetchRatePendingMessageLimitStrategy", buffer, thePrefetchRatePendingMessageLimitStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoConstantPendingMessageLimitStrategy theConstantPendingMessageLimitStrategy;
                theConstantPendingMessageLimitStrategy = this.getConstantPendingMessageLimitStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constantPendingMessageLimitStrategy", theConstantPendingMessageLimitStrategy), currentHashCode, theConstantPendingMessageLimitStrategy);
            }
            {
                DtoPrefetchRatePendingMessageLimitStrategy thePrefetchRatePendingMessageLimitStrategy;
                thePrefetchRatePendingMessageLimitStrategy = this.getPrefetchRatePendingMessageLimitStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchRatePendingMessageLimitStrategy", thePrefetchRatePendingMessageLimitStrategy), currentHashCode, thePrefetchRatePendingMessageLimitStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.PendingMessageLimitStrategy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.PendingMessageLimitStrategy that = ((DtoPolicyEntry.PendingMessageLimitStrategy) object);
            {
                DtoConstantPendingMessageLimitStrategy lhsConstantPendingMessageLimitStrategy;
                lhsConstantPendingMessageLimitStrategy = this.getConstantPendingMessageLimitStrategy();
                DtoConstantPendingMessageLimitStrategy rhsConstantPendingMessageLimitStrategy;
                rhsConstantPendingMessageLimitStrategy = that.getConstantPendingMessageLimitStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "constantPendingMessageLimitStrategy", lhsConstantPendingMessageLimitStrategy), LocatorUtils.property(thatLocator, "constantPendingMessageLimitStrategy", rhsConstantPendingMessageLimitStrategy), lhsConstantPendingMessageLimitStrategy, rhsConstantPendingMessageLimitStrategy)) {
                    return false;
                }
            }
            {
                DtoPrefetchRatePendingMessageLimitStrategy lhsPrefetchRatePendingMessageLimitStrategy;
                lhsPrefetchRatePendingMessageLimitStrategy = this.getPrefetchRatePendingMessageLimitStrategy();
                DtoPrefetchRatePendingMessageLimitStrategy rhsPrefetchRatePendingMessageLimitStrategy;
                rhsPrefetchRatePendingMessageLimitStrategy = that.getPrefetchRatePendingMessageLimitStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchRatePendingMessageLimitStrategy", lhsPrefetchRatePendingMessageLimitStrategy), LocatorUtils.property(thatLocator, "prefetchRatePendingMessageLimitStrategy", rhsPrefetchRatePendingMessageLimitStrategy), lhsPrefetchRatePendingMessageLimitStrategy, rhsPrefetchRatePendingMessageLimitStrategy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}fileQueueCursor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}storeCursor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}vmQueueCursor"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileQueueCursor",
        "storeCursor",
        "vmQueueCursor",
        "any"
    })
    public static class PendingQueuePolicy
        implements Equals, HashCode, ToString
    {

        protected DtoFileQueueCursor fileQueueCursor;
        protected DtoStoreCursor storeCursor;
        protected DtoVmQueueCursor vmQueueCursor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取fileQueueCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFileQueueCursor }
         *     
         */
        public DtoFileQueueCursor getFileQueueCursor() {
            return fileQueueCursor;
        }

        /**
         * 设置fileQueueCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFileQueueCursor }
         *     
         */
        public void setFileQueueCursor(DtoFileQueueCursor value) {
            this.fileQueueCursor = value;
        }

        /**
         * 获取storeCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStoreCursor }
         *     
         */
        public DtoStoreCursor getStoreCursor() {
            return storeCursor;
        }

        /**
         * 设置storeCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStoreCursor }
         *     
         */
        public void setStoreCursor(DtoStoreCursor value) {
            this.storeCursor = value;
        }

        /**
         * 获取vmQueueCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoVmQueueCursor }
         *     
         */
        public DtoVmQueueCursor getVmQueueCursor() {
            return vmQueueCursor;
        }

        /**
         * 设置vmQueueCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoVmQueueCursor }
         *     
         */
        public void setVmQueueCursor(DtoVmQueueCursor value) {
            this.vmQueueCursor = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoFileQueueCursor theFileQueueCursor;
                theFileQueueCursor = this.getFileQueueCursor();
                strategy.appendField(locator, this, "fileQueueCursor", buffer, theFileQueueCursor);
            }
            {
                DtoStoreCursor theStoreCursor;
                theStoreCursor = this.getStoreCursor();
                strategy.appendField(locator, this, "storeCursor", buffer, theStoreCursor);
            }
            {
                DtoVmQueueCursor theVmQueueCursor;
                theVmQueueCursor = this.getVmQueueCursor();
                strategy.appendField(locator, this, "vmQueueCursor", buffer, theVmQueueCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoFileQueueCursor theFileQueueCursor;
                theFileQueueCursor = this.getFileQueueCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileQueueCursor", theFileQueueCursor), currentHashCode, theFileQueueCursor);
            }
            {
                DtoStoreCursor theStoreCursor;
                theStoreCursor = this.getStoreCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeCursor", theStoreCursor), currentHashCode, theStoreCursor);
            }
            {
                DtoVmQueueCursor theVmQueueCursor;
                theVmQueueCursor = this.getVmQueueCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vmQueueCursor", theVmQueueCursor), currentHashCode, theVmQueueCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.PendingQueuePolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.PendingQueuePolicy that = ((DtoPolicyEntry.PendingQueuePolicy) object);
            {
                DtoFileQueueCursor lhsFileQueueCursor;
                lhsFileQueueCursor = this.getFileQueueCursor();
                DtoFileQueueCursor rhsFileQueueCursor;
                rhsFileQueueCursor = that.getFileQueueCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fileQueueCursor", lhsFileQueueCursor), LocatorUtils.property(thatLocator, "fileQueueCursor", rhsFileQueueCursor), lhsFileQueueCursor, rhsFileQueueCursor)) {
                    return false;
                }
            }
            {
                DtoStoreCursor lhsStoreCursor;
                lhsStoreCursor = this.getStoreCursor();
                DtoStoreCursor rhsStoreCursor;
                rhsStoreCursor = that.getStoreCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "storeCursor", lhsStoreCursor), LocatorUtils.property(thatLocator, "storeCursor", rhsStoreCursor), lhsStoreCursor, rhsStoreCursor)) {
                    return false;
                }
            }
            {
                DtoVmQueueCursor lhsVmQueueCursor;
                lhsVmQueueCursor = this.getVmQueueCursor();
                DtoVmQueueCursor rhsVmQueueCursor;
                rhsVmQueueCursor = that.getVmQueueCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vmQueueCursor", lhsVmQueueCursor), LocatorUtils.property(thatLocator, "vmQueueCursor", rhsVmQueueCursor), lhsVmQueueCursor, rhsVmQueueCursor)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}fileCursor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}vmCursor"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileCursor",
        "vmCursor",
        "any"
    })
    public static class PendingSubscriberPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoFileCursor fileCursor;
        protected DtoVmCursor vmCursor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取fileCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFileCursor }
         *     
         */
        public DtoFileCursor getFileCursor() {
            return fileCursor;
        }

        /**
         * 设置fileCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFileCursor }
         *     
         */
        public void setFileCursor(DtoFileCursor value) {
            this.fileCursor = value;
        }

        /**
         * 获取vmCursor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoVmCursor }
         *     
         */
        public DtoVmCursor getVmCursor() {
            return vmCursor;
        }

        /**
         * 设置vmCursor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoVmCursor }
         *     
         */
        public void setVmCursor(DtoVmCursor value) {
            this.vmCursor = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoFileCursor theFileCursor;
                theFileCursor = this.getFileCursor();
                strategy.appendField(locator, this, "fileCursor", buffer, theFileCursor);
            }
            {
                DtoVmCursor theVmCursor;
                theVmCursor = this.getVmCursor();
                strategy.appendField(locator, this, "vmCursor", buffer, theVmCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoFileCursor theFileCursor;
                theFileCursor = this.getFileCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileCursor", theFileCursor), currentHashCode, theFileCursor);
            }
            {
                DtoVmCursor theVmCursor;
                theVmCursor = this.getVmCursor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vmCursor", theVmCursor), currentHashCode, theVmCursor);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.PendingSubscriberPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.PendingSubscriberPolicy that = ((DtoPolicyEntry.PendingSubscriberPolicy) object);
            {
                DtoFileCursor lhsFileCursor;
                lhsFileCursor = this.getFileCursor();
                DtoFileCursor rhsFileCursor;
                rhsFileCursor = that.getFileCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fileCursor", lhsFileCursor), LocatorUtils.property(thatLocator, "fileCursor", rhsFileCursor), lhsFileCursor, rhsFileCursor)) {
                    return false;
                }
            }
            {
                DtoVmCursor lhsVmCursor;
                lhsVmCursor = this.getVmCursor();
                DtoVmCursor rhsVmCursor;
                rhsVmCursor = that.getVmCursor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vmCursor", lhsVmCursor), LocatorUtils.property(thatLocator, "vmCursor", rhsVmCursor), lhsVmCursor, rhsVmCursor)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}abortSlowAckConsumerStrategy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}abortSlowConsumerStrategy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abortSlowAckConsumerStrategy",
        "abortSlowConsumerStrategy",
        "any"
    })
    public static class SlowConsumerStrategy
        implements Equals, HashCode, ToString
    {

        protected DtoAbortSlowAckConsumerStrategy abortSlowAckConsumerStrategy;
        protected DtoAbortSlowConsumerStrategy abortSlowConsumerStrategy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取abortSlowAckConsumerStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAbortSlowAckConsumerStrategy }
         *     
         */
        public DtoAbortSlowAckConsumerStrategy getAbortSlowAckConsumerStrategy() {
            return abortSlowAckConsumerStrategy;
        }

        /**
         * 设置abortSlowAckConsumerStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAbortSlowAckConsumerStrategy }
         *     
         */
        public void setAbortSlowAckConsumerStrategy(DtoAbortSlowAckConsumerStrategy value) {
            this.abortSlowAckConsumerStrategy = value;
        }

        /**
         * 获取abortSlowConsumerStrategy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAbortSlowConsumerStrategy }
         *     
         */
        public DtoAbortSlowConsumerStrategy getAbortSlowConsumerStrategy() {
            return abortSlowConsumerStrategy;
        }

        /**
         * 设置abortSlowConsumerStrategy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAbortSlowConsumerStrategy }
         *     
         */
        public void setAbortSlowConsumerStrategy(DtoAbortSlowConsumerStrategy value) {
            this.abortSlowConsumerStrategy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoAbortSlowAckConsumerStrategy theAbortSlowAckConsumerStrategy;
                theAbortSlowAckConsumerStrategy = this.getAbortSlowAckConsumerStrategy();
                strategy.appendField(locator, this, "abortSlowAckConsumerStrategy", buffer, theAbortSlowAckConsumerStrategy);
            }
            {
                DtoAbortSlowConsumerStrategy theAbortSlowConsumerStrategy;
                theAbortSlowConsumerStrategy = this.getAbortSlowConsumerStrategy();
                strategy.appendField(locator, this, "abortSlowConsumerStrategy", buffer, theAbortSlowConsumerStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoAbortSlowAckConsumerStrategy theAbortSlowAckConsumerStrategy;
                theAbortSlowAckConsumerStrategy = this.getAbortSlowAckConsumerStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abortSlowAckConsumerStrategy", theAbortSlowAckConsumerStrategy), currentHashCode, theAbortSlowAckConsumerStrategy);
            }
            {
                DtoAbortSlowConsumerStrategy theAbortSlowConsumerStrategy;
                theAbortSlowConsumerStrategy = this.getAbortSlowConsumerStrategy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abortSlowConsumerStrategy", theAbortSlowConsumerStrategy), currentHashCode, theAbortSlowConsumerStrategy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.SlowConsumerStrategy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.SlowConsumerStrategy that = ((DtoPolicyEntry.SlowConsumerStrategy) object);
            {
                DtoAbortSlowAckConsumerStrategy lhsAbortSlowAckConsumerStrategy;
                lhsAbortSlowAckConsumerStrategy = this.getAbortSlowAckConsumerStrategy();
                DtoAbortSlowAckConsumerStrategy rhsAbortSlowAckConsumerStrategy;
                rhsAbortSlowAckConsumerStrategy = that.getAbortSlowAckConsumerStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "abortSlowAckConsumerStrategy", lhsAbortSlowAckConsumerStrategy), LocatorUtils.property(thatLocator, "abortSlowAckConsumerStrategy", rhsAbortSlowAckConsumerStrategy), lhsAbortSlowAckConsumerStrategy, rhsAbortSlowAckConsumerStrategy)) {
                    return false;
                }
            }
            {
                DtoAbortSlowConsumerStrategy lhsAbortSlowConsumerStrategy;
                lhsAbortSlowConsumerStrategy = this.getAbortSlowConsumerStrategy();
                DtoAbortSlowConsumerStrategy rhsAbortSlowConsumerStrategy;
                rhsAbortSlowConsumerStrategy = that.getAbortSlowConsumerStrategy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "abortSlowConsumerStrategy", lhsAbortSlowConsumerStrategy), LocatorUtils.property(thatLocator, "abortSlowConsumerStrategy", rhsAbortSlowConsumerStrategy), lhsAbortSlowConsumerStrategy, rhsAbortSlowConsumerStrategy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}fixedCountSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}fixedSizedSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lastImageSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}noSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queryBasedSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}retainedMessageSubscriptionRecoveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}timedSubscriptionRecoveryPolicy"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fixedCountSubscriptionRecoveryPolicy",
        "fixedSizedSubscriptionRecoveryPolicy",
        "lastImageSubscriptionRecoveryPolicy",
        "noSubscriptionRecoveryPolicy",
        "queryBasedSubscriptionRecoveryPolicy",
        "retainedMessageSubscriptionRecoveryPolicy",
        "timedSubscriptionRecoveryPolicy",
        "any"
    })
    public static class SubscriptionRecoveryPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoFixedCountSubscriptionRecoveryPolicy fixedCountSubscriptionRecoveryPolicy;
        protected DtoFixedSizedSubscriptionRecoveryPolicy fixedSizedSubscriptionRecoveryPolicy;
        protected DtoLastImageSubscriptionRecoveryPolicy lastImageSubscriptionRecoveryPolicy;
        protected DtoNoSubscriptionRecoveryPolicy noSubscriptionRecoveryPolicy;
        protected DtoQueryBasedSubscriptionRecoveryPolicy queryBasedSubscriptionRecoveryPolicy;
        protected DtoRetainedMessageSubscriptionRecoveryPolicy retainedMessageSubscriptionRecoveryPolicy;
        protected DtoTimedSubscriptionRecoveryPolicy timedSubscriptionRecoveryPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取fixedCountSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFixedCountSubscriptionRecoveryPolicy }
         *     
         */
        public DtoFixedCountSubscriptionRecoveryPolicy getFixedCountSubscriptionRecoveryPolicy() {
            return fixedCountSubscriptionRecoveryPolicy;
        }

        /**
         * 设置fixedCountSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFixedCountSubscriptionRecoveryPolicy }
         *     
         */
        public void setFixedCountSubscriptionRecoveryPolicy(DtoFixedCountSubscriptionRecoveryPolicy value) {
            this.fixedCountSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取fixedSizedSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFixedSizedSubscriptionRecoveryPolicy }
         *     
         */
        public DtoFixedSizedSubscriptionRecoveryPolicy getFixedSizedSubscriptionRecoveryPolicy() {
            return fixedSizedSubscriptionRecoveryPolicy;
        }

        /**
         * 设置fixedSizedSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFixedSizedSubscriptionRecoveryPolicy }
         *     
         */
        public void setFixedSizedSubscriptionRecoveryPolicy(DtoFixedSizedSubscriptionRecoveryPolicy value) {
            this.fixedSizedSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取lastImageSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLastImageSubscriptionRecoveryPolicy }
         *     
         */
        public DtoLastImageSubscriptionRecoveryPolicy getLastImageSubscriptionRecoveryPolicy() {
            return lastImageSubscriptionRecoveryPolicy;
        }

        /**
         * 设置lastImageSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLastImageSubscriptionRecoveryPolicy }
         *     
         */
        public void setLastImageSubscriptionRecoveryPolicy(DtoLastImageSubscriptionRecoveryPolicy value) {
            this.lastImageSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取noSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoNoSubscriptionRecoveryPolicy }
         *     
         */
        public DtoNoSubscriptionRecoveryPolicy getNoSubscriptionRecoveryPolicy() {
            return noSubscriptionRecoveryPolicy;
        }

        /**
         * 设置noSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoNoSubscriptionRecoveryPolicy }
         *     
         */
        public void setNoSubscriptionRecoveryPolicy(DtoNoSubscriptionRecoveryPolicy value) {
            this.noSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取queryBasedSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoQueryBasedSubscriptionRecoveryPolicy }
         *     
         */
        public DtoQueryBasedSubscriptionRecoveryPolicy getQueryBasedSubscriptionRecoveryPolicy() {
            return queryBasedSubscriptionRecoveryPolicy;
        }

        /**
         * 设置queryBasedSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoQueryBasedSubscriptionRecoveryPolicy }
         *     
         */
        public void setQueryBasedSubscriptionRecoveryPolicy(DtoQueryBasedSubscriptionRecoveryPolicy value) {
            this.queryBasedSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取retainedMessageSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRetainedMessageSubscriptionRecoveryPolicy }
         *     
         */
        public DtoRetainedMessageSubscriptionRecoveryPolicy getRetainedMessageSubscriptionRecoveryPolicy() {
            return retainedMessageSubscriptionRecoveryPolicy;
        }

        /**
         * 设置retainedMessageSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRetainedMessageSubscriptionRecoveryPolicy }
         *     
         */
        public void setRetainedMessageSubscriptionRecoveryPolicy(DtoRetainedMessageSubscriptionRecoveryPolicy value) {
            this.retainedMessageSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取timedSubscriptionRecoveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTimedSubscriptionRecoveryPolicy }
         *     
         */
        public DtoTimedSubscriptionRecoveryPolicy getTimedSubscriptionRecoveryPolicy() {
            return timedSubscriptionRecoveryPolicy;
        }

        /**
         * 设置timedSubscriptionRecoveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTimedSubscriptionRecoveryPolicy }
         *     
         */
        public void setTimedSubscriptionRecoveryPolicy(DtoTimedSubscriptionRecoveryPolicy value) {
            this.timedSubscriptionRecoveryPolicy = value;
        }

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoFixedCountSubscriptionRecoveryPolicy theFixedCountSubscriptionRecoveryPolicy;
                theFixedCountSubscriptionRecoveryPolicy = this.getFixedCountSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "fixedCountSubscriptionRecoveryPolicy", buffer, theFixedCountSubscriptionRecoveryPolicy);
            }
            {
                DtoFixedSizedSubscriptionRecoveryPolicy theFixedSizedSubscriptionRecoveryPolicy;
                theFixedSizedSubscriptionRecoveryPolicy = this.getFixedSizedSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "fixedSizedSubscriptionRecoveryPolicy", buffer, theFixedSizedSubscriptionRecoveryPolicy);
            }
            {
                DtoLastImageSubscriptionRecoveryPolicy theLastImageSubscriptionRecoveryPolicy;
                theLastImageSubscriptionRecoveryPolicy = this.getLastImageSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "lastImageSubscriptionRecoveryPolicy", buffer, theLastImageSubscriptionRecoveryPolicy);
            }
            {
                DtoNoSubscriptionRecoveryPolicy theNoSubscriptionRecoveryPolicy;
                theNoSubscriptionRecoveryPolicy = this.getNoSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "noSubscriptionRecoveryPolicy", buffer, theNoSubscriptionRecoveryPolicy);
            }
            {
                DtoQueryBasedSubscriptionRecoveryPolicy theQueryBasedSubscriptionRecoveryPolicy;
                theQueryBasedSubscriptionRecoveryPolicy = this.getQueryBasedSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "queryBasedSubscriptionRecoveryPolicy", buffer, theQueryBasedSubscriptionRecoveryPolicy);
            }
            {
                DtoRetainedMessageSubscriptionRecoveryPolicy theRetainedMessageSubscriptionRecoveryPolicy;
                theRetainedMessageSubscriptionRecoveryPolicy = this.getRetainedMessageSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "retainedMessageSubscriptionRecoveryPolicy", buffer, theRetainedMessageSubscriptionRecoveryPolicy);
            }
            {
                DtoTimedSubscriptionRecoveryPolicy theTimedSubscriptionRecoveryPolicy;
                theTimedSubscriptionRecoveryPolicy = this.getTimedSubscriptionRecoveryPolicy();
                strategy.appendField(locator, this, "timedSubscriptionRecoveryPolicy", buffer, theTimedSubscriptionRecoveryPolicy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoFixedCountSubscriptionRecoveryPolicy theFixedCountSubscriptionRecoveryPolicy;
                theFixedCountSubscriptionRecoveryPolicy = this.getFixedCountSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixedCountSubscriptionRecoveryPolicy", theFixedCountSubscriptionRecoveryPolicy), currentHashCode, theFixedCountSubscriptionRecoveryPolicy);
            }
            {
                DtoFixedSizedSubscriptionRecoveryPolicy theFixedSizedSubscriptionRecoveryPolicy;
                theFixedSizedSubscriptionRecoveryPolicy = this.getFixedSizedSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixedSizedSubscriptionRecoveryPolicy", theFixedSizedSubscriptionRecoveryPolicy), currentHashCode, theFixedSizedSubscriptionRecoveryPolicy);
            }
            {
                DtoLastImageSubscriptionRecoveryPolicy theLastImageSubscriptionRecoveryPolicy;
                theLastImageSubscriptionRecoveryPolicy = this.getLastImageSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastImageSubscriptionRecoveryPolicy", theLastImageSubscriptionRecoveryPolicy), currentHashCode, theLastImageSubscriptionRecoveryPolicy);
            }
            {
                DtoNoSubscriptionRecoveryPolicy theNoSubscriptionRecoveryPolicy;
                theNoSubscriptionRecoveryPolicy = this.getNoSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noSubscriptionRecoveryPolicy", theNoSubscriptionRecoveryPolicy), currentHashCode, theNoSubscriptionRecoveryPolicy);
            }
            {
                DtoQueryBasedSubscriptionRecoveryPolicy theQueryBasedSubscriptionRecoveryPolicy;
                theQueryBasedSubscriptionRecoveryPolicy = this.getQueryBasedSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryBasedSubscriptionRecoveryPolicy", theQueryBasedSubscriptionRecoveryPolicy), currentHashCode, theQueryBasedSubscriptionRecoveryPolicy);
            }
            {
                DtoRetainedMessageSubscriptionRecoveryPolicy theRetainedMessageSubscriptionRecoveryPolicy;
                theRetainedMessageSubscriptionRecoveryPolicy = this.getRetainedMessageSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retainedMessageSubscriptionRecoveryPolicy", theRetainedMessageSubscriptionRecoveryPolicy), currentHashCode, theRetainedMessageSubscriptionRecoveryPolicy);
            }
            {
                DtoTimedSubscriptionRecoveryPolicy theTimedSubscriptionRecoveryPolicy;
                theTimedSubscriptionRecoveryPolicy = this.getTimedSubscriptionRecoveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timedSubscriptionRecoveryPolicy", theTimedSubscriptionRecoveryPolicy), currentHashCode, theTimedSubscriptionRecoveryPolicy);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoPolicyEntry.SubscriptionRecoveryPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPolicyEntry.SubscriptionRecoveryPolicy that = ((DtoPolicyEntry.SubscriptionRecoveryPolicy) object);
            {
                DtoFixedCountSubscriptionRecoveryPolicy lhsFixedCountSubscriptionRecoveryPolicy;
                lhsFixedCountSubscriptionRecoveryPolicy = this.getFixedCountSubscriptionRecoveryPolicy();
                DtoFixedCountSubscriptionRecoveryPolicy rhsFixedCountSubscriptionRecoveryPolicy;
                rhsFixedCountSubscriptionRecoveryPolicy = that.getFixedCountSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fixedCountSubscriptionRecoveryPolicy", lhsFixedCountSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "fixedCountSubscriptionRecoveryPolicy", rhsFixedCountSubscriptionRecoveryPolicy), lhsFixedCountSubscriptionRecoveryPolicy, rhsFixedCountSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoFixedSizedSubscriptionRecoveryPolicy lhsFixedSizedSubscriptionRecoveryPolicy;
                lhsFixedSizedSubscriptionRecoveryPolicy = this.getFixedSizedSubscriptionRecoveryPolicy();
                DtoFixedSizedSubscriptionRecoveryPolicy rhsFixedSizedSubscriptionRecoveryPolicy;
                rhsFixedSizedSubscriptionRecoveryPolicy = that.getFixedSizedSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fixedSizedSubscriptionRecoveryPolicy", lhsFixedSizedSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "fixedSizedSubscriptionRecoveryPolicy", rhsFixedSizedSubscriptionRecoveryPolicy), lhsFixedSizedSubscriptionRecoveryPolicy, rhsFixedSizedSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoLastImageSubscriptionRecoveryPolicy lhsLastImageSubscriptionRecoveryPolicy;
                lhsLastImageSubscriptionRecoveryPolicy = this.getLastImageSubscriptionRecoveryPolicy();
                DtoLastImageSubscriptionRecoveryPolicy rhsLastImageSubscriptionRecoveryPolicy;
                rhsLastImageSubscriptionRecoveryPolicy = that.getLastImageSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "lastImageSubscriptionRecoveryPolicy", lhsLastImageSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "lastImageSubscriptionRecoveryPolicy", rhsLastImageSubscriptionRecoveryPolicy), lhsLastImageSubscriptionRecoveryPolicy, rhsLastImageSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoNoSubscriptionRecoveryPolicy lhsNoSubscriptionRecoveryPolicy;
                lhsNoSubscriptionRecoveryPolicy = this.getNoSubscriptionRecoveryPolicy();
                DtoNoSubscriptionRecoveryPolicy rhsNoSubscriptionRecoveryPolicy;
                rhsNoSubscriptionRecoveryPolicy = that.getNoSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "noSubscriptionRecoveryPolicy", lhsNoSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "noSubscriptionRecoveryPolicy", rhsNoSubscriptionRecoveryPolicy), lhsNoSubscriptionRecoveryPolicy, rhsNoSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoQueryBasedSubscriptionRecoveryPolicy lhsQueryBasedSubscriptionRecoveryPolicy;
                lhsQueryBasedSubscriptionRecoveryPolicy = this.getQueryBasedSubscriptionRecoveryPolicy();
                DtoQueryBasedSubscriptionRecoveryPolicy rhsQueryBasedSubscriptionRecoveryPolicy;
                rhsQueryBasedSubscriptionRecoveryPolicy = that.getQueryBasedSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queryBasedSubscriptionRecoveryPolicy", lhsQueryBasedSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "queryBasedSubscriptionRecoveryPolicy", rhsQueryBasedSubscriptionRecoveryPolicy), lhsQueryBasedSubscriptionRecoveryPolicy, rhsQueryBasedSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoRetainedMessageSubscriptionRecoveryPolicy lhsRetainedMessageSubscriptionRecoveryPolicy;
                lhsRetainedMessageSubscriptionRecoveryPolicy = this.getRetainedMessageSubscriptionRecoveryPolicy();
                DtoRetainedMessageSubscriptionRecoveryPolicy rhsRetainedMessageSubscriptionRecoveryPolicy;
                rhsRetainedMessageSubscriptionRecoveryPolicy = that.getRetainedMessageSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "retainedMessageSubscriptionRecoveryPolicy", lhsRetainedMessageSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "retainedMessageSubscriptionRecoveryPolicy", rhsRetainedMessageSubscriptionRecoveryPolicy), lhsRetainedMessageSubscriptionRecoveryPolicy, rhsRetainedMessageSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                DtoTimedSubscriptionRecoveryPolicy lhsTimedSubscriptionRecoveryPolicy;
                lhsTimedSubscriptionRecoveryPolicy = this.getTimedSubscriptionRecoveryPolicy();
                DtoTimedSubscriptionRecoveryPolicy rhsTimedSubscriptionRecoveryPolicy;
                rhsTimedSubscriptionRecoveryPolicy = that.getTimedSubscriptionRecoveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "timedSubscriptionRecoveryPolicy", lhsTimedSubscriptionRecoveryPolicy), LocatorUtils.property(thatLocator, "timedSubscriptionRecoveryPolicy", rhsTimedSubscriptionRecoveryPolicy), lhsTimedSubscriptionRecoveryPolicy, rhsTimedSubscriptionRecoveryPolicy)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }

}
