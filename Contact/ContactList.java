public class ContactList{
	private Contact contacts[];
	
	public ContactList(){
		contacts = new Contact[5];
	}
	public ContactList(int size){
		contacts = new Contact[size];
	}
	
	public void insert(Contact c){
		boolean flag = false;
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] == null){
				contacts[i] = c;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	public void showAContact(String name){
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getContactName().equals(name)){
					System.out.println("+++Contact Showed+++");
					contacts[i].showContactInfo();
				    return;
				}
			}
		}
		System.out.println("---Contact Not Showed---");
		return;
	}
	
	
	public Contact getById(String id){
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getContactId().equals(id)){
					return contacts[i];
				}
				
				
			}
		}
		return null;
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getContactId().equals(id)){
					contacts[i] = null;
					flag = true;
				break;
				}
			}
		}
		if(flag){System.out.println("Deletion Successfull");}
		else{System.out.println("Deletion Failed");}
	}
	
	public void searchByName(String name){
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getContactName().equals(name)){
					System.out.println("+++Contact Found+++");
					contacts[i].showContactInfo();
				    return;
				}
			}
		}
		System.out.println("---Contact Not Found---");
		return;
	}
	
	public void searchByNumber(String number){
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getMobileNumber().equals(number)){
					System.out.println("+++Contact Found+++");
					contacts[i].showContactInfo();
				    return;
				}
			}
		}
		System.out.println("---Contact Not Found---");
		return;
	}
	
	
	public void showAll(){
		System.out.println("--------List Of All Available Contacts--------");
		
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				contacts[i].showContactInfo();
			}
		}
		System.out.println("============================");
	}
	
}