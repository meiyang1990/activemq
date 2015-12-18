//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.17 ʱ�� 03:29:05 PM CST 
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
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
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
 *           &lt;element name="lockable" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="createTablesOnStartup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failIfLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="handleStartException" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="leaseHolderId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockAcquireSleepInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lockable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxAllowableDiffFromDBTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queryTimeout" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="statements" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "dataSourceOrLockableOrStatements"
})
@XmlRootElement(name = "lease-database-locker")
public class DtoLeaseDatabaseLocker implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "dataSource", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "statements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "lockable", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> dataSourceOrLockableOrStatements;
    @XmlAttribute(name = "createTablesOnStartup")
    protected Boolean createTablesOnStartup;
    @XmlAttribute(name = "dataSource")
    protected String dataSource;
    @XmlAttribute(name = "failIfLocked")
    protected Boolean failIfLocked;
    @XmlAttribute(name = "handleStartException")
    protected Boolean handleStartException;
    @XmlAttribute(name = "leaseHolderId")
    protected String leaseHolderId;
    @XmlAttribute(name = "lockAcquireSleepInterval")
    protected Long lockAcquireSleepInterval;
    @XmlAttribute(name = "lockable")
    protected String lockable;
    @XmlAttribute(name = "maxAllowableDiffFromDBTime")
    protected BigInteger maxAllowableDiffFromDBTime;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "queryTimeout")
    protected BigInteger queryTimeout;
    @XmlAttribute(name = "statements")
    protected String statements;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataSourceOrLockableOrStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSourceOrLockableOrStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSourceOrLockableOrStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.Statements }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.Lockable }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.DataSource }{@code >}
     * 
     * 
     */
    public List<Object> getDataSourceOrLockableOrStatements() {
        if (dataSourceOrLockableOrStatements == null) {
            dataSourceOrLockableOrStatements = new ArrayList<Object>();
        }
        return this.dataSourceOrLockableOrStatements;
    }

    /**
     * ��ȡcreateTablesOnStartup���Ե�ֵ��
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
     * ����createTablesOnStartup���Ե�ֵ��
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
     * ��ȡdataSource���Ե�ֵ��
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
     * ����dataSource���Ե�ֵ��
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
     * ��ȡfailIfLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailIfLocked() {
        return failIfLocked;
    }

    /**
     * ����failIfLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailIfLocked(Boolean value) {
        this.failIfLocked = value;
    }

    /**
     * ��ȡhandleStartException���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandleStartException() {
        return handleStartException;
    }

    /**
     * ����handleStartException���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleStartException(Boolean value) {
        this.handleStartException = value;
    }

    /**
     * ��ȡleaseHolderId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseHolderId() {
        return leaseHolderId;
    }

    /**
     * ����leaseHolderId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseHolderId(String value) {
        this.leaseHolderId = value;
    }

    /**
     * ��ȡlockAcquireSleepInterval���Ե�ֵ��
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
     * ����lockAcquireSleepInterval���Ե�ֵ��
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
     * ��ȡlockable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockable() {
        return lockable;
    }

    /**
     * ����lockable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockable(String value) {
        this.lockable = value;
    }

    /**
     * ��ȡmaxAllowableDiffFromDBTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAllowableDiffFromDBTime() {
        return maxAllowableDiffFromDBTime;
    }

    /**
     * ����maxAllowableDiffFromDBTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAllowableDiffFromDBTime(BigInteger value) {
        this.maxAllowableDiffFromDBTime = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡqueryTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueryTimeout() {
        return queryTimeout;
    }

    /**
     * ����queryTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueryTimeout(BigInteger value) {
        this.queryTimeout = value;
    }

    /**
     * ��ȡstatements���Ե�ֵ��
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
     * ����statements���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
            List<Object> theDataSourceOrLockableOrStatements;
            theDataSourceOrLockableOrStatements = (((this.dataSourceOrLockableOrStatements!= null)&&(!this.dataSourceOrLockableOrStatements.isEmpty()))?this.getDataSourceOrLockableOrStatements():null);
            strategy.appendField(locator, this, "dataSourceOrLockableOrStatements", buffer, theDataSourceOrLockableOrStatements);
        }
        {
            Boolean theCreateTablesOnStartup;
            theCreateTablesOnStartup = this.isCreateTablesOnStartup();
            strategy.appendField(locator, this, "createTablesOnStartup", buffer, theCreateTablesOnStartup);
        }
        {
            String theDataSource;
            theDataSource = this.getDataSource();
            strategy.appendField(locator, this, "dataSource", buffer, theDataSource);
        }
        {
            Boolean theFailIfLocked;
            theFailIfLocked = this.isFailIfLocked();
            strategy.appendField(locator, this, "failIfLocked", buffer, theFailIfLocked);
        }
        {
            Boolean theHandleStartException;
            theHandleStartException = this.isHandleStartException();
            strategy.appendField(locator, this, "handleStartException", buffer, theHandleStartException);
        }
        {
            String theLeaseHolderId;
            theLeaseHolderId = this.getLeaseHolderId();
            strategy.appendField(locator, this, "leaseHolderId", buffer, theLeaseHolderId);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            strategy.appendField(locator, this, "lockAcquireSleepInterval", buffer, theLockAcquireSleepInterval);
        }
        {
            String theLockable;
            theLockable = this.getLockable();
            strategy.appendField(locator, this, "lockable", buffer, theLockable);
        }
        {
            BigInteger theMaxAllowableDiffFromDBTime;
            theMaxAllowableDiffFromDBTime = this.getMaxAllowableDiffFromDBTime();
            strategy.appendField(locator, this, "maxAllowableDiffFromDBTime", buffer, theMaxAllowableDiffFromDBTime);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger theQueryTimeout;
            theQueryTimeout = this.getQueryTimeout();
            strategy.appendField(locator, this, "queryTimeout", buffer, theQueryTimeout);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            strategy.appendField(locator, this, "statements", buffer, theStatements);
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
            List<Object> theDataSourceOrLockableOrStatements;
            theDataSourceOrLockableOrStatements = (((this.dataSourceOrLockableOrStatements!= null)&&(!this.dataSourceOrLockableOrStatements.isEmpty()))?this.getDataSourceOrLockableOrStatements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSourceOrLockableOrStatements", theDataSourceOrLockableOrStatements), currentHashCode, theDataSourceOrLockableOrStatements);
        }
        {
            Boolean theCreateTablesOnStartup;
            theCreateTablesOnStartup = this.isCreateTablesOnStartup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createTablesOnStartup", theCreateTablesOnStartup), currentHashCode, theCreateTablesOnStartup);
        }
        {
            String theDataSource;
            theDataSource = this.getDataSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSource", theDataSource), currentHashCode, theDataSource);
        }
        {
            Boolean theFailIfLocked;
            theFailIfLocked = this.isFailIfLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failIfLocked", theFailIfLocked), currentHashCode, theFailIfLocked);
        }
        {
            Boolean theHandleStartException;
            theHandleStartException = this.isHandleStartException();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handleStartException", theHandleStartException), currentHashCode, theHandleStartException);
        }
        {
            String theLeaseHolderId;
            theLeaseHolderId = this.getLeaseHolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseHolderId", theLeaseHolderId), currentHashCode, theLeaseHolderId);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockAcquireSleepInterval", theLockAcquireSleepInterval), currentHashCode, theLockAcquireSleepInterval);
        }
        {
            String theLockable;
            theLockable = this.getLockable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockable", theLockable), currentHashCode, theLockable);
        }
        {
            BigInteger theMaxAllowableDiffFromDBTime;
            theMaxAllowableDiffFromDBTime = this.getMaxAllowableDiffFromDBTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAllowableDiffFromDBTime", theMaxAllowableDiffFromDBTime), currentHashCode, theMaxAllowableDiffFromDBTime);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger theQueryTimeout;
            theQueryTimeout = this.getQueryTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryTimeout", theQueryTimeout), currentHashCode, theQueryTimeout);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statements", theStatements), currentHashCode, theStatements);
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
        if (!(object instanceof DtoLeaseDatabaseLocker)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoLeaseDatabaseLocker that = ((DtoLeaseDatabaseLocker) object);
        {
            List<Object> lhsDataSourceOrLockableOrStatements;
            lhsDataSourceOrLockableOrStatements = (((this.dataSourceOrLockableOrStatements!= null)&&(!this.dataSourceOrLockableOrStatements.isEmpty()))?this.getDataSourceOrLockableOrStatements():null);
            List<Object> rhsDataSourceOrLockableOrStatements;
            rhsDataSourceOrLockableOrStatements = (((that.dataSourceOrLockableOrStatements!= null)&&(!that.dataSourceOrLockableOrStatements.isEmpty()))?that.getDataSourceOrLockableOrStatements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSourceOrLockableOrStatements", lhsDataSourceOrLockableOrStatements), LocatorUtils.property(thatLocator, "dataSourceOrLockableOrStatements", rhsDataSourceOrLockableOrStatements), lhsDataSourceOrLockableOrStatements, rhsDataSourceOrLockableOrStatements)) {
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
            String lhsDataSource;
            lhsDataSource = this.getDataSource();
            String rhsDataSource;
            rhsDataSource = that.getDataSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSource", lhsDataSource), LocatorUtils.property(thatLocator, "dataSource", rhsDataSource), lhsDataSource, rhsDataSource)) {
                return false;
            }
        }
        {
            Boolean lhsFailIfLocked;
            lhsFailIfLocked = this.isFailIfLocked();
            Boolean rhsFailIfLocked;
            rhsFailIfLocked = that.isFailIfLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failIfLocked", lhsFailIfLocked), LocatorUtils.property(thatLocator, "failIfLocked", rhsFailIfLocked), lhsFailIfLocked, rhsFailIfLocked)) {
                return false;
            }
        }
        {
            Boolean lhsHandleStartException;
            lhsHandleStartException = this.isHandleStartException();
            Boolean rhsHandleStartException;
            rhsHandleStartException = that.isHandleStartException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handleStartException", lhsHandleStartException), LocatorUtils.property(thatLocator, "handleStartException", rhsHandleStartException), lhsHandleStartException, rhsHandleStartException)) {
                return false;
            }
        }
        {
            String lhsLeaseHolderId;
            lhsLeaseHolderId = this.getLeaseHolderId();
            String rhsLeaseHolderId;
            rhsLeaseHolderId = that.getLeaseHolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseHolderId", lhsLeaseHolderId), LocatorUtils.property(thatLocator, "leaseHolderId", rhsLeaseHolderId), lhsLeaseHolderId, rhsLeaseHolderId)) {
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
            String lhsLockable;
            lhsLockable = this.getLockable();
            String rhsLockable;
            rhsLockable = that.getLockable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockable", lhsLockable), LocatorUtils.property(thatLocator, "lockable", rhsLockable), lhsLockable, rhsLockable)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxAllowableDiffFromDBTime;
            lhsMaxAllowableDiffFromDBTime = this.getMaxAllowableDiffFromDBTime();
            BigInteger rhsMaxAllowableDiffFromDBTime;
            rhsMaxAllowableDiffFromDBTime = that.getMaxAllowableDiffFromDBTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAllowableDiffFromDBTime", lhsMaxAllowableDiffFromDBTime), LocatorUtils.property(thatLocator, "maxAllowableDiffFromDBTime", rhsMaxAllowableDiffFromDBTime), lhsMaxAllowableDiffFromDBTime, rhsMaxAllowableDiffFromDBTime)) {
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
            BigInteger lhsQueryTimeout;
            lhsQueryTimeout = this.getQueryTimeout();
            BigInteger rhsQueryTimeout;
            rhsQueryTimeout = that.getQueryTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryTimeout", lhsQueryTimeout), LocatorUtils.property(thatLocator, "queryTimeout", rhsQueryTimeout), lhsQueryTimeout, rhsQueryTimeout)) {
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
            if (!(object instanceof DtoLeaseDatabaseLocker.DataSource)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLeaseDatabaseLocker.DataSource that = ((DtoLeaseDatabaseLocker.DataSource) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
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
        "jdbcPersistenceAdapter",
        "journalPersistenceAdapterFactory",
        "journaledJDBC",
        "kahaDB",
        "mKahaDB",
        "any"
    })
    public static class Lockable
        implements Equals, HashCode, ToString
    {

        protected DtoJdbcPersistenceAdapter jdbcPersistenceAdapter;
        protected DtoJournalPersistenceAdapterFactory journalPersistenceAdapterFactory;
        protected DtoJournaledJDBC journaledJDBC;
        protected DtoKahaDB kahaDB;
        protected DtoMKahaDB mKahaDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡjdbcPersistenceAdapter���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJdbcPersistenceAdapter }
         *     
         */
        public DtoJdbcPersistenceAdapter getJdbcPersistenceAdapter() {
            return jdbcPersistenceAdapter;
        }

        /**
         * ����jdbcPersistenceAdapter���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJdbcPersistenceAdapter }
         *     
         */
        public void setJdbcPersistenceAdapter(DtoJdbcPersistenceAdapter value) {
            this.jdbcPersistenceAdapter = value;
        }

        /**
         * ��ȡjournalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public DtoJournalPersistenceAdapterFactory getJournalPersistenceAdapterFactory() {
            return journalPersistenceAdapterFactory;
        }

        /**
         * ����journalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public void setJournalPersistenceAdapterFactory(DtoJournalPersistenceAdapterFactory value) {
            this.journalPersistenceAdapterFactory = value;
        }

        /**
         * ��ȡjournaledJDBC���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public DtoJournaledJDBC getJournaledJDBC() {
            return journaledJDBC;
        }

        /**
         * ����journaledJDBC���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public void setJournaledJDBC(DtoJournaledJDBC value) {
            this.journaledJDBC = value;
        }

        /**
         * ��ȡkahaDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoKahaDB }
         *     
         */
        public DtoKahaDB getKahaDB() {
            return kahaDB;
        }

        /**
         * ����kahaDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoKahaDB }
         *     
         */
        public void setKahaDB(DtoKahaDB value) {
            this.kahaDB = value;
        }

        /**
         * ��ȡmKahaDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoMKahaDB }
         *     
         */
        public DtoMKahaDB getMKahaDB() {
            return mKahaDB;
        }

        /**
         * ����mKahaDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMKahaDB }
         *     
         */
        public void setMKahaDB(DtoMKahaDB value) {
            this.mKahaDB = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
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
         * ����any���Ե�ֵ��
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
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                strategy.appendField(locator, this, "jdbcPersistenceAdapter", buffer, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                strategy.appendField(locator, this, "journalPersistenceAdapterFactory", buffer, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                strategy.appendField(locator, this, "journaledJDBC", buffer, theJournaledJDBC);
            }
            {
                DtoKahaDB theKahaDB;
                theKahaDB = this.getKahaDB();
                strategy.appendField(locator, this, "kahaDB", buffer, theKahaDB);
            }
            {
                DtoMKahaDB theMKahaDB;
                theMKahaDB = this.getMKahaDB();
                strategy.appendField(locator, this, "mKahaDB", buffer, theMKahaDB);
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
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jdbcPersistenceAdapter", theJdbcPersistenceAdapter), currentHashCode, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapterFactory", theJournalPersistenceAdapterFactory), currentHashCode, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journaledJDBC", theJournaledJDBC), currentHashCode, theJournaledJDBC);
            }
            {
                DtoKahaDB theKahaDB;
                theKahaDB = this.getKahaDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kahaDB", theKahaDB), currentHashCode, theKahaDB);
            }
            {
                DtoMKahaDB theMKahaDB;
                theMKahaDB = this.getMKahaDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mKahaDB", theMKahaDB), currentHashCode, theMKahaDB);
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
            if (!(object instanceof DtoLeaseDatabaseLocker.Lockable)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLeaseDatabaseLocker.Lockable that = ((DtoLeaseDatabaseLocker.Lockable) object);
            {
                DtoJdbcPersistenceAdapter lhsJdbcPersistenceAdapter;
                lhsJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                DtoJdbcPersistenceAdapter rhsJdbcPersistenceAdapter;
                rhsJdbcPersistenceAdapter = that.getJdbcPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jdbcPersistenceAdapter", lhsJdbcPersistenceAdapter), LocatorUtils.property(thatLocator, "jdbcPersistenceAdapter", rhsJdbcPersistenceAdapter), lhsJdbcPersistenceAdapter, rhsJdbcPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoJournalPersistenceAdapterFactory lhsJournalPersistenceAdapterFactory;
                lhsJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                DtoJournalPersistenceAdapterFactory rhsJournalPersistenceAdapterFactory;
                rhsJournalPersistenceAdapterFactory = that.getJournalPersistenceAdapterFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapterFactory", lhsJournalPersistenceAdapterFactory), LocatorUtils.property(thatLocator, "journalPersistenceAdapterFactory", rhsJournalPersistenceAdapterFactory), lhsJournalPersistenceAdapterFactory, rhsJournalPersistenceAdapterFactory)) {
                    return false;
                }
            }
            {
                DtoJournaledJDBC lhsJournaledJDBC;
                lhsJournaledJDBC = this.getJournaledJDBC();
                DtoJournaledJDBC rhsJournaledJDBC;
                rhsJournaledJDBC = that.getJournaledJDBC();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journaledJDBC", lhsJournaledJDBC), LocatorUtils.property(thatLocator, "journaledJDBC", rhsJournaledJDBC), lhsJournaledJDBC, rhsJournaledJDBC)) {
                    return false;
                }
            }
            {
                DtoKahaDB lhsKahaDB;
                lhsKahaDB = this.getKahaDB();
                DtoKahaDB rhsKahaDB;
                rhsKahaDB = that.getKahaDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kahaDB", lhsKahaDB), LocatorUtils.property(thatLocator, "kahaDB", rhsKahaDB), lhsKahaDB, rhsKahaDB)) {
                    return false;
                }
            }
            {
                DtoMKahaDB lhsMKahaDB;
                lhsMKahaDB = this.getMKahaDB();
                DtoMKahaDB rhsMKahaDB;
                rhsMKahaDB = that.getMKahaDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mKahaDB", lhsMKahaDB), LocatorUtils.property(thatLocator, "mKahaDB", rhsMKahaDB), lhsMKahaDB, rhsMKahaDB)) {
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡstatements���Ե�ֵ��
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
         * ����statements���Ե�ֵ��
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
         * ��ȡany���Ե�ֵ��
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
         * ����any���Ե�ֵ��
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
            if (!(object instanceof DtoLeaseDatabaseLocker.Statements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLeaseDatabaseLocker.Statements that = ((DtoLeaseDatabaseLocker.Statements) object);
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

}