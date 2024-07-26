import java.util.Scanner;
public class Start{
	public static void main(String []args){
		
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		Scanner scBool = new Scanner(System.in);
		
		MobileList mobileList = new MobileList(100);
		
		mobileList.insert(new Mobile("01","Samsung","Android",false));
		mobileList.insert(new Mobile("02","Apple","iOS",false));
		mobileList.insert(new Mobile("03","Blackberry","Windows",false));
	    mobileList.insert(new Mobile("04","Xiaomi","Android",false));
		
		
		System.out.println("=== Welcome to Mobile Management System ===");
		System.out.println("========= Developed By Java Sec Y ==========");
		
		while(true){
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("1. Show Available Mobiles");
			System.out.println("2. Insert a New Mobile");
			System.out.println("3. Show a Mobile");
			System.out.println("4. Delete a Mobile");
			System.out.println("5. Search a Mobile By Name");
			System.out.println("6. Update a Mobile");
			System.out.println("0. Exit");
			
			System.out.print("Enter an Option: ");
			int option = scNum.nextInt();
			
			if(option == 1){
			mobileList.ShowAll();
			}
			else if(option == 2){
				System.out.println("Enter The Details of The Mobile");
				
				System.out.print("Mobile ID:");
				String mobileId = scStr.nextLine();

				System.out.print("Mobile Brand Name:");
				String mobileBrandName = scStr.nextLine();
				
				
				System.out.print("Mobile OS Name:");
				String mobileOSName = scStr.nextLine();
				
				System.out.print("Lock :");
				boolean lock = scBool.nextBoolean();
				mobileList.insert(new Mobile(mobileId,mobileBrandName,mobileOSName,lock));
			}
			else if(option == 3){
				System.out.println("Enter The ID of A Mobile to Show ");
				
				System.out.print("Mobile Brand Name : ");
				String mobileBrandName = scStr.nextLine();
				
				mobileList.showAMobile(mobileBrandName);
			}
			else if(option == 4){
				System.out.println("Enter The ID of The Mobile to be Deleted");
				
				System.out.print("Mobile ID:");
				String mobileId = scStr.nextLine();
				mobileList.deleteById(mobileId);
				
			}
			else if(option == 5){
				System.out.println("Enter The Name of The Mobile Brand to Search");
				
				System.out.print("Mobile Brand Name:");
				String mobileBrandName = scStr.nextLine();
				mobileList.searchByName(mobileBrandName);
			}
			else if(option == 6){
				System.out.println("Enter The ID of The Mobile to Update");
				System.out.print("Mobile ID:");
				String mobileId = scStr.nextLine();
				
				Mobile m = mobileList.getById(mobileId);
				while(true){
					System.out.println("-------------------");
					System.out.println("1. Update Brand Name");
					System.out.println("2. Update OS Name");
					System.out.println("0. <- Back");
					System.out.print("Enter an Option: ");
					
					int subOption = scNum.nextInt();
					if(subOption == 1){
						System.out.print("Mobile Brand Name:");
						String mobileBrandName = scStr.nextLine();
						m.setMobileBrandName(mobileBrandName);
						System.out.println("----After Update----");
						m.ShowMobileInfo();
					}
					else if(subOption == 2){
						System.out.print("Author Name:");
                        String mobileOSName = scStr.nextLine();
                        m.setMobileOSName(mobileOSName);
                        System.out.println("----After Update----");
                        m.ShowMobileInfo();
					}else{
					break;
				}
				}
			}
			else{
				break;
			}
			
		}
		
		System.out.println("=========Thank You for Using Our System==========");
	}
}