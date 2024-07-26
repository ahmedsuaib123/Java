public class Mobile{
	private String mobileId;
	private String mobileBrandName;
	private String mobileOSName;
    private boolean lock=false;
	
	public Mobile(){
		this.lock=false;
	}
	public Mobile(String mobileID,String mobileBrandName,String mobileOSName, boolean lock){
		this.mobileId=mobileId;
		this.mobileBrandName=mobileBrandName;
		this.mobileOSName=mobileOSName;
		this.lock=false;
	}
	
	public void setMobileId(String mobileId){
		this.mobileId=mobileId;
	}
	
	public void setMobileBrandName(String mobileBrandName){
		this.mobileBrandName=mobileBrandName;
	}
	
	public void setMobileOSName(String mobileOSName){
		this.mobileOSName=mobileOSName;
	}
	
	public void setLock(boolean lock){
		this.lock=lock;
	}
	
	public String getMobileId(){return mobileId;}
	public String getMobileBrandName(){return mobileBrandName;}
	public String getMobileOSName(){return mobileOSName;}
	public boolean isLock(){return lock;}
	
	public void ShowMobileInfo(){
		System.out.println("Mobile ID : "+mobileId);
		System.out.println("Mobile Brand Name :"+mobileBrandName);
		System.out.println("Mobile OS Name : "+mobileOSName);
		System.out.println("Lock : "+lock);
	}
	
	

}
