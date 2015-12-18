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
 *           &lt;element name="deadLetterQueue" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="deadLetterQueue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="processExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="processNonPersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "deadLetterQueueOrAny"
})
@XmlRootElement(name = "discarding")
public class DtoDiscarding
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "deadLetterQueue", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> deadLetterQueueOrAny;
    @XmlAttribute(name = "deadLetterQueue")
    protected String deadLetterQueue;
    @XmlAttribute(name = "enableAudit")
    protected Boolean enableAudit;
    @XmlAttribute(name = "processExpired")
    protected Boolean processExpired;
    @XmlAttribute(name = "processNonPersistent")
    protected Boolean processNonPersistent;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the deadLetterQueueOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadLetterQueueOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadLetterQueueOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoDiscarding.DeadLetterQueue }{@code >}
     * 
     * 
     */
    public List<Object> getDeadLetterQueueOrAny() {
        if (deadLetterQueueOrAny == null) {
            deadLetterQueueOrAny = new ArrayList<Object>();
        }
        return this.deadLetterQueueOrAny;
    }

    /**
     * ��ȡdeadLetterQueue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadLetterQueue() {
        return deadLetterQueue;
    }

    /**
     * ����deadLetterQueue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadLetterQueue(String value) {
        this.deadLetterQueue = value;
    }

    /**
     * ��ȡenableAudit���Ե�ֵ��
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
     * ����enableAudit���Ե�ֵ��
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
     * ��ȡprocessExpired���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessExpired() {
        return processExpired;
    }

    /**
     * ����processExpired���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessExpired(Boolean value) {
        this.processExpired = value;
    }

    /**
     * ��ȡprocessNonPersistent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessNonPersistent() {
        return processNonPersistent;
    }

    /**
     * ����processNonPersistent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessNonPersistent(Boolean value) {
        this.processNonPersistent = value;
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
            List<Object> theDeadLetterQueueOrAny;
            theDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            strategy.appendField(locator, this, "deadLetterQueueOrAny", buffer, theDeadLetterQueueOrAny);
        }
        {
            String theDeadLetterQueue;
            theDeadLetterQueue = this.getDeadLetterQueue();
            strategy.appendField(locator, this, "deadLetterQueue", buffer, theDeadLetterQueue);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            strategy.appendField(locator, this, "enableAudit", buffer, theEnableAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            strategy.appendField(locator, this, "processExpired", buffer, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            strategy.appendField(locator, this, "processNonPersistent", buffer, theProcessNonPersistent);
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
            List<Object> theDeadLetterQueueOrAny;
            theDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterQueueOrAny", theDeadLetterQueueOrAny), currentHashCode, theDeadLetterQueueOrAny);
        }
        {
            String theDeadLetterQueue;
            theDeadLetterQueue = this.getDeadLetterQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterQueue", theDeadLetterQueue), currentHashCode, theDeadLetterQueue);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableAudit", theEnableAudit), currentHashCode, theEnableAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processExpired", theProcessExpired), currentHashCode, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processNonPersistent", theProcessNonPersistent), currentHashCode, theProcessNonPersistent);
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
        if (!(object instanceof DtoDiscarding)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoDiscarding that = ((DtoDiscarding) object);
        {
            List<Object> lhsDeadLetterQueueOrAny;
            lhsDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            List<Object> rhsDeadLetterQueueOrAny;
            rhsDeadLetterQueueOrAny = (((that.deadLetterQueueOrAny!= null)&&(!that.deadLetterQueueOrAny.isEmpty()))?that.getDeadLetterQueueOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterQueueOrAny", lhsDeadLetterQueueOrAny), LocatorUtils.property(thatLocator, "deadLetterQueueOrAny", rhsDeadLetterQueueOrAny), lhsDeadLetterQueueOrAny, rhsDeadLetterQueueOrAny)) {
                return false;
            }
        }
        {
            String lhsDeadLetterQueue;
            lhsDeadLetterQueue = this.getDeadLetterQueue();
            String rhsDeadLetterQueue;
            rhsDeadLetterQueue = that.getDeadLetterQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterQueue", lhsDeadLetterQueue), LocatorUtils.property(thatLocator, "deadLetterQueue", rhsDeadLetterQueue), lhsDeadLetterQueue, rhsDeadLetterQueue)) {
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
            Boolean lhsProcessExpired;
            lhsProcessExpired = this.isProcessExpired();
            Boolean rhsProcessExpired;
            rhsProcessExpired = that.isProcessExpired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processExpired", lhsProcessExpired), LocatorUtils.property(thatLocator, "processExpired", rhsProcessExpired), lhsProcessExpired, rhsProcessExpired)) {
                return false;
            }
        }
        {
            Boolean lhsProcessNonPersistent;
            lhsProcessNonPersistent = this.isProcessNonPersistent();
            Boolean rhsProcessNonPersistent;
            rhsProcessNonPersistent = that.isProcessNonPersistent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processNonPersistent", lhsProcessNonPersistent), LocatorUtils.property(thatLocator, "processNonPersistent", rhsProcessNonPersistent), lhsProcessNonPersistent, rhsProcessNonPersistent)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
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
        "queue",
        "tempQueue",
        "tempTopic",
        "topic",
        "any"
    })
    public static class DeadLetterQueue
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
        protected DtoTempQueue tempQueue;
        protected DtoTempTopic tempTopic;
        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡqueue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoQueue }
         *     
         */
        public DtoQueue getQueue() {
            return queue;
        }

        /**
         * ����queue���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoQueue }
         *     
         */
        public void setQueue(DtoQueue value) {
            this.queue = value;
        }

        /**
         * ��ȡtempQueue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTempQueue }
         *     
         */
        public DtoTempQueue getTempQueue() {
            return tempQueue;
        }

        /**
         * ����tempQueue���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempQueue }
         *     
         */
        public void setTempQueue(DtoTempQueue value) {
            this.tempQueue = value;
        }

        /**
         * ��ȡtempTopic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTempTopic }
         *     
         */
        public DtoTempTopic getTempTopic() {
            return tempTopic;
        }

        /**
         * ����tempTopic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempTopic }
         *     
         */
        public void setTempTopic(DtoTempTopic value) {
            this.tempTopic = value;
        }

        /**
         * ��ȡtopic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTopic }
         *     
         */
        public DtoTopic getTopic() {
            return topic;
        }

        /**
         * ����topic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTopic }
         *     
         */
        public void setTopic(DtoTopic value) {
            this.topic = value;
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
                DtoQueue theQueue;
                theQueue = this.getQueue();
                strategy.appendField(locator, this, "queue", buffer, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
            }
            {
                DtoTopic theTopic;
                theTopic = this.getTopic();
                strategy.appendField(locator, this, "topic", buffer, theTopic);
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
                DtoQueue theQueue;
                theQueue = this.getQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
            }
            {
                DtoTopic theTopic;
                theTopic = this.getTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
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
            if (!(object instanceof DtoDiscarding.DeadLetterQueue)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDiscarding.DeadLetterQueue that = ((DtoDiscarding.DeadLetterQueue) object);
            {
                DtoQueue lhsQueue;
                lhsQueue = this.getQueue();
                DtoQueue rhsQueue;
                rhsQueue = that.getQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                    return false;
                }
            }
            {
                DtoTempQueue lhsTempQueue;
                lhsTempQueue = this.getTempQueue();
                DtoTempQueue rhsTempQueue;
                rhsTempQueue = that.getTempQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                    return false;
                }
            }
            {
                DtoTempTopic lhsTempTopic;
                lhsTempTopic = this.getTempTopic();
                DtoTempTopic rhsTempTopic;
                rhsTempTopic = that.getTempTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                    return false;
                }
            }
            {
                DtoTopic lhsTopic;
                lhsTopic = this.getTopic();
                DtoTopic rhsTopic;
                rhsTopic = that.getTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
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
