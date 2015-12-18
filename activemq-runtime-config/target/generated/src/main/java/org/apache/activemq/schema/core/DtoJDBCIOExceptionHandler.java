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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignoreAllErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreNoSpaceErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreSQLExceptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="noSpaceMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resumeCheckSleepPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sqlExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stopStartConnectors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrAny"
})
@XmlRootElement(name = "jDBCIOExceptionHandler")
public class DtoJDBCIOExceptionHandler
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrAny;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "ignoreAllErrors")
    protected Boolean ignoreAllErrors;
    @XmlAttribute(name = "ignoreNoSpaceErrors")
    protected Boolean ignoreNoSpaceErrors;
    @XmlAttribute(name = "ignoreSQLExceptions")
    protected Boolean ignoreSQLExceptions;
    @XmlAttribute(name = "noSpaceMessage")
    protected String noSpaceMessage;
    @XmlAttribute(name = "resumeCheckSleepPeriod")
    protected Long resumeCheckSleepPeriod;
    @XmlAttribute(name = "sqlExceptionMessage")
    protected String sqlExceptionMessage;
    @XmlAttribute(name = "stopStartConnectors")
    protected Boolean stopStartConnectors;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoJDBCIOExceptionHandler.BrokerService }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBrokerServiceOrAny() {
        if (brokerServiceOrAny == null) {
            brokerServiceOrAny = new ArrayList<Object>();
        }
        return this.brokerServiceOrAny;
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
     * 获取ignoreAllErrors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAllErrors() {
        return ignoreAllErrors;
    }

    /**
     * 设置ignoreAllErrors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAllErrors(Boolean value) {
        this.ignoreAllErrors = value;
    }

    /**
     * 获取ignoreNoSpaceErrors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNoSpaceErrors() {
        return ignoreNoSpaceErrors;
    }

    /**
     * 设置ignoreNoSpaceErrors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNoSpaceErrors(Boolean value) {
        this.ignoreNoSpaceErrors = value;
    }

    /**
     * 获取ignoreSQLExceptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreSQLExceptions() {
        return ignoreSQLExceptions;
    }

    /**
     * 设置ignoreSQLExceptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreSQLExceptions(Boolean value) {
        this.ignoreSQLExceptions = value;
    }

    /**
     * 获取noSpaceMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSpaceMessage() {
        return noSpaceMessage;
    }

    /**
     * 设置noSpaceMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSpaceMessage(String value) {
        this.noSpaceMessage = value;
    }

    /**
     * 获取resumeCheckSleepPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResumeCheckSleepPeriod() {
        return resumeCheckSleepPeriod;
    }

    /**
     * 设置resumeCheckSleepPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResumeCheckSleepPeriod(Long value) {
        this.resumeCheckSleepPeriod = value;
    }

    /**
     * 获取sqlExceptionMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlExceptionMessage() {
        return sqlExceptionMessage;
    }

    /**
     * 设置sqlExceptionMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlExceptionMessage(String value) {
        this.sqlExceptionMessage = value;
    }

    /**
     * 获取stopStartConnectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopStartConnectors() {
        return stopStartConnectors;
    }

    /**
     * 设置stopStartConnectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopStartConnectors(Boolean value) {
        this.stopStartConnectors = value;
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
            List<Object> theBrokerServiceOrAny;
            theBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            strategy.appendField(locator, this, "brokerServiceOrAny", buffer, theBrokerServiceOrAny);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            Boolean theIgnoreAllErrors;
            theIgnoreAllErrors = this.isIgnoreAllErrors();
            strategy.appendField(locator, this, "ignoreAllErrors", buffer, theIgnoreAllErrors);
        }
        {
            Boolean theIgnoreNoSpaceErrors;
            theIgnoreNoSpaceErrors = this.isIgnoreNoSpaceErrors();
            strategy.appendField(locator, this, "ignoreNoSpaceErrors", buffer, theIgnoreNoSpaceErrors);
        }
        {
            Boolean theIgnoreSQLExceptions;
            theIgnoreSQLExceptions = this.isIgnoreSQLExceptions();
            strategy.appendField(locator, this, "ignoreSQLExceptions", buffer, theIgnoreSQLExceptions);
        }
        {
            String theNoSpaceMessage;
            theNoSpaceMessage = this.getNoSpaceMessage();
            strategy.appendField(locator, this, "noSpaceMessage", buffer, theNoSpaceMessage);
        }
        {
            Long theResumeCheckSleepPeriod;
            theResumeCheckSleepPeriod = this.getResumeCheckSleepPeriod();
            strategy.appendField(locator, this, "resumeCheckSleepPeriod", buffer, theResumeCheckSleepPeriod);
        }
        {
            String theSqlExceptionMessage;
            theSqlExceptionMessage = this.getSqlExceptionMessage();
            strategy.appendField(locator, this, "sqlExceptionMessage", buffer, theSqlExceptionMessage);
        }
        {
            Boolean theStopStartConnectors;
            theStopStartConnectors = this.isStopStartConnectors();
            strategy.appendField(locator, this, "stopStartConnectors", buffer, theStopStartConnectors);
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
            List<Object> theBrokerServiceOrAny;
            theBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrAny", theBrokerServiceOrAny), currentHashCode, theBrokerServiceOrAny);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            Boolean theIgnoreAllErrors;
            theIgnoreAllErrors = this.isIgnoreAllErrors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreAllErrors", theIgnoreAllErrors), currentHashCode, theIgnoreAllErrors);
        }
        {
            Boolean theIgnoreNoSpaceErrors;
            theIgnoreNoSpaceErrors = this.isIgnoreNoSpaceErrors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreNoSpaceErrors", theIgnoreNoSpaceErrors), currentHashCode, theIgnoreNoSpaceErrors);
        }
        {
            Boolean theIgnoreSQLExceptions;
            theIgnoreSQLExceptions = this.isIgnoreSQLExceptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreSQLExceptions", theIgnoreSQLExceptions), currentHashCode, theIgnoreSQLExceptions);
        }
        {
            String theNoSpaceMessage;
            theNoSpaceMessage = this.getNoSpaceMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noSpaceMessage", theNoSpaceMessage), currentHashCode, theNoSpaceMessage);
        }
        {
            Long theResumeCheckSleepPeriod;
            theResumeCheckSleepPeriod = this.getResumeCheckSleepPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resumeCheckSleepPeriod", theResumeCheckSleepPeriod), currentHashCode, theResumeCheckSleepPeriod);
        }
        {
            String theSqlExceptionMessage;
            theSqlExceptionMessage = this.getSqlExceptionMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sqlExceptionMessage", theSqlExceptionMessage), currentHashCode, theSqlExceptionMessage);
        }
        {
            Boolean theStopStartConnectors;
            theStopStartConnectors = this.isStopStartConnectors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stopStartConnectors", theStopStartConnectors), currentHashCode, theStopStartConnectors);
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
        if (!(object instanceof DtoJDBCIOExceptionHandler)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoJDBCIOExceptionHandler that = ((DtoJDBCIOExceptionHandler) object);
        {
            List<Object> lhsBrokerServiceOrAny;
            lhsBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            List<Object> rhsBrokerServiceOrAny;
            rhsBrokerServiceOrAny = (((that.brokerServiceOrAny!= null)&&(!that.brokerServiceOrAny.isEmpty()))?that.getBrokerServiceOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrAny", lhsBrokerServiceOrAny), LocatorUtils.property(thatLocator, "brokerServiceOrAny", rhsBrokerServiceOrAny), lhsBrokerServiceOrAny, rhsBrokerServiceOrAny)) {
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
            Boolean lhsIgnoreAllErrors;
            lhsIgnoreAllErrors = this.isIgnoreAllErrors();
            Boolean rhsIgnoreAllErrors;
            rhsIgnoreAllErrors = that.isIgnoreAllErrors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreAllErrors", lhsIgnoreAllErrors), LocatorUtils.property(thatLocator, "ignoreAllErrors", rhsIgnoreAllErrors), lhsIgnoreAllErrors, rhsIgnoreAllErrors)) {
                return false;
            }
        }
        {
            Boolean lhsIgnoreNoSpaceErrors;
            lhsIgnoreNoSpaceErrors = this.isIgnoreNoSpaceErrors();
            Boolean rhsIgnoreNoSpaceErrors;
            rhsIgnoreNoSpaceErrors = that.isIgnoreNoSpaceErrors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreNoSpaceErrors", lhsIgnoreNoSpaceErrors), LocatorUtils.property(thatLocator, "ignoreNoSpaceErrors", rhsIgnoreNoSpaceErrors), lhsIgnoreNoSpaceErrors, rhsIgnoreNoSpaceErrors)) {
                return false;
            }
        }
        {
            Boolean lhsIgnoreSQLExceptions;
            lhsIgnoreSQLExceptions = this.isIgnoreSQLExceptions();
            Boolean rhsIgnoreSQLExceptions;
            rhsIgnoreSQLExceptions = that.isIgnoreSQLExceptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreSQLExceptions", lhsIgnoreSQLExceptions), LocatorUtils.property(thatLocator, "ignoreSQLExceptions", rhsIgnoreSQLExceptions), lhsIgnoreSQLExceptions, rhsIgnoreSQLExceptions)) {
                return false;
            }
        }
        {
            String lhsNoSpaceMessage;
            lhsNoSpaceMessage = this.getNoSpaceMessage();
            String rhsNoSpaceMessage;
            rhsNoSpaceMessage = that.getNoSpaceMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noSpaceMessage", lhsNoSpaceMessage), LocatorUtils.property(thatLocator, "noSpaceMessage", rhsNoSpaceMessage), lhsNoSpaceMessage, rhsNoSpaceMessage)) {
                return false;
            }
        }
        {
            Long lhsResumeCheckSleepPeriod;
            lhsResumeCheckSleepPeriod = this.getResumeCheckSleepPeriod();
            Long rhsResumeCheckSleepPeriod;
            rhsResumeCheckSleepPeriod = that.getResumeCheckSleepPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resumeCheckSleepPeriod", lhsResumeCheckSleepPeriod), LocatorUtils.property(thatLocator, "resumeCheckSleepPeriod", rhsResumeCheckSleepPeriod), lhsResumeCheckSleepPeriod, rhsResumeCheckSleepPeriod)) {
                return false;
            }
        }
        {
            String lhsSqlExceptionMessage;
            lhsSqlExceptionMessage = this.getSqlExceptionMessage();
            String rhsSqlExceptionMessage;
            rhsSqlExceptionMessage = that.getSqlExceptionMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sqlExceptionMessage", lhsSqlExceptionMessage), LocatorUtils.property(thatLocator, "sqlExceptionMessage", rhsSqlExceptionMessage), lhsSqlExceptionMessage, rhsSqlExceptionMessage)) {
                return false;
            }
        }
        {
            Boolean lhsStopStartConnectors;
            lhsStopStartConnectors = this.isStopStartConnectors();
            Boolean rhsStopStartConnectors;
            rhsStopStartConnectors = that.isStopStartConnectors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stopStartConnectors", lhsStopStartConnectors), LocatorUtils.property(thatLocator, "stopStartConnectors", rhsStopStartConnectors), lhsStopStartConnectors, rhsStopStartConnectors)) {
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
            if (!(object instanceof DtoJDBCIOExceptionHandler.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJDBCIOExceptionHandler.BrokerService that = ((DtoJDBCIOExceptionHandler.BrokerService) object);
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

}
