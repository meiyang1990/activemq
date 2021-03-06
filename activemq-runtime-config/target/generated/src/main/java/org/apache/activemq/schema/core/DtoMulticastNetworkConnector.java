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
 *           &lt;element name="bridge" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}compositeDemandForwardingBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}demandForwardingBridge"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="brokerService" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="connectionFilter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="durableDestinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dynamicallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="excludedDestinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="localTransport" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="remoteTransport" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="staticallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="advisoryForFailedForward" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="alwaysSyncSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bridge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bridgeTempDestinations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkDuplicateMessagesOnDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="conduitSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="connectionFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerPriorityBase" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="consumerTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="decreaseNetworkConsumerPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="destinationFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dispatchAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="duplex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dynamicOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gcDestinationViews" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gcSweepTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="localTransport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="networkTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefetchSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remoteTransport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remoteURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staticBridge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suppressDuplicateQueueSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suppressDuplicateTopicSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useBrokerNameAsIdSees" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "bridgeOrBrokerServiceOrConnectionFilter"
})
@XmlRootElement(name = "multicastNetworkConnector")
public class DtoMulticastNetworkConnector implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "remoteTransport", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "localTransport", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "durableDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "bridge", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "excludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "connectionFilter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "staticallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "dynamicallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> bridgeOrBrokerServiceOrConnectionFilter;
    @XmlAttribute(name = "advisoryForFailedForward")
    protected Boolean advisoryForFailedForward;
    @XmlAttribute(name = "alwaysSyncSend")
    protected Boolean alwaysSyncSend;
    @XmlAttribute(name = "bridge")
    protected String bridge;
    @XmlAttribute(name = "bridgeTempDestinations")
    protected Boolean bridgeTempDestinations;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "brokerURL")
    protected String brokerURL;
    @XmlAttribute(name = "checkDuplicateMessagesOnDuplex")
    protected Boolean checkDuplicateMessagesOnDuplex;
    @XmlAttribute(name = "conduitSubscriptions")
    protected Boolean conduitSubscriptions;
    @XmlAttribute(name = "connectionFilter")
    protected String connectionFilter;
    @XmlAttribute(name = "consumerPriorityBase")
    protected BigInteger consumerPriorityBase;
    @XmlAttribute(name = "consumerTTL")
    protected BigInteger consumerTTL;
    @XmlAttribute(name = "decreaseNetworkConsumerPriority")
    protected Boolean decreaseNetworkConsumerPriority;
    @XmlAttribute(name = "destinationFilter")
    protected String destinationFilter;
    @XmlAttribute(name = "dispatchAsync")
    protected Boolean dispatchAsync;
    @XmlAttribute(name = "duplex")
    protected Boolean duplex;
    @XmlAttribute(name = "dynamicOnly")
    protected Boolean dynamicOnly;
    @XmlAttribute(name = "gcDestinationViews")
    protected Boolean gcDestinationViews;
    @XmlAttribute(name = "gcSweepTime")
    protected Long gcSweepTime;
    @XmlAttribute(name = "localTransport")
    protected String localTransport;
    @XmlAttribute(name = "localUri")
    protected String localUri;
    @XmlAttribute(name = "messageTTL")
    protected BigInteger messageTTL;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "networkTTL")
    protected BigInteger networkTTL;
    @XmlAttribute(name = "objectName")
    protected String objectName;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "prefetchSize")
    protected String prefetchSize;
    @XmlAttribute(name = "remoteTransport")
    protected String remoteTransport;
    @XmlAttribute(name = "remoteURI")
    protected String remoteURI;
    @XmlAttribute(name = "staticBridge")
    protected Boolean staticBridge;
    @XmlAttribute(name = "suppressDuplicateQueueSubscriptions")
    protected Boolean suppressDuplicateQueueSubscriptions;
    @XmlAttribute(name = "suppressDuplicateTopicSubscriptions")
    protected Boolean suppressDuplicateTopicSubscriptions;
    @XmlAttribute(name = "useBrokerNameAsIdSees")
    protected Boolean useBrokerNameAsIdSees;
    @XmlAttribute(name = "useCompression")
    protected Boolean useCompression;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the bridgeOrBrokerServiceOrConnectionFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bridgeOrBrokerServiceOrConnectionFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBridgeOrBrokerServiceOrConnectionFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.RemoteTransport }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.DurableDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.LocalTransport }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.Bridge }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.ExcludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.ConnectionFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.StaticallyIncludedDestinations }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.DynamicallyIncludedDestinations }{@code >}
     * 
     * 
     */
    public List<Object> getBridgeOrBrokerServiceOrConnectionFilter() {
        if (bridgeOrBrokerServiceOrConnectionFilter == null) {
            bridgeOrBrokerServiceOrConnectionFilter = new ArrayList<Object>();
        }
        return this.bridgeOrBrokerServiceOrConnectionFilter;
    }

    /**
     * 获取advisoryForFailedForward属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForFailedForward() {
        return advisoryForFailedForward;
    }

    /**
     * 设置advisoryForFailedForward属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForFailedForward(Boolean value) {
        this.advisoryForFailedForward = value;
    }

    /**
     * 获取alwaysSyncSend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysSyncSend() {
        return alwaysSyncSend;
    }

    /**
     * 设置alwaysSyncSend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysSyncSend(Boolean value) {
        this.alwaysSyncSend = value;
    }

    /**
     * 获取bridge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridge() {
        return bridge;
    }

    /**
     * 设置bridge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridge(String value) {
        this.bridge = value;
    }

    /**
     * 获取bridgeTempDestinations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBridgeTempDestinations() {
        return bridgeTempDestinations;
    }

    /**
     * 设置bridgeTempDestinations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBridgeTempDestinations(Boolean value) {
        this.bridgeTempDestinations = value;
    }

    /**
     * 获取brokerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * 设置brokerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    /**
     * 获取brokerService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerService() {
        return brokerService;
    }

    /**
     * 设置brokerService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerService(String value) {
        this.brokerService = value;
    }

    /**
     * 获取brokerURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerURL() {
        return brokerURL;
    }

    /**
     * 设置brokerURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerURL(String value) {
        this.brokerURL = value;
    }

    /**
     * 获取checkDuplicateMessagesOnDuplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckDuplicateMessagesOnDuplex() {
        return checkDuplicateMessagesOnDuplex;
    }

    /**
     * 设置checkDuplicateMessagesOnDuplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckDuplicateMessagesOnDuplex(Boolean value) {
        this.checkDuplicateMessagesOnDuplex = value;
    }

    /**
     * 获取conduitSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConduitSubscriptions() {
        return conduitSubscriptions;
    }

    /**
     * 设置conduitSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConduitSubscriptions(Boolean value) {
        this.conduitSubscriptions = value;
    }

    /**
     * 获取connectionFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFilter() {
        return connectionFilter;
    }

    /**
     * 设置connectionFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFilter(String value) {
        this.connectionFilter = value;
    }

    /**
     * 获取consumerPriorityBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumerPriorityBase() {
        return consumerPriorityBase;
    }

    /**
     * 设置consumerPriorityBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumerPriorityBase(BigInteger value) {
        this.consumerPriorityBase = value;
    }

    /**
     * 获取consumerTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumerTTL() {
        return consumerTTL;
    }

    /**
     * 设置consumerTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumerTTL(BigInteger value) {
        this.consumerTTL = value;
    }

    /**
     * 获取decreaseNetworkConsumerPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecreaseNetworkConsumerPriority() {
        return decreaseNetworkConsumerPriority;
    }

    /**
     * 设置decreaseNetworkConsumerPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecreaseNetworkConsumerPriority(Boolean value) {
        this.decreaseNetworkConsumerPriority = value;
    }

    /**
     * 获取destinationFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFilter() {
        return destinationFilter;
    }

    /**
     * 设置destinationFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFilter(String value) {
        this.destinationFilter = value;
    }

    /**
     * 获取dispatchAsync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatchAsync() {
        return dispatchAsync;
    }

    /**
     * 设置dispatchAsync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatchAsync(Boolean value) {
        this.dispatchAsync = value;
    }

    /**
     * 获取duplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplex() {
        return duplex;
    }

    /**
     * 设置duplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplex(Boolean value) {
        this.duplex = value;
    }

    /**
     * 获取dynamicOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicOnly() {
        return dynamicOnly;
    }

    /**
     * 设置dynamicOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicOnly(Boolean value) {
        this.dynamicOnly = value;
    }

    /**
     * 获取gcDestinationViews属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGcDestinationViews() {
        return gcDestinationViews;
    }

    /**
     * 设置gcDestinationViews属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGcDestinationViews(Boolean value) {
        this.gcDestinationViews = value;
    }

    /**
     * 获取gcSweepTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGcSweepTime() {
        return gcSweepTime;
    }

    /**
     * 设置gcSweepTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGcSweepTime(Long value) {
        this.gcSweepTime = value;
    }

    /**
     * 获取localTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTransport() {
        return localTransport;
    }

    /**
     * 设置localTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTransport(String value) {
        this.localTransport = value;
    }

    /**
     * 获取localUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalUri() {
        return localUri;
    }

    /**
     * 设置localUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalUri(String value) {
        this.localUri = value;
    }

    /**
     * 获取messageTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageTTL() {
        return messageTTL;
    }

    /**
     * 设置messageTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageTTL(BigInteger value) {
        this.messageTTL = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取networkTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetworkTTL() {
        return networkTTL;
    }

    /**
     * 设置networkTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetworkTTL(BigInteger value) {
        this.networkTTL = value;
    }

    /**
     * 获取objectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取prefetchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefetchSize() {
        return prefetchSize;
    }

    /**
     * 设置prefetchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefetchSize(String value) {
        this.prefetchSize = value;
    }

    /**
     * 获取remoteTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTransport() {
        return remoteTransport;
    }

    /**
     * 设置remoteTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTransport(String value) {
        this.remoteTransport = value;
    }

    /**
     * 获取remoteURI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteURI() {
        return remoteURI;
    }

    /**
     * 设置remoteURI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteURI(String value) {
        this.remoteURI = value;
    }

    /**
     * 获取staticBridge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaticBridge() {
        return staticBridge;
    }

    /**
     * 设置staticBridge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaticBridge(Boolean value) {
        this.staticBridge = value;
    }

    /**
     * 获取suppressDuplicateQueueSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressDuplicateQueueSubscriptions() {
        return suppressDuplicateQueueSubscriptions;
    }

    /**
     * 设置suppressDuplicateQueueSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressDuplicateQueueSubscriptions(Boolean value) {
        this.suppressDuplicateQueueSubscriptions = value;
    }

    /**
     * 获取suppressDuplicateTopicSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressDuplicateTopicSubscriptions() {
        return suppressDuplicateTopicSubscriptions;
    }

    /**
     * 设置suppressDuplicateTopicSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressDuplicateTopicSubscriptions(Boolean value) {
        this.suppressDuplicateTopicSubscriptions = value;
    }

    /**
     * 获取useBrokerNameAsIdSees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBrokerNameAsIdSees() {
        return useBrokerNameAsIdSees;
    }

    /**
     * 设置useBrokerNameAsIdSees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBrokerNameAsIdSees(Boolean value) {
        this.useBrokerNameAsIdSees = value;
    }

    /**
     * 获取useCompression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCompression() {
        return useCompression;
    }

    /**
     * 设置useCompression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCompression(Boolean value) {
        this.useCompression = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
            List<Object> theBridgeOrBrokerServiceOrConnectionFilter;
            theBridgeOrBrokerServiceOrConnectionFilter = (((this.bridgeOrBrokerServiceOrConnectionFilter!= null)&&(!this.bridgeOrBrokerServiceOrConnectionFilter.isEmpty()))?this.getBridgeOrBrokerServiceOrConnectionFilter():null);
            strategy.appendField(locator, this, "bridgeOrBrokerServiceOrConnectionFilter", buffer, theBridgeOrBrokerServiceOrConnectionFilter);
        }
        {
            Boolean theAdvisoryForFailedForward;
            theAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            strategy.appendField(locator, this, "advisoryForFailedForward", buffer, theAdvisoryForFailedForward);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            strategy.appendField(locator, this, "alwaysSyncSend", buffer, theAlwaysSyncSend);
        }
        {
            String theBridge;
            theBridge = this.getBridge();
            strategy.appendField(locator, this, "bridge", buffer, theBridge);
        }
        {
            Boolean theBridgeTempDestinations;
            theBridgeTempDestinations = this.isBridgeTempDestinations();
            strategy.appendField(locator, this, "bridgeTempDestinations", buffer, theBridgeTempDestinations);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            strategy.appendField(locator, this, "brokerName", buffer, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            strategy.appendField(locator, this, "brokerURL", buffer, theBrokerURL);
        }
        {
            Boolean theCheckDuplicateMessagesOnDuplex;
            theCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            strategy.appendField(locator, this, "checkDuplicateMessagesOnDuplex", buffer, theCheckDuplicateMessagesOnDuplex);
        }
        {
            Boolean theConduitSubscriptions;
            theConduitSubscriptions = this.isConduitSubscriptions();
            strategy.appendField(locator, this, "conduitSubscriptions", buffer, theConduitSubscriptions);
        }
        {
            String theConnectionFilter;
            theConnectionFilter = this.getConnectionFilter();
            strategy.appendField(locator, this, "connectionFilter", buffer, theConnectionFilter);
        }
        {
            BigInteger theConsumerPriorityBase;
            theConsumerPriorityBase = this.getConsumerPriorityBase();
            strategy.appendField(locator, this, "consumerPriorityBase", buffer, theConsumerPriorityBase);
        }
        {
            BigInteger theConsumerTTL;
            theConsumerTTL = this.getConsumerTTL();
            strategy.appendField(locator, this, "consumerTTL", buffer, theConsumerTTL);
        }
        {
            Boolean theDecreaseNetworkConsumerPriority;
            theDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            strategy.appendField(locator, this, "decreaseNetworkConsumerPriority", buffer, theDecreaseNetworkConsumerPriority);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            strategy.appendField(locator, this, "destinationFilter", buffer, theDestinationFilter);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            strategy.appendField(locator, this, "dispatchAsync", buffer, theDispatchAsync);
        }
        {
            Boolean theDuplex;
            theDuplex = this.isDuplex();
            strategy.appendField(locator, this, "duplex", buffer, theDuplex);
        }
        {
            Boolean theDynamicOnly;
            theDynamicOnly = this.isDynamicOnly();
            strategy.appendField(locator, this, "dynamicOnly", buffer, theDynamicOnly);
        }
        {
            Boolean theGcDestinationViews;
            theGcDestinationViews = this.isGcDestinationViews();
            strategy.appendField(locator, this, "gcDestinationViews", buffer, theGcDestinationViews);
        }
        {
            Long theGcSweepTime;
            theGcSweepTime = this.getGcSweepTime();
            strategy.appendField(locator, this, "gcSweepTime", buffer, theGcSweepTime);
        }
        {
            String theLocalTransport;
            theLocalTransport = this.getLocalTransport();
            strategy.appendField(locator, this, "localTransport", buffer, theLocalTransport);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            strategy.appendField(locator, this, "localUri", buffer, theLocalUri);
        }
        {
            BigInteger theMessageTTL;
            theMessageTTL = this.getMessageTTL();
            strategy.appendField(locator, this, "messageTTL", buffer, theMessageTTL);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger theNetworkTTL;
            theNetworkTTL = this.getNetworkTTL();
            strategy.appendField(locator, this, "networkTTL", buffer, theNetworkTTL);
        }
        {
            String theObjectName;
            theObjectName = this.getObjectName();
            strategy.appendField(locator, this, "objectName", buffer, theObjectName);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            String thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            strategy.appendField(locator, this, "prefetchSize", buffer, thePrefetchSize);
        }
        {
            String theRemoteTransport;
            theRemoteTransport = this.getRemoteTransport();
            strategy.appendField(locator, this, "remoteTransport", buffer, theRemoteTransport);
        }
        {
            String theRemoteURI;
            theRemoteURI = this.getRemoteURI();
            strategy.appendField(locator, this, "remoteURI", buffer, theRemoteURI);
        }
        {
            Boolean theStaticBridge;
            theStaticBridge = this.isStaticBridge();
            strategy.appendField(locator, this, "staticBridge", buffer, theStaticBridge);
        }
        {
            Boolean theSuppressDuplicateQueueSubscriptions;
            theSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            strategy.appendField(locator, this, "suppressDuplicateQueueSubscriptions", buffer, theSuppressDuplicateQueueSubscriptions);
        }
        {
            Boolean theSuppressDuplicateTopicSubscriptions;
            theSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            strategy.appendField(locator, this, "suppressDuplicateTopicSubscriptions", buffer, theSuppressDuplicateTopicSubscriptions);
        }
        {
            Boolean theUseBrokerNameAsIdSees;
            theUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            strategy.appendField(locator, this, "useBrokerNameAsIdSees", buffer, theUseBrokerNameAsIdSees);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            strategy.appendField(locator, this, "useCompression", buffer, theUseCompression);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            strategy.appendField(locator, this, "userName", buffer, theUserName);
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
            List<Object> theBridgeOrBrokerServiceOrConnectionFilter;
            theBridgeOrBrokerServiceOrConnectionFilter = (((this.bridgeOrBrokerServiceOrConnectionFilter!= null)&&(!this.bridgeOrBrokerServiceOrConnectionFilter.isEmpty()))?this.getBridgeOrBrokerServiceOrConnectionFilter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bridgeOrBrokerServiceOrConnectionFilter", theBridgeOrBrokerServiceOrConnectionFilter), currentHashCode, theBridgeOrBrokerServiceOrConnectionFilter);
        }
        {
            Boolean theAdvisoryForFailedForward;
            theAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForFailedForward", theAdvisoryForFailedForward), currentHashCode, theAdvisoryForFailedForward);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alwaysSyncSend", theAlwaysSyncSend), currentHashCode, theAlwaysSyncSend);
        }
        {
            String theBridge;
            theBridge = this.getBridge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bridge", theBridge), currentHashCode, theBridge);
        }
        {
            Boolean theBridgeTempDestinations;
            theBridgeTempDestinations = this.isBridgeTempDestinations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bridgeTempDestinations", theBridgeTempDestinations), currentHashCode, theBridgeTempDestinations);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerName", theBrokerName), currentHashCode, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerURL", theBrokerURL), currentHashCode, theBrokerURL);
        }
        {
            Boolean theCheckDuplicateMessagesOnDuplex;
            theCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkDuplicateMessagesOnDuplex", theCheckDuplicateMessagesOnDuplex), currentHashCode, theCheckDuplicateMessagesOnDuplex);
        }
        {
            Boolean theConduitSubscriptions;
            theConduitSubscriptions = this.isConduitSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conduitSubscriptions", theConduitSubscriptions), currentHashCode, theConduitSubscriptions);
        }
        {
            String theConnectionFilter;
            theConnectionFilter = this.getConnectionFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFilter", theConnectionFilter), currentHashCode, theConnectionFilter);
        }
        {
            BigInteger theConsumerPriorityBase;
            theConsumerPriorityBase = this.getConsumerPriorityBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerPriorityBase", theConsumerPriorityBase), currentHashCode, theConsumerPriorityBase);
        }
        {
            BigInteger theConsumerTTL;
            theConsumerTTL = this.getConsumerTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerTTL", theConsumerTTL), currentHashCode, theConsumerTTL);
        }
        {
            Boolean theDecreaseNetworkConsumerPriority;
            theDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decreaseNetworkConsumerPriority", theDecreaseNetworkConsumerPriority), currentHashCode, theDecreaseNetworkConsumerPriority);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationFilter", theDestinationFilter), currentHashCode, theDestinationFilter);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispatchAsync", theDispatchAsync), currentHashCode, theDispatchAsync);
        }
        {
            Boolean theDuplex;
            theDuplex = this.isDuplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplex", theDuplex), currentHashCode, theDuplex);
        }
        {
            Boolean theDynamicOnly;
            theDynamicOnly = this.isDynamicOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamicOnly", theDynamicOnly), currentHashCode, theDynamicOnly);
        }
        {
            Boolean theGcDestinationViews;
            theGcDestinationViews = this.isGcDestinationViews();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcDestinationViews", theGcDestinationViews), currentHashCode, theGcDestinationViews);
        }
        {
            Long theGcSweepTime;
            theGcSweepTime = this.getGcSweepTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcSweepTime", theGcSweepTime), currentHashCode, theGcSweepTime);
        }
        {
            String theLocalTransport;
            theLocalTransport = this.getLocalTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localTransport", theLocalTransport), currentHashCode, theLocalTransport);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localUri", theLocalUri), currentHashCode, theLocalUri);
        }
        {
            BigInteger theMessageTTL;
            theMessageTTL = this.getMessageTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageTTL", theMessageTTL), currentHashCode, theMessageTTL);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger theNetworkTTL;
            theNetworkTTL = this.getNetworkTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkTTL", theNetworkTTL), currentHashCode, theNetworkTTL);
        }
        {
            String theObjectName;
            theObjectName = this.getObjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectName", theObjectName), currentHashCode, theObjectName);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
        }
        {
            String thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchSize", thePrefetchSize), currentHashCode, thePrefetchSize);
        }
        {
            String theRemoteTransport;
            theRemoteTransport = this.getRemoteTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteTransport", theRemoteTransport), currentHashCode, theRemoteTransport);
        }
        {
            String theRemoteURI;
            theRemoteURI = this.getRemoteURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteURI", theRemoteURI), currentHashCode, theRemoteURI);
        }
        {
            Boolean theStaticBridge;
            theStaticBridge = this.isStaticBridge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staticBridge", theStaticBridge), currentHashCode, theStaticBridge);
        }
        {
            Boolean theSuppressDuplicateQueueSubscriptions;
            theSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppressDuplicateQueueSubscriptions", theSuppressDuplicateQueueSubscriptions), currentHashCode, theSuppressDuplicateQueueSubscriptions);
        }
        {
            Boolean theSuppressDuplicateTopicSubscriptions;
            theSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppressDuplicateTopicSubscriptions", theSuppressDuplicateTopicSubscriptions), currentHashCode, theSuppressDuplicateTopicSubscriptions);
        }
        {
            Boolean theUseBrokerNameAsIdSees;
            theUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useBrokerNameAsIdSees", theUseBrokerNameAsIdSees), currentHashCode, theUseBrokerNameAsIdSees);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCompression", theUseCompression), currentHashCode, theUseCompression);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
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
        if (!(object instanceof DtoMulticastNetworkConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoMulticastNetworkConnector that = ((DtoMulticastNetworkConnector) object);
        {
            List<Object> lhsBridgeOrBrokerServiceOrConnectionFilter;
            lhsBridgeOrBrokerServiceOrConnectionFilter = (((this.bridgeOrBrokerServiceOrConnectionFilter!= null)&&(!this.bridgeOrBrokerServiceOrConnectionFilter.isEmpty()))?this.getBridgeOrBrokerServiceOrConnectionFilter():null);
            List<Object> rhsBridgeOrBrokerServiceOrConnectionFilter;
            rhsBridgeOrBrokerServiceOrConnectionFilter = (((that.bridgeOrBrokerServiceOrConnectionFilter!= null)&&(!that.bridgeOrBrokerServiceOrConnectionFilter.isEmpty()))?that.getBridgeOrBrokerServiceOrConnectionFilter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bridgeOrBrokerServiceOrConnectionFilter", lhsBridgeOrBrokerServiceOrConnectionFilter), LocatorUtils.property(thatLocator, "bridgeOrBrokerServiceOrConnectionFilter", rhsBridgeOrBrokerServiceOrConnectionFilter), lhsBridgeOrBrokerServiceOrConnectionFilter, rhsBridgeOrBrokerServiceOrConnectionFilter)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForFailedForward;
            lhsAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            Boolean rhsAdvisoryForFailedForward;
            rhsAdvisoryForFailedForward = that.isAdvisoryForFailedForward();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForFailedForward", lhsAdvisoryForFailedForward), LocatorUtils.property(thatLocator, "advisoryForFailedForward", rhsAdvisoryForFailedForward), lhsAdvisoryForFailedForward, rhsAdvisoryForFailedForward)) {
                return false;
            }
        }
        {
            Boolean lhsAlwaysSyncSend;
            lhsAlwaysSyncSend = this.isAlwaysSyncSend();
            Boolean rhsAlwaysSyncSend;
            rhsAlwaysSyncSend = that.isAlwaysSyncSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alwaysSyncSend", lhsAlwaysSyncSend), LocatorUtils.property(thatLocator, "alwaysSyncSend", rhsAlwaysSyncSend), lhsAlwaysSyncSend, rhsAlwaysSyncSend)) {
                return false;
            }
        }
        {
            String lhsBridge;
            lhsBridge = this.getBridge();
            String rhsBridge;
            rhsBridge = that.getBridge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bridge", lhsBridge), LocatorUtils.property(thatLocator, "bridge", rhsBridge), lhsBridge, rhsBridge)) {
                return false;
            }
        }
        {
            Boolean lhsBridgeTempDestinations;
            lhsBridgeTempDestinations = this.isBridgeTempDestinations();
            Boolean rhsBridgeTempDestinations;
            rhsBridgeTempDestinations = that.isBridgeTempDestinations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bridgeTempDestinations", lhsBridgeTempDestinations), LocatorUtils.property(thatLocator, "bridgeTempDestinations", rhsBridgeTempDestinations), lhsBridgeTempDestinations, rhsBridgeTempDestinations)) {
                return false;
            }
        }
        {
            String lhsBrokerName;
            lhsBrokerName = this.getBrokerName();
            String rhsBrokerName;
            rhsBrokerName = that.getBrokerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerName", lhsBrokerName), LocatorUtils.property(thatLocator, "brokerName", rhsBrokerName), lhsBrokerName, rhsBrokerName)) {
                return false;
            }
        }
        {
            String lhsBrokerService;
            lhsBrokerService = this.getBrokerService();
            String rhsBrokerService;
            rhsBrokerService = that.getBrokerService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
                return false;
            }
        }
        {
            String lhsBrokerURL;
            lhsBrokerURL = this.getBrokerURL();
            String rhsBrokerURL;
            rhsBrokerURL = that.getBrokerURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerURL", lhsBrokerURL), LocatorUtils.property(thatLocator, "brokerURL", rhsBrokerURL), lhsBrokerURL, rhsBrokerURL)) {
                return false;
            }
        }
        {
            Boolean lhsCheckDuplicateMessagesOnDuplex;
            lhsCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            Boolean rhsCheckDuplicateMessagesOnDuplex;
            rhsCheckDuplicateMessagesOnDuplex = that.isCheckDuplicateMessagesOnDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkDuplicateMessagesOnDuplex", lhsCheckDuplicateMessagesOnDuplex), LocatorUtils.property(thatLocator, "checkDuplicateMessagesOnDuplex", rhsCheckDuplicateMessagesOnDuplex), lhsCheckDuplicateMessagesOnDuplex, rhsCheckDuplicateMessagesOnDuplex)) {
                return false;
            }
        }
        {
            Boolean lhsConduitSubscriptions;
            lhsConduitSubscriptions = this.isConduitSubscriptions();
            Boolean rhsConduitSubscriptions;
            rhsConduitSubscriptions = that.isConduitSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conduitSubscriptions", lhsConduitSubscriptions), LocatorUtils.property(thatLocator, "conduitSubscriptions", rhsConduitSubscriptions), lhsConduitSubscriptions, rhsConduitSubscriptions)) {
                return false;
            }
        }
        {
            String lhsConnectionFilter;
            lhsConnectionFilter = this.getConnectionFilter();
            String rhsConnectionFilter;
            rhsConnectionFilter = that.getConnectionFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFilter", lhsConnectionFilter), LocatorUtils.property(thatLocator, "connectionFilter", rhsConnectionFilter), lhsConnectionFilter, rhsConnectionFilter)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumerPriorityBase;
            lhsConsumerPriorityBase = this.getConsumerPriorityBase();
            BigInteger rhsConsumerPriorityBase;
            rhsConsumerPriorityBase = that.getConsumerPriorityBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerPriorityBase", lhsConsumerPriorityBase), LocatorUtils.property(thatLocator, "consumerPriorityBase", rhsConsumerPriorityBase), lhsConsumerPriorityBase, rhsConsumerPriorityBase)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumerTTL;
            lhsConsumerTTL = this.getConsumerTTL();
            BigInteger rhsConsumerTTL;
            rhsConsumerTTL = that.getConsumerTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerTTL", lhsConsumerTTL), LocatorUtils.property(thatLocator, "consumerTTL", rhsConsumerTTL), lhsConsumerTTL, rhsConsumerTTL)) {
                return false;
            }
        }
        {
            Boolean lhsDecreaseNetworkConsumerPriority;
            lhsDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            Boolean rhsDecreaseNetworkConsumerPriority;
            rhsDecreaseNetworkConsumerPriority = that.isDecreaseNetworkConsumerPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decreaseNetworkConsumerPriority", lhsDecreaseNetworkConsumerPriority), LocatorUtils.property(thatLocator, "decreaseNetworkConsumerPriority", rhsDecreaseNetworkConsumerPriority), lhsDecreaseNetworkConsumerPriority, rhsDecreaseNetworkConsumerPriority)) {
                return false;
            }
        }
        {
            String lhsDestinationFilter;
            lhsDestinationFilter = this.getDestinationFilter();
            String rhsDestinationFilter;
            rhsDestinationFilter = that.getDestinationFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationFilter", lhsDestinationFilter), LocatorUtils.property(thatLocator, "destinationFilter", rhsDestinationFilter), lhsDestinationFilter, rhsDestinationFilter)) {
                return false;
            }
        }
        {
            Boolean lhsDispatchAsync;
            lhsDispatchAsync = this.isDispatchAsync();
            Boolean rhsDispatchAsync;
            rhsDispatchAsync = that.isDispatchAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispatchAsync", lhsDispatchAsync), LocatorUtils.property(thatLocator, "dispatchAsync", rhsDispatchAsync), lhsDispatchAsync, rhsDispatchAsync)) {
                return false;
            }
        }
        {
            Boolean lhsDuplex;
            lhsDuplex = this.isDuplex();
            Boolean rhsDuplex;
            rhsDuplex = that.isDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplex", lhsDuplex), LocatorUtils.property(thatLocator, "duplex", rhsDuplex), lhsDuplex, rhsDuplex)) {
                return false;
            }
        }
        {
            Boolean lhsDynamicOnly;
            lhsDynamicOnly = this.isDynamicOnly();
            Boolean rhsDynamicOnly;
            rhsDynamicOnly = that.isDynamicOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamicOnly", lhsDynamicOnly), LocatorUtils.property(thatLocator, "dynamicOnly", rhsDynamicOnly), lhsDynamicOnly, rhsDynamicOnly)) {
                return false;
            }
        }
        {
            Boolean lhsGcDestinationViews;
            lhsGcDestinationViews = this.isGcDestinationViews();
            Boolean rhsGcDestinationViews;
            rhsGcDestinationViews = that.isGcDestinationViews();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcDestinationViews", lhsGcDestinationViews), LocatorUtils.property(thatLocator, "gcDestinationViews", rhsGcDestinationViews), lhsGcDestinationViews, rhsGcDestinationViews)) {
                return false;
            }
        }
        {
            Long lhsGcSweepTime;
            lhsGcSweepTime = this.getGcSweepTime();
            Long rhsGcSweepTime;
            rhsGcSweepTime = that.getGcSweepTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcSweepTime", lhsGcSweepTime), LocatorUtils.property(thatLocator, "gcSweepTime", rhsGcSweepTime), lhsGcSweepTime, rhsGcSweepTime)) {
                return false;
            }
        }
        {
            String lhsLocalTransport;
            lhsLocalTransport = this.getLocalTransport();
            String rhsLocalTransport;
            rhsLocalTransport = that.getLocalTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localTransport", lhsLocalTransport), LocatorUtils.property(thatLocator, "localTransport", rhsLocalTransport), lhsLocalTransport, rhsLocalTransport)) {
                return false;
            }
        }
        {
            String lhsLocalUri;
            lhsLocalUri = this.getLocalUri();
            String rhsLocalUri;
            rhsLocalUri = that.getLocalUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localUri", lhsLocalUri), LocatorUtils.property(thatLocator, "localUri", rhsLocalUri), lhsLocalUri, rhsLocalUri)) {
                return false;
            }
        }
        {
            BigInteger lhsMessageTTL;
            lhsMessageTTL = this.getMessageTTL();
            BigInteger rhsMessageTTL;
            rhsMessageTTL = that.getMessageTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageTTL", lhsMessageTTL), LocatorUtils.property(thatLocator, "messageTTL", rhsMessageTTL), lhsMessageTTL, rhsMessageTTL)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            BigInteger lhsNetworkTTL;
            lhsNetworkTTL = this.getNetworkTTL();
            BigInteger rhsNetworkTTL;
            rhsNetworkTTL = that.getNetworkTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkTTL", lhsNetworkTTL), LocatorUtils.property(thatLocator, "networkTTL", rhsNetworkTTL), lhsNetworkTTL, rhsNetworkTTL)) {
                return false;
            }
        }
        {
            String lhsObjectName;
            lhsObjectName = this.getObjectName();
            String rhsObjectName;
            rhsObjectName = that.getObjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectName", lhsObjectName), LocatorUtils.property(thatLocator, "objectName", rhsObjectName), lhsObjectName, rhsObjectName)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                return false;
            }
        }
        {
            String lhsPrefetchSize;
            lhsPrefetchSize = this.getPrefetchSize();
            String rhsPrefetchSize;
            rhsPrefetchSize = that.getPrefetchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchSize", lhsPrefetchSize), LocatorUtils.property(thatLocator, "prefetchSize", rhsPrefetchSize), lhsPrefetchSize, rhsPrefetchSize)) {
                return false;
            }
        }
        {
            String lhsRemoteTransport;
            lhsRemoteTransport = this.getRemoteTransport();
            String rhsRemoteTransport;
            rhsRemoteTransport = that.getRemoteTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteTransport", lhsRemoteTransport), LocatorUtils.property(thatLocator, "remoteTransport", rhsRemoteTransport), lhsRemoteTransport, rhsRemoteTransport)) {
                return false;
            }
        }
        {
            String lhsRemoteURI;
            lhsRemoteURI = this.getRemoteURI();
            String rhsRemoteURI;
            rhsRemoteURI = that.getRemoteURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteURI", lhsRemoteURI), LocatorUtils.property(thatLocator, "remoteURI", rhsRemoteURI), lhsRemoteURI, rhsRemoteURI)) {
                return false;
            }
        }
        {
            Boolean lhsStaticBridge;
            lhsStaticBridge = this.isStaticBridge();
            Boolean rhsStaticBridge;
            rhsStaticBridge = that.isStaticBridge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staticBridge", lhsStaticBridge), LocatorUtils.property(thatLocator, "staticBridge", rhsStaticBridge), lhsStaticBridge, rhsStaticBridge)) {
                return false;
            }
        }
        {
            Boolean lhsSuppressDuplicateQueueSubscriptions;
            lhsSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            Boolean rhsSuppressDuplicateQueueSubscriptions;
            rhsSuppressDuplicateQueueSubscriptions = that.isSuppressDuplicateQueueSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppressDuplicateQueueSubscriptions", lhsSuppressDuplicateQueueSubscriptions), LocatorUtils.property(thatLocator, "suppressDuplicateQueueSubscriptions", rhsSuppressDuplicateQueueSubscriptions), lhsSuppressDuplicateQueueSubscriptions, rhsSuppressDuplicateQueueSubscriptions)) {
                return false;
            }
        }
        {
            Boolean lhsSuppressDuplicateTopicSubscriptions;
            lhsSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            Boolean rhsSuppressDuplicateTopicSubscriptions;
            rhsSuppressDuplicateTopicSubscriptions = that.isSuppressDuplicateTopicSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppressDuplicateTopicSubscriptions", lhsSuppressDuplicateTopicSubscriptions), LocatorUtils.property(thatLocator, "suppressDuplicateTopicSubscriptions", rhsSuppressDuplicateTopicSubscriptions), lhsSuppressDuplicateTopicSubscriptions, rhsSuppressDuplicateTopicSubscriptions)) {
                return false;
            }
        }
        {
            Boolean lhsUseBrokerNameAsIdSees;
            lhsUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            Boolean rhsUseBrokerNameAsIdSees;
            rhsUseBrokerNameAsIdSees = that.isUseBrokerNameAsIdSees();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useBrokerNameAsIdSees", lhsUseBrokerNameAsIdSees), LocatorUtils.property(thatLocator, "useBrokerNameAsIdSees", rhsUseBrokerNameAsIdSees), lhsUseBrokerNameAsIdSees, rhsUseBrokerNameAsIdSees)) {
                return false;
            }
        }
        {
            Boolean lhsUseCompression;
            lhsUseCompression = this.isUseCompression();
            Boolean rhsUseCompression;
            rhsUseCompression = that.isUseCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCompression", lhsUseCompression), LocatorUtils.property(thatLocator, "useCompression", rhsUseCompression), lhsUseCompression, rhsUseCompression)) {
                return false;
            }
        }
        {
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}compositeDemandForwardingBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}demandForwardingBridge"/>
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
        "compositeDemandForwardingBridge",
        "demandForwardingBridge",
        "any"
    })
    public static class Bridge
        implements Equals, HashCode, ToString
    {

        protected DtoCompositeDemandForwardingBridge compositeDemandForwardingBridge;
        protected DtoDemandForwardingBridge demandForwardingBridge;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取compositeDemandForwardingBridge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoCompositeDemandForwardingBridge }
         *     
         */
        public DtoCompositeDemandForwardingBridge getCompositeDemandForwardingBridge() {
            return compositeDemandForwardingBridge;
        }

        /**
         * 设置compositeDemandForwardingBridge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoCompositeDemandForwardingBridge }
         *     
         */
        public void setCompositeDemandForwardingBridge(DtoCompositeDemandForwardingBridge value) {
            this.compositeDemandForwardingBridge = value;
        }

        /**
         * 获取demandForwardingBridge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDemandForwardingBridge }
         *     
         */
        public DtoDemandForwardingBridge getDemandForwardingBridge() {
            return demandForwardingBridge;
        }

        /**
         * 设置demandForwardingBridge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDemandForwardingBridge }
         *     
         */
        public void setDemandForwardingBridge(DtoDemandForwardingBridge value) {
            this.demandForwardingBridge = value;
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
                DtoCompositeDemandForwardingBridge theCompositeDemandForwardingBridge;
                theCompositeDemandForwardingBridge = this.getCompositeDemandForwardingBridge();
                strategy.appendField(locator, this, "compositeDemandForwardingBridge", buffer, theCompositeDemandForwardingBridge);
            }
            {
                DtoDemandForwardingBridge theDemandForwardingBridge;
                theDemandForwardingBridge = this.getDemandForwardingBridge();
                strategy.appendField(locator, this, "demandForwardingBridge", buffer, theDemandForwardingBridge);
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
                DtoCompositeDemandForwardingBridge theCompositeDemandForwardingBridge;
                theCompositeDemandForwardingBridge = this.getCompositeDemandForwardingBridge();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeDemandForwardingBridge", theCompositeDemandForwardingBridge), currentHashCode, theCompositeDemandForwardingBridge);
            }
            {
                DtoDemandForwardingBridge theDemandForwardingBridge;
                theDemandForwardingBridge = this.getDemandForwardingBridge();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandForwardingBridge", theDemandForwardingBridge), currentHashCode, theDemandForwardingBridge);
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
            if (!(object instanceof DtoMulticastNetworkConnector.Bridge)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.Bridge that = ((DtoMulticastNetworkConnector.Bridge) object);
            {
                DtoCompositeDemandForwardingBridge lhsCompositeDemandForwardingBridge;
                lhsCompositeDemandForwardingBridge = this.getCompositeDemandForwardingBridge();
                DtoCompositeDemandForwardingBridge rhsCompositeDemandForwardingBridge;
                rhsCompositeDemandForwardingBridge = that.getCompositeDemandForwardingBridge();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeDemandForwardingBridge", lhsCompositeDemandForwardingBridge), LocatorUtils.property(thatLocator, "compositeDemandForwardingBridge", rhsCompositeDemandForwardingBridge), lhsCompositeDemandForwardingBridge, rhsCompositeDemandForwardingBridge)) {
                    return false;
                }
            }
            {
                DtoDemandForwardingBridge lhsDemandForwardingBridge;
                lhsDemandForwardingBridge = this.getDemandForwardingBridge();
                DtoDemandForwardingBridge rhsDemandForwardingBridge;
                rhsDemandForwardingBridge = that.getDemandForwardingBridge();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "demandForwardingBridge", lhsDemandForwardingBridge), LocatorUtils.property(thatLocator, "demandForwardingBridge", rhsDemandForwardingBridge), lhsDemandForwardingBridge, rhsDemandForwardingBridge)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
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
        "broker",
        "brokerService",
        "any"
    })
    public static class BrokerService
        implements Equals, HashCode, ToString
    {

        protected DtoBroker broker;
        protected DtoBrokerService brokerService;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取broker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBroker }
         *     
         */
        public DtoBroker getBroker() {
            return broker;
        }

        /**
         * 设置broker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBroker }
         *     
         */
        public void setBroker(DtoBroker value) {
            this.broker = value;
        }

        /**
         * 获取brokerService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBrokerService }
         *     
         */
        public DtoBrokerService getBrokerService() {
            return brokerService;
        }

        /**
         * 设置brokerService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBrokerService }
         *     
         */
        public void setBrokerService(DtoBrokerService value) {
            this.brokerService = value;
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                strategy.appendField(locator, this, "broker", buffer, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "broker", theBroker), currentHashCode, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
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
            if (!(object instanceof DtoMulticastNetworkConnector.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.BrokerService that = ((DtoMulticastNetworkConnector.BrokerService) object);
            {
                DtoBroker lhsBroker;
                lhsBroker = this.getBroker();
                DtoBroker rhsBroker;
                rhsBroker = that.getBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "broker", lhsBroker), LocatorUtils.property(thatLocator, "broker", rhsBroker), lhsBroker, rhsBroker)) {
                    return false;
                }
            }
            {
                DtoBrokerService lhsBrokerService;
                lhsBrokerService = this.getBrokerService();
                DtoBrokerService rhsBrokerService;
                rhsBrokerService = that.getBrokerService();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
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
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ConnectionFilter
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.ConnectionFilter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.ConnectionFilter that = ((DtoMulticastNetworkConnector.ConnectionFilter) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DurableDestinations
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.DurableDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.DurableDestinations that = ((DtoMulticastNetworkConnector.DurableDestinations) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DynamicallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.DynamicallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.DynamicallyIncludedDestinations that = ((DtoMulticastNetworkConnector.DynamicallyIncludedDestinations) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ExcludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.ExcludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.ExcludedDestinations that = ((DtoMulticastNetworkConnector.ExcludedDestinations) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class LocalTransport
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.LocalTransport)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.LocalTransport that = ((DtoMulticastNetworkConnector.LocalTransport) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class RemoteTransport
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.RemoteTransport)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.RemoteTransport that = ((DtoMulticastNetworkConnector.RemoteTransport) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class StaticallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoMulticastNetworkConnector.StaticallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMulticastNetworkConnector.StaticallyIncludedDestinations that = ((DtoMulticastNetworkConnector.StaticallyIncludedDestinations) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
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
