package Object_Oriented_Programmings;

import java.util.Scanner;

public class Book
{
	private String bookName;
	private String bookAuthor;
	
	
	public Book(String bookName, String bookAuthor) 
	{
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	
	public static Book getBookDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book title :");
		String title=sc.nextLine();
		System.out.println("Enter the book author :");
		String author=sc.next();
		sc.close();
		return new Book(title, author);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Book's you want ::");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			Book book = Book.getBookDetails();
			System.out.println(book);	
		}
		sc.close();
		
		
	}

}
