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
 *           &lt;element name="adminConnectionContext" minOccurs="0">
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
 *           &lt;element name="next" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="adminConnectionContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stampProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adminConnectionContextOrNextOrAny"
})
@XmlRootElement(name = "traceBrokerPathPlugin")
public class DtoTraceBrokerPathPlugin implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "next", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "adminConnectionContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adminConnectionContextOrNextOrAny;
    @XmlAttribute(name = "adminConnectionContext")
    protected String adminConnectionContext;
    @XmlAttribute(name = "next")
    protected String next;
    @XmlAttribute(name = "stampProperty")
    protected String stampProperty;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adminConnectionContextOrNextOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminConnectionContextOrNextOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminConnectionContextOrNextOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoTraceBrokerPathPlugin.Next }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTraceBrokerPathPlugin.AdminConnectionContext }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAdminConnectionContextOrNextOrAny() {
        if (adminConnectionContextOrNextOrAny == null) {
            adminConnectionContextOrNextOrAny = new ArrayList<Object>();
        }
        return this.adminConnectionContextOrNextOrAny;
    }

    /**
     * 获取adminConnectionContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminConnectionContext() {
        return adminConnectionContext;
    }

    /**
     * 设置adminConnectionContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminConnectionContext(String value) {
        this.adminConnectionContext = value;
    }

    /**
     * 获取next属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * 设置next属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

    /**
     * 获取stampProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampProperty() {
        return stampProperty;
    }

    /**
     * 设置stampProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampProperty(String value) {
        this.stampProperty = value;
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
            List<Object> theAdminConnectionContextOrNextOrAny;
            theAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            strategy.appendField(locator, this, "adminConnectionContextOrNextOrAny", buffer, theAdminConnectionContextOrNextOrAny);
        }
        {
            String theAdminConnectionContext;
            theAdminConnectionContext = this.getAdminConnectionContext();
            strategy.appendField(locator, this, "adminConnectionContext", buffer, theAdminConnectionContext);
        }
        {
            String theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext);
        }
        {
            String theStampProperty;
            theStampProperty = this.getStampProperty();
            strategy.appendField(locator, this, "stampProperty", buffer, theStampProperty);
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
            List<Object> theAdminConnectionContextOrNextOrAny;
            theAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminConnectionContextOrNextOrAny", theAdminConnectionContextOrNextOrAny), currentHashCode, theAdminConnectionContextOrNextOrAny);
        }
        {
            String theAdminConnectionContext;
            theAdminConnectionContext = this.getAdminConnectionContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminConnectionContext", theAdminConnectionContext), currentHashCode, theAdminConnectionContext);
        }
        {
            String theNext;
            theNext = this.getNext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "next", theNext), currentHashCode, theNext);
        }
        {
            String theStampProperty;
            theStampProperty = this.getStampProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stampProperty", theStampProperty), currentHashCode, theStampProperty);
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
        if (!(object instanceof DtoTraceBrokerPathPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoTraceBrokerPathPlugin that = ((DtoTraceBrokerPathPlugin) object);
        {
            List<Object> lhsAdminConnectionContextOrNextOrAny;
            lhsAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            List<Object> rhsAdminConnectionContextOrNextOrAny;
            rhsAdminConnectionContextOrNextOrAny = (((that.adminConnectionContextOrNextOrAny!= null)&&(!that.adminConnectionContextOrNextOrAny.isEmpty()))?that.getAdminConnectionContextOrNextOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminConnectionContextOrNextOrAny", lhsAdminConnectionContextOrNextOrAny), LocatorUtils.property(thatLocator, "adminConnectionContextOrNextOrAny", rhsAdminConnectionContextOrNextOrAny), lhsAdminConnectionContextOrNextOrAny, rhsAdminConnectionContextOrNextOrAny)) {
                return false;
            }
        }
        {
            String lhsAdminConnectionContext;
            lhsAdminConnectionContext = this.getAdminConnectionContext();
            String rhsAdminConnectionContext;
            rhsAdminConnectionContext = that.getAdminConnectionContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminConnectionContext", lhsAdminConnectionContext), LocatorUtils.property(thatLocator, "adminConnectionContext", rhsAdminConnectionContext), lhsAdminConnectionContext, rhsAdminConnectionContext)) {
                return false;
            }
        }
        {
            String lhsNext;
            lhsNext = this.getNext();
            String rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext)) {
                return false;
            }
        }
        {
            String lhsStampProperty;
            lhsStampProperty = this.getStampProperty();
            String rhsStampProperty;
            rhsStampProperty = that.getStampProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stampProperty", lhsStampProperty), LocatorUtils.property(thatLocator, "stampProperty", rhsStampProperty), lhsStampProperty, rhsStampProperty)) {
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
    public static class AdminConnectionContext
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
            if (!(object instanceof DtoTraceBrokerPathPlugin.AdminConnectionContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTraceBrokerPathPlugin.AdminConnectionContext that = ((DtoTraceBrokerPathPlugin.AdminConnectionContext) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
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
        "destinationPathSeparatorPlugin",
        "destinationsPlugin",
        "forcePersistencyModeBroker",
        "loggingBrokerPlugin",
        "multicastTraceBrokerPlugin",
        "redeliveryPlugin",
        "timeStampingBrokerPlugin",
        "traceBrokerPathPlugin",
        "udpTraceBrokerPlugin",
        "any"
    })
    public static class Next
        implements Equals, HashCode, ToString
    {

        protected DtoDestinationPathSeparatorPlugin destinationPathSeparatorPlugin;
        protected DtoDestinationsPlugin destinationsPlugin;
        protected DtoForcePersistencyModeBroker forcePersistencyModeBroker;
        protected DtoLoggingBrokerPlugin loggingBrokerPlugin;
        protected DtoMulticastTraceBrokerPlugin multicastTraceBrokerPlugin;
        protected DtoRedeliveryPlugin redeliveryPlugin;
        protected DtoTimeStampingBrokerPlugin timeStampingBrokerPlugin;
        protected DtoTraceBrokerPathPlugin traceBrokerPathPlugin;
        protected DtoUdpTraceBrokerPlugin udpTraceBrokerPlugin;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取destinationPathSeparatorPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public DtoDestinationPathSeparatorPlugin getDestinationPathSeparatorPlugin() {
            return destinationPathSeparatorPlugin;
        }

        /**
         * 设置destinationPathSeparatorPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public void setDestinationPathSeparatorPlugin(DtoDestinationPathSeparatorPlugin value) {
            this.destinationPathSeparatorPlugin = value;
        }

        /**
         * 获取destinationsPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public DtoDestinationsPlugin getDestinationsPlugin() {
            return destinationsPlugin;
        }

        /**
         * 设置destinationsPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public void setDestinationsPlugin(DtoDestinationsPlugin value) {
            this.destinationsPlugin = value;
        }

        /**
         * 获取forcePersistencyModeBroker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public DtoForcePersistencyModeBroker getForcePersistencyModeBroker() {
            return forcePersistencyModeBroker;
        }

        /**
         * 设置forcePersistencyModeBroker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public void setForcePersistencyModeBroker(DtoForcePersistencyModeBroker value) {
            this.forcePersistencyModeBroker = value;
        }

        /**
         * 获取loggingBrokerPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public DtoLoggingBrokerPlugin getLoggingBrokerPlugin() {
            return loggingBrokerPlugin;
        }

        /**
         * 设置loggingBrokerPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public void setLoggingBrokerPlugin(DtoLoggingBrokerPlugin value) {
            this.loggingBrokerPlugin = value;
        }

        /**
         * 获取multicastTraceBrokerPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public DtoMulticastTraceBrokerPlugin getMulticastTraceBrokerPlugin() {
            return multicastTraceBrokerPlugin;
        }

        /**
         * 设置multicastTraceBrokerPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public void setMulticastTraceBrokerPlugin(DtoMulticastTraceBrokerPlugin value) {
            this.multicastTraceBrokerPlugin = value;
        }

        /**
         * 获取redeliveryPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public DtoRedeliveryPlugin getRedeliveryPlugin() {
            return redeliveryPlugin;
        }

        /**
         * 设置redeliveryPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public void setRedeliveryPlugin(DtoRedeliveryPlugin value) {
            this.redeliveryPlugin = value;
        }

        /**
         * 获取timeStampingBrokerPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public DtoTimeStampingBrokerPlugin getTimeStampingBrokerPlugin() {
            return timeStampingBrokerPlugin;
        }

        /**
         * 设置timeStampingBrokerPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public void setTimeStampingBrokerPlugin(DtoTimeStampingBrokerPlugin value) {
            this.timeStampingBrokerPlugin = value;
        }

        /**
         * 获取traceBrokerPathPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public DtoTraceBrokerPathPlugin getTraceBrokerPathPlugin() {
            return traceBrokerPathPlugin;
        }

        /**
         * 设置traceBrokerPathPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public void setTraceBrokerPathPlugin(DtoTraceBrokerPathPlugin value) {
            this.traceBrokerPathPlugin = value;
        }

        /**
         * 获取udpTraceBrokerPlugin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public DtoUdpTraceBrokerPlugin getUdpTraceBrokerPlugin() {
            return udpTraceBrokerPlugin;
        }

        /**
         * 设置udpTraceBrokerPlugin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public void setUdpTraceBrokerPlugin(DtoUdpTraceBrokerPlugin value) {
            this.udpTraceBrokerPlugin = value;
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
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                strategy.appendField(locator, this, "destinationPathSeparatorPlugin", buffer, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                strategy.appendField(locator, this, "destinationsPlugin", buffer, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                strategy.appendField(locator, this, "forcePersistencyModeBroker", buffer, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                strategy.appendField(locator, this, "loggingBrokerPlugin", buffer, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                strategy.appendField(locator, this, "multicastTraceBrokerPlugin", buffer, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                strategy.appendField(locator, this, "redeliveryPlugin", buffer, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                strategy.appendField(locator, this, "timeStampingBrokerPlugin", buffer, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                strategy.appendField(locator, this, "traceBrokerPathPlugin", buffer, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                strategy.appendField(locator, this, "udpTraceBrokerPlugin", buffer, theUdpTraceBrokerPlugin);
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
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationPathSeparatorPlugin", theDestinationPathSeparatorPlugin), currentHashCode, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationsPlugin", theDestinationsPlugin), currentHashCode, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forcePersistencyModeBroker", theForcePersistencyModeBroker), currentHashCode, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loggingBrokerPlugin", theLoggingBrokerPlugin), currentHashCode, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multicastTraceBrokerPlugin", theMulticastTraceBrokerPlugin), currentHashCode, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPlugin", theRedeliveryPlugin), currentHashCode, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStampingBrokerPlugin", theTimeStampingBrokerPlugin), currentHashCode, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceBrokerPathPlugin", theTraceBrokerPathPlugin), currentHashCode, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "udpTraceBrokerPlugin", theUdpTraceBrokerPlugin), currentHashCode, theUdpTraceBrokerPlugin);
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
            if (!(object instanceof DtoTraceBrokerPathPlugin.Next)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTraceBrokerPathPlugin.Next that = ((DtoTraceBrokerPathPlugin.Next) object);
            {
                DtoDestinationPathSeparatorPlugin lhsDestinationPathSeparatorPlugin;
                lhsDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                DtoDestinationPathSeparatorPlugin rhsDestinationPathSeparatorPlugin;
                rhsDestinationPathSeparatorPlugin = that.getDestinationPathSeparatorPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationPathSeparatorPlugin", lhsDestinationPathSeparatorPlugin), LocatorUtils.property(thatLocator, "destinationPathSeparatorPlugin", rhsDestinationPathSeparatorPlugin), lhsDestinationPathSeparatorPlugin, rhsDestinationPathSeparatorPlugin)) {
                    return false;
                }
            }
            {
                DtoDestinationsPlugin lhsDestinationsPlugin;
                lhsDestinationsPlugin = this.getDestinationsPlugin();
                DtoDestinationsPlugin rhsDestinationsPlugin;
                rhsDestinationsPlugin = that.getDestinationsPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationsPlugin", lhsDestinationsPlugin), LocatorUtils.property(thatLocator, "destinationsPlugin", rhsDestinationsPlugin), lhsDestinationsPlugin, rhsDestinationsPlugin)) {
                    return false;
                }
            }
            {
                DtoForcePersistencyModeBroker lhsForcePersistencyModeBroker;
                lhsForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                DtoForcePersistencyModeBroker rhsForcePersistencyModeBroker;
                rhsForcePersistencyModeBroker = that.getForcePersistencyModeBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "forcePersistencyModeBroker", lhsForcePersistencyModeBroker), LocatorUtils.property(thatLocator, "forcePersistencyModeBroker", rhsForcePersistencyModeBroker), lhsForcePersistencyModeBroker, rhsForcePersistencyModeBroker)) {
                    return false;
                }
            }
            {
                DtoLoggingBrokerPlugin lhsLoggingBrokerPlugin;
                lhsLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                DtoLoggingBrokerPlugin rhsLoggingBrokerPlugin;
                rhsLoggingBrokerPlugin = that.getLoggingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loggingBrokerPlugin", lhsLoggingBrokerPlugin), LocatorUtils.property(thatLocator, "loggingBrokerPlugin", rhsLoggingBrokerPlugin), lhsLoggingBrokerPlugin, rhsLoggingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoMulticastTraceBrokerPlugin lhsMulticastTraceBrokerPlugin;
                lhsMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                DtoMulticastTraceBrokerPlugin rhsMulticastTraceBrokerPlugin;
                rhsMulticastTraceBrokerPlugin = that.getMulticastTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multicastTraceBrokerPlugin", lhsMulticastTraceBrokerPlugin), LocatorUtils.property(thatLocator, "multicastTraceBrokerPlugin", rhsMulticastTraceBrokerPlugin), lhsMulticastTraceBrokerPlugin, rhsMulticastTraceBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPlugin lhsRedeliveryPlugin;
                lhsRedeliveryPlugin = this.getRedeliveryPlugin();
                DtoRedeliveryPlugin rhsRedeliveryPlugin;
                rhsRedeliveryPlugin = that.getRedeliveryPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPlugin", lhsRedeliveryPlugin), LocatorUtils.property(thatLocator, "redeliveryPlugin", rhsRedeliveryPlugin), lhsRedeliveryPlugin, rhsRedeliveryPlugin)) {
                    return false;
                }
            }
            {
                DtoTimeStampingBrokerPlugin lhsTimeStampingBrokerPlugin;
                lhsTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                DtoTimeStampingBrokerPlugin rhsTimeStampingBrokerPlugin;
                rhsTimeStampingBrokerPlugin = that.getTimeStampingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStampingBrokerPlugin", lhsTimeStampingBrokerPlugin), LocatorUtils.property(thatLocator, "timeStampingBrokerPlugin", rhsTimeStampingBrokerPlugin), lhsTimeStampingBrokerPlugin, rhsTimeStampingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoTraceBrokerPathPlugin lhsTraceBrokerPathPlugin;
                lhsTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                DtoTraceBrokerPathPlugin rhsTraceBrokerPathPlugin;
                rhsTraceBrokerPathPlugin = that.getTraceBrokerPathPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "traceBrokerPathPlugin", lhsTraceBrokerPathPlugin), LocatorUtils.property(thatLocator, "traceBrokerPathPlugin", rhsTraceBrokerPathPlugin), lhsTraceBrokerPathPlugin, rhsTraceBrokerPathPlugin)) {
                    return false;
                }
            }
            {
                DtoUdpTraceBrokerPlugin lhsUdpTraceBrokerPlugin;
                lhsUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                DtoUdpTraceBrokerPlugin rhsUdpTraceBrokerPlugin;
                rhsUdpTraceBrokerPlugin = that.getUdpTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "udpTraceBrokerPlugin", lhsUdpTraceBrokerPlugin), LocatorUtils.property(thatLocator, "udpTraceBrokerPlugin", rhsUdpTraceBrokerPlugin), lhsUdpTraceBrokerPlugin, rhsUdpTraceBrokerPlugin)) {
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
