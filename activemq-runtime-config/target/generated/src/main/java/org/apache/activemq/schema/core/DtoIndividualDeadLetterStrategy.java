//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.17 时间 03:29:05 PM CST 
//


package org.apache.activemq.schema.core;

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
 *       &lt;attribute name="destinationPerDurableSubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="processExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="processNonPersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="queuePrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useQueueForQueueMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useQueueForTopicMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlRootElement(name = "individualDeadLetterStrategy")
public class DtoIndividualDeadLetterStrategy
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "destinationPerDurableSubscriber")
    protected Boolean destinationPerDurableSubscriber;
    @XmlAttribute(name = "enableAudit")
    protected Boolean enableAudit;
    @XmlAttribute(name = "processExpired")
    protected Boolean processExpired;
    @XmlAttribute(name = "processNonPersistent")
    protected Boolean processNonPersistent;
    @XmlAttribute(name = "queuePrefix")
    protected String queuePrefix;
    @XmlAttribute(name = "queueSuffix")
    protected String queueSuffix;
    @XmlAttribute(name = "topicPrefix")
    protected String topicPrefix;
    @XmlAttribute(name = "topicSuffix")
    protected String topicSuffix;
    @XmlAttribute(name = "useQueueForQueueMessages")
    protected Boolean useQueueForQueueMessages;
    @XmlAttribute(name = "useQueueForTopicMessages")
    protected Boolean useQueueForTopicMessages;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取destinationPerDurableSubscriber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationPerDurableSubscriber() {
        return destinationPerDurableSubscriber;
    }

    /**
     * 设置destinationPerDurableSubscriber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationPerDurableSubscriber(Boolean value) {
        this.destinationPerDurableSubscriber = value;
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
     * 获取processExpired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessExpired() {
        return processExpired;
    }

    /**
     * 设置processExpired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessExpired(Boolean value) {
        this.processExpired = value;
    }

    /**
     * 获取processNonPersistent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessNonPersistent() {
        return processNonPersistent;
    }

    /**
     * 设置processNonPersistent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessNonPersistent(Boolean value) {
        this.processNonPersistent = value;
    }

    /**
     * 获取queuePrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueuePrefix() {
        return queuePrefix;
    }

    /**
     * 设置queuePrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueuePrefix(String value) {
        this.queuePrefix = value;
    }

    /**
     * 获取queueSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSuffix() {
        return queueSuffix;
    }

    /**
     * 设置queueSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSuffix(String value) {
        this.queueSuffix = value;
    }

    /**
     * 获取topicPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicPrefix() {
        return topicPrefix;
    }

    /**
     * 设置topicPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicPrefix(String value) {
        this.topicPrefix = value;
    }

    /**
     * 获取topicSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicSuffix() {
        return topicSuffix;
    }

    /**
     * 设置topicSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicSuffix(String value) {
        this.topicSuffix = value;
    }

    /**
     * 获取useQueueForQueueMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseQueueForQueueMessages() {
        return useQueueForQueueMessages;
    }

    /**
     * 设置useQueueForQueueMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseQueueForQueueMessages(Boolean value) {
        this.useQueueForQueueMessages = value;
    }

    /**
     * 获取useQueueForTopicMessages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseQueueForTopicMessages() {
        return useQueueForTopicMessages;
    }

    /**
     * 设置useQueueForTopicMessages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseQueueForTopicMessages(Boolean value) {
        this.useQueueForTopicMessages = value;
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
            Boolean theDestinationPerDurableSubscriber;
            theDestinationPerDurableSubscriber = this.isDestinationPerDurableSubscriber();
            strategy.appendField(locator, this, "destinationPerDurableSubscriber", buffer, theDestinationPerDurableSubscriber);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            strategy.appendField(locator, this, "enableAudit", buffer, theEnableAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            strategy.appendField(locator, this, "processExpired", buffer, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            strategy.appendField(locator, this, "processNonPersistent", buffer, theProcessNonPersistent);
        }
        {
            String theQueuePrefix;
            theQueuePrefix = this.getQueuePrefix();
            strategy.appendField(locator, this, "queuePrefix", buffer, theQueuePrefix);
        }
        {
            String theQueueSuffix;
            theQueueSuffix = this.getQueueSuffix();
            strategy.appendField(locator, this, "queueSuffix", buffer, theQueueSuffix);
        }
        {
            String theTopicPrefix;
            theTopicPrefix = this.getTopicPrefix();
            strategy.appendField(locator, this, "topicPrefix", buffer, theTopicPrefix);
        }
        {
            String theTopicSuffix;
            theTopicSuffix = this.getTopicSuffix();
            strategy.appendField(locator, this, "topicSuffix", buffer, theTopicSuffix);
        }
        {
            Boolean theUseQueueForQueueMessages;
            theUseQueueForQueueMessages = this.isUseQueueForQueueMessages();
            strategy.appendField(locator, this, "useQueueForQueueMessages", buffer, theUseQueueForQueueMessages);
        }
        {
            Boolean theUseQueueForTopicMessages;
            theUseQueueForTopicMessages = this.isUseQueueForTopicMessages();
            strategy.appendField(locator, this, "useQueueForTopicMessages", buffer, theUseQueueForTopicMessages);
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
            Boolean theDestinationPerDurableSubscriber;
            theDestinationPerDurableSubscriber = this.isDestinationPerDurableSubscriber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationPerDurableSubscriber", theDestinationPerDurableSubscriber), currentHashCode, theDestinationPerDurableSubscriber);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableAudit", theEnableAudit), currentHashCode, theEnableAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processExpired", theProcessExpired), currentHashCode, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processNonPersistent", theProcessNonPersistent), currentHashCode, theProcessNonPersistent);
        }
        {
            String theQueuePrefix;
            theQueuePrefix = this.getQueuePrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queuePrefix", theQueuePrefix), currentHashCode, theQueuePrefix);
        }
        {
            String theQueueSuffix;
            theQueueSuffix = this.getQueueSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueSuffix", theQueueSuffix), currentHashCode, theQueueSuffix);
        }
        {
            String theTopicPrefix;
            theTopicPrefix = this.getTopicPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicPrefix", theTopicPrefix), currentHashCode, theTopicPrefix);
        }
        {
            String theTopicSuffix;
            theTopicSuffix = this.getTopicSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicSuffix", theTopicSuffix), currentHashCode, theTopicSuffix);
        }
        {
            Boolean theUseQueueForQueueMessages;
            theUseQueueForQueueMessages = this.isUseQueueForQueueMessages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useQueueForQueueMessages", theUseQueueForQueueMessages), currentHashCode, theUseQueueForQueueMessages);
        }
        {
            Boolean theUseQueueForTopicMessages;
            theUseQueueForTopicMessages = this.isUseQueueForTopicMessages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useQueueForTopicMessages", theUseQueueForTopicMessages), currentHashCode, theUseQueueForTopicMessages);
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
        if (!(object instanceof DtoIndividualDeadLetterStrategy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoIndividualDeadLetterStrategy that = ((DtoIndividualDeadLetterStrategy) object);
        {
            Boolean lhsDestinationPerDurableSubscriber;
            lhsDestinationPerDurableSubscriber = this.isDestinationPerDurableSubscriber();
            Boolean rhsDestinationPerDurableSubscriber;
            rhsDestinationPerDurableSubscriber = that.isDestinationPerDurableSubscriber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationPerDurableSubscriber", lhsDestinationPerDurableSubscriber), LocatorUtils.property(thatLocator, "destinationPerDurableSubscriber", rhsDestinationPerDurableSubscriber), lhsDestinationPerDurableSubscriber, rhsDestinationPerDurableSubscriber)) {
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
            Boolean lhsProcessExpired;
            lhsProcessExpired = this.isProcessExpired();
            Boolean rhsProcessExpired;
            rhsProcessExpired = that.isProcessExpired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processExpired", lhsProcessExpired), LocatorUtils.property(thatLocator, "processExpired", rhsProcessExpired), lhsProcessExpired, rhsProcessExpired)) {
                return false;
            }
        }
        {
            Boolean lhsProcessNonPersistent;
            lhsProcessNonPersistent = this.isProcessNonPersistent();
            Boolean rhsProcessNonPersistent;
            rhsProcessNonPersistent = that.isProcessNonPersistent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processNonPersistent", lhsProcessNonPersistent), LocatorUtils.property(thatLocator, "processNonPersistent", rhsProcessNonPersistent), lhsProcessNonPersistent, rhsProcessNonPersistent)) {
                return false;
            }
        }
        {
            String lhsQueuePrefix;
            lhsQueuePrefix = this.getQueuePrefix();
            String rhsQueuePrefix;
            rhsQueuePrefix = that.getQueuePrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queuePrefix", lhsQueuePrefix), LocatorUtils.property(thatLocator, "queuePrefix", rhsQueuePrefix), lhsQueuePrefix, rhsQueuePrefix)) {
                return false;
            }
        }
        {
            String lhsQueueSuffix;
            lhsQueueSuffix = this.getQueueSuffix();
            String rhsQueueSuffix;
            rhsQueueSuffix = that.getQueueSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueSuffix", lhsQueueSuffix), LocatorUtils.property(thatLocator, "queueSuffix", rhsQueueSuffix), lhsQueueSuffix, rhsQueueSuffix)) {
                return false;
            }
        }
        {
            String lhsTopicPrefix;
            lhsTopicPrefix = this.getTopicPrefix();
            String rhsTopicPrefix;
            rhsTopicPrefix = that.getTopicPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicPrefix", lhsTopicPrefix), LocatorUtils.property(thatLocator, "topicPrefix", rhsTopicPrefix), lhsTopicPrefix, rhsTopicPrefix)) {
                return false;
            }
        }
        {
            String lhsTopicSuffix;
            lhsTopicSuffix = this.getTopicSuffix();
            String rhsTopicSuffix;
            rhsTopicSuffix = that.getTopicSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicSuffix", lhsTopicSuffix), LocatorUtils.property(thatLocator, "topicSuffix", rhsTopicSuffix), lhsTopicSuffix, rhsTopicSuffix)) {
                return false;
            }
        }
        {
            Boolean lhsUseQueueForQueueMessages;
            lhsUseQueueForQueueMessages = this.isUseQueueForQueueMessages();
            Boolean rhsUseQueueForQueueMessages;
            rhsUseQueueForQueueMessages = that.isUseQueueForQueueMessages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useQueueForQueueMessages", lhsUseQueueForQueueMessages), LocatorUtils.property(thatLocator, "useQueueForQueueMessages", rhsUseQueueForQueueMessages), lhsUseQueueForQueueMessages, rhsUseQueueForQueueMessages)) {
                return false;
            }
        }
        {
            Boolean lhsUseQueueForTopicMessages;
            lhsUseQueueForTopicMessages = this.isUseQueueForTopicMessages();
            Boolean rhsUseQueueForTopicMessages;
            rhsUseQueueForTopicMessages = that.isUseQueueForTopicMessages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useQueueForTopicMessages", lhsUseQueueForTopicMessages), LocatorUtils.property(thatLocator, "useQueueForTopicMessages", rhsUseQueueForTopicMessages), lhsUseQueueForTopicMessages, rhsUseQueueForTopicMessages)) {
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
