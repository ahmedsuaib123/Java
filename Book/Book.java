public class Book{
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private String bookType;
	private int bookCopy;
	
	private static int bookCounter=0;
	
	public Book(){}
	public Book(String bookId,String bookName,String bookAuthor,String bookType,int bookCopy){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		bookCounter++;
	}
	
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	
	public void setBookId(String bookId){
		this.bookId=bookId;
	}
	
	public void setBookType(String bookType){
		this.bookType=bookType;
	}
	
	public void setBookCopy(int bookCopy){
		this.bookCopy=bookCopy;
	}
	
	public String getBookName(){return bookName;}
	public String getBookAuthor(){return bookAuthor;}
	public String getBookId(){return bookId;}
	public int getBookCopy(){return bookCopy;}
	public String getBookType(){return bookType;}
	
	public void showBookInfo(){
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Author : "+bookAuthor);
		System.out.println("Book Id : "+bookId);
		System.out.println("Book Type : "+bookType);
		System.out.println("Number of Book Copy : "+bookCopy);
	}
	
	public void addBookCopy(int x){
		bookCopy += x;
	}
	
	public static void totalNumberOfUniqueBooks(){
		System.out.println("Total Number Of Unique Books : " + bookCounter);
	}
	
}