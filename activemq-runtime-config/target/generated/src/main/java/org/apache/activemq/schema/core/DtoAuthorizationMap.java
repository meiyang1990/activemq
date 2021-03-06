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
 *           &lt;element name="authorizationEntries" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="defaultEntry" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationEntry"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempDestinationAuthorizationEntry"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="entries" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="defaultEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempDestinationAuthorizationEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "contents"
})
@XmlRootElement(name = "authorizationMap")
public class DtoAuthorizationMap
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "tempDestinationAuthorizationEntry", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "entries", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "authorizationEntries", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "defaultEntry", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> contents;
    @XmlAttribute(name = "defaultEntry")
    protected String defaultEntry;
    @XmlAttribute(name = "groupClass")
    protected String groupClass;
    @XmlAttribute(name = "tempDestinationAuthorizationEntry")
    protected String tempDestinationAuthorizationEntry;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.TempDestinationAuthorizationEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.Entries }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.AuthorizationEntries }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.DefaultEntry }{@code >}
     * 
     * 
     */
    public List<Object> getContents() {
        if (contents == null) {
            contents = new ArrayList<Object>();
        }
        return this.contents;
    }

    /**
     * 获取defaultEntry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEntry() {
        return defaultEntry;
    }

    /**
     * 设置defaultEntry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEntry(String value) {
        this.defaultEntry = value;
    }

    /**
     * 获取groupClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupClass() {
        return groupClass;
    }

    /**
     * 设置groupClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupClass(String value) {
        this.groupClass = value;
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
            List<Object> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            strategy.appendField(locator, this, "contents", buffer, theContents);
        }
        {
            String theDefaultEntry;
            theDefaultEntry = this.getDefaultEntry();
            strategy.appendField(locator, this, "defaultEntry", buffer, theDefaultEntry);
        }
        {
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            strategy.appendField(locator, this, "groupClass", buffer, theGroupClass);
        }
        {
            String theTempDestinationAuthorizationEntry;
            theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
            strategy.appendField(locator, this, "tempDestinationAuthorizationEntry", buffer, theTempDestinationAuthorizationEntry);
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
            List<Object> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
        }
        {
            String theDefaultEntry;
            theDefaultEntry = this.getDefaultEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultEntry", theDefaultEntry), currentHashCode, theDefaultEntry);
        }
        {
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupClass", theGroupClass), currentHashCode, theGroupClass);
        }
        {
            String theTempDestinationAuthorizationEntry;
            theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDestinationAuthorizationEntry", theTempDestinationAuthorizationEntry), currentHashCode, theTempDestinationAuthorizationEntry);
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
        if (!(object instanceof DtoAuthorizationMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoAuthorizationMap that = ((DtoAuthorizationMap) object);
        {
            List<Object> lhsContents;
            lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            List<Object> rhsContents;
            rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                return false;
            }
        }
        {
            String lhsDefaultEntry;
            lhsDefaultEntry = this.getDefaultEntry();
            String rhsDefaultEntry;
            rhsDefaultEntry = that.getDefaultEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultEntry", lhsDefaultEntry), LocatorUtils.property(thatLocator, "defaultEntry", rhsDefaultEntry), lhsDefaultEntry, rhsDefaultEntry)) {
                return false;
            }
        }
        {
            String lhsGroupClass;
            lhsGroupClass = this.getGroupClass();
            String rhsGroupClass;
            rhsGroupClass = that.getGroupClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupClass", lhsGroupClass), LocatorUtils.property(thatLocator, "groupClass", rhsGroupClass), lhsGroupClass, rhsGroupClass)) {
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
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
        "contents"
    })
    public static class AuthorizationEntries
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> contents;

        /**
         * Gets the value of the contents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getContents() {
            if (contents == null) {
                contents = new ArrayList<Object>();
            }
            return this.contents;
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
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoAuthorizationMap.AuthorizationEntries)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAuthorizationMap.AuthorizationEntries that = ((DtoAuthorizationMap.AuthorizationEntries) object);
            {
                List<Object> lhsContents;
                lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                List<Object> rhsContents;
                rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationEntry"/>
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
        "authorizationEntry",
        "tempDestinationAuthorizationEntry",
        "any"
    })
    public static class DefaultEntry
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationEntry authorizationEntry;
        protected DtoTempDestinationAuthorizationEntry tempDestinationAuthorizationEntry;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取authorizationEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAuthorizationEntry }
         *     
         */
        public DtoAuthorizationEntry getAuthorizationEntry() {
            return authorizationEntry;
        }

        /**
         * 设置authorizationEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAuthorizationEntry }
         *     
         */
        public void setAuthorizationEntry(DtoAuthorizationEntry value) {
            this.authorizationEntry = value;
        }

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
                DtoAuthorizationEntry theAuthorizationEntry;
                theAuthorizationEntry = this.getAuthorizationEntry();
                strategy.appendField(locator, this, "authorizationEntry", buffer, theAuthorizationEntry);
            }
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
                DtoAuthorizationEntry theAuthorizationEntry;
                theAuthorizationEntry = this.getAuthorizationEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationEntry", theAuthorizationEntry), currentHashCode, theAuthorizationEntry);
            }
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
            if (!(object instanceof DtoAuthorizationMap.DefaultEntry)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAuthorizationMap.DefaultEntry that = ((DtoAuthorizationMap.DefaultEntry) object);
            {
                DtoAuthorizationEntry lhsAuthorizationEntry;
                lhsAuthorizationEntry = this.getAuthorizationEntry();
                DtoAuthorizationEntry rhsAuthorizationEntry;
                rhsAuthorizationEntry = that.getAuthorizationEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationEntry", lhsAuthorizationEntry), LocatorUtils.property(thatLocator, "authorizationEntry", rhsAuthorizationEntry), lhsAuthorizationEntry, rhsAuthorizationEntry)) {
                    return false;
                }
            }
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
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
    public static class Entries
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
            if (!(object instanceof DtoAuthorizationMap.Entries)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAuthorizationMap.Entries that = ((DtoAuthorizationMap.Entries) object);
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
            if (!(object instanceof DtoAuthorizationMap.TempDestinationAuthorizationEntry)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAuthorizationMap.TempDestinationAuthorizationEntry that = ((DtoAuthorizationMap.TempDestinationAuthorizationEntry) object);
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

}
