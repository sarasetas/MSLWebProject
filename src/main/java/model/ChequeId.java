package model;
// Generated Aug 30, 2017 2:20:17 PM by Hibernate Tools 3.5.0.Final

/**
 * ChequeId generated by hbm2java
 */
public class ChequeId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3201282338963094320L;
	private String acChequeStatusMotive;
	private String acChequeAccountNumber;
	private String acChequeNumber;
	private int sqChequeVersion;

	public ChequeId() {
	}

	public ChequeId(String acChequeStatusMotive, String acChequeAccountNumber, String acChequeNumber,
			int sqChequeVersion) {
		this.acChequeStatusMotive = acChequeStatusMotive;
		this.acChequeAccountNumber = acChequeAccountNumber;
		this.acChequeNumber = acChequeNumber;
		this.sqChequeVersion = sqChequeVersion;
	}

	public String getAcChequeStatusMotive() {
		return this.acChequeStatusMotive;
	}

	public void setAcChequeStatusMotive(String acChequeStatusMotive) {
		this.acChequeStatusMotive = acChequeStatusMotive;
	}

	public String getAcChequeAccountNumber() {
		return this.acChequeAccountNumber;
	}

	public void setAcChequeAccountNumber(String acChequeAccountNumber) {
		this.acChequeAccountNumber = acChequeAccountNumber;
	}

	public String getAcChequeNumber() {
		return this.acChequeNumber;
	}

	public void setAcChequeNumber(String acChequeNumber) {
		this.acChequeNumber = acChequeNumber;
	}

	public int getSqChequeVersion() {
		return this.sqChequeVersion;
	}

	public void setSqChequeVersion(int sqChequeVersion) {
		this.sqChequeVersion = sqChequeVersion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChequeId))
			return false;
		ChequeId castOther = (ChequeId) other;

		return ((this.getAcChequeStatusMotive() == castOther.getAcChequeStatusMotive())
				|| (this.getAcChequeStatusMotive() != null && castOther.getAcChequeStatusMotive() != null
						&& this.getAcChequeStatusMotive().equals(castOther.getAcChequeStatusMotive())))
				&& ((this.getAcChequeAccountNumber() == castOther.getAcChequeAccountNumber())
						|| (this.getAcChequeAccountNumber() != null && castOther.getAcChequeAccountNumber() != null
								&& this.getAcChequeAccountNumber().equals(castOther.getAcChequeAccountNumber())))
				&& ((this.getAcChequeNumber() == castOther.getAcChequeNumber())
						|| (this.getAcChequeNumber() != null && castOther.getAcChequeNumber() != null
								&& this.getAcChequeNumber().equals(castOther.getAcChequeNumber())))
				&& (this.getSqChequeVersion() == castOther.getSqChequeVersion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAcChequeStatusMotive() == null ? 0 : this.getAcChequeStatusMotive().hashCode());
		result = 37 * result + (getAcChequeAccountNumber() == null ? 0 : this.getAcChequeAccountNumber().hashCode());
		result = 37 * result + (getAcChequeNumber() == null ? 0 : this.getAcChequeNumber().hashCode());
		result = 37 * result + this.getSqChequeVersion();
		return result;
	}

}
