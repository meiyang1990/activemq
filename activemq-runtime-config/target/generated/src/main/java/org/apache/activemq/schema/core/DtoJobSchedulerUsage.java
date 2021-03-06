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
 *           &lt;element name="executor" minOccurs="0">
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
 *           &lt;element name="limiter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}defaultUsageCapacity"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}usageCapacity"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="parent" minOccurs="0">
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
 *           &lt;element name="store" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="executor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="limiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="percentUsage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="percentUsageMinDelta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pollingTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="store" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usagePortion" type="{http://www.w3.org/2001/XMLSchema}float" />
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
    "executorOrLimiterOrParent"
})
@XmlRootElement(name = "jobSchedulerUsage")
public class DtoJobSchedulerUsage implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "parent", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "limiter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "executor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "store", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> executorOrLimiterOrParent;
    @XmlAttribute(name = "executor")
    protected String executor;
    @XmlAttribute(name = "limit")
    protected String limit;
    @XmlAttribute(name = "limiter")
    protected String limiter;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "parent")
    protected String parent;
    @XmlAttribute(name = "percentUsage")
    protected BigInteger percentUsage;
    @XmlAttribute(name = "percentUsageMinDelta")
    protected String percentUsageMinDelta;
    @XmlAttribute(name = "pollingTime")
    protected BigInteger pollingTime;
    @XmlAttribute(name = "store")
    protected String store;
    @XmlAttribute(name = "usagePortion")
    protected Float usagePortion;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the executorOrLimiterOrParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executorOrLimiterOrParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutorOrLimiterOrParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Limiter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Parent }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Executor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Store }{@code >}
     * 
     * 
     */
    public List<Object> getExecutorOrLimiterOrParent() {
        if (executorOrLimiterOrParent == null) {
            executorOrLimiterOrParent = new ArrayList<Object>();
        }
        return this.executorOrLimiterOrParent;
    }

    /**
     * 获取executor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * 设置executor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutor(String value) {
        this.executor = value;
    }

    /**
     * 获取limit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * 获取limiter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimiter() {
        return limiter;
    }

    /**
     * 设置limiter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimiter(String value) {
        this.limiter = value;
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
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * 获取percentUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentUsage() {
        return percentUsage;
    }

    /**
     * 设置percentUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentUsage(BigInteger value) {
        this.percentUsage = value;
    }

    /**
     * 获取percentUsageMinDelta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentUsageMinDelta() {
        return percentUsageMinDelta;
    }

    /**
     * 设置percentUsageMinDelta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentUsageMinDelta(String value) {
        this.percentUsageMinDelta = value;
    }

    /**
     * 获取pollingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPollingTime() {
        return pollingTime;
    }

    /**
     * 设置pollingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPollingTime(BigInteger value) {
        this.pollingTime = value;
    }

    /**
     * 获取store属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * 设置store属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

    /**
     * 获取usagePortion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUsagePortion() {
        return usagePortion;
    }

    /**
     * 设置usagePortion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUsagePortion(Float value) {
        this.usagePortion = value;
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
            List<Object> theExecutorOrLimiterOrParent;
            theExecutorOrLimiterOrParent = (((this.executorOrLimiterOrParent!= null)&&(!this.executorOrLimiterOrParent.isEmpty()))?this.getExecutorOrLimiterOrParent():null);
            strategy.appendField(locator, this, "executorOrLimiterOrParent", buffer, theExecutorOrLimiterOrParent);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            strategy.appendField(locator, this, "executor", buffer, theExecutor);
        }
        {
            String theLimit;
            theLimit = this.getLimit();
            strategy.appendField(locator, this, "limit", buffer, theLimit);
        }
        {
            String theLimiter;
            theLimiter = this.getLimiter();
            strategy.appendField(locator, this, "limiter", buffer, theLimiter);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent);
        }
        {
            BigInteger thePercentUsage;
            thePercentUsage = this.getPercentUsage();
            strategy.appendField(locator, this, "percentUsage", buffer, thePercentUsage);
        }
        {
            String thePercentUsageMinDelta;
            thePercentUsageMinDelta = this.getPercentUsageMinDelta();
            strategy.appendField(locator, this, "percentUsageMinDelta", buffer, thePercentUsageMinDelta);
        }
        {
            BigInteger thePollingTime;
            thePollingTime = this.getPollingTime();
            strategy.appendField(locator, this, "pollingTime", buffer, thePollingTime);
        }
        {
            String theStore;
            theStore = this.getStore();
            strategy.appendField(locator, this, "store", buffer, theStore);
        }
        {
            Float theUsagePortion;
            theUsagePortion = this.getUsagePortion();
            strategy.appendField(locator, this, "usagePortion", buffer, theUsagePortion);
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
            List<Object> theExecutorOrLimiterOrParent;
            theExecutorOrLimiterOrParent = (((this.executorOrLimiterOrParent!= null)&&(!this.executorOrLimiterOrParent.isEmpty()))?this.getExecutorOrLimiterOrParent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executorOrLimiterOrParent", theExecutorOrLimiterOrParent), currentHashCode, theExecutorOrLimiterOrParent);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executor", theExecutor), currentHashCode, theExecutor);
        }
        {
            String theLimit;
            theLimit = this.getLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limit", theLimit), currentHashCode, theLimit);
        }
        {
            String theLimiter;
            theLimiter = this.getLimiter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limiter", theLimiter), currentHashCode, theLimiter);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parent", theParent), currentHashCode, theParent);
        }
        {
            BigInteger thePercentUsage;
            thePercentUsage = this.getPercentUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentUsage", thePercentUsage), currentHashCode, thePercentUsage);
        }
        {
            String thePercentUsageMinDelta;
            thePercentUsageMinDelta = this.getPercentUsageMinDelta();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentUsageMinDelta", thePercentUsageMinDelta), currentHashCode, thePercentUsageMinDelta);
        }
        {
            BigInteger thePollingTime;
            thePollingTime = this.getPollingTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pollingTime", thePollingTime), currentHashCode, thePollingTime);
        }
        {
            String theStore;
            theStore = this.getStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "store", theStore), currentHashCode, theStore);
        }
        {
            Float theUsagePortion;
            theUsagePortion = this.getUsagePortion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usagePortion", theUsagePortion), currentHashCode, theUsagePortion);
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
        if (!(object instanceof DtoJobSchedulerUsage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoJobSchedulerUsage that = ((DtoJobSchedulerUsage) object);
        {
            List<Object> lhsExecutorOrLimiterOrParent;
            lhsExecutorOrLimiterOrParent = (((this.executorOrLimiterOrParent!= null)&&(!this.executorOrLimiterOrParent.isEmpty()))?this.getExecutorOrLimiterOrParent():null);
            List<Object> rhsExecutorOrLimiterOrParent;
            rhsExecutorOrLimiterOrParent = (((that.executorOrLimiterOrParent!= null)&&(!that.executorOrLimiterOrParent.isEmpty()))?that.getExecutorOrLimiterOrParent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executorOrLimiterOrParent", lhsExecutorOrLimiterOrParent), LocatorUtils.property(thatLocator, "executorOrLimiterOrParent", rhsExecutorOrLimiterOrParent), lhsExecutorOrLimiterOrParent, rhsExecutorOrLimiterOrParent)) {
                return false;
            }
        }
        {
            String lhsExecutor;
            lhsExecutor = this.getExecutor();
            String rhsExecutor;
            rhsExecutor = that.getExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executor", lhsExecutor), LocatorUtils.property(thatLocator, "executor", rhsExecutor), lhsExecutor, rhsExecutor)) {
                return false;
            }
        }
        {
            String lhsLimit;
            lhsLimit = this.getLimit();
            String rhsLimit;
            rhsLimit = that.getLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limit", lhsLimit), LocatorUtils.property(thatLocator, "limit", rhsLimit), lhsLimit, rhsLimit)) {
                return false;
            }
        }
        {
            String lhsLimiter;
            lhsLimiter = this.getLimiter();
            String rhsLimiter;
            rhsLimiter = that.getLimiter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limiter", lhsLimiter), LocatorUtils.property(thatLocator, "limiter", rhsLimiter), lhsLimiter, rhsLimiter)) {
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
            String lhsParent;
            lhsParent = this.getParent();
            String rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent)) {
                return false;
            }
        }
        {
            BigInteger lhsPercentUsage;
            lhsPercentUsage = this.getPercentUsage();
            BigInteger rhsPercentUsage;
            rhsPercentUsage = that.getPercentUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentUsage", lhsPercentUsage), LocatorUtils.property(thatLocator, "percentUsage", rhsPercentUsage), lhsPercentUsage, rhsPercentUsage)) {
                return false;
            }
        }
        {
            String lhsPercentUsageMinDelta;
            lhsPercentUsageMinDelta = this.getPercentUsageMinDelta();
            String rhsPercentUsageMinDelta;
            rhsPercentUsageMinDelta = that.getPercentUsageMinDelta();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentUsageMinDelta", lhsPercentUsageMinDelta), LocatorUtils.property(thatLocator, "percentUsageMinDelta", rhsPercentUsageMinDelta), lhsPercentUsageMinDelta, rhsPercentUsageMinDelta)) {
                return false;
            }
        }
        {
            BigInteger lhsPollingTime;
            lhsPollingTime = this.getPollingTime();
            BigInteger rhsPollingTime;
            rhsPollingTime = that.getPollingTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pollingTime", lhsPollingTime), LocatorUtils.property(thatLocator, "pollingTime", rhsPollingTime), lhsPollingTime, rhsPollingTime)) {
                return false;
            }
        }
        {
            String lhsStore;
            lhsStore = this.getStore();
            String rhsStore;
            rhsStore = that.getStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "store", lhsStore), LocatorUtils.property(thatLocator, "store", rhsStore), lhsStore, rhsStore)) {
                return false;
            }
        }
        {
            Float lhsUsagePortion;
            lhsUsagePortion = this.getUsagePortion();
            Float rhsUsagePortion;
            rhsUsagePortion = that.getUsagePortion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usagePortion", lhsUsagePortion), LocatorUtils.property(thatLocator, "usagePortion", rhsUsagePortion), lhsUsagePortion, rhsUsagePortion)) {
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
    public static class Executor
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
            if (!(object instanceof DtoJobSchedulerUsage.Executor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJobSchedulerUsage.Executor that = ((DtoJobSchedulerUsage.Executor) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}defaultUsageCapacity"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}usageCapacity"/>
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
        "defaultUsageCapacity",
        "usageCapacity",
        "any"
    })
    public static class Limiter
        implements Equals, HashCode, ToString
    {

        protected DtoDefaultUsageCapacity defaultUsageCapacity;
        protected DtoUsageCapacity usageCapacity;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取defaultUsageCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDefaultUsageCapacity }
         *     
         */
        public DtoDefaultUsageCapacity getDefaultUsageCapacity() {
            return defaultUsageCapacity;
        }

        /**
         * 设置defaultUsageCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDefaultUsageCapacity }
         *     
         */
        public void setDefaultUsageCapacity(DtoDefaultUsageCapacity value) {
            this.defaultUsageCapacity = value;
        }

        /**
         * 获取usageCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoUsageCapacity }
         *     
         */
        public DtoUsageCapacity getUsageCapacity() {
            return usageCapacity;
        }

        /**
         * 设置usageCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoUsageCapacity }
         *     
         */
        public void setUsageCapacity(DtoUsageCapacity value) {
            this.usageCapacity = value;
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
                DtoDefaultUsageCapacity theDefaultUsageCapacity;
                theDefaultUsageCapacity = this.getDefaultUsageCapacity();
                strategy.appendField(locator, this, "defaultUsageCapacity", buffer, theDefaultUsageCapacity);
            }
            {
                DtoUsageCapacity theUsageCapacity;
                theUsageCapacity = this.getUsageCapacity();
                strategy.appendField(locator, this, "usageCapacity", buffer, theUsageCapacity);
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
                DtoDefaultUsageCapacity theDefaultUsageCapacity;
                theDefaultUsageCapacity = this.getDefaultUsageCapacity();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultUsageCapacity", theDefaultUsageCapacity), currentHashCode, theDefaultUsageCapacity);
            }
            {
                DtoUsageCapacity theUsageCapacity;
                theUsageCapacity = this.getUsageCapacity();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageCapacity", theUsageCapacity), currentHashCode, theUsageCapacity);
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
            if (!(object instanceof DtoJobSchedulerUsage.Limiter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJobSchedulerUsage.Limiter that = ((DtoJobSchedulerUsage.Limiter) object);
            {
                DtoDefaultUsageCapacity lhsDefaultUsageCapacity;
                lhsDefaultUsageCapacity = this.getDefaultUsageCapacity();
                DtoDefaultUsageCapacity rhsDefaultUsageCapacity;
                rhsDefaultUsageCapacity = that.getDefaultUsageCapacity();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultUsageCapacity", lhsDefaultUsageCapacity), LocatorUtils.property(thatLocator, "defaultUsageCapacity", rhsDefaultUsageCapacity), lhsDefaultUsageCapacity, rhsDefaultUsageCapacity)) {
                    return false;
                }
            }
            {
                DtoUsageCapacity lhsUsageCapacity;
                lhsUsageCapacity = this.getUsageCapacity();
                DtoUsageCapacity rhsUsageCapacity;
                rhsUsageCapacity = that.getUsageCapacity();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "usageCapacity", lhsUsageCapacity), LocatorUtils.property(thatLocator, "usageCapacity", rhsUsageCapacity), lhsUsageCapacity, rhsUsageCapacity)) {
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
    public static class Parent
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
            if (!(object instanceof DtoJobSchedulerUsage.Parent)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJobSchedulerUsage.Parent that = ((DtoJobSchedulerUsage.Parent) object);
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
    public static class Store
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
            if (!(object instanceof DtoJobSchedulerUsage.Store)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJobSchedulerUsage.Store that = ((DtoJobSchedulerUsage.Store) object);
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
