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
 *           &lt;element name="executor" minOccurs="0">
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
 *           &lt;element name="rejectedTaskHandler" minOccurs="0">
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
 *           &lt;element name="threadClassLoader" minOccurs="0">
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
 *       &lt;attribute name="daemon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dedicatedTaskRunner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="executor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxIterationsPerRun" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxThreadPoolSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rejectedTaskHandler" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shutdownAwaitTermination" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="threadClassLoader" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "executorOrRejectedTaskHandlerOrThreadClassLoader"
})
@XmlRootElement(name = "taskRunnerFactory")
public class DtoTaskRunnerFactory
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "executor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "threadClassLoader", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "rejectedTaskHandler", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> executorOrRejectedTaskHandlerOrThreadClassLoader;
    @XmlAttribute(name = "daemon")
    protected Boolean daemon;
    @XmlAttribute(name = "dedicatedTaskRunner")
    protected Boolean dedicatedTaskRunner;
    @XmlAttribute(name = "executor")
    protected String executor;
    @XmlAttribute(name = "maxIterationsPerRun")
    protected BigInteger maxIterationsPerRun;
    @XmlAttribute(name = "maxThreadPoolSize")
    protected BigInteger maxThreadPoolSize;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "priority")
    protected BigInteger priority;
    @XmlAttribute(name = "rejectedTaskHandler")
    protected String rejectedTaskHandler;
    @XmlAttribute(name = "shutdownAwaitTermination")
    protected Long shutdownAwaitTermination;
    @XmlAttribute(name = "threadClassLoader")
    protected String threadClassLoader;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the executorOrRejectedTaskHandlerOrThreadClassLoader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executorOrRejectedTaskHandlerOrThreadClassLoader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutorOrRejectedTaskHandlerOrThreadClassLoader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.Executor }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.ThreadClassLoader }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.RejectedTaskHandler }{@code >}
     * 
     * 
     */
    public List<Object> getExecutorOrRejectedTaskHandlerOrThreadClassLoader() {
        if (executorOrRejectedTaskHandlerOrThreadClassLoader == null) {
            executorOrRejectedTaskHandlerOrThreadClassLoader = new ArrayList<Object>();
        }
        return this.executorOrRejectedTaskHandlerOrThreadClassLoader;
    }

    /**
     * 获取daemon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaemon() {
        return daemon;
    }

    /**
     * 设置daemon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaemon(Boolean value) {
        this.daemon = value;
    }

    /**
     * 获取dedicatedTaskRunner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDedicatedTaskRunner() {
        return dedicatedTaskRunner;
    }

    /**
     * 设置dedicatedTaskRunner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDedicatedTaskRunner(Boolean value) {
        this.dedicatedTaskRunner = value;
    }

    /**
     * 获取executor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * 设置executor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutor(String value) {
        this.executor = value;
    }

    /**
     * 获取maxIterationsPerRun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIterationsPerRun() {
        return maxIterationsPerRun;
    }

    /**
     * 设置maxIterationsPerRun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIterationsPerRun(BigInteger value) {
        this.maxIterationsPerRun = value;
    }

    /**
     * 获取maxThreadPoolSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxThreadPoolSize() {
        return maxThreadPoolSize;
    }

    /**
     * 设置maxThreadPoolSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxThreadPoolSize(BigInteger value) {
        this.maxThreadPoolSize = value;
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
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * 获取rejectedTaskHandler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectedTaskHandler() {
        return rejectedTaskHandler;
    }

    /**
     * 设置rejectedTaskHandler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectedTaskHandler(String value) {
        this.rejectedTaskHandler = value;
    }

    /**
     * 获取shutdownAwaitTermination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShutdownAwaitTermination() {
        return shutdownAwaitTermination;
    }

    /**
     * 设置shutdownAwaitTermination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShutdownAwaitTermination(Long value) {
        this.shutdownAwaitTermination = value;
    }

    /**
     * 获取threadClassLoader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadClassLoader() {
        return threadClassLoader;
    }

    /**
     * 设置threadClassLoader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadClassLoader(String value) {
        this.threadClassLoader = value;
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
            List<Object> theExecutorOrRejectedTaskHandlerOrThreadClassLoader;
            theExecutorOrRejectedTaskHandlerOrThreadClassLoader = (((this.executorOrRejectedTaskHandlerOrThreadClassLoader!= null)&&(!this.executorOrRejectedTaskHandlerOrThreadClassLoader.isEmpty()))?this.getExecutorOrRejectedTaskHandlerOrThreadClassLoader():null);
            strategy.appendField(locator, this, "executorOrRejectedTaskHandlerOrThreadClassLoader", buffer, theExecutorOrRejectedTaskHandlerOrThreadClassLoader);
        }
        {
            Boolean theDaemon;
            theDaemon = this.isDaemon();
            strategy.appendField(locator, this, "daemon", buffer, theDaemon);
        }
        {
            Boolean theDedicatedTaskRunner;
            theDedicatedTaskRunner = this.isDedicatedTaskRunner();
            strategy.appendField(locator, this, "dedicatedTaskRunner", buffer, theDedicatedTaskRunner);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            strategy.appendField(locator, this, "executor", buffer, theExecutor);
        }
        {
            BigInteger theMaxIterationsPerRun;
            theMaxIterationsPerRun = this.getMaxIterationsPerRun();
            strategy.appendField(locator, this, "maxIterationsPerRun", buffer, theMaxIterationsPerRun);
        }
        {
            BigInteger theMaxThreadPoolSize;
            theMaxThreadPoolSize = this.getMaxThreadPoolSize();
            strategy.appendField(locator, this, "maxThreadPoolSize", buffer, theMaxThreadPoolSize);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority);
        }
        {
            String theRejectedTaskHandler;
            theRejectedTaskHandler = this.getRejectedTaskHandler();
            strategy.appendField(locator, this, "rejectedTaskHandler", buffer, theRejectedTaskHandler);
        }
        {
            Long theShutdownAwaitTermination;
            theShutdownAwaitTermination = this.getShutdownAwaitTermination();
            strategy.appendField(locator, this, "shutdownAwaitTermination", buffer, theShutdownAwaitTermination);
        }
        {
            String theThreadClassLoader;
            theThreadClassLoader = this.getThreadClassLoader();
            strategy.appendField(locator, this, "threadClassLoader", buffer, theThreadClassLoader);
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
            List<Object> theExecutorOrRejectedTaskHandlerOrThreadClassLoader;
            theExecutorOrRejectedTaskHandlerOrThreadClassLoader = (((this.executorOrRejectedTaskHandlerOrThreadClassLoader!= null)&&(!this.executorOrRejectedTaskHandlerOrThreadClassLoader.isEmpty()))?this.getExecutorOrRejectedTaskHandlerOrThreadClassLoader():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executorOrRejectedTaskHandlerOrThreadClassLoader", theExecutorOrRejectedTaskHandlerOrThreadClassLoader), currentHashCode, theExecutorOrRejectedTaskHandlerOrThreadClassLoader);
        }
        {
            Boolean theDaemon;
            theDaemon = this.isDaemon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daemon", theDaemon), currentHashCode, theDaemon);
        }
        {
            Boolean theDedicatedTaskRunner;
            theDedicatedTaskRunner = this.isDedicatedTaskRunner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dedicatedTaskRunner", theDedicatedTaskRunner), currentHashCode, theDedicatedTaskRunner);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executor", theExecutor), currentHashCode, theExecutor);
        }
        {
            BigInteger theMaxIterationsPerRun;
            theMaxIterationsPerRun = this.getMaxIterationsPerRun();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxIterationsPerRun", theMaxIterationsPerRun), currentHashCode, theMaxIterationsPerRun);
        }
        {
            BigInteger theMaxThreadPoolSize;
            theMaxThreadPoolSize = this.getMaxThreadPoolSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxThreadPoolSize", theMaxThreadPoolSize), currentHashCode, theMaxThreadPoolSize);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority);
        }
        {
            String theRejectedTaskHandler;
            theRejectedTaskHandler = this.getRejectedTaskHandler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectedTaskHandler", theRejectedTaskHandler), currentHashCode, theRejectedTaskHandler);
        }
        {
            Long theShutdownAwaitTermination;
            theShutdownAwaitTermination = this.getShutdownAwaitTermination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shutdownAwaitTermination", theShutdownAwaitTermination), currentHashCode, theShutdownAwaitTermination);
        }
        {
            String theThreadClassLoader;
            theThreadClassLoader = this.getThreadClassLoader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "threadClassLoader", theThreadClassLoader), currentHashCode, theThreadClassLoader);
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
        if (!(object instanceof DtoTaskRunnerFactory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoTaskRunnerFactory that = ((DtoTaskRunnerFactory) object);
        {
            List<Object> lhsExecutorOrRejectedTaskHandlerOrThreadClassLoader;
            lhsExecutorOrRejectedTaskHandlerOrThreadClassLoader = (((this.executorOrRejectedTaskHandlerOrThreadClassLoader!= null)&&(!this.executorOrRejectedTaskHandlerOrThreadClassLoader.isEmpty()))?this.getExecutorOrRejectedTaskHandlerOrThreadClassLoader():null);
            List<Object> rhsExecutorOrRejectedTaskHandlerOrThreadClassLoader;
            rhsExecutorOrRejectedTaskHandlerOrThreadClassLoader = (((that.executorOrRejectedTaskHandlerOrThreadClassLoader!= null)&&(!that.executorOrRejectedTaskHandlerOrThreadClassLoader.isEmpty()))?that.getExecutorOrRejectedTaskHandlerOrThreadClassLoader():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executorOrRejectedTaskHandlerOrThreadClassLoader", lhsExecutorOrRejectedTaskHandlerOrThreadClassLoader), LocatorUtils.property(thatLocator, "executorOrRejectedTaskHandlerOrThreadClassLoader", rhsExecutorOrRejectedTaskHandlerOrThreadClassLoader), lhsExecutorOrRejectedTaskHandlerOrThreadClassLoader, rhsExecutorOrRejectedTaskHandlerOrThreadClassLoader)) {
                return false;
            }
        }
        {
            Boolean lhsDaemon;
            lhsDaemon = this.isDaemon();
            Boolean rhsDaemon;
            rhsDaemon = that.isDaemon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daemon", lhsDaemon), LocatorUtils.property(thatLocator, "daemon", rhsDaemon), lhsDaemon, rhsDaemon)) {
                return false;
            }
        }
        {
            Boolean lhsDedicatedTaskRunner;
            lhsDedicatedTaskRunner = this.isDedicatedTaskRunner();
            Boolean rhsDedicatedTaskRunner;
            rhsDedicatedTaskRunner = that.isDedicatedTaskRunner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dedicatedTaskRunner", lhsDedicatedTaskRunner), LocatorUtils.property(thatLocator, "dedicatedTaskRunner", rhsDedicatedTaskRunner), lhsDedicatedTaskRunner, rhsDedicatedTaskRunner)) {
                return false;
            }
        }
        {
            String lhsExecutor;
            lhsExecutor = this.getExecutor();
            String rhsExecutor;
            rhsExecutor = that.getExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executor", lhsExecutor), LocatorUtils.property(thatLocator, "executor", rhsExecutor), lhsExecutor, rhsExecutor)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxIterationsPerRun;
            lhsMaxIterationsPerRun = this.getMaxIterationsPerRun();
            BigInteger rhsMaxIterationsPerRun;
            rhsMaxIterationsPerRun = that.getMaxIterationsPerRun();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxIterationsPerRun", lhsMaxIterationsPerRun), LocatorUtils.property(thatLocator, "maxIterationsPerRun", rhsMaxIterationsPerRun), lhsMaxIterationsPerRun, rhsMaxIterationsPerRun)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxThreadPoolSize;
            lhsMaxThreadPoolSize = this.getMaxThreadPoolSize();
            BigInteger rhsMaxThreadPoolSize;
            rhsMaxThreadPoolSize = that.getMaxThreadPoolSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxThreadPoolSize", lhsMaxThreadPoolSize), LocatorUtils.property(thatLocator, "maxThreadPoolSize", rhsMaxThreadPoolSize), lhsMaxThreadPoolSize, rhsMaxThreadPoolSize)) {
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
            BigInteger lhsPriority;
            lhsPriority = this.getPriority();
            BigInteger rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority)) {
                return false;
            }
        }
        {
            String lhsRejectedTaskHandler;
            lhsRejectedTaskHandler = this.getRejectedTaskHandler();
            String rhsRejectedTaskHandler;
            rhsRejectedTaskHandler = that.getRejectedTaskHandler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectedTaskHandler", lhsRejectedTaskHandler), LocatorUtils.property(thatLocator, "rejectedTaskHandler", rhsRejectedTaskHandler), lhsRejectedTaskHandler, rhsRejectedTaskHandler)) {
                return false;
            }
        }
        {
            Long lhsShutdownAwaitTermination;
            lhsShutdownAwaitTermination = this.getShutdownAwaitTermination();
            Long rhsShutdownAwaitTermination;
            rhsShutdownAwaitTermination = that.getShutdownAwaitTermination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shutdownAwaitTermination", lhsShutdownAwaitTermination), LocatorUtils.property(thatLocator, "shutdownAwaitTermination", rhsShutdownAwaitTermination), lhsShutdownAwaitTermination, rhsShutdownAwaitTermination)) {
                return false;
            }
        }
        {
            String lhsThreadClassLoader;
            lhsThreadClassLoader = this.getThreadClassLoader();
            String rhsThreadClassLoader;
            rhsThreadClassLoader = that.getThreadClassLoader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "threadClassLoader", lhsThreadClassLoader), LocatorUtils.property(thatLocator, "threadClassLoader", rhsThreadClassLoader), lhsThreadClassLoader, rhsThreadClassLoader)) {
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
    public static class Executor
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
            if (!(object instanceof DtoTaskRunnerFactory.Executor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTaskRunnerFactory.Executor that = ((DtoTaskRunnerFactory.Executor) object);
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
    public static class RejectedTaskHandler
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
            if (!(object instanceof DtoTaskRunnerFactory.RejectedTaskHandler)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTaskRunnerFactory.RejectedTaskHandler that = ((DtoTaskRunnerFactory.RejectedTaskHandler) object);
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
    public static class ThreadClassLoader
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
            if (!(object instanceof DtoTaskRunnerFactory.ThreadClassLoader)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTaskRunnerFactory.ThreadClassLoader that = ((DtoTaskRunnerFactory.ThreadClassLoader) object);
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
