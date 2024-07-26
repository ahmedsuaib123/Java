import java.util.Scanner;
public class Start{
	public static void main(String []args){
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		Scanner scChar = new Scanner(System.in);
		
		
		ContactList contactList = new ContactList(100);
		
		contactList.insert( new Contact("C1","01",18,"0123456789",'M'));
		contactList.insert( new Contact("C2","02",28,"0223456789",'F'));
		contactList.insert( new Contact("C3","03",53,"0323456789",'M'));
		contactList.insert( new Contact("C4","04",26,"0423456789",'F'));
		contactList.insert( new Contact("C5","05",35,"0353456789",'M'));
		contactList.insert( new Contact("C6","06",25,"0493456709",'M'));
		
		System.out.println("=== Welcome to Contact Management System ===");
        System.out.println("=========Developed By Java Sec Y==========");
		
		while(true){
			System.out.println("++++++++++++++++++++++++++++++++");
			System.out.println("1. Show Available Contact ");
		    System.out.println("2. Insert a New Contact ");
            System.out.println("3. Show a Contact ");
            System.out.println("4. Delete a Contact ");
            System.out.println("5. Search a Contact By Name ");
            System.out.println("6. Search a Contact By Number ");
            System.out.println("7. Update a Contact ");
            System.out.println("0. Exit ");
			
			System.out.print("Enter an Option: ");
			int option = scNum.nextInt();
			
			if(option == 1){ 
				contactList.showAll();
			}else if(option == 2){
				System.out.println("Enter The Details of The Contact ");
				
			    System.out.print("Contact ID : ");
				String contactId = scStr.nextLine();
				
			    System.out.print("Contact Name : ");
				String contactName = scStr.nextLine();
				
			    System.out.print("Contact Age : ");
				int age = scNum.nextInt();
				
			    System.out.print("Mobile Number : ");
				String mobileNumber = scStr.nextLine();
				
				System.out.print("Gender : ");
				char gender = scChar.next().charAt(0);
				
				contactList.insert(new Contact(contactId,contactName,age,mobileNumber,gender));
				
			
			}else if(option == 3){
				System.out.println("Enter The ID of The Contact to Show ");
				
				System.out.print("Contact Name : ");
				String contactName = scStr.nextLine();
				
				contactList.showAContact(contactName);
				
			}else if(option == 4){
				System.out.println("Enter The ID of The Contact to be Deleted ");
				
			    System.out.print("Contact ID : ");
				String contactId = scStr.nextLine();
				
				contactList.deleteById(contactId);
				
			}else if(option == 5){
				System.out.println("Enter The Name of The Contact to Search ");
				
				System.out.print("Contact Name : ");
				String contactName = scStr.nextLine();
				
				contactList.searchByName(contactName);
				
				
			}else if(option == 6){
				System.out.println("Enter The Number of The Contact to Search ");
				
				System.out.print("Contact Number : ");
				String mobileNumber = scStr.nextLine();
				
				contactList.searchByNumber(mobileNumber);
			}
			
			else if(option == 7){
				
				System.out.println("Enter The ID of The Contact to Update ");
				System.out.print("Contact ID : ");
				String contactId = scStr.nextLine();
				
				Contact c = contactList.getById(contactId);
				while(true){
				System.out.println("----------------------------");
				System.out.println(" 1. Update Name ");
                System.out.println(" 2. Update Number ");
				System.out.print("Enter an Option: ");
				int subOption = scNum.nextInt();
				
				if (subOption == 1) {
						System.out.print("Contact Name : ");
						String contactName = scStr.nextLine();
						c.setContactName(contactName);
						System.out.println("----After Update---- ");
						c.showContactInfo();
					} else if (subOption == 2) {
						System.out.print("Contact Name : ");
						String mobileNumber = scStr.nextLine();
						c.setMobileNumber(mobileNumber);
						System.out.println("----After Update---- ");
						c.showContactInfo();
					} else{
						break;
					}
				}
			} else {
				break;
			}
		}
		
		System.out.println("=====Thank You For Using Our System=====");



	}

}