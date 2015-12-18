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
 *           &lt;element name="adminACLs" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="readACLs" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="tempDestinationAuthorizationEntry" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempDestinationAuthorizationEntry"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="writeACLs" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="adminACLs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readACLs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempDestinationAuthorizationEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="writeACLs" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adminACLsOrReadACLsOrTempDestinationAuthorizationEntry"
})
@XmlRootElement(name = "simpleAuthorizationMap")
public class DtoSimpleAuthorizationMap
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "adminACLs", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "readACLs", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "writeACLs", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "tempDestinationAuthorizationEntry", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
    @XmlAttribute(name = "adminACLs")
    protected String adminACLs;
    @XmlAttribute(name = "readACLs")
    protected String readACLs;
    @XmlAttribute(name = "tempDestinationAuthorizationEntry")
    protected String tempDestinationAuthorizationEntry;
    @XmlAttribute(name = "writeACLs")
    protected String writeACLs;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adminACLsOrReadACLsOrTempDestinationAuthorizationEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminACLsOrReadACLsOrTempDestinationAuthorizationEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.WriteACLs }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.AdminACLs }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.ReadACLs }{@code >}
     * 
     * 
     */
    public List<Object> getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry() {
        if (adminACLsOrReadACLsOrTempDestinationAuthorizationEntry == null) {
            adminACLsOrReadACLsOrTempDestinationAuthorizationEntry = new ArrayList<Object>();
        }
        return this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
    }

    /**
     * 获取adminACLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminACLs() {
        return adminACLs;
    }

    /**
     * 设置adminACLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminACLs(String value) {
        this.adminACLs = value;
    }

    /**
     * 获取readACLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadACLs() {
        return readACLs;
    }

    /**
     * 设置readACLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadACLs(String value) {
        this.readACLs = value;
    }

    /**
     * 获取tempDestinationAuthorizationEntry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDestinationAuthorizationEntry() {
        return tempDestinationAuthorizationEntry;
    }

    /**
     * 设置tempDestinationAuthorizationEntry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDestinationAuthorizationEntry(String value) {
        this.tempDestinationAuthorizationEntry = value;
    }

    /**
     * 获取writeACLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteACLs() {
        return writeACLs;
    }

    /**
     * 设置writeACLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteACLs(String value) {
        this.writeACLs = value;
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
            List<Object> theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
            theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry = (((this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry!= null)&&(!this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry.isEmpty()))?this.getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry():null);
            strategy.appendField(locator, this, "adminACLsOrReadACLsOrTempDestinationAuthorizationEntry", buffer, theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry);
        }
        {
            String theAdminACLs;
            theAdminACLs = this.getAdminACLs();
            strategy.appendField(locator, this, "adminACLs", buffer, theAdminACLs);
        }
        {
            String theReadACLs;
            theReadACLs = this.getReadACLs();
            strategy.appendField(locator, this, "readACLs", buffer, theReadACLs);
        }
        {
            String theTempDestinationAuthorizationEntry;
            theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
            strategy.appendField(locator, this, "tempDestinationAuthorizationEntry", buffer, theTempDestinationAuthorizationEntry);
        }
        {
            String theWriteACLs;
            theWriteACLs = this.getWriteACLs();
            strategy.appendField(locator, this, "writeACLs", buffer, theWriteACLs);
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
            List<Object> theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
            theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry = (((this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry!= null)&&(!this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry.isEmpty()))?this.getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminACLsOrReadACLsOrTempDestinationAuthorizationEntry", theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry), currentHashCode, theAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry);
        }
        {
            String theAdminACLs;
            theAdminACLs = this.getAdminACLs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminACLs", theAdminACLs), currentHashCode, theAdminACLs);
        }
        {
            String theReadACLs;
            theReadACLs = this.getReadACLs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readACLs", theReadACLs), currentHashCode, theReadACLs);
        }
        {
            String theTempDestinationAuthorizationEntry;
            theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDestinationAuthorizationEntry", theTempDestinationAuthorizationEntry), currentHashCode, theTempDestinationAuthorizationEntry);
        }
        {
            String theWriteACLs;
            theWriteACLs = this.getWriteACLs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writeACLs", theWriteACLs), currentHashCode, theWriteACLs);
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
        if (!(object instanceof DtoSimpleAuthorizationMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoSimpleAuthorizationMap that = ((DtoSimpleAuthorizationMap) object);
        {
            List<Object> lhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
            lhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry = (((this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry!= null)&&(!this.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry.isEmpty()))?this.getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry():null);
            List<Object> rhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry;
            rhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry = (((that.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry!= null)&&(!that.adminACLsOrReadACLsOrTempDestinationAuthorizationEntry.isEmpty()))?that.getAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminACLsOrReadACLsOrTempDestinationAuthorizationEntry", lhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry), LocatorUtils.property(thatLocator, "adminACLsOrReadACLsOrTempDestinationAuthorizationEntry", rhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry), lhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry, rhsAdminACLsOrReadACLsOrTempDestinationAuthorizationEntry)) {
                return false;
            }
        }
        {
            String lhsAdminACLs;
            lhsAdminACLs = this.getAdminACLs();
            String rhsAdminACLs;
            rhsAdminACLs = that.getAdminACLs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminACLs", lhsAdminACLs), LocatorUtils.property(thatLocator, "adminACLs", rhsAdminACLs), lhsAdminACLs, rhsAdminACLs)) {
                return false;
            }
        }
        {
            String lhsReadACLs;
            lhsReadACLs = this.getReadACLs();
            String rhsReadACLs;
            rhsReadACLs = that.getReadACLs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readACLs", lhsReadACLs), LocatorUtils.property(thatLocator, "readACLs", rhsReadACLs), lhsReadACLs, rhsReadACLs)) {
                return false;
            }
        }
        {
            String lhsTempDestinationAuthorizationEntry;
            lhsTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
            String rhsTempDestinationAuthorizationEntry;
            rhsTempDestinationAuthorizationEntry = that.getTempDestinationAuthorizationEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempDestinationAuthorizationEntry", lhsTempDestinationAuthorizationEntry), LocatorUtils.property(thatLocator, "tempDestinationAuthorizationEntry", rhsTempDestinationAuthorizationEntry), lhsTempDestinationAuthorizationEntry, rhsTempDestinationAuthorizationEntry)) {
                return false;
            }
        }
        {
            String lhsWriteACLs;
            lhsWriteACLs = this.getWriteACLs();
            String rhsWriteACLs;
            rhsWriteACLs = that.getWriteACLs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writeACLs", lhsWriteACLs), LocatorUtils.property(thatLocator, "writeACLs", rhsWriteACLs), lhsWriteACLs, rhsWriteACLs)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
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
        "authorizationMap",
        "policyMap",
        "redeliveryPolicyMap",
        "any"
    })
    public static class AdminACLs
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationMap authorizationMap;
        protected DtoPolicyMap policyMap;
        protected DtoRedeliveryPolicyMap redeliveryPolicyMap;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取authorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public DtoAuthorizationMap getAuthorizationMap() {
            return authorizationMap;
        }

        /**
         * 设置authorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public void setAuthorizationMap(DtoAuthorizationMap value) {
            this.authorizationMap = value;
        }

        /**
         * 获取policyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPolicyMap }
         *     
         */
        public DtoPolicyMap getPolicyMap() {
            return policyMap;
        }

        /**
         * 设置policyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPolicyMap }
         *     
         */
        public void setPolicyMap(DtoPolicyMap value) {
            this.policyMap = value;
        }

        /**
         * 获取redeliveryPolicyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public DtoRedeliveryPolicyMap getRedeliveryPolicyMap() {
            return redeliveryPolicyMap;
        }

        /**
         * 设置redeliveryPolicyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public void setRedeliveryPolicyMap(DtoRedeliveryPolicyMap value) {
            this.redeliveryPolicyMap = value;
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                strategy.appendField(locator, this, "authorizationMap", buffer, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                strategy.appendField(locator, this, "policyMap", buffer, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                strategy.appendField(locator, this, "redeliveryPolicyMap", buffer, theRedeliveryPolicyMap);
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationMap", theAuthorizationMap), currentHashCode, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "policyMap", thePolicyMap), currentHashCode, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicyMap", theRedeliveryPolicyMap), currentHashCode, theRedeliveryPolicyMap);
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
            if (!(object instanceof DtoSimpleAuthorizationMap.AdminACLs)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthorizationMap.AdminACLs that = ((DtoSimpleAuthorizationMap.AdminACLs) object);
            {
                DtoAuthorizationMap lhsAuthorizationMap;
                lhsAuthorizationMap = this.getAuthorizationMap();
                DtoAuthorizationMap rhsAuthorizationMap;
                rhsAuthorizationMap = that.getAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationMap", lhsAuthorizationMap), LocatorUtils.property(thatLocator, "authorizationMap", rhsAuthorizationMap), lhsAuthorizationMap, rhsAuthorizationMap)) {
                    return false;
                }
            }
            {
                DtoPolicyMap lhsPolicyMap;
                lhsPolicyMap = this.getPolicyMap();
                DtoPolicyMap rhsPolicyMap;
                rhsPolicyMap = that.getPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "policyMap", lhsPolicyMap), LocatorUtils.property(thatLocator, "policyMap", rhsPolicyMap), lhsPolicyMap, rhsPolicyMap)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPolicyMap lhsRedeliveryPolicyMap;
                lhsRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                DtoRedeliveryPolicyMap rhsRedeliveryPolicyMap;
                rhsRedeliveryPolicyMap = that.getRedeliveryPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicyMap", lhsRedeliveryPolicyMap), LocatorUtils.property(thatLocator, "redeliveryPolicyMap", rhsRedeliveryPolicyMap), lhsRedeliveryPolicyMap, rhsRedeliveryPolicyMap)) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
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
        "authorizationMap",
        "policyMap",
        "redeliveryPolicyMap",
        "any"
    })
    public static class ReadACLs
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationMap authorizationMap;
        protected DtoPolicyMap policyMap;
        protected DtoRedeliveryPolicyMap redeliveryPolicyMap;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取authorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public DtoAuthorizationMap getAuthorizationMap() {
            return authorizationMap;
        }

        /**
         * 设置authorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public void setAuthorizationMap(DtoAuthorizationMap value) {
            this.authorizationMap = value;
        }

        /**
         * 获取policyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPolicyMap }
         *     
         */
        public DtoPolicyMap getPolicyMap() {
            return policyMap;
        }

        /**
         * 设置policyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPolicyMap }
         *     
         */
        public void setPolicyMap(DtoPolicyMap value) {
            this.policyMap = value;
        }

        /**
         * 获取redeliveryPolicyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public DtoRedeliveryPolicyMap getRedeliveryPolicyMap() {
            return redeliveryPolicyMap;
        }

        /**
         * 设置redeliveryPolicyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public void setRedeliveryPolicyMap(DtoRedeliveryPolicyMap value) {
            this.redeliveryPolicyMap = value;
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                strategy.appendField(locator, this, "authorizationMap", buffer, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                strategy.appendField(locator, this, "policyMap", buffer, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                strategy.appendField(locator, this, "redeliveryPolicyMap", buffer, theRedeliveryPolicyMap);
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationMap", theAuthorizationMap), currentHashCode, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "policyMap", thePolicyMap), currentHashCode, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicyMap", theRedeliveryPolicyMap), currentHashCode, theRedeliveryPolicyMap);
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
            if (!(object instanceof DtoSimpleAuthorizationMap.ReadACLs)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthorizationMap.ReadACLs that = ((DtoSimpleAuthorizationMap.ReadACLs) object);
            {
                DtoAuthorizationMap lhsAuthorizationMap;
                lhsAuthorizationMap = this.getAuthorizationMap();
                DtoAuthorizationMap rhsAuthorizationMap;
                rhsAuthorizationMap = that.getAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationMap", lhsAuthorizationMap), LocatorUtils.property(thatLocator, "authorizationMap", rhsAuthorizationMap), lhsAuthorizationMap, rhsAuthorizationMap)) {
                    return false;
                }
            }
            {
                DtoPolicyMap lhsPolicyMap;
                lhsPolicyMap = this.getPolicyMap();
                DtoPolicyMap rhsPolicyMap;
                rhsPolicyMap = that.getPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "policyMap", lhsPolicyMap), LocatorUtils.property(thatLocator, "policyMap", rhsPolicyMap), lhsPolicyMap, rhsPolicyMap)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPolicyMap lhsRedeliveryPolicyMap;
                lhsRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                DtoRedeliveryPolicyMap rhsRedeliveryPolicyMap;
                rhsRedeliveryPolicyMap = that.getRedeliveryPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicyMap", lhsRedeliveryPolicyMap), LocatorUtils.property(thatLocator, "redeliveryPolicyMap", rhsRedeliveryPolicyMap), lhsRedeliveryPolicyMap, rhsRedeliveryPolicyMap)) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempDestinationAuthorizationEntry"/>
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
        "tempDestinationAuthorizationEntry",
        "any"
    })
    public static class TempDestinationAuthorizationEntry
        implements Equals, HashCode, ToString
    {

        protected DtoTempDestinationAuthorizationEntry tempDestinationAuthorizationEntry;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取tempDestinationAuthorizationEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempDestinationAuthorizationEntry }
         *     
         */
        public DtoTempDestinationAuthorizationEntry getTempDestinationAuthorizationEntry() {
            return tempDestinationAuthorizationEntry;
        }

        /**
         * 设置tempDestinationAuthorizationEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempDestinationAuthorizationEntry }
         *     
         */
        public void setTempDestinationAuthorizationEntry(DtoTempDestinationAuthorizationEntry value) {
            this.tempDestinationAuthorizationEntry = value;
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
                DtoTempDestinationAuthorizationEntry theTempDestinationAuthorizationEntry;
                theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                strategy.appendField(locator, this, "tempDestinationAuthorizationEntry", buffer, theTempDestinationAuthorizationEntry);
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
                DtoTempDestinationAuthorizationEntry theTempDestinationAuthorizationEntry;
                theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDestinationAuthorizationEntry", theTempDestinationAuthorizationEntry), currentHashCode, theTempDestinationAuthorizationEntry);
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
            if (!(object instanceof DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry that = ((DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry) object);
            {
                DtoTempDestinationAuthorizationEntry lhsTempDestinationAuthorizationEntry;
                lhsTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                DtoTempDestinationAuthorizationEntry rhsTempDestinationAuthorizationEntry;
                rhsTempDestinationAuthorizationEntry = that.getTempDestinationAuthorizationEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempDestinationAuthorizationEntry", lhsTempDestinationAuthorizationEntry), LocatorUtils.property(thatLocator, "tempDestinationAuthorizationEntry", rhsTempDestinationAuthorizationEntry), lhsTempDestinationAuthorizationEntry, rhsTempDestinationAuthorizationEntry)) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
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
        "authorizationMap",
        "policyMap",
        "redeliveryPolicyMap",
        "any"
    })
    public static class WriteACLs
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationMap authorizationMap;
        protected DtoPolicyMap policyMap;
        protected DtoRedeliveryPolicyMap redeliveryPolicyMap;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取authorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public DtoAuthorizationMap getAuthorizationMap() {
            return authorizationMap;
        }

        /**
         * 设置authorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAuthorizationMap }
         *     
         */
        public void setAuthorizationMap(DtoAuthorizationMap value) {
            this.authorizationMap = value;
        }

        /**
         * 获取policyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPolicyMap }
         *     
         */
        public DtoPolicyMap getPolicyMap() {
            return policyMap;
        }

        /**
         * 设置policyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPolicyMap }
         *     
         */
        public void setPolicyMap(DtoPolicyMap value) {
            this.policyMap = value;
        }

        /**
         * 获取redeliveryPolicyMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public DtoRedeliveryPolicyMap getRedeliveryPolicyMap() {
            return redeliveryPolicyMap;
        }

        /**
         * 设置redeliveryPolicyMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public void setRedeliveryPolicyMap(DtoRedeliveryPolicyMap value) {
            this.redeliveryPolicyMap = value;
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                strategy.appendField(locator, this, "authorizationMap", buffer, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                strategy.appendField(locator, this, "policyMap", buffer, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                strategy.appendField(locator, this, "redeliveryPolicyMap", buffer, theRedeliveryPolicyMap);
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
                DtoAuthorizationMap theAuthorizationMap;
                theAuthorizationMap = this.getAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationMap", theAuthorizationMap), currentHashCode, theAuthorizationMap);
            }
            {
                DtoPolicyMap thePolicyMap;
                thePolicyMap = this.getPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "policyMap", thePolicyMap), currentHashCode, thePolicyMap);
            }
            {
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicyMap", theRedeliveryPolicyMap), currentHashCode, theRedeliveryPolicyMap);
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
            if (!(object instanceof DtoSimpleAuthorizationMap.WriteACLs)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthorizationMap.WriteACLs that = ((DtoSimpleAuthorizationMap.WriteACLs) object);
            {
                DtoAuthorizationMap lhsAuthorizationMap;
                lhsAuthorizationMap = this.getAuthorizationMap();
                DtoAuthorizationMap rhsAuthorizationMap;
                rhsAuthorizationMap = that.getAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationMap", lhsAuthorizationMap), LocatorUtils.property(thatLocator, "authorizationMap", rhsAuthorizationMap), lhsAuthorizationMap, rhsAuthorizationMap)) {
                    return false;
                }
            }
            {
                DtoPolicyMap lhsPolicyMap;
                lhsPolicyMap = this.getPolicyMap();
                DtoPolicyMap rhsPolicyMap;
                rhsPolicyMap = that.getPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "policyMap", lhsPolicyMap), LocatorUtils.property(thatLocator, "policyMap", rhsPolicyMap), lhsPolicyMap, rhsPolicyMap)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPolicyMap lhsRedeliveryPolicyMap;
                lhsRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                DtoRedeliveryPolicyMap rhsRedeliveryPolicyMap;
                rhsRedeliveryPolicyMap = that.getRedeliveryPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicyMap", lhsRedeliveryPolicyMap), LocatorUtils.property(thatLocator, "redeliveryPolicyMap", rhsRedeliveryPolicyMap), lhsRedeliveryPolicyMap, rhsRedeliveryPolicyMap)) {
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
