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
 *           &lt;element name="adminConnectionContext" minOccurs="0">
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
 *           &lt;element name="next" minOccurs="0">
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
 *       &lt;attribute name="adminConnectionContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="logAll" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logConnectionEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logConsumerEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logInternalEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logProducerEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logSessionEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="logTransactionEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="perDestinationLogger" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "adminConnectionContextOrNextOrAny"
})
@XmlRootElement(name = "loggingBrokerPlugin")
public class DtoLoggingBrokerPlugin implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "next", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "adminConnectionContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adminConnectionContextOrNextOrAny;
    @XmlAttribute(name = "adminConnectionContext")
    protected String adminConnectionContext;
    @XmlAttribute(name = "logAll")
    protected Boolean logAll;
    @XmlAttribute(name = "logConnectionEvents")
    protected Boolean logConnectionEvents;
    @XmlAttribute(name = "logConsumerEvents")
    protected Boolean logConsumerEvents;
    @XmlAttribute(name = "logInternalEvents")
    protected Boolean logInternalEvents;
    @XmlAttribute(name = "logProducerEvents")
    protected Boolean logProducerEvents;
    @XmlAttribute(name = "logSessionEvents")
    protected Boolean logSessionEvents;
    @XmlAttribute(name = "logTransactionEvents")
    protected Boolean logTransactionEvents;
    @XmlAttribute(name = "next")
    protected String next;
    @XmlAttribute(name = "perDestinationLogger")
    protected Boolean perDestinationLogger;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adminConnectionContextOrNextOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminConnectionContextOrNextOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminConnectionContextOrNextOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoLoggingBrokerPlugin.Next }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLoggingBrokerPlugin.AdminConnectionContext }{@code >}
     * 
     * 
     */
    public List<Object> getAdminConnectionContextOrNextOrAny() {
        if (adminConnectionContextOrNextOrAny == null) {
            adminConnectionContextOrNextOrAny = new ArrayList<Object>();
        }
        return this.adminConnectionContextOrNextOrAny;
    }

    /**
     * 获取adminConnectionContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminConnectionContext() {
        return adminConnectionContext;
    }

    /**
     * 设置adminConnectionContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminConnectionContext(String value) {
        this.adminConnectionContext = value;
    }

    /**
     * 获取logAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogAll() {
        return logAll;
    }

    /**
     * 设置logAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogAll(Boolean value) {
        this.logAll = value;
    }

    /**
     * 获取logConnectionEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogConnectionEvents() {
        return logConnectionEvents;
    }

    /**
     * 设置logConnectionEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogConnectionEvents(Boolean value) {
        this.logConnectionEvents = value;
    }

    /**
     * 获取logConsumerEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogConsumerEvents() {
        return logConsumerEvents;
    }

    /**
     * 设置logConsumerEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogConsumerEvents(Boolean value) {
        this.logConsumerEvents = value;
    }

    /**
     * 获取logInternalEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogInternalEvents() {
        return logInternalEvents;
    }

    /**
     * 设置logInternalEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogInternalEvents(Boolean value) {
        this.logInternalEvents = value;
    }

    /**
     * 获取logProducerEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogProducerEvents() {
        return logProducerEvents;
    }

    /**
     * 设置logProducerEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogProducerEvents(Boolean value) {
        this.logProducerEvents = value;
    }

    /**
     * 获取logSessionEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogSessionEvents() {
        return logSessionEvents;
    }

    /**
     * 设置logSessionEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogSessionEvents(Boolean value) {
        this.logSessionEvents = value;
    }

    /**
     * 获取logTransactionEvents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogTransactionEvents() {
        return logTransactionEvents;
    }

    /**
     * 设置logTransactionEvents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogTransactionEvents(Boolean value) {
        this.logTransactionEvents = value;
    }

    /**
     * 获取next属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * 设置next属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

    /**
     * 获取perDestinationLogger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerDestinationLogger() {
        return perDestinationLogger;
    }

    /**
     * 设置perDestinationLogger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerDestinationLogger(Boolean value) {
        this.perDestinationLogger = value;
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
            List<Object> theAdminConnectionContextOrNextOrAny;
            theAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            strategy.appendField(locator, this, "adminConnectionContextOrNextOrAny", buffer, theAdminConnectionContextOrNextOrAny);
        }
        {
            String theAdminConnectionContext;
            theAdminConnectionContext = this.getAdminConnectionContext();
            strategy.appendField(locator, this, "adminConnectionContext", buffer, theAdminConnectionContext);
        }
        {
            Boolean theLogAll;
            theLogAll = this.isLogAll();
            strategy.appendField(locator, this, "logAll", buffer, theLogAll);
        }
        {
            Boolean theLogConnectionEvents;
            theLogConnectionEvents = this.isLogConnectionEvents();
            strategy.appendField(locator, this, "logConnectionEvents", buffer, theLogConnectionEvents);
        }
        {
            Boolean theLogConsumerEvents;
            theLogConsumerEvents = this.isLogConsumerEvents();
            strategy.appendField(locator, this, "logConsumerEvents", buffer, theLogConsumerEvents);
        }
        {
            Boolean theLogInternalEvents;
            theLogInternalEvents = this.isLogInternalEvents();
            strategy.appendField(locator, this, "logInternalEvents", buffer, theLogInternalEvents);
        }
        {
            Boolean theLogProducerEvents;
            theLogProducerEvents = this.isLogProducerEvents();
            strategy.appendField(locator, this, "logProducerEvents", buffer, theLogProducerEvents);
        }
        {
            Boolean theLogSessionEvents;
            theLogSessionEvents = this.isLogSessionEvents();
            strategy.appendField(locator, this, "logSessionEvents", buffer, theLogSessionEvents);
        }
        {
            Boolean theLogTransactionEvents;
            theLogTransactionEvents = this.isLogTransactionEvents();
            strategy.appendField(locator, this, "logTransactionEvents", buffer, theLogTransactionEvents);
        }
        {
            String theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext);
        }
        {
            Boolean thePerDestinationLogger;
            thePerDestinationLogger = this.isPerDestinationLogger();
            strategy.appendField(locator, this, "perDestinationLogger", buffer, thePerDestinationLogger);
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
            List<Object> theAdminConnectionContextOrNextOrAny;
            theAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminConnectionContextOrNextOrAny", theAdminConnectionContextOrNextOrAny), currentHashCode, theAdminConnectionContextOrNextOrAny);
        }
        {
            String theAdminConnectionContext;
            theAdminConnectionContext = this.getAdminConnectionContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminConnectionContext", theAdminConnectionContext), currentHashCode, theAdminConnectionContext);
        }
        {
            Boolean theLogAll;
            theLogAll = this.isLogAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logAll", theLogAll), currentHashCode, theLogAll);
        }
        {
            Boolean theLogConnectionEvents;
            theLogConnectionEvents = this.isLogConnectionEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logConnectionEvents", theLogConnectionEvents), currentHashCode, theLogConnectionEvents);
        }
        {
            Boolean theLogConsumerEvents;
            theLogConsumerEvents = this.isLogConsumerEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logConsumerEvents", theLogConsumerEvents), currentHashCode, theLogConsumerEvents);
        }
        {
            Boolean theLogInternalEvents;
            theLogInternalEvents = this.isLogInternalEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logInternalEvents", theLogInternalEvents), currentHashCode, theLogInternalEvents);
        }
        {
            Boolean theLogProducerEvents;
            theLogProducerEvents = this.isLogProducerEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logProducerEvents", theLogProducerEvents), currentHashCode, theLogProducerEvents);
        }
        {
            Boolean theLogSessionEvents;
            theLogSessionEvents = this.isLogSessionEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logSessionEvents", theLogSessionEvents), currentHashCode, theLogSessionEvents);
        }
        {
            Boolean theLogTransactionEvents;
            theLogTransactionEvents = this.isLogTransactionEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logTransactionEvents", theLogTransactionEvents), currentHashCode, theLogTransactionEvents);
        }
        {
            String theNext;
            theNext = this.getNext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "next", theNext), currentHashCode, theNext);
        }
        {
            Boolean thePerDestinationLogger;
            thePerDestinationLogger = this.isPerDestinationLogger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perDestinationLogger", thePerDestinationLogger), currentHashCode, thePerDestinationLogger);
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
        if (!(object instanceof DtoLoggingBrokerPlugin)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoLoggingBrokerPlugin that = ((DtoLoggingBrokerPlugin) object);
        {
            List<Object> lhsAdminConnectionContextOrNextOrAny;
            lhsAdminConnectionContextOrNextOrAny = (((this.adminConnectionContextOrNextOrAny!= null)&&(!this.adminConnectionContextOrNextOrAny.isEmpty()))?this.getAdminConnectionContextOrNextOrAny():null);
            List<Object> rhsAdminConnectionContextOrNextOrAny;
            rhsAdminConnectionContextOrNextOrAny = (((that.adminConnectionContextOrNextOrAny!= null)&&(!that.adminConnectionContextOrNextOrAny.isEmpty()))?that.getAdminConnectionContextOrNextOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminConnectionContextOrNextOrAny", lhsAdminConnectionContextOrNextOrAny), LocatorUtils.property(thatLocator, "adminConnectionContextOrNextOrAny", rhsAdminConnectionContextOrNextOrAny), lhsAdminConnectionContextOrNextOrAny, rhsAdminConnectionContextOrNextOrAny)) {
                return false;
            }
        }
        {
            String lhsAdminConnectionContext;
            lhsAdminConnectionContext = this.getAdminConnectionContext();
            String rhsAdminConnectionContext;
            rhsAdminConnectionContext = that.getAdminConnectionContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminConnectionContext", lhsAdminConnectionContext), LocatorUtils.property(thatLocator, "adminConnectionContext", rhsAdminConnectionContext), lhsAdminConnectionContext, rhsAdminConnectionContext)) {
                return false;
            }
        }
        {
            Boolean lhsLogAll;
            lhsLogAll = this.isLogAll();
            Boolean rhsLogAll;
            rhsLogAll = that.isLogAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logAll", lhsLogAll), LocatorUtils.property(thatLocator, "logAll", rhsLogAll), lhsLogAll, rhsLogAll)) {
                return false;
            }
        }
        {
            Boolean lhsLogConnectionEvents;
            lhsLogConnectionEvents = this.isLogConnectionEvents();
            Boolean rhsLogConnectionEvents;
            rhsLogConnectionEvents = that.isLogConnectionEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logConnectionEvents", lhsLogConnectionEvents), LocatorUtils.property(thatLocator, "logConnectionEvents", rhsLogConnectionEvents), lhsLogConnectionEvents, rhsLogConnectionEvents)) {
                return false;
            }
        }
        {
            Boolean lhsLogConsumerEvents;
            lhsLogConsumerEvents = this.isLogConsumerEvents();
            Boolean rhsLogConsumerEvents;
            rhsLogConsumerEvents = that.isLogConsumerEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logConsumerEvents", lhsLogConsumerEvents), LocatorUtils.property(thatLocator, "logConsumerEvents", rhsLogConsumerEvents), lhsLogConsumerEvents, rhsLogConsumerEvents)) {
                return false;
            }
        }
        {
            Boolean lhsLogInternalEvents;
            lhsLogInternalEvents = this.isLogInternalEvents();
            Boolean rhsLogInternalEvents;
            rhsLogInternalEvents = that.isLogInternalEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logInternalEvents", lhsLogInternalEvents), LocatorUtils.property(thatLocator, "logInternalEvents", rhsLogInternalEvents), lhsLogInternalEvents, rhsLogInternalEvents)) {
                return false;
            }
        }
        {
            Boolean lhsLogProducerEvents;
            lhsLogProducerEvents = this.isLogProducerEvents();
            Boolean rhsLogProducerEvents;
            rhsLogProducerEvents = that.isLogProducerEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logProducerEvents", lhsLogProducerEvents), LocatorUtils.property(thatLocator, "logProducerEvents", rhsLogProducerEvents), lhsLogProducerEvents, rhsLogProducerEvents)) {
                return false;
            }
        }
        {
            Boolean lhsLogSessionEvents;
            lhsLogSessionEvents = this.isLogSessionEvents();
            Boolean rhsLogSessionEvents;
            rhsLogSessionEvents = that.isLogSessionEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logSessionEvents", lhsLogSessionEvents), LocatorUtils.property(thatLocator, "logSessionEvents", rhsLogSessionEvents), lhsLogSessionEvents, rhsLogSessionEvents)) {
                return false;
            }
        }
        {
            Boolean lhsLogTransactionEvents;
            lhsLogTransactionEvents = this.isLogTransactionEvents();
            Boolean rhsLogTransactionEvents;
            rhsLogTransactionEvents = that.isLogTransactionEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logTransactionEvents", lhsLogTransactionEvents), LocatorUtils.property(thatLocator, "logTransactionEvents", rhsLogTransactionEvents), lhsLogTransactionEvents, rhsLogTransactionEvents)) {
                return false;
            }
        }
        {
            String lhsNext;
            lhsNext = this.getNext();
            String rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext)) {
                return false;
            }
        }
        {
            Boolean lhsPerDestinationLogger;
            lhsPerDestinationLogger = this.isPerDestinationLogger();
            Boolean rhsPerDestinationLogger;
            rhsPerDestinationLogger = that.isPerDestinationLogger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perDestinationLogger", lhsPerDestinationLogger), LocatorUtils.property(thatLocator, "perDestinationLogger", rhsPerDestinationLogger), lhsPerDestinationLogger, rhsPerDestinationLogger)) {
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
    public static class AdminConnectionContext
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
            if (!(object instanceof DtoLoggingBrokerPlugin.AdminConnectionContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLoggingBrokerPlugin.AdminConnectionContext that = ((DtoLoggingBrokerPlugin.AdminConnectionContext) object);
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
    public static class Next
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
         * 获取destinationPathSeparatorPlugin属性的值。
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
         * 设置destinationPathSeparatorPlugin属性的值。
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
         * 获取destinationsPlugin属性的值。
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
         * 设置destinationsPlugin属性的值。
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
         * 获取forcePersistencyModeBroker属性的值。
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
         * 设置forcePersistencyModeBroker属性的值。
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
         * 获取loggingBrokerPlugin属性的值。
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
         * 设置loggingBrokerPlugin属性的值。
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
         * 获取multicastTraceBrokerPlugin属性的值。
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
         * 设置multicastTraceBrokerPlugin属性的值。
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
         * 获取redeliveryPlugin属性的值。
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
         * 设置redeliveryPlugin属性的值。
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
         * 获取timeStampingBrokerPlugin属性的值。
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
         * 设置timeStampingBrokerPlugin属性的值。
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
         * 获取traceBrokerPathPlugin属性的值。
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
         * 设置traceBrokerPathPlugin属性的值。
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
         * 获取udpTraceBrokerPlugin属性的值。
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
         * 设置udpTraceBrokerPlugin属性的值。
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
            if (!(object instanceof DtoLoggingBrokerPlugin.Next)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLoggingBrokerPlugin.Next that = ((DtoLoggingBrokerPlugin.Next) object);
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
