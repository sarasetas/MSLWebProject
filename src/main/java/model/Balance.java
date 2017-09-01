package model;
// Generated Aug 30, 2017 2:20:17 PM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Balance generated by hbm2java
 */
public class Balance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6185511675316287423L;
	private BalanceId id;
	private BigDecimal amInitialDebit;
	private BigDecimal amFinalDebit;
	private BigDecimal amMonthDebit;
	private BigDecimal amInitialCredit;
	private BigDecimal amFinalCredit;
	private BigDecimal amMonthCredit;
	private String acCurrency;
	private int niTransaction;
	private String acBalanceStatus;
	private String acCreationUser;
	private Date tsCreation;
	private String acLastUpdateUser;
	private Date tsLastUpdate;

	public Balance() {
	}

	public Balance(BalanceId id, BigDecimal amInitialDebit, BigDecimal amFinalDebit, BigDecimal amMonthDebit,
			BigDecimal amInitialCredit, BigDecimal amFinalCredit, BigDecimal amMonthCredit, String acCurrency,
			int niTransaction, String acBalanceStatus, String acCreationUser, Date tsCreation, String acLastUpdateUser,
			Date tsLastUpdate) {
		this.id = id;
		this.amInitialDebit = amInitialDebit;
		this.amFinalDebit = amFinalDebit;
		this.amMonthDebit = amMonthDebit;
		this.amInitialCredit = amInitialCredit;
		this.amFinalCredit = amFinalCredit;
		this.amMonthCredit = amMonthCredit;
		this.acCurrency = acCurrency;
		this.niTransaction = niTransaction;
		this.acBalanceStatus = acBalanceStatus;
		this.acCreationUser = acCreationUser;
		this.tsCreation = tsCreation;
		this.acLastUpdateUser = acLastUpdateUser;
		this.tsLastUpdate = tsLastUpdate;
	}

	public BalanceId getId() {
		return this.id;
	}

	public void setId(BalanceId id) {
		this.id = id;
	}

	public BigDecimal getAmInitialDebit() {
		return this.amInitialDebit;
	}

	public void setAmInitialDebit(BigDecimal amInitialDebit) {
		this.amInitialDebit = amInitialDebit;
	}

	public BigDecimal getAmFinalDebit() {
		return this.amFinalDebit;
	}

	public void setAmFinalDebit(BigDecimal amFinalDebit) {
		this.amFinalDebit = amFinalDebit;
	}

	public BigDecimal getAmMonthDebit() {
		return this.amMonthDebit;
	}

	public void setAmMonthDebit(BigDecimal amMonthDebit) {
		this.amMonthDebit = amMonthDebit;
	}

	public BigDecimal getAmInitialCredit() {
		return this.amInitialCredit;
	}

	public void setAmInitialCredit(BigDecimal amInitialCredit) {
		this.amInitialCredit = amInitialCredit;
	}

	public BigDecimal getAmFinalCredit() {
		return this.amFinalCredit;
	}

	public void setAmFinalCredit(BigDecimal amFinalCredit) {
		this.amFinalCredit = amFinalCredit;
	}

	public BigDecimal getAmMonthCredit() {
		return this.amMonthCredit;
	}

	public void setAmMonthCredit(BigDecimal amMonthCredit) {
		this.amMonthCredit = amMonthCredit;
	}

	public String getAcCurrency() {
		return this.acCurrency;
	}

	public void setAcCurrency(String acCurrency) {
		this.acCurrency = acCurrency;
	}

	public int getNiTransaction() {
		return this.niTransaction;
	}

	public void setNiTransaction(int niTransaction) {
		this.niTransaction = niTransaction;
	}

	public String getAcBalanceStatus() {
		return this.acBalanceStatus;
	}

	public void setAcBalanceStatus(String acBalanceStatus) {
		this.acBalanceStatus = acBalanceStatus;
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