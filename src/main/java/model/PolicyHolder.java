package model;
// Generated Jun 23, 2017 4:01:34 PM by Hibernate Tools 3.5.0.Final

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * T020PolicyHolder generated by hbm2java
 */
@XmlRootElement
public class PolicyHolder implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int policyHolderSequence;
	private String policyNumberCode;
	private String partnerName;
	private String NIFCode;
	private Date birthDate;
	private String policyHolderType;
	private String professionCode;
	private String professionDescription;
	private Date unemployedDate;
	private String employeeCategory;
	private String address;
	private String location;
	private String postalCode;
	private String country;
	private String phoneNumber;
	private String personalPhoneNumber;
	private String faxNumber;
	private String email;
	private String fiscalDocumentNumber;
	private Date fiscalDocumentDate;
	private String fiscalDocumentType;
	private Date fiscalDocumentEndDate;
	private String nationality;
	private String bank;
	private String office;
	private String nib;
	private String collectionUserCode;
	private String managerUserCode;
	private String originGroup;
	private int drivingLicenseNumber;
	private Date drivingLicenseDate;
	private Date drivingLicenseEndDate;
	private String drivingLicenseCategory;
	private String history;
	private String observation;

	public PolicyHolder() {
	}

	public PolicyHolder(int policyHolderSequence) {
		this.policyHolderSequence = policyHolderSequence;
	}

	public PolicyHolder(int policyHolderSequence, String policyNumberCode, String partnerName, String NIFCode,
			Date birthDate, String policyHolderType, String professionCode, String professionDescription,
			Date unemployedDate, String employeeCategory, String address, String location, String postalCode,
			String country, String phoneNumber, String personalPhoneNumber, String faxNumber, String email,
			String fiscalDocumentNumber, Date fiscalDocumentDate, String fiscalDocumentType, Date fiscalDocumentEndDate,
			String nationality, String bank, String office, String nib, String collectionUserCode,
			String managerUserCode, String originGroup, int drivingLicenseNumber, Date drivingLicenseDate,
			Date drivingLicenseEndDate, String drivingLicenseCategory, String history, String observation) {
		super();
		this.policyHolderSequence = policyHolderSequence;
		this.policyNumberCode = policyNumberCode;
		this.partnerName = partnerName;
		this.NIFCode = NIFCode;
		this.birthDate = birthDate;
		this.policyHolderType = policyHolderType;
		this.professionCode = professionCode;
		this.professionDescription = professionDescription;
		this.unemployedDate = unemployedDate;
		this.employeeCategory = employeeCategory;
		this.address = address;
		this.location = location;
		this.postalCode = postalCode;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.personalPhoneNumber = personalPhoneNumber;
		this.faxNumber = faxNumber;
		this.email = email;
		this.fiscalDocumentNumber = fiscalDocumentNumber;
		this.fiscalDocumentDate = fiscalDocumentDate;
		this.fiscalDocumentType = fiscalDocumentType;
		this.fiscalDocumentEndDate = fiscalDocumentEndDate;
		this.nationality = nationality;
		this.bank = bank;
		this.office = office;
		this.nib = nib;
		this.collectionUserCode = collectionUserCode;
		this.managerUserCode = managerUserCode;
		this.originGroup = originGroup;
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.drivingLicenseDate = drivingLicenseDate;
		this.drivingLicenseEndDate = drivingLicenseEndDate;
		this.drivingLicenseCategory = drivingLicenseCategory;
		this.history = history;
		this.observation = observation;
	}

	public int getPolicyHolderSequence() {
		return policyHolderSequence;
	}

	public void setPolicyHolderSequence(int policyHolderSequence) {
		this.policyHolderSequence = policyHolderSequence;
	}

	public String getPolicyNumberCode() {
		return policyNumberCode;
	}

	public void setPolicyNumberCode(String policyNumberCode) {
		this.policyNumberCode = policyNumberCode;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getNIFCode() {
		return NIFCode;
	}

	public void setNIFCode(String nIFCode) {
		this.NIFCode = nIFCode;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPolicyHolderType() {
		return policyHolderType;
	}

	public void setPolicyHolderType(String policyHolderType) {
		this.policyHolderType = policyHolderType;
	}

	public String getProfessionCode() {
		return professionCode;
	}

	public void setProfessionCode(String professionCode) {
		this.professionCode = professionCode;
	}

	public String getProfessionDescription() {
		return professionDescription;
	}

	public void setProfessionDescription(String professionDescription) {
		this.professionDescription = professionDescription;
	}

	public Date getUnemployedDate() {
		return unemployedDate;
	}

	public void setUnemployedDate(Date unemployedDate) {
		this.unemployedDate = unemployedDate;
	}

	public String getEmployeeCategory() {
		return employeeCategory;
	}

	public void setEmployeeCategory(String employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPersonalPhoneNumber() {
		return personalPhoneNumber;
	}

	public void setPersonalPhoneNumber(String personalPhoneNumber) {
		this.personalPhoneNumber = personalPhoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFiscalDocumentNumber() {
		return fiscalDocumentNumber;
	}

	public void setFiscalDocumentNumber(String fiscalDocumentNumber) {
		this.fiscalDocumentNumber = fiscalDocumentNumber;
	}

	public Date getFiscalDocumentDate() {
		return fiscalDocumentDate;
	}

	public void setFiscalDocumentDate(Date fiscalDocumentDate) {
		this.fiscalDocumentDate = fiscalDocumentDate;
	}

	public String getfiscalDocumentType() {
		return fiscalDocumentType;
	}

	public void setFiscalDocumentType (String fiscalDocumentType) {
		this.fiscalDocumentType = fiscalDocumentType;
	}

	public Date getFiscalDocumentEndDate() {
		return fiscalDocumentEndDate;
	}

	public void setFiscalDocumentEndDate(Date fiscalDocumentEndDate) {
		this.fiscalDocumentEndDate = fiscalDocumentEndDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getNib() {
		return nib;
	}

	public void setNib(String nib) {
		this.nib = nib;
	}

	public String getCollectionUserCode() {
		return collectionUserCode;
	}

	public void setCollectionUserCode(String collectionUserCode) {
		this.collectionUserCode = collectionUserCode;
	}

	public String getManagerUserCode() {
		return managerUserCode;
	}

	public void setManagerUserCode(String managerUserCode) {
		this.managerUserCode = managerUserCode;
	}

	public String getOriginGroup() {
		return originGroup;
	}

	public void setOriginGroup(String originGroup) {
		this.originGroup = originGroup;
	}

	public int getdrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setdrivingLicenseNumber(int drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public Date getDrivingLicenseDate() {
		return drivingLicenseDate;
	}

	public void setDrivingLicenseDate(Date drivingLicenseDate) {
		this.drivingLicenseDate = drivingLicenseDate;
	}

	public Date getDrivingLicenseEndDate() {
		return drivingLicenseEndDate;
	}

	public void setDrivingLicenseEndDate(Date drivingLicenseEndDate) {
		this.drivingLicenseEndDate = drivingLicenseEndDate;
	}

	public String getDrivingLicenseCategory() {
		return drivingLicenseCategory;
	}

	public void setDrivingLicenseCategory(String drivingLicenseCategory) {
		this.drivingLicenseCategory = drivingLicenseCategory;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}