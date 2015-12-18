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
 *           &lt;element name="server" minOccurs="0">
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
 *       &lt;attribute name="bind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyToLocalBroker" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="remote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "serverOrAny"
})
@XmlRootElement(name = "proxyConnector")
public class DtoProxyConnector implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "server", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> serverOrAny;
    @XmlAttribute(name = "bind")
    protected String bind;
    @XmlAttribute(name = "localUri")
    protected String localUri;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "proxyToLocalBroker")
    protected Boolean proxyToLocalBroker;
    @XmlAttribute(name = "remote")
    protected String remote;
    @XmlAttribute(name = "server")
    protected String server;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the serverOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoProxyConnector.Server }{@code >}
     * 
     * 
     */
    public List<Object> getServerOrAny() {
        if (serverOrAny == null) {
            serverOrAny = new ArrayList<Object>();
        }
        return this.serverOrAny;
    }

    /**
     * 获取bind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBind() {
        return bind;
    }

    /**
     * 设置bind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBind(String value) {
        this.bind = value;
    }

    /**
     * 获取localUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalUri() {
        return localUri;
    }

    /**
     * 设置localUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalUri(String value) {
        this.localUri = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取proxyToLocalBroker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProxyToLocalBroker() {
        return proxyToLocalBroker;
    }

    /**
     * 设置proxyToLocalBroker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProxyToLocalBroker(Boolean value) {
        this.proxyToLocalBroker = value;
    }

    /**
     * 获取remote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemote() {
        return remote;
    }

    /**
     * 设置remote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemote(String value) {
        this.remote = value;
    }

    /**
     * 获取server属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * 设置server属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
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
            List<Object> theServerOrAny;
            theServerOrAny = (((this.serverOrAny!= null)&&(!this.serverOrAny.isEmpty()))?this.getServerOrAny():null);
            strategy.appendField(locator, this, "serverOrAny", buffer, theServerOrAny);
        }
        {
            String theBind;
            theBind = this.getBind();
            strategy.appendField(locator, this, "bind", buffer, theBind);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            strategy.appendField(locator, this, "localUri", buffer, theLocalUri);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean theProxyToLocalBroker;
            theProxyToLocalBroker = this.isProxyToLocalBroker();
            strategy.appendField(locator, this, "proxyToLocalBroker", buffer, theProxyToLocalBroker);
        }
        {
            String theRemote;
            theRemote = this.getRemote();
            strategy.appendField(locator, this, "remote", buffer, theRemote);
        }
        {
            String theServer;
            theServer = this.getServer();
            strategy.appendField(locator, this, "server", buffer, theServer);
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
            List<Object> theServerOrAny;
            theServerOrAny = (((this.serverOrAny!= null)&&(!this.serverOrAny.isEmpty()))?this.getServerOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverOrAny", theServerOrAny), currentHashCode, theServerOrAny);
        }
        {
            String theBind;
            theBind = this.getBind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bind", theBind), currentHashCode, theBind);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localUri", theLocalUri), currentHashCode, theLocalUri);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean theProxyToLocalBroker;
            theProxyToLocalBroker = this.isProxyToLocalBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proxyToLocalBroker", theProxyToLocalBroker), currentHashCode, theProxyToLocalBroker);
        }
        {
            String theRemote;
            theRemote = this.getRemote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remote", theRemote), currentHashCode, theRemote);
        }
        {
            String theServer;
            theServer = this.getServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "server", theServer), currentHashCode, theServer);
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
        if (!(object instanceof DtoProxyConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoProxyConnector that = ((DtoProxyConnector) object);
        {
            List<Object> lhsServerOrAny;
            lhsServerOrAny = (((this.serverOrAny!= null)&&(!this.serverOrAny.isEmpty()))?this.getServerOrAny():null);
            List<Object> rhsServerOrAny;
            rhsServerOrAny = (((that.serverOrAny!= null)&&(!that.serverOrAny.isEmpty()))?that.getServerOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverOrAny", lhsServerOrAny), LocatorUtils.property(thatLocator, "serverOrAny", rhsServerOrAny), lhsServerOrAny, rhsServerOrAny)) {
                return false;
            }
        }
        {
            String lhsBind;
            lhsBind = this.getBind();
            String rhsBind;
            rhsBind = that.getBind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bind", lhsBind), LocatorUtils.property(thatLocator, "bind", rhsBind), lhsBind, rhsBind)) {
                return false;
            }
        }
        {
            String lhsLocalUri;
            lhsLocalUri = this.getLocalUri();
            String rhsLocalUri;
            rhsLocalUri = that.getLocalUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localUri", lhsLocalUri), LocatorUtils.property(thatLocator, "localUri", rhsLocalUri), lhsLocalUri, rhsLocalUri)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsProxyToLocalBroker;
            lhsProxyToLocalBroker = this.isProxyToLocalBroker();
            Boolean rhsProxyToLocalBroker;
            rhsProxyToLocalBroker = that.isProxyToLocalBroker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proxyToLocalBroker", lhsProxyToLocalBroker), LocatorUtils.property(thatLocator, "proxyToLocalBroker", rhsProxyToLocalBroker), lhsProxyToLocalBroker, rhsProxyToLocalBroker)) {
                return false;
            }
        }
        {
            String lhsRemote;
            lhsRemote = this.getRemote();
            String rhsRemote;
            rhsRemote = that.getRemote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remote", lhsRemote), LocatorUtils.property(thatLocator, "remote", rhsRemote), lhsRemote, rhsRemote)) {
                return false;
            }
        }
        {
            String lhsServer;
            lhsServer = this.getServer();
            String rhsServer;
            rhsServer = that.getServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "server", lhsServer), LocatorUtils.property(thatLocator, "server", rhsServer), lhsServer, rhsServer)) {
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
    public static class Server
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
            if (!(object instanceof DtoProxyConnector.Server)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoProxyConnector.Server that = ((DtoProxyConnector.Server) object);
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
