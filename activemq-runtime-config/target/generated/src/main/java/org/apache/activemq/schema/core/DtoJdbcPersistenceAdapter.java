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
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element name="adapter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}axionJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}blobJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}bytesJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}db2JDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}defaultJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}hsqldb-jdbc-adapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}imageBasedJDBCAdaptor"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}informixJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}maxdb-jdbc-adapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mysql-jdbc-adapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}oracleBlobJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}oracleJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}postgresql-jdbc-adapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}streamJDBCAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}sybase-jdbc-adapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transact-jdbc-adapter"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="brokerService" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="dataSource" minOccurs="0">
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
 *           &lt;element name="databaseLocker" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ds" minOccurs="0">
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
 *           &lt;element name="lockDataSource" minOccurs="0">
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
 *           &lt;element name="locker" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="scheduledThreadPoolExecutor" minOccurs="0">
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
 *           &lt;element name="statements" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}statements"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="usageManager" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="wireFormat" minOccurs="0">
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
 *       &lt;attribute name="adapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditRecoveryDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changeAutoCommitAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cleanupPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="createTablesOnStartup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dataDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataDirectoryFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="databaseLocker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ds" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="lockAcquireSleepInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lockDataSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockKeepAlivePeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="locker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxProducersToAudit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxRows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="scheduledThreadPoolExecutor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statements" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionIsolation" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="usageManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useDatabaseLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useExternalMessageReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wireFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adapterOrBrokerServiceOrDataSource"
})
@XmlRootElement(name = "jdbcPersistenceAdapter")
public class DtoJdbcPersistenceAdapter implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "usageManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "lockDataSource", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "wireFormat", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "statements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "locker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "databaseLocker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "dataSource", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "scheduledThreadPoolExecutor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "adapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "ds", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adapterOrBrokerServiceOrDataSource;
    @XmlAttribute(name = "adapter")
    protected String adapter;
    @XmlAttribute(name = "auditRecoveryDepth")
    protected BigInteger auditRecoveryDepth;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "changeAutoCommitAllowed")
    protected Boolean changeAutoCommitAllowed;
    @XmlAttribute(name = "cleanupPeriod")
    protected BigInteger cleanupPeriod;
    @XmlAttribute(name = "createTablesOnStartup")
    protected Boolean createTablesOnStartup;
    @XmlAttribute(name = "dataDirectory")
    protected String dataDirectory;
    @XmlAttribute(name = "dataDirectoryFile")
    protected String dataDirectoryFile;
    @XmlAttribute(name = "dataSource")
    protected String dataSource;
    @XmlAttribute(name = "databaseLocker")
    protected String databaseLocker;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "ds")
    protected String ds;
    @XmlAttribute(name = "enableAudit")
    protected Boolean enableAudit;
    @XmlAttribute(name = "lockAcquireSleepInterval")
    protected Long lockAcquireSleepInterval;
    @XmlAttribute(name = "lockDataSource")
    protected String lockDataSource;
    @XmlAttribute(name = "lockKeepAlivePeriod")
    protected Long lockKeepAlivePeriod;
    @XmlAttribute(name = "locker")
    protected String locker;
    @XmlAttribute(name = "maxAuditDepth")
    protected BigInteger maxAuditDepth;
    @XmlAttribute(name = "maxProducersToAudit")
    protected BigInteger maxProducersToAudit;
    @XmlAttribute(name = "maxRows")
    protected BigInteger maxRows;
    @XmlAttribute(name = "scheduledThreadPoolExecutor")
    protected String scheduledThreadPoolExecutor;
    @XmlAttribute(name = "statements")
    protected String statements;
    @XmlAttribute(name = "transactionIsolation")
    protected BigInteger transactionIsolation;
    @XmlAttribute(name = "usageManager")
    protected String usageManager;
    @XmlAttribute(name = "useDatabaseLock")
    protected Boolean useDatabaseLock;
    @XmlAttribute(name = "useExternalMessageReferences")
    protected Boolean useExternalMessageReferences;
    @XmlAttribute(name = "useLock")
    protected Boolean useLock;
    @XmlAttribute(name = "wireFormat")
    protected String wireFormat;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adapterOrBrokerServiceOrDataSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapterOrBrokerServiceOrDataSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapterOrBrokerServiceOrDataSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.UsageManager }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.LockDataSource }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.WireFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Statements }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.DatabaseLocker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Locker }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.DataSource }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Adapter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Ds }{@code >}
     * 
     * 
     */
    public List<Object> getAdapterOrBrokerServiceOrDataSource() {
        if (adapterOrBrokerServiceOrDataSource == null) {
            adapterOrBrokerServiceOrDataSource = new ArrayList<Object>();
        }
        return this.adapterOrBrokerServiceOrDataSource;
    }

    /**
     * 获取adapter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapter() {
        return adapter;
    }

    /**
     * 设置adapter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapter(String value) {
        this.adapter = value;
    }

    /**
     * 获取auditRecoveryDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuditRecoveryDepth() {
        return auditRecoveryDepth;
    }

    /**
     * 设置auditRecoveryDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuditRecoveryDepth(BigInteger value) {
        this.auditRecoveryDepth = value;
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
     * 获取brokerService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerService() {
        return brokerService;
    }

    /**
     * 设置brokerService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerService(String value) {
        this.brokerService = value;
    }

    /**
     * 获取changeAutoCommitAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeAutoCommitAllowed() {
        return changeAutoCommitAllowed;
    }

    /**
     * 设置changeAutoCommitAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeAutoCommitAllowed(Boolean value) {
        this.changeAutoCommitAllowed = value;
    }

    /**
     * 获取cleanupPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCleanupPeriod() {
        return cleanupPeriod;
    }

    /**
     * 设置cleanupPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCleanupPeriod(BigInteger value) {
        this.cleanupPeriod = value;
    }

    /**
     * 获取createTablesOnStartup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateTablesOnStartup() {
        return createTablesOnStartup;
    }

    /**
     * 设置createTablesOnStartup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateTablesOnStartup(Boolean value) {
        this.createTablesOnStartup = value;
    }

    /**
     * 获取dataDirectory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDirectory() {
        return dataDirectory;
    }

    /**
     * 设置dataDirectory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDirectory(String value) {
        this.dataDirectory = value;
    }

    /**
     * 获取dataDirectoryFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDirectoryFile() {
        return dataDirectoryFile;
    }

    /**
     * 设置dataDirectoryFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDirectoryFile(String value) {
        this.dataDirectoryFile = value;
    }

    /**
     * 获取dataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 设置dataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * 获取databaseLocker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseLocker() {
        return databaseLocker;
    }

    /**
     * 设置databaseLocker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseLocker(String value) {
        this.databaseLocker = value;
    }

    /**
     * 获取directory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * 设置directory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * 获取ds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDs() {
        return ds;
    }

    /**
     * 设置ds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDs(String value) {
        this.ds = value;
    }

    /**
     * 获取enableAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAudit() {
        return enableAudit;
    }

    /**
     * 设置enableAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAudit(Boolean value) {
        this.enableAudit = value;
    }

    /**
     * 获取lockAcquireSleepInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockAcquireSleepInterval() {
        return lockAcquireSleepInterval;
    }

    /**
     * 设置lockAcquireSleepInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockAcquireSleepInterval(Long value) {
        this.lockAcquireSleepInterval = value;
    }

    /**
     * 获取lockDataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockDataSource() {
        return lockDataSource;
    }

    /**
     * 设置lockDataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockDataSource(String value) {
        this.lockDataSource = value;
    }

    /**
     * 获取lockKeepAlivePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockKeepAlivePeriod() {
        return lockKeepAlivePeriod;
    }

    /**
     * 设置lockKeepAlivePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockKeepAlivePeriod(Long value) {
        this.lockKeepAlivePeriod = value;
    }

    /**
     * 获取locker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocker() {
        return locker;
    }

    /**
     * 设置locker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocker(String value) {
        this.locker = value;
    }

    /**
     * 获取maxAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAuditDepth() {
        return maxAuditDepth;
    }

    /**
     * 设置maxAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAuditDepth(BigInteger value) {
        this.maxAuditDepth = value;
    }

    /**
     * 获取maxProducersToAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxProducersToAudit() {
        return maxProducersToAudit;
    }

    /**
     * 设置maxProducersToAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxProducersToAudit(BigInteger value) {
        this.maxProducersToAudit = value;
    }

    /**
     * 获取maxRows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRows() {
        return maxRows;
    }

    /**
     * 设置maxRows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRows(BigInteger value) {
        this.maxRows = value;
    }

    /**
     * 获取scheduledThreadPoolExecutor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledThreadPoolExecutor() {
        return scheduledThreadPoolExecutor;
    }

    /**
     * 设置scheduledThreadPoolExecutor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledThreadPoolExecutor(String value) {
        this.scheduledThreadPoolExecutor = value;
    }

    /**
     * 获取statements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatements() {
        return statements;
    }

    /**
     * 设置statements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatements(String value) {
        this.statements = value;
    }

    /**
     * 获取transactionIsolation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionIsolation() {
        return transactionIsolation;
    }

    /**
     * 设置transactionIsolation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionIsolation(BigInteger value) {
        this.transactionIsolation = value;
    }

    /**
     * 获取usageManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageManager() {
        return usageManager;
    }

    /**
     * 设置usageManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageManager(String value) {
        this.usageManager = value;
    }

    /**
     * 获取useDatabaseLock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDatabaseLock() {
        return useDatabaseLock;
    }

    /**
     * 设置useDatabaseLock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDatabaseLock(Boolean value) {
        this.useDatabaseLock = value;
    }

    /**
     * 获取useExternalMessageReferences属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExternalMessageReferences() {
        return useExternalMessageReferences;
    }

    /**
     * 设置useExternalMessageReferences属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExternalMessageReferences(Boolean value) {
        this.useExternalMessageReferences = value;
    }

    /**
     * 获取useLock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLock() {
        return useLock;
    }

    /**
     * 设置useLock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLock(Boolean value) {
        this.useLock = value;
    }

    /**
     * 获取wireFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireFormat() {
        return wireFormat;
    }

    /**
     * 设置wireFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireFormat(String value) {
        this.wireFormat = value;
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
            List<Object> theAdapterOrBrokerServiceOrDataSource;
            theAdapterOrBrokerServiceOrDataSource = (((this.adapterOrBrokerServiceOrDataSource!= null)&&(!this.adapterOrBrokerServiceOrDataSource.isEmpty()))?this.getAdapterOrBrokerServiceOrDataSource():null);
            strategy.appendField(locator, this, "adapterOrBrokerServiceOrDataSource", buffer, theAdapterOrBrokerServiceOrDataSource);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            strategy.appendField(locator, this, "adapter", buffer, theAdapter);
        }
        {
            BigInteger theAuditRecoveryDepth;
            theAuditRecoveryDepth = this.getAuditRecoveryDepth();
            strategy.appendField(locator, this, "auditRecoveryDepth", buffer, theAuditRecoveryDepth);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            strategy.appendField(locator, this, "brokerName", buffer, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            Boolean theChangeAutoCommitAllowed;
            theChangeAutoCommitAllowed = this.isChangeAutoCommitAllowed();
            strategy.appendField(locator, this, "changeAutoCommitAllowed", buffer, theChangeAutoCommitAllowed);
        }
        {
            BigInteger theCleanupPeriod;
            theCleanupPeriod = this.getCleanupPeriod();
            strategy.appendField(locator, this, "cleanupPeriod", buffer, theCleanupPeriod);
        }
        {
            Boolean theCreateTablesOnStartup;
            theCreateTablesOnStartup = this.isCreateTablesOnStartup();
            strategy.appendField(locator, this, "createTablesOnStartup", buffer, theCreateTablesOnStartup);
        }
        {
            String theDataDirectory;
            theDataDirectory = this.getDataDirectory();
            strategy.appendField(locator, this, "dataDirectory", buffer, theDataDirectory);
        }
        {
            String theDataDirectoryFile;
            theDataDirectoryFile = this.getDataDirectoryFile();
            strategy.appendField(locator, this, "dataDirectoryFile", buffer, theDataDirectoryFile);
        }
        {
            String theDataSource;
            theDataSource = this.getDataSource();
            strategy.appendField(locator, this, "dataSource", buffer, theDataSource);
        }
        {
            String theDatabaseLocker;
            theDatabaseLocker = this.getDatabaseLocker();
            strategy.appendField(locator, this, "databaseLocker", buffer, theDatabaseLocker);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            String theDs;
            theDs = this.getDs();
            strategy.appendField(locator, this, "ds", buffer, theDs);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            strategy.appendField(locator, this, "enableAudit", buffer, theEnableAudit);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            strategy.appendField(locator, this, "lockAcquireSleepInterval", buffer, theLockAcquireSleepInterval);
        }
        {
            String theLockDataSource;
            theLockDataSource = this.getLockDataSource();
            strategy.appendField(locator, this, "lockDataSource", buffer, theLockDataSource);
        }
        {
            Long theLockKeepAlivePeriod;
            theLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            strategy.appendField(locator, this, "lockKeepAlivePeriod", buffer, theLockKeepAlivePeriod);
        }
        {
            String theLocker;
            theLocker = this.getLocker();
            strategy.appendField(locator, this, "locker", buffer, theLocker);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            strategy.appendField(locator, this, "maxAuditDepth", buffer, theMaxAuditDepth);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            strategy.appendField(locator, this, "maxProducersToAudit", buffer, theMaxProducersToAudit);
        }
        {
            BigInteger theMaxRows;
            theMaxRows = this.getMaxRows();
            strategy.appendField(locator, this, "maxRows", buffer, theMaxRows);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            strategy.appendField(locator, this, "scheduledThreadPoolExecutor", buffer, theScheduledThreadPoolExecutor);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            strategy.appendField(locator, this, "statements", buffer, theStatements);
        }
        {
            BigInteger theTransactionIsolation;
            theTransactionIsolation = this.getTransactionIsolation();
            strategy.appendField(locator, this, "transactionIsolation", buffer, theTransactionIsolation);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            strategy.appendField(locator, this, "usageManager", buffer, theUsageManager);
        }
        {
            Boolean theUseDatabaseLock;
            theUseDatabaseLock = this.isUseDatabaseLock();
            strategy.appendField(locator, this, "useDatabaseLock", buffer, theUseDatabaseLock);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            strategy.appendField(locator, this, "useExternalMessageReferences", buffer, theUseExternalMessageReferences);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            strategy.appendField(locator, this, "useLock", buffer, theUseLock);
        }
        {
            String theWireFormat;
            theWireFormat = this.getWireFormat();
            strategy.appendField(locator, this, "wireFormat", buffer, theWireFormat);
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
            List<Object> theAdapterOrBrokerServiceOrDataSource;
            theAdapterOrBrokerServiceOrDataSource = (((this.adapterOrBrokerServiceOrDataSource!= null)&&(!this.adapterOrBrokerServiceOrDataSource.isEmpty()))?this.getAdapterOrBrokerServiceOrDataSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapterOrBrokerServiceOrDataSource", theAdapterOrBrokerServiceOrDataSource), currentHashCode, theAdapterOrBrokerServiceOrDataSource);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapter", theAdapter), currentHashCode, theAdapter);
        }
        {
            BigInteger theAuditRecoveryDepth;
            theAuditRecoveryDepth = this.getAuditRecoveryDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auditRecoveryDepth", theAuditRecoveryDepth), currentHashCode, theAuditRecoveryDepth);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerName", theBrokerName), currentHashCode, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            Boolean theChangeAutoCommitAllowed;
            theChangeAutoCommitAllowed = this.isChangeAutoCommitAllowed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeAutoCommitAllowed", theChangeAutoCommitAllowed), currentHashCode, theChangeAutoCommitAllowed);
        }
        {
            BigInteger theCleanupPeriod;
            theCleanupPeriod = this.getCleanupPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cleanupPeriod", theCleanupPeriod), currentHashCode, theCleanupPeriod);
        }
        {
            Boolean theCreateTablesOnStartup;
            theCreateTablesOnStartup = this.isCreateTablesOnStartup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createTablesOnStartup", theCreateTablesOnStartup), currentHashCode, theCreateTablesOnStartup);
        }
        {
            String theDataDirectory;
            theDataDirectory = this.getDataDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataDirectory", theDataDirectory), currentHashCode, theDataDirectory);
        }
        {
            String theDataDirectoryFile;
            theDataDirectoryFile = this.getDataDirectoryFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataDirectoryFile", theDataDirectoryFile), currentHashCode, theDataDirectoryFile);
        }
        {
            String theDataSource;
            theDataSource = this.getDataSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSource", theDataSource), currentHashCode, theDataSource);
        }
        {
            String theDatabaseLocker;
            theDatabaseLocker = this.getDatabaseLocker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "databaseLocker", theDatabaseLocker), currentHashCode, theDatabaseLocker);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            String theDs;
            theDs = this.getDs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ds", theDs), currentHashCode, theDs);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableAudit", theEnableAudit), currentHashCode, theEnableAudit);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockAcquireSleepInterval", theLockAcquireSleepInterval), currentHashCode, theLockAcquireSleepInterval);
        }
        {
            String theLockDataSource;
            theLockDataSource = this.getLockDataSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockDataSource", theLockDataSource), currentHashCode, theLockDataSource);
        }
        {
            Long theLockKeepAlivePeriod;
            theLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockKeepAlivePeriod", theLockKeepAlivePeriod), currentHashCode, theLockKeepAlivePeriod);
        }
        {
            String theLocker;
            theLocker = this.getLocker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locker", theLocker), currentHashCode, theLocker);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAuditDepth", theMaxAuditDepth), currentHashCode, theMaxAuditDepth);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxProducersToAudit", theMaxProducersToAudit), currentHashCode, theMaxProducersToAudit);
        }
        {
            BigInteger theMaxRows;
            theMaxRows = this.getMaxRows();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxRows", theMaxRows), currentHashCode, theMaxRows);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledThreadPoolExecutor", theScheduledThreadPoolExecutor), currentHashCode, theScheduledThreadPoolExecutor);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statements", theStatements), currentHashCode, theStatements);
        }
        {
            BigInteger theTransactionIsolation;
            theTransactionIsolation = this.getTransactionIsolation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionIsolation", theTransactionIsolation), currentHashCode, theTransactionIsolation);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageManager", theUsageManager), currentHashCode, theUsageManager);
        }
        {
            Boolean theUseDatabaseLock;
            theUseDatabaseLock = this.isUseDatabaseLock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useDatabaseLock", theUseDatabaseLock), currentHashCode, theUseDatabaseLock);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useExternalMessageReferences", theUseExternalMessageReferences), currentHashCode, theUseExternalMessageReferences);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLock", theUseLock), currentHashCode, theUseLock);
        }
        {
            String theWireFormat;
            theWireFormat = this.getWireFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wireFormat", theWireFormat), currentHashCode, theWireFormat);
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
        if (!(object instanceof DtoJdbcPersistenceAdapter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoJdbcPersistenceAdapter that = ((DtoJdbcPersistenceAdapter) object);
        {
            List<Object> lhsAdapterOrBrokerServiceOrDataSource;
            lhsAdapterOrBrokerServiceOrDataSource = (((this.adapterOrBrokerServiceOrDataSource!= null)&&(!this.adapterOrBrokerServiceOrDataSource.isEmpty()))?this.getAdapterOrBrokerServiceOrDataSource():null);
            List<Object> rhsAdapterOrBrokerServiceOrDataSource;
            rhsAdapterOrBrokerServiceOrDataSource = (((that.adapterOrBrokerServiceOrDataSource!= null)&&(!that.adapterOrBrokerServiceOrDataSource.isEmpty()))?that.getAdapterOrBrokerServiceOrDataSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adapterOrBrokerServiceOrDataSource", lhsAdapterOrBrokerServiceOrDataSource), LocatorUtils.property(thatLocator, "adapterOrBrokerServiceOrDataSource", rhsAdapterOrBrokerServiceOrDataSource), lhsAdapterOrBrokerServiceOrDataSource, rhsAdapterOrBrokerServiceOrDataSource)) {
                return false;
            }
        }
        {
            String lhsAdapter;
            lhsAdapter = this.getAdapter();
            String rhsAdapter;
            rhsAdapter = that.getAdapter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adapter", lhsAdapter), LocatorUtils.property(thatLocator, "adapter", rhsAdapter), lhsAdapter, rhsAdapter)) {
                return false;
            }
        }
        {
            BigInteger lhsAuditRecoveryDepth;
            lhsAuditRecoveryDepth = this.getAuditRecoveryDepth();
            BigInteger rhsAuditRecoveryDepth;
            rhsAuditRecoveryDepth = that.getAuditRecoveryDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auditRecoveryDepth", lhsAuditRecoveryDepth), LocatorUtils.property(thatLocator, "auditRecoveryDepth", rhsAuditRecoveryDepth), lhsAuditRecoveryDepth, rhsAuditRecoveryDepth)) {
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
            String lhsBrokerService;
            lhsBrokerService = this.getBrokerService();
            String rhsBrokerService;
            rhsBrokerService = that.getBrokerService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
                return false;
            }
        }
        {
            Boolean lhsChangeAutoCommitAllowed;
            lhsChangeAutoCommitAllowed = this.isChangeAutoCommitAllowed();
            Boolean rhsChangeAutoCommitAllowed;
            rhsChangeAutoCommitAllowed = that.isChangeAutoCommitAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeAutoCommitAllowed", lhsChangeAutoCommitAllowed), LocatorUtils.property(thatLocator, "changeAutoCommitAllowed", rhsChangeAutoCommitAllowed), lhsChangeAutoCommitAllowed, rhsChangeAutoCommitAllowed)) {
                return false;
            }
        }
        {
            BigInteger lhsCleanupPeriod;
            lhsCleanupPeriod = this.getCleanupPeriod();
            BigInteger rhsCleanupPeriod;
            rhsCleanupPeriod = that.getCleanupPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleanupPeriod", lhsCleanupPeriod), LocatorUtils.property(thatLocator, "cleanupPeriod", rhsCleanupPeriod), lhsCleanupPeriod, rhsCleanupPeriod)) {
                return false;
            }
        }
        {
            Boolean lhsCreateTablesOnStartup;
            lhsCreateTablesOnStartup = this.isCreateTablesOnStartup();
            Boolean rhsCreateTablesOnStartup;
            rhsCreateTablesOnStartup = that.isCreateTablesOnStartup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createTablesOnStartup", lhsCreateTablesOnStartup), LocatorUtils.property(thatLocator, "createTablesOnStartup", rhsCreateTablesOnStartup), lhsCreateTablesOnStartup, rhsCreateTablesOnStartup)) {
                return false;
            }
        }
        {
            String lhsDataDirectory;
            lhsDataDirectory = this.getDataDirectory();
            String rhsDataDirectory;
            rhsDataDirectory = that.getDataDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataDirectory", lhsDataDirectory), LocatorUtils.property(thatLocator, "dataDirectory", rhsDataDirectory), lhsDataDirectory, rhsDataDirectory)) {
                return false;
            }
        }
        {
            String lhsDataDirectoryFile;
            lhsDataDirectoryFile = this.getDataDirectoryFile();
            String rhsDataDirectoryFile;
            rhsDataDirectoryFile = that.getDataDirectoryFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataDirectoryFile", lhsDataDirectoryFile), LocatorUtils.property(thatLocator, "dataDirectoryFile", rhsDataDirectoryFile), lhsDataDirectoryFile, rhsDataDirectoryFile)) {
                return false;
            }
        }
        {
            String lhsDataSource;
            lhsDataSource = this.getDataSource();
            String rhsDataSource;
            rhsDataSource = that.getDataSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSource", lhsDataSource), LocatorUtils.property(thatLocator, "dataSource", rhsDataSource), lhsDataSource, rhsDataSource)) {
                return false;
            }
        }
        {
            String lhsDatabaseLocker;
            lhsDatabaseLocker = this.getDatabaseLocker();
            String rhsDatabaseLocker;
            rhsDatabaseLocker = that.getDatabaseLocker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "databaseLocker", lhsDatabaseLocker), LocatorUtils.property(thatLocator, "databaseLocker", rhsDatabaseLocker), lhsDatabaseLocker, rhsDatabaseLocker)) {
                return false;
            }
        }
        {
            String lhsDirectory;
            lhsDirectory = this.getDirectory();
            String rhsDirectory;
            rhsDirectory = that.getDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directory", lhsDirectory), LocatorUtils.property(thatLocator, "directory", rhsDirectory), lhsDirectory, rhsDirectory)) {
                return false;
            }
        }
        {
            String lhsDs;
            lhsDs = this.getDs();
            String rhsDs;
            rhsDs = that.getDs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ds", lhsDs), LocatorUtils.property(thatLocator, "ds", rhsDs), lhsDs, rhsDs)) {
                return false;
            }
        }
        {
            Boolean lhsEnableAudit;
            lhsEnableAudit = this.isEnableAudit();
            Boolean rhsEnableAudit;
            rhsEnableAudit = that.isEnableAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableAudit", lhsEnableAudit), LocatorUtils.property(thatLocator, "enableAudit", rhsEnableAudit), lhsEnableAudit, rhsEnableAudit)) {
                return false;
            }
        }
        {
            Long lhsLockAcquireSleepInterval;
            lhsLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            Long rhsLockAcquireSleepInterval;
            rhsLockAcquireSleepInterval = that.getLockAcquireSleepInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockAcquireSleepInterval", lhsLockAcquireSleepInterval), LocatorUtils.property(thatLocator, "lockAcquireSleepInterval", rhsLockAcquireSleepInterval), lhsLockAcquireSleepInterval, rhsLockAcquireSleepInterval)) {
                return false;
            }
        }
        {
            String lhsLockDataSource;
            lhsLockDataSource = this.getLockDataSource();
            String rhsLockDataSource;
            rhsLockDataSource = that.getLockDataSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockDataSource", lhsLockDataSource), LocatorUtils.property(thatLocator, "lockDataSource", rhsLockDataSource), lhsLockDataSource, rhsLockDataSource)) {
                return false;
            }
        }
        {
            Long lhsLockKeepAlivePeriod;
            lhsLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            Long rhsLockKeepAlivePeriod;
            rhsLockKeepAlivePeriod = that.getLockKeepAlivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockKeepAlivePeriod", lhsLockKeepAlivePeriod), LocatorUtils.property(thatLocator, "lockKeepAlivePeriod", rhsLockKeepAlivePeriod), lhsLockKeepAlivePeriod, rhsLockKeepAlivePeriod)) {
                return false;
            }
        }
        {
            String lhsLocker;
            lhsLocker = this.getLocker();
            String rhsLocker;
            rhsLocker = that.getLocker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locker", lhsLocker), LocatorUtils.property(thatLocator, "locker", rhsLocker), lhsLocker, rhsLocker)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxAuditDepth;
            lhsMaxAuditDepth = this.getMaxAuditDepth();
            BigInteger rhsMaxAuditDepth;
            rhsMaxAuditDepth = that.getMaxAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAuditDepth", lhsMaxAuditDepth), LocatorUtils.property(thatLocator, "maxAuditDepth", rhsMaxAuditDepth), lhsMaxAuditDepth, rhsMaxAuditDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxProducersToAudit;
            lhsMaxProducersToAudit = this.getMaxProducersToAudit();
            BigInteger rhsMaxProducersToAudit;
            rhsMaxProducersToAudit = that.getMaxProducersToAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxProducersToAudit", lhsMaxProducersToAudit), LocatorUtils.property(thatLocator, "maxProducersToAudit", rhsMaxProducersToAudit), lhsMaxProducersToAudit, rhsMaxProducersToAudit)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxRows;
            lhsMaxRows = this.getMaxRows();
            BigInteger rhsMaxRows;
            rhsMaxRows = that.getMaxRows();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRows", lhsMaxRows), LocatorUtils.property(thatLocator, "maxRows", rhsMaxRows), lhsMaxRows, rhsMaxRows)) {
                return false;
            }
        }
        {
            String lhsScheduledThreadPoolExecutor;
            lhsScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            String rhsScheduledThreadPoolExecutor;
            rhsScheduledThreadPoolExecutor = that.getScheduledThreadPoolExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledThreadPoolExecutor", lhsScheduledThreadPoolExecutor), LocatorUtils.property(thatLocator, "scheduledThreadPoolExecutor", rhsScheduledThreadPoolExecutor), lhsScheduledThreadPoolExecutor, rhsScheduledThreadPoolExecutor)) {
                return false;
            }
        }
        {
            String lhsStatements;
            lhsStatements = this.getStatements();
            String rhsStatements;
            rhsStatements = that.getStatements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statements", lhsStatements), LocatorUtils.property(thatLocator, "statements", rhsStatements), lhsStatements, rhsStatements)) {
                return false;
            }
        }
        {
            BigInteger lhsTransactionIsolation;
            lhsTransactionIsolation = this.getTransactionIsolation();
            BigInteger rhsTransactionIsolation;
            rhsTransactionIsolation = that.getTransactionIsolation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionIsolation", lhsTransactionIsolation), LocatorUtils.property(thatLocator, "transactionIsolation", rhsTransactionIsolation), lhsTransactionIsolation, rhsTransactionIsolation)) {
                return false;
            }
        }
        {
            String lhsUsageManager;
            lhsUsageManager = this.getUsageManager();
            String rhsUsageManager;
            rhsUsageManager = that.getUsageManager();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usageManager", lhsUsageManager), LocatorUtils.property(thatLocator, "usageManager", rhsUsageManager), lhsUsageManager, rhsUsageManager)) {
                return false;
            }
        }
        {
            Boolean lhsUseDatabaseLock;
            lhsUseDatabaseLock = this.isUseDatabaseLock();
            Boolean rhsUseDatabaseLock;
            rhsUseDatabaseLock = that.isUseDatabaseLock();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useDatabaseLock", lhsUseDatabaseLock), LocatorUtils.property(thatLocator, "useDatabaseLock", rhsUseDatabaseLock), lhsUseDatabaseLock, rhsUseDatabaseLock)) {
                return false;
            }
        }
        {
            Boolean lhsUseExternalMessageReferences;
            lhsUseExternalMessageReferences = this.isUseExternalMessageReferences();
            Boolean rhsUseExternalMessageReferences;
            rhsUseExternalMessageReferences = that.isUseExternalMessageReferences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useExternalMessageReferences", lhsUseExternalMessageReferences), LocatorUtils.property(thatLocator, "useExternalMessageReferences", rhsUseExternalMessageReferences), lhsUseExternalMessageReferences, rhsUseExternalMessageReferences)) {
                return false;
            }
        }
        {
            Boolean lhsUseLock;
            lhsUseLock = this.isUseLock();
            Boolean rhsUseLock;
            rhsUseLock = that.isUseLock();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLock", lhsUseLock), LocatorUtils.property(thatLocator, "useLock", rhsUseLock), lhsUseLock, rhsUseLock)) {
                return false;
            }
        }
        {
            String lhsWireFormat;
            lhsWireFormat = this.getWireFormat();
            String rhsWireFormat;
            rhsWireFormat = that.getWireFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wireFormat", lhsWireFormat), LocatorUtils.property(thatLocator, "wireFormat", rhsWireFormat), lhsWireFormat, rhsWireFormat)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}axionJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}blobJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}bytesJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}db2JDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}defaultJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}hsqldb-jdbc-adapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}imageBasedJDBCAdaptor"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}informixJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}maxdb-jdbc-adapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mysql-jdbc-adapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}oracleBlobJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}oracleJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}postgresql-jdbc-adapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}streamJDBCAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}sybase-jdbc-adapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transact-jdbc-adapter"/>
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
        "axionJDBCAdapter",
        "blobJDBCAdapter",
        "bytesJDBCAdapter",
        "db2JDBCAdapter",
        "defaultJDBCAdapter",
        "hsqldbJdbcAdapter",
        "imageBasedJDBCAdaptor",
        "informixJDBCAdapter",
        "maxdbJdbcAdapter",
        "mysqlJdbcAdapter",
        "oracleBlobJDBCAdapter",
        "oracleJDBCAdapter",
        "postgresqlJdbcAdapter",
        "streamJDBCAdapter",
        "sybaseJdbcAdapter",
        "transactJdbcAdapter",
        "any"
    })
    public static class Adapter
        implements Equals, HashCode, ToString
    {

        protected DtoAxionJDBCAdapter axionJDBCAdapter;
        protected DtoBlobJDBCAdapter blobJDBCAdapter;
        protected DtoBytesJDBCAdapter bytesJDBCAdapter;
        protected DtoDb2JDBCAdapter db2JDBCAdapter;
        protected DtoDefaultJDBCAdapter defaultJDBCAdapter;
        @XmlElement(name = "hsqldb-jdbc-adapter")
        protected DtoHsqldbJdbcAdapter hsqldbJdbcAdapter;
        protected DtoImageBasedJDBCAdaptor imageBasedJDBCAdaptor;
        protected DtoInformixJDBCAdapter informixJDBCAdapter;
        @XmlElement(name = "maxdb-jdbc-adapter")
        protected DtoMaxdbJdbcAdapter maxdbJdbcAdapter;
        @XmlElement(name = "mysql-jdbc-adapter")
        protected DtoMysqlJdbcAdapter mysqlJdbcAdapter;
        protected DtoOracleBlobJDBCAdapter oracleBlobJDBCAdapter;
        protected DtoOracleJDBCAdapter oracleJDBCAdapter;
        @XmlElement(name = "postgresql-jdbc-adapter")
        protected DtoPostgresqlJdbcAdapter postgresqlJdbcAdapter;
        protected DtoStreamJDBCAdapter streamJDBCAdapter;
        @XmlElement(name = "sybase-jdbc-adapter")
        protected DtoSybaseJdbcAdapter sybaseJdbcAdapter;
        @XmlElement(name = "transact-jdbc-adapter")
        protected DtoTransactJdbcAdapter transactJdbcAdapter;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取axionJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAxionJDBCAdapter }
         *     
         */
        public DtoAxionJDBCAdapter getAxionJDBCAdapter() {
            return axionJDBCAdapter;
        }

        /**
         * 设置axionJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAxionJDBCAdapter }
         *     
         */
        public void setAxionJDBCAdapter(DtoAxionJDBCAdapter value) {
            this.axionJDBCAdapter = value;
        }

        /**
         * 获取blobJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBlobJDBCAdapter }
         *     
         */
        public DtoBlobJDBCAdapter getBlobJDBCAdapter() {
            return blobJDBCAdapter;
        }

        /**
         * 设置blobJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBlobJDBCAdapter }
         *     
         */
        public void setBlobJDBCAdapter(DtoBlobJDBCAdapter value) {
            this.blobJDBCAdapter = value;
        }

        /**
         * 获取bytesJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBytesJDBCAdapter }
         *     
         */
        public DtoBytesJDBCAdapter getBytesJDBCAdapter() {
            return bytesJDBCAdapter;
        }

        /**
         * 设置bytesJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBytesJDBCAdapter }
         *     
         */
        public void setBytesJDBCAdapter(DtoBytesJDBCAdapter value) {
            this.bytesJDBCAdapter = value;
        }

        /**
         * 获取db2JDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDb2JDBCAdapter }
         *     
         */
        public DtoDb2JDBCAdapter getDb2JDBCAdapter() {
            return db2JDBCAdapter;
        }

        /**
         * 设置db2JDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDb2JDBCAdapter }
         *     
         */
        public void setDb2JDBCAdapter(DtoDb2JDBCAdapter value) {
            this.db2JDBCAdapter = value;
        }

        /**
         * 获取defaultJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDefaultJDBCAdapter }
         *     
         */
        public DtoDefaultJDBCAdapter getDefaultJDBCAdapter() {
            return defaultJDBCAdapter;
        }

        /**
         * 设置defaultJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDefaultJDBCAdapter }
         *     
         */
        public void setDefaultJDBCAdapter(DtoDefaultJDBCAdapter value) {
            this.defaultJDBCAdapter = value;
        }

        /**
         * 获取hsqldbJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoHsqldbJdbcAdapter }
         *     
         */
        public DtoHsqldbJdbcAdapter getHsqldbJdbcAdapter() {
            return hsqldbJdbcAdapter;
        }

        /**
         * 设置hsqldbJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoHsqldbJdbcAdapter }
         *     
         */
        public void setHsqldbJdbcAdapter(DtoHsqldbJdbcAdapter value) {
            this.hsqldbJdbcAdapter = value;
        }

        /**
         * 获取imageBasedJDBCAdaptor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoImageBasedJDBCAdaptor }
         *     
         */
        public DtoImageBasedJDBCAdaptor getImageBasedJDBCAdaptor() {
            return imageBasedJDBCAdaptor;
        }

        /**
         * 设置imageBasedJDBCAdaptor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoImageBasedJDBCAdaptor }
         *     
         */
        public void setImageBasedJDBCAdaptor(DtoImageBasedJDBCAdaptor value) {
            this.imageBasedJDBCAdaptor = value;
        }

        /**
         * 获取informixJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoInformixJDBCAdapter }
         *     
         */
        public DtoInformixJDBCAdapter getInformixJDBCAdapter() {
            return informixJDBCAdapter;
        }

        /**
         * 设置informixJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoInformixJDBCAdapter }
         *     
         */
        public void setInformixJDBCAdapter(DtoInformixJDBCAdapter value) {
            this.informixJDBCAdapter = value;
        }

        /**
         * 获取maxdbJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMaxdbJdbcAdapter }
         *     
         */
        public DtoMaxdbJdbcAdapter getMaxdbJdbcAdapter() {
            return maxdbJdbcAdapter;
        }

        /**
         * 设置maxdbJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMaxdbJdbcAdapter }
         *     
         */
        public void setMaxdbJdbcAdapter(DtoMaxdbJdbcAdapter value) {
            this.maxdbJdbcAdapter = value;
        }

        /**
         * 获取mysqlJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMysqlJdbcAdapter }
         *     
         */
        public DtoMysqlJdbcAdapter getMysqlJdbcAdapter() {
            return mysqlJdbcAdapter;
        }

        /**
         * 设置mysqlJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMysqlJdbcAdapter }
         *     
         */
        public void setMysqlJdbcAdapter(DtoMysqlJdbcAdapter value) {
            this.mysqlJdbcAdapter = value;
        }

        /**
         * 获取oracleBlobJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoOracleBlobJDBCAdapter }
         *     
         */
        public DtoOracleBlobJDBCAdapter getOracleBlobJDBCAdapter() {
            return oracleBlobJDBCAdapter;
        }

        /**
         * 设置oracleBlobJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoOracleBlobJDBCAdapter }
         *     
         */
        public void setOracleBlobJDBCAdapter(DtoOracleBlobJDBCAdapter value) {
            this.oracleBlobJDBCAdapter = value;
        }

        /**
         * 获取oracleJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoOracleJDBCAdapter }
         *     
         */
        public DtoOracleJDBCAdapter getOracleJDBCAdapter() {
            return oracleJDBCAdapter;
        }

        /**
         * 设置oracleJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoOracleJDBCAdapter }
         *     
         */
        public void setOracleJDBCAdapter(DtoOracleJDBCAdapter value) {
            this.oracleJDBCAdapter = value;
        }

        /**
         * 获取postgresqlJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPostgresqlJdbcAdapter }
         *     
         */
        public DtoPostgresqlJdbcAdapter getPostgresqlJdbcAdapter() {
            return postgresqlJdbcAdapter;
        }

        /**
         * 设置postgresqlJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPostgresqlJdbcAdapter }
         *     
         */
        public void setPostgresqlJdbcAdapter(DtoPostgresqlJdbcAdapter value) {
            this.postgresqlJdbcAdapter = value;
        }

        /**
         * 获取streamJDBCAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStreamJDBCAdapter }
         *     
         */
        public DtoStreamJDBCAdapter getStreamJDBCAdapter() {
            return streamJDBCAdapter;
        }

        /**
         * 设置streamJDBCAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStreamJDBCAdapter }
         *     
         */
        public void setStreamJDBCAdapter(DtoStreamJDBCAdapter value) {
            this.streamJDBCAdapter = value;
        }

        /**
         * 获取sybaseJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSybaseJdbcAdapter }
         *     
         */
        public DtoSybaseJdbcAdapter getSybaseJdbcAdapter() {
            return sybaseJdbcAdapter;
        }

        /**
         * 设置sybaseJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSybaseJdbcAdapter }
         *     
         */
        public void setSybaseJdbcAdapter(DtoSybaseJdbcAdapter value) {
            this.sybaseJdbcAdapter = value;
        }

        /**
         * 获取transactJdbcAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTransactJdbcAdapter }
         *     
         */
        public DtoTransactJdbcAdapter getTransactJdbcAdapter() {
            return transactJdbcAdapter;
        }

        /**
         * 设置transactJdbcAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTransactJdbcAdapter }
         *     
         */
        public void setTransactJdbcAdapter(DtoTransactJdbcAdapter value) {
            this.transactJdbcAdapter = value;
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
                DtoAxionJDBCAdapter theAxionJDBCAdapter;
                theAxionJDBCAdapter = this.getAxionJDBCAdapter();
                strategy.appendField(locator, this, "axionJDBCAdapter", buffer, theAxionJDBCAdapter);
            }
            {
                DtoBlobJDBCAdapter theBlobJDBCAdapter;
                theBlobJDBCAdapter = this.getBlobJDBCAdapter();
                strategy.appendField(locator, this, "blobJDBCAdapter", buffer, theBlobJDBCAdapter);
            }
            {
                DtoBytesJDBCAdapter theBytesJDBCAdapter;
                theBytesJDBCAdapter = this.getBytesJDBCAdapter();
                strategy.appendField(locator, this, "bytesJDBCAdapter", buffer, theBytesJDBCAdapter);
            }
            {
                DtoDb2JDBCAdapter theDb2JDBCAdapter;
                theDb2JDBCAdapter = this.getDb2JDBCAdapter();
                strategy.appendField(locator, this, "db2JDBCAdapter", buffer, theDb2JDBCAdapter);
            }
            {
                DtoDefaultJDBCAdapter theDefaultJDBCAdapter;
                theDefaultJDBCAdapter = this.getDefaultJDBCAdapter();
                strategy.appendField(locator, this, "defaultJDBCAdapter", buffer, theDefaultJDBCAdapter);
            }
            {
                DtoHsqldbJdbcAdapter theHsqldbJdbcAdapter;
                theHsqldbJdbcAdapter = this.getHsqldbJdbcAdapter();
                strategy.appendField(locator, this, "hsqldbJdbcAdapter", buffer, theHsqldbJdbcAdapter);
            }
            {
                DtoImageBasedJDBCAdaptor theImageBasedJDBCAdaptor;
                theImageBasedJDBCAdaptor = this.getImageBasedJDBCAdaptor();
                strategy.appendField(locator, this, "imageBasedJDBCAdaptor", buffer, theImageBasedJDBCAdaptor);
            }
            {
                DtoInformixJDBCAdapter theInformixJDBCAdapter;
                theInformixJDBCAdapter = this.getInformixJDBCAdapter();
                strategy.appendField(locator, this, "informixJDBCAdapter", buffer, theInformixJDBCAdapter);
            }
            {
                DtoMaxdbJdbcAdapter theMaxdbJdbcAdapter;
                theMaxdbJdbcAdapter = this.getMaxdbJdbcAdapter();
                strategy.appendField(locator, this, "maxdbJdbcAdapter", buffer, theMaxdbJdbcAdapter);
            }
            {
                DtoMysqlJdbcAdapter theMysqlJdbcAdapter;
                theMysqlJdbcAdapter = this.getMysqlJdbcAdapter();
                strategy.appendField(locator, this, "mysqlJdbcAdapter", buffer, theMysqlJdbcAdapter);
            }
            {
                DtoOracleBlobJDBCAdapter theOracleBlobJDBCAdapter;
                theOracleBlobJDBCAdapter = this.getOracleBlobJDBCAdapter();
                strategy.appendField(locator, this, "oracleBlobJDBCAdapter", buffer, theOracleBlobJDBCAdapter);
            }
            {
                DtoOracleJDBCAdapter theOracleJDBCAdapter;
                theOracleJDBCAdapter = this.getOracleJDBCAdapter();
                strategy.appendField(locator, this, "oracleJDBCAdapter", buffer, theOracleJDBCAdapter);
            }
            {
                DtoPostgresqlJdbcAdapter thePostgresqlJdbcAdapter;
                thePostgresqlJdbcAdapter = this.getPostgresqlJdbcAdapter();
                strategy.appendField(locator, this, "postgresqlJdbcAdapter", buffer, thePostgresqlJdbcAdapter);
            }
            {
                DtoStreamJDBCAdapter theStreamJDBCAdapter;
                theStreamJDBCAdapter = this.getStreamJDBCAdapter();
                strategy.appendField(locator, this, "streamJDBCAdapter", buffer, theStreamJDBCAdapter);
            }
            {
                DtoSybaseJdbcAdapter theSybaseJdbcAdapter;
                theSybaseJdbcAdapter = this.getSybaseJdbcAdapter();
                strategy.appendField(locator, this, "sybaseJdbcAdapter", buffer, theSybaseJdbcAdapter);
            }
            {
                DtoTransactJdbcAdapter theTransactJdbcAdapter;
                theTransactJdbcAdapter = this.getTransactJdbcAdapter();
                strategy.appendField(locator, this, "transactJdbcAdapter", buffer, theTransactJdbcAdapter);
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
                DtoAxionJDBCAdapter theAxionJDBCAdapter;
                theAxionJDBCAdapter = this.getAxionJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axionJDBCAdapter", theAxionJDBCAdapter), currentHashCode, theAxionJDBCAdapter);
            }
            {
                DtoBlobJDBCAdapter theBlobJDBCAdapter;
                theBlobJDBCAdapter = this.getBlobJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blobJDBCAdapter", theBlobJDBCAdapter), currentHashCode, theBlobJDBCAdapter);
            }
            {
                DtoBytesJDBCAdapter theBytesJDBCAdapter;
                theBytesJDBCAdapter = this.getBytesJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bytesJDBCAdapter", theBytesJDBCAdapter), currentHashCode, theBytesJDBCAdapter);
            }
            {
                DtoDb2JDBCAdapter theDb2JDBCAdapter;
                theDb2JDBCAdapter = this.getDb2JDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "db2JDBCAdapter", theDb2JDBCAdapter), currentHashCode, theDb2JDBCAdapter);
            }
            {
                DtoDefaultJDBCAdapter theDefaultJDBCAdapter;
                theDefaultJDBCAdapter = this.getDefaultJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultJDBCAdapter", theDefaultJDBCAdapter), currentHashCode, theDefaultJDBCAdapter);
            }
            {
                DtoHsqldbJdbcAdapter theHsqldbJdbcAdapter;
                theHsqldbJdbcAdapter = this.getHsqldbJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hsqldbJdbcAdapter", theHsqldbJdbcAdapter), currentHashCode, theHsqldbJdbcAdapter);
            }
            {
                DtoImageBasedJDBCAdaptor theImageBasedJDBCAdaptor;
                theImageBasedJDBCAdaptor = this.getImageBasedJDBCAdaptor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageBasedJDBCAdaptor", theImageBasedJDBCAdaptor), currentHashCode, theImageBasedJDBCAdaptor);
            }
            {
                DtoInformixJDBCAdapter theInformixJDBCAdapter;
                theInformixJDBCAdapter = this.getInformixJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "informixJDBCAdapter", theInformixJDBCAdapter), currentHashCode, theInformixJDBCAdapter);
            }
            {
                DtoMaxdbJdbcAdapter theMaxdbJdbcAdapter;
                theMaxdbJdbcAdapter = this.getMaxdbJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxdbJdbcAdapter", theMaxdbJdbcAdapter), currentHashCode, theMaxdbJdbcAdapter);
            }
            {
                DtoMysqlJdbcAdapter theMysqlJdbcAdapter;
                theMysqlJdbcAdapter = this.getMysqlJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mysqlJdbcAdapter", theMysqlJdbcAdapter), currentHashCode, theMysqlJdbcAdapter);
            }
            {
                DtoOracleBlobJDBCAdapter theOracleBlobJDBCAdapter;
                theOracleBlobJDBCAdapter = this.getOracleBlobJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oracleBlobJDBCAdapter", theOracleBlobJDBCAdapter), currentHashCode, theOracleBlobJDBCAdapter);
            }
            {
                DtoOracleJDBCAdapter theOracleJDBCAdapter;
                theOracleJDBCAdapter = this.getOracleJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oracleJDBCAdapter", theOracleJDBCAdapter), currentHashCode, theOracleJDBCAdapter);
            }
            {
                DtoPostgresqlJdbcAdapter thePostgresqlJdbcAdapter;
                thePostgresqlJdbcAdapter = this.getPostgresqlJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postgresqlJdbcAdapter", thePostgresqlJdbcAdapter), currentHashCode, thePostgresqlJdbcAdapter);
            }
            {
                DtoStreamJDBCAdapter theStreamJDBCAdapter;
                theStreamJDBCAdapter = this.getStreamJDBCAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "streamJDBCAdapter", theStreamJDBCAdapter), currentHashCode, theStreamJDBCAdapter);
            }
            {
                DtoSybaseJdbcAdapter theSybaseJdbcAdapter;
                theSybaseJdbcAdapter = this.getSybaseJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sybaseJdbcAdapter", theSybaseJdbcAdapter), currentHashCode, theSybaseJdbcAdapter);
            }
            {
                DtoTransactJdbcAdapter theTransactJdbcAdapter;
                theTransactJdbcAdapter = this.getTransactJdbcAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactJdbcAdapter", theTransactJdbcAdapter), currentHashCode, theTransactJdbcAdapter);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.Adapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.Adapter that = ((DtoJdbcPersistenceAdapter.Adapter) object);
            {
                DtoAxionJDBCAdapter lhsAxionJDBCAdapter;
                lhsAxionJDBCAdapter = this.getAxionJDBCAdapter();
                DtoAxionJDBCAdapter rhsAxionJDBCAdapter;
                rhsAxionJDBCAdapter = that.getAxionJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "axionJDBCAdapter", lhsAxionJDBCAdapter), LocatorUtils.property(thatLocator, "axionJDBCAdapter", rhsAxionJDBCAdapter), lhsAxionJDBCAdapter, rhsAxionJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoBlobJDBCAdapter lhsBlobJDBCAdapter;
                lhsBlobJDBCAdapter = this.getBlobJDBCAdapter();
                DtoBlobJDBCAdapter rhsBlobJDBCAdapter;
                rhsBlobJDBCAdapter = that.getBlobJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "blobJDBCAdapter", lhsBlobJDBCAdapter), LocatorUtils.property(thatLocator, "blobJDBCAdapter", rhsBlobJDBCAdapter), lhsBlobJDBCAdapter, rhsBlobJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoBytesJDBCAdapter lhsBytesJDBCAdapter;
                lhsBytesJDBCAdapter = this.getBytesJDBCAdapter();
                DtoBytesJDBCAdapter rhsBytesJDBCAdapter;
                rhsBytesJDBCAdapter = that.getBytesJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bytesJDBCAdapter", lhsBytesJDBCAdapter), LocatorUtils.property(thatLocator, "bytesJDBCAdapter", rhsBytesJDBCAdapter), lhsBytesJDBCAdapter, rhsBytesJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoDb2JDBCAdapter lhsDb2JDBCAdapter;
                lhsDb2JDBCAdapter = this.getDb2JDBCAdapter();
                DtoDb2JDBCAdapter rhsDb2JDBCAdapter;
                rhsDb2JDBCAdapter = that.getDb2JDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "db2JDBCAdapter", lhsDb2JDBCAdapter), LocatorUtils.property(thatLocator, "db2JDBCAdapter", rhsDb2JDBCAdapter), lhsDb2JDBCAdapter, rhsDb2JDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoDefaultJDBCAdapter lhsDefaultJDBCAdapter;
                lhsDefaultJDBCAdapter = this.getDefaultJDBCAdapter();
                DtoDefaultJDBCAdapter rhsDefaultJDBCAdapter;
                rhsDefaultJDBCAdapter = that.getDefaultJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultJDBCAdapter", lhsDefaultJDBCAdapter), LocatorUtils.property(thatLocator, "defaultJDBCAdapter", rhsDefaultJDBCAdapter), lhsDefaultJDBCAdapter, rhsDefaultJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoHsqldbJdbcAdapter lhsHsqldbJdbcAdapter;
                lhsHsqldbJdbcAdapter = this.getHsqldbJdbcAdapter();
                DtoHsqldbJdbcAdapter rhsHsqldbJdbcAdapter;
                rhsHsqldbJdbcAdapter = that.getHsqldbJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "hsqldbJdbcAdapter", lhsHsqldbJdbcAdapter), LocatorUtils.property(thatLocator, "hsqldbJdbcAdapter", rhsHsqldbJdbcAdapter), lhsHsqldbJdbcAdapter, rhsHsqldbJdbcAdapter)) {
                    return false;
                }
            }
            {
                DtoImageBasedJDBCAdaptor lhsImageBasedJDBCAdaptor;
                lhsImageBasedJDBCAdaptor = this.getImageBasedJDBCAdaptor();
                DtoImageBasedJDBCAdaptor rhsImageBasedJDBCAdaptor;
                rhsImageBasedJDBCAdaptor = that.getImageBasedJDBCAdaptor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "imageBasedJDBCAdaptor", lhsImageBasedJDBCAdaptor), LocatorUtils.property(thatLocator, "imageBasedJDBCAdaptor", rhsImageBasedJDBCAdaptor), lhsImageBasedJDBCAdaptor, rhsImageBasedJDBCAdaptor)) {
                    return false;
                }
            }
            {
                DtoInformixJDBCAdapter lhsInformixJDBCAdapter;
                lhsInformixJDBCAdapter = this.getInformixJDBCAdapter();
                DtoInformixJDBCAdapter rhsInformixJDBCAdapter;
                rhsInformixJDBCAdapter = that.getInformixJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "informixJDBCAdapter", lhsInformixJDBCAdapter), LocatorUtils.property(thatLocator, "informixJDBCAdapter", rhsInformixJDBCAdapter), lhsInformixJDBCAdapter, rhsInformixJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoMaxdbJdbcAdapter lhsMaxdbJdbcAdapter;
                lhsMaxdbJdbcAdapter = this.getMaxdbJdbcAdapter();
                DtoMaxdbJdbcAdapter rhsMaxdbJdbcAdapter;
                rhsMaxdbJdbcAdapter = that.getMaxdbJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "maxdbJdbcAdapter", lhsMaxdbJdbcAdapter), LocatorUtils.property(thatLocator, "maxdbJdbcAdapter", rhsMaxdbJdbcAdapter), lhsMaxdbJdbcAdapter, rhsMaxdbJdbcAdapter)) {
                    return false;
                }
            }
            {
                DtoMysqlJdbcAdapter lhsMysqlJdbcAdapter;
                lhsMysqlJdbcAdapter = this.getMysqlJdbcAdapter();
                DtoMysqlJdbcAdapter rhsMysqlJdbcAdapter;
                rhsMysqlJdbcAdapter = that.getMysqlJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mysqlJdbcAdapter", lhsMysqlJdbcAdapter), LocatorUtils.property(thatLocator, "mysqlJdbcAdapter", rhsMysqlJdbcAdapter), lhsMysqlJdbcAdapter, rhsMysqlJdbcAdapter)) {
                    return false;
                }
            }
            {
                DtoOracleBlobJDBCAdapter lhsOracleBlobJDBCAdapter;
                lhsOracleBlobJDBCAdapter = this.getOracleBlobJDBCAdapter();
                DtoOracleBlobJDBCAdapter rhsOracleBlobJDBCAdapter;
                rhsOracleBlobJDBCAdapter = that.getOracleBlobJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oracleBlobJDBCAdapter", lhsOracleBlobJDBCAdapter), LocatorUtils.property(thatLocator, "oracleBlobJDBCAdapter", rhsOracleBlobJDBCAdapter), lhsOracleBlobJDBCAdapter, rhsOracleBlobJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoOracleJDBCAdapter lhsOracleJDBCAdapter;
                lhsOracleJDBCAdapter = this.getOracleJDBCAdapter();
                DtoOracleJDBCAdapter rhsOracleJDBCAdapter;
                rhsOracleJDBCAdapter = that.getOracleJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oracleJDBCAdapter", lhsOracleJDBCAdapter), LocatorUtils.property(thatLocator, "oracleJDBCAdapter", rhsOracleJDBCAdapter), lhsOracleJDBCAdapter, rhsOracleJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoPostgresqlJdbcAdapter lhsPostgresqlJdbcAdapter;
                lhsPostgresqlJdbcAdapter = this.getPostgresqlJdbcAdapter();
                DtoPostgresqlJdbcAdapter rhsPostgresqlJdbcAdapter;
                rhsPostgresqlJdbcAdapter = that.getPostgresqlJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "postgresqlJdbcAdapter", lhsPostgresqlJdbcAdapter), LocatorUtils.property(thatLocator, "postgresqlJdbcAdapter", rhsPostgresqlJdbcAdapter), lhsPostgresqlJdbcAdapter, rhsPostgresqlJdbcAdapter)) {
                    return false;
                }
            }
            {
                DtoStreamJDBCAdapter lhsStreamJDBCAdapter;
                lhsStreamJDBCAdapter = this.getStreamJDBCAdapter();
                DtoStreamJDBCAdapter rhsStreamJDBCAdapter;
                rhsStreamJDBCAdapter = that.getStreamJDBCAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "streamJDBCAdapter", lhsStreamJDBCAdapter), LocatorUtils.property(thatLocator, "streamJDBCAdapter", rhsStreamJDBCAdapter), lhsStreamJDBCAdapter, rhsStreamJDBCAdapter)) {
                    return false;
                }
            }
            {
                DtoSybaseJdbcAdapter lhsSybaseJdbcAdapter;
                lhsSybaseJdbcAdapter = this.getSybaseJdbcAdapter();
                DtoSybaseJdbcAdapter rhsSybaseJdbcAdapter;
                rhsSybaseJdbcAdapter = that.getSybaseJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sybaseJdbcAdapter", lhsSybaseJdbcAdapter), LocatorUtils.property(thatLocator, "sybaseJdbcAdapter", rhsSybaseJdbcAdapter), lhsSybaseJdbcAdapter, rhsSybaseJdbcAdapter)) {
                    return false;
                }
            }
            {
                DtoTransactJdbcAdapter lhsTransactJdbcAdapter;
                lhsTransactJdbcAdapter = this.getTransactJdbcAdapter();
                DtoTransactJdbcAdapter rhsTransactJdbcAdapter;
                rhsTransactJdbcAdapter = that.getTransactJdbcAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transactJdbcAdapter", lhsTransactJdbcAdapter), LocatorUtils.property(thatLocator, "transactJdbcAdapter", rhsTransactJdbcAdapter), lhsTransactJdbcAdapter, rhsTransactJdbcAdapter)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
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
        "broker",
        "brokerService",
        "any"
    })
    public static class BrokerService
        implements Equals, HashCode, ToString
    {

        protected DtoBroker broker;
        protected DtoBrokerService brokerService;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取broker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBroker }
         *     
         */
        public DtoBroker getBroker() {
            return broker;
        }

        /**
         * 设置broker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBroker }
         *     
         */
        public void setBroker(DtoBroker value) {
            this.broker = value;
        }

        /**
         * 获取brokerService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBrokerService }
         *     
         */
        public DtoBrokerService getBrokerService() {
            return brokerService;
        }

        /**
         * 设置brokerService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBrokerService }
         *     
         */
        public void setBrokerService(DtoBrokerService value) {
            this.brokerService = value;
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                strategy.appendField(locator, this, "broker", buffer, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "broker", theBroker), currentHashCode, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.BrokerService that = ((DtoJdbcPersistenceAdapter.BrokerService) object);
            {
                DtoBroker lhsBroker;
                lhsBroker = this.getBroker();
                DtoBroker rhsBroker;
                rhsBroker = that.getBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "broker", lhsBroker), LocatorUtils.property(thatLocator, "broker", rhsBroker), lhsBroker, rhsBroker)) {
                    return false;
                }
            }
            {
                DtoBrokerService lhsBrokerService;
                lhsBrokerService = this.getBrokerService();
                DtoBrokerService rhsBrokerService;
                rhsBrokerService = that.getBrokerService();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
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
    public static class DataSource
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.DataSource)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.DataSource that = ((DtoJdbcPersistenceAdapter.DataSource) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
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
        "databaseLocker",
        "leaseDatabaseLocker",
        "sharedFileLocker",
        "transactDatabaseLocker",
        "any"
    })
    public static class DatabaseLocker
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "database-locker")
        protected DtoDatabaseLocker databaseLocker;
        @XmlElement(name = "lease-database-locker")
        protected DtoLeaseDatabaseLocker leaseDatabaseLocker;
        @XmlElement(name = "shared-file-locker")
        protected DtoSharedFileLocker sharedFileLocker;
        @XmlElement(name = "transact-database-locker")
        protected DtoTransactDatabaseLocker transactDatabaseLocker;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取databaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public DtoDatabaseLocker getDatabaseLocker() {
            return databaseLocker;
        }

        /**
         * 设置databaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public void setDatabaseLocker(DtoDatabaseLocker value) {
            this.databaseLocker = value;
        }

        /**
         * 获取leaseDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public DtoLeaseDatabaseLocker getLeaseDatabaseLocker() {
            return leaseDatabaseLocker;
        }

        /**
         * 设置leaseDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public void setLeaseDatabaseLocker(DtoLeaseDatabaseLocker value) {
            this.leaseDatabaseLocker = value;
        }

        /**
         * 获取sharedFileLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public DtoSharedFileLocker getSharedFileLocker() {
            return sharedFileLocker;
        }

        /**
         * 设置sharedFileLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public void setSharedFileLocker(DtoSharedFileLocker value) {
            this.sharedFileLocker = value;
        }

        /**
         * 获取transactDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public DtoTransactDatabaseLocker getTransactDatabaseLocker() {
            return transactDatabaseLocker;
        }

        /**
         * 设置transactDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public void setTransactDatabaseLocker(DtoTransactDatabaseLocker value) {
            this.transactDatabaseLocker = value;
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                strategy.appendField(locator, this, "databaseLocker", buffer, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                strategy.appendField(locator, this, "leaseDatabaseLocker", buffer, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                strategy.appendField(locator, this, "sharedFileLocker", buffer, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                strategy.appendField(locator, this, "transactDatabaseLocker", buffer, theTransactDatabaseLocker);
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "databaseLocker", theDatabaseLocker), currentHashCode, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseDatabaseLocker", theLeaseDatabaseLocker), currentHashCode, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sharedFileLocker", theSharedFileLocker), currentHashCode, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactDatabaseLocker", theTransactDatabaseLocker), currentHashCode, theTransactDatabaseLocker);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.DatabaseLocker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.DatabaseLocker that = ((DtoJdbcPersistenceAdapter.DatabaseLocker) object);
            {
                DtoDatabaseLocker lhsDatabaseLocker;
                lhsDatabaseLocker = this.getDatabaseLocker();
                DtoDatabaseLocker rhsDatabaseLocker;
                rhsDatabaseLocker = that.getDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "databaseLocker", lhsDatabaseLocker), LocatorUtils.property(thatLocator, "databaseLocker", rhsDatabaseLocker), lhsDatabaseLocker, rhsDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoLeaseDatabaseLocker lhsLeaseDatabaseLocker;
                lhsLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                DtoLeaseDatabaseLocker rhsLeaseDatabaseLocker;
                rhsLeaseDatabaseLocker = that.getLeaseDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseDatabaseLocker", lhsLeaseDatabaseLocker), LocatorUtils.property(thatLocator, "leaseDatabaseLocker", rhsLeaseDatabaseLocker), lhsLeaseDatabaseLocker, rhsLeaseDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoSharedFileLocker lhsSharedFileLocker;
                lhsSharedFileLocker = this.getSharedFileLocker();
                DtoSharedFileLocker rhsSharedFileLocker;
                rhsSharedFileLocker = that.getSharedFileLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedFileLocker", lhsSharedFileLocker), LocatorUtils.property(thatLocator, "sharedFileLocker", rhsSharedFileLocker), lhsSharedFileLocker, rhsSharedFileLocker)) {
                    return false;
                }
            }
            {
                DtoTransactDatabaseLocker lhsTransactDatabaseLocker;
                lhsTransactDatabaseLocker = this.getTransactDatabaseLocker();
                DtoTransactDatabaseLocker rhsTransactDatabaseLocker;
                rhsTransactDatabaseLocker = that.getTransactDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transactDatabaseLocker", lhsTransactDatabaseLocker), LocatorUtils.property(thatLocator, "transactDatabaseLocker", rhsTransactDatabaseLocker), lhsTransactDatabaseLocker, rhsTransactDatabaseLocker)) {
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
    public static class Ds
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.Ds)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.Ds that = ((DtoJdbcPersistenceAdapter.Ds) object);
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
    public static class LockDataSource
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.LockDataSource)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.LockDataSource that = ((DtoJdbcPersistenceAdapter.LockDataSource) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
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
        "databaseLocker",
        "leaseDatabaseLocker",
        "sharedFileLocker",
        "transactDatabaseLocker",
        "any"
    })
    public static class Locker
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "database-locker")
        protected DtoDatabaseLocker databaseLocker;
        @XmlElement(name = "lease-database-locker")
        protected DtoLeaseDatabaseLocker leaseDatabaseLocker;
        @XmlElement(name = "shared-file-locker")
        protected DtoSharedFileLocker sharedFileLocker;
        @XmlElement(name = "transact-database-locker")
        protected DtoTransactDatabaseLocker transactDatabaseLocker;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取databaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public DtoDatabaseLocker getDatabaseLocker() {
            return databaseLocker;
        }

        /**
         * 设置databaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public void setDatabaseLocker(DtoDatabaseLocker value) {
            this.databaseLocker = value;
        }

        /**
         * 获取leaseDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public DtoLeaseDatabaseLocker getLeaseDatabaseLocker() {
            return leaseDatabaseLocker;
        }

        /**
         * 设置leaseDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public void setLeaseDatabaseLocker(DtoLeaseDatabaseLocker value) {
            this.leaseDatabaseLocker = value;
        }

        /**
         * 获取sharedFileLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public DtoSharedFileLocker getSharedFileLocker() {
            return sharedFileLocker;
        }

        /**
         * 设置sharedFileLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public void setSharedFileLocker(DtoSharedFileLocker value) {
            this.sharedFileLocker = value;
        }

        /**
         * 获取transactDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public DtoTransactDatabaseLocker getTransactDatabaseLocker() {
            return transactDatabaseLocker;
        }

        /**
         * 设置transactDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public void setTransactDatabaseLocker(DtoTransactDatabaseLocker value) {
            this.transactDatabaseLocker = value;
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                strategy.appendField(locator, this, "databaseLocker", buffer, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                strategy.appendField(locator, this, "leaseDatabaseLocker", buffer, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                strategy.appendField(locator, this, "sharedFileLocker", buffer, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                strategy.appendField(locator, this, "transactDatabaseLocker", buffer, theTransactDatabaseLocker);
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "databaseLocker", theDatabaseLocker), currentHashCode, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseDatabaseLocker", theLeaseDatabaseLocker), currentHashCode, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sharedFileLocker", theSharedFileLocker), currentHashCode, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactDatabaseLocker", theTransactDatabaseLocker), currentHashCode, theTransactDatabaseLocker);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.Locker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.Locker that = ((DtoJdbcPersistenceAdapter.Locker) object);
            {
                DtoDatabaseLocker lhsDatabaseLocker;
                lhsDatabaseLocker = this.getDatabaseLocker();
                DtoDatabaseLocker rhsDatabaseLocker;
                rhsDatabaseLocker = that.getDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "databaseLocker", lhsDatabaseLocker), LocatorUtils.property(thatLocator, "databaseLocker", rhsDatabaseLocker), lhsDatabaseLocker, rhsDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoLeaseDatabaseLocker lhsLeaseDatabaseLocker;
                lhsLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                DtoLeaseDatabaseLocker rhsLeaseDatabaseLocker;
                rhsLeaseDatabaseLocker = that.getLeaseDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseDatabaseLocker", lhsLeaseDatabaseLocker), LocatorUtils.property(thatLocator, "leaseDatabaseLocker", rhsLeaseDatabaseLocker), lhsLeaseDatabaseLocker, rhsLeaseDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoSharedFileLocker lhsSharedFileLocker;
                lhsSharedFileLocker = this.getSharedFileLocker();
                DtoSharedFileLocker rhsSharedFileLocker;
                rhsSharedFileLocker = that.getSharedFileLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedFileLocker", lhsSharedFileLocker), LocatorUtils.property(thatLocator, "sharedFileLocker", rhsSharedFileLocker), lhsSharedFileLocker, rhsSharedFileLocker)) {
                    return false;
                }
            }
            {
                DtoTransactDatabaseLocker lhsTransactDatabaseLocker;
                lhsTransactDatabaseLocker = this.getTransactDatabaseLocker();
                DtoTransactDatabaseLocker rhsTransactDatabaseLocker;
                rhsTransactDatabaseLocker = that.getTransactDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transactDatabaseLocker", lhsTransactDatabaseLocker), LocatorUtils.property(thatLocator, "transactDatabaseLocker", rhsTransactDatabaseLocker), lhsTransactDatabaseLocker, rhsTransactDatabaseLocker)) {
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
    public static class ScheduledThreadPoolExecutor
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor that = ((DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}statements"/>
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
        "statements",
        "any"
    })
    public static class Statements
        implements Equals, HashCode, ToString
    {

        protected DtoStatements statements;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取statements属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStatements }
         *     
         */
        public DtoStatements getStatements() {
            return statements;
        }

        /**
         * 设置statements属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStatements }
         *     
         */
        public void setStatements(DtoStatements value) {
            this.statements = value;
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
                DtoStatements theStatements;
                theStatements = this.getStatements();
                strategy.appendField(locator, this, "statements", buffer, theStatements);
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
                DtoStatements theStatements;
                theStatements = this.getStatements();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statements", theStatements), currentHashCode, theStatements);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.Statements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.Statements that = ((DtoJdbcPersistenceAdapter.Statements) object);
            {
                DtoStatements lhsStatements;
                lhsStatements = this.getStatements();
                DtoStatements rhsStatements;
                rhsStatements = that.getStatements();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "statements", lhsStatements), LocatorUtils.property(thatLocator, "statements", rhsStatements), lhsStatements, rhsStatements)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
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
        "systemUsage",
        "any"
    })
    public static class UsageManager
        implements Equals, HashCode, ToString
    {

        protected DtoSystemUsage systemUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取systemUsage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSystemUsage }
         *     
         */
        public DtoSystemUsage getSystemUsage() {
            return systemUsage;
        }

        /**
         * 设置systemUsage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSystemUsage }
         *     
         */
        public void setSystemUsage(DtoSystemUsage value) {
            this.systemUsage = value;
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
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                strategy.appendField(locator, this, "systemUsage", buffer, theSystemUsage);
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
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUsage", theSystemUsage), currentHashCode, theSystemUsage);
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.UsageManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.UsageManager that = ((DtoJdbcPersistenceAdapter.UsageManager) object);
            {
                DtoSystemUsage lhsSystemUsage;
                lhsSystemUsage = this.getSystemUsage();
                DtoSystemUsage rhsSystemUsage;
                rhsSystemUsage = that.getSystemUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUsage", lhsSystemUsage), LocatorUtils.property(thatLocator, "systemUsage", rhsSystemUsage), lhsSystemUsage, rhsSystemUsage)) {
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
    public static class WireFormat
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
            if (!(object instanceof DtoJdbcPersistenceAdapter.WireFormat)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJdbcPersistenceAdapter.WireFormat that = ((DtoJdbcPersistenceAdapter.WireFormat) object);
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
