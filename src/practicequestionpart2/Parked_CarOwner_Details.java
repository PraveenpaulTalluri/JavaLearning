package practicequestionpart2;

public class Parked_CarOwner_Details {
	String ownersName;
	String carModel;
	Integer carNo;
	Integer OwnerMobileNo;
	String ownerAddress;
	public Parked_CarOwner_Details(String ownersName, String carModel, Integer carNo, Integer ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownersName = ownersName;
		this.carModel = carModel;
		this.carNo = carNo;
		OwnerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public Integer getCarNo() {
		return carNo;
	}
	public void setCarNo(Integer carNo) {
		this.carNo = carNo;
	}
	public Integer getOwnerMobileNo() {
		return OwnerMobileNo;
	}
	public void setOwnerMobileNo(Integer ownerMobileNo) {
		OwnerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
}
