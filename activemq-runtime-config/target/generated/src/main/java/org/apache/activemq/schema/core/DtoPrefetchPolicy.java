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
 *       &lt;attribute name="all" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="durableTopicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="inputStreamPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumPendingMessageLimit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="optimizeDurableTopicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="queueBrowserPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="queuePrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="topicPrefetch" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlRootElement(name = "prefetchPolicy")
public class DtoPrefetchPolicy
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "all")
    protected BigInteger all;
    @XmlAttribute(name = "durableTopicPrefetch")
    protected BigInteger durableTopicPrefetch;
    @XmlAttribute(name = "inputStreamPrefetch")
    protected BigInteger inputStreamPrefetch;
    @XmlAttribute(name = "maximumPendingMessageLimit")
    protected BigInteger maximumPendingMessageLimit;
    @XmlAttribute(name = "optimizeDurableTopicPrefetch")
    protected BigInteger optimizeDurableTopicPrefetch;
    @XmlAttribute(name = "queueBrowserPrefetch")
    protected BigInteger queueBrowserPrefetch;
    @XmlAttribute(name = "queuePrefetch")
    protected BigInteger queuePrefetch;
    @XmlAttribute(name = "topicPrefetch")
    protected BigInteger topicPrefetch;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取all属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAll() {
        return all;
    }

    /**
     * 设置all属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAll(BigInteger value) {
        this.all = value;
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
     * 获取inputStreamPrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInputStreamPrefetch() {
        return inputStreamPrefetch;
    }

    /**
     * 设置inputStreamPrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInputStreamPrefetch(BigInteger value) {
        this.inputStreamPrefetch = value;
    }

    /**
     * 获取maximumPendingMessageLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPendingMessageLimit() {
        return maximumPendingMessageLimit;
    }

    /**
     * 设置maximumPendingMessageLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPendingMessageLimit(BigInteger value) {
        this.maximumPendingMessageLimit = value;
    }

    /**
     * 获取optimizeDurableTopicPrefetch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimizeDurableTopicPrefetch() {
        return optimizeDurableTopicPrefetch;
    }

    /**
     * 设置optimizeDurableTopicPrefetch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimizeDurableTopicPrefetch(BigInteger value) {
        this.optimizeDurableTopicPrefetch = value;
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
            BigInteger theAll;
            theAll = this.getAll();
            strategy.appendField(locator, this, "all", buffer, theAll);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            strategy.appendField(locator, this, "durableTopicPrefetch", buffer, theDurableTopicPrefetch);
        }
        {
            BigInteger theInputStreamPrefetch;
            theInputStreamPrefetch = this.getInputStreamPrefetch();
            strategy.appendField(locator, this, "inputStreamPrefetch", buffer, theInputStreamPrefetch);
        }
        {
            BigInteger theMaximumPendingMessageLimit;
            theMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            strategy.appendField(locator, this, "maximumPendingMessageLimit", buffer, theMaximumPendingMessageLimit);
        }
        {
            BigInteger theOptimizeDurableTopicPrefetch;
            theOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            strategy.appendField(locator, this, "optimizeDurableTopicPrefetch", buffer, theOptimizeDurableTopicPrefetch);
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
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            strategy.appendField(locator, this, "topicPrefetch", buffer, theTopicPrefetch);
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
            BigInteger theAll;
            theAll = this.getAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "all", theAll), currentHashCode, theAll);
        }
        {
            BigInteger theDurableTopicPrefetch;
            theDurableTopicPrefetch = this.getDurableTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableTopicPrefetch", theDurableTopicPrefetch), currentHashCode, theDurableTopicPrefetch);
        }
        {
            BigInteger theInputStreamPrefetch;
            theInputStreamPrefetch = this.getInputStreamPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputStreamPrefetch", theInputStreamPrefetch), currentHashCode, theInputStreamPrefetch);
        }
        {
            BigInteger theMaximumPendingMessageLimit;
            theMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumPendingMessageLimit", theMaximumPendingMessageLimit), currentHashCode, theMaximumPendingMessageLimit);
        }
        {
            BigInteger theOptimizeDurableTopicPrefetch;
            theOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizeDurableTopicPrefetch", theOptimizeDurableTopicPrefetch), currentHashCode, theOptimizeDurableTopicPrefetch);
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
            BigInteger theTopicPrefetch;
            theTopicPrefetch = this.getTopicPrefetch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicPrefetch", theTopicPrefetch), currentHashCode, theTopicPrefetch);
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
        if (!(object instanceof DtoPrefetchPolicy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPrefetchPolicy that = ((DtoPrefetchPolicy) object);
        {
            BigInteger lhsAll;
            lhsAll = this.getAll();
            BigInteger rhsAll;
            rhsAll = that.getAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "all", lhsAll), LocatorUtils.property(thatLocator, "all", rhsAll), lhsAll, rhsAll)) {
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
            BigInteger lhsInputStreamPrefetch;
            lhsInputStreamPrefetch = this.getInputStreamPrefetch();
            BigInteger rhsInputStreamPrefetch;
            rhsInputStreamPrefetch = that.getInputStreamPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputStreamPrefetch", lhsInputStreamPrefetch), LocatorUtils.property(thatLocator, "inputStreamPrefetch", rhsInputStreamPrefetch), lhsInputStreamPrefetch, rhsInputStreamPrefetch)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumPendingMessageLimit;
            lhsMaximumPendingMessageLimit = this.getMaximumPendingMessageLimit();
            BigInteger rhsMaximumPendingMessageLimit;
            rhsMaximumPendingMessageLimit = that.getMaximumPendingMessageLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumPendingMessageLimit", lhsMaximumPendingMessageLimit), LocatorUtils.property(thatLocator, "maximumPendingMessageLimit", rhsMaximumPendingMessageLimit), lhsMaximumPendingMessageLimit, rhsMaximumPendingMessageLimit)) {
                return false;
            }
        }
        {
            BigInteger lhsOptimizeDurableTopicPrefetch;
            lhsOptimizeDurableTopicPrefetch = this.getOptimizeDurableTopicPrefetch();
            BigInteger rhsOptimizeDurableTopicPrefetch;
            rhsOptimizeDurableTopicPrefetch = that.getOptimizeDurableTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizeDurableTopicPrefetch", lhsOptimizeDurableTopicPrefetch), LocatorUtils.property(thatLocator, "optimizeDurableTopicPrefetch", rhsOptimizeDurableTopicPrefetch), lhsOptimizeDurableTopicPrefetch, rhsOptimizeDurableTopicPrefetch)) {
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
            BigInteger lhsTopicPrefetch;
            lhsTopicPrefetch = this.getTopicPrefetch();
            BigInteger rhsTopicPrefetch;
            rhsTopicPrefetch = that.getTopicPrefetch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicPrefetch", lhsTopicPrefetch), LocatorUtils.property(thatLocator, "topicPrefetch", rhsTopicPrefetch), lhsTopicPrefetch, rhsTopicPrefetch)) {
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
