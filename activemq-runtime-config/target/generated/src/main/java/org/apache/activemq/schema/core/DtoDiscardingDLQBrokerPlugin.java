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
 *       &lt;attribute name="dropAll" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dropOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dropTemporaryQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dropTemporaryTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reportInterval" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlRootElement(name = "discardingDLQBrokerPlugin")
public class DtoDiscardingDLQBrokerPlugin implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "dropAll")
    protected Boolean dropAll;
    @XmlAttribute(name = "dropOnly")
    protected String dropOnly;
    @XmlAttribute(name = "dropTemporaryQueues")
    protected Boolean dropTemporaryQueues;
    @XmlAttribute(name = "dropTemporaryTopics")
    protected Boolean dropTemporaryTopics;
    @XmlAttribute(name = "reportInterval")
    protected BigInteger reportInterval;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取dropAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropAll() {
        return dropAll;
    }

    /**
     * 设置dropAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropAll(Boolean value) {
        this.dropAll = value;
    }

    /**
     * 获取dropOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOnly() {
        return dropOnly;
    }

    /**
     * 设置dropOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOnly(String value) {
        this.dropOnly = value;
    }

    /**
     * 获取dropTemporaryQueues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropTemporaryQueues() {
        return dropTemporaryQueues;
    }

    /**
     * 设置dropTemporaryQueues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropTemporaryQueues(Boolean value) {
        this.dropTemporaryQueues = value;
    }

    /**
     * 获取dropTemporaryTopics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropTemporaryTopics() {
        return dropTemporaryTopics;
    }

    /**
     * 设置dropTemporaryTopics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropTemporaryTopics(Boolean value) {
        this.dropTemporaryTopics = value;
    }

    /**
     * 获取reportInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportInterval() {
        return reportInterval;
    }

    /**
     * 设置reportInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportInterval(BigInteger value) {
        this.reportInterval = value;
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
            Boolean theDropAll;
            theDropAll = this.isDropAll();
            strategy.appendField(locator, this, "dropAll", buffer, theDropAll);
        }
        {
            String theDropOnly;
            theDropOnly = this.getDropOnly();
            strategy.appendField(locator, this, "dropOnly", buffer, theDropOnly);
        }
        {
            Boolean theDropTemporaryQueues;
            theDropTemporaryQueues = this.isDropTemporaryQueues();
            strategy.appendField(locator, this, "dropTemporaryQueues", buffer, theDropTemporaryQueues);
        }
        {
            Boolean theDropTemporaryTopics;
            theDropTemporaryTopics = this.isDropTemporaryTopics();
            strategy.appendField(locator, this, "dropTemporaryTopics", buffer, theDropTemporaryTopics);
        }
        {
            BigInteger theReportInterval;
            theReportInterval = this.getReportInterval();
            strategy.appendField(locator, this, "reportInterval", buffer, theReportInterval);
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
            Boolean theDropAll;
            theDropAll = this.isDropAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropAll", theDropAll), currentHashCode, theDropAll);
        }
        {
            String theDropOnly;
            theDropOnly = this.getDropOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropOnly", theDropOnly), currentHashCode, theDropOnly);
        }
        {
            Boolean theDropTemporaryQueues;
            theDropTemporaryQueues = this.isDropTemporaryQueues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropTemporaryQueues", theDropTemporaryQueues), currentHashCode, theDropTemporaryQueues);
        }
        {
            Boolean theDropTemporaryTopics;
            theDropTemporaryTopics = this.isDropTemporaryTopics();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropTemporaryTopics", theDropTemporaryTopics), currentHashCode, theDropTemporaryTopics);
        }
        {
            BigInteger theReportInterval;
            theReportInterval = this.getReportInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportInterval", theReportInterval), currentHashCode, theReportInterval);
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
        if (!(object instanceof DtoDiscardingDLQBrokerPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoDiscardingDLQBrokerPlugin that = ((DtoDiscardingDLQBrokerPlugin) object);
        {
            Boolean lhsDropAll;
            lhsDropAll = this.isDropAll();
            Boolean rhsDropAll;
            rhsDropAll = that.isDropAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropAll", lhsDropAll), LocatorUtils.property(thatLocator, "dropAll", rhsDropAll), lhsDropAll, rhsDropAll)) {
                return false;
            }
        }
        {
            String lhsDropOnly;
            lhsDropOnly = this.getDropOnly();
            String rhsDropOnly;
            rhsDropOnly = that.getDropOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropOnly", lhsDropOnly), LocatorUtils.property(thatLocator, "dropOnly", rhsDropOnly), lhsDropOnly, rhsDropOnly)) {
                return false;
            }
        }
        {
            Boolean lhsDropTemporaryQueues;
            lhsDropTemporaryQueues = this.isDropTemporaryQueues();
            Boolean rhsDropTemporaryQueues;
            rhsDropTemporaryQueues = that.isDropTemporaryQueues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropTemporaryQueues", lhsDropTemporaryQueues), LocatorUtils.property(thatLocator, "dropTemporaryQueues", rhsDropTemporaryQueues), lhsDropTemporaryQueues, rhsDropTemporaryQueues)) {
                return false;
            }
        }
        {
            Boolean lhsDropTemporaryTopics;
            lhsDropTemporaryTopics = this.isDropTemporaryTopics();
            Boolean rhsDropTemporaryTopics;
            rhsDropTemporaryTopics = that.isDropTemporaryTopics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropTemporaryTopics", lhsDropTemporaryTopics), LocatorUtils.property(thatLocator, "dropTemporaryTopics", rhsDropTemporaryTopics), lhsDropTemporaryTopics, rhsDropTemporaryTopics)) {
                return false;
            }
        }
        {
            BigInteger lhsReportInterval;
            lhsReportInterval = this.getReportInterval();
            BigInteger rhsReportInterval;
            rhsReportInterval = that.getReportInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportInterval", lhsReportInterval), LocatorUtils.property(thatLocator, "reportInterval", rhsReportInterval), lhsReportInterval, rhsReportInterval)) {
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
