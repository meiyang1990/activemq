//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.17 时间 03:29:05 PM CST 
//


package org.apache.activemq.schema.core;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy;
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
 *       &lt;attribute name="rateDuration" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rateLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="replayDelay" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="replayWhenNoConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "")
@XmlRootElement(name = "conditionalNetworkBridgeFilterFactory")
public class DtoConditionalNetworkBridgeFilterFactory
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "rateDuration")
    protected BigInteger rateDuration;
    @XmlAttribute(name = "rateLimit")
    protected BigInteger rateLimit;
    @XmlAttribute(name = "replayDelay")
    protected BigInteger replayDelay;
    @XmlAttribute(name = "replayWhenNoConsumers")
    protected Boolean replayWhenNoConsumers;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取rateDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateDuration() {
        return rateDuration;
    }

    /**
     * 设置rateDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateDuration(BigInteger value) {
        this.rateDuration = value;
    }

    /**
     * 获取rateLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRateLimit() {
        return rateLimit;
    }

    /**
     * 设置rateLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRateLimit(BigInteger value) {
        this.rateLimit = value;
    }

    /**
     * 获取replayDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplayDelay() {
        return replayDelay;
    }

    /**
     * 设置replayDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplayDelay(BigInteger value) {
        this.replayDelay = value;
    }

    /**
     * 获取replayWhenNoConsumers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplayWhenNoConsumers() {
        return replayWhenNoConsumers;
    }

    /**
     * 设置replayWhenNoConsumers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplayWhenNoConsumers(Boolean value) {
        this.replayWhenNoConsumers = value;
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
            BigInteger theRateDuration;
            theRateDuration = this.getRateDuration();
            strategy.appendField(locator, this, "rateDuration", buffer, theRateDuration);
        }
        {
            BigInteger theRateLimit;
            theRateLimit = this.getRateLimit();
            strategy.appendField(locator, this, "rateLimit", buffer, theRateLimit);
        }
        {
            BigInteger theReplayDelay;
            theReplayDelay = this.getReplayDelay();
            strategy.appendField(locator, this, "replayDelay", buffer, theReplayDelay);
        }
        {
            Boolean theReplayWhenNoConsumers;
            theReplayWhenNoConsumers = this.isReplayWhenNoConsumers();
            strategy.appendField(locator, this, "replayWhenNoConsumers", buffer, theReplayWhenNoConsumers);
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
            BigInteger theRateDuration;
            theRateDuration = this.getRateDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateDuration", theRateDuration), currentHashCode, theRateDuration);
        }
        {
            BigInteger theRateLimit;
            theRateLimit = this.getRateLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateLimit", theRateLimit), currentHashCode, theRateLimit);
        }
        {
            BigInteger theReplayDelay;
            theReplayDelay = this.getReplayDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replayDelay", theReplayDelay), currentHashCode, theReplayDelay);
        }
        {
            Boolean theReplayWhenNoConsumers;
            theReplayWhenNoConsumers = this.isReplayWhenNoConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replayWhenNoConsumers", theReplayWhenNoConsumers), currentHashCode, theReplayWhenNoConsumers);
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
        if (!(object instanceof DtoConditionalNetworkBridgeFilterFactory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoConditionalNetworkBridgeFilterFactory that = ((DtoConditionalNetworkBridgeFilterFactory) object);
        {
            BigInteger lhsRateDuration;
            lhsRateDuration = this.getRateDuration();
            BigInteger rhsRateDuration;
            rhsRateDuration = that.getRateDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateDuration", lhsRateDuration), LocatorUtils.property(thatLocator, "rateDuration", rhsRateDuration), lhsRateDuration, rhsRateDuration)) {
                return false;
            }
        }
        {
            BigInteger lhsRateLimit;
            lhsRateLimit = this.getRateLimit();
            BigInteger rhsRateLimit;
            rhsRateLimit = that.getRateLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateLimit", lhsRateLimit), LocatorUtils.property(thatLocator, "rateLimit", rhsRateLimit), lhsRateLimit, rhsRateLimit)) {
                return false;
            }
        }
        {
            BigInteger lhsReplayDelay;
            lhsReplayDelay = this.getReplayDelay();
            BigInteger rhsReplayDelay;
            rhsReplayDelay = that.getReplayDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replayDelay", lhsReplayDelay), LocatorUtils.property(thatLocator, "replayDelay", rhsReplayDelay), lhsReplayDelay, rhsReplayDelay)) {
                return false;
            }
        }
        {
            Boolean lhsReplayWhenNoConsumers;
            lhsReplayWhenNoConsumers = this.isReplayWhenNoConsumers();
            Boolean rhsReplayWhenNoConsumers;
            rhsReplayWhenNoConsumers = that.isReplayWhenNoConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replayWhenNoConsumers", lhsReplayWhenNoConsumers), LocatorUtils.property(thatLocator, "replayWhenNoConsumers", rhsReplayWhenNoConsumers), lhsReplayWhenNoConsumers, rhsReplayWhenNoConsumers)) {
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
        final EqualsStrategy strategy = new ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }

}
