package oracle.fodemo.storefront.account.queries;

import oracle.fodemo.storefront.entities.PaymentOptionEOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewAccessorDef;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomerPaymentOptionVORowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        PaymentOptionId {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getPaymentOptionId();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setPaymentOptionId((DBSequence)value);
            }
        }
        ,
        CustomerId {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getCustomerId();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        PaymentTypeCode {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getPaymentTypeCode();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setPaymentTypeCode((String)value);
            }
        }
        ,
        BillingAddressId {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getBillingAddressId();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setBillingAddressId((Number)value);
            }
        }
        ,
        AccountNumber {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getAccountNumber();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setAccountNumber((Number)value);
            }
        }
        ,
        CardTypeCode {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getCardTypeCode();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setCardTypeCode((String)value);
            }
        }
        ,
        ExpireDate {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getExpireDate();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setExpireDate((Date)value);
            }
        }
        ,
        CheckDigits {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getCheckDigits();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setCheckDigits((Number)value);
            }
        }
        ,
        RoutingIdentifier {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getRoutingIdentifier();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setRoutingIdentifier((String)value);
            }
        }
        ,
        InstitutionName {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getInstitutionName();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setInstitutionName((String)value);
            }
        }
        ,
        ValidFromDate {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getValidFromDate();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setValidFromDate((Date)value);
            }
        }
        ,
        ValidToDate {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getValidToDate();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setValidToDate((Date)value);
            }
        }
        ,
        ObjectVersionId {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setObjectVersionId((Number)value);
            }
        }
        ,
        LookupType {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getLookupType();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setLookupType((String)value);
            }
        }
        ,
        LookupCode {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getLookupCode();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setLookupCode((String)value);
            }
        }
        ,
        Meaning {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getMeaning();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setMeaning((String)value);
            }
        }
        ,
        Language {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getLanguage();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setLanguage((String)value);
            }
        }
        ,
        ObjectVersionId1 {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getObjectVersionId1();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setObjectVersionId1((Number)value);
            }
        }
        ,
        CustomerAddressVA {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getCustomerAddressVA();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerRegistrationVA {
            public Object get(CustomerPaymentOptionVORowImpl obj) {
                return obj.getCustomerRegistrationVA();
            }

            public void put(CustomerPaymentOptionVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        /**
         * @param object
         * @return
         */
        public abstract Object get(CustomerPaymentOptionVORowImpl object);

        /**
         * @param object
         * @param value
         */
        public abstract void put(CustomerPaymentOptionVORowImpl object,
                                 Object value);

        /**
         * @return
         */
        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        /**
         * @return
         */
        public static int firstIndex() {
            return firstIndex;
        }

        /**
         * @return
         */
        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        /**
         * @return
         */
        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int PAYMENTOPTIONID = AttributesEnum.PaymentOptionId.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int PAYMENTTYPECODE = AttributesEnum.PaymentTypeCode.index();
    public static final int BILLINGADDRESSID = AttributesEnum.BillingAddressId.index();
    public static final int ACCOUNTNUMBER = AttributesEnum.AccountNumber.index();
    public static final int CARDTYPECODE = AttributesEnum.CardTypeCode.index();
    public static final int EXPIREDATE = AttributesEnum.ExpireDate.index();
    public static final int CHECKDIGITS = AttributesEnum.CheckDigits.index();
    public static final int ROUTINGIDENTIFIER = AttributesEnum.RoutingIdentifier.index();
    public static final int INSTITUTIONNAME = AttributesEnum.InstitutionName.index();
    public static final int VALIDFROMDATE = AttributesEnum.ValidFromDate.index();
    public static final int VALIDTODATE = AttributesEnum.ValidToDate.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int LOOKUPTYPE = AttributesEnum.LookupType.index();
    public static final int LOOKUPCODE = AttributesEnum.LookupCode.index();
    public static final int MEANING = AttributesEnum.Meaning.index();
    public static final int LANGUAGE = AttributesEnum.Language.index();
    public static final int OBJECTVERSIONID1 = AttributesEnum.ObjectVersionId1.index();
    public static final int CUSTOMERADDRESSVA = AttributesEnum.CustomerAddressVA.index();
    public static final int CUSTOMERREGISTRATIONVA = AttributesEnum.CustomerRegistrationVA.index();

    /**This is the default constructor (do not remove).
     */
    public CustomerPaymentOptionVORowImpl() {
    }

    /**Gets PaymentOptionEO entity object.
     * @return
     */
    public PaymentOptionEOImpl getPaymentOptionEO() {
        return (PaymentOptionEOImpl)getEntity(0);
    }

    /**Gets the attribute value for PAYMENT_OPTION_ID using the alias name PaymentOptionId.
     * @return
     */
    public DBSequence getPaymentOptionId() {
        return (DBSequence)getAttributeInternal(PAYMENTOPTIONID);
    }

    /**Sets <code>value</code> as attribute value for PAYMENT_OPTION_ID using the alias name PaymentOptionId.
     * @param value
     */
    public void setPaymentOptionId(DBSequence value) {
        setAttributeInternal(PAYMENTOPTIONID, value);
    }

    /**Gets the attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @return
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**Sets <code>value</code> as attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @param value
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**Gets the attribute value for PAYMENT_TYPE_CODE using the alias name PaymentTypeCode.
     * @return
     */
    public String getPaymentTypeCode() {
        return (String) getAttributeInternal(PAYMENTTYPECODE);
    }

    /**Sets <code>value</code> as attribute value for PAYMENT_TYPE_CODE using the alias name PaymentTypeCode.
     * @param value
     */
    public void setPaymentTypeCode(String value) {
        setAttributeInternal(PAYMENTTYPECODE, value);
    }

    /**Gets the attribute value for BILLING_ADDRESS_ID using the alias name BillingAddressId.
     * @return
     */
    public Number getBillingAddressId() {
        return (Number) getAttributeInternal(BILLINGADDRESSID);
    }

    /**Sets <code>value</code> as attribute value for BILLING_ADDRESS_ID using the alias name BillingAddressId.
     * @param value
     */
    public void setBillingAddressId(Number value) {
        setAttributeInternal(BILLINGADDRESSID, value);
    }

    /**Gets the attribute value for ACCOUNT_NUMBER using the alias name AccountNumber.
     * @return
     */
    public Number getAccountNumber() {
        return (Number) getAttributeInternal(ACCOUNTNUMBER);
    }

    /**Sets <code>value</code> as attribute value for ACCOUNT_NUMBER using the alias name AccountNumber.
     * @param value
     */
    public void setAccountNumber(Number value) {
        setAttributeInternal(ACCOUNTNUMBER, value);
    }

    /**Gets the attribute value for CARD_TYPE_CODE using the alias name CardTypeCode.
     * @return
     */
    public String getCardTypeCode() {
        return (String) getAttributeInternal(CARDTYPECODE);
    }

    /**Sets <code>value</code> as attribute value for CARD_TYPE_CODE using the alias name CardTypeCode.
     * @param value
     */
    public void setCardTypeCode(String value) {
        setAttributeInternal(CARDTYPECODE, value);
    }

    /**Gets the attribute value for EXPIRE_DATE using the alias name ExpireDate.
     * @return
     */
    public Date getExpireDate() {
        return (Date) getAttributeInternal(EXPIREDATE);
    }

    /**Sets <code>value</code> as attribute value for EXPIRE_DATE using the alias name ExpireDate.
     * @param value
     */
    public void setExpireDate(Date value) {
        setAttributeInternal(EXPIREDATE, value);
    }

    /**Gets the attribute value for CHECK_DIGITS using the alias name CheckDigits.
     * @return
     */
    public Number getCheckDigits() {
        return (Number) getAttributeInternal(CHECKDIGITS);
    }

    /**Sets <code>value</code> as attribute value for CHECK_DIGITS using the alias name CheckDigits.
     * @param value
     */
    public void setCheckDigits(Number value) {
        setAttributeInternal(CHECKDIGITS, value);
    }

    /**Gets the attribute value for ROUTING_IDENTIFIER using the alias name RoutingIdentifier.
     * @return
     */
    public String getRoutingIdentifier() {
        return (String) getAttributeInternal(ROUTINGIDENTIFIER);
    }

    /**Sets <code>value</code> as attribute value for ROUTING_IDENTIFIER using the alias name RoutingIdentifier.
     * @param value
     */
    public void setRoutingIdentifier(String value) {
        setAttributeInternal(ROUTINGIDENTIFIER, value);
    }

    /**Gets the attribute value for INSTITUTION_NAME using the alias name InstitutionName.
     * @return
     */
    public String getInstitutionName() {
        return (String) getAttributeInternal(INSTITUTIONNAME);
    }

    /**Sets <code>value</code> as attribute value for INSTITUTION_NAME using the alias name InstitutionName.
     * @param value
     */
    public void setInstitutionName(String value) {
        setAttributeInternal(INSTITUTIONNAME, value);
    }

    /**Gets the attribute value for VALID_FROM_DATE using the alias name ValidFromDate.
     * @return
     */
    public Date getValidFromDate() {
        return (Date) getAttributeInternal(VALIDFROMDATE);
    }

    /**Sets <code>value</code> as attribute value for VALID_FROM_DATE using the alias name ValidFromDate.
     * @param value
     */
    public void setValidFromDate(Date value) {
        setAttributeInternal(VALIDFROMDATE, value);
    }

    /**Gets the attribute value for VALID_TO_DATE using the alias name ValidToDate.
     * @return
     */
    public Date getValidToDate() {
        return (Date) getAttributeInternal(VALIDTODATE);
    }

    /**Sets <code>value</code> as attribute value for VALID_TO_DATE using the alias name ValidToDate.
     * @param value
     */
    public void setValidToDate(Date value) {
        setAttributeInternal(VALIDTODATE, value);
    }

    /**Gets the attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     * @return
     */
    public Number getObjectVersionId() {
        return (Number) getAttributeInternal(OBJECTVERSIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId.
     * @param value value to set the OBJECT_VERSION_ID
     */
    public void setObjectVersionId(Number value) {
        setAttributeInternal(OBJECTVERSIONID, value);
    }

    /**Gets the view accessor <code>RowSet</code> CustomerAddressVA.
     * @return
     */
    public RowSet getCustomerAddressVA() {
        return (RowSet)getAttributeInternal(CUSTOMERADDRESSVA);
    }


    /**
     * Gets the view accessor <code>RowSet</code> CustomerRegistrationVA.
     */
    public RowSet getCustomerRegistrationVA() {
        return (RowSet)getAttributeInternal(CUSTOMERREGISTRATIONVA);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     * @param index
     * @param attrDef
     * @return
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     * @param index
     * @param value
     * @param attrDef
     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @param va
     * @return
     */
    @Override
    protected RowSet createViewAccessorRS(ViewAccessorDef va) {
        RowSet rs = super.createViewAccessorRS(va);
        rs.setAssociationConsistent(true);
        return rs;
    }

    /**
     * @param vaName
     * @return
     */
    @Override
    protected RowSet createViewAccessorRS(String vaName) {
        RowSet rs = super.createViewAccessorRS(vaName);
        rs.setAssociationConsistent(true);
        return rs;
    }

    /**Gets LookupCodeEO entity object.
     * @return
     */
    public EntityImpl getLookupCodeEO() {
        return (EntityImpl)getEntity(1);
    }

    /**Gets the attribute value for LOOKUP_TYPE using the alias name LookupType.
     * @return
     */
    public String getLookupType() {
        return (String) getAttributeInternal(LOOKUPTYPE);
    }

    /**Sets <code>value</code> as attribute value for LOOKUP_TYPE using the alias name LookupType.
     * @param value
     */
    public void setLookupType(String value) {
        setAttributeInternal(LOOKUPTYPE, value);
    }

    /**Gets the attribute value for LOOKUP_CODE using the alias name LookupCode.
     * @return
     */
    public String getLookupCode() {
        return (String) getAttributeInternal(LOOKUPCODE);
    }

    /**Sets <code>value</code> as attribute value for LOOKUP_CODE using the alias name LookupCode.
     * @param value
     */
    public void setLookupCode(String value) {
        setAttributeInternal(LOOKUPCODE, value);
    }

    /**Gets the attribute value for MEANING using the alias name Meaning.
     * @return
     */
    public String getMeaning() {
        return (String) getAttributeInternal(MEANING);
    }

    /**Sets <code>value</code> as attribute value for MEANING using the alias name Meaning.
     * @param value
     */
    public void setMeaning(String value) {
        setAttributeInternal(MEANING, value);
    }

    /**Gets the attribute value for LANGUAGE using the alias name Language.
     * @return
     */
    public String getLanguage() {
        return (String) getAttributeInternal(LANGUAGE);
    }

    /**Sets <code>value</code> as attribute value for LANGUAGE using the alias name Language.
     * @param value
     */
    public void setLanguage(String value) {
        setAttributeInternal(LANGUAGE, value);
    }

    /**Gets the attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId1.
     * @return
     */
    public Number getObjectVersionId1() {
        return (Number) getAttributeInternal(OBJECTVERSIONID1);
    }

    /**
     * Sets <code>value</code> as attribute value for OBJECT_VERSION_ID using the alias name ObjectVersionId1.
     * @param value value to set the OBJECT_VERSION_ID
     */
    public void setObjectVersionId1(Number value) {
        setAttributeInternal(OBJECTVERSIONID1, value);
    }
}
