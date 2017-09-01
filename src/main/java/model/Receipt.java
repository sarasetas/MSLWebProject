package model;
// Generated Aug 30, 2017 2:20:17 PM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Receipt generated by hbm2java
 */
public class Receipt implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5554642239082440896L;
	private int sqReceipt;
	private String acCompany;
	private int sqOperation;
	private String acOperationType;
	private String acOriginalReceiptNumber;
	private String acReceiptType;
	private String acReceiptSubtype;
	private int sqPolicyHolder;
	private String acPolicyNumber;
	private Date dtEmission;
	private Date dtDueDate;
	private Date dtMaturityDate;
	private Date dtCancelPolicy;
	private String acPremiumPeriod;
	private String acBranch;
	private String acProduct;
	private Date dtRiskBegin;
	private Date dtRiskEnd;
	private String acProposalNumber;
	private String acBenefits;
	private String fgGroupCollection;
	private String acGroupPolicy;
	private String acLicensePlate;
	private Date dtWorkBegin;
	private Date dtWorkEnd;
	private int niWorkDuration;
	private BigDecimal amReceiptTotal;
	private BigDecimal amSimplePremium;
	private BigDecimal amComercialPremium;
	private BigDecimal amComercialDiscount;
	private BigDecimal amGreenCardCosts;
	private BigDecimal amRecordCost;
	private BigDecimal amPolicyCost;
	private BigDecimal amBonusMalus;
	private BigDecimal amAssistance;
	private BigDecimal amSurcharge;
	private BigDecimal amPremiumCorrection;
	private String acCurrency;
	private String acClaimNumber;
	private String acSubClaimNumber;
	private Date dtClaimOccurrence;
	private Date dtClaimOpening;
	private String acClaimDocumentNumber;
	private String acIds;
	private int fgAggregation;
	private String acAggregationReference;
	private String acAtmEntity;
	private String acAtmReference;
	private String acCttReference;
	private String fgCollectLetterSent;
	private int niInsuredObjects;
	private String dsInsuredObject;
	private String acManagerUserCode;
	private String acCreationUser;
	private Date tsCreation;
	private String acLastUpdateUser;
	private Date tsLastUpdate;

	public Receipt() {
	}

	public Receipt(int sqReceipt, String acCompany, int sqOperation, String acOperationType,
			String acOriginalReceiptNumber, String acReceiptType, String acReceiptSubtype, int sqPolicyHolder,
			String acPolicyNumber, Date dtEmission, Date dtDueDate, Date dtMaturityDate, String acPremiumPeriod,
			String acBranch, String acProduct, BigDecimal amReceiptTotal, String acCurrency, String acIds,
			String acCreationUser, Date tsCreation, String acLastUpdateUser, Date tsLastUpdate) {
		this.sqReceipt = sqReceipt;
		this.acCompany = acCompany;
		this.sqOperation = sqOperation;
		this.acOperationType = acOperationType;
		this.acOriginalReceiptNumber = acOriginalReceiptNumber;
		this.acReceiptType = acReceiptType;
		this.acReceiptSubtype = acReceiptSubtype;
		this.sqPolicyHolder = sqPolicyHolder;
		this.acPolicyNumber = acPolicyNumber;
		this.dtEmission = dtEmission;
		this.dtDueDate = dtDueDate;
		this.dtMaturityDate = dtMaturityDate;
		this.acPremiumPeriod = acPremiumPeriod;
		this.acBranch = acBranch;
		this.acProduct = acProduct;
		this.amReceiptTotal = amReceiptTotal;
		this.acCurrency = acCurrency;
		this.acIds = acIds;
		this.acCreationUser = acCreationUser;
		this.tsCreation = tsCreation;
		this.acLastUpdateUser = acLastUpdateUser;
		this.tsLastUpdate = tsLastUpdate;
	}

	public Receipt(int sqReceipt, String acCompany, int sqOperation, String acOperationType,
			String acOriginalReceiptNumber, String acReceiptType, String acReceiptSubtype, int sqPolicyHolder,
			String acPolicyNumber, Date dtEmission, Date dtDueDate, Date dtMaturityDate, Date dtCancelPolicy,
			String acPremiumPeriod, String acBranch, String acProduct, Date dtRiskBegin, Date dtRiskEnd,
			String acProposalNumber, String acBenefits, String fgGroupCollection, String acGroupPolicy,
			String acLicensePlate, Date dtWorkBegin, Date dtWorkEnd, int niWorkDuration, BigDecimal amReceiptTotal,
			BigDecimal amSimplePremium, BigDecimal amComercialPremium, BigDecimal amComercialDiscount,
			BigDecimal amGreenCardCosts, BigDecimal amRecordCost, BigDecimal amPolicyCost, BigDecimal amBonusMalus,
			BigDecimal amAssistance, BigDecimal amSurcharge, BigDecimal amPremiumCorrection, String acCurrency,
			String acClaimNumber, String acSubClaimNumber, Date dtClaimOccurrence, Date dtClaimOpening,
			String acClaimDocumentNumber, String acIds, int fgAggregation, String acAggregationReference,
			String acAtmEntity, String acAtmReference, String acCttReference, String fgCollectLetterSent,
			int niInsuredObjects, String dsInsuredObject, String acManagerUserCode, String acCreationUser,
			Date tsCreation, String acLastUpdateUser, Date tsLastUpdate) {
		this.sqReceipt = sqReceipt;
		this.acCompany = acCompany;
		this.sqOperation = sqOperation;
		this.acOperationType = acOperationType;
		this.acOriginalReceiptNumber = acOriginalReceiptNumber;
		this.acReceiptType = acReceiptType;
		this.acReceiptSubtype = acReceiptSubtype;
		this.sqPolicyHolder = sqPolicyHolder;
		this.acPolicyNumber = acPolicyNumber;
		this.dtEmission = dtEmission;
		this.dtDueDate = dtDueDate;
		this.dtMaturityDate = dtMaturityDate;
		this.dtCancelPolicy = dtCancelPolicy;
		this.acPremiumPeriod = acPremiumPeriod;
		this.acBranch = acBranch;
		this.acProduct = acProduct;
		this.dtRiskBegin = dtRiskBegin;
		this.dtRiskEnd = dtRiskEnd;
		this.acProposalNumber = acProposalNumber;
		this.acBenefits = acBenefits;
		this.fgGroupCollection = fgGroupCollection;
		this.acGroupPolicy = acGroupPolicy;
		this.acLicensePlate = acLicensePlate;
		this.dtWorkBegin = dtWorkBegin;
		this.dtWorkEnd = dtWorkEnd;
		this.niWorkDuration = niWorkDuration;
		this.amReceiptTotal = amReceiptTotal;
		this.amSimplePremium = amSimplePremium;
		this.amComercialPremium = amComercialPremium;
		this.amComercialDiscount = amComercialDiscount;
		this.amGreenCardCosts = amGreenCardCosts;
		this.amRecordCost = amRecordCost;
		this.amPolicyCost = amPolicyCost;
		this.amBonusMalus = amBonusMalus;
		this.amAssistance = amAssistance;
		this.amSurcharge = amSurcharge;
		this.amPremiumCorrection = amPremiumCorrection;
		this.acCurrency = acCurrency;
		this.acClaimNumber = acClaimNumber;
		this.acSubClaimNumber = acSubClaimNumber;
		this.dtClaimOccurrence = dtClaimOccurrence;
		this.dtClaimOpening = dtClaimOpening;
		this.acClaimDocumentNumber = acClaimDocumentNumber;
		this.acIds = acIds;
		this.fgAggregation = fgAggregation;
		this.acAggregationReference = acAggregationReference;
		this.acAtmEntity = acAtmEntity;
		this.acAtmReference = acAtmReference;
		this.acCttReference = acCttReference;
		this.fgCollectLetterSent = fgCollectLetterSent;
		this.niInsuredObjects = niInsuredObjects;
		this.dsInsuredObject = dsInsuredObject;
		this.acManagerUserCode = acManagerUserCode;
		this.acCreationUser = acCreationUser;
		this.tsCreation = tsCreation;
		this.acLastUpdateUser = acLastUpdateUser;
		this.tsLastUpdate = tsLastUpdate;
	}

	public int getSqReceipt() {
		return this.sqReceipt;
	}

	public void setSqReceipt(int sqReceipt) {
		this.sqReceipt = sqReceipt;
	}

	public String getAcCompany() {
		return this.acCompany;
	}

	public void setAcCompany(String acCompany) {
		this.acCompany = acCompany;
	}

	public int getSqOperation() {
		return this.sqOperation;
	}

	public void setSqOperation(int sqOperation) {
		this.sqOperation = sqOperation;
	}

	public String getAcOperationType() {
		return this.acOperationType;
	}

	public void setAcOperationType(String acOperationType) {
		this.acOperationType = acOperationType;
	}

	public String getAcOriginalReceiptNumber() {
		return this.acOriginalReceiptNumber;
	}

	public void setAcOriginalReceiptNumber(String acOriginalReceiptNumber) {
		this.acOriginalReceiptNumber = acOriginalReceiptNumber;
	}

	public String getAcReceiptType() {
		return this.acReceiptType;
	}

	public void setAcReceiptType(String acReceiptType) {
		this.acReceiptType = acReceiptType;
	}

	public String getAcReceiptSubtype() {
		return this.acReceiptSubtype;
	}

	public void setAcReceiptSubtype(String acReceiptSubtype) {
		this.acReceiptSubtype = acReceiptSubtype;
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

	public Date getDtEmission() {
		return this.dtEmission;
	}

	public void setDtEmission(Date dtEmission) {
		this.dtEmission = dtEmission;
	}

	public Date getDtDueDate() {
		return this.dtDueDate;
	}

	public void setDtDueDate(Date dtDueDate) {
		this.dtDueDate = dtDueDate;
	}

	public Date getDtMaturityDate() {
		return this.dtMaturityDate;
	}

	public void setDtMaturityDate(Date dtMaturityDate) {
		this.dtMaturityDate = dtMaturityDate;
	}

	public Date getDtCancelPolicy() {
		return this.dtCancelPolicy;
	}

	public void setDtCancelPolicy(Date dtCancelPolicy) {
		this.dtCancelPolicy = dtCancelPolicy;
	}

	public String getAcPremiumPeriod() {
		return this.acPremiumPeriod;
	}

	public void setAcPremiumPeriod(String acPremiumPeriod) {
		this.acPremiumPeriod = acPremiumPeriod;
	}

	public String getAcBranch() {
		return this.acBranch;
	}

	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}

	public String getAcProduct() {
		return this.acProduct;
	}

	public void setAcProduct(String acProduct) {
		this.acProduct = acProduct;
	}

	public Date getDtRiskBegin() {
		return this.dtRiskBegin;
	}

	public void setDtRiskBegin(Date dtRiskBegin) {
		this.dtRiskBegin = dtRiskBegin;
	}

	public Date getDtRiskEnd() {
		return this.dtRiskEnd;
	}

	public void setDtRiskEnd(Date dtRiskEnd) {
		this.dtRiskEnd = dtRiskEnd;
	}

	public String getAcProposalNumber() {
		return this.acProposalNumber;
	}

	public void setAcProposalNumber(String acProposalNumber) {
		this.acProposalNumber = acProposalNumber;
	}

	public String getAcBenefits() {
		return this.acBenefits;
	}

	public void setAcBenefits(String acBenefits) {
		this.acBenefits = acBenefits;
	}

	public String getFgGroupCollection() {
		return this.fgGroupCollection;
	}

	public void setFgGroupCollection(String fgGroupCollection) {
		this.fgGroupCollection = fgGroupCollection;
	}

	public String getAcGroupPolicy() {
		return this.acGroupPolicy;
	}

	public void setAcGroupPolicy(String acGroupPolicy) {
		this.acGroupPolicy = acGroupPolicy;
	}

	public String getAcLicensePlate() {
		return this.acLicensePlate;
	}

	public void setAcLicensePlate(String acLicensePlate) {
		this.acLicensePlate = acLicensePlate;
	}

	public Date getDtWorkBegin() {
		return this.dtWorkBegin;
	}

	public void setDtWorkBegin(Date dtWorkBegin) {
		this.dtWorkBegin = dtWorkBegin;
	}

	public Date getDtWorkEnd() {
		return this.dtWorkEnd;
	}

	public void setDtWorkEnd(Date dtWorkEnd) {
		this.dtWorkEnd = dtWorkEnd;
	}

	public int getNiWorkDuration() {
		return this.niWorkDuration;
	}

	public void setNiWorkDuration(int niWorkDuration) {
		this.niWorkDuration = niWorkDuration;
	}

	public BigDecimal getAmReceiptTotal() {
		return this.amReceiptTotal;
	}

	public void setAmReceiptTotal(BigDecimal amReceiptTotal) {
		this.amReceiptTotal = amReceiptTotal;
	}

	public BigDecimal getAmSimplePremium() {
		return this.amSimplePremium;
	}

	public void setAmSimplePremium(BigDecimal amSimplePremium) {
		this.amSimplePremium = amSimplePremium;
	}

	public BigDecimal getAmComercialPremium() {
		return this.amComercialPremium;
	}

	public void setAmComercialPremium(BigDecimal amComercialPremium) {
		this.amComercialPremium = amComercialPremium;
	}

	public BigDecimal getAmComercialDiscount() {
		return this.amComercialDiscount;
	}

	public void setAmComercialDiscount(BigDecimal amComercialDiscount) {
		this.amComercialDiscount = amComercialDiscount;
	}

	public BigDecimal getAmGreenCardCosts() {
		return this.amGreenCardCosts;
	}

	public void setAmGreenCardCosts(BigDecimal amGreenCardCosts) {
		this.amGreenCardCosts = amGreenCardCosts;
	}

	public BigDecimal getAmRecordCost() {
		return this.amRecordCost;
	}

	public void setAmRecordCost(BigDecimal amRecordCost) {
		this.amRecordCost = amRecordCost;
	}

	public BigDecimal getAmPolicyCost() {
		return this.amPolicyCost;
	}

	public void setAmPolicyCost(BigDecimal amPolicyCost) {
		this.amPolicyCost = amPolicyCost;
	}

	public BigDecimal getAmBonusMalus() {
		return this.amBonusMalus;
	}

	public void setAmBonusMalus(BigDecimal amBonusMalus) {
		this.amBonusMalus = amBonusMalus;
	}

	public BigDecimal getAmAssistance() {
		return this.amAssistance;
	}

	public void setAmAssistance(BigDecimal amAssistance) {
		this.amAssistance = amAssistance;
	}

	public BigDecimal getAmSurcharge() {
		return this.amSurcharge;
	}

	public void setAmSurcharge(BigDecimal amSurcharge) {
		this.amSurcharge = amSurcharge;
	}

	public BigDecimal getAmPremiumCorrection() {
		return this.amPremiumCorrection;
	}

	public void setAmPremiumCorrection(BigDecimal amPremiumCorrection) {
		this.amPremiumCorrection = amPremiumCorrection;
	}

	public String getAcCurrency() {
		return this.acCurrency;
	}

	public void setAcCurrency(String acCurrency) {
		this.acCurrency = acCurrency;
	}

	public String getAcClaimNumber() {
		return this.acClaimNumber;
	}

	public void setAcClaimNumber(String acClaimNumber) {
		this.acClaimNumber = acClaimNumber;
	}

	public String getAcSubClaimNumber() {
		return this.acSubClaimNumber;
	}

	public void setAcSubClaimNumber(String acSubClaimNumber) {
		this.acSubClaimNumber = acSubClaimNumber;
	}

	public Date getDtClaimOccurrence() {
		return this.dtClaimOccurrence;
	}

	public void setDtClaimOccurrence(Date dtClaimOccurrence) {
		this.dtClaimOccurrence = dtClaimOccurrence;
	}

	public Date getDtClaimOpening() {
		return this.dtClaimOpening;
	}

	public void setDtClaimOpening(Date dtClaimOpening) {
		this.dtClaimOpening = dtClaimOpening;
	}

	public String getAcClaimDocumentNumber() {
		return this.acClaimDocumentNumber;
	}

	public void setAcClaimDocumentNumber(String acClaimDocumentNumber) {
		this.acClaimDocumentNumber = acClaimDocumentNumber;
	}

	public String getAcIds() {
		return this.acIds;
	}

	public void setAcIds(String acIds) {
		this.acIds = acIds;
	}

	public int getFgAggregation() {
		return this.fgAggregation;
	}

	public void setFgAggregation(int fgAggregation) {
		this.fgAggregation = fgAggregation;
	}

	public String getAcAggregationReference() {
		return this.acAggregationReference;
	}

	public void setAcAggregationReference(String acAggregationReference) {
		this.acAggregationReference = acAggregationReference;
	}

	public String getAcAtmEntity() {
		return this.acAtmEntity;
	}

	public void setAcAtmEntity(String acAtmEntity) {
		this.acAtmEntity = acAtmEntity;
	}

	public String getAcAtmReference() {
		return this.acAtmReference;
	}

	public void setAcAtmReference(String acAtmReference) {
		this.acAtmReference = acAtmReference;
	}

	public String getAcCttReference() {
		return this.acCttReference;
	}

	public void setAcCttReference(String acCttReference) {
		this.acCttReference = acCttReference;
	}

	public String getFgCollectLetterSent() {
		return this.fgCollectLetterSent;
	}

	public void setFgCollectLetterSent(String fgCollectLetterSent) {
		this.fgCollectLetterSent = fgCollectLetterSent;
	}

	public int getNiInsuredObjects() {
		return this.niInsuredObjects;
	}

	public void setNiInsuredObjects(int niInsuredObjects) {
		this.niInsuredObjects = niInsuredObjects;
	}

	public String getDsInsuredObject() {
		return this.dsInsuredObject;
	}

	public void setDsInsuredObject(String dsInsuredObject) {
		this.dsInsuredObject = dsInsuredObject;
	}

	public String getAcManagerUserCode() {
		return this.acManagerUserCode;
	}

	public void setAcManagerUserCode(String acManagerUserCode) {
		this.acManagerUserCode = acManagerUserCode;
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
