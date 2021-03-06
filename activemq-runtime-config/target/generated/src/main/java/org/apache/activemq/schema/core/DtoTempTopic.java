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
 *           &lt;element name="compositeDestinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="connection" minOccurs="0">
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
 *           &lt;element name="properties" minOccurs="0">
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
 *       &lt;attribute name="connection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="physicalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="properties" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceId" type="{http://www.w3.org/2001/XMLSchema}long" />
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
    "compositeDestinationsOrConnectionOrProperties"
})
@XmlRootElement(name = "tempTopic")
public class DtoTempTopic implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "properties", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "compositeDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "connection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> compositeDestinationsOrConnectionOrProperties;
    @XmlAttribute(name = "connection")
    protected String connection;
    @XmlAttribute(name = "connectionId")
    protected String connectionId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "physicalName")
    protected String physicalName;
    @XmlAttribute(name = "properties")
    protected String properties;
    @XmlAttribute(name = "sequenceId")
    protected Long sequenceId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the compositeDestinationsOrConnectionOrProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeDestinationsOrConnectionOrProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeDestinationsOrConnectionOrProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoTempTopic.Properties }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoTempTopic.CompositeDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTempTopic.Connection }{@code >}
     * 
     * 
     */
    public List<Object> getCompositeDestinationsOrConnectionOrProperties() {
        if (compositeDestinationsOrConnectionOrProperties == null) {
            compositeDestinationsOrConnectionOrProperties = new ArrayList<Object>();
        }
        return this.compositeDestinationsOrConnectionOrProperties;
    }

    /**
     * 获取connection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * 设置connection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * 获取connectionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * 设置connectionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
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
     * 获取physicalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * 设置physicalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalName(String value) {
        this.physicalName = value;
    }

    /**
     * 获取properties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties() {
        return properties;
    }

    /**
     * 设置properties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties(String value) {
        this.properties = value;
    }

    /**
     * 获取sequenceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceId() {
        return sequenceId;
    }

    /**
     * 设置sequenceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceId(Long value) {
        this.sequenceId = value;
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
            List<Object> theCompositeDestinationsOrConnectionOrProperties;
            theCompositeDestinationsOrConnectionOrProperties = (((this.compositeDestinationsOrConnectionOrProperties!= null)&&(!this.compositeDestinationsOrConnectionOrProperties.isEmpty()))?this.getCompositeDestinationsOrConnectionOrProperties():null);
            strategy.appendField(locator, this, "compositeDestinationsOrConnectionOrProperties", buffer, theCompositeDestinationsOrConnectionOrProperties);
        }
        {
            String theConnection;
            theConnection = this.getConnection();
            strategy.appendField(locator, this, "connection", buffer, theConnection);
        }
        {
            String theConnectionId;
            theConnectionId = this.getConnectionId();
            strategy.appendField(locator, this, "connectionId", buffer, theConnectionId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String thePhysicalName;
            thePhysicalName = this.getPhysicalName();
            strategy.appendField(locator, this, "physicalName", buffer, thePhysicalName);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties);
        }
        {
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            strategy.appendField(locator, this, "sequenceId", buffer, theSequenceId);
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
            List<Object> theCompositeDestinationsOrConnectionOrProperties;
            theCompositeDestinationsOrConnectionOrProperties = (((this.compositeDestinationsOrConnectionOrProperties!= null)&&(!this.compositeDestinationsOrConnectionOrProperties.isEmpty()))?this.getCompositeDestinationsOrConnectionOrProperties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeDestinationsOrConnectionOrProperties", theCompositeDestinationsOrConnectionOrProperties), currentHashCode, theCompositeDestinationsOrConnectionOrProperties);
        }
        {
            String theConnection;
            theConnection = this.getConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connection", theConnection), currentHashCode, theConnection);
        }
        {
            String theConnectionId;
            theConnectionId = this.getConnectionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionId", theConnectionId), currentHashCode, theConnectionId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePhysicalName;
            thePhysicalName = this.getPhysicalName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalName", thePhysicalName), currentHashCode, thePhysicalName);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "properties", theProperties), currentHashCode, theProperties);
        }
        {
            Long theSequenceId;
            theSequenceId = this.getSequenceId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceId", theSequenceId), currentHashCode, theSequenceId);
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
        if (!(object instanceof DtoTempTopic)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoTempTopic that = ((DtoTempTopic) object);
        {
            List<Object> lhsCompositeDestinationsOrConnectionOrProperties;
            lhsCompositeDestinationsOrConnectionOrProperties = (((this.compositeDestinationsOrConnectionOrProperties!= null)&&(!this.compositeDestinationsOrConnectionOrProperties.isEmpty()))?this.getCompositeDestinationsOrConnectionOrProperties():null);
            List<Object> rhsCompositeDestinationsOrConnectionOrProperties;
            rhsCompositeDestinationsOrConnectionOrProperties = (((that.compositeDestinationsOrConnectionOrProperties!= null)&&(!that.compositeDestinationsOrConnectionOrProperties.isEmpty()))?that.getCompositeDestinationsOrConnectionOrProperties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeDestinationsOrConnectionOrProperties", lhsCompositeDestinationsOrConnectionOrProperties), LocatorUtils.property(thatLocator, "compositeDestinationsOrConnectionOrProperties", rhsCompositeDestinationsOrConnectionOrProperties), lhsCompositeDestinationsOrConnectionOrProperties, rhsCompositeDestinationsOrConnectionOrProperties)) {
                return false;
            }
        }
        {
            String lhsConnection;
            lhsConnection = this.getConnection();
            String rhsConnection;
            rhsConnection = that.getConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connection", lhsConnection), LocatorUtils.property(thatLocator, "connection", rhsConnection), lhsConnection, rhsConnection)) {
                return false;
            }
        }
        {
            String lhsConnectionId;
            lhsConnectionId = this.getConnectionId();
            String rhsConnectionId;
            rhsConnectionId = that.getConnectionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionId", lhsConnectionId), LocatorUtils.property(thatLocator, "connectionId", rhsConnectionId), lhsConnectionId, rhsConnectionId)) {
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
            String lhsPhysicalName;
            lhsPhysicalName = this.getPhysicalName();
            String rhsPhysicalName;
            rhsPhysicalName = that.getPhysicalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalName", lhsPhysicalName), LocatorUtils.property(thatLocator, "physicalName", rhsPhysicalName), lhsPhysicalName, rhsPhysicalName)) {
                return false;
            }
        }
        {
            String lhsProperties;
            lhsProperties = this.getProperties();
            String rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties)) {
                return false;
            }
        }
        {
            Long lhsSequenceId;
            lhsSequenceId = this.getSequenceId();
            Long rhsSequenceId;
            rhsSequenceId = that.getSequenceId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceId", lhsSequenceId), LocatorUtils.property(thatLocator, "sequenceId", rhsSequenceId), lhsSequenceId, rhsSequenceId)) {
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
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
        "queueOrTempQueueOrTempTopic"
    })
    public static class CompositeDestinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> queueOrTempQueueOrTempTopic;

        /**
         * Gets the value of the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueOrTempQueueOrTempTopic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link DtoQueue }
         * {@link DtoTempQueue }
         * {@link DtoTempTopic }
         * {@link DtoTopic }
         * 
         * 
         */
        public List<Object> getQueueOrTempQueueOrTempTopic() {
            if (queueOrTempQueueOrTempTopic == null) {
                queueOrTempQueueOrTempTopic = new ArrayList<Object>();
            }
            return this.queueOrTempQueueOrTempTopic;
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
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                strategy.appendField(locator, this, "queueOrTempQueueOrTempTopic", buffer, theQueueOrTempQueueOrTempTopic);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueOrTempQueueOrTempTopic", theQueueOrTempQueueOrTempTopic), currentHashCode, theQueueOrTempQueueOrTempTopic);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoTempTopic.CompositeDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTempTopic.CompositeDestinations that = ((DtoTempTopic.CompositeDestinations) object);
            {
                List<Object> lhsQueueOrTempQueueOrTempTopic;
                lhsQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                List<Object> rhsQueueOrTempQueueOrTempTopic;
                rhsQueueOrTempQueueOrTempTopic = (((that.queueOrTempQueueOrTempTopic!= null)&&(!that.queueOrTempQueueOrTempTopic.isEmpty()))?that.getQueueOrTempQueueOrTempTopic():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queueOrTempQueueOrTempTopic", lhsQueueOrTempQueueOrTempTopic), LocatorUtils.property(thatLocator, "queueOrTempQueueOrTempTopic", rhsQueueOrTempQueueOrTempTopic), lhsQueueOrTempQueueOrTempTopic, rhsQueueOrTempQueueOrTempTopic)) {
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
    public static class Connection
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
            if (!(object instanceof DtoTempTopic.Connection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTempTopic.Connection that = ((DtoTempTopic.Connection) object);
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
    public static class Properties
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
            if (!(object instanceof DtoTempTopic.Properties)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTempTopic.Properties that = ((DtoTempTopic.Properties) object);
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
