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
 *           &lt;element name="config" minOccurs="0">
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
 *       &lt;attribute name="config" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configAsJson" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minTransferCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "configOrAny"
})
@XmlRootElement(name = "partitionBrokerPlugin")
public class DtoPartitionBrokerPlugin implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "config", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> configOrAny;
    @XmlAttribute(name = "config")
    protected String config;
    @XmlAttribute(name = "configAsJson")
    protected String configAsJson;
    @XmlAttribute(name = "minTransferCount")
    protected BigInteger minTransferCount;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the configOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoPartitionBrokerPlugin.Config }{@code >}
     * 
     * 
     */
    public List<Object> getConfigOrAny() {
        if (configOrAny == null) {
            configOrAny = new ArrayList<Object>();
        }
        return this.configOrAny;
    }

    /**
     * 获取config属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * 设置config属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * 获取configAsJson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigAsJson() {
        return configAsJson;
    }

    /**
     * 设置configAsJson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigAsJson(String value) {
        this.configAsJson = value;
    }

    /**
     * 获取minTransferCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTransferCount() {
        return minTransferCount;
    }

    /**
     * 设置minTransferCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTransferCount(BigInteger value) {
        this.minTransferCount = value;
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
            List<Object> theConfigOrAny;
            theConfigOrAny = (((this.configOrAny!= null)&&(!this.configOrAny.isEmpty()))?this.getConfigOrAny():null);
            strategy.appendField(locator, this, "configOrAny", buffer, theConfigOrAny);
        }
        {
            String theConfig;
            theConfig = this.getConfig();
            strategy.appendField(locator, this, "config", buffer, theConfig);
        }
        {
            String theConfigAsJson;
            theConfigAsJson = this.getConfigAsJson();
            strategy.appendField(locator, this, "configAsJson", buffer, theConfigAsJson);
        }
        {
            BigInteger theMinTransferCount;
            theMinTransferCount = this.getMinTransferCount();
            strategy.appendField(locator, this, "minTransferCount", buffer, theMinTransferCount);
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
            List<Object> theConfigOrAny;
            theConfigOrAny = (((this.configOrAny!= null)&&(!this.configOrAny.isEmpty()))?this.getConfigOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configOrAny", theConfigOrAny), currentHashCode, theConfigOrAny);
        }
        {
            String theConfig;
            theConfig = this.getConfig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "config", theConfig), currentHashCode, theConfig);
        }
        {
            String theConfigAsJson;
            theConfigAsJson = this.getConfigAsJson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configAsJson", theConfigAsJson), currentHashCode, theConfigAsJson);
        }
        {
            BigInteger theMinTransferCount;
            theMinTransferCount = this.getMinTransferCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minTransferCount", theMinTransferCount), currentHashCode, theMinTransferCount);
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
        if (!(object instanceof DtoPartitionBrokerPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPartitionBrokerPlugin that = ((DtoPartitionBrokerPlugin) object);
        {
            List<Object> lhsConfigOrAny;
            lhsConfigOrAny = (((this.configOrAny!= null)&&(!this.configOrAny.isEmpty()))?this.getConfigOrAny():null);
            List<Object> rhsConfigOrAny;
            rhsConfigOrAny = (((that.configOrAny!= null)&&(!that.configOrAny.isEmpty()))?that.getConfigOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configOrAny", lhsConfigOrAny), LocatorUtils.property(thatLocator, "configOrAny", rhsConfigOrAny), lhsConfigOrAny, rhsConfigOrAny)) {
                return false;
            }
        }
        {
            String lhsConfig;
            lhsConfig = this.getConfig();
            String rhsConfig;
            rhsConfig = that.getConfig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "config", lhsConfig), LocatorUtils.property(thatLocator, "config", rhsConfig), lhsConfig, rhsConfig)) {
                return false;
            }
        }
        {
            String lhsConfigAsJson;
            lhsConfigAsJson = this.getConfigAsJson();
            String rhsConfigAsJson;
            rhsConfigAsJson = that.getConfigAsJson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configAsJson", lhsConfigAsJson), LocatorUtils.property(thatLocator, "configAsJson", rhsConfigAsJson), lhsConfigAsJson, rhsConfigAsJson)) {
                return false;
            }
        }
        {
            BigInteger lhsMinTransferCount;
            lhsMinTransferCount = this.getMinTransferCount();
            BigInteger rhsMinTransferCount;
            rhsMinTransferCount = that.getMinTransferCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minTransferCount", lhsMinTransferCount), LocatorUtils.property(thatLocator, "minTransferCount", rhsMinTransferCount), lhsMinTransferCount, rhsMinTransferCount)) {
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
    public static class Config
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
            if (!(object instanceof DtoPartitionBrokerPlugin.Config)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPartitionBrokerPlugin.Config that = ((DtoPartitionBrokerPlugin.Config) object);
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
