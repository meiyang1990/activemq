//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.17 ʱ�� 03:29:05 PM CST 
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
 *           &lt;element name="brokerService" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="abortConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ignoreIdleConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreNetworkConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxSlowCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxSlowDuration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxTimeSinceLastAck" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "abortSlowAckConsumerStrategy")
public class DtoAbortSlowAckConsumerStrategy
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrAny;
    @XmlAttribute(name = "abortConnection")
    protected Boolean abortConnection;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "checkPeriod")
    protected Long checkPeriod;
    @XmlAttribute(name = "ignoreIdleConsumers")
    protected Boolean ignoreIdleConsumers;
    @XmlAttribute(name = "ignoreNetworkConsumers")
    protected Boolean ignoreNetworkConsumers;
    @XmlAttribute(name = "maxSlowCount")
    protected Long maxSlowCount;
    @XmlAttribute(name = "maxSlowDuration")
    protected Long maxSlowDuration;
    @XmlAttribute(name = "maxTimeSinceLastAck")
    protected Long maxTimeSinceLastAck;
    @XmlAttribute(name = "name")
    protected String name;
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
     * {@link JAXBElement }{@code <}{@link DtoAbortSlowAckConsumerStrategy.BrokerService }{@code >}
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
     * ��ȡabortConnection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbortConnection() {
        return abortConnection;
    }

    /**
     * ����abortConnection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbortConnection(Boolean value) {
        this.abortConnection = value;
    }

    /**
     * ��ȡbrokerService���Ե�ֵ��
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
     * ����brokerService���Ե�ֵ��
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
     * ��ȡcheckPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckPeriod() {
        return checkPeriod;
    }

    /**
     * ����checkPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckPeriod(Long value) {
        this.checkPeriod = value;
    }

    /**
     * ��ȡignoreIdleConsumers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreIdleConsumers() {
        return ignoreIdleConsumers;
    }

    /**
     * ����ignoreIdleConsumers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreIdleConsumers(Boolean value) {
        this.ignoreIdleConsumers = value;
    }

    /**
     * ��ȡignoreNetworkConsumers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNetworkConsumers() {
        return ignoreNetworkConsumers;
    }

    /**
     * ����ignoreNetworkConsumers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNetworkConsumers(Boolean value) {
        this.ignoreNetworkConsumers = value;
    }

    /**
     * ��ȡmaxSlowCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSlowCount() {
        return maxSlowCount;
    }

    /**
     * ����maxSlowCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSlowCount(Long value) {
        this.maxSlowCount = value;
    }

    /**
     * ��ȡmaxSlowDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSlowDuration() {
        return maxSlowDuration;
    }

    /**
     * ����maxSlowDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSlowDuration(Long value) {
        this.maxSlowDuration = value;
    }

    /**
     * ��ȡmaxTimeSinceLastAck���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTimeSinceLastAck() {
        return maxTimeSinceLastAck;
    }

    /**
     * ����maxTimeSinceLastAck���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTimeSinceLastAck(Long value) {
        this.maxTimeSinceLastAck = value;
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
            List<Object> theBrokerServiceOrAny;
            theBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            strategy.appendField(locator, this, "brokerServiceOrAny", buffer, theBrokerServiceOrAny);
        }
        {
            Boolean theAbortConnection;
            theAbortConnection = this.isAbortConnection();
            strategy.appendField(locator, this, "abortConnection", buffer, theAbortConnection);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            Long theCheckPeriod;
            theCheckPeriod = this.getCheckPeriod();
            strategy.appendField(locator, this, "checkPeriod", buffer, theCheckPeriod);
        }
        {
            Boolean theIgnoreIdleConsumers;
            theIgnoreIdleConsumers = this.isIgnoreIdleConsumers();
            strategy.appendField(locator, this, "ignoreIdleConsumers", buffer, theIgnoreIdleConsumers);
        }
        {
            Boolean theIgnoreNetworkConsumers;
            theIgnoreNetworkConsumers = this.isIgnoreNetworkConsumers();
            strategy.appendField(locator, this, "ignoreNetworkConsumers", buffer, theIgnoreNetworkConsumers);
        }
        {
            Long theMaxSlowCount;
            theMaxSlowCount = this.getMaxSlowCount();
            strategy.appendField(locator, this, "maxSlowCount", buffer, theMaxSlowCount);
        }
        {
            Long theMaxSlowDuration;
            theMaxSlowDuration = this.getMaxSlowDuration();
            strategy.appendField(locator, this, "maxSlowDuration", buffer, theMaxSlowDuration);
        }
        {
            Long theMaxTimeSinceLastAck;
            theMaxTimeSinceLastAck = this.getMaxTimeSinceLastAck();
            strategy.appendField(locator, this, "maxTimeSinceLastAck", buffer, theMaxTimeSinceLastAck);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
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
            Boolean theAbortConnection;
            theAbortConnection = this.isAbortConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abortConnection", theAbortConnection), currentHashCode, theAbortConnection);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            Long theCheckPeriod;
            theCheckPeriod = this.getCheckPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkPeriod", theCheckPeriod), currentHashCode, theCheckPeriod);
        }
        {
            Boolean theIgnoreIdleConsumers;
            theIgnoreIdleConsumers = this.isIgnoreIdleConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreIdleConsumers", theIgnoreIdleConsumers), currentHashCode, theIgnoreIdleConsumers);
        }
        {
            Boolean theIgnoreNetworkConsumers;
            theIgnoreNetworkConsumers = this.isIgnoreNetworkConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ignoreNetworkConsumers", theIgnoreNetworkConsumers), currentHashCode, theIgnoreNetworkConsumers);
        }
        {
            Long theMaxSlowCount;
            theMaxSlowCount = this.getMaxSlowCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxSlowCount", theMaxSlowCount), currentHashCode, theMaxSlowCount);
        }
        {
            Long theMaxSlowDuration;
            theMaxSlowDuration = this.getMaxSlowDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxSlowDuration", theMaxSlowDuration), currentHashCode, theMaxSlowDuration);
        }
        {
            Long theMaxTimeSinceLastAck;
            theMaxTimeSinceLastAck = this.getMaxTimeSinceLastAck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxTimeSinceLastAck", theMaxTimeSinceLastAck), currentHashCode, theMaxTimeSinceLastAck);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        if (!(object instanceof DtoAbortSlowAckConsumerStrategy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoAbortSlowAckConsumerStrategy that = ((DtoAbortSlowAckConsumerStrategy) object);
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
            Boolean lhsAbortConnection;
            lhsAbortConnection = this.isAbortConnection();
            Boolean rhsAbortConnection;
            rhsAbortConnection = that.isAbortConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abortConnection", lhsAbortConnection), LocatorUtils.property(thatLocator, "abortConnection", rhsAbortConnection), lhsAbortConnection, rhsAbortConnection)) {
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
            Long lhsCheckPeriod;
            lhsCheckPeriod = this.getCheckPeriod();
            Long rhsCheckPeriod;
            rhsCheckPeriod = that.getCheckPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkPeriod", lhsCheckPeriod), LocatorUtils.property(thatLocator, "checkPeriod", rhsCheckPeriod), lhsCheckPeriod, rhsCheckPeriod)) {
                return false;
            }
        }
        {
            Boolean lhsIgnoreIdleConsumers;
            lhsIgnoreIdleConsumers = this.isIgnoreIdleConsumers();
            Boolean rhsIgnoreIdleConsumers;
            rhsIgnoreIdleConsumers = that.isIgnoreIdleConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreIdleConsumers", lhsIgnoreIdleConsumers), LocatorUtils.property(thatLocator, "ignoreIdleConsumers", rhsIgnoreIdleConsumers), lhsIgnoreIdleConsumers, rhsIgnoreIdleConsumers)) {
                return false;
            }
        }
        {
            Boolean lhsIgnoreNetworkConsumers;
            lhsIgnoreNetworkConsumers = this.isIgnoreNetworkConsumers();
            Boolean rhsIgnoreNetworkConsumers;
            rhsIgnoreNetworkConsumers = that.isIgnoreNetworkConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ignoreNetworkConsumers", lhsIgnoreNetworkConsumers), LocatorUtils.property(thatLocator, "ignoreNetworkConsumers", rhsIgnoreNetworkConsumers), lhsIgnoreNetworkConsumers, rhsIgnoreNetworkConsumers)) {
                return false;
            }
        }
        {
            Long lhsMaxSlowCount;
            lhsMaxSlowCount = this.getMaxSlowCount();
            Long rhsMaxSlowCount;
            rhsMaxSlowCount = that.getMaxSlowCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxSlowCount", lhsMaxSlowCount), LocatorUtils.property(thatLocator, "maxSlowCount", rhsMaxSlowCount), lhsMaxSlowCount, rhsMaxSlowCount)) {
                return false;
            }
        }
        {
            Long lhsMaxSlowDuration;
            lhsMaxSlowDuration = this.getMaxSlowDuration();
            Long rhsMaxSlowDuration;
            rhsMaxSlowDuration = that.getMaxSlowDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxSlowDuration", lhsMaxSlowDuration), LocatorUtils.property(thatLocator, "maxSlowDuration", rhsMaxSlowDuration), lhsMaxSlowDuration, rhsMaxSlowDuration)) {
                return false;
            }
        }
        {
            Long lhsMaxTimeSinceLastAck;
            lhsMaxTimeSinceLastAck = this.getMaxTimeSinceLastAck();
            Long rhsMaxTimeSinceLastAck;
            rhsMaxTimeSinceLastAck = that.getMaxTimeSinceLastAck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxTimeSinceLastAck", lhsMaxTimeSinceLastAck), LocatorUtils.property(thatLocator, "maxTimeSinceLastAck", rhsMaxTimeSinceLastAck), lhsMaxTimeSinceLastAck, rhsMaxTimeSinceLastAck)) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
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
        "destinationPathSeparatorPlugin",
        "destinationsPlugin",
        "forcePersistencyModeBroker",
        "loggingBrokerPlugin",
        "multicastTraceBrokerPlugin",
        "redeliveryPlugin",
        "timeStampingBrokerPlugin",
        "traceBrokerPathPlugin",
        "udpTraceBrokerPlugin",
        "any"
    })
    public static class BrokerService
        implements Equals, HashCode, ToString
    {

        protected DtoDestinationPathSeparatorPlugin destinationPathSeparatorPlugin;
        protected DtoDestinationsPlugin destinationsPlugin;
        protected DtoForcePersistencyModeBroker forcePersistencyModeBroker;
        protected DtoLoggingBrokerPlugin loggingBrokerPlugin;
        protected DtoMulticastTraceBrokerPlugin multicastTraceBrokerPlugin;
        protected DtoRedeliveryPlugin redeliveryPlugin;
        protected DtoTimeStampingBrokerPlugin timeStampingBrokerPlugin;
        protected DtoTraceBrokerPathPlugin traceBrokerPathPlugin;
        protected DtoUdpTraceBrokerPlugin udpTraceBrokerPlugin;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡdestinationPathSeparatorPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public DtoDestinationPathSeparatorPlugin getDestinationPathSeparatorPlugin() {
            return destinationPathSeparatorPlugin;
        }

        /**
         * ����destinationPathSeparatorPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public void setDestinationPathSeparatorPlugin(DtoDestinationPathSeparatorPlugin value) {
            this.destinationPathSeparatorPlugin = value;
        }

        /**
         * ��ȡdestinationsPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public DtoDestinationsPlugin getDestinationsPlugin() {
            return destinationsPlugin;
        }

        /**
         * ����destinationsPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public void setDestinationsPlugin(DtoDestinationsPlugin value) {
            this.destinationsPlugin = value;
        }

        /**
         * ��ȡforcePersistencyModeBroker���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public DtoForcePersistencyModeBroker getForcePersistencyModeBroker() {
            return forcePersistencyModeBroker;
        }

        /**
         * ����forcePersistencyModeBroker���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public void setForcePersistencyModeBroker(DtoForcePersistencyModeBroker value) {
            this.forcePersistencyModeBroker = value;
        }

        /**
         * ��ȡloggingBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public DtoLoggingBrokerPlugin getLoggingBrokerPlugin() {
            return loggingBrokerPlugin;
        }

        /**
         * ����loggingBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public void setLoggingBrokerPlugin(DtoLoggingBrokerPlugin value) {
            this.loggingBrokerPlugin = value;
        }

        /**
         * ��ȡmulticastTraceBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public DtoMulticastTraceBrokerPlugin getMulticastTraceBrokerPlugin() {
            return multicastTraceBrokerPlugin;
        }

        /**
         * ����multicastTraceBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public void setMulticastTraceBrokerPlugin(DtoMulticastTraceBrokerPlugin value) {
            this.multicastTraceBrokerPlugin = value;
        }

        /**
         * ��ȡredeliveryPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public DtoRedeliveryPlugin getRedeliveryPlugin() {
            return redeliveryPlugin;
        }

        /**
         * ����redeliveryPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public void setRedeliveryPlugin(DtoRedeliveryPlugin value) {
            this.redeliveryPlugin = value;
        }

        /**
         * ��ȡtimeStampingBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public DtoTimeStampingBrokerPlugin getTimeStampingBrokerPlugin() {
            return timeStampingBrokerPlugin;
        }

        /**
         * ����timeStampingBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public void setTimeStampingBrokerPlugin(DtoTimeStampingBrokerPlugin value) {
            this.timeStampingBrokerPlugin = value;
        }

        /**
         * ��ȡtraceBrokerPathPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public DtoTraceBrokerPathPlugin getTraceBrokerPathPlugin() {
            return traceBrokerPathPlugin;
        }

        /**
         * ����traceBrokerPathPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public void setTraceBrokerPathPlugin(DtoTraceBrokerPathPlugin value) {
            this.traceBrokerPathPlugin = value;
        }

        /**
         * ��ȡudpTraceBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public DtoUdpTraceBrokerPlugin getUdpTraceBrokerPlugin() {
            return udpTraceBrokerPlugin;
        }

        /**
         * ����udpTraceBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public void setUdpTraceBrokerPlugin(DtoUdpTraceBrokerPlugin value) {
            this.udpTraceBrokerPlugin = value;
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
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                strategy.appendField(locator, this, "destinationPathSeparatorPlugin", buffer, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                strategy.appendField(locator, this, "destinationsPlugin", buffer, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                strategy.appendField(locator, this, "forcePersistencyModeBroker", buffer, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                strategy.appendField(locator, this, "loggingBrokerPlugin", buffer, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                strategy.appendField(locator, this, "multicastTraceBrokerPlugin", buffer, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                strategy.appendField(locator, this, "redeliveryPlugin", buffer, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                strategy.appendField(locator, this, "timeStampingBrokerPlugin", buffer, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                strategy.appendField(locator, this, "traceBrokerPathPlugin", buffer, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                strategy.appendField(locator, this, "udpTraceBrokerPlugin", buffer, theUdpTraceBrokerPlugin);
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
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationPathSeparatorPlugin", theDestinationPathSeparatorPlugin), currentHashCode, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationsPlugin", theDestinationsPlugin), currentHashCode, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forcePersistencyModeBroker", theForcePersistencyModeBroker), currentHashCode, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loggingBrokerPlugin", theLoggingBrokerPlugin), currentHashCode, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multicastTraceBrokerPlugin", theMulticastTraceBrokerPlugin), currentHashCode, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPlugin", theRedeliveryPlugin), currentHashCode, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStampingBrokerPlugin", theTimeStampingBrokerPlugin), currentHashCode, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceBrokerPathPlugin", theTraceBrokerPathPlugin), currentHashCode, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "udpTraceBrokerPlugin", theUdpTraceBrokerPlugin), currentHashCode, theUdpTraceBrokerPlugin);
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
            if (!(object instanceof DtoAbortSlowAckConsumerStrategy.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoAbortSlowAckConsumerStrategy.BrokerService that = ((DtoAbortSlowAckConsumerStrategy.BrokerService) object);
            {
                DtoDestinationPathSeparatorPlugin lhsDestinationPathSeparatorPlugin;
                lhsDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                DtoDestinationPathSeparatorPlugin rhsDestinationPathSeparatorPlugin;
                rhsDestinationPathSeparatorPlugin = that.getDestinationPathSeparatorPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationPathSeparatorPlugin", lhsDestinationPathSeparatorPlugin), LocatorUtils.property(thatLocator, "destinationPathSeparatorPlugin", rhsDestinationPathSeparatorPlugin), lhsDestinationPathSeparatorPlugin, rhsDestinationPathSeparatorPlugin)) {
                    return false;
                }
            }
            {
                DtoDestinationsPlugin lhsDestinationsPlugin;
                lhsDestinationsPlugin = this.getDestinationsPlugin();
                DtoDestinationsPlugin rhsDestinationsPlugin;
                rhsDestinationsPlugin = that.getDestinationsPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationsPlugin", lhsDestinationsPlugin), LocatorUtils.property(thatLocator, "destinationsPlugin", rhsDestinationsPlugin), lhsDestinationsPlugin, rhsDestinationsPlugin)) {
                    return false;
                }
            }
            {
                DtoForcePersistencyModeBroker lhsForcePersistencyModeBroker;
                lhsForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                DtoForcePersistencyModeBroker rhsForcePersistencyModeBroker;
                rhsForcePersistencyModeBroker = that.getForcePersistencyModeBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "forcePersistencyModeBroker", lhsForcePersistencyModeBroker), LocatorUtils.property(thatLocator, "forcePersistencyModeBroker", rhsForcePersistencyModeBroker), lhsForcePersistencyModeBroker, rhsForcePersistencyModeBroker)) {
                    return false;
                }
            }
            {
                DtoLoggingBrokerPlugin lhsLoggingBrokerPlugin;
                lhsLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                DtoLoggingBrokerPlugin rhsLoggingBrokerPlugin;
                rhsLoggingBrokerPlugin = that.getLoggingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loggingBrokerPlugin", lhsLoggingBrokerPlugin), LocatorUtils.property(thatLocator, "loggingBrokerPlugin", rhsLoggingBrokerPlugin), lhsLoggingBrokerPlugin, rhsLoggingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoMulticastTraceBrokerPlugin lhsMulticastTraceBrokerPlugin;
                lhsMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                DtoMulticastTraceBrokerPlugin rhsMulticastTraceBrokerPlugin;
                rhsMulticastTraceBrokerPlugin = that.getMulticastTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multicastTraceBrokerPlugin", lhsMulticastTraceBrokerPlugin), LocatorUtils.property(thatLocator, "multicastTraceBrokerPlugin", rhsMulticastTraceBrokerPlugin), lhsMulticastTraceBrokerPlugin, rhsMulticastTraceBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPlugin lhsRedeliveryPlugin;
                lhsRedeliveryPlugin = this.getRedeliveryPlugin();
                DtoRedeliveryPlugin rhsRedeliveryPlugin;
                rhsRedeliveryPlugin = that.getRedeliveryPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPlugin", lhsRedeliveryPlugin), LocatorUtils.property(thatLocator, "redeliveryPlugin", rhsRedeliveryPlugin), lhsRedeliveryPlugin, rhsRedeliveryPlugin)) {
                    return false;
                }
            }
            {
                DtoTimeStampingBrokerPlugin lhsTimeStampingBrokerPlugin;
                lhsTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                DtoTimeStampingBrokerPlugin rhsTimeStampingBrokerPlugin;
                rhsTimeStampingBrokerPlugin = that.getTimeStampingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStampingBrokerPlugin", lhsTimeStampingBrokerPlugin), LocatorUtils.property(thatLocator, "timeStampingBrokerPlugin", rhsTimeStampingBrokerPlugin), lhsTimeStampingBrokerPlugin, rhsTimeStampingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoTraceBrokerPathPlugin lhsTraceBrokerPathPlugin;
                lhsTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                DtoTraceBrokerPathPlugin rhsTraceBrokerPathPlugin;
                rhsTraceBrokerPathPlugin = that.getTraceBrokerPathPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "traceBrokerPathPlugin", lhsTraceBrokerPathPlugin), LocatorUtils.property(thatLocator, "traceBrokerPathPlugin", rhsTraceBrokerPathPlugin), lhsTraceBrokerPathPlugin, rhsTraceBrokerPathPlugin)) {
                    return false;
                }
            }
            {
                DtoUdpTraceBrokerPlugin lhsUdpTraceBrokerPlugin;
                lhsUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                DtoUdpTraceBrokerPlugin rhsUdpTraceBrokerPlugin;
                rhsUdpTraceBrokerPlugin = that.getUdpTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "udpTraceBrokerPlugin", lhsUdpTraceBrokerPlugin), LocatorUtils.property(thatLocator, "udpTraceBrokerPlugin", rhsUdpTraceBrokerPlugin), lhsUdpTraceBrokerPlugin, rhsUdpTraceBrokerPlugin)) {
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