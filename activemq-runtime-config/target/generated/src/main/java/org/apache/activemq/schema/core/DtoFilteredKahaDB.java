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
 *           &lt;element name="adapter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destination" minOccurs="0">
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
 *           &lt;element name="persistenceAdapter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="adapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="perDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="persistenceAdapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tempTopic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="topic" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adapterOrDestinationOrPersistenceAdapter"
})
@XmlRootElement(name = "filteredKahaDB")
public class DtoFilteredKahaDB
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "destination", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "adapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "persistenceAdapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adapterOrDestinationOrPersistenceAdapter;
    @XmlAttribute(name = "adapter")
    protected String adapter;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "perDestination")
    protected Boolean perDestination;
    @XmlAttribute(name = "persistenceAdapter")
    protected String persistenceAdapter;
    @XmlAttribute(name = "queue")
    protected String queue;
    @XmlAttribute(name = "tempQueue")
    protected Boolean tempQueue;
    @XmlAttribute(name = "tempTopic")
    protected Boolean tempTopic;
    @XmlAttribute(name = "topic")
    protected String topic;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adapterOrDestinationOrPersistenceAdapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapterOrDestinationOrPersistenceAdapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapterOrDestinationOrPersistenceAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Destination }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Adapter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.PersistenceAdapter }{@code >}
     * 
     * 
     */
    public List<Object> getAdapterOrDestinationOrPersistenceAdapter() {
        if (adapterOrDestinationOrPersistenceAdapter == null) {
            adapterOrDestinationOrPersistenceAdapter = new ArrayList<Object>();
        }
        return this.adapterOrDestinationOrPersistenceAdapter;
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
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取perDestination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerDestination() {
        return perDestination;
    }

    /**
     * 设置perDestination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerDestination(Boolean value) {
        this.perDestination = value;
    }

    /**
     * 获取persistenceAdapter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceAdapter() {
        return persistenceAdapter;
    }

    /**
     * 设置persistenceAdapter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceAdapter(String value) {
        this.persistenceAdapter = value;
    }

    /**
     * 获取queue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * 设置queue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * 获取tempQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempQueue() {
        return tempQueue;
    }

    /**
     * 设置tempQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempQueue(Boolean value) {
        this.tempQueue = value;
    }

    /**
     * 获取tempTopic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempTopic() {
        return tempTopic;
    }

    /**
     * 设置tempTopic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempTopic(Boolean value) {
        this.tempTopic = value;
    }

    /**
     * 获取topic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置topic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
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
            List<Object> theAdapterOrDestinationOrPersistenceAdapter;
            theAdapterOrDestinationOrPersistenceAdapter = (((this.adapterOrDestinationOrPersistenceAdapter!= null)&&(!this.adapterOrDestinationOrPersistenceAdapter.isEmpty()))?this.getAdapterOrDestinationOrPersistenceAdapter():null);
            strategy.appendField(locator, this, "adapterOrDestinationOrPersistenceAdapter", buffer, theAdapterOrDestinationOrPersistenceAdapter);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            strategy.appendField(locator, this, "adapter", buffer, theAdapter);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            Boolean thePerDestination;
            thePerDestination = this.isPerDestination();
            strategy.appendField(locator, this, "perDestination", buffer, thePerDestination);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            strategy.appendField(locator, this, "persistenceAdapter", buffer, thePersistenceAdapter);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            strategy.appendField(locator, this, "queue", buffer, theQueue);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
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
            List<Object> theAdapterOrDestinationOrPersistenceAdapter;
            theAdapterOrDestinationOrPersistenceAdapter = (((this.adapterOrDestinationOrPersistenceAdapter!= null)&&(!this.adapterOrDestinationOrPersistenceAdapter.isEmpty()))?this.getAdapterOrDestinationOrPersistenceAdapter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapterOrDestinationOrPersistenceAdapter", theAdapterOrDestinationOrPersistenceAdapter), currentHashCode, theAdapterOrDestinationOrPersistenceAdapter);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapter", theAdapter), currentHashCode, theAdapter);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            Boolean thePerDestination;
            thePerDestination = this.isPerDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perDestination", thePerDestination), currentHashCode, thePerDestination);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceAdapter", thePersistenceAdapter), currentHashCode, thePersistenceAdapter);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
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
        if (!(object instanceof DtoFilteredKahaDB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoFilteredKahaDB that = ((DtoFilteredKahaDB) object);
        {
            List<Object> lhsAdapterOrDestinationOrPersistenceAdapter;
            lhsAdapterOrDestinationOrPersistenceAdapter = (((this.adapterOrDestinationOrPersistenceAdapter!= null)&&(!this.adapterOrDestinationOrPersistenceAdapter.isEmpty()))?this.getAdapterOrDestinationOrPersistenceAdapter():null);
            List<Object> rhsAdapterOrDestinationOrPersistenceAdapter;
            rhsAdapterOrDestinationOrPersistenceAdapter = (((that.adapterOrDestinationOrPersistenceAdapter!= null)&&(!that.adapterOrDestinationOrPersistenceAdapter.isEmpty()))?that.getAdapterOrDestinationOrPersistenceAdapter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adapterOrDestinationOrPersistenceAdapter", lhsAdapterOrDestinationOrPersistenceAdapter), LocatorUtils.property(thatLocator, "adapterOrDestinationOrPersistenceAdapter", rhsAdapterOrDestinationOrPersistenceAdapter), lhsAdapterOrDestinationOrPersistenceAdapter, rhsAdapterOrDestinationOrPersistenceAdapter)) {
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
            String lhsDestination;
            lhsDestination = this.getDestination();
            String rhsDestination;
            rhsDestination = that.getDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            Boolean lhsPerDestination;
            lhsPerDestination = this.isPerDestination();
            Boolean rhsPerDestination;
            rhsPerDestination = that.isPerDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perDestination", lhsPerDestination), LocatorUtils.property(thatLocator, "perDestination", rhsPerDestination), lhsPerDestination, rhsPerDestination)) {
                return false;
            }
        }
        {
            String lhsPersistenceAdapter;
            lhsPersistenceAdapter = this.getPersistenceAdapter();
            String rhsPersistenceAdapter;
            rhsPersistenceAdapter = that.getPersistenceAdapter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceAdapter", lhsPersistenceAdapter), LocatorUtils.property(thatLocator, "persistenceAdapter", rhsPersistenceAdapter), lhsPersistenceAdapter, rhsPersistenceAdapter)) {
                return false;
            }
        }
        {
            String lhsQueue;
            lhsQueue = this.getQueue();
            String rhsQueue;
            rhsQueue = that.getQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                return false;
            }
        }
        {
            Boolean lhsTempQueue;
            lhsTempQueue = this.isTempQueue();
            Boolean rhsTempQueue;
            rhsTempQueue = that.isTempQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                return false;
            }
        }
        {
            Boolean lhsTempTopic;
            lhsTempTopic = this.isTempTopic();
            Boolean rhsTempTopic;
            rhsTempTopic = that.isTempTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                return false;
            }
        }
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
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
        "journalPersistenceAdapter",
        "kahaDB",
        "mKahaDB",
        "memoryPersistenceAdapter",
        "replicatedLevelDB",
        "any"
    })
    public static class Adapter
        implements Equals, HashCode, ToString
    {

        protected DtoJdbcPersistenceAdapter jdbcPersistenceAdapter;
        protected DtoJournalPersistenceAdapter journalPersistenceAdapter;
        protected DtoKahaDB kahaDB;
        protected DtoMKahaDB mKahaDB;
        protected DtoMemoryPersistenceAdapter memoryPersistenceAdapter;
        protected DtoReplicatedLevelDB replicatedLevelDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取jdbcPersistenceAdapter属性的值。
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
         * 设置jdbcPersistenceAdapter属性的值。
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
         * 获取journalPersistenceAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public DtoJournalPersistenceAdapter getJournalPersistenceAdapter() {
            return journalPersistenceAdapter;
        }

        /**
         * 设置journalPersistenceAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public void setJournalPersistenceAdapter(DtoJournalPersistenceAdapter value) {
            this.journalPersistenceAdapter = value;
        }

        /**
         * 获取kahaDB属性的值。
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
         * 设置kahaDB属性的值。
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
         * 获取mKahaDB属性的值。
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
         * 设置mKahaDB属性的值。
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
         * 获取memoryPersistenceAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public DtoMemoryPersistenceAdapter getMemoryPersistenceAdapter() {
            return memoryPersistenceAdapter;
        }

        /**
         * 设置memoryPersistenceAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public void setMemoryPersistenceAdapter(DtoMemoryPersistenceAdapter value) {
            this.memoryPersistenceAdapter = value;
        }

        /**
         * 获取replicatedLevelDB属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public DtoReplicatedLevelDB getReplicatedLevelDB() {
            return replicatedLevelDB;
        }

        /**
         * 设置replicatedLevelDB属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public void setReplicatedLevelDB(DtoReplicatedLevelDB value) {
            this.replicatedLevelDB = value;
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
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                strategy.appendField(locator, this, "jdbcPersistenceAdapter", buffer, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                strategy.appendField(locator, this, "journalPersistenceAdapter", buffer, theJournalPersistenceAdapter);
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
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                strategy.appendField(locator, this, "memoryPersistenceAdapter", buffer, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                strategy.appendField(locator, this, "replicatedLevelDB", buffer, theReplicatedLevelDB);
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
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapter", theJournalPersistenceAdapter), currentHashCode, theJournalPersistenceAdapter);
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
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryPersistenceAdapter", theMemoryPersistenceAdapter), currentHashCode, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replicatedLevelDB", theReplicatedLevelDB), currentHashCode, theReplicatedLevelDB);
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
            if (!(object instanceof DtoFilteredKahaDB.Adapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoFilteredKahaDB.Adapter that = ((DtoFilteredKahaDB.Adapter) object);
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
                DtoJournalPersistenceAdapter lhsJournalPersistenceAdapter;
                lhsJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                DtoJournalPersistenceAdapter rhsJournalPersistenceAdapter;
                rhsJournalPersistenceAdapter = that.getJournalPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapter", lhsJournalPersistenceAdapter), LocatorUtils.property(thatLocator, "journalPersistenceAdapter", rhsJournalPersistenceAdapter), lhsJournalPersistenceAdapter, rhsJournalPersistenceAdapter)) {
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
                DtoMemoryPersistenceAdapter lhsMemoryPersistenceAdapter;
                lhsMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                DtoMemoryPersistenceAdapter rhsMemoryPersistenceAdapter;
                rhsMemoryPersistenceAdapter = that.getMemoryPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryPersistenceAdapter", lhsMemoryPersistenceAdapter), LocatorUtils.property(thatLocator, "memoryPersistenceAdapter", rhsMemoryPersistenceAdapter), lhsMemoryPersistenceAdapter, rhsMemoryPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoReplicatedLevelDB lhsReplicatedLevelDB;
                lhsReplicatedLevelDB = this.getReplicatedLevelDB();
                DtoReplicatedLevelDB rhsReplicatedLevelDB;
                rhsReplicatedLevelDB = that.getReplicatedLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "replicatedLevelDB", lhsReplicatedLevelDB), LocatorUtils.property(thatLocator, "replicatedLevelDB", rhsReplicatedLevelDB), lhsReplicatedLevelDB, rhsReplicatedLevelDB)) {
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
    public static class Destination
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
        protected DtoTempQueue tempQueue;
        protected DtoTempTopic tempTopic;
        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取queue属性的值。
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
         * 设置queue属性的值。
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
         * 获取tempQueue属性的值。
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
         * 设置tempQueue属性的值。
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
         * 获取tempTopic属性的值。
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
         * 设置tempTopic属性的值。
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
         * 获取topic属性的值。
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
         * 设置topic属性的值。
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
            if (!(object instanceof DtoFilteredKahaDB.Destination)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoFilteredKahaDB.Destination that = ((DtoFilteredKahaDB.Destination) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
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
        "journalPersistenceAdapter",
        "kahaDB",
        "mKahaDB",
        "memoryPersistenceAdapter",
        "replicatedLevelDB",
        "any"
    })
    public static class PersistenceAdapter
        implements Equals, HashCode, ToString
    {

        protected DtoJdbcPersistenceAdapter jdbcPersistenceAdapter;
        protected DtoJournalPersistenceAdapter journalPersistenceAdapter;
        protected DtoKahaDB kahaDB;
        protected DtoMKahaDB mKahaDB;
        protected DtoMemoryPersistenceAdapter memoryPersistenceAdapter;
        protected DtoReplicatedLevelDB replicatedLevelDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取jdbcPersistenceAdapter属性的值。
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
         * 设置jdbcPersistenceAdapter属性的值。
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
         * 获取journalPersistenceAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public DtoJournalPersistenceAdapter getJournalPersistenceAdapter() {
            return journalPersistenceAdapter;
        }

        /**
         * 设置journalPersistenceAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public void setJournalPersistenceAdapter(DtoJournalPersistenceAdapter value) {
            this.journalPersistenceAdapter = value;
        }

        /**
         * 获取kahaDB属性的值。
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
         * 设置kahaDB属性的值。
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
         * 获取mKahaDB属性的值。
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
         * 设置mKahaDB属性的值。
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
         * 获取memoryPersistenceAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public DtoMemoryPersistenceAdapter getMemoryPersistenceAdapter() {
            return memoryPersistenceAdapter;
        }

        /**
         * 设置memoryPersistenceAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public void setMemoryPersistenceAdapter(DtoMemoryPersistenceAdapter value) {
            this.memoryPersistenceAdapter = value;
        }

        /**
         * 获取replicatedLevelDB属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public DtoReplicatedLevelDB getReplicatedLevelDB() {
            return replicatedLevelDB;
        }

        /**
         * 设置replicatedLevelDB属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public void setReplicatedLevelDB(DtoReplicatedLevelDB value) {
            this.replicatedLevelDB = value;
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
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                strategy.appendField(locator, this, "jdbcPersistenceAdapter", buffer, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                strategy.appendField(locator, this, "journalPersistenceAdapter", buffer, theJournalPersistenceAdapter);
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
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                strategy.appendField(locator, this, "memoryPersistenceAdapter", buffer, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                strategy.appendField(locator, this, "replicatedLevelDB", buffer, theReplicatedLevelDB);
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
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapter", theJournalPersistenceAdapter), currentHashCode, theJournalPersistenceAdapter);
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
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryPersistenceAdapter", theMemoryPersistenceAdapter), currentHashCode, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replicatedLevelDB", theReplicatedLevelDB), currentHashCode, theReplicatedLevelDB);
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
            if (!(object instanceof DtoFilteredKahaDB.PersistenceAdapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoFilteredKahaDB.PersistenceAdapter that = ((DtoFilteredKahaDB.PersistenceAdapter) object);
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
                DtoJournalPersistenceAdapter lhsJournalPersistenceAdapter;
                lhsJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                DtoJournalPersistenceAdapter rhsJournalPersistenceAdapter;
                rhsJournalPersistenceAdapter = that.getJournalPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapter", lhsJournalPersistenceAdapter), LocatorUtils.property(thatLocator, "journalPersistenceAdapter", rhsJournalPersistenceAdapter), lhsJournalPersistenceAdapter, rhsJournalPersistenceAdapter)) {
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
                DtoMemoryPersistenceAdapter lhsMemoryPersistenceAdapter;
                lhsMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                DtoMemoryPersistenceAdapter rhsMemoryPersistenceAdapter;
                rhsMemoryPersistenceAdapter = that.getMemoryPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryPersistenceAdapter", lhsMemoryPersistenceAdapter), LocatorUtils.property(thatLocator, "memoryPersistenceAdapter", rhsMemoryPersistenceAdapter), lhsMemoryPersistenceAdapter, rhsMemoryPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoReplicatedLevelDB lhsReplicatedLevelDB;
                lhsReplicatedLevelDB = this.getReplicatedLevelDB();
                DtoReplicatedLevelDB rhsReplicatedLevelDB;
                rhsReplicatedLevelDB = that.getReplicatedLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "replicatedLevelDB", lhsReplicatedLevelDB), LocatorUtils.property(thatLocator, "replicatedLevelDB", rhsReplicatedLevelDB), lhsReplicatedLevelDB, rhsReplicatedLevelDB)) {
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
