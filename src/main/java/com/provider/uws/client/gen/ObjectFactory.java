
package com.provider.uws.client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.springsoap.client.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelTransactionArguments_QNAME = new QName("http://uws.provider.com/", "CancelTransactionArguments");
    private final static QName _CancelTransactionResult_QNAME = new QName("http://uws.provider.com/", "CancelTransactionResult");
    private final static QName _CheckTransactionArguments_QNAME = new QName("http://uws.provider.com/", "CheckTransactionArguments");
    private final static QName _CheckTransactionResult_QNAME = new QName("http://uws.provider.com/", "CheckTransactionResult");
    private final static QName _GetInformationArguments_QNAME = new QName("http://uws.provider.com/", "GetInformationArguments");
    private final static QName _GetInformationResult_QNAME = new QName("http://uws.provider.com/", "GetInformationResult");
    private final static QName _GetStatementArguments_QNAME = new QName("http://uws.provider.com/", "GetStatementArguments");
    private final static QName _GetStatementResult_QNAME = new QName("http://uws.provider.com/", "GetStatementResult");
    private final static QName _PerformTransactionArguments_QNAME = new QName("http://uws.provider.com/", "PerformTransactionArguments");
    private final static QName _PerformTransactionResult_QNAME = new QName("http://uws.provider.com/", "PerformTransactionResult");
    private final static QName _ChangePasswordArguments_QNAME = new QName("http://uws.provider.com/", "ChangePasswordArguments");
    private final static QName _ChangePasswordResult_QNAME = new QName("http://uws.provider.com/", "ChangePasswordResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.springsoap.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelTransactionArguments }
     * 
     */
    public CancelTransactionArguments createCancelTransactionArguments() {
        return new CancelTransactionArguments();
    }

    /**
     * Create an instance of {@link CancelTransactionResult }
     * 
     */
    public CancelTransactionResult createCancelTransactionResult() {
        return new CancelTransactionResult();
    }

    /**
     * Create an instance of {@link CheckTransactionArguments }
     * 
     */
    public CheckTransactionArguments createCheckTransactionArguments() {
        return new CheckTransactionArguments();
    }

    /**
     * Create an instance of {@link CheckTransactionResult }
     * 
     */
    public CheckTransactionResult createCheckTransactionResult() {
        return new CheckTransactionResult();
    }

    /**
     * Create an instance of {@link GetInformationArguments }
     * 
     */
    public GetInformationArguments createGetInformationArguments() {
        return new GetInformationArguments();
    }

    /**
     * Create an instance of {@link GetInformationResult }
     * 
     */
    public GetInformationResult createGetInformationResult() {
        return new GetInformationResult();
    }

    /**
     * Create an instance of {@link GetStatementArguments }
     * 
     */
    public GetStatementArguments createGetStatementArguments() {
        return new GetStatementArguments();
    }

    /**
     * Create an instance of {@link GetStatementResult }
     * 
     */
    public GetStatementResult createGetStatementResult() {
        return new GetStatementResult();
    }

    /**
     * Create an instance of {@link PerformTransactionArguments }
     * 
     */
    public PerformTransactionArguments createPerformTransactionArguments() {
        return new PerformTransactionArguments();
    }

    /**
     * Create an instance of {@link PerformTransactionResult }
     * 
     */
    public PerformTransactionResult createPerformTransactionResult() {
        return new PerformTransactionResult();
    }

    /**
     * Create an instance of {@link ChangePasswordArguments }
     * 
     */
    public ChangePasswordArguments createChangePasswordArguments() {
        return new ChangePasswordArguments();
    }

    /**
     * Create an instance of {@link ChangePasswordResult }
     * 
     */
    public ChangePasswordResult createChangePasswordResult() {
        return new ChangePasswordResult();
    }

    /**
     * Create an instance of {@link GenericArguments }
     * 
     */
    public GenericArguments createGenericArguments() {
        return new GenericArguments();
    }

    /**
     * Create an instance of {@link GenericResult }
     * 
     */
    public GenericResult createGenericResult() {
        return new GenericResult();
    }

    /**
     * Create an instance of {@link GenericParam }
     * 
     */
    public GenericParam createGenericParam() {
        return new GenericParam();
    }

    /**
     * Create an instance of {@link TransactionStatement }
     * 
     */
    public TransactionStatement createTransactionStatement() {
        return new TransactionStatement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTransactionArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelTransactionArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "CancelTransactionArguments")
    public JAXBElement<CancelTransactionArguments> createCancelTransactionArguments(CancelTransactionArguments value) {
        return new JAXBElement<CancelTransactionArguments>(_CancelTransactionArguments_QNAME, CancelTransactionArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelTransactionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelTransactionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "CancelTransactionResult")
    public JAXBElement<CancelTransactionResult> createCancelTransactionResult(CancelTransactionResult value) {
        return new JAXBElement<CancelTransactionResult>(_CancelTransactionResult_QNAME, CancelTransactionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTransactionArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckTransactionArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "CheckTransactionArguments")
    public JAXBElement<CheckTransactionArguments> createCheckTransactionArguments(CheckTransactionArguments value) {
        return new JAXBElement<CheckTransactionArguments>(_CheckTransactionArguments_QNAME, CheckTransactionArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTransactionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckTransactionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "CheckTransactionResult")
    public JAXBElement<CheckTransactionResult> createCheckTransactionResult(CheckTransactionResult value) {
        return new JAXBElement<CheckTransactionResult>(_CheckTransactionResult_QNAME, CheckTransactionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "GetInformationArguments")
    public JAXBElement<GetInformationArguments> createGetInformationArguments(GetInformationArguments value) {
        return new JAXBElement<GetInformationArguments>(_GetInformationArguments_QNAME, GetInformationArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "GetInformationResult")
    public JAXBElement<GetInformationResult> createGetInformationResult(GetInformationResult value) {
        return new JAXBElement<GetInformationResult>(_GetInformationResult_QNAME, GetInformationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatementArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatementArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "GetStatementArguments")
    public JAXBElement<GetStatementArguments> createGetStatementArguments(GetStatementArguments value) {
        return new JAXBElement<GetStatementArguments>(_GetStatementArguments_QNAME, GetStatementArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatementResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatementResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "GetStatementResult")
    public JAXBElement<GetStatementResult> createGetStatementResult(GetStatementResult value) {
        return new JAXBElement<GetStatementResult>(_GetStatementResult_QNAME, GetStatementResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformTransactionArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerformTransactionArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "PerformTransactionArguments")
    public JAXBElement<PerformTransactionArguments> createPerformTransactionArguments(PerformTransactionArguments value) {
        return new JAXBElement<PerformTransactionArguments>(_PerformTransactionArguments_QNAME, PerformTransactionArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformTransactionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PerformTransactionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "PerformTransactionResult")
    public JAXBElement<PerformTransactionResult> createPerformTransactionResult(PerformTransactionResult value) {
        return new JAXBElement<PerformTransactionResult>(_PerformTransactionResult_QNAME, PerformTransactionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordArguments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangePasswordArguments }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "ChangePasswordArguments")
    public JAXBElement<ChangePasswordArguments> createChangePasswordArguments(ChangePasswordArguments value) {
        return new JAXBElement<ChangePasswordArguments>(_ChangePasswordArguments_QNAME, ChangePasswordArguments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangePasswordResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://uws.provider.com/", name = "ChangePasswordResult")
    public JAXBElement<ChangePasswordResult> createChangePasswordResult(ChangePasswordResult value) {
        return new JAXBElement<ChangePasswordResult>(_ChangePasswordResult_QNAME, ChangePasswordResult.class, null, value);
    }

}
