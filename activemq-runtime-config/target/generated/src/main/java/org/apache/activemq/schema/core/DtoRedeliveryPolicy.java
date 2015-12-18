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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="backOffMultiplier" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="collisionAvoidancePercent" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initialRedeliveryDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maximumRedeliveries" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumRedeliveryDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="queue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeliveryDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tempQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tempTopic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useCollisionAvoidance" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useExponentialBackOff" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "destinationOrAny"
})
@XmlRootElement(name = "redeliveryPolicy")
public class DtoRedeliveryPolicy
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "destination", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> destinationOrAny;
    @XmlAttribute(name = "backOffMultiplier")
    protected Double backOffMultiplier;
    @XmlAttribute(name = "collisionAvoidancePercent")
    protected Short collisionAvoidancePercent;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "initialRedeliveryDelay")
    protected Long initialRedeliveryDelay;
    @XmlAttribute(name = "maximumRedeliveries")
    protected BigInteger maximumRedeliveries;
    @XmlAttribute(name = "maximumRedeliveryDelay")
    protected Long maximumRedeliveryDelay;
    @XmlAttribute(name = "queue")
    protected String queue;
    @XmlAttribute(name = "redeliveryDelay")
    protected Long redeliveryDelay;
    @XmlAttribute(name = "tempQueue")
    protected Boolean tempQueue;
    @XmlAttribute(name = "tempTopic")
    protected Boolean tempTopic;
    @XmlAttribute(name = "topic")
    protected String topic;
    @XmlAttribute(name = "useCollisionAvoidance")
    protected Boolean useCollisionAvoidance;
    @XmlAttribute(name = "useExponentialBackOff")
    protected Boolean useExponentialBackOff;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the destinationOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoRedeliveryPolicy.Destination }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDestinationOrAny() {
        if (destinationOrAny == null) {
            destinationOrAny = new ArrayList<Object>();
        }
        return this.destinationOrAny;
    }

    /**
     * 获取backOffMultiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBackOffMultiplier() {
        return backOffMultiplier;
    }

    /**
     * 设置backOffMultiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBackOffMultiplier(Double value) {
        this.backOffMultiplier = value;
    }

    /**
     * 获取collisionAvoidancePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCollisionAvoidancePercent() {
        return collisionAvoidancePercent;
    }

    /**
     * 设置collisionAvoidancePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCollisionAvoidancePercent(Short value) {
        this.collisionAvoidancePercent = value;
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
     * 获取initialRedeliveryDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialRedeliveryDelay() {
        return initialRedeliveryDelay;
    }

    /**
     * 设置initialRedeliveryDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialRedeliveryDelay(Long value) {
        this.initialRedeliveryDelay = value;
    }

    /**
     * 获取maximumRedeliveries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRedeliveries() {
        return maximumRedeliveries;
    }

    /**
     * 设置maximumRedeliveries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRedeliveries(BigInteger value) {
        this.maximumRedeliveries = value;
    }

    /**
     * 获取maximumRedeliveryDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumRedeliveryDelay() {
        return maximumRedeliveryDelay;
    }

    /**
     * 设置maximumRedeliveryDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumRedeliveryDelay(Long value) {
        this.maximumRedeliveryDelay = value;
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
     * 获取redeliveryDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRedeliveryDelay() {
        return redeliveryDelay;
    }

    /**
     * 设置redeliveryDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRedeliveryDelay(Long value) {
        this.redeliveryDelay = value;
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
     * 获取useCollisionAvoidance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCollisionAvoidance() {
        return useCollisionAvoidance;
    }

    /**
     * 设置useCollisionAvoidance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCollisionAvoidance(Boolean value) {
        this.useCollisionAvoidance = value;
    }

    /**
     * 获取useExponentialBackOff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExponentialBackOff() {
        return useExponentialBackOff;
    }

    /**
     * 设置useExponentialBackOff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExponentialBackOff(Boolean value) {
        this.useExponentialBackOff = value;
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
            List<Object> theDestinationOrAny;
            theDestinationOrAny = (((this.destinationOrAny!= null)&&(!this.destinationOrAny.isEmpty()))?this.getDestinationOrAny():null);
            strategy.appendField(locator, this, "destinationOrAny", buffer, theDestinationOrAny);
        }
        {
            Double theBackOffMultiplier;
            theBackOffMultiplier = this.getBackOffMultiplier();
            strategy.appendField(locator, this, "backOffMultiplier", buffer, theBackOffMultiplier);
        }
        {
            Short theCollisionAvoidancePercent;
            theCollisionAvoidancePercent = this.getCollisionAvoidancePercent();
            strategy.appendField(locator, this, "collisionAvoidancePercent", buffer, theCollisionAvoidancePercent);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            Long theInitialRedeliveryDelay;
            theInitialRedeliveryDelay = this.getInitialRedeliveryDelay();
            strategy.appendField(locator, this, "initialRedeliveryDelay", buffer, theInitialRedeliveryDelay);
        }
        {
            BigInteger theMaximumRedeliveries;
            theMaximumRedeliveries = this.getMaximumRedeliveries();
            strategy.appendField(locator, this, "maximumRedeliveries", buffer, theMaximumRedeliveries);
        }
        {
            Long theMaximumRedeliveryDelay;
            theMaximumRedeliveryDelay = this.getMaximumRedeliveryDelay();
            strategy.appendField(locator, this, "maximumRedeliveryDelay", buffer, theMaximumRedeliveryDelay);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            strategy.appendField(locator, this, "queue", buffer, theQueue);
        }
        {
            Long theRedeliveryDelay;
            theRedeliveryDelay = this.getRedeliveryDelay();
            strategy.appendField(locator, this, "redeliveryDelay", buffer, theRedeliveryDelay);
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
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            Boolean theUseCollisionAvoidance;
            theUseCollisionAvoidance = this.isUseCollisionAvoidance();
            strategy.appendField(locator, this, "useCollisionAvoidance", buffer, theUseCollisionAvoidance);
        }
        {
            Boolean theUseExponentialBackOff;
            theUseExponentialBackOff = this.isUseExponentialBackOff();
            strategy.appendField(locator, this, "useExponentialBackOff", buffer, theUseExponentialBackOff);
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
            List<Object> theDestinationOrAny;
            theDestinationOrAny = (((this.destinationOrAny!= null)&&(!this.destinationOrAny.isEmpty()))?this.getDestinationOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationOrAny", theDestinationOrAny), currentHashCode, theDestinationOrAny);
        }
        {
            Double theBackOffMultiplier;
            theBackOffMultiplier = this.getBackOffMultiplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backOffMultiplier", theBackOffMultiplier), currentHashCode, theBackOffMultiplier);
        }
        {
            Short theCollisionAvoidancePercent;
            theCollisionAvoidancePercent = this.getCollisionAvoidancePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collisionAvoidancePercent", theCollisionAvoidancePercent), currentHashCode, theCollisionAvoidancePercent);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            Long theInitialRedeliveryDelay;
            theInitialRedeliveryDelay = this.getInitialRedeliveryDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initialRedeliveryDelay", theInitialRedeliveryDelay), currentHashCode, theInitialRedeliveryDelay);
        }
        {
            BigInteger theMaximumRedeliveries;
            theMaximumRedeliveries = this.getMaximumRedeliveries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumRedeliveries", theMaximumRedeliveries), currentHashCode, theMaximumRedeliveries);
        }
        {
            Long theMaximumRedeliveryDelay;
            theMaximumRedeliveryDelay = this.getMaximumRedeliveryDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumRedeliveryDelay", theMaximumRedeliveryDelay), currentHashCode, theMaximumRedeliveryDelay);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
        }
        {
            Long theRedeliveryDelay;
            theRedeliveryDelay = this.getRedeliveryDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryDelay", theRedeliveryDelay), currentHashCode, theRedeliveryDelay);
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
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            Boolean theUseCollisionAvoidance;
            theUseCollisionAvoidance = this.isUseCollisionAvoidance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCollisionAvoidance", theUseCollisionAvoidance), currentHashCode, theUseCollisionAvoidance);
        }
        {
            Boolean theUseExponentialBackOff;
            theUseExponentialBackOff = this.isUseExponentialBackOff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useExponentialBackOff", theUseExponentialBackOff), currentHashCode, theUseExponentialBackOff);
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
        if (!(object instanceof DtoRedeliveryPolicy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoRedeliveryPolicy that = ((DtoRedeliveryPolicy) object);
        {
            List<Object> lhsDestinationOrAny;
            lhsDestinationOrAny = (((this.destinationOrAny!= null)&&(!this.destinationOrAny.isEmpty()))?this.getDestinationOrAny():null);
            List<Object> rhsDestinationOrAny;
            rhsDestinationOrAny = (((that.destinationOrAny!= null)&&(!that.destinationOrAny.isEmpty()))?that.getDestinationOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationOrAny", lhsDestinationOrAny), LocatorUtils.property(thatLocator, "destinationOrAny", rhsDestinationOrAny), lhsDestinationOrAny, rhsDestinationOrAny)) {
                return false;
            }
        }
        {
            Double lhsBackOffMultiplier;
            lhsBackOffMultiplier = this.getBackOffMultiplier();
            Double rhsBackOffMultiplier;
            rhsBackOffMultiplier = that.getBackOffMultiplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backOffMultiplier", lhsBackOffMultiplier), LocatorUtils.property(thatLocator, "backOffMultiplier", rhsBackOffMultiplier), lhsBackOffMultiplier, rhsBackOffMultiplier)) {
                return false;
            }
        }
        {
            Short lhsCollisionAvoidancePercent;
            lhsCollisionAvoidancePercent = this.getCollisionAvoidancePercent();
            Short rhsCollisionAvoidancePercent;
            rhsCollisionAvoidancePercent = that.getCollisionAvoidancePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collisionAvoidancePercent", lhsCollisionAvoidancePercent), LocatorUtils.property(thatLocator, "collisionAvoidancePercent", rhsCollisionAvoidancePercent), lhsCollisionAvoidancePercent, rhsCollisionAvoidancePercent)) {
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
            Long lhsInitialRedeliveryDelay;
            lhsInitialRedeliveryDelay = this.getInitialRedeliveryDelay();
            Long rhsInitialRedeliveryDelay;
            rhsInitialRedeliveryDelay = that.getInitialRedeliveryDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initialRedeliveryDelay", lhsInitialRedeliveryDelay), LocatorUtils.property(thatLocator, "initialRedeliveryDelay", rhsInitialRedeliveryDelay), lhsInitialRedeliveryDelay, rhsInitialRedeliveryDelay)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumRedeliveries;
            lhsMaximumRedeliveries = this.getMaximumRedeliveries();
            BigInteger rhsMaximumRedeliveries;
            rhsMaximumRedeliveries = that.getMaximumRedeliveries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumRedeliveries", lhsMaximumRedeliveries), LocatorUtils.property(thatLocator, "maximumRedeliveries", rhsMaximumRedeliveries), lhsMaximumRedeliveries, rhsMaximumRedeliveries)) {
                return false;
            }
        }
        {
            Long lhsMaximumRedeliveryDelay;
            lhsMaximumRedeliveryDelay = this.getMaximumRedeliveryDelay();
            Long rhsMaximumRedeliveryDelay;
            rhsMaximumRedeliveryDelay = that.getMaximumRedeliveryDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumRedeliveryDelay", lhsMaximumRedeliveryDelay), LocatorUtils.property(thatLocator, "maximumRedeliveryDelay", rhsMaximumRedeliveryDelay), lhsMaximumRedeliveryDelay, rhsMaximumRedeliveryDelay)) {
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
            Long lhsRedeliveryDelay;
            lhsRedeliveryDelay = this.getRedeliveryDelay();
            Long rhsRedeliveryDelay;
            rhsRedeliveryDelay = that.getRedeliveryDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryDelay", lhsRedeliveryDelay), LocatorUtils.property(thatLocator, "redeliveryDelay", rhsRedeliveryDelay), lhsRedeliveryDelay, rhsRedeliveryDelay)) {
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
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            Boolean lhsUseCollisionAvoidance;
            lhsUseCollisionAvoidance = this.isUseCollisionAvoidance();
            Boolean rhsUseCollisionAvoidance;
            rhsUseCollisionAvoidance = that.isUseCollisionAvoidance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCollisionAvoidance", lhsUseCollisionAvoidance), LocatorUtils.property(thatLocator, "useCollisionAvoidance", rhsUseCollisionAvoidance), lhsUseCollisionAvoidance, rhsUseCollisionAvoidance)) {
                return false;
            }
        }
        {
            Boolean lhsUseExponentialBackOff;
            lhsUseExponentialBackOff = this.isUseExponentialBackOff();
            Boolean rhsUseExponentialBackOff;
            rhsUseExponentialBackOff = that.isUseExponentialBackOff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useExponentialBackOff", lhsUseExponentialBackOff), LocatorUtils.property(thatLocator, "useExponentialBackOff", rhsUseExponentialBackOff), lhsUseExponentialBackOff, rhsUseExponentialBackOff)) {
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
            if (!(object instanceof DtoRedeliveryPolicy.Destination)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoRedeliveryPolicy.Destination that = ((DtoRedeliveryPolicy.Destination) object);
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

}
