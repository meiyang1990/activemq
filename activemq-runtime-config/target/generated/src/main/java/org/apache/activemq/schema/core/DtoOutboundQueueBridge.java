//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.17 时间 03:29:05 PM CST 
//


package org.apache.activemq.schema.core;

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
 *           &lt;element name="consumer" minOccurs="0">
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
 *           &lt;element name="consumerConnection" minOccurs="0">
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
 *           &lt;element name="consumerQueue" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jmsConnector" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jmsMessageConvertor" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleJmsMessageConvertor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="producerConnection" minOccurs="0">
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
 *           &lt;element name="producerQueue" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="consumer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerQueue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doHandleReplyTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="jmsConnector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jmsMessageConvertor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localQueueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundQueueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerQueue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selector" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "consumerOrConsumerConnectionOrConsumerQueue"
})
@XmlRootElement(name = "outboundQueueBridge")
public class DtoOutboundQueueBridge implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "consumerQueue", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "consumerConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "producerConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "jmsMessageConvertor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "jmsConnector", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "producerQueue", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "consumer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> consumerOrConsumerConnectionOrConsumerQueue;
    @XmlAttribute(name = "consumer")
    protected String consumer;
    @XmlAttribute(name = "consumerConnection")
    protected String consumerConnection;
    @XmlAttribute(name = "consumerQueue")
    protected String consumerQueue;
    @XmlAttribute(name = "doHandleReplyTo")
    protected Boolean doHandleReplyTo;
    @XmlAttribute(name = "jmsConnector")
    protected String jmsConnector;
    @XmlAttribute(name = "jmsMessageConvertor")
    protected String jmsMessageConvertor;
    @XmlAttribute(name = "localQueueName")
    protected String localQueueName;
    @XmlAttribute(name = "outboundQueueName")
    protected String outboundQueueName;
    @XmlAttribute(name = "producerConnection")
    protected String producerConnection;
    @XmlAttribute(name = "producerQueue")
    protected String producerQueue;
    @XmlAttribute(name = "selector")
    protected String selector;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the consumerOrConsumerConnectionOrConsumerQueue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerOrConsumerConnectionOrConsumerQueue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerOrConsumerConnectionOrConsumerQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ConsumerQueue }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ConsumerConnection }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ProducerConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.JmsMessageConvertor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.JmsConnector }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ProducerQueue }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.Consumer }{@code >}
     * 
     * 
     */
    public List<Object> getConsumerOrConsumerConnectionOrConsumerQueue() {
        if (consumerOrConsumerConnectionOrConsumerQueue == null) {
            consumerOrConsumerConnectionOrConsumerQueue = new ArrayList<Object>();
        }
        return this.consumerOrConsumerConnectionOrConsumerQueue;
    }

    /**
     * 获取consumer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * 设置consumer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumer(String value) {
        this.consumer = value;
    }

    /**
     * 获取consumerConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerConnection() {
        return consumerConnection;
    }

    /**
     * 设置consumerConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerConnection(String value) {
        this.consumerConnection = value;
    }

    /**
     * 获取consumerQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerQueue() {
        return consumerQueue;
    }

    /**
     * 设置consumerQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerQueue(String value) {
        this.consumerQueue = value;
    }

    /**
     * 获取doHandleReplyTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoHandleReplyTo() {
        return doHandleReplyTo;
    }

    /**
     * 设置doHandleReplyTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoHandleReplyTo(Boolean value) {
        this.doHandleReplyTo = value;
    }

    /**
     * 获取jmsConnector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsConnector() {
        return jmsConnector;
    }

    /**
     * 设置jmsConnector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsConnector(String value) {
        this.jmsConnector = value;
    }

    /**
     * 获取jmsMessageConvertor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsMessageConvertor() {
        return jmsMessageConvertor;
    }

    /**
     * 设置jmsMessageConvertor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsMessageConvertor(String value) {
        this.jmsMessageConvertor = value;
    }

    /**
     * 获取localQueueName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalQueueName() {
        return localQueueName;
    }

    /**
     * 设置localQueueName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalQueueName(String value) {
        this.localQueueName = value;
    }

    /**
     * 获取outboundQueueName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundQueueName() {
        return outboundQueueName;
    }

    /**
     * 设置outboundQueueName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundQueueName(String value) {
        this.outboundQueueName = value;
    }

    /**
     * 获取producerConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerConnection() {
        return producerConnection;
    }

    /**
     * 设置producerConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerConnection(String value) {
        this.producerConnection = value;
    }

    /**
     * 获取producerQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerQueue() {
        return producerQueue;
    }

    /**
     * 设置producerQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerQueue(String value) {
        this.producerQueue = value;
    }

    /**
     * 获取selector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelector() {
        return selector;
    }

    /**
     * 设置selector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelector(String value) {
        this.selector = value;
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
            List<Object> theConsumerOrConsumerConnectionOrConsumerQueue;
            theConsumerOrConsumerConnectionOrConsumerQueue = (((this.consumerOrConsumerConnectionOrConsumerQueue!= null)&&(!this.consumerOrConsumerConnectionOrConsumerQueue.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerQueue():null);
            strategy.appendField(locator, this, "consumerOrConsumerConnectionOrConsumerQueue", buffer, theConsumerOrConsumerConnectionOrConsumerQueue);
        }
        {
            String theConsumer;
            theConsumer = this.getConsumer();
            strategy.appendField(locator, this, "consumer", buffer, theConsumer);
        }
        {
            String theConsumerConnection;
            theConsumerConnection = this.getConsumerConnection();
            strategy.appendField(locator, this, "consumerConnection", buffer, theConsumerConnection);
        }
        {
            String theConsumerQueue;
            theConsumerQueue = this.getConsumerQueue();
            strategy.appendField(locator, this, "consumerQueue", buffer, theConsumerQueue);
        }
        {
            Boolean theDoHandleReplyTo;
            theDoHandleReplyTo = this.isDoHandleReplyTo();
            strategy.appendField(locator, this, "doHandleReplyTo", buffer, theDoHandleReplyTo);
        }
        {
            String theJmsConnector;
            theJmsConnector = this.getJmsConnector();
            strategy.appendField(locator, this, "jmsConnector", buffer, theJmsConnector);
        }
        {
            String theJmsMessageConvertor;
            theJmsMessageConvertor = this.getJmsMessageConvertor();
            strategy.appendField(locator, this, "jmsMessageConvertor", buffer, theJmsMessageConvertor);
        }
        {
            String theLocalQueueName;
            theLocalQueueName = this.getLocalQueueName();
            strategy.appendField(locator, this, "localQueueName", buffer, theLocalQueueName);
        }
        {
            String theOutboundQueueName;
            theOutboundQueueName = this.getOutboundQueueName();
            strategy.appendField(locator, this, "outboundQueueName", buffer, theOutboundQueueName);
        }
        {
            String theProducerConnection;
            theProducerConnection = this.getProducerConnection();
            strategy.appendField(locator, this, "producerConnection", buffer, theProducerConnection);
        }
        {
            String theProducerQueue;
            theProducerQueue = this.getProducerQueue();
            strategy.appendField(locator, this, "producerQueue", buffer, theProducerQueue);
        }
        {
            String theSelector;
            theSelector = this.getSelector();
            strategy.appendField(locator, this, "selector", buffer, theSelector);
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
            List<Object> theConsumerOrConsumerConnectionOrConsumerQueue;
            theConsumerOrConsumerConnectionOrConsumerQueue = (((this.consumerOrConsumerConnectionOrConsumerQueue!= null)&&(!this.consumerOrConsumerConnectionOrConsumerQueue.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerQueue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerOrConsumerConnectionOrConsumerQueue", theConsumerOrConsumerConnectionOrConsumerQueue), currentHashCode, theConsumerOrConsumerConnectionOrConsumerQueue);
        }
        {
            String theConsumer;
            theConsumer = this.getConsumer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumer", theConsumer), currentHashCode, theConsumer);
        }
        {
            String theConsumerConnection;
            theConsumerConnection = this.getConsumerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerConnection", theConsumerConnection), currentHashCode, theConsumerConnection);
        }
        {
            String theConsumerQueue;
            theConsumerQueue = this.getConsumerQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerQueue", theConsumerQueue), currentHashCode, theConsumerQueue);
        }
        {
            Boolean theDoHandleReplyTo;
            theDoHandleReplyTo = this.isDoHandleReplyTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doHandleReplyTo", theDoHandleReplyTo), currentHashCode, theDoHandleReplyTo);
        }
        {
            String theJmsConnector;
            theJmsConnector = this.getJmsConnector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsConnector", theJmsConnector), currentHashCode, theJmsConnector);
        }
        {
            String theJmsMessageConvertor;
            theJmsMessageConvertor = this.getJmsMessageConvertor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsMessageConvertor", theJmsMessageConvertor), currentHashCode, theJmsMessageConvertor);
        }
        {
            String theLocalQueueName;
            theLocalQueueName = this.getLocalQueueName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localQueueName", theLocalQueueName), currentHashCode, theLocalQueueName);
        }
        {
            String theOutboundQueueName;
            theOutboundQueueName = this.getOutboundQueueName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundQueueName", theOutboundQueueName), currentHashCode, theOutboundQueueName);
        }
        {
            String theProducerConnection;
            theProducerConnection = this.getProducerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerConnection", theProducerConnection), currentHashCode, theProducerConnection);
        }
        {
            String theProducerQueue;
            theProducerQueue = this.getProducerQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerQueue", theProducerQueue), currentHashCode, theProducerQueue);
        }
        {
            String theSelector;
            theSelector = this.getSelector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selector", theSelector), currentHashCode, theSelector);
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
        if (!(object instanceof DtoOutboundQueueBridge)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoOutboundQueueBridge that = ((DtoOutboundQueueBridge) object);
        {
            List<Object> lhsConsumerOrConsumerConnectionOrConsumerQueue;
            lhsConsumerOrConsumerConnectionOrConsumerQueue = (((this.consumerOrConsumerConnectionOrConsumerQueue!= null)&&(!this.consumerOrConsumerConnectionOrConsumerQueue.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerQueue():null);
            List<Object> rhsConsumerOrConsumerConnectionOrConsumerQueue;
            rhsConsumerOrConsumerConnectionOrConsumerQueue = (((that.consumerOrConsumerConnectionOrConsumerQueue!= null)&&(!that.consumerOrConsumerConnectionOrConsumerQueue.isEmpty()))?that.getConsumerOrConsumerConnectionOrConsumerQueue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerOrConsumerConnectionOrConsumerQueue", lhsConsumerOrConsumerConnectionOrConsumerQueue), LocatorUtils.property(thatLocator, "consumerOrConsumerConnectionOrConsumerQueue", rhsConsumerOrConsumerConnectionOrConsumerQueue), lhsConsumerOrConsumerConnectionOrConsumerQueue, rhsConsumerOrConsumerConnectionOrConsumerQueue)) {
                return false;
            }
        }
        {
            String lhsConsumer;
            lhsConsumer = this.getConsumer();
            String rhsConsumer;
            rhsConsumer = that.getConsumer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumer", lhsConsumer), LocatorUtils.property(thatLocator, "consumer", rhsConsumer), lhsConsumer, rhsConsumer)) {
                return false;
            }
        }
        {
            String lhsConsumerConnection;
            lhsConsumerConnection = this.getConsumerConnection();
            String rhsConsumerConnection;
            rhsConsumerConnection = that.getConsumerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerConnection", lhsConsumerConnection), LocatorUtils.property(thatLocator, "consumerConnection", rhsConsumerConnection), lhsConsumerConnection, rhsConsumerConnection)) {
                return false;
            }
        }
        {
            String lhsConsumerQueue;
            lhsConsumerQueue = this.getConsumerQueue();
            String rhsConsumerQueue;
            rhsConsumerQueue = that.getConsumerQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerQueue", lhsConsumerQueue), LocatorUtils.property(thatLocator, "consumerQueue", rhsConsumerQueue), lhsConsumerQueue, rhsConsumerQueue)) {
                return false;
            }
        }
        {
            Boolean lhsDoHandleReplyTo;
            lhsDoHandleReplyTo = this.isDoHandleReplyTo();
            Boolean rhsDoHandleReplyTo;
            rhsDoHandleReplyTo = that.isDoHandleReplyTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doHandleReplyTo", lhsDoHandleReplyTo), LocatorUtils.property(thatLocator, "doHandleReplyTo", rhsDoHandleReplyTo), lhsDoHandleReplyTo, rhsDoHandleReplyTo)) {
                return false;
            }
        }
        {
            String lhsJmsConnector;
            lhsJmsConnector = this.getJmsConnector();
            String rhsJmsConnector;
            rhsJmsConnector = that.getJmsConnector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsConnector", lhsJmsConnector), LocatorUtils.property(thatLocator, "jmsConnector", rhsJmsConnector), lhsJmsConnector, rhsJmsConnector)) {
                return false;
            }
        }
        {
            String lhsJmsMessageConvertor;
            lhsJmsMessageConvertor = this.getJmsMessageConvertor();
            String rhsJmsMessageConvertor;
            rhsJmsMessageConvertor = that.getJmsMessageConvertor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsMessageConvertor", lhsJmsMessageConvertor), LocatorUtils.property(thatLocator, "jmsMessageConvertor", rhsJmsMessageConvertor), lhsJmsMessageConvertor, rhsJmsMessageConvertor)) {
                return false;
            }
        }
        {
            String lhsLocalQueueName;
            lhsLocalQueueName = this.getLocalQueueName();
            String rhsLocalQueueName;
            rhsLocalQueueName = that.getLocalQueueName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localQueueName", lhsLocalQueueName), LocatorUtils.property(thatLocator, "localQueueName", rhsLocalQueueName), lhsLocalQueueName, rhsLocalQueueName)) {
                return false;
            }
        }
        {
            String lhsOutboundQueueName;
            lhsOutboundQueueName = this.getOutboundQueueName();
            String rhsOutboundQueueName;
            rhsOutboundQueueName = that.getOutboundQueueName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundQueueName", lhsOutboundQueueName), LocatorUtils.property(thatLocator, "outboundQueueName", rhsOutboundQueueName), lhsOutboundQueueName, rhsOutboundQueueName)) {
                return false;
            }
        }
        {
            String lhsProducerConnection;
            lhsProducerConnection = this.getProducerConnection();
            String rhsProducerConnection;
            rhsProducerConnection = that.getProducerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerConnection", lhsProducerConnection), LocatorUtils.property(thatLocator, "producerConnection", rhsProducerConnection), lhsProducerConnection, rhsProducerConnection)) {
                return false;
            }
        }
        {
            String lhsProducerQueue;
            lhsProducerQueue = this.getProducerQueue();
            String rhsProducerQueue;
            rhsProducerQueue = that.getProducerQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerQueue", lhsProducerQueue), LocatorUtils.property(thatLocator, "producerQueue", rhsProducerQueue), lhsProducerQueue, rhsProducerQueue)) {
                return false;
            }
        }
        {
            String lhsSelector;
            lhsSelector = this.getSelector();
            String rhsSelector;
            rhsSelector = that.getSelector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selector", lhsSelector), LocatorUtils.property(thatLocator, "selector", rhsSelector), lhsSelector, rhsSelector)) {
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
    public static class Consumer
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
            if (!(object instanceof DtoOutboundQueueBridge.Consumer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.Consumer that = ((DtoOutboundQueueBridge.Consumer) object);
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
    public static class ConsumerConnection
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
            if (!(object instanceof DtoOutboundQueueBridge.ConsumerConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.ConsumerConnection that = ((DtoOutboundQueueBridge.ConsumerConnection) object);
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
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
        "any"
    })
    public static class ConsumerQueue
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
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
            if (!(object instanceof DtoOutboundQueueBridge.ConsumerQueue)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.ConsumerQueue that = ((DtoOutboundQueueBridge.ConsumerQueue) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
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
        "jmsQueueConnector",
        "jmsTopicConnector",
        "any"
    })
    public static class JmsConnector
        implements Equals, HashCode, ToString
    {

        protected DtoJmsQueueConnector jmsQueueConnector;
        protected DtoJmsTopicConnector jmsTopicConnector;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取jmsQueueConnector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoJmsQueueConnector }
         *     
         */
        public DtoJmsQueueConnector getJmsQueueConnector() {
            return jmsQueueConnector;
        }

        /**
         * 设置jmsQueueConnector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJmsQueueConnector }
         *     
         */
        public void setJmsQueueConnector(DtoJmsQueueConnector value) {
            this.jmsQueueConnector = value;
        }

        /**
         * 获取jmsTopicConnector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoJmsTopicConnector }
         *     
         */
        public DtoJmsTopicConnector getJmsTopicConnector() {
            return jmsTopicConnector;
        }

        /**
         * 设置jmsTopicConnector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJmsTopicConnector }
         *     
         */
        public void setJmsTopicConnector(DtoJmsTopicConnector value) {
            this.jmsTopicConnector = value;
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
                DtoJmsQueueConnector theJmsQueueConnector;
                theJmsQueueConnector = this.getJmsQueueConnector();
                strategy.appendField(locator, this, "jmsQueueConnector", buffer, theJmsQueueConnector);
            }
            {
                DtoJmsTopicConnector theJmsTopicConnector;
                theJmsTopicConnector = this.getJmsTopicConnector();
                strategy.appendField(locator, this, "jmsTopicConnector", buffer, theJmsTopicConnector);
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
                DtoJmsQueueConnector theJmsQueueConnector;
                theJmsQueueConnector = this.getJmsQueueConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsQueueConnector", theJmsQueueConnector), currentHashCode, theJmsQueueConnector);
            }
            {
                DtoJmsTopicConnector theJmsTopicConnector;
                theJmsTopicConnector = this.getJmsTopicConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsTopicConnector", theJmsTopicConnector), currentHashCode, theJmsTopicConnector);
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
            if (!(object instanceof DtoOutboundQueueBridge.JmsConnector)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.JmsConnector that = ((DtoOutboundQueueBridge.JmsConnector) object);
            {
                DtoJmsQueueConnector lhsJmsQueueConnector;
                lhsJmsQueueConnector = this.getJmsQueueConnector();
                DtoJmsQueueConnector rhsJmsQueueConnector;
                rhsJmsQueueConnector = that.getJmsQueueConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsQueueConnector", lhsJmsQueueConnector), LocatorUtils.property(thatLocator, "jmsQueueConnector", rhsJmsQueueConnector), lhsJmsQueueConnector, rhsJmsQueueConnector)) {
                    return false;
                }
            }
            {
                DtoJmsTopicConnector lhsJmsTopicConnector;
                lhsJmsTopicConnector = this.getJmsTopicConnector();
                DtoJmsTopicConnector rhsJmsTopicConnector;
                rhsJmsTopicConnector = that.getJmsTopicConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsTopicConnector", lhsJmsTopicConnector), LocatorUtils.property(thatLocator, "jmsTopicConnector", rhsJmsTopicConnector), lhsJmsTopicConnector, rhsJmsTopicConnector)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleJmsMessageConvertor"/>
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
        "simpleJmsMessageConvertor",
        "any"
    })
    public static class JmsMessageConvertor
        implements Equals, HashCode, ToString
    {

        protected DtoSimpleJmsMessageConvertor simpleJmsMessageConvertor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取simpleJmsMessageConvertor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSimpleJmsMessageConvertor }
         *     
         */
        public DtoSimpleJmsMessageConvertor getSimpleJmsMessageConvertor() {
            return simpleJmsMessageConvertor;
        }

        /**
         * 设置simpleJmsMessageConvertor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSimpleJmsMessageConvertor }
         *     
         */
        public void setSimpleJmsMessageConvertor(DtoSimpleJmsMessageConvertor value) {
            this.simpleJmsMessageConvertor = value;
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
                DtoSimpleJmsMessageConvertor theSimpleJmsMessageConvertor;
                theSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                strategy.appendField(locator, this, "simpleJmsMessageConvertor", buffer, theSimpleJmsMessageConvertor);
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
                DtoSimpleJmsMessageConvertor theSimpleJmsMessageConvertor;
                theSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleJmsMessageConvertor", theSimpleJmsMessageConvertor), currentHashCode, theSimpleJmsMessageConvertor);
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
            if (!(object instanceof DtoOutboundQueueBridge.JmsMessageConvertor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.JmsMessageConvertor that = ((DtoOutboundQueueBridge.JmsMessageConvertor) object);
            {
                DtoSimpleJmsMessageConvertor lhsSimpleJmsMessageConvertor;
                lhsSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                DtoSimpleJmsMessageConvertor rhsSimpleJmsMessageConvertor;
                rhsSimpleJmsMessageConvertor = that.getSimpleJmsMessageConvertor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleJmsMessageConvertor", lhsSimpleJmsMessageConvertor), LocatorUtils.property(thatLocator, "simpleJmsMessageConvertor", rhsSimpleJmsMessageConvertor), lhsSimpleJmsMessageConvertor, rhsSimpleJmsMessageConvertor)) {
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
    public static class ProducerConnection
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
            if (!(object instanceof DtoOutboundQueueBridge.ProducerConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.ProducerConnection that = ((DtoOutboundQueueBridge.ProducerConnection) object);
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
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
        "any"
    })
    public static class ProducerQueue
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
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
            if (!(object instanceof DtoOutboundQueueBridge.ProducerQueue)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundQueueBridge.ProducerQueue that = ((DtoOutboundQueueBridge.ProducerQueue) object);
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
