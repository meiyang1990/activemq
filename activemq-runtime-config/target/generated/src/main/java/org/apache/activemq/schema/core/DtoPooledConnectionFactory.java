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
 *           &lt;element name="connectionFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="transactionManager" minOccurs="0">
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
 *       &lt;attribute name="connectionFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxConnections" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumActive" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionManager" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "connectionFactoryOrTransactionManagerOrAny"
})
@XmlRootElement(name = "pooledConnectionFactory")
public class DtoPooledConnectionFactory
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "transactionManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "connectionFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> connectionFactoryOrTransactionManagerOrAny;
    @XmlAttribute(name = "connectionFactory")
    protected String connectionFactory;
    @XmlAttribute(name = "maxConnections")
    protected BigInteger maxConnections;
    @XmlAttribute(name = "maximumActive")
    protected BigInteger maximumActive;
    @XmlAttribute(name = "resourceName")
    protected String resourceName;
    @XmlAttribute(name = "transactionManager")
    protected String transactionManager;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the connectionFactoryOrTransactionManagerOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionFactoryOrTransactionManagerOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionFactoryOrTransactionManagerOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoPooledConnectionFactory.TransactionManager }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoPooledConnectionFactory.ConnectionFactory }{@code >}
     * 
     * 
     */
    public List<Object> getConnectionFactoryOrTransactionManagerOrAny() {
        if (connectionFactoryOrTransactionManagerOrAny == null) {
            connectionFactoryOrTransactionManagerOrAny = new ArrayList<Object>();
        }
        return this.connectionFactoryOrTransactionManagerOrAny;
    }

    /**
     * 获取connectionFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * 设置connectionFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFactory(String value) {
        this.connectionFactory = value;
    }

    /**
     * 获取maxConnections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnections() {
        return maxConnections;
    }

    /**
     * 设置maxConnections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnections(BigInteger value) {
        this.maxConnections = value;
    }

    /**
     * 获取maximumActive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumActive() {
        return maximumActive;
    }

    /**
     * 设置maximumActive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumActive(BigInteger value) {
        this.maximumActive = value;
    }

    /**
     * 获取resourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置resourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * 获取transactionManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionManager() {
        return transactionManager;
    }

    /**
     * 设置transactionManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionManager(String value) {
        this.transactionManager = value;
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
            List<Object> theConnectionFactoryOrTransactionManagerOrAny;
            theConnectionFactoryOrTransactionManagerOrAny = (((this.connectionFactoryOrTransactionManagerOrAny!= null)&&(!this.connectionFactoryOrTransactionManagerOrAny.isEmpty()))?this.getConnectionFactoryOrTransactionManagerOrAny():null);
            strategy.appendField(locator, this, "connectionFactoryOrTransactionManagerOrAny", buffer, theConnectionFactoryOrTransactionManagerOrAny);
        }
        {
            String theConnectionFactory;
            theConnectionFactory = this.getConnectionFactory();
            strategy.appendField(locator, this, "connectionFactory", buffer, theConnectionFactory);
        }
        {
            BigInteger theMaxConnections;
            theMaxConnections = this.getMaxConnections();
            strategy.appendField(locator, this, "maxConnections", buffer, theMaxConnections);
        }
        {
            BigInteger theMaximumActive;
            theMaximumActive = this.getMaximumActive();
            strategy.appendField(locator, this, "maximumActive", buffer, theMaximumActive);
        }
        {
            String theResourceName;
            theResourceName = this.getResourceName();
            strategy.appendField(locator, this, "resourceName", buffer, theResourceName);
        }
        {
            String theTransactionManager;
            theTransactionManager = this.getTransactionManager();
            strategy.appendField(locator, this, "transactionManager", buffer, theTransactionManager);
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
            List<Object> theConnectionFactoryOrTransactionManagerOrAny;
            theConnectionFactoryOrTransactionManagerOrAny = (((this.connectionFactoryOrTransactionManagerOrAny!= null)&&(!this.connectionFactoryOrTransactionManagerOrAny.isEmpty()))?this.getConnectionFactoryOrTransactionManagerOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactoryOrTransactionManagerOrAny", theConnectionFactoryOrTransactionManagerOrAny), currentHashCode, theConnectionFactoryOrTransactionManagerOrAny);
        }
        {
            String theConnectionFactory;
            theConnectionFactory = this.getConnectionFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactory", theConnectionFactory), currentHashCode, theConnectionFactory);
        }
        {
            BigInteger theMaxConnections;
            theMaxConnections = this.getMaxConnections();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxConnections", theMaxConnections), currentHashCode, theMaxConnections);
        }
        {
            BigInteger theMaximumActive;
            theMaximumActive = this.getMaximumActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumActive", theMaximumActive), currentHashCode, theMaximumActive);
        }
        {
            String theResourceName;
            theResourceName = this.getResourceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resourceName", theResourceName), currentHashCode, theResourceName);
        }
        {
            String theTransactionManager;
            theTransactionManager = this.getTransactionManager();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionManager", theTransactionManager), currentHashCode, theTransactionManager);
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
        if (!(object instanceof DtoPooledConnectionFactory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPooledConnectionFactory that = ((DtoPooledConnectionFactory) object);
        {
            List<Object> lhsConnectionFactoryOrTransactionManagerOrAny;
            lhsConnectionFactoryOrTransactionManagerOrAny = (((this.connectionFactoryOrTransactionManagerOrAny!= null)&&(!this.connectionFactoryOrTransactionManagerOrAny.isEmpty()))?this.getConnectionFactoryOrTransactionManagerOrAny():null);
            List<Object> rhsConnectionFactoryOrTransactionManagerOrAny;
            rhsConnectionFactoryOrTransactionManagerOrAny = (((that.connectionFactoryOrTransactionManagerOrAny!= null)&&(!that.connectionFactoryOrTransactionManagerOrAny.isEmpty()))?that.getConnectionFactoryOrTransactionManagerOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactoryOrTransactionManagerOrAny", lhsConnectionFactoryOrTransactionManagerOrAny), LocatorUtils.property(thatLocator, "connectionFactoryOrTransactionManagerOrAny", rhsConnectionFactoryOrTransactionManagerOrAny), lhsConnectionFactoryOrTransactionManagerOrAny, rhsConnectionFactoryOrTransactionManagerOrAny)) {
                return false;
            }
        }
        {
            String lhsConnectionFactory;
            lhsConnectionFactory = this.getConnectionFactory();
            String rhsConnectionFactory;
            rhsConnectionFactory = that.getConnectionFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactory", lhsConnectionFactory), LocatorUtils.property(thatLocator, "connectionFactory", rhsConnectionFactory), lhsConnectionFactory, rhsConnectionFactory)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxConnections;
            lhsMaxConnections = this.getMaxConnections();
            BigInteger rhsMaxConnections;
            rhsMaxConnections = that.getMaxConnections();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxConnections", lhsMaxConnections), LocatorUtils.property(thatLocator, "maxConnections", rhsMaxConnections), lhsMaxConnections, rhsMaxConnections)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumActive;
            lhsMaximumActive = this.getMaximumActive();
            BigInteger rhsMaximumActive;
            rhsMaximumActive = that.getMaximumActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumActive", lhsMaximumActive), LocatorUtils.property(thatLocator, "maximumActive", rhsMaximumActive), lhsMaximumActive, rhsMaximumActive)) {
                return false;
            }
        }
        {
            String lhsResourceName;
            lhsResourceName = this.getResourceName();
            String rhsResourceName;
            rhsResourceName = that.getResourceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resourceName", lhsResourceName), LocatorUtils.property(thatLocator, "resourceName", rhsResourceName), lhsResourceName, rhsResourceName)) {
                return false;
            }
        }
        {
            String lhsTransactionManager;
            lhsTransactionManager = this.getTransactionManager();
            String rhsTransactionManager;
            rhsTransactionManager = that.getTransactionManager();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionManager", lhsTransactionManager), LocatorUtils.property(thatLocator, "transactionManager", rhsTransactionManager), lhsTransactionManager, rhsTransactionManager)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
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
        "connectionFactory",
        "xaConnectionFactory",
        "any"
    })
    public static class ConnectionFactory
        implements Equals, HashCode, ToString
    {

        protected DtoConnectionFactory connectionFactory;
        protected DtoXaConnectionFactory xaConnectionFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取connectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public DtoConnectionFactory getConnectionFactory() {
            return connectionFactory;
        }

        /**
         * 设置connectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public void setConnectionFactory(DtoConnectionFactory value) {
            this.connectionFactory = value;
        }

        /**
         * 获取xaConnectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public DtoXaConnectionFactory getXaConnectionFactory() {
            return xaConnectionFactory;
        }

        /**
         * 设置xaConnectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public void setXaConnectionFactory(DtoXaConnectionFactory value) {
            this.xaConnectionFactory = value;
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                strategy.appendField(locator, this, "connectionFactory", buffer, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                strategy.appendField(locator, this, "xaConnectionFactory", buffer, theXaConnectionFactory);
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactory", theConnectionFactory), currentHashCode, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xaConnectionFactory", theXaConnectionFactory), currentHashCode, theXaConnectionFactory);
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
            if (!(object instanceof DtoPooledConnectionFactory.ConnectionFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPooledConnectionFactory.ConnectionFactory that = ((DtoPooledConnectionFactory.ConnectionFactory) object);
            {
                DtoConnectionFactory lhsConnectionFactory;
                lhsConnectionFactory = this.getConnectionFactory();
                DtoConnectionFactory rhsConnectionFactory;
                rhsConnectionFactory = that.getConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactory", lhsConnectionFactory), LocatorUtils.property(thatLocator, "connectionFactory", rhsConnectionFactory), lhsConnectionFactory, rhsConnectionFactory)) {
                    return false;
                }
            }
            {
                DtoXaConnectionFactory lhsXaConnectionFactory;
                lhsXaConnectionFactory = this.getXaConnectionFactory();
                DtoXaConnectionFactory rhsXaConnectionFactory;
                rhsXaConnectionFactory = that.getXaConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "xaConnectionFactory", lhsXaConnectionFactory), LocatorUtils.property(thatLocator, "xaConnectionFactory", rhsXaConnectionFactory), lhsXaConnectionFactory, rhsXaConnectionFactory)) {
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
    public static class TransactionManager
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
            if (!(object instanceof DtoPooledConnectionFactory.TransactionManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPooledConnectionFactory.TransactionManager that = ((DtoPooledConnectionFactory.TransactionManager) object);
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
