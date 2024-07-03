public class Contact{
	private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;
	
	public Contact(){}
	public Contact(String personName,String personId,int age,String mobileNumber,char gender){
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	public void setPersonName(String personName){
		this.personName=personName;
	}
	
	public void setPersonId(String personId){
		this.personId=personId;
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
	
	public String getPersonName(){return personName;}
	public String getPersonId(){return personId;}
	public int getAge(){return age;}
	public String getMobileNumber(){return mobileNumber;}
	public char getGender(){return gender;}
	
	public void showPersonInfo(){
		System.out.println("Person Name :"+personName);
		System.out.println("Person Id : "+personId);
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