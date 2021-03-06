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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element name="map" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}cachedLDAPAuthorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lDAPAuthorizationMap"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleAuthorizationMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="map" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "authorizationPlugin")
public class DtoAuthorizationPlugin implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "map", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> contents;
    @XmlAttribute(name = "map")
    protected String map;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private java.util.Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link JAXBElement }{@code <}{@link DtoAuthorizationPlugin.Map }{@code >}
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
     * 获取map属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMap() {
        return map;
    }

    /**
     * 设置map属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMap(String value) {
        this.map = value;
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
    public java.util.Map<QName, String> getOtherAttributes() {
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
            String theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
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
            String theMap;
            theMap = this.getMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "map", theMap), currentHashCode, theMap);
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
        if (!(object instanceof DtoAuthorizationPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoAuthorizationPlugin that = ((DtoAuthorizationPlugin) object);
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
            String lhsMap;
            lhsMap = this.getMap();
            String rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}cachedLDAPAuthorizationMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lDAPAuthorizationMap"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleAuthorizationMap"/>
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
        "cachedLDAPAuthorizationMap",
        "ldapAuthorizationMap",
        "simpleAuthorizationMap",
        "any"
    })
    public static class Map
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationMap authorizationMap;
        protected DtoCachedLDAPAuthorizationMap cachedLDAPAuthorizationMap;
        @XmlElement(name = "lDAPAuthorizationMap")
        protected DtoLDAPAuthorizationMap ldapAuthorizationMap;
        protected DtoSimpleAuthorizationMap simpleAuthorizationMap;
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
         * 获取cachedLDAPAuthorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoCachedLDAPAuthorizationMap }
         *     
         */
        public DtoCachedLDAPAuthorizationMap getCachedLDAPAuthorizationMap() {
            return cachedLDAPAuthorizationMap;
        }

        /**
         * 设置cachedLDAPAuthorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoCachedLDAPAuthorizationMap }
         *     
         */
        public void setCachedLDAPAuthorizationMap(DtoCachedLDAPAuthorizationMap value) {
            this.cachedLDAPAuthorizationMap = value;
        }

        /**
         * 获取ldapAuthorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLDAPAuthorizationMap }
         *     
         */
        public DtoLDAPAuthorizationMap getLDAPAuthorizationMap() {
            return ldapAuthorizationMap;
        }

        /**
         * 设置ldapAuthorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLDAPAuthorizationMap }
         *     
         */
        public void setLDAPAuthorizationMap(DtoLDAPAuthorizationMap value) {
            this.ldapAuthorizationMap = value;
        }

        /**
         * 获取simpleAuthorizationMap属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSimpleAuthorizationMap }
         *     
         */
        public DtoSimpleAuthorizationMap getSimpleAuthorizationMap() {
            return simpleAuthorizationMap;
        }

        /**
         * 设置simpleAuthorizationMap属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSimpleAuthorizationMap }
         *     
         */
        public void setSimpleAuthorizationMap(DtoSimpleAuthorizationMap value) {
            this.simpleAuthorizationMap = value;
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
                DtoCachedLDAPAuthorizationMap theCachedLDAPAuthorizationMap;
                theCachedLDAPAuthorizationMap = this.getCachedLDAPAuthorizationMap();
                strategy.appendField(locator, this, "cachedLDAPAuthorizationMap", buffer, theCachedLDAPAuthorizationMap);
            }
            {
                DtoLDAPAuthorizationMap theLDAPAuthorizationMap;
                theLDAPAuthorizationMap = this.getLDAPAuthorizationMap();
                strategy.appendField(locator, this, "ldapAuthorizationMap", buffer, theLDAPAuthorizationMap);
            }
            {
                DtoSimpleAuthorizationMap theSimpleAuthorizationMap;
                theSimpleAuthorizationMap = this.getSimpleAuthorizationMap();
                strategy.appendField(locator, this, "simpleAuthorizationMap", buffer, theSimpleAuthorizationMap);
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
                DtoCachedLDAPAuthorizationMap theCachedLDAPAuthorizationMap;
                theCachedLDAPAuthorizationMap = this.getCachedLDAPAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cachedLDAPAuthorizationMap", theCachedLDAPAuthorizationMap), currentHashCode, theCachedLDAPAuthorizationMap);
            }
            {
                DtoLDAPAuthorizationMap theLDAPAuthorizationMap;
                theLDAPAuthorizationMap = this.getLDAPAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ldapAuthorizationMap", theLDAPAuthorizationMap), currentHashCode, theLDAPAuthorizationMap);
            }
            {
                DtoSimpleAuthorizationMap theSimpleAuthorizationMap;
                theSimpleAuthorizationMap = this.getSimpleAuthorizationMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleAuthorizationMap", theSimpleAuthorizationMap), currentHashCode, theSimpleAuthorizationMap);
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
            if (!(object instanceof DtoAuthorizationPlugin.Map)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAuthorizationPlugin.Map that = ((DtoAuthorizationPlugin.Map) object);
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
                DtoCachedLDAPAuthorizationMap lhsCachedLDAPAuthorizationMap;
                lhsCachedLDAPAuthorizationMap = this.getCachedLDAPAuthorizationMap();
                DtoCachedLDAPAuthorizationMap rhsCachedLDAPAuthorizationMap;
                rhsCachedLDAPAuthorizationMap = that.getCachedLDAPAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "cachedLDAPAuthorizationMap", lhsCachedLDAPAuthorizationMap), LocatorUtils.property(thatLocator, "cachedLDAPAuthorizationMap", rhsCachedLDAPAuthorizationMap), lhsCachedLDAPAuthorizationMap, rhsCachedLDAPAuthorizationMap)) {
                    return false;
                }
            }
            {
                DtoLDAPAuthorizationMap lhsLDAPAuthorizationMap;
                lhsLDAPAuthorizationMap = this.getLDAPAuthorizationMap();
                DtoLDAPAuthorizationMap rhsLDAPAuthorizationMap;
                rhsLDAPAuthorizationMap = that.getLDAPAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ldapAuthorizationMap", lhsLDAPAuthorizationMap), LocatorUtils.property(thatLocator, "ldapAuthorizationMap", rhsLDAPAuthorizationMap), lhsLDAPAuthorizationMap, rhsLDAPAuthorizationMap)) {
                    return false;
                }
            }
            {
                DtoSimpleAuthorizationMap lhsSimpleAuthorizationMap;
                lhsSimpleAuthorizationMap = this.getSimpleAuthorizationMap();
                DtoSimpleAuthorizationMap rhsSimpleAuthorizationMap;
                rhsSimpleAuthorizationMap = that.getSimpleAuthorizationMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleAuthorizationMap", lhsSimpleAuthorizationMap), LocatorUtils.property(thatLocator, "simpleAuthorizationMap", rhsSimpleAuthorizationMap), lhsSimpleAuthorizationMap, rhsSimpleAuthorizationMap)) {
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
