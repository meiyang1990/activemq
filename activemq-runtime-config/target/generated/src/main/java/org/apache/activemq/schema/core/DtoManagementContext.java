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
 *           &lt;element name="MBeanServer" minOccurs="0">
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
 *           &lt;element name="environment" maxOccurs="unbounded" minOccurs="0">
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
 *       &lt;attribute name="MBeanServer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowRemoteAddressInMBeanNames" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectorHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectorPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectorPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createConnector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createMBeanServer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="environment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findTigerMbeanServer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="jmxDomainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rmiServerPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useMBeanServer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "mBeanServerOrEnvironmentOrServer"
})
@XmlRootElement(name = "managementContext")
public class DtoManagementContext implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "MBeanServer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "environment", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "server", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> mBeanServerOrEnvironmentOrServer;
    @XmlAttribute(name = "MBeanServer")
    protected String mBeanServer;
    @XmlAttribute(name = "allowRemoteAddressInMBeanNames")
    protected Boolean allowRemoteAddressInMBeanNames;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "connectorHost")
    protected String connectorHost;
    @XmlAttribute(name = "connectorPath")
    protected String connectorPath;
    @XmlAttribute(name = "connectorPort")
    protected String connectorPort;
    @XmlAttribute(name = "createConnector")
    protected String createConnector;
    @XmlAttribute(name = "createMBeanServer")
    protected Boolean createMBeanServer;
    @XmlAttribute(name = "environment")
    protected String environment;
    @XmlAttribute(name = "findTigerMbeanServer")
    protected Boolean findTigerMbeanServer;
    @XmlAttribute(name = "jmxDomainName")
    protected String jmxDomainName;
    @XmlAttribute(name = "rmiServerPort")
    protected String rmiServerPort;
    @XmlAttribute(name = "server")
    protected String server;
    @XmlAttribute(name = "useMBeanServer")
    protected Boolean useMBeanServer;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mBeanServerOrEnvironmentOrServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mBeanServerOrEnvironmentOrServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMBeanServerOrEnvironmentOrServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoManagementContext.MBeanServer }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoManagementContext.Server }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoManagementContext.Environment }{@code >}
     * 
     * 
     */
    public List<Object> getMBeanServerOrEnvironmentOrServer() {
        if (mBeanServerOrEnvironmentOrServer == null) {
            mBeanServerOrEnvironmentOrServer = new ArrayList<Object>();
        }
        return this.mBeanServerOrEnvironmentOrServer;
    }

    /**
     * 获取mBeanServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBeanServer() {
        return mBeanServer;
    }

    /**
     * 设置mBeanServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBeanServer(String value) {
        this.mBeanServer = value;
    }

    /**
     * 获取allowRemoteAddressInMBeanNames属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRemoteAddressInMBeanNames() {
        return allowRemoteAddressInMBeanNames;
    }

    /**
     * 设置allowRemoteAddressInMBeanNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRemoteAddressInMBeanNames(Boolean value) {
        this.allowRemoteAddressInMBeanNames = value;
    }

    /**
     * 获取brokerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * 设置brokerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    /**
     * 获取connectorHost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorHost() {
        return connectorHost;
    }

    /**
     * 设置connectorHost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorHost(String value) {
        this.connectorHost = value;
    }

    /**
     * 获取connectorPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorPath() {
        return connectorPath;
    }

    /**
     * 设置connectorPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorPath(String value) {
        this.connectorPath = value;
    }

    /**
     * 获取connectorPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorPort() {
        return connectorPort;
    }

    /**
     * 设置connectorPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorPort(String value) {
        this.connectorPort = value;
    }

    /**
     * 获取createConnector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateConnector() {
        return createConnector;
    }

    /**
     * 设置createConnector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateConnector(String value) {
        this.createConnector = value;
    }

    /**
     * 获取createMBeanServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateMBeanServer() {
        return createMBeanServer;
    }

    /**
     * 设置createMBeanServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateMBeanServer(Boolean value) {
        this.createMBeanServer = value;
    }

    /**
     * 获取environment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * 设置environment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * 获取findTigerMbeanServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFindTigerMbeanServer() {
        return findTigerMbeanServer;
    }

    /**
     * 设置findTigerMbeanServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFindTigerMbeanServer(Boolean value) {
        this.findTigerMbeanServer = value;
    }

    /**
     * 获取jmxDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmxDomainName() {
        return jmxDomainName;
    }

    /**
     * 设置jmxDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmxDomainName(String value) {
        this.jmxDomainName = value;
    }

    /**
     * 获取rmiServerPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmiServerPort() {
        return rmiServerPort;
    }

    /**
     * 设置rmiServerPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmiServerPort(String value) {
        this.rmiServerPort = value;
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
     * 获取useMBeanServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMBeanServer() {
        return useMBeanServer;
    }

    /**
     * 设置useMBeanServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMBeanServer(Boolean value) {
        this.useMBeanServer = value;
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
            List<Object> theMBeanServerOrEnvironmentOrServer;
            theMBeanServerOrEnvironmentOrServer = (((this.mBeanServerOrEnvironmentOrServer!= null)&&(!this.mBeanServerOrEnvironmentOrServer.isEmpty()))?this.getMBeanServerOrEnvironmentOrServer():null);
            strategy.appendField(locator, this, "mBeanServerOrEnvironmentOrServer", buffer, theMBeanServerOrEnvironmentOrServer);
        }
        {
            String theMBeanServer;
            theMBeanServer = this.getMBeanServer();
            strategy.appendField(locator, this, "mBeanServer", buffer, theMBeanServer);
        }
        {
            Boolean theAllowRemoteAddressInMBeanNames;
            theAllowRemoteAddressInMBeanNames = this.isAllowRemoteAddressInMBeanNames();
            strategy.appendField(locator, this, "allowRemoteAddressInMBeanNames", buffer, theAllowRemoteAddressInMBeanNames);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            strategy.appendField(locator, this, "brokerName", buffer, theBrokerName);
        }
        {
            String theConnectorHost;
            theConnectorHost = this.getConnectorHost();
            strategy.appendField(locator, this, "connectorHost", buffer, theConnectorHost);
        }
        {
            String theConnectorPath;
            theConnectorPath = this.getConnectorPath();
            strategy.appendField(locator, this, "connectorPath", buffer, theConnectorPath);
        }
        {
            String theConnectorPort;
            theConnectorPort = this.getConnectorPort();
            strategy.appendField(locator, this, "connectorPort", buffer, theConnectorPort);
        }
        {
            String theCreateConnector;
            theCreateConnector = this.getCreateConnector();
            strategy.appendField(locator, this, "createConnector", buffer, theCreateConnector);
        }
        {
            Boolean theCreateMBeanServer;
            theCreateMBeanServer = this.isCreateMBeanServer();
            strategy.appendField(locator, this, "createMBeanServer", buffer, theCreateMBeanServer);
        }
        {
            String theEnvironment;
            theEnvironment = this.getEnvironment();
            strategy.appendField(locator, this, "environment", buffer, theEnvironment);
        }
        {
            Boolean theFindTigerMbeanServer;
            theFindTigerMbeanServer = this.isFindTigerMbeanServer();
            strategy.appendField(locator, this, "findTigerMbeanServer", buffer, theFindTigerMbeanServer);
        }
        {
            String theJmxDomainName;
            theJmxDomainName = this.getJmxDomainName();
            strategy.appendField(locator, this, "jmxDomainName", buffer, theJmxDomainName);
        }
        {
            String theRmiServerPort;
            theRmiServerPort = this.getRmiServerPort();
            strategy.appendField(locator, this, "rmiServerPort", buffer, theRmiServerPort);
        }
        {
            String theServer;
            theServer = this.getServer();
            strategy.appendField(locator, this, "server", buffer, theServer);
        }
        {
            Boolean theUseMBeanServer;
            theUseMBeanServer = this.isUseMBeanServer();
            strategy.appendField(locator, this, "useMBeanServer", buffer, theUseMBeanServer);
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
            List<Object> theMBeanServerOrEnvironmentOrServer;
            theMBeanServerOrEnvironmentOrServer = (((this.mBeanServerOrEnvironmentOrServer!= null)&&(!this.mBeanServerOrEnvironmentOrServer.isEmpty()))?this.getMBeanServerOrEnvironmentOrServer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mBeanServerOrEnvironmentOrServer", theMBeanServerOrEnvironmentOrServer), currentHashCode, theMBeanServerOrEnvironmentOrServer);
        }
        {
            String theMBeanServer;
            theMBeanServer = this.getMBeanServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mBeanServer", theMBeanServer), currentHashCode, theMBeanServer);
        }
        {
            Boolean theAllowRemoteAddressInMBeanNames;
            theAllowRemoteAddressInMBeanNames = this.isAllowRemoteAddressInMBeanNames();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowRemoteAddressInMBeanNames", theAllowRemoteAddressInMBeanNames), currentHashCode, theAllowRemoteAddressInMBeanNames);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerName", theBrokerName), currentHashCode, theBrokerName);
        }
        {
            String theConnectorHost;
            theConnectorHost = this.getConnectorHost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectorHost", theConnectorHost), currentHashCode, theConnectorHost);
        }
        {
            String theConnectorPath;
            theConnectorPath = this.getConnectorPath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectorPath", theConnectorPath), currentHashCode, theConnectorPath);
        }
        {
            String theConnectorPort;
            theConnectorPort = this.getConnectorPort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectorPort", theConnectorPort), currentHashCode, theConnectorPort);
        }
        {
            String theCreateConnector;
            theCreateConnector = this.getCreateConnector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createConnector", theCreateConnector), currentHashCode, theCreateConnector);
        }
        {
            Boolean theCreateMBeanServer;
            theCreateMBeanServer = this.isCreateMBeanServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createMBeanServer", theCreateMBeanServer), currentHashCode, theCreateMBeanServer);
        }
        {
            String theEnvironment;
            theEnvironment = this.getEnvironment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environment", theEnvironment), currentHashCode, theEnvironment);
        }
        {
            Boolean theFindTigerMbeanServer;
            theFindTigerMbeanServer = this.isFindTigerMbeanServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findTigerMbeanServer", theFindTigerMbeanServer), currentHashCode, theFindTigerMbeanServer);
        }
        {
            String theJmxDomainName;
            theJmxDomainName = this.getJmxDomainName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmxDomainName", theJmxDomainName), currentHashCode, theJmxDomainName);
        }
        {
            String theRmiServerPort;
            theRmiServerPort = this.getRmiServerPort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmiServerPort", theRmiServerPort), currentHashCode, theRmiServerPort);
        }
        {
            String theServer;
            theServer = this.getServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "server", theServer), currentHashCode, theServer);
        }
        {
            Boolean theUseMBeanServer;
            theUseMBeanServer = this.isUseMBeanServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useMBeanServer", theUseMBeanServer), currentHashCode, theUseMBeanServer);
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
        if (!(object instanceof DtoManagementContext)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoManagementContext that = ((DtoManagementContext) object);
        {
            List<Object> lhsMBeanServerOrEnvironmentOrServer;
            lhsMBeanServerOrEnvironmentOrServer = (((this.mBeanServerOrEnvironmentOrServer!= null)&&(!this.mBeanServerOrEnvironmentOrServer.isEmpty()))?this.getMBeanServerOrEnvironmentOrServer():null);
            List<Object> rhsMBeanServerOrEnvironmentOrServer;
            rhsMBeanServerOrEnvironmentOrServer = (((that.mBeanServerOrEnvironmentOrServer!= null)&&(!that.mBeanServerOrEnvironmentOrServer.isEmpty()))?that.getMBeanServerOrEnvironmentOrServer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mBeanServerOrEnvironmentOrServer", lhsMBeanServerOrEnvironmentOrServer), LocatorUtils.property(thatLocator, "mBeanServerOrEnvironmentOrServer", rhsMBeanServerOrEnvironmentOrServer), lhsMBeanServerOrEnvironmentOrServer, rhsMBeanServerOrEnvironmentOrServer)) {
                return false;
            }
        }
        {
            String lhsMBeanServer;
            lhsMBeanServer = this.getMBeanServer();
            String rhsMBeanServer;
            rhsMBeanServer = that.getMBeanServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mBeanServer", lhsMBeanServer), LocatorUtils.property(thatLocator, "mBeanServer", rhsMBeanServer), lhsMBeanServer, rhsMBeanServer)) {
                return false;
            }
        }
        {
            Boolean lhsAllowRemoteAddressInMBeanNames;
            lhsAllowRemoteAddressInMBeanNames = this.isAllowRemoteAddressInMBeanNames();
            Boolean rhsAllowRemoteAddressInMBeanNames;
            rhsAllowRemoteAddressInMBeanNames = that.isAllowRemoteAddressInMBeanNames();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowRemoteAddressInMBeanNames", lhsAllowRemoteAddressInMBeanNames), LocatorUtils.property(thatLocator, "allowRemoteAddressInMBeanNames", rhsAllowRemoteAddressInMBeanNames), lhsAllowRemoteAddressInMBeanNames, rhsAllowRemoteAddressInMBeanNames)) {
                return false;
            }
        }
        {
            String lhsBrokerName;
            lhsBrokerName = this.getBrokerName();
            String rhsBrokerName;
            rhsBrokerName = that.getBrokerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerName", lhsBrokerName), LocatorUtils.property(thatLocator, "brokerName", rhsBrokerName), lhsBrokerName, rhsBrokerName)) {
                return false;
            }
        }
        {
            String lhsConnectorHost;
            lhsConnectorHost = this.getConnectorHost();
            String rhsConnectorHost;
            rhsConnectorHost = that.getConnectorHost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectorHost", lhsConnectorHost), LocatorUtils.property(thatLocator, "connectorHost", rhsConnectorHost), lhsConnectorHost, rhsConnectorHost)) {
                return false;
            }
        }
        {
            String lhsConnectorPath;
            lhsConnectorPath = this.getConnectorPath();
            String rhsConnectorPath;
            rhsConnectorPath = that.getConnectorPath();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectorPath", lhsConnectorPath), LocatorUtils.property(thatLocator, "connectorPath", rhsConnectorPath), lhsConnectorPath, rhsConnectorPath)) {
                return false;
            }
        }
        {
            String lhsConnectorPort;
            lhsConnectorPort = this.getConnectorPort();
            String rhsConnectorPort;
            rhsConnectorPort = that.getConnectorPort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectorPort", lhsConnectorPort), LocatorUtils.property(thatLocator, "connectorPort", rhsConnectorPort), lhsConnectorPort, rhsConnectorPort)) {
                return false;
            }
        }
        {
            String lhsCreateConnector;
            lhsCreateConnector = this.getCreateConnector();
            String rhsCreateConnector;
            rhsCreateConnector = that.getCreateConnector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createConnector", lhsCreateConnector), LocatorUtils.property(thatLocator, "createConnector", rhsCreateConnector), lhsCreateConnector, rhsCreateConnector)) {
                return false;
            }
        }
        {
            Boolean lhsCreateMBeanServer;
            lhsCreateMBeanServer = this.isCreateMBeanServer();
            Boolean rhsCreateMBeanServer;
            rhsCreateMBeanServer = that.isCreateMBeanServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createMBeanServer", lhsCreateMBeanServer), LocatorUtils.property(thatLocator, "createMBeanServer", rhsCreateMBeanServer), lhsCreateMBeanServer, rhsCreateMBeanServer)) {
                return false;
            }
        }
        {
            String lhsEnvironment;
            lhsEnvironment = this.getEnvironment();
            String rhsEnvironment;
            rhsEnvironment = that.getEnvironment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environment", lhsEnvironment), LocatorUtils.property(thatLocator, "environment", rhsEnvironment), lhsEnvironment, rhsEnvironment)) {
                return false;
            }
        }
        {
            Boolean lhsFindTigerMbeanServer;
            lhsFindTigerMbeanServer = this.isFindTigerMbeanServer();
            Boolean rhsFindTigerMbeanServer;
            rhsFindTigerMbeanServer = that.isFindTigerMbeanServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findTigerMbeanServer", lhsFindTigerMbeanServer), LocatorUtils.property(thatLocator, "findTigerMbeanServer", rhsFindTigerMbeanServer), lhsFindTigerMbeanServer, rhsFindTigerMbeanServer)) {
                return false;
            }
        }
        {
            String lhsJmxDomainName;
            lhsJmxDomainName = this.getJmxDomainName();
            String rhsJmxDomainName;
            rhsJmxDomainName = that.getJmxDomainName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmxDomainName", lhsJmxDomainName), LocatorUtils.property(thatLocator, "jmxDomainName", rhsJmxDomainName), lhsJmxDomainName, rhsJmxDomainName)) {
                return false;
            }
        }
        {
            String lhsRmiServerPort;
            lhsRmiServerPort = this.getRmiServerPort();
            String rhsRmiServerPort;
            rhsRmiServerPort = that.getRmiServerPort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmiServerPort", lhsRmiServerPort), LocatorUtils.property(thatLocator, "rmiServerPort", rhsRmiServerPort), lhsRmiServerPort, rhsRmiServerPort)) {
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
            Boolean lhsUseMBeanServer;
            lhsUseMBeanServer = this.isUseMBeanServer();
            Boolean rhsUseMBeanServer;
            rhsUseMBeanServer = that.isUseMBeanServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useMBeanServer", lhsUseMBeanServer), LocatorUtils.property(thatLocator, "useMBeanServer", rhsUseMBeanServer), lhsUseMBeanServer, rhsUseMBeanServer)) {
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
    public static class Environment
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
            if (!(object instanceof DtoManagementContext.Environment)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoManagementContext.Environment that = ((DtoManagementContext.Environment) object);
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
    public static class MBeanServer
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
            if (!(object instanceof DtoManagementContext.MBeanServer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoManagementContext.MBeanServer that = ((DtoManagementContext.MBeanServer) object);
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
            if (!(object instanceof DtoManagementContext.Server)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoManagementContext.Server that = ((DtoManagementContext.Server) object);
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
