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
 *           &lt;element name="transactionIdTransformer" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="archiveCorruptedIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="archiveDataLogs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkForCorruptJournalFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkpointInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="checksumJournalFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cleanupInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="concurrentStoreAndDispatchQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="concurrentStoreAndDispatchTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="databaseLockedWaitDelay" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="directoryArchive" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableIndexDiskSyncs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableIndexPageCaching" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableIndexRecoveryFile" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableIndexWriteAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableJournalDiskSyncs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="failoverProducersAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="forceRecoverIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreMissingJournalfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="indexCacheSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indexDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indexLFUEvictionFactor" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="indexWriteBatchSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journalMaxFileLength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journalMaxWriteBatchSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockKeepAlivePeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="locker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxAsyncJobs" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxFailoverProducersToTrack" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="scheduledThreadPoolExecutor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionIdTransformer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usageManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useIndexLFRUEviction" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrLockerOrScheduledThreadPoolExecutor"
})
@XmlRootElement(name = "kahaDB")
public class DtoKahaDB implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "scheduledThreadPoolExecutor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "usageManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "transactionIdTransformer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "locker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrLockerOrScheduledThreadPoolExecutor;
    @XmlAttribute(name = "archiveCorruptedIndex")
    protected Boolean archiveCorruptedIndex;
    @XmlAttribute(name = "archiveDataLogs")
    protected Boolean archiveDataLogs;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "checkForCorruptJournalFiles")
    protected Boolean checkForCorruptJournalFiles;
    @XmlAttribute(name = "checkpointInterval")
    protected Long checkpointInterval;
    @XmlAttribute(name = "checksumJournalFiles")
    protected Boolean checksumJournalFiles;
    @XmlAttribute(name = "cleanupInterval")
    protected Long cleanupInterval;
    @XmlAttribute(name = "concurrentStoreAndDispatchQueues")
    protected Boolean concurrentStoreAndDispatchQueues;
    @XmlAttribute(name = "concurrentStoreAndDispatchTopics")
    protected Boolean concurrentStoreAndDispatchTopics;
    @XmlAttribute(name = "databaseLockedWaitDelay")
    protected BigInteger databaseLockedWaitDelay;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "directoryArchive")
    protected String directoryArchive;
    @XmlAttribute(name = "enableIndexDiskSyncs")
    protected Boolean enableIndexDiskSyncs;
    @XmlAttribute(name = "enableIndexPageCaching")
    protected Boolean enableIndexPageCaching;
    @XmlAttribute(name = "enableIndexRecoveryFile")
    protected Boolean enableIndexRecoveryFile;
    @XmlAttribute(name = "enableIndexWriteAsync")
    protected Boolean enableIndexWriteAsync;
    @XmlAttribute(name = "enableJournalDiskSyncs")
    protected Boolean enableJournalDiskSyncs;
    @XmlAttribute(name = "failoverProducersAuditDepth")
    protected BigInteger failoverProducersAuditDepth;
    @XmlAttribute(name = "forceRecoverIndex")
    protected Boolean forceRecoverIndex;
    @XmlAttribute(name = "ignoreMissingJournalfiles")
    protected Boolean ignoreMissingJournalfiles;
    @XmlAttribute(name = "indexCacheSize")
    protected String indexCacheSize;
    @XmlAttribute(name = "indexDirectory")
    protected String indexDirectory;
    @XmlAttribute(name = "indexLFUEvictionFactor")
    protected Float indexLFUEvictionFactor;
    @XmlAttribute(name = "indexWriteBatchSize")
    protected String indexWriteBatchSize;
    @XmlAttribute(name = "journalMaxFileLength")
    protected String journalMaxFileLength;
    @XmlAttribute(name = "journalMaxWriteBatchSize")
    protected String journalMaxWriteBatchSize;
    @XmlAttribute(name = "lockKeepAlivePeriod")
    protected Long lockKeepAlivePeriod;
    @XmlAttribute(name = "locker")
    protected String locker;
    @XmlAttribute(name = "maxAsyncJobs")
    protected BigInteger maxAsyncJobs;
    @XmlAttribute(name = "maxFailoverProducersToTrack")
    protected BigInteger maxFailoverProducersToTrack;
    @XmlAttribute(name = "scheduledThreadPoolExecutor")
    protected String scheduledThreadPoolExecutor;
    @XmlAttribute(name = "transactionIdTransformer")
    protected String transactionIdTransformer;
    @XmlAttribute(name = "usageManager")
    protected String usageManager;
    @XmlAttribute(name = "useIndexLFRUEviction")
    protected Boolean useIndexLFRUEviction;
    @XmlAttribute(name = "useLock")
    protected Boolean useLock;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrLockerOrScheduledThreadPoolExecutor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrLockerOrScheduledThreadPoolExecutor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrLockerOrScheduledThreadPoolExecutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoKahaDB.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoKahaDB.ScheduledThreadPoolExecutor }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoKahaDB.TransactionIdTransformer }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoKahaDB.UsageManager }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoKahaDB.Locker }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrLockerOrScheduledThreadPoolExecutor() {
        if (brokerServiceOrLockerOrScheduledThreadPoolExecutor == null) {
            brokerServiceOrLockerOrScheduledThreadPoolExecutor = new ArrayList<Object>();
        }
        return this.brokerServiceOrLockerOrScheduledThreadPoolExecutor;
    }

    /**
     * 获取archiveCorruptedIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchiveCorruptedIndex() {
        return archiveCorruptedIndex;
    }

    /**
     * 设置archiveCorruptedIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchiveCorruptedIndex(Boolean value) {
        this.archiveCorruptedIndex = value;
    }

    /**
     * 获取archiveDataLogs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchiveDataLogs() {
        return archiveDataLogs;
    }

    /**
     * 设置archiveDataLogs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchiveDataLogs(Boolean value) {
        this.archiveDataLogs = value;
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
     * 获取checkForCorruptJournalFiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckForCorruptJournalFiles() {
        return checkForCorruptJournalFiles;
    }

    /**
     * 设置checkForCorruptJournalFiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckForCorruptJournalFiles(Boolean value) {
        this.checkForCorruptJournalFiles = value;
    }

    /**
     * 获取checkpointInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckpointInterval() {
        return checkpointInterval;
    }

    /**
     * 设置checkpointInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckpointInterval(Long value) {
        this.checkpointInterval = value;
    }

    /**
     * 获取checksumJournalFiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChecksumJournalFiles() {
        return checksumJournalFiles;
    }

    /**
     * 设置checksumJournalFiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChecksumJournalFiles(Boolean value) {
        this.checksumJournalFiles = value;
    }

    /**
     * 获取cleanupInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCleanupInterval() {
        return cleanupInterval;
    }

    /**
     * 设置cleanupInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCleanupInterval(Long value) {
        this.cleanupInterval = value;
    }

    /**
     * 获取concurrentStoreAndDispatchQueues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcurrentStoreAndDispatchQueues() {
        return concurrentStoreAndDispatchQueues;
    }

    /**
     * 设置concurrentStoreAndDispatchQueues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrentStoreAndDispatchQueues(Boolean value) {
        this.concurrentStoreAndDispatchQueues = value;
    }

    /**
     * 获取concurrentStoreAndDispatchTopics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcurrentStoreAndDispatchTopics() {
        return concurrentStoreAndDispatchTopics;
    }

    /**
     * 设置concurrentStoreAndDispatchTopics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrentStoreAndDispatchTopics(Boolean value) {
        this.concurrentStoreAndDispatchTopics = value;
    }

    /**
     * 获取databaseLockedWaitDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDatabaseLockedWaitDelay() {
        return databaseLockedWaitDelay;
    }

    /**
     * 设置databaseLockedWaitDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDatabaseLockedWaitDelay(BigInteger value) {
        this.databaseLockedWaitDelay = value;
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
     * 获取directoryArchive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryArchive() {
        return directoryArchive;
    }

    /**
     * 设置directoryArchive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryArchive(String value) {
        this.directoryArchive = value;
    }

    /**
     * 获取enableIndexDiskSyncs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIndexDiskSyncs() {
        return enableIndexDiskSyncs;
    }

    /**
     * 设置enableIndexDiskSyncs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIndexDiskSyncs(Boolean value) {
        this.enableIndexDiskSyncs = value;
    }

    /**
     * 获取enableIndexPageCaching属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIndexPageCaching() {
        return enableIndexPageCaching;
    }

    /**
     * 设置enableIndexPageCaching属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIndexPageCaching(Boolean value) {
        this.enableIndexPageCaching = value;
    }

    /**
     * 获取enableIndexRecoveryFile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIndexRecoveryFile() {
        return enableIndexRecoveryFile;
    }

    /**
     * 设置enableIndexRecoveryFile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIndexRecoveryFile(Boolean value) {
        this.enableIndexRecoveryFile = value;
    }

    /**
     * 获取enableIndexWriteAsync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIndexWriteAsync() {
        return enableIndexWriteAsync;
    }

    /**
     * 设置enableIndexWriteAsync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIndexWriteAsync(Boolean value) {
        this.enableIndexWriteAsync = value;
    }

    /**
     * 获取enableJournalDiskSyncs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableJournalDiskSyncs() {
        return enableJournalDiskSyncs;
    }

    /**
     * 设置enableJournalDiskSyncs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableJournalDiskSyncs(Boolean value) {
        this.enableJournalDiskSyncs = value;
    }

    /**
     * 获取failoverProducersAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailoverProducersAuditDepth() {
        return failoverProducersAuditDepth;
    }

    /**
     * 设置failoverProducersAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailoverProducersAuditDepth(BigInteger value) {
        this.failoverProducersAuditDepth = value;
    }

    /**
     * 获取forceRecoverIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceRecoverIndex() {
        return forceRecoverIndex;
    }

    /**
     * 设置forceRecoverIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceRecoverIndex(Boolean value) {
        this.forceRecoverIndex = value;
    }

    /**
     * 获取ignoreMissingJournalfiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreMissingJournalfiles() {
        return ignoreMissingJournalfiles;
    }

    /**
     * 设置ignoreMissingJournalfiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreMissingJournalfiles(Boolean value) {
        this.ignoreMissingJournalfiles = value;
    }

    /**
     * 获取indexCacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexCacheSize() {
        return indexCacheSize;
    }

    /**
     * 设置indexCacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexCacheSize(String value) {
        this.indexCacheSize = value;
    }

    /**
     * 获取indexDirectory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexDirectory() {
        return indexDirectory;
    }

    /**
     * 设置indexDirectory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexDirectory(String value) {
        this.indexDirectory = value;
    }

    /**
     * 获取indexLFUEvictionFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIndexLFUEvictionFactor() {
        return indexLFUEvictionFactor;
    }

    /**
     * 设置indexLFUEvictionFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIndexLFUEvictionFactor(Float value) {
        this.indexLFUEvictionFactor = value;
    }

    /**
     * 获取indexWriteBatchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexWriteBatchSize() {
        return indexWriteBatchSize;
    }

    /**
     * 设置indexWriteBatchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexWriteBatchSize(String value) {
        this.indexWriteBatchSize = value;
    }

    /**
     * 获取journalMaxFileLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalMaxFileLength() {
        return journalMaxFileLength;
    }

    /**
     * 设置journalMaxFileLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalMaxFileLength(String value) {
        this.journalMaxFileLength = value;
    }

    /**
     * 获取journalMaxWriteBatchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalMaxWriteBatchSize() {
        return journalMaxWriteBatchSize;
    }

    /**
     * 设置journalMaxWriteBatchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalMaxWriteBatchSize(String value) {
        this.journalMaxWriteBatchSize = value;
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
     * 获取maxAsyncJobs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAsyncJobs() {
        return maxAsyncJobs;
    }

    /**
     * 设置maxAsyncJobs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAsyncJobs(BigInteger value) {
        this.maxAsyncJobs = value;
    }

    /**
     * 获取maxFailoverProducersToTrack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFailoverProducersToTrack() {
        return maxFailoverProducersToTrack;
    }

    /**
     * 设置maxFailoverProducersToTrack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFailoverProducersToTrack(BigInteger value) {
        this.maxFailoverProducersToTrack = value;
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
     * 获取transactionIdTransformer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdTransformer() {
        return transactionIdTransformer;
    }

    /**
     * 设置transactionIdTransformer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdTransformer(String value) {
        this.transactionIdTransformer = value;
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
     * 获取useIndexLFRUEviction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseIndexLFRUEviction() {
        return useIndexLFRUEviction;
    }

    /**
     * 设置useIndexLFRUEviction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseIndexLFRUEviction(Boolean value) {
        this.useIndexLFRUEviction = value;
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
            List<Object> theBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            theBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            strategy.appendField(locator, this, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", buffer, theBrokerServiceOrLockerOrScheduledThreadPoolExecutor);
        }
        {
            Boolean theArchiveCorruptedIndex;
            theArchiveCorruptedIndex = this.isArchiveCorruptedIndex();
            strategy.appendField(locator, this, "archiveCorruptedIndex", buffer, theArchiveCorruptedIndex);
        }
        {
            Boolean theArchiveDataLogs;
            theArchiveDataLogs = this.isArchiveDataLogs();
            strategy.appendField(locator, this, "archiveDataLogs", buffer, theArchiveDataLogs);
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
            Boolean theCheckForCorruptJournalFiles;
            theCheckForCorruptJournalFiles = this.isCheckForCorruptJournalFiles();
            strategy.appendField(locator, this, "checkForCorruptJournalFiles", buffer, theCheckForCorruptJournalFiles);
        }
        {
            Long theCheckpointInterval;
            theCheckpointInterval = this.getCheckpointInterval();
            strategy.appendField(locator, this, "checkpointInterval", buffer, theCheckpointInterval);
        }
        {
            Boolean theChecksumJournalFiles;
            theChecksumJournalFiles = this.isChecksumJournalFiles();
            strategy.appendField(locator, this, "checksumJournalFiles", buffer, theChecksumJournalFiles);
        }
        {
            Long theCleanupInterval;
            theCleanupInterval = this.getCleanupInterval();
            strategy.appendField(locator, this, "cleanupInterval", buffer, theCleanupInterval);
        }
        {
            Boolean theConcurrentStoreAndDispatchQueues;
            theConcurrentStoreAndDispatchQueues = this.isConcurrentStoreAndDispatchQueues();
            strategy.appendField(locator, this, "concurrentStoreAndDispatchQueues", buffer, theConcurrentStoreAndDispatchQueues);
        }
        {
            Boolean theConcurrentStoreAndDispatchTopics;
            theConcurrentStoreAndDispatchTopics = this.isConcurrentStoreAndDispatchTopics();
            strategy.appendField(locator, this, "concurrentStoreAndDispatchTopics", buffer, theConcurrentStoreAndDispatchTopics);
        }
        {
            BigInteger theDatabaseLockedWaitDelay;
            theDatabaseLockedWaitDelay = this.getDatabaseLockedWaitDelay();
            strategy.appendField(locator, this, "databaseLockedWaitDelay", buffer, theDatabaseLockedWaitDelay);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            String theDirectoryArchive;
            theDirectoryArchive = this.getDirectoryArchive();
            strategy.appendField(locator, this, "directoryArchive", buffer, theDirectoryArchive);
        }
        {
            Boolean theEnableIndexDiskSyncs;
            theEnableIndexDiskSyncs = this.isEnableIndexDiskSyncs();
            strategy.appendField(locator, this, "enableIndexDiskSyncs", buffer, theEnableIndexDiskSyncs);
        }
        {
            Boolean theEnableIndexPageCaching;
            theEnableIndexPageCaching = this.isEnableIndexPageCaching();
            strategy.appendField(locator, this, "enableIndexPageCaching", buffer, theEnableIndexPageCaching);
        }
        {
            Boolean theEnableIndexRecoveryFile;
            theEnableIndexRecoveryFile = this.isEnableIndexRecoveryFile();
            strategy.appendField(locator, this, "enableIndexRecoveryFile", buffer, theEnableIndexRecoveryFile);
        }
        {
            Boolean theEnableIndexWriteAsync;
            theEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            strategy.appendField(locator, this, "enableIndexWriteAsync", buffer, theEnableIndexWriteAsync);
        }
        {
            Boolean theEnableJournalDiskSyncs;
            theEnableJournalDiskSyncs = this.isEnableJournalDiskSyncs();
            strategy.appendField(locator, this, "enableJournalDiskSyncs", buffer, theEnableJournalDiskSyncs);
        }
        {
            BigInteger theFailoverProducersAuditDepth;
            theFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            strategy.appendField(locator, this, "failoverProducersAuditDepth", buffer, theFailoverProducersAuditDepth);
        }
        {
            Boolean theForceRecoverIndex;
            theForceRecoverIndex = this.isForceRecoverIndex();
            strategy.appendField(locator, this, "forceRecoverIndex", buffer, theForceRecoverIndex);
        }
        {
            Boolean theIgnoreMissingJournalfiles;
            theIgnoreMissingJournalfiles = this.isIgnoreMissingJournalfiles();
            strategy.appendField(locator, this, "ignoreMissingJournalfiles", buffer, theIgnoreMissingJournalfiles);
        }
        {
            String theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            strategy.appendField(locator, this, "indexCacheSize", buffer, theIndexCacheSize);
        }
        {
            String theIndexDirectory;
            theIndexDirectory = this.getIndexDirectory();
            strategy.appendField(locator, this, "indexDirectory", buffer, theIndexDirectory);
        }
        {
            Float theIndexLFUEvictionFactor;
            theIndexLFUEvictionFactor = this.getIndexLFUEvictionFactor();
            strategy.appendField(locator, this, "indexLFUEvictionFactor", buffer, theIndexLFUEvictionFactor);
        }
        {
            String theIndexWriteBatchSize;
            theIndexWriteBatchSize = this.getIndexWriteBatchSize();
            strategy.appendField(locator, this, "indexWriteBatchSize", buffer, theIndexWriteBatchSize);
        }
        {
            String theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            strategy.appendField(locator, this, "journalMaxFileLength", buffer, theJournalMaxFileLength);
        }
        {
            String theJournalMaxWriteBatchSize;
            theJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            strategy.appendField(locator, this, "journalMaxWriteBatchSize", buffer, theJournalMaxWriteBatchSize);
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
            BigInteger theMaxAsyncJobs;
            theMaxAsyncJobs = this.getMaxAsyncJobs();
            strategy.appendField(locator, this, "maxAsyncJobs", buffer, theMaxAsyncJobs);
        }
        {
            BigInteger theMaxFailoverProducersToTrack;
            theMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            strategy.appendField(locator, this, "maxFailoverProducersToTrack", buffer, theMaxFailoverProducersToTrack);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            strategy.appendField(locator, this, "scheduledThreadPoolExecutor", buffer, theScheduledThreadPoolExecutor);
        }
        {
            String theTransactionIdTransformer;
            theTransactionIdTransformer = this.getTransactionIdTransformer();
            strategy.appendField(locator, this, "transactionIdTransformer", buffer, theTransactionIdTransformer);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            strategy.appendField(locator, this, "usageManager", buffer, theUsageManager);
        }
        {
            Boolean theUseIndexLFRUEviction;
            theUseIndexLFRUEviction = this.isUseIndexLFRUEviction();
            strategy.appendField(locator, this, "useIndexLFRUEviction", buffer, theUseIndexLFRUEviction);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            strategy.appendField(locator, this, "useLock", buffer, theUseLock);
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
            List<Object> theBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            theBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", theBrokerServiceOrLockerOrScheduledThreadPoolExecutor), currentHashCode, theBrokerServiceOrLockerOrScheduledThreadPoolExecutor);
        }
        {
            Boolean theArchiveCorruptedIndex;
            theArchiveCorruptedIndex = this.isArchiveCorruptedIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "archiveCorruptedIndex", theArchiveCorruptedIndex), currentHashCode, theArchiveCorruptedIndex);
        }
        {
            Boolean theArchiveDataLogs;
            theArchiveDataLogs = this.isArchiveDataLogs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "archiveDataLogs", theArchiveDataLogs), currentHashCode, theArchiveDataLogs);
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
            Boolean theCheckForCorruptJournalFiles;
            theCheckForCorruptJournalFiles = this.isCheckForCorruptJournalFiles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkForCorruptJournalFiles", theCheckForCorruptJournalFiles), currentHashCode, theCheckForCorruptJournalFiles);
        }
        {
            Long theCheckpointInterval;
            theCheckpointInterval = this.getCheckpointInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkpointInterval", theCheckpointInterval), currentHashCode, theCheckpointInterval);
        }
        {
            Boolean theChecksumJournalFiles;
            theChecksumJournalFiles = this.isChecksumJournalFiles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checksumJournalFiles", theChecksumJournalFiles), currentHashCode, theChecksumJournalFiles);
        }
        {
            Long theCleanupInterval;
            theCleanupInterval = this.getCleanupInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cleanupInterval", theCleanupInterval), currentHashCode, theCleanupInterval);
        }
        {
            Boolean theConcurrentStoreAndDispatchQueues;
            theConcurrentStoreAndDispatchQueues = this.isConcurrentStoreAndDispatchQueues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concurrentStoreAndDispatchQueues", theConcurrentStoreAndDispatchQueues), currentHashCode, theConcurrentStoreAndDispatchQueues);
        }
        {
            Boolean theConcurrentStoreAndDispatchTopics;
            theConcurrentStoreAndDispatchTopics = this.isConcurrentStoreAndDispatchTopics();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "concurrentStoreAndDispatchTopics", theConcurrentStoreAndDispatchTopics), currentHashCode, theConcurrentStoreAndDispatchTopics);
        }
        {
            BigInteger theDatabaseLockedWaitDelay;
            theDatabaseLockedWaitDelay = this.getDatabaseLockedWaitDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "databaseLockedWaitDelay", theDatabaseLockedWaitDelay), currentHashCode, theDatabaseLockedWaitDelay);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            String theDirectoryArchive;
            theDirectoryArchive = this.getDirectoryArchive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directoryArchive", theDirectoryArchive), currentHashCode, theDirectoryArchive);
        }
        {
            Boolean theEnableIndexDiskSyncs;
            theEnableIndexDiskSyncs = this.isEnableIndexDiskSyncs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableIndexDiskSyncs", theEnableIndexDiskSyncs), currentHashCode, theEnableIndexDiskSyncs);
        }
        {
            Boolean theEnableIndexPageCaching;
            theEnableIndexPageCaching = this.isEnableIndexPageCaching();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableIndexPageCaching", theEnableIndexPageCaching), currentHashCode, theEnableIndexPageCaching);
        }
        {
            Boolean theEnableIndexRecoveryFile;
            theEnableIndexRecoveryFile = this.isEnableIndexRecoveryFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableIndexRecoveryFile", theEnableIndexRecoveryFile), currentHashCode, theEnableIndexRecoveryFile);
        }
        {
            Boolean theEnableIndexWriteAsync;
            theEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableIndexWriteAsync", theEnableIndexWriteAsync), currentHashCode, theEnableIndexWriteAsync);
        }
        {
            Boolean theEnableJournalDiskSyncs;
            theEnableJournalDiskSyncs = this.isEnableJournalDiskSyncs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableJournalDiskSyncs", theEnableJournalDiskSyncs), currentHashCode, theEnableJournalDiskSyncs);
        }
        {
            BigInteger theFailoverProducersAuditDepth;
            theFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failoverProducersAuditDepth", theFailoverProducersAuditDepth), currentHashCode, theFailoverProducersAuditDepth);
        }
        {
            Boolean theForceRecoverIndex;
            theForceRecoverIndex = this.isForceRecoverIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forceRecoverIndex", theForceRecoverIndex), currentHashCode, theForceRecoverIndex);
        }
        {
            Boolean theIgnoreMissingJournalfiles;
            theIgnoreMissingJournalfiles = this.isIgnoreMissingJournalfiles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreMissingJournalfiles", theIgnoreMissingJournalfiles), currentHashCode, theIgnoreMissingJournalfiles);
        }
        {
            String theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexCacheSize", theIndexCacheSize), currentHashCode, theIndexCacheSize);
        }
        {
            String theIndexDirectory;
            theIndexDirectory = this.getIndexDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexDirectory", theIndexDirectory), currentHashCode, theIndexDirectory);
        }
        {
            Float theIndexLFUEvictionFactor;
            theIndexLFUEvictionFactor = this.getIndexLFUEvictionFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexLFUEvictionFactor", theIndexLFUEvictionFactor), currentHashCode, theIndexLFUEvictionFactor);
        }
        {
            String theIndexWriteBatchSize;
            theIndexWriteBatchSize = this.getIndexWriteBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexWriteBatchSize", theIndexWriteBatchSize), currentHashCode, theIndexWriteBatchSize);
        }
        {
            String theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalMaxFileLength", theJournalMaxFileLength), currentHashCode, theJournalMaxFileLength);
        }
        {
            String theJournalMaxWriteBatchSize;
            theJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalMaxWriteBatchSize", theJournalMaxWriteBatchSize), currentHashCode, theJournalMaxWriteBatchSize);
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
            BigInteger theMaxAsyncJobs;
            theMaxAsyncJobs = this.getMaxAsyncJobs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAsyncJobs", theMaxAsyncJobs), currentHashCode, theMaxAsyncJobs);
        }
        {
            BigInteger theMaxFailoverProducersToTrack;
            theMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxFailoverProducersToTrack", theMaxFailoverProducersToTrack), currentHashCode, theMaxFailoverProducersToTrack);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledThreadPoolExecutor", theScheduledThreadPoolExecutor), currentHashCode, theScheduledThreadPoolExecutor);
        }
        {
            String theTransactionIdTransformer;
            theTransactionIdTransformer = this.getTransactionIdTransformer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionIdTransformer", theTransactionIdTransformer), currentHashCode, theTransactionIdTransformer);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageManager", theUsageManager), currentHashCode, theUsageManager);
        }
        {
            Boolean theUseIndexLFRUEviction;
            theUseIndexLFRUEviction = this.isUseIndexLFRUEviction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useIndexLFRUEviction", theUseIndexLFRUEviction), currentHashCode, theUseIndexLFRUEviction);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLock", theUseLock), currentHashCode, theUseLock);
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
        if (!(object instanceof DtoKahaDB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoKahaDB that = ((DtoKahaDB) object);
        {
            List<Object> lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            List<Object> rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((that.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!that.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?that.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor), LocatorUtils.property(thatLocator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor), lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor, rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor)) {
                return false;
            }
        }
        {
            Boolean lhsArchiveCorruptedIndex;
            lhsArchiveCorruptedIndex = this.isArchiveCorruptedIndex();
            Boolean rhsArchiveCorruptedIndex;
            rhsArchiveCorruptedIndex = that.isArchiveCorruptedIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "archiveCorruptedIndex", lhsArchiveCorruptedIndex), LocatorUtils.property(thatLocator, "archiveCorruptedIndex", rhsArchiveCorruptedIndex), lhsArchiveCorruptedIndex, rhsArchiveCorruptedIndex)) {
                return false;
            }
        }
        {
            Boolean lhsArchiveDataLogs;
            lhsArchiveDataLogs = this.isArchiveDataLogs();
            Boolean rhsArchiveDataLogs;
            rhsArchiveDataLogs = that.isArchiveDataLogs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "archiveDataLogs", lhsArchiveDataLogs), LocatorUtils.property(thatLocator, "archiveDataLogs", rhsArchiveDataLogs), lhsArchiveDataLogs, rhsArchiveDataLogs)) {
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
            Boolean lhsCheckForCorruptJournalFiles;
            lhsCheckForCorruptJournalFiles = this.isCheckForCorruptJournalFiles();
            Boolean rhsCheckForCorruptJournalFiles;
            rhsCheckForCorruptJournalFiles = that.isCheckForCorruptJournalFiles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkForCorruptJournalFiles", lhsCheckForCorruptJournalFiles), LocatorUtils.property(thatLocator, "checkForCorruptJournalFiles", rhsCheckForCorruptJournalFiles), lhsCheckForCorruptJournalFiles, rhsCheckForCorruptJournalFiles)) {
                return false;
            }
        }
        {
            Long lhsCheckpointInterval;
            lhsCheckpointInterval = this.getCheckpointInterval();
            Long rhsCheckpointInterval;
            rhsCheckpointInterval = that.getCheckpointInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkpointInterval", lhsCheckpointInterval), LocatorUtils.property(thatLocator, "checkpointInterval", rhsCheckpointInterval), lhsCheckpointInterval, rhsCheckpointInterval)) {
                return false;
            }
        }
        {
            Boolean lhsChecksumJournalFiles;
            lhsChecksumJournalFiles = this.isChecksumJournalFiles();
            Boolean rhsChecksumJournalFiles;
            rhsChecksumJournalFiles = that.isChecksumJournalFiles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checksumJournalFiles", lhsChecksumJournalFiles), LocatorUtils.property(thatLocator, "checksumJournalFiles", rhsChecksumJournalFiles), lhsChecksumJournalFiles, rhsChecksumJournalFiles)) {
                return false;
            }
        }
        {
            Long lhsCleanupInterval;
            lhsCleanupInterval = this.getCleanupInterval();
            Long rhsCleanupInterval;
            rhsCleanupInterval = that.getCleanupInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleanupInterval", lhsCleanupInterval), LocatorUtils.property(thatLocator, "cleanupInterval", rhsCleanupInterval), lhsCleanupInterval, rhsCleanupInterval)) {
                return false;
            }
        }
        {
            Boolean lhsConcurrentStoreAndDispatchQueues;
            lhsConcurrentStoreAndDispatchQueues = this.isConcurrentStoreAndDispatchQueues();
            Boolean rhsConcurrentStoreAndDispatchQueues;
            rhsConcurrentStoreAndDispatchQueues = that.isConcurrentStoreAndDispatchQueues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concurrentStoreAndDispatchQueues", lhsConcurrentStoreAndDispatchQueues), LocatorUtils.property(thatLocator, "concurrentStoreAndDispatchQueues", rhsConcurrentStoreAndDispatchQueues), lhsConcurrentStoreAndDispatchQueues, rhsConcurrentStoreAndDispatchQueues)) {
                return false;
            }
        }
        {
            Boolean lhsConcurrentStoreAndDispatchTopics;
            lhsConcurrentStoreAndDispatchTopics = this.isConcurrentStoreAndDispatchTopics();
            Boolean rhsConcurrentStoreAndDispatchTopics;
            rhsConcurrentStoreAndDispatchTopics = that.isConcurrentStoreAndDispatchTopics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concurrentStoreAndDispatchTopics", lhsConcurrentStoreAndDispatchTopics), LocatorUtils.property(thatLocator, "concurrentStoreAndDispatchTopics", rhsConcurrentStoreAndDispatchTopics), lhsConcurrentStoreAndDispatchTopics, rhsConcurrentStoreAndDispatchTopics)) {
                return false;
            }
        }
        {
            BigInteger lhsDatabaseLockedWaitDelay;
            lhsDatabaseLockedWaitDelay = this.getDatabaseLockedWaitDelay();
            BigInteger rhsDatabaseLockedWaitDelay;
            rhsDatabaseLockedWaitDelay = that.getDatabaseLockedWaitDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "databaseLockedWaitDelay", lhsDatabaseLockedWaitDelay), LocatorUtils.property(thatLocator, "databaseLockedWaitDelay", rhsDatabaseLockedWaitDelay), lhsDatabaseLockedWaitDelay, rhsDatabaseLockedWaitDelay)) {
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
            String lhsDirectoryArchive;
            lhsDirectoryArchive = this.getDirectoryArchive();
            String rhsDirectoryArchive;
            rhsDirectoryArchive = that.getDirectoryArchive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directoryArchive", lhsDirectoryArchive), LocatorUtils.property(thatLocator, "directoryArchive", rhsDirectoryArchive), lhsDirectoryArchive, rhsDirectoryArchive)) {
                return false;
            }
        }
        {
            Boolean lhsEnableIndexDiskSyncs;
            lhsEnableIndexDiskSyncs = this.isEnableIndexDiskSyncs();
            Boolean rhsEnableIndexDiskSyncs;
            rhsEnableIndexDiskSyncs = that.isEnableIndexDiskSyncs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableIndexDiskSyncs", lhsEnableIndexDiskSyncs), LocatorUtils.property(thatLocator, "enableIndexDiskSyncs", rhsEnableIndexDiskSyncs), lhsEnableIndexDiskSyncs, rhsEnableIndexDiskSyncs)) {
                return false;
            }
        }
        {
            Boolean lhsEnableIndexPageCaching;
            lhsEnableIndexPageCaching = this.isEnableIndexPageCaching();
            Boolean rhsEnableIndexPageCaching;
            rhsEnableIndexPageCaching = that.isEnableIndexPageCaching();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableIndexPageCaching", lhsEnableIndexPageCaching), LocatorUtils.property(thatLocator, "enableIndexPageCaching", rhsEnableIndexPageCaching), lhsEnableIndexPageCaching, rhsEnableIndexPageCaching)) {
                return false;
            }
        }
        {
            Boolean lhsEnableIndexRecoveryFile;
            lhsEnableIndexRecoveryFile = this.isEnableIndexRecoveryFile();
            Boolean rhsEnableIndexRecoveryFile;
            rhsEnableIndexRecoveryFile = that.isEnableIndexRecoveryFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableIndexRecoveryFile", lhsEnableIndexRecoveryFile), LocatorUtils.property(thatLocator, "enableIndexRecoveryFile", rhsEnableIndexRecoveryFile), lhsEnableIndexRecoveryFile, rhsEnableIndexRecoveryFile)) {
                return false;
            }
        }
        {
            Boolean lhsEnableIndexWriteAsync;
            lhsEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            Boolean rhsEnableIndexWriteAsync;
            rhsEnableIndexWriteAsync = that.isEnableIndexWriteAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableIndexWriteAsync", lhsEnableIndexWriteAsync), LocatorUtils.property(thatLocator, "enableIndexWriteAsync", rhsEnableIndexWriteAsync), lhsEnableIndexWriteAsync, rhsEnableIndexWriteAsync)) {
                return false;
            }
        }
        {
            Boolean lhsEnableJournalDiskSyncs;
            lhsEnableJournalDiskSyncs = this.isEnableJournalDiskSyncs();
            Boolean rhsEnableJournalDiskSyncs;
            rhsEnableJournalDiskSyncs = that.isEnableJournalDiskSyncs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableJournalDiskSyncs", lhsEnableJournalDiskSyncs), LocatorUtils.property(thatLocator, "enableJournalDiskSyncs", rhsEnableJournalDiskSyncs), lhsEnableJournalDiskSyncs, rhsEnableJournalDiskSyncs)) {
                return false;
            }
        }
        {
            BigInteger lhsFailoverProducersAuditDepth;
            lhsFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            BigInteger rhsFailoverProducersAuditDepth;
            rhsFailoverProducersAuditDepth = that.getFailoverProducersAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failoverProducersAuditDepth", lhsFailoverProducersAuditDepth), LocatorUtils.property(thatLocator, "failoverProducersAuditDepth", rhsFailoverProducersAuditDepth), lhsFailoverProducersAuditDepth, rhsFailoverProducersAuditDepth)) {
                return false;
            }
        }
        {
            Boolean lhsForceRecoverIndex;
            lhsForceRecoverIndex = this.isForceRecoverIndex();
            Boolean rhsForceRecoverIndex;
            rhsForceRecoverIndex = that.isForceRecoverIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forceRecoverIndex", lhsForceRecoverIndex), LocatorUtils.property(thatLocator, "forceRecoverIndex", rhsForceRecoverIndex), lhsForceRecoverIndex, rhsForceRecoverIndex)) {
                return false;
            }
        }
        {
            Boolean lhsIgnoreMissingJournalfiles;
            lhsIgnoreMissingJournalfiles = this.isIgnoreMissingJournalfiles();
            Boolean rhsIgnoreMissingJournalfiles;
            rhsIgnoreMissingJournalfiles = that.isIgnoreMissingJournalfiles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreMissingJournalfiles", lhsIgnoreMissingJournalfiles), LocatorUtils.property(thatLocator, "ignoreMissingJournalfiles", rhsIgnoreMissingJournalfiles), lhsIgnoreMissingJournalfiles, rhsIgnoreMissingJournalfiles)) {
                return false;
            }
        }
        {
            String lhsIndexCacheSize;
            lhsIndexCacheSize = this.getIndexCacheSize();
            String rhsIndexCacheSize;
            rhsIndexCacheSize = that.getIndexCacheSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexCacheSize", lhsIndexCacheSize), LocatorUtils.property(thatLocator, "indexCacheSize", rhsIndexCacheSize), lhsIndexCacheSize, rhsIndexCacheSize)) {
                return false;
            }
        }
        {
            String lhsIndexDirectory;
            lhsIndexDirectory = this.getIndexDirectory();
            String rhsIndexDirectory;
            rhsIndexDirectory = that.getIndexDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexDirectory", lhsIndexDirectory), LocatorUtils.property(thatLocator, "indexDirectory", rhsIndexDirectory), lhsIndexDirectory, rhsIndexDirectory)) {
                return false;
            }
        }
        {
            Float lhsIndexLFUEvictionFactor;
            lhsIndexLFUEvictionFactor = this.getIndexLFUEvictionFactor();
            Float rhsIndexLFUEvictionFactor;
            rhsIndexLFUEvictionFactor = that.getIndexLFUEvictionFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexLFUEvictionFactor", lhsIndexLFUEvictionFactor), LocatorUtils.property(thatLocator, "indexLFUEvictionFactor", rhsIndexLFUEvictionFactor), lhsIndexLFUEvictionFactor, rhsIndexLFUEvictionFactor)) {
                return false;
            }
        }
        {
            String lhsIndexWriteBatchSize;
            lhsIndexWriteBatchSize = this.getIndexWriteBatchSize();
            String rhsIndexWriteBatchSize;
            rhsIndexWriteBatchSize = that.getIndexWriteBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexWriteBatchSize", lhsIndexWriteBatchSize), LocatorUtils.property(thatLocator, "indexWriteBatchSize", rhsIndexWriteBatchSize), lhsIndexWriteBatchSize, rhsIndexWriteBatchSize)) {
                return false;
            }
        }
        {
            String lhsJournalMaxFileLength;
            lhsJournalMaxFileLength = this.getJournalMaxFileLength();
            String rhsJournalMaxFileLength;
            rhsJournalMaxFileLength = that.getJournalMaxFileLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalMaxFileLength", lhsJournalMaxFileLength), LocatorUtils.property(thatLocator, "journalMaxFileLength", rhsJournalMaxFileLength), lhsJournalMaxFileLength, rhsJournalMaxFileLength)) {
                return false;
            }
        }
        {
            String lhsJournalMaxWriteBatchSize;
            lhsJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            String rhsJournalMaxWriteBatchSize;
            rhsJournalMaxWriteBatchSize = that.getJournalMaxWriteBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalMaxWriteBatchSize", lhsJournalMaxWriteBatchSize), LocatorUtils.property(thatLocator, "journalMaxWriteBatchSize", rhsJournalMaxWriteBatchSize), lhsJournalMaxWriteBatchSize, rhsJournalMaxWriteBatchSize)) {
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
            BigInteger lhsMaxAsyncJobs;
            lhsMaxAsyncJobs = this.getMaxAsyncJobs();
            BigInteger rhsMaxAsyncJobs;
            rhsMaxAsyncJobs = that.getMaxAsyncJobs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAsyncJobs", lhsMaxAsyncJobs), LocatorUtils.property(thatLocator, "maxAsyncJobs", rhsMaxAsyncJobs), lhsMaxAsyncJobs, rhsMaxAsyncJobs)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxFailoverProducersToTrack;
            lhsMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            BigInteger rhsMaxFailoverProducersToTrack;
            rhsMaxFailoverProducersToTrack = that.getMaxFailoverProducersToTrack();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxFailoverProducersToTrack", lhsMaxFailoverProducersToTrack), LocatorUtils.property(thatLocator, "maxFailoverProducersToTrack", rhsMaxFailoverProducersToTrack), lhsMaxFailoverProducersToTrack, rhsMaxFailoverProducersToTrack)) {
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
            String lhsTransactionIdTransformer;
            lhsTransactionIdTransformer = this.getTransactionIdTransformer();
            String rhsTransactionIdTransformer;
            rhsTransactionIdTransformer = that.getTransactionIdTransformer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionIdTransformer", lhsTransactionIdTransformer), LocatorUtils.property(thatLocator, "transactionIdTransformer", rhsTransactionIdTransformer), lhsTransactionIdTransformer, rhsTransactionIdTransformer)) {
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
            Boolean lhsUseIndexLFRUEviction;
            lhsUseIndexLFRUEviction = this.isUseIndexLFRUEviction();
            Boolean rhsUseIndexLFRUEviction;
            rhsUseIndexLFRUEviction = that.isUseIndexLFRUEviction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useIndexLFRUEviction", lhsUseIndexLFRUEviction), LocatorUtils.property(thatLocator, "useIndexLFRUEviction", rhsUseIndexLFRUEviction), lhsUseIndexLFRUEviction, rhsUseIndexLFRUEviction)) {
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
            if (!(object instanceof DtoKahaDB.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoKahaDB.BrokerService that = ((DtoKahaDB.BrokerService) object);
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
            if (!(object instanceof DtoKahaDB.Locker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoKahaDB.Locker that = ((DtoKahaDB.Locker) object);
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
            if (!(object instanceof DtoKahaDB.ScheduledThreadPoolExecutor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoKahaDB.ScheduledThreadPoolExecutor that = ((DtoKahaDB.ScheduledThreadPoolExecutor) object);
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
    public static class TransactionIdTransformer
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
            if (!(object instanceof DtoKahaDB.TransactionIdTransformer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoKahaDB.TransactionIdTransformer that = ((DtoKahaDB.TransactionIdTransformer) object);
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
            if (!(object instanceof DtoKahaDB.UsageManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoKahaDB.UsageManager that = ((DtoKahaDB.UsageManager) object);
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

}
