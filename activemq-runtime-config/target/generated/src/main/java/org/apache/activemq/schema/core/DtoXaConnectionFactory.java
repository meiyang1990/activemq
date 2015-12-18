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
 *           &lt;element name="blobTransferPolicy" minOccurs="0">
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
 *           &lt;element name="clientIdGenerator" minOccurs="0">
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
 *           &lt;element name="clientInternalExceptionListener" minOccurs="0">
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
 *           &lt;element name="connectionIdGenerator" minOccurs="0">
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
 *           &lt;element name="exceptionListener" minOccurs="0">
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
 *           &lt;element name="prefetchPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}prefetchPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
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
 *           &lt;element name="redeliveryPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="redeliveryPolicyMap" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
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
 *           &lt;element name="sessionTaskRunner" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="transformer" minOccurs="0">
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
 *           &lt;element name="transportListener" minOccurs="0">
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
 *       &lt;attribute name="alwaysSessionAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="alwaysSyncSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="auditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="auditMaximumProducerNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="beanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="blobTransferPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkForDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="clientID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientIDPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientIdGenerator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientInternalExceptionListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="closeTimeout" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="connectionIDPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionIdGenerator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerExpiryCheckEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="consumerFailoverRedeliveryWaitPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="copyMessageOnSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="disableTimeStampsByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dispatchAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="exceptionListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exclusiveConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxThreadPoolSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="messagePrioritySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nestedMapAndListEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nonBlockingRedelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="objectMessageSerializationDefered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="optimizeAcknowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="optimizeAcknowledgeTimeOut" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="optimizedAckScheduledAckInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="optimizedMessageDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefetchPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerWindowSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="properties" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeliveryPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeliveryPolicyMap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectedTaskHandler" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rmIdFromConnectionId" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sendAcksAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sendTimeout" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sessionTaskRunner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transactedIndividualAck" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transformer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transportListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useAsyncSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useBeanNameAsClientIdPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useDedicatedTaskRunner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useRetroactiveConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="warnAboutUnstartedConnectionTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="watchTopicAdvisories" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="xaAckMode" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener"
})
@XmlRootElement(name = "xaConnectionFactory")
public class DtoXaConnectionFactory
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "properties", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "clientInternalExceptionListener", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "connectionIdGenerator", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "redeliveryPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "exceptionListener", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "rejectedTaskHandler", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "clientIdGenerator", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "transformer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "prefetchPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "sessionTaskRunner", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "redeliveryPolicyMap", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "transportListener", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class),
        @XmlElementRef(name = "blobTransferPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
    @XmlAttribute(name = "alwaysSessionAsync")
    protected Boolean alwaysSessionAsync;
    @XmlAttribute(name = "alwaysSyncSend")
    protected Boolean alwaysSyncSend;
    @XmlAttribute(name = "auditDepth")
    protected BigInteger auditDepth;
    @XmlAttribute(name = "auditMaximumProducerNumber")
    protected BigInteger auditMaximumProducerNumber;
    @XmlAttribute(name = "beanName")
    protected String beanName;
    @XmlAttribute(name = "blobTransferPolicy")
    protected String blobTransferPolicy;
    @XmlAttribute(name = "brokerURL")
    protected String brokerURL;
    @XmlAttribute(name = "checkForDuplicates")
    protected Boolean checkForDuplicates;
    @XmlAttribute(name = "clientID")
    protected String clientID;
    @XmlAttribute(name = "clientIDPrefix")
    protected String clientIDPrefix;
    @XmlAttribute(name = "clientIdGenerator")
    protected String clientIdGenerator;
    @XmlAttribute(name = "clientInternalExceptionListener")
    protected String clientInternalExceptionListener;
    @XmlAttribute(name = "closeTimeout")
    protected BigInteger closeTimeout;
    @XmlAttribute(name = "connectionIDPrefix")
    protected String connectionIDPrefix;
    @XmlAttribute(name = "connectionIdGenerator")
    protected String connectionIdGenerator;
    @XmlAttribute(name = "consumerExpiryCheckEnabled")
    protected Boolean consumerExpiryCheckEnabled;
    @XmlAttribute(name = "consumerFailoverRedeliveryWaitPeriod")
    protected Long consumerFailoverRedeliveryWaitPeriod;
    @XmlAttribute(name = "copyMessageOnSend")
    protected Boolean copyMessageOnSend;
    @XmlAttribute(name = "disableTimeStampsByDefault")
    protected Boolean disableTimeStampsByDefault;
    @XmlAttribute(name = "dispatchAsync")
    protected Boolean dispatchAsync;
    @XmlAttribute(name = "exceptionListener")
    protected String exceptionListener;
    @XmlAttribute(name = "exclusiveConsumer")
    protected Boolean exclusiveConsumer;
    @XmlAttribute(name = "maxThreadPoolSize")
    protected BigInteger maxThreadPoolSize;
    @XmlAttribute(name = "messagePrioritySupported")
    protected Boolean messagePrioritySupported;
    @XmlAttribute(name = "nestedMapAndListEnabled")
    protected Boolean nestedMapAndListEnabled;
    @XmlAttribute(name = "nonBlockingRedelivery")
    protected Boolean nonBlockingRedelivery;
    @XmlAttribute(name = "objectMessageSerializationDefered")
    protected Boolean objectMessageSerializationDefered;
    @XmlAttribute(name = "optimizeAcknowledge")
    protected Boolean optimizeAcknowledge;
    @XmlAttribute(name = "optimizeAcknowledgeTimeOut")
    protected Long optimizeAcknowledgeTimeOut;
    @XmlAttribute(name = "optimizedAckScheduledAckInterval")
    protected Long optimizedAckScheduledAckInterval;
    @XmlAttribute(name = "optimizedMessageDispatch")
    protected Boolean optimizedMessageDispatch;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "prefetchPolicy")
    protected String prefetchPolicy;
    @XmlAttribute(name = "producerWindowSize")
    protected BigInteger producerWindowSize;
    @XmlAttribute(name = "properties")
    protected String properties;
    @XmlAttribute(name = "redeliveryPolicy")
    protected String redeliveryPolicy;
    @XmlAttribute(name = "redeliveryPolicyMap")
    protected String redeliveryPolicyMap;
    @XmlAttribute(name = "rejectedTaskHandler")
    protected String rejectedTaskHandler;
    @XmlAttribute(name = "rmIdFromConnectionId")
    protected Boolean rmIdFromConnectionId;
    @XmlAttribute(name = "sendAcksAsync")
    protected Boolean sendAcksAsync;
    @XmlAttribute(name = "sendTimeout")
    protected BigInteger sendTimeout;
    @XmlAttribute(name = "sessionTaskRunner")
    protected String sessionTaskRunner;
    @XmlAttribute(name = "statsEnabled")
    protected Boolean statsEnabled;
    @XmlAttribute(name = "transactedIndividualAck")
    protected Boolean transactedIndividualAck;
    @XmlAttribute(name = "transformer")
    protected String transformer;
    @XmlAttribute(name = "transportListener")
    protected String transportListener;
    @XmlAttribute(name = "useAsyncSend")
    protected Boolean useAsyncSend;
    @XmlAttribute(name = "useBeanNameAsClientIdPrefix")
    protected Boolean useBeanNameAsClientIdPrefix;
    @XmlAttribute(name = "useCompression")
    protected Boolean useCompression;
    @XmlAttribute(name = "useDedicatedTaskRunner")
    protected Boolean useDedicatedTaskRunner;
    @XmlAttribute(name = "useRetroactiveConsumer")
    protected Boolean useRetroactiveConsumer;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "warnAboutUnstartedConnectionTimeout")
    protected Long warnAboutUnstartedConnectionTimeout;
    @XmlAttribute(name = "watchTopicAdvisories")
    protected Boolean watchTopicAdvisories;
    @XmlAttribute(name = "xaAckMode")
    protected BigInteger xaAckMode;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.Properties }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ClientInternalExceptionListener }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ConnectionIdGenerator }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RedeliveryPolicy }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ExceptionListener }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RejectedTaskHandler }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ClientIdGenerator }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.Transformer }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.PrefetchPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.SessionTaskRunner }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RedeliveryPolicyMap }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.TransportListener }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.BlobTransferPolicy }{@code >}
     * 
     * 
     */
    public List<Object> getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener() {
        if (blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener == null) {
            blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener = new ArrayList<Object>();
        }
        return this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
    }

    /**
     * ��ȡalwaysSessionAsync���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysSessionAsync() {
        return alwaysSessionAsync;
    }

    /**
     * ����alwaysSessionAsync���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysSessionAsync(Boolean value) {
        this.alwaysSessionAsync = value;
    }

    /**
     * ��ȡalwaysSyncSend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysSyncSend() {
        return alwaysSyncSend;
    }

    /**
     * ����alwaysSyncSend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysSyncSend(Boolean value) {
        this.alwaysSyncSend = value;
    }

    /**
     * ��ȡauditDepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuditDepth() {
        return auditDepth;
    }

    /**
     * ����auditDepth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuditDepth(BigInteger value) {
        this.auditDepth = value;
    }

    /**
     * ��ȡauditMaximumProducerNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuditMaximumProducerNumber() {
        return auditMaximumProducerNumber;
    }

    /**
     * ����auditMaximumProducerNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuditMaximumProducerNumber(BigInteger value) {
        this.auditMaximumProducerNumber = value;
    }

    /**
     * ��ȡbeanName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * ����beanName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeanName(String value) {
        this.beanName = value;
    }

    /**
     * ��ȡblobTransferPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlobTransferPolicy() {
        return blobTransferPolicy;
    }

    /**
     * ����blobTransferPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlobTransferPolicy(String value) {
        this.blobTransferPolicy = value;
    }

    /**
     * ��ȡbrokerURL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerURL() {
        return brokerURL;
    }

    /**
     * ����brokerURL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerURL(String value) {
        this.brokerURL = value;
    }

    /**
     * ��ȡcheckForDuplicates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckForDuplicates() {
        return checkForDuplicates;
    }

    /**
     * ����checkForDuplicates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckForDuplicates(Boolean value) {
        this.checkForDuplicates = value;
    }

    /**
     * ��ȡclientID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * ����clientID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * ��ȡclientIDPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIDPrefix() {
        return clientIDPrefix;
    }

    /**
     * ����clientIDPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIDPrefix(String value) {
        this.clientIDPrefix = value;
    }

    /**
     * ��ȡclientIdGenerator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdGenerator() {
        return clientIdGenerator;
    }

    /**
     * ����clientIdGenerator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdGenerator(String value) {
        this.clientIdGenerator = value;
    }

    /**
     * ��ȡclientInternalExceptionListener���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientInternalExceptionListener() {
        return clientInternalExceptionListener;
    }

    /**
     * ����clientInternalExceptionListener���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientInternalExceptionListener(String value) {
        this.clientInternalExceptionListener = value;
    }

    /**
     * ��ȡcloseTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCloseTimeout() {
        return closeTimeout;
    }

    /**
     * ����closeTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCloseTimeout(BigInteger value) {
        this.closeTimeout = value;
    }

    /**
     * ��ȡconnectionIDPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionIDPrefix() {
        return connectionIDPrefix;
    }

    /**
     * ����connectionIDPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionIDPrefix(String value) {
        this.connectionIDPrefix = value;
    }

    /**
     * ��ȡconnectionIdGenerator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionIdGenerator() {
        return connectionIdGenerator;
    }

    /**
     * ����connectionIdGenerator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionIdGenerator(String value) {
        this.connectionIdGenerator = value;
    }

    /**
     * ��ȡconsumerExpiryCheckEnabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsumerExpiryCheckEnabled() {
        return consumerExpiryCheckEnabled;
    }

    /**
     * ����consumerExpiryCheckEnabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsumerExpiryCheckEnabled(Boolean value) {
        this.consumerExpiryCheckEnabled = value;
    }

    /**
     * ��ȡconsumerFailoverRedeliveryWaitPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumerFailoverRedeliveryWaitPeriod() {
        return consumerFailoverRedeliveryWaitPeriod;
    }

    /**
     * ����consumerFailoverRedeliveryWaitPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumerFailoverRedeliveryWaitPeriod(Long value) {
        this.consumerFailoverRedeliveryWaitPeriod = value;
    }

    /**
     * ��ȡcopyMessageOnSend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyMessageOnSend() {
        return copyMessageOnSend;
    }

    /**
     * ����copyMessageOnSend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyMessageOnSend(Boolean value) {
        this.copyMessageOnSend = value;
    }

    /**
     * ��ȡdisableTimeStampsByDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableTimeStampsByDefault() {
        return disableTimeStampsByDefault;
    }

    /**
     * ����disableTimeStampsByDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableTimeStampsByDefault(Boolean value) {
        this.disableTimeStampsByDefault = value;
    }

    /**
     * ��ȡdispatchAsync���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatchAsync() {
        return dispatchAsync;
    }

    /**
     * ����dispatchAsync���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatchAsync(Boolean value) {
        this.dispatchAsync = value;
    }

    /**
     * ��ȡexceptionListener���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionListener() {
        return exceptionListener;
    }

    /**
     * ����exceptionListener���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionListener(String value) {
        this.exceptionListener = value;
    }

    /**
     * ��ȡexclusiveConsumer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusiveConsumer() {
        return exclusiveConsumer;
    }

    /**
     * ����exclusiveConsumer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusiveConsumer(Boolean value) {
        this.exclusiveConsumer = value;
    }

    /**
     * ��ȡmaxThreadPoolSize���Ե�ֵ��
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
     * ����maxThreadPoolSize���Ե�ֵ��
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
     * ��ȡmessagePrioritySupported���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessagePrioritySupported() {
        return messagePrioritySupported;
    }

    /**
     * ����messagePrioritySupported���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessagePrioritySupported(Boolean value) {
        this.messagePrioritySupported = value;
    }

    /**
     * ��ȡnestedMapAndListEnabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNestedMapAndListEnabled() {
        return nestedMapAndListEnabled;
    }

    /**
     * ����nestedMapAndListEnabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNestedMapAndListEnabled(Boolean value) {
        this.nestedMapAndListEnabled = value;
    }

    /**
     * ��ȡnonBlockingRedelivery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonBlockingRedelivery() {
        return nonBlockingRedelivery;
    }

    /**
     * ����nonBlockingRedelivery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonBlockingRedelivery(Boolean value) {
        this.nonBlockingRedelivery = value;
    }

    /**
     * ��ȡobjectMessageSerializationDefered���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjectMessageSerializationDefered() {
        return objectMessageSerializationDefered;
    }

    /**
     * ����objectMessageSerializationDefered���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjectMessageSerializationDefered(Boolean value) {
        this.objectMessageSerializationDefered = value;
    }

    /**
     * ��ȡoptimizeAcknowledge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizeAcknowledge() {
        return optimizeAcknowledge;
    }

    /**
     * ����optimizeAcknowledge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizeAcknowledge(Boolean value) {
        this.optimizeAcknowledge = value;
    }

    /**
     * ��ȡoptimizeAcknowledgeTimeOut���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptimizeAcknowledgeTimeOut() {
        return optimizeAcknowledgeTimeOut;
    }

    /**
     * ����optimizeAcknowledgeTimeOut���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptimizeAcknowledgeTimeOut(Long value) {
        this.optimizeAcknowledgeTimeOut = value;
    }

    /**
     * ��ȡoptimizedAckScheduledAckInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptimizedAckScheduledAckInterval() {
        return optimizedAckScheduledAckInterval;
    }

    /**
     * ����optimizedAckScheduledAckInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptimizedAckScheduledAckInterval(Long value) {
        this.optimizedAckScheduledAckInterval = value;
    }

    /**
     * ��ȡoptimizedMessageDispatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizedMessageDispatch() {
        return optimizedMessageDispatch;
    }

    /**
     * ����optimizedMessageDispatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizedMessageDispatch(Boolean value) {
        this.optimizedMessageDispatch = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡprefetchPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefetchPolicy() {
        return prefetchPolicy;
    }

    /**
     * ����prefetchPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefetchPolicy(String value) {
        this.prefetchPolicy = value;
    }

    /**
     * ��ȡproducerWindowSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProducerWindowSize() {
        return producerWindowSize;
    }

    /**
     * ����producerWindowSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProducerWindowSize(BigInteger value) {
        this.producerWindowSize = value;
    }

    /**
     * ��ȡproperties���Ե�ֵ��
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
     * ����properties���Ե�ֵ��
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
     * ��ȡredeliveryPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeliveryPolicy() {
        return redeliveryPolicy;
    }

    /**
     * ����redeliveryPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeliveryPolicy(String value) {
        this.redeliveryPolicy = value;
    }

    /**
     * ��ȡredeliveryPolicyMap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeliveryPolicyMap() {
        return redeliveryPolicyMap;
    }

    /**
     * ����redeliveryPolicyMap���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeliveryPolicyMap(String value) {
        this.redeliveryPolicyMap = value;
    }

    /**
     * ��ȡrejectedTaskHandler���Ե�ֵ��
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
     * ����rejectedTaskHandler���Ե�ֵ��
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
     * ��ȡrmIdFromConnectionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmIdFromConnectionId() {
        return rmIdFromConnectionId;
    }

    /**
     * ����rmIdFromConnectionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRmIdFromConnectionId(Boolean value) {
        this.rmIdFromConnectionId = value;
    }

    /**
     * ��ȡsendAcksAsync���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendAcksAsync() {
        return sendAcksAsync;
    }

    /**
     * ����sendAcksAsync���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendAcksAsync(Boolean value) {
        this.sendAcksAsync = value;
    }

    /**
     * ��ȡsendTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSendTimeout() {
        return sendTimeout;
    }

    /**
     * ����sendTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSendTimeout(BigInteger value) {
        this.sendTimeout = value;
    }

    /**
     * ��ȡsessionTaskRunner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionTaskRunner() {
        return sessionTaskRunner;
    }

    /**
     * ����sessionTaskRunner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionTaskRunner(String value) {
        this.sessionTaskRunner = value;
    }

    /**
     * ��ȡstatsEnabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatsEnabled() {
        return statsEnabled;
    }

    /**
     * ����statsEnabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatsEnabled(Boolean value) {
        this.statsEnabled = value;
    }

    /**
     * ��ȡtransactedIndividualAck���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactedIndividualAck() {
        return transactedIndividualAck;
    }

    /**
     * ����transactedIndividualAck���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactedIndividualAck(Boolean value) {
        this.transactedIndividualAck = value;
    }

    /**
     * ��ȡtransformer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformer() {
        return transformer;
    }

    /**
     * ����transformer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformer(String value) {
        this.transformer = value;
    }

    /**
     * ��ȡtransportListener���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportListener() {
        return transportListener;
    }

    /**
     * ����transportListener���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportListener(String value) {
        this.transportListener = value;
    }

    /**
     * ��ȡuseAsyncSend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAsyncSend() {
        return useAsyncSend;
    }

    /**
     * ����useAsyncSend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAsyncSend(Boolean value) {
        this.useAsyncSend = value;
    }

    /**
     * ��ȡuseBeanNameAsClientIdPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBeanNameAsClientIdPrefix() {
        return useBeanNameAsClientIdPrefix;
    }

    /**
     * ����useBeanNameAsClientIdPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBeanNameAsClientIdPrefix(Boolean value) {
        this.useBeanNameAsClientIdPrefix = value;
    }

    /**
     * ��ȡuseCompression���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCompression() {
        return useCompression;
    }

    /**
     * ����useCompression���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCompression(Boolean value) {
        this.useCompression = value;
    }

    /**
     * ��ȡuseDedicatedTaskRunner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDedicatedTaskRunner() {
        return useDedicatedTaskRunner;
    }

    /**
     * ����useDedicatedTaskRunner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDedicatedTaskRunner(Boolean value) {
        this.useDedicatedTaskRunner = value;
    }

    /**
     * ��ȡuseRetroactiveConsumer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRetroactiveConsumer() {
        return useRetroactiveConsumer;
    }

    /**
     * ����useRetroactiveConsumer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRetroactiveConsumer(Boolean value) {
        this.useRetroactiveConsumer = value;
    }

    /**
     * ��ȡuserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ����userName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * ��ȡwarnAboutUnstartedConnectionTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarnAboutUnstartedConnectionTimeout() {
        return warnAboutUnstartedConnectionTimeout;
    }

    /**
     * ����warnAboutUnstartedConnectionTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarnAboutUnstartedConnectionTimeout(Long value) {
        this.warnAboutUnstartedConnectionTimeout = value;
    }

    /**
     * ��ȡwatchTopicAdvisories���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWatchTopicAdvisories() {
        return watchTopicAdvisories;
    }

    /**
     * ����watchTopicAdvisories���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWatchTopicAdvisories(Boolean value) {
        this.watchTopicAdvisories = value;
    }

    /**
     * ��ȡxaAckMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXaAckMode() {
        return xaAckMode;
    }

    /**
     * ����xaAckMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXaAckMode(BigInteger value) {
        this.xaAckMode = value;
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
            List<Object> theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
            theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener = (((this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener!= null)&&(!this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener.isEmpty()))?this.getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener():null);
            strategy.appendField(locator, this, "blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener", buffer, theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener);
        }
        {
            Boolean theAlwaysSessionAsync;
            theAlwaysSessionAsync = this.isAlwaysSessionAsync();
            strategy.appendField(locator, this, "alwaysSessionAsync", buffer, theAlwaysSessionAsync);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            strategy.appendField(locator, this, "alwaysSyncSend", buffer, theAlwaysSyncSend);
        }
        {
            BigInteger theAuditDepth;
            theAuditDepth = this.getAuditDepth();
            strategy.appendField(locator, this, "auditDepth", buffer, theAuditDepth);
        }
        {
            BigInteger theAuditMaximumProducerNumber;
            theAuditMaximumProducerNumber = this.getAuditMaximumProducerNumber();
            strategy.appendField(locator, this, "auditMaximumProducerNumber", buffer, theAuditMaximumProducerNumber);
        }
        {
            String theBeanName;
            theBeanName = this.getBeanName();
            strategy.appendField(locator, this, "beanName", buffer, theBeanName);
        }
        {
            String theBlobTransferPolicy;
            theBlobTransferPolicy = this.getBlobTransferPolicy();
            strategy.appendField(locator, this, "blobTransferPolicy", buffer, theBlobTransferPolicy);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            strategy.appendField(locator, this, "brokerURL", buffer, theBrokerURL);
        }
        {
            Boolean theCheckForDuplicates;
            theCheckForDuplicates = this.isCheckForDuplicates();
            strategy.appendField(locator, this, "checkForDuplicates", buffer, theCheckForDuplicates);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            strategy.appendField(locator, this, "clientID", buffer, theClientID);
        }
        {
            String theClientIDPrefix;
            theClientIDPrefix = this.getClientIDPrefix();
            strategy.appendField(locator, this, "clientIDPrefix", buffer, theClientIDPrefix);
        }
        {
            String theClientIdGenerator;
            theClientIdGenerator = this.getClientIdGenerator();
            strategy.appendField(locator, this, "clientIdGenerator", buffer, theClientIdGenerator);
        }
        {
            String theClientInternalExceptionListener;
            theClientInternalExceptionListener = this.getClientInternalExceptionListener();
            strategy.appendField(locator, this, "clientInternalExceptionListener", buffer, theClientInternalExceptionListener);
        }
        {
            BigInteger theCloseTimeout;
            theCloseTimeout = this.getCloseTimeout();
            strategy.appendField(locator, this, "closeTimeout", buffer, theCloseTimeout);
        }
        {
            String theConnectionIDPrefix;
            theConnectionIDPrefix = this.getConnectionIDPrefix();
            strategy.appendField(locator, this, "connectionIDPrefix", buffer, theConnectionIDPrefix);
        }
        {
            String theConnectionIdGenerator;
            theConnectionIdGenerator = this.getConnectionIdGenerator();
            strategy.appendField(locator, this, "connectionIdGenerator", buffer, theConnectionIdGenerator);
        }
        {
            Boolean theConsumerExpiryCheckEnabled;
            theConsumerExpiryCheckEnabled = this.isConsumerExpiryCheckEnabled();
            strategy.appendField(locator, this, "consumerExpiryCheckEnabled", buffer, theConsumerExpiryCheckEnabled);
        }
        {
            Long theConsumerFailoverRedeliveryWaitPeriod;
            theConsumerFailoverRedeliveryWaitPeriod = this.getConsumerFailoverRedeliveryWaitPeriod();
            strategy.appendField(locator, this, "consumerFailoverRedeliveryWaitPeriod", buffer, theConsumerFailoverRedeliveryWaitPeriod);
        }
        {
            Boolean theCopyMessageOnSend;
            theCopyMessageOnSend = this.isCopyMessageOnSend();
            strategy.appendField(locator, this, "copyMessageOnSend", buffer, theCopyMessageOnSend);
        }
        {
            Boolean theDisableTimeStampsByDefault;
            theDisableTimeStampsByDefault = this.isDisableTimeStampsByDefault();
            strategy.appendField(locator, this, "disableTimeStampsByDefault", buffer, theDisableTimeStampsByDefault);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            strategy.appendField(locator, this, "dispatchAsync", buffer, theDispatchAsync);
        }
        {
            String theExceptionListener;
            theExceptionListener = this.getExceptionListener();
            strategy.appendField(locator, this, "exceptionListener", buffer, theExceptionListener);
        }
        {
            Boolean theExclusiveConsumer;
            theExclusiveConsumer = this.isExclusiveConsumer();
            strategy.appendField(locator, this, "exclusiveConsumer", buffer, theExclusiveConsumer);
        }
        {
            BigInteger theMaxThreadPoolSize;
            theMaxThreadPoolSize = this.getMaxThreadPoolSize();
            strategy.appendField(locator, this, "maxThreadPoolSize", buffer, theMaxThreadPoolSize);
        }
        {
            Boolean theMessagePrioritySupported;
            theMessagePrioritySupported = this.isMessagePrioritySupported();
            strategy.appendField(locator, this, "messagePrioritySupported", buffer, theMessagePrioritySupported);
        }
        {
            Boolean theNestedMapAndListEnabled;
            theNestedMapAndListEnabled = this.isNestedMapAndListEnabled();
            strategy.appendField(locator, this, "nestedMapAndListEnabled", buffer, theNestedMapAndListEnabled);
        }
        {
            Boolean theNonBlockingRedelivery;
            theNonBlockingRedelivery = this.isNonBlockingRedelivery();
            strategy.appendField(locator, this, "nonBlockingRedelivery", buffer, theNonBlockingRedelivery);
        }
        {
            Boolean theObjectMessageSerializationDefered;
            theObjectMessageSerializationDefered = this.isObjectMessageSerializationDefered();
            strategy.appendField(locator, this, "objectMessageSerializationDefered", buffer, theObjectMessageSerializationDefered);
        }
        {
            Boolean theOptimizeAcknowledge;
            theOptimizeAcknowledge = this.isOptimizeAcknowledge();
            strategy.appendField(locator, this, "optimizeAcknowledge", buffer, theOptimizeAcknowledge);
        }
        {
            Long theOptimizeAcknowledgeTimeOut;
            theOptimizeAcknowledgeTimeOut = this.getOptimizeAcknowledgeTimeOut();
            strategy.appendField(locator, this, "optimizeAcknowledgeTimeOut", buffer, theOptimizeAcknowledgeTimeOut);
        }
        {
            Long theOptimizedAckScheduledAckInterval;
            theOptimizedAckScheduledAckInterval = this.getOptimizedAckScheduledAckInterval();
            strategy.appendField(locator, this, "optimizedAckScheduledAckInterval", buffer, theOptimizedAckScheduledAckInterval);
        }
        {
            Boolean theOptimizedMessageDispatch;
            theOptimizedMessageDispatch = this.isOptimizedMessageDispatch();
            strategy.appendField(locator, this, "optimizedMessageDispatch", buffer, theOptimizedMessageDispatch);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            String thePrefetchPolicy;
            thePrefetchPolicy = this.getPrefetchPolicy();
            strategy.appendField(locator, this, "prefetchPolicy", buffer, thePrefetchPolicy);
        }
        {
            BigInteger theProducerWindowSize;
            theProducerWindowSize = this.getProducerWindowSize();
            strategy.appendField(locator, this, "producerWindowSize", buffer, theProducerWindowSize);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties);
        }
        {
            String theRedeliveryPolicy;
            theRedeliveryPolicy = this.getRedeliveryPolicy();
            strategy.appendField(locator, this, "redeliveryPolicy", buffer, theRedeliveryPolicy);
        }
        {
            String theRedeliveryPolicyMap;
            theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
            strategy.appendField(locator, this, "redeliveryPolicyMap", buffer, theRedeliveryPolicyMap);
        }
        {
            String theRejectedTaskHandler;
            theRejectedTaskHandler = this.getRejectedTaskHandler();
            strategy.appendField(locator, this, "rejectedTaskHandler", buffer, theRejectedTaskHandler);
        }
        {
            Boolean theRmIdFromConnectionId;
            theRmIdFromConnectionId = this.isRmIdFromConnectionId();
            strategy.appendField(locator, this, "rmIdFromConnectionId", buffer, theRmIdFromConnectionId);
        }
        {
            Boolean theSendAcksAsync;
            theSendAcksAsync = this.isSendAcksAsync();
            strategy.appendField(locator, this, "sendAcksAsync", buffer, theSendAcksAsync);
        }
        {
            BigInteger theSendTimeout;
            theSendTimeout = this.getSendTimeout();
            strategy.appendField(locator, this, "sendTimeout", buffer, theSendTimeout);
        }
        {
            String theSessionTaskRunner;
            theSessionTaskRunner = this.getSessionTaskRunner();
            strategy.appendField(locator, this, "sessionTaskRunner", buffer, theSessionTaskRunner);
        }
        {
            Boolean theStatsEnabled;
            theStatsEnabled = this.isStatsEnabled();
            strategy.appendField(locator, this, "statsEnabled", buffer, theStatsEnabled);
        }
        {
            Boolean theTransactedIndividualAck;
            theTransactedIndividualAck = this.isTransactedIndividualAck();
            strategy.appendField(locator, this, "transactedIndividualAck", buffer, theTransactedIndividualAck);
        }
        {
            String theTransformer;
            theTransformer = this.getTransformer();
            strategy.appendField(locator, this, "transformer", buffer, theTransformer);
        }
        {
            String theTransportListener;
            theTransportListener = this.getTransportListener();
            strategy.appendField(locator, this, "transportListener", buffer, theTransportListener);
        }
        {
            Boolean theUseAsyncSend;
            theUseAsyncSend = this.isUseAsyncSend();
            strategy.appendField(locator, this, "useAsyncSend", buffer, theUseAsyncSend);
        }
        {
            Boolean theUseBeanNameAsClientIdPrefix;
            theUseBeanNameAsClientIdPrefix = this.isUseBeanNameAsClientIdPrefix();
            strategy.appendField(locator, this, "useBeanNameAsClientIdPrefix", buffer, theUseBeanNameAsClientIdPrefix);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            strategy.appendField(locator, this, "useCompression", buffer, theUseCompression);
        }
        {
            Boolean theUseDedicatedTaskRunner;
            theUseDedicatedTaskRunner = this.isUseDedicatedTaskRunner();
            strategy.appendField(locator, this, "useDedicatedTaskRunner", buffer, theUseDedicatedTaskRunner);
        }
        {
            Boolean theUseRetroactiveConsumer;
            theUseRetroactiveConsumer = this.isUseRetroactiveConsumer();
            strategy.appendField(locator, this, "useRetroactiveConsumer", buffer, theUseRetroactiveConsumer);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            strategy.appendField(locator, this, "userName", buffer, theUserName);
        }
        {
            Long theWarnAboutUnstartedConnectionTimeout;
            theWarnAboutUnstartedConnectionTimeout = this.getWarnAboutUnstartedConnectionTimeout();
            strategy.appendField(locator, this, "warnAboutUnstartedConnectionTimeout", buffer, theWarnAboutUnstartedConnectionTimeout);
        }
        {
            Boolean theWatchTopicAdvisories;
            theWatchTopicAdvisories = this.isWatchTopicAdvisories();
            strategy.appendField(locator, this, "watchTopicAdvisories", buffer, theWatchTopicAdvisories);
        }
        {
            BigInteger theXaAckMode;
            theXaAckMode = this.getXaAckMode();
            strategy.appendField(locator, this, "xaAckMode", buffer, theXaAckMode);
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
            List<Object> theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
            theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener = (((this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener!= null)&&(!this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener.isEmpty()))?this.getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener", theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener), currentHashCode, theBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener);
        }
        {
            Boolean theAlwaysSessionAsync;
            theAlwaysSessionAsync = this.isAlwaysSessionAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alwaysSessionAsync", theAlwaysSessionAsync), currentHashCode, theAlwaysSessionAsync);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alwaysSyncSend", theAlwaysSyncSend), currentHashCode, theAlwaysSyncSend);
        }
        {
            BigInteger theAuditDepth;
            theAuditDepth = this.getAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auditDepth", theAuditDepth), currentHashCode, theAuditDepth);
        }
        {
            BigInteger theAuditMaximumProducerNumber;
            theAuditMaximumProducerNumber = this.getAuditMaximumProducerNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auditMaximumProducerNumber", theAuditMaximumProducerNumber), currentHashCode, theAuditMaximumProducerNumber);
        }
        {
            String theBeanName;
            theBeanName = this.getBeanName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beanName", theBeanName), currentHashCode, theBeanName);
        }
        {
            String theBlobTransferPolicy;
            theBlobTransferPolicy = this.getBlobTransferPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blobTransferPolicy", theBlobTransferPolicy), currentHashCode, theBlobTransferPolicy);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerURL", theBrokerURL), currentHashCode, theBrokerURL);
        }
        {
            Boolean theCheckForDuplicates;
            theCheckForDuplicates = this.isCheckForDuplicates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkForDuplicates", theCheckForDuplicates), currentHashCode, theCheckForDuplicates);
        }
        {
            String theClientID;
            theClientID = this.getClientID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID);
        }
        {
            String theClientIDPrefix;
            theClientIDPrefix = this.getClientIDPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIDPrefix", theClientIDPrefix), currentHashCode, theClientIDPrefix);
        }
        {
            String theClientIdGenerator;
            theClientIdGenerator = this.getClientIdGenerator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIdGenerator", theClientIdGenerator), currentHashCode, theClientIdGenerator);
        }
        {
            String theClientInternalExceptionListener;
            theClientInternalExceptionListener = this.getClientInternalExceptionListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientInternalExceptionListener", theClientInternalExceptionListener), currentHashCode, theClientInternalExceptionListener);
        }
        {
            BigInteger theCloseTimeout;
            theCloseTimeout = this.getCloseTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "closeTimeout", theCloseTimeout), currentHashCode, theCloseTimeout);
        }
        {
            String theConnectionIDPrefix;
            theConnectionIDPrefix = this.getConnectionIDPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionIDPrefix", theConnectionIDPrefix), currentHashCode, theConnectionIDPrefix);
        }
        {
            String theConnectionIdGenerator;
            theConnectionIdGenerator = this.getConnectionIdGenerator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionIdGenerator", theConnectionIdGenerator), currentHashCode, theConnectionIdGenerator);
        }
        {
            Boolean theConsumerExpiryCheckEnabled;
            theConsumerExpiryCheckEnabled = this.isConsumerExpiryCheckEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerExpiryCheckEnabled", theConsumerExpiryCheckEnabled), currentHashCode, theConsumerExpiryCheckEnabled);
        }
        {
            Long theConsumerFailoverRedeliveryWaitPeriod;
            theConsumerFailoverRedeliveryWaitPeriod = this.getConsumerFailoverRedeliveryWaitPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerFailoverRedeliveryWaitPeriod", theConsumerFailoverRedeliveryWaitPeriod), currentHashCode, theConsumerFailoverRedeliveryWaitPeriod);
        }
        {
            Boolean theCopyMessageOnSend;
            theCopyMessageOnSend = this.isCopyMessageOnSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copyMessageOnSend", theCopyMessageOnSend), currentHashCode, theCopyMessageOnSend);
        }
        {
            Boolean theDisableTimeStampsByDefault;
            theDisableTimeStampsByDefault = this.isDisableTimeStampsByDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disableTimeStampsByDefault", theDisableTimeStampsByDefault), currentHashCode, theDisableTimeStampsByDefault);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispatchAsync", theDispatchAsync), currentHashCode, theDispatchAsync);
        }
        {
            String theExceptionListener;
            theExceptionListener = this.getExceptionListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionListener", theExceptionListener), currentHashCode, theExceptionListener);
        }
        {
            Boolean theExclusiveConsumer;
            theExclusiveConsumer = this.isExclusiveConsumer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exclusiveConsumer", theExclusiveConsumer), currentHashCode, theExclusiveConsumer);
        }
        {
            BigInteger theMaxThreadPoolSize;
            theMaxThreadPoolSize = this.getMaxThreadPoolSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxThreadPoolSize", theMaxThreadPoolSize), currentHashCode, theMaxThreadPoolSize);
        }
        {
            Boolean theMessagePrioritySupported;
            theMessagePrioritySupported = this.isMessagePrioritySupported();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messagePrioritySupported", theMessagePrioritySupported), currentHashCode, theMessagePrioritySupported);
        }
        {
            Boolean theNestedMapAndListEnabled;
            theNestedMapAndListEnabled = this.isNestedMapAndListEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nestedMapAndListEnabled", theNestedMapAndListEnabled), currentHashCode, theNestedMapAndListEnabled);
        }
        {
            Boolean theNonBlockingRedelivery;
            theNonBlockingRedelivery = this.isNonBlockingRedelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nonBlockingRedelivery", theNonBlockingRedelivery), currentHashCode, theNonBlockingRedelivery);
        }
        {
            Boolean theObjectMessageSerializationDefered;
            theObjectMessageSerializationDefered = this.isObjectMessageSerializationDefered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectMessageSerializationDefered", theObjectMessageSerializationDefered), currentHashCode, theObjectMessageSerializationDefered);
        }
        {
            Boolean theOptimizeAcknowledge;
            theOptimizeAcknowledge = this.isOptimizeAcknowledge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizeAcknowledge", theOptimizeAcknowledge), currentHashCode, theOptimizeAcknowledge);
        }
        {
            Long theOptimizeAcknowledgeTimeOut;
            theOptimizeAcknowledgeTimeOut = this.getOptimizeAcknowledgeTimeOut();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizeAcknowledgeTimeOut", theOptimizeAcknowledgeTimeOut), currentHashCode, theOptimizeAcknowledgeTimeOut);
        }
        {
            Long theOptimizedAckScheduledAckInterval;
            theOptimizedAckScheduledAckInterval = this.getOptimizedAckScheduledAckInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizedAckScheduledAckInterval", theOptimizedAckScheduledAckInterval), currentHashCode, theOptimizedAckScheduledAckInterval);
        }
        {
            Boolean theOptimizedMessageDispatch;
            theOptimizedMessageDispatch = this.isOptimizedMessageDispatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optimizedMessageDispatch", theOptimizedMessageDispatch), currentHashCode, theOptimizedMessageDispatch);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
        }
        {
            String thePrefetchPolicy;
            thePrefetchPolicy = this.getPrefetchPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchPolicy", thePrefetchPolicy), currentHashCode, thePrefetchPolicy);
        }
        {
            BigInteger theProducerWindowSize;
            theProducerWindowSize = this.getProducerWindowSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerWindowSize", theProducerWindowSize), currentHashCode, theProducerWindowSize);
        }
        {
            String theProperties;
            theProperties = this.getProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "properties", theProperties), currentHashCode, theProperties);
        }
        {
            String theRedeliveryPolicy;
            theRedeliveryPolicy = this.getRedeliveryPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicy", theRedeliveryPolicy), currentHashCode, theRedeliveryPolicy);
        }
        {
            String theRedeliveryPolicyMap;
            theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicyMap", theRedeliveryPolicyMap), currentHashCode, theRedeliveryPolicyMap);
        }
        {
            String theRejectedTaskHandler;
            theRejectedTaskHandler = this.getRejectedTaskHandler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectedTaskHandler", theRejectedTaskHandler), currentHashCode, theRejectedTaskHandler);
        }
        {
            Boolean theRmIdFromConnectionId;
            theRmIdFromConnectionId = this.isRmIdFromConnectionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmIdFromConnectionId", theRmIdFromConnectionId), currentHashCode, theRmIdFromConnectionId);
        }
        {
            Boolean theSendAcksAsync;
            theSendAcksAsync = this.isSendAcksAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendAcksAsync", theSendAcksAsync), currentHashCode, theSendAcksAsync);
        }
        {
            BigInteger theSendTimeout;
            theSendTimeout = this.getSendTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendTimeout", theSendTimeout), currentHashCode, theSendTimeout);
        }
        {
            String theSessionTaskRunner;
            theSessionTaskRunner = this.getSessionTaskRunner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sessionTaskRunner", theSessionTaskRunner), currentHashCode, theSessionTaskRunner);
        }
        {
            Boolean theStatsEnabled;
            theStatsEnabled = this.isStatsEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statsEnabled", theStatsEnabled), currentHashCode, theStatsEnabled);
        }
        {
            Boolean theTransactedIndividualAck;
            theTransactedIndividualAck = this.isTransactedIndividualAck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactedIndividualAck", theTransactedIndividualAck), currentHashCode, theTransactedIndividualAck);
        }
        {
            String theTransformer;
            theTransformer = this.getTransformer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transformer", theTransformer), currentHashCode, theTransformer);
        }
        {
            String theTransportListener;
            theTransportListener = this.getTransportListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportListener", theTransportListener), currentHashCode, theTransportListener);
        }
        {
            Boolean theUseAsyncSend;
            theUseAsyncSend = this.isUseAsyncSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useAsyncSend", theUseAsyncSend), currentHashCode, theUseAsyncSend);
        }
        {
            Boolean theUseBeanNameAsClientIdPrefix;
            theUseBeanNameAsClientIdPrefix = this.isUseBeanNameAsClientIdPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useBeanNameAsClientIdPrefix", theUseBeanNameAsClientIdPrefix), currentHashCode, theUseBeanNameAsClientIdPrefix);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCompression", theUseCompression), currentHashCode, theUseCompression);
        }
        {
            Boolean theUseDedicatedTaskRunner;
            theUseDedicatedTaskRunner = this.isUseDedicatedTaskRunner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useDedicatedTaskRunner", theUseDedicatedTaskRunner), currentHashCode, theUseDedicatedTaskRunner);
        }
        {
            Boolean theUseRetroactiveConsumer;
            theUseRetroactiveConsumer = this.isUseRetroactiveConsumer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useRetroactiveConsumer", theUseRetroactiveConsumer), currentHashCode, theUseRetroactiveConsumer);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
        }
        {
            Long theWarnAboutUnstartedConnectionTimeout;
            theWarnAboutUnstartedConnectionTimeout = this.getWarnAboutUnstartedConnectionTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnAboutUnstartedConnectionTimeout", theWarnAboutUnstartedConnectionTimeout), currentHashCode, theWarnAboutUnstartedConnectionTimeout);
        }
        {
            Boolean theWatchTopicAdvisories;
            theWatchTopicAdvisories = this.isWatchTopicAdvisories();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "watchTopicAdvisories", theWatchTopicAdvisories), currentHashCode, theWatchTopicAdvisories);
        }
        {
            BigInteger theXaAckMode;
            theXaAckMode = this.getXaAckMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xaAckMode", theXaAckMode), currentHashCode, theXaAckMode);
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
        if (!(object instanceof DtoXaConnectionFactory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoXaConnectionFactory that = ((DtoXaConnectionFactory) object);
        {
            List<Object> lhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
            lhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener = (((this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener!= null)&&(!this.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener.isEmpty()))?this.getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener():null);
            List<Object> rhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener;
            rhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener = (((that.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener!= null)&&(!that.blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener.isEmpty()))?that.getBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener", lhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener), LocatorUtils.property(thatLocator, "blobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener", rhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener), lhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener, rhsBlobTransferPolicyOrClientIdGeneratorOrClientInternalExceptionListener)) {
                return false;
            }
        }
        {
            Boolean lhsAlwaysSessionAsync;
            lhsAlwaysSessionAsync = this.isAlwaysSessionAsync();
            Boolean rhsAlwaysSessionAsync;
            rhsAlwaysSessionAsync = that.isAlwaysSessionAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alwaysSessionAsync", lhsAlwaysSessionAsync), LocatorUtils.property(thatLocator, "alwaysSessionAsync", rhsAlwaysSessionAsync), lhsAlwaysSessionAsync, rhsAlwaysSessionAsync)) {
                return false;
            }
        }
        {
            Boolean lhsAlwaysSyncSend;
            lhsAlwaysSyncSend = this.isAlwaysSyncSend();
            Boolean rhsAlwaysSyncSend;
            rhsAlwaysSyncSend = that.isAlwaysSyncSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alwaysSyncSend", lhsAlwaysSyncSend), LocatorUtils.property(thatLocator, "alwaysSyncSend", rhsAlwaysSyncSend), lhsAlwaysSyncSend, rhsAlwaysSyncSend)) {
                return false;
            }
        }
        {
            BigInteger lhsAuditDepth;
            lhsAuditDepth = this.getAuditDepth();
            BigInteger rhsAuditDepth;
            rhsAuditDepth = that.getAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auditDepth", lhsAuditDepth), LocatorUtils.property(thatLocator, "auditDepth", rhsAuditDepth), lhsAuditDepth, rhsAuditDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsAuditMaximumProducerNumber;
            lhsAuditMaximumProducerNumber = this.getAuditMaximumProducerNumber();
            BigInteger rhsAuditMaximumProducerNumber;
            rhsAuditMaximumProducerNumber = that.getAuditMaximumProducerNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auditMaximumProducerNumber", lhsAuditMaximumProducerNumber), LocatorUtils.property(thatLocator, "auditMaximumProducerNumber", rhsAuditMaximumProducerNumber), lhsAuditMaximumProducerNumber, rhsAuditMaximumProducerNumber)) {
                return false;
            }
        }
        {
            String lhsBeanName;
            lhsBeanName = this.getBeanName();
            String rhsBeanName;
            rhsBeanName = that.getBeanName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beanName", lhsBeanName), LocatorUtils.property(thatLocator, "beanName", rhsBeanName), lhsBeanName, rhsBeanName)) {
                return false;
            }
        }
        {
            String lhsBlobTransferPolicy;
            lhsBlobTransferPolicy = this.getBlobTransferPolicy();
            String rhsBlobTransferPolicy;
            rhsBlobTransferPolicy = that.getBlobTransferPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blobTransferPolicy", lhsBlobTransferPolicy), LocatorUtils.property(thatLocator, "blobTransferPolicy", rhsBlobTransferPolicy), lhsBlobTransferPolicy, rhsBlobTransferPolicy)) {
                return false;
            }
        }
        {
            String lhsBrokerURL;
            lhsBrokerURL = this.getBrokerURL();
            String rhsBrokerURL;
            rhsBrokerURL = that.getBrokerURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerURL", lhsBrokerURL), LocatorUtils.property(thatLocator, "brokerURL", rhsBrokerURL), lhsBrokerURL, rhsBrokerURL)) {
                return false;
            }
        }
        {
            Boolean lhsCheckForDuplicates;
            lhsCheckForDuplicates = this.isCheckForDuplicates();
            Boolean rhsCheckForDuplicates;
            rhsCheckForDuplicates = that.isCheckForDuplicates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkForDuplicates", lhsCheckForDuplicates), LocatorUtils.property(thatLocator, "checkForDuplicates", rhsCheckForDuplicates), lhsCheckForDuplicates, rhsCheckForDuplicates)) {
                return false;
            }
        }
        {
            String lhsClientID;
            lhsClientID = this.getClientID();
            String rhsClientID;
            rhsClientID = that.getClientID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientID", lhsClientID), LocatorUtils.property(thatLocator, "clientID", rhsClientID), lhsClientID, rhsClientID)) {
                return false;
            }
        }
        {
            String lhsClientIDPrefix;
            lhsClientIDPrefix = this.getClientIDPrefix();
            String rhsClientIDPrefix;
            rhsClientIDPrefix = that.getClientIDPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIDPrefix", lhsClientIDPrefix), LocatorUtils.property(thatLocator, "clientIDPrefix", rhsClientIDPrefix), lhsClientIDPrefix, rhsClientIDPrefix)) {
                return false;
            }
        }
        {
            String lhsClientIdGenerator;
            lhsClientIdGenerator = this.getClientIdGenerator();
            String rhsClientIdGenerator;
            rhsClientIdGenerator = that.getClientIdGenerator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIdGenerator", lhsClientIdGenerator), LocatorUtils.property(thatLocator, "clientIdGenerator", rhsClientIdGenerator), lhsClientIdGenerator, rhsClientIdGenerator)) {
                return false;
            }
        }
        {
            String lhsClientInternalExceptionListener;
            lhsClientInternalExceptionListener = this.getClientInternalExceptionListener();
            String rhsClientInternalExceptionListener;
            rhsClientInternalExceptionListener = that.getClientInternalExceptionListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientInternalExceptionListener", lhsClientInternalExceptionListener), LocatorUtils.property(thatLocator, "clientInternalExceptionListener", rhsClientInternalExceptionListener), lhsClientInternalExceptionListener, rhsClientInternalExceptionListener)) {
                return false;
            }
        }
        {
            BigInteger lhsCloseTimeout;
            lhsCloseTimeout = this.getCloseTimeout();
            BigInteger rhsCloseTimeout;
            rhsCloseTimeout = that.getCloseTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "closeTimeout", lhsCloseTimeout), LocatorUtils.property(thatLocator, "closeTimeout", rhsCloseTimeout), lhsCloseTimeout, rhsCloseTimeout)) {
                return false;
            }
        }
        {
            String lhsConnectionIDPrefix;
            lhsConnectionIDPrefix = this.getConnectionIDPrefix();
            String rhsConnectionIDPrefix;
            rhsConnectionIDPrefix = that.getConnectionIDPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionIDPrefix", lhsConnectionIDPrefix), LocatorUtils.property(thatLocator, "connectionIDPrefix", rhsConnectionIDPrefix), lhsConnectionIDPrefix, rhsConnectionIDPrefix)) {
                return false;
            }
        }
        {
            String lhsConnectionIdGenerator;
            lhsConnectionIdGenerator = this.getConnectionIdGenerator();
            String rhsConnectionIdGenerator;
            rhsConnectionIdGenerator = that.getConnectionIdGenerator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionIdGenerator", lhsConnectionIdGenerator), LocatorUtils.property(thatLocator, "connectionIdGenerator", rhsConnectionIdGenerator), lhsConnectionIdGenerator, rhsConnectionIdGenerator)) {
                return false;
            }
        }
        {
            Boolean lhsConsumerExpiryCheckEnabled;
            lhsConsumerExpiryCheckEnabled = this.isConsumerExpiryCheckEnabled();
            Boolean rhsConsumerExpiryCheckEnabled;
            rhsConsumerExpiryCheckEnabled = that.isConsumerExpiryCheckEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerExpiryCheckEnabled", lhsConsumerExpiryCheckEnabled), LocatorUtils.property(thatLocator, "consumerExpiryCheckEnabled", rhsConsumerExpiryCheckEnabled), lhsConsumerExpiryCheckEnabled, rhsConsumerExpiryCheckEnabled)) {
                return false;
            }
        }
        {
            Long lhsConsumerFailoverRedeliveryWaitPeriod;
            lhsConsumerFailoverRedeliveryWaitPeriod = this.getConsumerFailoverRedeliveryWaitPeriod();
            Long rhsConsumerFailoverRedeliveryWaitPeriod;
            rhsConsumerFailoverRedeliveryWaitPeriod = that.getConsumerFailoverRedeliveryWaitPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerFailoverRedeliveryWaitPeriod", lhsConsumerFailoverRedeliveryWaitPeriod), LocatorUtils.property(thatLocator, "consumerFailoverRedeliveryWaitPeriod", rhsConsumerFailoverRedeliveryWaitPeriod), lhsConsumerFailoverRedeliveryWaitPeriod, rhsConsumerFailoverRedeliveryWaitPeriod)) {
                return false;
            }
        }
        {
            Boolean lhsCopyMessageOnSend;
            lhsCopyMessageOnSend = this.isCopyMessageOnSend();
            Boolean rhsCopyMessageOnSend;
            rhsCopyMessageOnSend = that.isCopyMessageOnSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copyMessageOnSend", lhsCopyMessageOnSend), LocatorUtils.property(thatLocator, "copyMessageOnSend", rhsCopyMessageOnSend), lhsCopyMessageOnSend, rhsCopyMessageOnSend)) {
                return false;
            }
        }
        {
            Boolean lhsDisableTimeStampsByDefault;
            lhsDisableTimeStampsByDefault = this.isDisableTimeStampsByDefault();
            Boolean rhsDisableTimeStampsByDefault;
            rhsDisableTimeStampsByDefault = that.isDisableTimeStampsByDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disableTimeStampsByDefault", lhsDisableTimeStampsByDefault), LocatorUtils.property(thatLocator, "disableTimeStampsByDefault", rhsDisableTimeStampsByDefault), lhsDisableTimeStampsByDefault, rhsDisableTimeStampsByDefault)) {
                return false;
            }
        }
        {
            Boolean lhsDispatchAsync;
            lhsDispatchAsync = this.isDispatchAsync();
            Boolean rhsDispatchAsync;
            rhsDispatchAsync = that.isDispatchAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispatchAsync", lhsDispatchAsync), LocatorUtils.property(thatLocator, "dispatchAsync", rhsDispatchAsync), lhsDispatchAsync, rhsDispatchAsync)) {
                return false;
            }
        }
        {
            String lhsExceptionListener;
            lhsExceptionListener = this.getExceptionListener();
            String rhsExceptionListener;
            rhsExceptionListener = that.getExceptionListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionListener", lhsExceptionListener), LocatorUtils.property(thatLocator, "exceptionListener", rhsExceptionListener), lhsExceptionListener, rhsExceptionListener)) {
                return false;
            }
        }
        {
            Boolean lhsExclusiveConsumer;
            lhsExclusiveConsumer = this.isExclusiveConsumer();
            Boolean rhsExclusiveConsumer;
            rhsExclusiveConsumer = that.isExclusiveConsumer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exclusiveConsumer", lhsExclusiveConsumer), LocatorUtils.property(thatLocator, "exclusiveConsumer", rhsExclusiveConsumer), lhsExclusiveConsumer, rhsExclusiveConsumer)) {
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
            Boolean lhsMessagePrioritySupported;
            lhsMessagePrioritySupported = this.isMessagePrioritySupported();
            Boolean rhsMessagePrioritySupported;
            rhsMessagePrioritySupported = that.isMessagePrioritySupported();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messagePrioritySupported", lhsMessagePrioritySupported), LocatorUtils.property(thatLocator, "messagePrioritySupported", rhsMessagePrioritySupported), lhsMessagePrioritySupported, rhsMessagePrioritySupported)) {
                return false;
            }
        }
        {
            Boolean lhsNestedMapAndListEnabled;
            lhsNestedMapAndListEnabled = this.isNestedMapAndListEnabled();
            Boolean rhsNestedMapAndListEnabled;
            rhsNestedMapAndListEnabled = that.isNestedMapAndListEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nestedMapAndListEnabled", lhsNestedMapAndListEnabled), LocatorUtils.property(thatLocator, "nestedMapAndListEnabled", rhsNestedMapAndListEnabled), lhsNestedMapAndListEnabled, rhsNestedMapAndListEnabled)) {
                return false;
            }
        }
        {
            Boolean lhsNonBlockingRedelivery;
            lhsNonBlockingRedelivery = this.isNonBlockingRedelivery();
            Boolean rhsNonBlockingRedelivery;
            rhsNonBlockingRedelivery = that.isNonBlockingRedelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonBlockingRedelivery", lhsNonBlockingRedelivery), LocatorUtils.property(thatLocator, "nonBlockingRedelivery", rhsNonBlockingRedelivery), lhsNonBlockingRedelivery, rhsNonBlockingRedelivery)) {
                return false;
            }
        }
        {
            Boolean lhsObjectMessageSerializationDefered;
            lhsObjectMessageSerializationDefered = this.isObjectMessageSerializationDefered();
            Boolean rhsObjectMessageSerializationDefered;
            rhsObjectMessageSerializationDefered = that.isObjectMessageSerializationDefered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectMessageSerializationDefered", lhsObjectMessageSerializationDefered), LocatorUtils.property(thatLocator, "objectMessageSerializationDefered", rhsObjectMessageSerializationDefered), lhsObjectMessageSerializationDefered, rhsObjectMessageSerializationDefered)) {
                return false;
            }
        }
        {
            Boolean lhsOptimizeAcknowledge;
            lhsOptimizeAcknowledge = this.isOptimizeAcknowledge();
            Boolean rhsOptimizeAcknowledge;
            rhsOptimizeAcknowledge = that.isOptimizeAcknowledge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizeAcknowledge", lhsOptimizeAcknowledge), LocatorUtils.property(thatLocator, "optimizeAcknowledge", rhsOptimizeAcknowledge), lhsOptimizeAcknowledge, rhsOptimizeAcknowledge)) {
                return false;
            }
        }
        {
            Long lhsOptimizeAcknowledgeTimeOut;
            lhsOptimizeAcknowledgeTimeOut = this.getOptimizeAcknowledgeTimeOut();
            Long rhsOptimizeAcknowledgeTimeOut;
            rhsOptimizeAcknowledgeTimeOut = that.getOptimizeAcknowledgeTimeOut();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizeAcknowledgeTimeOut", lhsOptimizeAcknowledgeTimeOut), LocatorUtils.property(thatLocator, "optimizeAcknowledgeTimeOut", rhsOptimizeAcknowledgeTimeOut), lhsOptimizeAcknowledgeTimeOut, rhsOptimizeAcknowledgeTimeOut)) {
                return false;
            }
        }
        {
            Long lhsOptimizedAckScheduledAckInterval;
            lhsOptimizedAckScheduledAckInterval = this.getOptimizedAckScheduledAckInterval();
            Long rhsOptimizedAckScheduledAckInterval;
            rhsOptimizedAckScheduledAckInterval = that.getOptimizedAckScheduledAckInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizedAckScheduledAckInterval", lhsOptimizedAckScheduledAckInterval), LocatorUtils.property(thatLocator, "optimizedAckScheduledAckInterval", rhsOptimizedAckScheduledAckInterval), lhsOptimizedAckScheduledAckInterval, rhsOptimizedAckScheduledAckInterval)) {
                return false;
            }
        }
        {
            Boolean lhsOptimizedMessageDispatch;
            lhsOptimizedMessageDispatch = this.isOptimizedMessageDispatch();
            Boolean rhsOptimizedMessageDispatch;
            rhsOptimizedMessageDispatch = that.isOptimizedMessageDispatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optimizedMessageDispatch", lhsOptimizedMessageDispatch), LocatorUtils.property(thatLocator, "optimizedMessageDispatch", rhsOptimizedMessageDispatch), lhsOptimizedMessageDispatch, rhsOptimizedMessageDispatch)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                return false;
            }
        }
        {
            String lhsPrefetchPolicy;
            lhsPrefetchPolicy = this.getPrefetchPolicy();
            String rhsPrefetchPolicy;
            rhsPrefetchPolicy = that.getPrefetchPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchPolicy", lhsPrefetchPolicy), LocatorUtils.property(thatLocator, "prefetchPolicy", rhsPrefetchPolicy), lhsPrefetchPolicy, rhsPrefetchPolicy)) {
                return false;
            }
        }
        {
            BigInteger lhsProducerWindowSize;
            lhsProducerWindowSize = this.getProducerWindowSize();
            BigInteger rhsProducerWindowSize;
            rhsProducerWindowSize = that.getProducerWindowSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerWindowSize", lhsProducerWindowSize), LocatorUtils.property(thatLocator, "producerWindowSize", rhsProducerWindowSize), lhsProducerWindowSize, rhsProducerWindowSize)) {
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
            String lhsRedeliveryPolicy;
            lhsRedeliveryPolicy = this.getRedeliveryPolicy();
            String rhsRedeliveryPolicy;
            rhsRedeliveryPolicy = that.getRedeliveryPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicy", lhsRedeliveryPolicy), LocatorUtils.property(thatLocator, "redeliveryPolicy", rhsRedeliveryPolicy), lhsRedeliveryPolicy, rhsRedeliveryPolicy)) {
                return false;
            }
        }
        {
            String lhsRedeliveryPolicyMap;
            lhsRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
            String rhsRedeliveryPolicyMap;
            rhsRedeliveryPolicyMap = that.getRedeliveryPolicyMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicyMap", lhsRedeliveryPolicyMap), LocatorUtils.property(thatLocator, "redeliveryPolicyMap", rhsRedeliveryPolicyMap), lhsRedeliveryPolicyMap, rhsRedeliveryPolicyMap)) {
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
            Boolean lhsRmIdFromConnectionId;
            lhsRmIdFromConnectionId = this.isRmIdFromConnectionId();
            Boolean rhsRmIdFromConnectionId;
            rhsRmIdFromConnectionId = that.isRmIdFromConnectionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmIdFromConnectionId", lhsRmIdFromConnectionId), LocatorUtils.property(thatLocator, "rmIdFromConnectionId", rhsRmIdFromConnectionId), lhsRmIdFromConnectionId, rhsRmIdFromConnectionId)) {
                return false;
            }
        }
        {
            Boolean lhsSendAcksAsync;
            lhsSendAcksAsync = this.isSendAcksAsync();
            Boolean rhsSendAcksAsync;
            rhsSendAcksAsync = that.isSendAcksAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendAcksAsync", lhsSendAcksAsync), LocatorUtils.property(thatLocator, "sendAcksAsync", rhsSendAcksAsync), lhsSendAcksAsync, rhsSendAcksAsync)) {
                return false;
            }
        }
        {
            BigInteger lhsSendTimeout;
            lhsSendTimeout = this.getSendTimeout();
            BigInteger rhsSendTimeout;
            rhsSendTimeout = that.getSendTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendTimeout", lhsSendTimeout), LocatorUtils.property(thatLocator, "sendTimeout", rhsSendTimeout), lhsSendTimeout, rhsSendTimeout)) {
                return false;
            }
        }
        {
            String lhsSessionTaskRunner;
            lhsSessionTaskRunner = this.getSessionTaskRunner();
            String rhsSessionTaskRunner;
            rhsSessionTaskRunner = that.getSessionTaskRunner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionTaskRunner", lhsSessionTaskRunner), LocatorUtils.property(thatLocator, "sessionTaskRunner", rhsSessionTaskRunner), lhsSessionTaskRunner, rhsSessionTaskRunner)) {
                return false;
            }
        }
        {
            Boolean lhsStatsEnabled;
            lhsStatsEnabled = this.isStatsEnabled();
            Boolean rhsStatsEnabled;
            rhsStatsEnabled = that.isStatsEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statsEnabled", lhsStatsEnabled), LocatorUtils.property(thatLocator, "statsEnabled", rhsStatsEnabled), lhsStatsEnabled, rhsStatsEnabled)) {
                return false;
            }
        }
        {
            Boolean lhsTransactedIndividualAck;
            lhsTransactedIndividualAck = this.isTransactedIndividualAck();
            Boolean rhsTransactedIndividualAck;
            rhsTransactedIndividualAck = that.isTransactedIndividualAck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactedIndividualAck", lhsTransactedIndividualAck), LocatorUtils.property(thatLocator, "transactedIndividualAck", rhsTransactedIndividualAck), lhsTransactedIndividualAck, rhsTransactedIndividualAck)) {
                return false;
            }
        }
        {
            String lhsTransformer;
            lhsTransformer = this.getTransformer();
            String rhsTransformer;
            rhsTransformer = that.getTransformer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transformer", lhsTransformer), LocatorUtils.property(thatLocator, "transformer", rhsTransformer), lhsTransformer, rhsTransformer)) {
                return false;
            }
        }
        {
            String lhsTransportListener;
            lhsTransportListener = this.getTransportListener();
            String rhsTransportListener;
            rhsTransportListener = that.getTransportListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportListener", lhsTransportListener), LocatorUtils.property(thatLocator, "transportListener", rhsTransportListener), lhsTransportListener, rhsTransportListener)) {
                return false;
            }
        }
        {
            Boolean lhsUseAsyncSend;
            lhsUseAsyncSend = this.isUseAsyncSend();
            Boolean rhsUseAsyncSend;
            rhsUseAsyncSend = that.isUseAsyncSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAsyncSend", lhsUseAsyncSend), LocatorUtils.property(thatLocator, "useAsyncSend", rhsUseAsyncSend), lhsUseAsyncSend, rhsUseAsyncSend)) {
                return false;
            }
        }
        {
            Boolean lhsUseBeanNameAsClientIdPrefix;
            lhsUseBeanNameAsClientIdPrefix = this.isUseBeanNameAsClientIdPrefix();
            Boolean rhsUseBeanNameAsClientIdPrefix;
            rhsUseBeanNameAsClientIdPrefix = that.isUseBeanNameAsClientIdPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useBeanNameAsClientIdPrefix", lhsUseBeanNameAsClientIdPrefix), LocatorUtils.property(thatLocator, "useBeanNameAsClientIdPrefix", rhsUseBeanNameAsClientIdPrefix), lhsUseBeanNameAsClientIdPrefix, rhsUseBeanNameAsClientIdPrefix)) {
                return false;
            }
        }
        {
            Boolean lhsUseCompression;
            lhsUseCompression = this.isUseCompression();
            Boolean rhsUseCompression;
            rhsUseCompression = that.isUseCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCompression", lhsUseCompression), LocatorUtils.property(thatLocator, "useCompression", rhsUseCompression), lhsUseCompression, rhsUseCompression)) {
                return false;
            }
        }
        {
            Boolean lhsUseDedicatedTaskRunner;
            lhsUseDedicatedTaskRunner = this.isUseDedicatedTaskRunner();
            Boolean rhsUseDedicatedTaskRunner;
            rhsUseDedicatedTaskRunner = that.isUseDedicatedTaskRunner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useDedicatedTaskRunner", lhsUseDedicatedTaskRunner), LocatorUtils.property(thatLocator, "useDedicatedTaskRunner", rhsUseDedicatedTaskRunner), lhsUseDedicatedTaskRunner, rhsUseDedicatedTaskRunner)) {
                return false;
            }
        }
        {
            Boolean lhsUseRetroactiveConsumer;
            lhsUseRetroactiveConsumer = this.isUseRetroactiveConsumer();
            Boolean rhsUseRetroactiveConsumer;
            rhsUseRetroactiveConsumer = that.isUseRetroactiveConsumer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useRetroactiveConsumer", lhsUseRetroactiveConsumer), LocatorUtils.property(thatLocator, "useRetroactiveConsumer", rhsUseRetroactiveConsumer), lhsUseRetroactiveConsumer, rhsUseRetroactiveConsumer)) {
                return false;
            }
        }
        {
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
                return false;
            }
        }
        {
            Long lhsWarnAboutUnstartedConnectionTimeout;
            lhsWarnAboutUnstartedConnectionTimeout = this.getWarnAboutUnstartedConnectionTimeout();
            Long rhsWarnAboutUnstartedConnectionTimeout;
            rhsWarnAboutUnstartedConnectionTimeout = that.getWarnAboutUnstartedConnectionTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnAboutUnstartedConnectionTimeout", lhsWarnAboutUnstartedConnectionTimeout), LocatorUtils.property(thatLocator, "warnAboutUnstartedConnectionTimeout", rhsWarnAboutUnstartedConnectionTimeout), lhsWarnAboutUnstartedConnectionTimeout, rhsWarnAboutUnstartedConnectionTimeout)) {
                return false;
            }
        }
        {
            Boolean lhsWatchTopicAdvisories;
            lhsWatchTopicAdvisories = this.isWatchTopicAdvisories();
            Boolean rhsWatchTopicAdvisories;
            rhsWatchTopicAdvisories = that.isWatchTopicAdvisories();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "watchTopicAdvisories", lhsWatchTopicAdvisories), LocatorUtils.property(thatLocator, "watchTopicAdvisories", rhsWatchTopicAdvisories), lhsWatchTopicAdvisories, rhsWatchTopicAdvisories)) {
                return false;
            }
        }
        {
            BigInteger lhsXaAckMode;
            lhsXaAckMode = this.getXaAckMode();
            BigInteger rhsXaAckMode;
            rhsXaAckMode = that.getXaAckMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xaAckMode", lhsXaAckMode), LocatorUtils.property(thatLocator, "xaAckMode", rhsXaAckMode), lhsXaAckMode, rhsXaAckMode)) {
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
    public static class BlobTransferPolicy
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
            if (!(object instanceof DtoXaConnectionFactory.BlobTransferPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.BlobTransferPolicy that = ((DtoXaConnectionFactory.BlobTransferPolicy) object);
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
    public static class ClientIdGenerator
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
            if (!(object instanceof DtoXaConnectionFactory.ClientIdGenerator)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.ClientIdGenerator that = ((DtoXaConnectionFactory.ClientIdGenerator) object);
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
    public static class ClientInternalExceptionListener
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
            if (!(object instanceof DtoXaConnectionFactory.ClientInternalExceptionListener)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.ClientInternalExceptionListener that = ((DtoXaConnectionFactory.ClientInternalExceptionListener) object);
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
    public static class ConnectionIdGenerator
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
            if (!(object instanceof DtoXaConnectionFactory.ConnectionIdGenerator)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.ConnectionIdGenerator that = ((DtoXaConnectionFactory.ConnectionIdGenerator) object);
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
    public static class ExceptionListener
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
            if (!(object instanceof DtoXaConnectionFactory.ExceptionListener)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.ExceptionListener that = ((DtoXaConnectionFactory.ExceptionListener) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}prefetchPolicy"/>
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
        "prefetchPolicy",
        "any"
    })
    public static class PrefetchPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoPrefetchPolicy prefetchPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡprefetchPolicy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoPrefetchPolicy }
         *     
         */
        public DtoPrefetchPolicy getPrefetchPolicy() {
            return prefetchPolicy;
        }

        /**
         * ����prefetchPolicy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPrefetchPolicy }
         *     
         */
        public void setPrefetchPolicy(DtoPrefetchPolicy value) {
            this.prefetchPolicy = value;
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
                DtoPrefetchPolicy thePrefetchPolicy;
                thePrefetchPolicy = this.getPrefetchPolicy();
                strategy.appendField(locator, this, "prefetchPolicy", buffer, thePrefetchPolicy);
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
                DtoPrefetchPolicy thePrefetchPolicy;
                thePrefetchPolicy = this.getPrefetchPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchPolicy", thePrefetchPolicy), currentHashCode, thePrefetchPolicy);
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
            if (!(object instanceof DtoXaConnectionFactory.PrefetchPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.PrefetchPolicy that = ((DtoXaConnectionFactory.PrefetchPolicy) object);
            {
                DtoPrefetchPolicy lhsPrefetchPolicy;
                lhsPrefetchPolicy = this.getPrefetchPolicy();
                DtoPrefetchPolicy rhsPrefetchPolicy;
                rhsPrefetchPolicy = that.getPrefetchPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchPolicy", lhsPrefetchPolicy), LocatorUtils.property(thatLocator, "prefetchPolicy", rhsPrefetchPolicy), lhsPrefetchPolicy, rhsPrefetchPolicy)) {
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
            if (!(object instanceof DtoXaConnectionFactory.Properties)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.Properties that = ((DtoXaConnectionFactory.Properties) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicy"/>
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
        "redeliveryPolicy",
        "any"
    })
    public static class RedeliveryPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoRedeliveryPolicy redeliveryPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡredeliveryPolicy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicy }
         *     
         */
        public DtoRedeliveryPolicy getRedeliveryPolicy() {
            return redeliveryPolicy;
        }

        /**
         * ����redeliveryPolicy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicy }
         *     
         */
        public void setRedeliveryPolicy(DtoRedeliveryPolicy value) {
            this.redeliveryPolicy = value;
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
                DtoRedeliveryPolicy theRedeliveryPolicy;
                theRedeliveryPolicy = this.getRedeliveryPolicy();
                strategy.appendField(locator, this, "redeliveryPolicy", buffer, theRedeliveryPolicy);
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
                DtoRedeliveryPolicy theRedeliveryPolicy;
                theRedeliveryPolicy = this.getRedeliveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicy", theRedeliveryPolicy), currentHashCode, theRedeliveryPolicy);
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
            if (!(object instanceof DtoXaConnectionFactory.RedeliveryPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.RedeliveryPolicy that = ((DtoXaConnectionFactory.RedeliveryPolicy) object);
            {
                DtoRedeliveryPolicy lhsRedeliveryPolicy;
                lhsRedeliveryPolicy = this.getRedeliveryPolicy();
                DtoRedeliveryPolicy rhsRedeliveryPolicy;
                rhsRedeliveryPolicy = that.getRedeliveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicy", lhsRedeliveryPolicy), LocatorUtils.property(thatLocator, "redeliveryPolicy", rhsRedeliveryPolicy), lhsRedeliveryPolicy, rhsRedeliveryPolicy)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicyMap"/>
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
        "redeliveryPolicyMap",
        "any"
    })
    public static class RedeliveryPolicyMap
        implements Equals, HashCode, ToString
    {

        protected DtoRedeliveryPolicyMap redeliveryPolicyMap;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡredeliveryPolicyMap���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public DtoRedeliveryPolicyMap getRedeliveryPolicyMap() {
            return redeliveryPolicyMap;
        }

        /**
         * ����redeliveryPolicyMap���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicyMap }
         *     
         */
        public void setRedeliveryPolicyMap(DtoRedeliveryPolicyMap value) {
            this.redeliveryPolicyMap = value;
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
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                strategy.appendField(locator, this, "redeliveryPolicyMap", buffer, theRedeliveryPolicyMap);
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
                DtoRedeliveryPolicyMap theRedeliveryPolicyMap;
                theRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicyMap", theRedeliveryPolicyMap), currentHashCode, theRedeliveryPolicyMap);
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
            if (!(object instanceof DtoXaConnectionFactory.RedeliveryPolicyMap)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.RedeliveryPolicyMap that = ((DtoXaConnectionFactory.RedeliveryPolicyMap) object);
            {
                DtoRedeliveryPolicyMap lhsRedeliveryPolicyMap;
                lhsRedeliveryPolicyMap = this.getRedeliveryPolicyMap();
                DtoRedeliveryPolicyMap rhsRedeliveryPolicyMap;
                rhsRedeliveryPolicyMap = that.getRedeliveryPolicyMap();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicyMap", lhsRedeliveryPolicyMap), LocatorUtils.property(thatLocator, "redeliveryPolicyMap", rhsRedeliveryPolicyMap), lhsRedeliveryPolicyMap, rhsRedeliveryPolicyMap)) {
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
            if (!(object instanceof DtoXaConnectionFactory.RejectedTaskHandler)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.RejectedTaskHandler that = ((DtoXaConnectionFactory.RejectedTaskHandler) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
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
        "taskRunnerFactory",
        "any"
    })
    public static class SessionTaskRunner
        implements Equals, HashCode, ToString
    {

        protected DtoTaskRunnerFactory taskRunnerFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtaskRunnerFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public DtoTaskRunnerFactory getTaskRunnerFactory() {
            return taskRunnerFactory;
        }

        /**
         * ����taskRunnerFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public void setTaskRunnerFactory(DtoTaskRunnerFactory value) {
            this.taskRunnerFactory = value;
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
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
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
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
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
            if (!(object instanceof DtoXaConnectionFactory.SessionTaskRunner)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.SessionTaskRunner that = ((DtoXaConnectionFactory.SessionTaskRunner) object);
            {
                DtoTaskRunnerFactory lhsTaskRunnerFactory;
                lhsTaskRunnerFactory = this.getTaskRunnerFactory();
                DtoTaskRunnerFactory rhsTaskRunnerFactory;
                rhsTaskRunnerFactory = that.getTaskRunnerFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
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
    public static class Transformer
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
            if (!(object instanceof DtoXaConnectionFactory.Transformer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.Transformer that = ((DtoXaConnectionFactory.Transformer) object);
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
    public static class TransportListener
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
            if (!(object instanceof DtoXaConnectionFactory.TransportListener)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoXaConnectionFactory.TransportListener that = ((DtoXaConnectionFactory.TransportListener) object);
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