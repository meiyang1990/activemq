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
 *       &lt;attribute name="batchStatements" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="batchStatments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxRows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="statements" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useExternalMessageReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "statementsOrAny"
})
@XmlRootElement(name = "informixJDBCAdapter")
public class DtoInformixJDBCAdapter
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "statements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    @XmlAnyElement(lax = true)
    protected List<Object> statementsOrAny;
    @XmlAttribute(name = "batchStatements")
    protected Boolean batchStatements;
    @XmlAttribute(name = "batchStatments")
    protected Boolean batchStatments;
    @XmlAttribute(name = "maxRows")
    protected BigInteger maxRows;
    @XmlAttribute(name = "statements")
    protected String statements;
    @XmlAttribute(name = "useExternalMessageReferences")
    protected Boolean useExternalMessageReferences;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the statementsOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementsOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementsOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoInformixJDBCAdapter.Statements }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStatementsOrAny() {
        if (statementsOrAny == null) {
            statementsOrAny = new ArrayList<Object>();
        }
        return this.statementsOrAny;
    }

    /**
     * 获取batchStatements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchStatements() {
        return batchStatements;
    }

    /**
     * 设置batchStatements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchStatements(Boolean value) {
        this.batchStatements = value;
    }

    /**
     * 获取batchStatments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatchStatments() {
        return batchStatments;
    }

    /**
     * 设置batchStatments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatchStatments(Boolean value) {
        this.batchStatments = value;
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
            List<Object> theStatementsOrAny;
            theStatementsOrAny = (((this.statementsOrAny!= null)&&(!this.statementsOrAny.isEmpty()))?this.getStatementsOrAny():null);
            strategy.appendField(locator, this, "statementsOrAny", buffer, theStatementsOrAny);
        }
        {
            Boolean theBatchStatements;
            theBatchStatements = this.isBatchStatements();
            strategy.appendField(locator, this, "batchStatements", buffer, theBatchStatements);
        }
        {
            Boolean theBatchStatments;
            theBatchStatments = this.isBatchStatments();
            strategy.appendField(locator, this, "batchStatments", buffer, theBatchStatments);
        }
        {
            BigInteger theMaxRows;
            theMaxRows = this.getMaxRows();
            strategy.appendField(locator, this, "maxRows", buffer, theMaxRows);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            strategy.appendField(locator, this, "statements", buffer, theStatements);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            strategy.appendField(locator, this, "useExternalMessageReferences", buffer, theUseExternalMessageReferences);
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
            List<Object> theStatementsOrAny;
            theStatementsOrAny = (((this.statementsOrAny!= null)&&(!this.statementsOrAny.isEmpty()))?this.getStatementsOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statementsOrAny", theStatementsOrAny), currentHashCode, theStatementsOrAny);
        }
        {
            Boolean theBatchStatements;
            theBatchStatements = this.isBatchStatements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchStatements", theBatchStatements), currentHashCode, theBatchStatements);
        }
        {
            Boolean theBatchStatments;
            theBatchStatments = this.isBatchStatments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchStatments", theBatchStatments), currentHashCode, theBatchStatments);
        }
        {
            BigInteger theMaxRows;
            theMaxRows = this.getMaxRows();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxRows", theMaxRows), currentHashCode, theMaxRows);
        }
        {
            String theStatements;
            theStatements = this.getStatements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statements", theStatements), currentHashCode, theStatements);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useExternalMessageReferences", theUseExternalMessageReferences), currentHashCode, theUseExternalMessageReferences);
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
        if (!(object instanceof DtoInformixJDBCAdapter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoInformixJDBCAdapter that = ((DtoInformixJDBCAdapter) object);
        {
            List<Object> lhsStatementsOrAny;
            lhsStatementsOrAny = (((this.statementsOrAny!= null)&&(!this.statementsOrAny.isEmpty()))?this.getStatementsOrAny():null);
            List<Object> rhsStatementsOrAny;
            rhsStatementsOrAny = (((that.statementsOrAny!= null)&&(!that.statementsOrAny.isEmpty()))?that.getStatementsOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statementsOrAny", lhsStatementsOrAny), LocatorUtils.property(thatLocator, "statementsOrAny", rhsStatementsOrAny), lhsStatementsOrAny, rhsStatementsOrAny)) {
                return false;
            }
        }
        {
            Boolean lhsBatchStatements;
            lhsBatchStatements = this.isBatchStatements();
            Boolean rhsBatchStatements;
            rhsBatchStatements = that.isBatchStatements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchStatements", lhsBatchStatements), LocatorUtils.property(thatLocator, "batchStatements", rhsBatchStatements), lhsBatchStatements, rhsBatchStatements)) {
                return false;
            }
        }
        {
            Boolean lhsBatchStatments;
            lhsBatchStatments = this.isBatchStatments();
            Boolean rhsBatchStatments;
            rhsBatchStatments = that.isBatchStatments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchStatments", lhsBatchStatments), LocatorUtils.property(thatLocator, "batchStatments", rhsBatchStatments), lhsBatchStatments, rhsBatchStatments)) {
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
            String lhsStatements;
            lhsStatements = this.getStatements();
            String rhsStatements;
            rhsStatements = that.getStatements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statements", lhsStatements), LocatorUtils.property(thatLocator, "statements", rhsStatements), lhsStatements, rhsStatements)) {
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
            if (!(object instanceof DtoInformixJDBCAdapter.Statements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoInformixJDBCAdapter.Statements that = ((DtoInformixJDBCAdapter.Statements) object);
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
