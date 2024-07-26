public class Contact{
	private String contactName;
    private String contactId;
    private int age;
    private String mobileNumber;
    private char gender;
	
	public Contact(){}
	public Contact(String contactName,String contactId,int age,String mobileNumber,char gender){
		this.contactName=contactName;
		this.contactId=contactId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	public void setContactName(String contactName){
		this.contactName=contactName;
	}
	
	public void setContactId(String ContactId){
		this.contactId=contactId;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	
	public void setGender(char gender){
		this.gender=gender;
	}
	
	public String getContactName(){return contactName;}
	public String getContactId(){return contactId;}
	public int getAge(){return age;}
	public String getMobileNumber(){return mobileNumber;}
	public char getGender(){return gender;}
	
	public void showContactInfo(){
		System.out.println("Person Name :"+contactName);
		System.out.println("Contact Id : "+contactId);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+mobileNumber);
		System.out.println("Gender : "+gender);
	}
	
	public void DetectMobileOperator(){
		if(mobileNumber.charAt(2)=='7'||mobileNumber.charAt(2)=='3'){
			System.out.println("Mobile Operator : GP"+"\n");
		}else if(mobileNumber.charAt(2)=='8'){
			System.out.println("Mobile Operator : ROBI"+"\n");
		}
		
	}
}