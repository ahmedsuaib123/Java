public class Start{
	public static void main(String []args){
		Contact c1= new Contact("Nafees","23-50723-1",17,"01737718866",'M');
		Contact c2= new Contact("Mehjabin","23-50707-1",18,"01820342788",'F');
		Contact c3= new Contact("Abir","23-50228-1",17,"01717088870",'M');
		Contact c4= new Contact("Nafiya","23-50203-1",17,"01732669739",'F');
		
		c1.showPersonInfo();
		c1.DetectMobileOperator();
		
		c2.showPersonInfo();
		c2.DetectMobileOperator();
		
		c3.showPersonInfo();
		c3.DetectMobileOperator();
		
		c4.showPersonInfo();
		c4.DetectMobileOperator();
		
	}
}