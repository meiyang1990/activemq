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
 *       &lt;attribute name="backOffMultiplier" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="initialReconnectDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxInitialConnectAttempts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxReconnectAttempts" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxSendRetries" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumReconnectDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sendRetyDelay" type="{http://www.w3.org/2001/XMLSchema}long" />
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
@XmlType(name = "")
@XmlRootElement(name = "reconnectionPolicy")
public class DtoReconnectionPolicy
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "backOffMultiplier")
    protected Double backOffMultiplier;
    @XmlAttribute(name = "initialReconnectDelay")
    protected Long initialReconnectDelay;
    @XmlAttribute(name = "maxInitialConnectAttempts")
    protected BigInteger maxInitialConnectAttempts;
    @XmlAttribute(name = "maxReconnectAttempts")
    protected BigInteger maxReconnectAttempts;
    @XmlAttribute(name = "maxSendRetries")
    protected BigInteger maxSendRetries;
    @XmlAttribute(name = "maximumReconnectDelay")
    protected Long maximumReconnectDelay;
    @XmlAttribute(name = "sendRetyDelay")
    protected Long sendRetyDelay;
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
     * 获取initialReconnectDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialReconnectDelay() {
        return initialReconnectDelay;
    }

    /**
     * 设置initialReconnectDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialReconnectDelay(Long value) {
        this.initialReconnectDelay = value;
    }

    /**
     * 获取maxInitialConnectAttempts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxInitialConnectAttempts() {
        return maxInitialConnectAttempts;
    }

    /**
     * 设置maxInitialConnectAttempts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxInitialConnectAttempts(BigInteger value) {
        this.maxInitialConnectAttempts = value;
    }

    /**
     * 获取maxReconnectAttempts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxReconnectAttempts() {
        return maxReconnectAttempts;
    }

    /**
     * 设置maxReconnectAttempts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxReconnectAttempts(BigInteger value) {
        this.maxReconnectAttempts = value;
    }

    /**
     * 获取maxSendRetries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSendRetries() {
        return maxSendRetries;
    }

    /**
     * 设置maxSendRetries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSendRetries(BigInteger value) {
        this.maxSendRetries = value;
    }

    /**
     * 获取maximumReconnectDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumReconnectDelay() {
        return maximumReconnectDelay;
    }

    /**
     * 设置maximumReconnectDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumReconnectDelay(Long value) {
        this.maximumReconnectDelay = value;
    }

    /**
     * 获取sendRetyDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendRetyDelay() {
        return sendRetyDelay;
    }

    /**
     * 设置sendRetyDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendRetyDelay(Long value) {
        this.sendRetyDelay = value;
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
            Double theBackOffMultiplier;
            theBackOffMultiplier = this.getBackOffMultiplier();
            strategy.appendField(locator, this, "backOffMultiplier", buffer, theBackOffMultiplier);
        }
        {
            Long theInitialReconnectDelay;
            theInitialReconnectDelay = this.getInitialReconnectDelay();
            strategy.appendField(locator, this, "initialReconnectDelay", buffer, theInitialReconnectDelay);
        }
        {
            BigInteger theMaxInitialConnectAttempts;
            theMaxInitialConnectAttempts = this.getMaxInitialConnectAttempts();
            strategy.appendField(locator, this, "maxInitialConnectAttempts", buffer, theMaxInitialConnectAttempts);
        }
        {
            BigInteger theMaxReconnectAttempts;
            theMaxReconnectAttempts = this.getMaxReconnectAttempts();
            strategy.appendField(locator, this, "maxReconnectAttempts", buffer, theMaxReconnectAttempts);
        }
        {
            BigInteger theMaxSendRetries;
            theMaxSendRetries = this.getMaxSendRetries();
            strategy.appendField(locator, this, "maxSendRetries", buffer, theMaxSendRetries);
        }
        {
            Long theMaximumReconnectDelay;
            theMaximumReconnectDelay = this.getMaximumReconnectDelay();
            strategy.appendField(locator, this, "maximumReconnectDelay", buffer, theMaximumReconnectDelay);
        }
        {
            Long theSendRetyDelay;
            theSendRetyDelay = this.getSendRetyDelay();
            strategy.appendField(locator, this, "sendRetyDelay", buffer, theSendRetyDelay);
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
            Double theBackOffMultiplier;
            theBackOffMultiplier = this.getBackOffMultiplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backOffMultiplier", theBackOffMultiplier), currentHashCode, theBackOffMultiplier);
        }
        {
            Long theInitialReconnectDelay;
            theInitialReconnectDelay = this.getInitialReconnectDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initialReconnectDelay", theInitialReconnectDelay), currentHashCode, theInitialReconnectDelay);
        }
        {
            BigInteger theMaxInitialConnectAttempts;
            theMaxInitialConnectAttempts = this.getMaxInitialConnectAttempts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxInitialConnectAttempts", theMaxInitialConnectAttempts), currentHashCode, theMaxInitialConnectAttempts);
        }
        {
            BigInteger theMaxReconnectAttempts;
            theMaxReconnectAttempts = this.getMaxReconnectAttempts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxReconnectAttempts", theMaxReconnectAttempts), currentHashCode, theMaxReconnectAttempts);
        }
        {
            BigInteger theMaxSendRetries;
            theMaxSendRetries = this.getMaxSendRetries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxSendRetries", theMaxSendRetries), currentHashCode, theMaxSendRetries);
        }
        {
            Long theMaximumReconnectDelay;
            theMaximumReconnectDelay = this.getMaximumReconnectDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumReconnectDelay", theMaximumReconnectDelay), currentHashCode, theMaximumReconnectDelay);
        }
        {
            Long theSendRetyDelay;
            theSendRetyDelay = this.getSendRetyDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendRetyDelay", theSendRetyDelay), currentHashCode, theSendRetyDelay);
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
        if (!(object instanceof DtoReconnectionPolicy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoReconnectionPolicy that = ((DtoReconnectionPolicy) object);
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
            Long lhsInitialReconnectDelay;
            lhsInitialReconnectDelay = this.getInitialReconnectDelay();
            Long rhsInitialReconnectDelay;
            rhsInitialReconnectDelay = that.getInitialReconnectDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initialReconnectDelay", lhsInitialReconnectDelay), LocatorUtils.property(thatLocator, "initialReconnectDelay", rhsInitialReconnectDelay), lhsInitialReconnectDelay, rhsInitialReconnectDelay)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxInitialConnectAttempts;
            lhsMaxInitialConnectAttempts = this.getMaxInitialConnectAttempts();
            BigInteger rhsMaxInitialConnectAttempts;
            rhsMaxInitialConnectAttempts = that.getMaxInitialConnectAttempts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxInitialConnectAttempts", lhsMaxInitialConnectAttempts), LocatorUtils.property(thatLocator, "maxInitialConnectAttempts", rhsMaxInitialConnectAttempts), lhsMaxInitialConnectAttempts, rhsMaxInitialConnectAttempts)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxReconnectAttempts;
            lhsMaxReconnectAttempts = this.getMaxReconnectAttempts();
            BigInteger rhsMaxReconnectAttempts;
            rhsMaxReconnectAttempts = that.getMaxReconnectAttempts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxReconnectAttempts", lhsMaxReconnectAttempts), LocatorUtils.property(thatLocator, "maxReconnectAttempts", rhsMaxReconnectAttempts), lhsMaxReconnectAttempts, rhsMaxReconnectAttempts)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxSendRetries;
            lhsMaxSendRetries = this.getMaxSendRetries();
            BigInteger rhsMaxSendRetries;
            rhsMaxSendRetries = that.getMaxSendRetries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxSendRetries", lhsMaxSendRetries), LocatorUtils.property(thatLocator, "maxSendRetries", rhsMaxSendRetries), lhsMaxSendRetries, rhsMaxSendRetries)) {
                return false;
            }
        }
        {
            Long lhsMaximumReconnectDelay;
            lhsMaximumReconnectDelay = this.getMaximumReconnectDelay();
            Long rhsMaximumReconnectDelay;
            rhsMaximumReconnectDelay = that.getMaximumReconnectDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumReconnectDelay", lhsMaximumReconnectDelay), LocatorUtils.property(thatLocator, "maximumReconnectDelay", rhsMaximumReconnectDelay), lhsMaximumReconnectDelay, rhsMaximumReconnectDelay)) {
                return false;
            }
        }
        {
            Long lhsSendRetyDelay;
            lhsSendRetyDelay = this.getSendRetyDelay();
            Long rhsSendRetyDelay;
            rhsSendRetyDelay = that.getSendRetyDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendRetyDelay", lhsSendRetyDelay), LocatorUtils.property(thatLocator, "sendRetyDelay", rhsSendRetyDelay), lhsSendRetyDelay, rhsSendRetyDelay)) {
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
        final EqualsStrategy strategy = new ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }

}
