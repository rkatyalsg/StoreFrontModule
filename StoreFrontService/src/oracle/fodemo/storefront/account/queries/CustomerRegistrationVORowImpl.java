package oracle.fodemo.storefront.account.queries;

import oracle.fodemo.storefront.entities.PersonEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomerRegistrationVORowImpl extends ViewRowImpl {
    public static final int CUSTOMERADDRESSVO2 = 31;
    public static final int CUSTOMERPAYMENTOPTIONVO1 = 30;
    public static final int CUSTOMERADDRESSVO1 = 29;
    public static final int CUSTOMERINTERESTSVO2 = 32;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        PersonId {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getPersonId();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setPersonId((DBSequence)value);
            }
        }
        ,
        PrincipalName {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getPrincipalName();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setPrincipalName((String)value);
            }
        }
        ,
        Title {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getTitle();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        FirstName {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getFirstName();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getLastName();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        PersonTypeCode {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getPersonTypeCode();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setPersonTypeCode((String)value);
            }
        }
        ,
        ProvisionedFlag {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getProvisionedFlag();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setProvisionedFlag((String)value);
            }
        }
        ,
        PrimaryAddressId {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getPrimaryAddressId();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setPrimaryAddressId((Number)value);
            }
        }
        ,
        RegisteredDate {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getRegisteredDate();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setRegisteredDate((Date)value);
            }
        }
        ,
        MembershipId {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getMembershipId();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setMembershipId((Number)value);
            }
        }
        ,
        Email {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getEmail();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        ConfirmedEmail {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getConfirmedEmail();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setConfirmedEmail((String)value);
            }
        }
        ,
        PhoneNumber {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setPhoneNumber((String)value);
            }
        }
        ,
        MobilePhoneNumber {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getMobilePhoneNumber();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setMobilePhoneNumber((String)value);
            }
        }
        ,
        CreditLimit {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getCreditLimit();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setCreditLimit((Number)value);
            }
        }
        ,
        DateOfBirth {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getDateOfBirth();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setDateOfBirth((Date)value);
            }
        }
        ,
        MaritalStatusCode {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getMaritalStatusCode();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setMaritalStatusCode((String)value);
            }
        }
        ,
        Gender {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getGender();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setGender((String)value);
            }
        }
        ,
        ChildrenUnder18 {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getChildrenUnder18();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setChildrenUnder18((Number)value);
            }
        }
        ,
        ApproximateIncome {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getApproximateIncome();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setApproximateIncome((Number)value);
            }
        }
        ,
        ContactMethodCode {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getContactMethodCode();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setContactMethodCode((String)value);
            }
        }
        ,
        ContactableFlag {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getContactableFlag();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setContactableFlag((String)value);
            }
        }
        ,
        ContactByAffilliatesFlag {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getContactByAffilliatesFlag();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setContactByAffilliatesFlag((String)value);
            }
        }
        ,
        ObjectVersionId {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setObjectVersionId((Number)value);
            }
        }
        ,
        ContactableCheckBox {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getContactableCheckBox();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setContactableCheckBox((Boolean)value);
            }
        }
        ,
        ContactByAffiliatesCheckBox {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getContactByAffiliatesCheckBox();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setContactByAffiliatesCheckBox((Boolean)value);
            }
        }
        ,
        CustomerPaymentOptionVO {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getCustomerPaymentOptionVO();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerInterestsVO {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getCustomerInterestsVO();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerAddressVO {
            public Object get(CustomerRegistrationVORowImpl obj) {
                return obj.getCustomerAddressVO();
            }

            public void put(CustomerRegistrationVORowImpl obj, Object value) {
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
        public abstract Object get(CustomerRegistrationVORowImpl object);

        /**
         * @param object
         * @param value
         */
        public abstract void put(CustomerRegistrationVORowImpl object,
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
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int PRINCIPALNAME = AttributesEnum.PrincipalName.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int PERSONTYPECODE = AttributesEnum.PersonTypeCode.index();
    public static final int PROVISIONEDFLAG = AttributesEnum.ProvisionedFlag.index();
    public static final int PRIMARYADDRESSID = AttributesEnum.PrimaryAddressId.index();
    public static final int REGISTEREDDATE = AttributesEnum.RegisteredDate.index();
    public static final int MEMBERSHIPID = AttributesEnum.MembershipId.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int CONFIRMEDEMAIL = AttributesEnum.ConfirmedEmail.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int MOBILEPHONENUMBER = AttributesEnum.MobilePhoneNumber.index();
    public static final int CREDITLIMIT = AttributesEnum.CreditLimit.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int MARITALSTATUSCODE = AttributesEnum.MaritalStatusCode.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int CHILDRENUNDER18 = AttributesEnum.ChildrenUnder18.index();
    public static final int APPROXIMATEINCOME = AttributesEnum.ApproximateIncome.index();
    public static final int CONTACTMETHODCODE = AttributesEnum.ContactMethodCode.index();
    public static final int CONTACTABLEFLAG = AttributesEnum.ContactableFlag.index();
    public static final int CONTACTBYAFFILLIATESFLAG = AttributesEnum.ContactByAffilliatesFlag.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int CONTACTABLECHECKBOX = AttributesEnum.ContactableCheckBox.index();
    public static final int CONTACTBYAFFILIATESCHECKBOX = AttributesEnum.ContactByAffiliatesCheckBox.index();
    public static final int CUSTOMERPAYMENTOPTIONVO = AttributesEnum.CustomerPaymentOptionVO.index();
    public static final int CUSTOMERINTERESTSVO = AttributesEnum.CustomerInterestsVO.index();
    public static final int CUSTOMERADDRESSVO = AttributesEnum.CustomerAddressVO.index();

    /**This is the default constructor (do not remove).
     */
    public CustomerRegistrationVORowImpl() {
    }

    /**Gets PersonEO entity object.
     * @return
     */
    public PersonEOImpl getPersonEO() {
        return (PersonEOImpl)getEntity(0);
    }

    /**Gets the attribute value for PERSON_ID using the alias name PersonId.
     * @return
     */
    public DBSequence getPersonId() {
        return (DBSequence)getAttributeInternal(PERSONID);
    }

    /**Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value
     */
    public void setPersonId(DBSequence value) {
        setAttributeInternal(PERSONID, value);
    }

    /**Gets the attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     * @return
     */
    public String getPrincipalName() {
        return (String) getAttributeInternal(PRINCIPALNAME);
    }

    /**Sets <code>value</code> as attribute value for PRINCIPAL_NAME using the alias name PrincipalName.
     * @param value
     */
    public void setPrincipalName(String value) {
        setAttributeInternal(PRINCIPALNAME, value);
    }

    /**Gets the attribute value for TITLE using the alias name Title.
     * @return
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**Sets <code>value</code> as attribute value for TITLE using the alias name Title.
     * @param value
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**Gets the attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     * @return
     */
    public String getPersonTypeCode() {
        return (String) getAttributeInternal(PERSONTYPECODE);
    }

    /**Sets <code>value</code> as attribute value for PERSON_TYPE_CODE using the alias name PersonTypeCode.
     * @param value
     */
    public void setPersonTypeCode(String value) {
        setAttributeInternal(PERSONTYPECODE, value);
    }

    /**Gets the attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     * @return
     */
    public String getProvisionedFlag() {
        return (String) getAttributeInternal(PROVISIONEDFLAG);
    }

    /**Sets <code>value</code> as attribute value for PROVISIONED_FLAG using the alias name ProvisionedFlag.
     * @param value
     */
    public void setProvisionedFlag(String value) {
        setAttributeInternal(PROVISIONEDFLAG, value);
    }

    /**Gets the attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     * @return
     */
    public Number getPrimaryAddressId() {
        return (Number) getAttributeInternal(PRIMARYADDRESSID);
    }

    /**Sets <code>value</code> as attribute value for PRIMARY_ADDRESS_ID using the alias name PrimaryAddressId.
     * @param value
     */
    public void setPrimaryAddressId(Number value) {
        setAttributeInternal(PRIMARYADDRESSID, value);
    }

    /**Gets the attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     * @return
     */
    public Date getRegisteredDate() {
        return (Date) getAttributeInternal(REGISTEREDDATE);
    }

    /**Sets <code>value</code> as attribute value for REGISTERED_DATE using the alias name RegisteredDate.
     * @param value
     */
    public void setRegisteredDate(Date value) {
        setAttributeInternal(REGISTEREDDATE, value);
    }

    /**Gets the attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     * @return
     */
    public Number getMembershipId() {
        return (Number) getAttributeInternal(MEMBERSHIPID);
    }

    /**Sets <code>value</code> as attribute value for MEMBERSHIP_ID using the alias name MembershipId.
     * @param value
     */
    public void setMembershipId(Number value) {
        setAttributeInternal(MEMBERSHIPID, value);
    }

    /**Gets the attribute value for EMAIL using the alias name Email.
     * @return
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**Gets the attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     * @return
     */
    public String getConfirmedEmail() {
        return (String) getAttributeInternal(CONFIRMEDEMAIL);
    }

    /**Sets <code>value</code> as attribute value for CONFIRMED_EMAIL using the alias name ConfirmedEmail.
     * @param value
     */
    public void setConfirmedEmail(String value) {
        setAttributeInternal(CONFIRMEDEMAIL, value);
    }

    /**Gets the attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @return
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**Sets <code>value</code> as attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @param value
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**Gets the attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     * @return
     */
    public String getMobilePhoneNumber() {
        return (String) getAttributeInternal(MOBILEPHONENUMBER);
    }

    /**Sets <code>value</code> as attribute value for MOBILE_PHONE_NUMBER using the alias name MobilePhoneNumber.
     * @param value
     */
    public void setMobilePhoneNumber(String value) {
        setAttributeInternal(MOBILEPHONENUMBER, value);
    }

    /**Gets the attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     * @return
     */
    public Number getCreditLimit() {
        return (Number) getAttributeInternal(CREDITLIMIT);
    }

    /**Sets <code>value</code> as attribute value for CREDIT_LIMIT using the alias name CreditLimit.
     * @param value
     */
    public void setCreditLimit(Number value) {
        setAttributeInternal(CREDITLIMIT, value);
    }

    /**Gets the attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @return
     */
    public Date getDateOfBirth() {
        return (Date) getAttributeInternal(DATEOFBIRTH);
    }

    /**Sets <code>value</code> as attribute value for DATE_OF_BIRTH using the alias name DateOfBirth.
     * @param value
     */
    public void setDateOfBirth(Date value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**Gets the attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     * @return
     */
    public String getMaritalStatusCode() {
        return (String) getAttributeInternal(MARITALSTATUSCODE);
    }

    /**Sets <code>value</code> as attribute value for MARITAL_STATUS_CODE using the alias name MaritalStatusCode.
     * @param value
     */
    public void setMaritalStatusCode(String value) {
        setAttributeInternal(MARITALSTATUSCODE, value);
    }

    /**Gets the attribute value for GENDER using the alias name Gender.
     * @return
     */
    public String getGender() {
        return (String) getAttributeInternal(GENDER);
    }

    /**Sets <code>value</code> as attribute value for GENDER using the alias name Gender.
     * @param value
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**Gets the attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     * @return
     */
    public Number getChildrenUnder18() {
        return (Number) getAttributeInternal(CHILDRENUNDER18);
    }

    /**Sets <code>value</code> as attribute value for CHILDREN_UNDER_18 using the alias name ChildrenUnder18.
     * @param value
     */
    public void setChildrenUnder18(Number value) {
        setAttributeInternal(CHILDRENUNDER18, value);
    }

    /**Gets the attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     * @return
     */
    public Number getApproximateIncome() {
        return (Number) getAttributeInternal(APPROXIMATEINCOME);
    }

    /**Sets <code>value</code> as attribute value for APPROXIMATE_INCOME using the alias name ApproximateIncome.
     * @param value
     */
    public void setApproximateIncome(Number value) {
        setAttributeInternal(APPROXIMATEINCOME, value);
    }

    /**Gets the attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     * @return
     */
    public String getContactMethodCode() {
        return (String) getAttributeInternal(CONTACTMETHODCODE);
    }

    /**Sets <code>value</code> as attribute value for CONTACT_METHOD_CODE using the alias name ContactMethodCode.
     * @param value
     */
    public void setContactMethodCode(String value) {
        setAttributeInternal(CONTACTMETHODCODE, value);
    }

    /**Gets the attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     * @return
     */
    public String getContactableFlag() {
        return (String) getAttributeInternal(CONTACTABLEFLAG);
    }

    /**Sets <code>value</code> as attribute value for CONTACTABLE_FLAG using the alias name ContactableFlag.
     * @param value
     */
    public void setContactableFlag(String value) {
        setAttributeInternal(CONTACTABLEFLAG, value);
    }

    /**Gets the attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     * @return
     */
    public String getContactByAffilliatesFlag() {
        return (String) getAttributeInternal(CONTACTBYAFFILLIATESFLAG);
    }

    /**Sets <code>value</code> as attribute value for CONTACT_BY_AFFILLIATES_FLAG using the alias name ContactByAffilliatesFlag.
     * @param value
     */
    public void setContactByAffilliatesFlag(String value) {
        setAttributeInternal(CONTACTBYAFFILLIATESFLAG, value);
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

    /**Gets the attribute value for the calculated attribute ContactableCheckBox.
     * @return
     */
    public Boolean getContactableCheckBox() {
        return toBooleanValue((String)getAttributeInternal(CONTACTABLEFLAG));
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ContactableCheckBox.
     * @param value
     */
    public void setContactableCheckBox(Boolean value) {
      populateAttribute(CONTACTABLECHECKBOX, value);
      setAttributeInternal(CONTACTABLEFLAG, toFlagValue(value));
    }

    /**Gets the attribute value for the calculated attribute ContactByAffiliatesCheckBox.
     * @return
     */
    public Boolean getContactByAffiliatesCheckBox() {
        return toBooleanValue((String)getAttributeInternal(CONTACTBYAFFILLIATESFLAG));
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ContactByAffiliatesCheckBox.
     * @param value
     */
    public void setContactByAffiliatesCheckBox(Boolean value) {
        populateAttribute(CONTACTBYAFFILIATESCHECKBOX, value);
        setAttributeInternal(CONTACTBYAFFILLIATESFLAG, toFlagValue(value));
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
    
    private String toFlagValue(Boolean bValue){
        if (bValue){
            return "Y";
        } else {
            return "N";
        }
    }
    
    private Boolean toBooleanValue(String sValue){
        if ("Y".equals(sValue)){
            return true;
        } else {
            return false;
        }        
    }


    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerAddressVO2.
     * @return
     */
    public RowIterator getCustomerAddressVO2() {
        return (RowIterator)getAttributeInternal(CUSTOMERADDRESSVO2);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerPaymentOptionVO1.
     * @return
     */
    public RowIterator getCustomerPaymentOptionVO1() {
        return (RowIterator)getAttributeInternal(CUSTOMERPAYMENTOPTIONVO1);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerInterestsVO2.
     * @return
     */
    public RowIterator getCustomerInterestsVO2() {
        return (RowIterator)getAttributeInternal(CUSTOMERINTERESTSVO2);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerPaymentOptionVO.
     * @return
     */
    public RowIterator getCustomerPaymentOptionVO() {
        return (RowIterator)getAttributeInternal(CUSTOMERPAYMENTOPTIONVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerInterestsVO.
     * @return
     */
    public RowIterator getCustomerInterestsVO() {
        return (RowIterator)getAttributeInternal(CUSTOMERINTERESTSVO);
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link CustomerAddressVO.
     * @return
     */
    public RowIterator getCustomerAddressVO() {
        return (RowIterator)getAttributeInternal(CUSTOMERADDRESSVO);
    }
}
