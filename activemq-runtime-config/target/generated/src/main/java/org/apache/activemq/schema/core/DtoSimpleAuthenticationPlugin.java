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
 *           &lt;element name="userGroups" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="userPasswords" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="users" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="anonymousAccessAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="anonymousGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="anonymousUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userGroups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userPasswords" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "simpleAuthenticationPlugin")
public class DtoSimpleAuthenticationPlugin implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "userPasswords", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "userGroups", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "users", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> contents;
    @XmlAttribute(name = "anonymousAccessAllowed")
    protected Boolean anonymousAccessAllowed;
    @XmlAttribute(name = "anonymousGroup")
    protected String anonymousGroup;
    @XmlAttribute(name = "anonymousUser")
    protected String anonymousUser;
    @XmlAttribute(name = "userGroups")
    protected String userGroups;
    @XmlAttribute(name = "userPasswords")
    protected String userPasswords;
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
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.UserPasswords }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.Users }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.UserGroups }{@code >}
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
     * 获取anonymousAccessAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymousAccessAllowed() {
        return anonymousAccessAllowed;
    }

    /**
     * 设置anonymousAccessAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymousAccessAllowed(Boolean value) {
        this.anonymousAccessAllowed = value;
    }

    /**
     * 获取anonymousGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousGroup() {
        return anonymousGroup;
    }

    /**
     * 设置anonymousGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousGroup(String value) {
        this.anonymousGroup = value;
    }

    /**
     * 获取anonymousUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousUser() {
        return anonymousUser;
    }

    /**
     * 设置anonymousUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousUser(String value) {
        this.anonymousUser = value;
    }

    /**
     * 获取userGroups属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroups() {
        return userGroups;
    }

    /**
     * 设置userGroups属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroups(String value) {
        this.userGroups = value;
    }

    /**
     * 获取userPasswords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPasswords() {
        return userPasswords;
    }

    /**
     * 设置userPasswords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPasswords(String value) {
        this.userPasswords = value;
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
            Boolean theAnonymousAccessAllowed;
            theAnonymousAccessAllowed = this.isAnonymousAccessAllowed();
            strategy.appendField(locator, this, "anonymousAccessAllowed", buffer, theAnonymousAccessAllowed);
        }
        {
            String theAnonymousGroup;
            theAnonymousGroup = this.getAnonymousGroup();
            strategy.appendField(locator, this, "anonymousGroup", buffer, theAnonymousGroup);
        }
        {
            String theAnonymousUser;
            theAnonymousUser = this.getAnonymousUser();
            strategy.appendField(locator, this, "anonymousUser", buffer, theAnonymousUser);
        }
        {
            String theUserGroups;
            theUserGroups = this.getUserGroups();
            strategy.appendField(locator, this, "userGroups", buffer, theUserGroups);
        }
        {
            String theUserPasswords;
            theUserPasswords = this.getUserPasswords();
            strategy.appendField(locator, this, "userPasswords", buffer, theUserPasswords);
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
            Boolean theAnonymousAccessAllowed;
            theAnonymousAccessAllowed = this.isAnonymousAccessAllowed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anonymousAccessAllowed", theAnonymousAccessAllowed), currentHashCode, theAnonymousAccessAllowed);
        }
        {
            String theAnonymousGroup;
            theAnonymousGroup = this.getAnonymousGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anonymousGroup", theAnonymousGroup), currentHashCode, theAnonymousGroup);
        }
        {
            String theAnonymousUser;
            theAnonymousUser = this.getAnonymousUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anonymousUser", theAnonymousUser), currentHashCode, theAnonymousUser);
        }
        {
            String theUserGroups;
            theUserGroups = this.getUserGroups();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userGroups", theUserGroups), currentHashCode, theUserGroups);
        }
        {
            String theUserPasswords;
            theUserPasswords = this.getUserPasswords();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userPasswords", theUserPasswords), currentHashCode, theUserPasswords);
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
        if (!(object instanceof DtoSimpleAuthenticationPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoSimpleAuthenticationPlugin that = ((DtoSimpleAuthenticationPlugin) object);
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
            Boolean lhsAnonymousAccessAllowed;
            lhsAnonymousAccessAllowed = this.isAnonymousAccessAllowed();
            Boolean rhsAnonymousAccessAllowed;
            rhsAnonymousAccessAllowed = that.isAnonymousAccessAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anonymousAccessAllowed", lhsAnonymousAccessAllowed), LocatorUtils.property(thatLocator, "anonymousAccessAllowed", rhsAnonymousAccessAllowed), lhsAnonymousAccessAllowed, rhsAnonymousAccessAllowed)) {
                return false;
            }
        }
        {
            String lhsAnonymousGroup;
            lhsAnonymousGroup = this.getAnonymousGroup();
            String rhsAnonymousGroup;
            rhsAnonymousGroup = that.getAnonymousGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anonymousGroup", lhsAnonymousGroup), LocatorUtils.property(thatLocator, "anonymousGroup", rhsAnonymousGroup), lhsAnonymousGroup, rhsAnonymousGroup)) {
                return false;
            }
        }
        {
            String lhsAnonymousUser;
            lhsAnonymousUser = this.getAnonymousUser();
            String rhsAnonymousUser;
            rhsAnonymousUser = that.getAnonymousUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anonymousUser", lhsAnonymousUser), LocatorUtils.property(thatLocator, "anonymousUser", rhsAnonymousUser), lhsAnonymousUser, rhsAnonymousUser)) {
                return false;
            }
        }
        {
            String lhsUserGroups;
            lhsUserGroups = this.getUserGroups();
            String rhsUserGroups;
            rhsUserGroups = that.getUserGroups();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userGroups", lhsUserGroups), LocatorUtils.property(thatLocator, "userGroups", rhsUserGroups), lhsUserGroups, rhsUserGroups)) {
                return false;
            }
        }
        {
            String lhsUserPasswords;
            lhsUserPasswords = this.getUserPasswords();
            String rhsUserPasswords;
            rhsUserPasswords = that.getUserPasswords();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userPasswords", lhsUserPasswords), LocatorUtils.property(thatLocator, "userPasswords", rhsUserPasswords), lhsUserPasswords, rhsUserPasswords)) {
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
        "any"
    })
    public static class UserGroups
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
            if (!(object instanceof DtoSimpleAuthenticationPlugin.UserGroups)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthenticationPlugin.UserGroups that = ((DtoSimpleAuthenticationPlugin.UserGroups) object);
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
    public static class UserPasswords
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
            if (!(object instanceof DtoSimpleAuthenticationPlugin.UserPasswords)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthenticationPlugin.UserPasswords that = ((DtoSimpleAuthenticationPlugin.UserPasswords) object);
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
    public static class Users
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
            if (!(object instanceof DtoSimpleAuthenticationPlugin.Users)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSimpleAuthenticationPlugin.Users that = ((DtoSimpleAuthenticationPlugin.Users) object);
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

}
