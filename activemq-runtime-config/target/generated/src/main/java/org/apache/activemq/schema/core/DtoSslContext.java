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
 *           &lt;element name="SSLContext" minOccurs="0">
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
 *           &lt;element name="keyManagers" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="secureRandom" minOccurs="0">
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
 *           &lt;element name="trustManagers" maxOccurs="unbounded" minOccurs="0">
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
 *       &lt;attribute name="SSLContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStoreAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStoreKeyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStorePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStoreType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secureRandom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secureRandomAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trustStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trustStoreAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trustStorePassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trustStoreType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "sslContextOrKeyManagersOrSecureRandom"
})
@XmlRootElement(name = "sslContext")
public class DtoSslContext
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "trustManagers", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "SSLContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "secureRandom", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "keyManagers", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> sslContextOrKeyManagersOrSecureRandom;
    @XmlAttribute(name = "SSLContext")
    protected String sslContext;
    @XmlAttribute(name = "keyStore")
    protected String keyStore;
    @XmlAttribute(name = "keyStoreAlgorithm")
    protected String keyStoreAlgorithm;
    @XmlAttribute(name = "keyStoreKeyPassword")
    protected String keyStoreKeyPassword;
    @XmlAttribute(name = "keyStorePassword")
    protected String keyStorePassword;
    @XmlAttribute(name = "keyStoreType")
    protected String keyStoreType;
    @XmlAttribute(name = "protocol")
    protected String protocol;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "secureRandom")
    protected String secureRandom;
    @XmlAttribute(name = "secureRandomAlgorithm")
    protected String secureRandomAlgorithm;
    @XmlAttribute(name = "trustStore")
    protected String trustStore;
    @XmlAttribute(name = "trustStoreAlgorithm")
    protected String trustStoreAlgorithm;
    @XmlAttribute(name = "trustStorePassword")
    protected String trustStorePassword;
    @XmlAttribute(name = "trustStoreType")
    protected String trustStoreType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the sslContextOrKeyManagersOrSecureRandom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sslContextOrKeyManagersOrSecureRandom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSLContextOrKeyManagersOrSecureRandom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoSslContext.SSLContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSslContext.TrustManagers }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSslContext.SecureRandom }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoSslContext.KeyManagers }{@code >}
     * 
     * 
     */
    public List<Object> getSSLContextOrKeyManagersOrSecureRandom() {
        if (sslContextOrKeyManagersOrSecureRandom == null) {
            sslContextOrKeyManagersOrSecureRandom = new ArrayList<Object>();
        }
        return this.sslContextOrKeyManagersOrSecureRandom;
    }

    /**
     * 获取sslContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSLContext() {
        return sslContext;
    }

    /**
     * 设置sslContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSLContext(String value) {
        this.sslContext = value;
    }

    /**
     * 获取keyStore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStore() {
        return keyStore;
    }

    /**
     * 设置keyStore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStore(String value) {
        this.keyStore = value;
    }

    /**
     * 获取keyStoreAlgorithm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStoreAlgorithm() {
        return keyStoreAlgorithm;
    }

    /**
     * 设置keyStoreAlgorithm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStoreAlgorithm(String value) {
        this.keyStoreAlgorithm = value;
    }

    /**
     * 获取keyStoreKeyPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStoreKeyPassword() {
        return keyStoreKeyPassword;
    }

    /**
     * 设置keyStoreKeyPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStoreKeyPassword(String value) {
        this.keyStoreKeyPassword = value;
    }

    /**
     * 获取keyStorePassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * 设置keyStorePassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStorePassword(String value) {
        this.keyStorePassword = value;
    }

    /**
     * 获取keyStoreType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStoreType() {
        return keyStoreType;
    }

    /**
     * 设置keyStoreType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStoreType(String value) {
        this.keyStoreType = value;
    }

    /**
     * 获取protocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 设置protocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * 获取provider属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置provider属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * 获取secureRandom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureRandom() {
        return secureRandom;
    }

    /**
     * 设置secureRandom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureRandom(String value) {
        this.secureRandom = value;
    }

    /**
     * 获取secureRandomAlgorithm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureRandomAlgorithm() {
        return secureRandomAlgorithm;
    }

    /**
     * 设置secureRandomAlgorithm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureRandomAlgorithm(String value) {
        this.secureRandomAlgorithm = value;
    }

    /**
     * 获取trustStore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustStore() {
        return trustStore;
    }

    /**
     * 设置trustStore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustStore(String value) {
        this.trustStore = value;
    }

    /**
     * 获取trustStoreAlgorithm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustStoreAlgorithm() {
        return trustStoreAlgorithm;
    }

    /**
     * 设置trustStoreAlgorithm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustStoreAlgorithm(String value) {
        this.trustStoreAlgorithm = value;
    }

    /**
     * 获取trustStorePassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /**
     * 设置trustStorePassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustStorePassword(String value) {
        this.trustStorePassword = value;
    }

    /**
     * 获取trustStoreType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustStoreType() {
        return trustStoreType;
    }

    /**
     * 设置trustStoreType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustStoreType(String value) {
        this.trustStoreType = value;
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
            List<Object> theSSLContextOrKeyManagersOrSecureRandom;
            theSSLContextOrKeyManagersOrSecureRandom = (((this.sslContextOrKeyManagersOrSecureRandom!= null)&&(!this.sslContextOrKeyManagersOrSecureRandom.isEmpty()))?this.getSSLContextOrKeyManagersOrSecureRandom():null);
            strategy.appendField(locator, this, "sslContextOrKeyManagersOrSecureRandom", buffer, theSSLContextOrKeyManagersOrSecureRandom);
        }
        {
            String theSSLContext;
            theSSLContext = this.getSSLContext();
            strategy.appendField(locator, this, "sslContext", buffer, theSSLContext);
        }
        {
            String theKeyStore;
            theKeyStore = this.getKeyStore();
            strategy.appendField(locator, this, "keyStore", buffer, theKeyStore);
        }
        {
            String theKeyStoreAlgorithm;
            theKeyStoreAlgorithm = this.getKeyStoreAlgorithm();
            strategy.appendField(locator, this, "keyStoreAlgorithm", buffer, theKeyStoreAlgorithm);
        }
        {
            String theKeyStoreKeyPassword;
            theKeyStoreKeyPassword = this.getKeyStoreKeyPassword();
            strategy.appendField(locator, this, "keyStoreKeyPassword", buffer, theKeyStoreKeyPassword);
        }
        {
            String theKeyStorePassword;
            theKeyStorePassword = this.getKeyStorePassword();
            strategy.appendField(locator, this, "keyStorePassword", buffer, theKeyStorePassword);
        }
        {
            String theKeyStoreType;
            theKeyStoreType = this.getKeyStoreType();
            strategy.appendField(locator, this, "keyStoreType", buffer, theKeyStoreType);
        }
        {
            String theProtocol;
            theProtocol = this.getProtocol();
            strategy.appendField(locator, this, "protocol", buffer, theProtocol);
        }
        {
            String theProvider;
            theProvider = this.getProvider();
            strategy.appendField(locator, this, "provider", buffer, theProvider);
        }
        {
            String theSecureRandom;
            theSecureRandom = this.getSecureRandom();
            strategy.appendField(locator, this, "secureRandom", buffer, theSecureRandom);
        }
        {
            String theSecureRandomAlgorithm;
            theSecureRandomAlgorithm = this.getSecureRandomAlgorithm();
            strategy.appendField(locator, this, "secureRandomAlgorithm", buffer, theSecureRandomAlgorithm);
        }
        {
            String theTrustStore;
            theTrustStore = this.getTrustStore();
            strategy.appendField(locator, this, "trustStore", buffer, theTrustStore);
        }
        {
            String theTrustStoreAlgorithm;
            theTrustStoreAlgorithm = this.getTrustStoreAlgorithm();
            strategy.appendField(locator, this, "trustStoreAlgorithm", buffer, theTrustStoreAlgorithm);
        }
        {
            String theTrustStorePassword;
            theTrustStorePassword = this.getTrustStorePassword();
            strategy.appendField(locator, this, "trustStorePassword", buffer, theTrustStorePassword);
        }
        {
            String theTrustStoreType;
            theTrustStoreType = this.getTrustStoreType();
            strategy.appendField(locator, this, "trustStoreType", buffer, theTrustStoreType);
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
            List<Object> theSSLContextOrKeyManagersOrSecureRandom;
            theSSLContextOrKeyManagersOrSecureRandom = (((this.sslContextOrKeyManagersOrSecureRandom!= null)&&(!this.sslContextOrKeyManagersOrSecureRandom.isEmpty()))?this.getSSLContextOrKeyManagersOrSecureRandom():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sslContextOrKeyManagersOrSecureRandom", theSSLContextOrKeyManagersOrSecureRandom), currentHashCode, theSSLContextOrKeyManagersOrSecureRandom);
        }
        {
            String theSSLContext;
            theSSLContext = this.getSSLContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sslContext", theSSLContext), currentHashCode, theSSLContext);
        }
        {
            String theKeyStore;
            theKeyStore = this.getKeyStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyStore", theKeyStore), currentHashCode, theKeyStore);
        }
        {
            String theKeyStoreAlgorithm;
            theKeyStoreAlgorithm = this.getKeyStoreAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyStoreAlgorithm", theKeyStoreAlgorithm), currentHashCode, theKeyStoreAlgorithm);
        }
        {
            String theKeyStoreKeyPassword;
            theKeyStoreKeyPassword = this.getKeyStoreKeyPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyStoreKeyPassword", theKeyStoreKeyPassword), currentHashCode, theKeyStoreKeyPassword);
        }
        {
            String theKeyStorePassword;
            theKeyStorePassword = this.getKeyStorePassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyStorePassword", theKeyStorePassword), currentHashCode, theKeyStorePassword);
        }
        {
            String theKeyStoreType;
            theKeyStoreType = this.getKeyStoreType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyStoreType", theKeyStoreType), currentHashCode, theKeyStoreType);
        }
        {
            String theProtocol;
            theProtocol = this.getProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protocol", theProtocol), currentHashCode, theProtocol);
        }
        {
            String theProvider;
            theProvider = this.getProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "provider", theProvider), currentHashCode, theProvider);
        }
        {
            String theSecureRandom;
            theSecureRandom = this.getSecureRandom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secureRandom", theSecureRandom), currentHashCode, theSecureRandom);
        }
        {
            String theSecureRandomAlgorithm;
            theSecureRandomAlgorithm = this.getSecureRandomAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secureRandomAlgorithm", theSecureRandomAlgorithm), currentHashCode, theSecureRandomAlgorithm);
        }
        {
            String theTrustStore;
            theTrustStore = this.getTrustStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trustStore", theTrustStore), currentHashCode, theTrustStore);
        }
        {
            String theTrustStoreAlgorithm;
            theTrustStoreAlgorithm = this.getTrustStoreAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trustStoreAlgorithm", theTrustStoreAlgorithm), currentHashCode, theTrustStoreAlgorithm);
        }
        {
            String theTrustStorePassword;
            theTrustStorePassword = this.getTrustStorePassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trustStorePassword", theTrustStorePassword), currentHashCode, theTrustStorePassword);
        }
        {
            String theTrustStoreType;
            theTrustStoreType = this.getTrustStoreType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trustStoreType", theTrustStoreType), currentHashCode, theTrustStoreType);
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
        if (!(object instanceof DtoSslContext)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoSslContext that = ((DtoSslContext) object);
        {
            List<Object> lhsSSLContextOrKeyManagersOrSecureRandom;
            lhsSSLContextOrKeyManagersOrSecureRandom = (((this.sslContextOrKeyManagersOrSecureRandom!= null)&&(!this.sslContextOrKeyManagersOrSecureRandom.isEmpty()))?this.getSSLContextOrKeyManagersOrSecureRandom():null);
            List<Object> rhsSSLContextOrKeyManagersOrSecureRandom;
            rhsSSLContextOrKeyManagersOrSecureRandom = (((that.sslContextOrKeyManagersOrSecureRandom!= null)&&(!that.sslContextOrKeyManagersOrSecureRandom.isEmpty()))?that.getSSLContextOrKeyManagersOrSecureRandom():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sslContextOrKeyManagersOrSecureRandom", lhsSSLContextOrKeyManagersOrSecureRandom), LocatorUtils.property(thatLocator, "sslContextOrKeyManagersOrSecureRandom", rhsSSLContextOrKeyManagersOrSecureRandom), lhsSSLContextOrKeyManagersOrSecureRandom, rhsSSLContextOrKeyManagersOrSecureRandom)) {
                return false;
            }
        }
        {
            String lhsSSLContext;
            lhsSSLContext = this.getSSLContext();
            String rhsSSLContext;
            rhsSSLContext = that.getSSLContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sslContext", lhsSSLContext), LocatorUtils.property(thatLocator, "sslContext", rhsSSLContext), lhsSSLContext, rhsSSLContext)) {
                return false;
            }
        }
        {
            String lhsKeyStore;
            lhsKeyStore = this.getKeyStore();
            String rhsKeyStore;
            rhsKeyStore = that.getKeyStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyStore", lhsKeyStore), LocatorUtils.property(thatLocator, "keyStore", rhsKeyStore), lhsKeyStore, rhsKeyStore)) {
                return false;
            }
        }
        {
            String lhsKeyStoreAlgorithm;
            lhsKeyStoreAlgorithm = this.getKeyStoreAlgorithm();
            String rhsKeyStoreAlgorithm;
            rhsKeyStoreAlgorithm = that.getKeyStoreAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyStoreAlgorithm", lhsKeyStoreAlgorithm), LocatorUtils.property(thatLocator, "keyStoreAlgorithm", rhsKeyStoreAlgorithm), lhsKeyStoreAlgorithm, rhsKeyStoreAlgorithm)) {
                return false;
            }
        }
        {
            String lhsKeyStoreKeyPassword;
            lhsKeyStoreKeyPassword = this.getKeyStoreKeyPassword();
            String rhsKeyStoreKeyPassword;
            rhsKeyStoreKeyPassword = that.getKeyStoreKeyPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyStoreKeyPassword", lhsKeyStoreKeyPassword), LocatorUtils.property(thatLocator, "keyStoreKeyPassword", rhsKeyStoreKeyPassword), lhsKeyStoreKeyPassword, rhsKeyStoreKeyPassword)) {
                return false;
            }
        }
        {
            String lhsKeyStorePassword;
            lhsKeyStorePassword = this.getKeyStorePassword();
            String rhsKeyStorePassword;
            rhsKeyStorePassword = that.getKeyStorePassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyStorePassword", lhsKeyStorePassword), LocatorUtils.property(thatLocator, "keyStorePassword", rhsKeyStorePassword), lhsKeyStorePassword, rhsKeyStorePassword)) {
                return false;
            }
        }
        {
            String lhsKeyStoreType;
            lhsKeyStoreType = this.getKeyStoreType();
            String rhsKeyStoreType;
            rhsKeyStoreType = that.getKeyStoreType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyStoreType", lhsKeyStoreType), LocatorUtils.property(thatLocator, "keyStoreType", rhsKeyStoreType), lhsKeyStoreType, rhsKeyStoreType)) {
                return false;
            }
        }
        {
            String lhsProtocol;
            lhsProtocol = this.getProtocol();
            String rhsProtocol;
            rhsProtocol = that.getProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protocol", lhsProtocol), LocatorUtils.property(thatLocator, "protocol", rhsProtocol), lhsProtocol, rhsProtocol)) {
                return false;
            }
        }
        {
            String lhsProvider;
            lhsProvider = this.getProvider();
            String rhsProvider;
            rhsProvider = that.getProvider();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provider", lhsProvider), LocatorUtils.property(thatLocator, "provider", rhsProvider), lhsProvider, rhsProvider)) {
                return false;
            }
        }
        {
            String lhsSecureRandom;
            lhsSecureRandom = this.getSecureRandom();
            String rhsSecureRandom;
            rhsSecureRandom = that.getSecureRandom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secureRandom", lhsSecureRandom), LocatorUtils.property(thatLocator, "secureRandom", rhsSecureRandom), lhsSecureRandom, rhsSecureRandom)) {
                return false;
            }
        }
        {
            String lhsSecureRandomAlgorithm;
            lhsSecureRandomAlgorithm = this.getSecureRandomAlgorithm();
            String rhsSecureRandomAlgorithm;
            rhsSecureRandomAlgorithm = that.getSecureRandomAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secureRandomAlgorithm", lhsSecureRandomAlgorithm), LocatorUtils.property(thatLocator, "secureRandomAlgorithm", rhsSecureRandomAlgorithm), lhsSecureRandomAlgorithm, rhsSecureRandomAlgorithm)) {
                return false;
            }
        }
        {
            String lhsTrustStore;
            lhsTrustStore = this.getTrustStore();
            String rhsTrustStore;
            rhsTrustStore = that.getTrustStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trustStore", lhsTrustStore), LocatorUtils.property(thatLocator, "trustStore", rhsTrustStore), lhsTrustStore, rhsTrustStore)) {
                return false;
            }
        }
        {
            String lhsTrustStoreAlgorithm;
            lhsTrustStoreAlgorithm = this.getTrustStoreAlgorithm();
            String rhsTrustStoreAlgorithm;
            rhsTrustStoreAlgorithm = that.getTrustStoreAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trustStoreAlgorithm", lhsTrustStoreAlgorithm), LocatorUtils.property(thatLocator, "trustStoreAlgorithm", rhsTrustStoreAlgorithm), lhsTrustStoreAlgorithm, rhsTrustStoreAlgorithm)) {
                return false;
            }
        }
        {
            String lhsTrustStorePassword;
            lhsTrustStorePassword = this.getTrustStorePassword();
            String rhsTrustStorePassword;
            rhsTrustStorePassword = that.getTrustStorePassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trustStorePassword", lhsTrustStorePassword), LocatorUtils.property(thatLocator, "trustStorePassword", rhsTrustStorePassword), lhsTrustStorePassword, rhsTrustStorePassword)) {
                return false;
            }
        }
        {
            String lhsTrustStoreType;
            lhsTrustStoreType = this.getTrustStoreType();
            String rhsTrustStoreType;
            rhsTrustStoreType = that.getTrustStoreType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trustStoreType", lhsTrustStoreType), LocatorUtils.property(thatLocator, "trustStoreType", rhsTrustStoreType), lhsTrustStoreType, rhsTrustStoreType)) {
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
    public static class KeyManagers
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
            if (!(object instanceof DtoSslContext.KeyManagers)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSslContext.KeyManagers that = ((DtoSslContext.KeyManagers) object);
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
    public static class SSLContext
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
            if (!(object instanceof DtoSslContext.SSLContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSslContext.SSLContext that = ((DtoSslContext.SSLContext) object);
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
    public static class SecureRandom
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
            if (!(object instanceof DtoSslContext.SecureRandom)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSslContext.SecureRandom that = ((DtoSslContext.SecureRandom) object);
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
    public static class TrustManagers
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
            if (!(object instanceof DtoSslContext.TrustManagers)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSslContext.TrustManagers that = ((DtoSslContext.TrustManagers) object);
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
