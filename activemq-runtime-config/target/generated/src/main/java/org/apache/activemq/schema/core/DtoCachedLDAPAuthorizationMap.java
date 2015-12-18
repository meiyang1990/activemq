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
 *       &lt;attribute name="adminPermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authentication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionProtocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="legacyGroupMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="permissionGroupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readPermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refreshDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="refreshInterval" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tempSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="writePermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "cachedLDAPAuthorizationMap")
public class DtoCachedLDAPAuthorizationMap
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "adminPermissionGroupSearchFilter")
    protected String adminPermissionGroupSearchFilter;
    @XmlAttribute(name = "authentication")
    protected String authentication;
    @XmlAttribute(name = "connectionPassword")
    protected String connectionPassword;
    @XmlAttribute(name = "connectionProtocol")
    protected String connectionProtocol;
    @XmlAttribute(name = "connectionURL")
    protected String connectionURL;
    @XmlAttribute(name = "connectionUsername")
    protected String connectionUsername;
    @XmlAttribute(name = "groupClass")
    protected String groupClass;
    @XmlAttribute(name = "groupNameAttribute")
    protected String groupNameAttribute;
    @XmlAttribute(name = "groupObjectClass")
    protected String groupObjectClass;
    @XmlAttribute(name = "legacyGroupMapping")
    protected Boolean legacyGroupMapping;
    @XmlAttribute(name = "permissionGroupMemberAttribute")
    protected String permissionGroupMemberAttribute;
    @XmlAttribute(name = "queueSearchBase")
    protected String queueSearchBase;
    @XmlAttribute(name = "readPermissionGroupSearchFilter")
    protected String readPermissionGroupSearchFilter;
    @XmlAttribute(name = "refreshDisabled")
    protected Boolean refreshDisabled;
    @XmlAttribute(name = "refreshInterval")
    protected BigInteger refreshInterval;
    @XmlAttribute(name = "tempSearchBase")
    protected String tempSearchBase;
    @XmlAttribute(name = "topicSearchBase")
    protected String topicSearchBase;
    @XmlAttribute(name = "userNameAttribute")
    protected String userNameAttribute;
    @XmlAttribute(name = "userObjectClass")
    protected String userObjectClass;
    @XmlAttribute(name = "writePermissionGroupSearchFilter")
    protected String writePermissionGroupSearchFilter;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取adminPermissionGroupSearchFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPermissionGroupSearchFilter() {
        return adminPermissionGroupSearchFilter;
    }

    /**
     * 设置adminPermissionGroupSearchFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPermissionGroupSearchFilter(String value) {
        this.adminPermissionGroupSearchFilter = value;
    }

    /**
     * 获取authentication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 设置authentication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentication(String value) {
        this.authentication = value;
    }

    /**
     * 获取connectionPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPassword() {
        return connectionPassword;
    }

    /**
     * 设置connectionPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPassword(String value) {
        this.connectionPassword = value;
    }

    /**
     * 获取connectionProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionProtocol() {
        return connectionProtocol;
    }

    /**
     * 设置connectionProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionProtocol(String value) {
        this.connectionProtocol = value;
    }

    /**
     * 获取connectionURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionURL() {
        return connectionURL;
    }

    /**
     * 设置connectionURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionURL(String value) {
        this.connectionURL = value;
    }

    /**
     * 获取connectionUsername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionUsername() {
        return connectionUsername;
    }

    /**
     * 设置connectionUsername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionUsername(String value) {
        this.connectionUsername = value;
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
     * 获取groupNameAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNameAttribute() {
        return groupNameAttribute;
    }

    /**
     * 设置groupNameAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNameAttribute(String value) {
        this.groupNameAttribute = value;
    }

    /**
     * 获取groupObjectClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupObjectClass() {
        return groupObjectClass;
    }

    /**
     * 设置groupObjectClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupObjectClass(String value) {
        this.groupObjectClass = value;
    }

    /**
     * 获取legacyGroupMapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegacyGroupMapping() {
        return legacyGroupMapping;
    }

    /**
     * 设置legacyGroupMapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegacyGroupMapping(Boolean value) {
        this.legacyGroupMapping = value;
    }

    /**
     * 获取permissionGroupMemberAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionGroupMemberAttribute() {
        return permissionGroupMemberAttribute;
    }

    /**
     * 设置permissionGroupMemberAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionGroupMemberAttribute(String value) {
        this.permissionGroupMemberAttribute = value;
    }

    /**
     * 获取queueSearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSearchBase() {
        return queueSearchBase;
    }

    /**
     * 设置queueSearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSearchBase(String value) {
        this.queueSearchBase = value;
    }

    /**
     * 获取readPermissionGroupSearchFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadPermissionGroupSearchFilter() {
        return readPermissionGroupSearchFilter;
    }

    /**
     * 设置readPermissionGroupSearchFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadPermissionGroupSearchFilter(String value) {
        this.readPermissionGroupSearchFilter = value;
    }

    /**
     * 获取refreshDisabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshDisabled() {
        return refreshDisabled;
    }

    /**
     * 设置refreshDisabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshDisabled(Boolean value) {
        this.refreshDisabled = value;
    }

    /**
     * 获取refreshInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * 设置refreshInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefreshInterval(BigInteger value) {
        this.refreshInterval = value;
    }

    /**
     * 获取tempSearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempSearchBase() {
        return tempSearchBase;
    }

    /**
     * 设置tempSearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempSearchBase(String value) {
        this.tempSearchBase = value;
    }

    /**
     * 获取topicSearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicSearchBase() {
        return topicSearchBase;
    }

    /**
     * 设置topicSearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicSearchBase(String value) {
        this.topicSearchBase = value;
    }

    /**
     * 获取userNameAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameAttribute() {
        return userNameAttribute;
    }

    /**
     * 设置userNameAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameAttribute(String value) {
        this.userNameAttribute = value;
    }

    /**
     * 获取userObjectClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectClass() {
        return userObjectClass;
    }

    /**
     * 设置userObjectClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectClass(String value) {
        this.userObjectClass = value;
    }

    /**
     * 获取writePermissionGroupSearchFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritePermissionGroupSearchFilter() {
        return writePermissionGroupSearchFilter;
    }

    /**
     * 设置writePermissionGroupSearchFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritePermissionGroupSearchFilter(String value) {
        this.writePermissionGroupSearchFilter = value;
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
            String theAdminPermissionGroupSearchFilter;
            theAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            strategy.appendField(locator, this, "adminPermissionGroupSearchFilter", buffer, theAdminPermissionGroupSearchFilter);
        }
        {
            String theAuthentication;
            theAuthentication = this.getAuthentication();
            strategy.appendField(locator, this, "authentication", buffer, theAuthentication);
        }
        {
            String theConnectionPassword;
            theConnectionPassword = this.getConnectionPassword();
            strategy.appendField(locator, this, "connectionPassword", buffer, theConnectionPassword);
        }
        {
            String theConnectionProtocol;
            theConnectionProtocol = this.getConnectionProtocol();
            strategy.appendField(locator, this, "connectionProtocol", buffer, theConnectionProtocol);
        }
        {
            String theConnectionURL;
            theConnectionURL = this.getConnectionURL();
            strategy.appendField(locator, this, "connectionURL", buffer, theConnectionURL);
        }
        {
            String theConnectionUsername;
            theConnectionUsername = this.getConnectionUsername();
            strategy.appendField(locator, this, "connectionUsername", buffer, theConnectionUsername);
        }
        {
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            strategy.appendField(locator, this, "groupClass", buffer, theGroupClass);
        }
        {
            String theGroupNameAttribute;
            theGroupNameAttribute = this.getGroupNameAttribute();
            strategy.appendField(locator, this, "groupNameAttribute", buffer, theGroupNameAttribute);
        }
        {
            String theGroupObjectClass;
            theGroupObjectClass = this.getGroupObjectClass();
            strategy.appendField(locator, this, "groupObjectClass", buffer, theGroupObjectClass);
        }
        {
            Boolean theLegacyGroupMapping;
            theLegacyGroupMapping = this.isLegacyGroupMapping();
            strategy.appendField(locator, this, "legacyGroupMapping", buffer, theLegacyGroupMapping);
        }
        {
            String thePermissionGroupMemberAttribute;
            thePermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            strategy.appendField(locator, this, "permissionGroupMemberAttribute", buffer, thePermissionGroupMemberAttribute);
        }
        {
            String theQueueSearchBase;
            theQueueSearchBase = this.getQueueSearchBase();
            strategy.appendField(locator, this, "queueSearchBase", buffer, theQueueSearchBase);
        }
        {
            String theReadPermissionGroupSearchFilter;
            theReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            strategy.appendField(locator, this, "readPermissionGroupSearchFilter", buffer, theReadPermissionGroupSearchFilter);
        }
        {
            Boolean theRefreshDisabled;
            theRefreshDisabled = this.isRefreshDisabled();
            strategy.appendField(locator, this, "refreshDisabled", buffer, theRefreshDisabled);
        }
        {
            BigInteger theRefreshInterval;
            theRefreshInterval = this.getRefreshInterval();
            strategy.appendField(locator, this, "refreshInterval", buffer, theRefreshInterval);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            strategy.appendField(locator, this, "tempSearchBase", buffer, theTempSearchBase);
        }
        {
            String theTopicSearchBase;
            theTopicSearchBase = this.getTopicSearchBase();
            strategy.appendField(locator, this, "topicSearchBase", buffer, theTopicSearchBase);
        }
        {
            String theUserNameAttribute;
            theUserNameAttribute = this.getUserNameAttribute();
            strategy.appendField(locator, this, "userNameAttribute", buffer, theUserNameAttribute);
        }
        {
            String theUserObjectClass;
            theUserObjectClass = this.getUserObjectClass();
            strategy.appendField(locator, this, "userObjectClass", buffer, theUserObjectClass);
        }
        {
            String theWritePermissionGroupSearchFilter;
            theWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            strategy.appendField(locator, this, "writePermissionGroupSearchFilter", buffer, theWritePermissionGroupSearchFilter);
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
            String theAdminPermissionGroupSearchFilter;
            theAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminPermissionGroupSearchFilter", theAdminPermissionGroupSearchFilter), currentHashCode, theAdminPermissionGroupSearchFilter);
        }
        {
            String theAuthentication;
            theAuthentication = this.getAuthentication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authentication", theAuthentication), currentHashCode, theAuthentication);
        }
        {
            String theConnectionPassword;
            theConnectionPassword = this.getConnectionPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionPassword", theConnectionPassword), currentHashCode, theConnectionPassword);
        }
        {
            String theConnectionProtocol;
            theConnectionProtocol = this.getConnectionProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionProtocol", theConnectionProtocol), currentHashCode, theConnectionProtocol);
        }
        {
            String theConnectionURL;
            theConnectionURL = this.getConnectionURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionURL", theConnectionURL), currentHashCode, theConnectionURL);
        }
        {
            String theConnectionUsername;
            theConnectionUsername = this.getConnectionUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionUsername", theConnectionUsername), currentHashCode, theConnectionUsername);
        }
        {
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupClass", theGroupClass), currentHashCode, theGroupClass);
        }
        {
            String theGroupNameAttribute;
            theGroupNameAttribute = this.getGroupNameAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupNameAttribute", theGroupNameAttribute), currentHashCode, theGroupNameAttribute);
        }
        {
            String theGroupObjectClass;
            theGroupObjectClass = this.getGroupObjectClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupObjectClass", theGroupObjectClass), currentHashCode, theGroupObjectClass);
        }
        {
            Boolean theLegacyGroupMapping;
            theLegacyGroupMapping = this.isLegacyGroupMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legacyGroupMapping", theLegacyGroupMapping), currentHashCode, theLegacyGroupMapping);
        }
        {
            String thePermissionGroupMemberAttribute;
            thePermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissionGroupMemberAttribute", thePermissionGroupMemberAttribute), currentHashCode, thePermissionGroupMemberAttribute);
        }
        {
            String theQueueSearchBase;
            theQueueSearchBase = this.getQueueSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueSearchBase", theQueueSearchBase), currentHashCode, theQueueSearchBase);
        }
        {
            String theReadPermissionGroupSearchFilter;
            theReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readPermissionGroupSearchFilter", theReadPermissionGroupSearchFilter), currentHashCode, theReadPermissionGroupSearchFilter);
        }
        {
            Boolean theRefreshDisabled;
            theRefreshDisabled = this.isRefreshDisabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refreshDisabled", theRefreshDisabled), currentHashCode, theRefreshDisabled);
        }
        {
            BigInteger theRefreshInterval;
            theRefreshInterval = this.getRefreshInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refreshInterval", theRefreshInterval), currentHashCode, theRefreshInterval);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempSearchBase", theTempSearchBase), currentHashCode, theTempSearchBase);
        }
        {
            String theTopicSearchBase;
            theTopicSearchBase = this.getTopicSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicSearchBase", theTopicSearchBase), currentHashCode, theTopicSearchBase);
        }
        {
            String theUserNameAttribute;
            theUserNameAttribute = this.getUserNameAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userNameAttribute", theUserNameAttribute), currentHashCode, theUserNameAttribute);
        }
        {
            String theUserObjectClass;
            theUserObjectClass = this.getUserObjectClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userObjectClass", theUserObjectClass), currentHashCode, theUserObjectClass);
        }
        {
            String theWritePermissionGroupSearchFilter;
            theWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writePermissionGroupSearchFilter", theWritePermissionGroupSearchFilter), currentHashCode, theWritePermissionGroupSearchFilter);
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
        if (!(object instanceof DtoCachedLDAPAuthorizationMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoCachedLDAPAuthorizationMap that = ((DtoCachedLDAPAuthorizationMap) object);
        {
            String lhsAdminPermissionGroupSearchFilter;
            lhsAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            String rhsAdminPermissionGroupSearchFilter;
            rhsAdminPermissionGroupSearchFilter = that.getAdminPermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminPermissionGroupSearchFilter", lhsAdminPermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "adminPermissionGroupSearchFilter", rhsAdminPermissionGroupSearchFilter), lhsAdminPermissionGroupSearchFilter, rhsAdminPermissionGroupSearchFilter)) {
                return false;
            }
        }
        {
            String lhsAuthentication;
            lhsAuthentication = this.getAuthentication();
            String rhsAuthentication;
            rhsAuthentication = that.getAuthentication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authentication", lhsAuthentication), LocatorUtils.property(thatLocator, "authentication", rhsAuthentication), lhsAuthentication, rhsAuthentication)) {
                return false;
            }
        }
        {
            String lhsConnectionPassword;
            lhsConnectionPassword = this.getConnectionPassword();
            String rhsConnectionPassword;
            rhsConnectionPassword = that.getConnectionPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionPassword", lhsConnectionPassword), LocatorUtils.property(thatLocator, "connectionPassword", rhsConnectionPassword), lhsConnectionPassword, rhsConnectionPassword)) {
                return false;
            }
        }
        {
            String lhsConnectionProtocol;
            lhsConnectionProtocol = this.getConnectionProtocol();
            String rhsConnectionProtocol;
            rhsConnectionProtocol = that.getConnectionProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionProtocol", lhsConnectionProtocol), LocatorUtils.property(thatLocator, "connectionProtocol", rhsConnectionProtocol), lhsConnectionProtocol, rhsConnectionProtocol)) {
                return false;
            }
        }
        {
            String lhsConnectionURL;
            lhsConnectionURL = this.getConnectionURL();
            String rhsConnectionURL;
            rhsConnectionURL = that.getConnectionURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionURL", lhsConnectionURL), LocatorUtils.property(thatLocator, "connectionURL", rhsConnectionURL), lhsConnectionURL, rhsConnectionURL)) {
                return false;
            }
        }
        {
            String lhsConnectionUsername;
            lhsConnectionUsername = this.getConnectionUsername();
            String rhsConnectionUsername;
            rhsConnectionUsername = that.getConnectionUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionUsername", lhsConnectionUsername), LocatorUtils.property(thatLocator, "connectionUsername", rhsConnectionUsername), lhsConnectionUsername, rhsConnectionUsername)) {
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
            String lhsGroupNameAttribute;
            lhsGroupNameAttribute = this.getGroupNameAttribute();
            String rhsGroupNameAttribute;
            rhsGroupNameAttribute = that.getGroupNameAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupNameAttribute", lhsGroupNameAttribute), LocatorUtils.property(thatLocator, "groupNameAttribute", rhsGroupNameAttribute), lhsGroupNameAttribute, rhsGroupNameAttribute)) {
                return false;
            }
        }
        {
            String lhsGroupObjectClass;
            lhsGroupObjectClass = this.getGroupObjectClass();
            String rhsGroupObjectClass;
            rhsGroupObjectClass = that.getGroupObjectClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupObjectClass", lhsGroupObjectClass), LocatorUtils.property(thatLocator, "groupObjectClass", rhsGroupObjectClass), lhsGroupObjectClass, rhsGroupObjectClass)) {
                return false;
            }
        }
        {
            Boolean lhsLegacyGroupMapping;
            lhsLegacyGroupMapping = this.isLegacyGroupMapping();
            Boolean rhsLegacyGroupMapping;
            rhsLegacyGroupMapping = that.isLegacyGroupMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legacyGroupMapping", lhsLegacyGroupMapping), LocatorUtils.property(thatLocator, "legacyGroupMapping", rhsLegacyGroupMapping), lhsLegacyGroupMapping, rhsLegacyGroupMapping)) {
                return false;
            }
        }
        {
            String lhsPermissionGroupMemberAttribute;
            lhsPermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            String rhsPermissionGroupMemberAttribute;
            rhsPermissionGroupMemberAttribute = that.getPermissionGroupMemberAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissionGroupMemberAttribute", lhsPermissionGroupMemberAttribute), LocatorUtils.property(thatLocator, "permissionGroupMemberAttribute", rhsPermissionGroupMemberAttribute), lhsPermissionGroupMemberAttribute, rhsPermissionGroupMemberAttribute)) {
                return false;
            }
        }
        {
            String lhsQueueSearchBase;
            lhsQueueSearchBase = this.getQueueSearchBase();
            String rhsQueueSearchBase;
            rhsQueueSearchBase = that.getQueueSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueSearchBase", lhsQueueSearchBase), LocatorUtils.property(thatLocator, "queueSearchBase", rhsQueueSearchBase), lhsQueueSearchBase, rhsQueueSearchBase)) {
                return false;
            }
        }
        {
            String lhsReadPermissionGroupSearchFilter;
            lhsReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            String rhsReadPermissionGroupSearchFilter;
            rhsReadPermissionGroupSearchFilter = that.getReadPermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readPermissionGroupSearchFilter", lhsReadPermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "readPermissionGroupSearchFilter", rhsReadPermissionGroupSearchFilter), lhsReadPermissionGroupSearchFilter, rhsReadPermissionGroupSearchFilter)) {
                return false;
            }
        }
        {
            Boolean lhsRefreshDisabled;
            lhsRefreshDisabled = this.isRefreshDisabled();
            Boolean rhsRefreshDisabled;
            rhsRefreshDisabled = that.isRefreshDisabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refreshDisabled", lhsRefreshDisabled), LocatorUtils.property(thatLocator, "refreshDisabled", rhsRefreshDisabled), lhsRefreshDisabled, rhsRefreshDisabled)) {
                return false;
            }
        }
        {
            BigInteger lhsRefreshInterval;
            lhsRefreshInterval = this.getRefreshInterval();
            BigInteger rhsRefreshInterval;
            rhsRefreshInterval = that.getRefreshInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refreshInterval", lhsRefreshInterval), LocatorUtils.property(thatLocator, "refreshInterval", rhsRefreshInterval), lhsRefreshInterval, rhsRefreshInterval)) {
                return false;
            }
        }
        {
            String lhsTempSearchBase;
            lhsTempSearchBase = this.getTempSearchBase();
            String rhsTempSearchBase;
            rhsTempSearchBase = that.getTempSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempSearchBase", lhsTempSearchBase), LocatorUtils.property(thatLocator, "tempSearchBase", rhsTempSearchBase), lhsTempSearchBase, rhsTempSearchBase)) {
                return false;
            }
        }
        {
            String lhsTopicSearchBase;
            lhsTopicSearchBase = this.getTopicSearchBase();
            String rhsTopicSearchBase;
            rhsTopicSearchBase = that.getTopicSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicSearchBase", lhsTopicSearchBase), LocatorUtils.property(thatLocator, "topicSearchBase", rhsTopicSearchBase), lhsTopicSearchBase, rhsTopicSearchBase)) {
                return false;
            }
        }
        {
            String lhsUserNameAttribute;
            lhsUserNameAttribute = this.getUserNameAttribute();
            String rhsUserNameAttribute;
            rhsUserNameAttribute = that.getUserNameAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userNameAttribute", lhsUserNameAttribute), LocatorUtils.property(thatLocator, "userNameAttribute", rhsUserNameAttribute), lhsUserNameAttribute, rhsUserNameAttribute)) {
                return false;
            }
        }
        {
            String lhsUserObjectClass;
            lhsUserObjectClass = this.getUserObjectClass();
            String rhsUserObjectClass;
            rhsUserObjectClass = that.getUserObjectClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userObjectClass", lhsUserObjectClass), LocatorUtils.property(thatLocator, "userObjectClass", rhsUserObjectClass), lhsUserObjectClass, rhsUserObjectClass)) {
                return false;
            }
        }
        {
            String lhsWritePermissionGroupSearchFilter;
            lhsWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            String rhsWritePermissionGroupSearchFilter;
            rhsWritePermissionGroupSearchFilter = that.getWritePermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writePermissionGroupSearchFilter", lhsWritePermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "writePermissionGroupSearchFilter", rhsWritePermissionGroupSearchFilter), lhsWritePermissionGroupSearchFilter, rhsWritePermissionGroupSearchFilter)) {
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
