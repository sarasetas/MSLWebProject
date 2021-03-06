package model;
// Generated Aug 30, 2017 2:20:17 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * PolicyHolder generated by hbm2java
 */
public class PolicyHolder implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8236866319556285329L;
	private int sqPolicyHolder;
	private String acPolicyNumber;
	private String dsPartnerName;
	private String acNif;
	private Date dtBirth;
	private String acPolicyHolderType;
	private String acProfessionCode;
	private String dsProfession;
	private Date dtUnemployed;
	private String acEmployeeCategory;
	private String dsAddress;
	private String dsLocation;
	private String dsPostalCode;
	private String acCountry;
	private String acPhoneNumber;
	private String acPersonalPhoneNumber;
	private String acFaxNumber;
	private String acEmail;
	private String acFiscalDocumentNumber;
	private Date dtFiscalDocument;
	private String acFicalDocument;
	private Date dtFiscalDocumentEnd;
	private String acNationality;
	private String acBank;
	private String acOffice;
	private String acNib;
	private String acCollectionUserCode;
	private String acManagerUserCode;
	private String acOriginGroup;
	private int niDrivingLicense;
	private String dtDrivingLicense;
	private String dtDrivingLicenseEnd;
	private String acDrivingLicense;
	private String dsHistory;
	private String dsObservation;
	private String acCreationUser;
	private Date tsCreation;
	private String acLastUpdateUser;
	private Date tsLastUpdate;

	public PolicyHolder() {
	}

	public PolicyHolder(int sqPolicyHolder, String acPolicyNumber, String acCreationUser, Date tsCreation,
			String acLastUpdateUser, Date tsLastUpdate) {
		this.sqPolicyHolder = sqPolicyHolder;
		this.acPolicyNumber = acPolicyNumber;
		this.acCreationUser = acCreationUser;
		this.tsCreation = tsCreation;
		this.acLastUpdateUser = acLastUpdateUser;
		this.tsLastUpdate = tsLastUpdate;
	}

	public PolicyHolder(int sqPolicyHolder, String acPolicyNumber, String dsPartnerName, String acNif, Date dtBirth,
			String acPolicyHolderType, String acProfessionCode, String dsProfession, Date dtUnemployed,
			String acEmployeeCategory, String dsAddress, String dsLocation, String dsPostalCode, String acCountry,
			String acPhoneNumber, String acPersonalPhoneNumber, String acFaxNumber, String acEmail,
			String acFiscalDocumentNumber, Date dtFiscalDocument, String acFicalDocument, Date dtFiscalDocumentEnd,
			String acNationality, String acBank, String acOffice, String acNib, String acCollectionUserCode,
			String acManagerUserCode, String acOriginGroup, int niDrivingLicense, String dtDrivingLicense,
			String dtDrivingLicenseEnd, String acDrivingLicense, String dsHistory, String dsObservation,
			String acCreationUser, Date tsCreation, String acLastUpdateUser, Date tsLastUpdate) {
		this.sqPolicyHolder = sqPolicyHolder;
		this.acPolicyNumber = acPolicyNumber;
		this.dsPartnerName = dsPartnerName;
		this.acNif = acNif;
		this.dtBirth = dtBirth;
		this.acPolicyHolderType = acPolicyHolderType;
		this.acProfessionCode = acProfessionCode;
		this.dsProfession = dsProfession;
		this.dtUnemployed = dtUnemployed;
		this.acEmployeeCategory = acEmployeeCategory;
		this.dsAddress = dsAddress;
		this.dsLocation = dsLocation;
		this.dsPostalCode = dsPostalCode;
		this.acCountry = acCountry;
		this.acPhoneNumber = acPhoneNumber;
		this.acPersonalPhoneNumber = acPersonalPhoneNumber;
		this.acFaxNumber = acFaxNumber;
		this.acEmail = acEmail;
		this.acFiscalDocumentNumber = acFiscalDocumentNumber;
		this.dtFiscalDocument = dtFiscalDocument;
		this.acFicalDocument = acFicalDocument;
		this.dtFiscalDocumentEnd = dtFiscalDocumentEnd;
		this.acNationality = acNationality;
		this.acBank = acBank;
		this.acOffice = acOffice;
		this.acNib = acNib;
		this.acCollectionUserCode = acCollectionUserCode;
		this.acManagerUserCode = acManagerUserCode;
		this.acOriginGroup = acOriginGroup;
		this.niDrivingLicense = niDrivingLicense;
		this.dtDrivingLicense = dtDrivingLicense;
		this.dtDrivingLicenseEnd = dtDrivingLicenseEnd;
		this.acDrivingLicense = acDrivingLicense;
		this.dsHistory = dsHistory;
		this.dsObservation = dsObservation;
		this.acCreationUser = acCreationUser;
		this.tsCreation = tsCreation;
		this.acLastUpdateUser = acLastUpdateUser;
		this.tsLastUpdate = tsLastUpdate;
	}

	public int getSqPolicyHolder() {
		return this.sqPolicyHolder;
	}

	public void setSqPolicyHolder(int sqPolicyHolder) {
		this.sqPolicyHolder = sqPolicyHolder;
	}

	public String getAcPolicyNumber() {
		return this.acPolicyNumber;
	}

	public void setAcPolicyNumber(String acPolicyNumber) {
		this.acPolicyNumber = acPolicyNumber;
	}

	public String getDsPartnerName() {
		return this.dsPartnerName;
	}

	public void setDsPartnerName(String dsPartnerName) {
		this.dsPartnerName = dsPartnerName;
	}

	public String getAcNif() {
		return this.acNif;
	}

	public void setAcNif(String acNif) {
		this.acNif = acNif;
	}

	public Date getDtBirth() {
		return this.dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public String getAcPolicyHolderType() {
		return this.acPolicyHolderType;
	}

	public void setAcPolicyHolderType(String acPolicyHolderType) {
		this.acPolicyHolderType = acPolicyHolderType;
	}

	public String getAcProfessionCode() {
		return this.acProfessionCode;
	}

	public void setAcProfessionCode(String acProfessionCode) {
		this.acProfessionCode = acProfessionCode;
	}

	public String getDsProfession() {
		return this.dsProfession;
	}

	public void setDsProfession(String dsProfession) {
		this.dsProfession = dsProfession;
	}

	public Date getDtUnemployed() {
		return this.dtUnemployed;
	}

	public void setDtUnemployed(Date dtUnemployed) {
		this.dtUnemployed = dtUnemployed;
	}

	public String getAcEmployeeCategory() {
		return this.acEmployeeCategory;
	}

	public void setAcEmployeeCategory(String acEmployeeCategory) {
		this.acEmployeeCategory = acEmployeeCategory;
	}

	public String getDsAddress() {
		return this.dsAddress;
	}

	public void setDsAddress(String dsAddress) {
		this.dsAddress = dsAddress;
	}

	public String getDsLocation() {
		return this.dsLocation;
	}

	public void setDsLocation(String dsLocation) {
		this.dsLocation = dsLocation;
	}

	public String getDsPostalCode() {
		return this.dsPostalCode;
	}

	public void setDsPostalCode(String dsPostalCode) {
		this.dsPostalCode = dsPostalCode;
	}

	public String getAcCountry() {
		return this.acCountry;
	}

	public void setAcCountry(String acCountry) {
		this.acCountry = acCountry;
	}

	public String getAcPhoneNumber() {
		return this.acPhoneNumber;
	}

	public void setAcPhoneNumber(String acPhoneNumber) {
		this.acPhoneNumber = acPhoneNumber;
	}

	public String getAcPersonalPhoneNumber() {
		return this.acPersonalPhoneNumber;
	}

	public void setAcPersonalPhoneNumber(String acPersonalPhoneNumber) {
		this.acPersonalPhoneNumber = acPersonalPhoneNumber;
	}

	public String getAcFaxNumber() {
		return this.acFaxNumber;
	}

	public void setAcFaxNumber(String acFaxNumber) {
		this.acFaxNumber = acFaxNumber;
	}

	public String getAcEmail() {
		return this.acEmail;
	}

	public void setAcEmail(String acEmail) {
		this.acEmail = acEmail;
	}

	public String getAcFiscalDocumentNumber() {
		return this.acFiscalDocumentNumber;
	}

	public void setAcFiscalDocumentNumber(String acFiscalDocumentNumber) {
		this.acFiscalDocumentNumber = acFiscalDocumentNumber;
	}

	public Date getDtFiscalDocument() {
		return this.dtFiscalDocument;
	}

	public void setDtFiscalDocument(Date dtFiscalDocument) {
		this.dtFiscalDocument = dtFiscalDocument;
	}

	public String getAcFicalDocument() {
		return this.acFicalDocument;
	}

	public void setAcFicalDocument(String acFicalDocument) {
		this.acFicalDocument = acFicalDocument;
	}

	public Date getDtFiscalDocumentEnd() {
		return this.dtFiscalDocumentEnd;
	}

	public void setDtFiscalDocumentEnd(Date dtFiscalDocumentEnd) {
		this.dtFiscalDocumentEnd = dtFiscalDocumentEnd;
	}

	public String getAcNationality() {
		return this.acNationality;
	}

	public void setAcNationality(String acNationality) {
		this.acNationality = acNationality;
	}

	public String getAcBank() {
		return this.acBank;
	}

	public void setAcBank(String acBank) {
		this.acBank = acBank;
	}

	public String getAcOffice() {
		return this.acOffice;
	}

	public void setAcOffice(String acOffice) {
		this.acOffice = acOffice;
	}

	public String getAcNib() {
		return this.acNib;
	}

	public void setAcNib(String acNib) {
		this.acNib = acNib;
	}

	public String getAcCollectionUserCode() {
		return this.acCollectionUserCode;
	}

	public void setAcCollectionUserCode(String acCollectionUserCode) {
		this.acCollectionUserCode = acCollectionUserCode;
	}

	public String getAcManagerUserCode() {
		return this.acManagerUserCode;
	}

	public void setAcManagerUserCode(String acManagerUserCode) {
		this.acManagerUserCode = acManagerUserCode;
	}

	public String getAcOriginGroup() {
		return this.acOriginGroup;
	}

	public void setAcOriginGroup(String acOriginGroup) {
		this.acOriginGroup = acOriginGroup;
	}

	public int getNiDrivingLicense() {
		return this.niDrivingLicense;
	}

	public void setNiDrivingLicense(int niDrivingLicense) {
		this.niDrivingLicense = niDrivingLicense;
	}

	public String getDtDrivingLicense() {
		return this.dtDrivingLicense;
	}

	public void setDtDrivingLicense(String dtDrivingLicense) {
		this.dtDrivingLicense = dtDrivingLicense;
	}

	public String getDtDrivingLicenseEnd() {
		return this.dtDrivingLicenseEnd;
	}

	public void setDtDrivingLicenseEnd(String dtDrivingLicenseEnd) {
		this.dtDrivingLicenseEnd = dtDrivingLicenseEnd;
	}

	public String getAcDrivingLicense() {
		return this.acDrivingLicense;
	}

	public void setAcDrivingLicense(String acDrivingLicense) {
		this.acDrivingLicense = acDrivingLicense;
	}

	public String getDsHistory() {
		return this.dsHistory;
	}

	public void setDsHistory(String dsHistory) {
		this.dsHistory = dsHistory;
	}

	public String getDsObservation() {
		return this.dsObservation;
	}

	public void setDsObservation(String dsObservation) {
		this.dsObservation = dsObservation;
	}

	public String getAcCreationUser() {
		return this.acCreationUser;
	}

	public void setAcCreationUser(String acCreationUser) {
		this.acCreationUser = acCreationUser;
	}

	public Date getTsCreation() {
		return this.tsCreation;
	}

	public void setTsCreation(Date tsCreation) {
		this.tsCreation = tsCreation;
	}

	public String getAcLastUpdateUser() {
		return this.acLastUpdateUser;
	}

	public void setAcLastUpdateUser(String acLastUpdateUser) {
		this.acLastUpdateUser = acLastUpdateUser;
	}

	public Date getTsLastUpdate() {
		return this.tsLastUpdate;
	}

	public void setTsLastUpdate(Date tsLastUpdate) {
		this.tsLastUpdate = tsLastUpdate;
	}

}
