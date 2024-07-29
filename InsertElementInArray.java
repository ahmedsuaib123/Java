import java.lang.*;

public class InsertElementInArray{
	
	int count=0;
	
	public static void main(String []args){
		
		InsertElementInArray o=new InsertElementInArray();
		
		int a[]=new int[5];;
		
		for(int i=0;i<a.length;i++){
			o.insert(a,i+1);
		}
		
		o.print(a);
		
		o.insertAtStart(a,34);
		o.print(a);
		
		o.insertAtPosition(a,2,20);
		o.print(a);
		
		
	}
	
	public void insertAtPosition(int a[],int position, int val){
		for(int i=count-1;i>position;i--){
			a[i]=a[i-1];
		}
		
		a[position]=val;
	}
	
	public void insert(int a[],int val){
		a[count++]=val;
	}
	
	public void insertAtStart(int a[],int val){
		for(int i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		
		a[0]=val;
	}
	
	public void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
}