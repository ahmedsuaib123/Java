public class MobileList{
	private Mobile mobiles[];
	
	public MobileList(){
		mobiles = new Mobile[5];
	}
	public MobileList(int size){
		mobiles = new Mobile[size];
	}
	
	public void insert(Mobile m){
		boolean flag = false;
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] == null){
				mobiles[i] = m;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	public void showAMobile(String name){
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] != null){
				if(mobiles[i].getMobileBrandName().equals(name)){
					System.out.println("+++Contact Showed+++");
					mobiles[i].ShowMobileInfo();
				    return;
				}
			}
		}
		System.out.println("---Contact Not Showed---");
		return;
	}
	
	
	public Mobile getById(String id){
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] != null){
				if(mobiles[i].getMobileId().equals(id)){
					return mobiles[i];
				}
				
				
			}
		}
		return null;
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] != null){
				if(mobiles[i].getMobileId().equals(id)){
					mobiles[i] = null;
					flag = true;
				break;
				}
			}
		}
		if(flag){System.out.println("Deletion Successfull");}
		else{System.out.println("Deletion Failed");}
	}
	
	public void searchByName(String name){
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] != null){
				if(mobiles[i].getMobileBrandName().equals(name)){
					System.out.println("+++Contact Found+++");
					mobiles[i].ShowMobileInfo();
				    return;
				}
			}
		}
		System.out.println("---Contact Not Found---");
		return;
	}
	
	
	
	
	public void ShowAll(){
		System.out.println("--------List Of All Available Mobiles --------");
		
		for(int i=0;i<mobiles.length;i++){
			if(mobiles[i] != null){
			mobiles[i].ShowMobileInfo();
			}
		}
		System.out.println("============================");
	}
}