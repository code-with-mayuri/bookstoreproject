package com.bean;

import java.util.Scanner;

public class Books {
	Book books[]=new Book[50];
	public static int count;
	Scanner input=new Scanner(System.in);
	public int comparebook(Book b1,Book b2)
	{
		
	if(b1.bookname.equalsIgnoreCase(b2.bookname))
	{
		
		System.out.println("book of this name alredy exist");
		return 0;
	}
	if(b1.SrNo==b2.SrNo)
	{
		System.out.println("book of this serial no alredy exist");
		return 0;
	}
	return 1;
	}
	
	public void addbook(Book b)
	{
		
		for(int i=0;i<count;i++)
		{
			if(this.comparebook(b, this.books[i])==0)
				return ;
		}
		if(count<50)
		{
		books[count]=b;
		count++;
			
		}
		else
		{
			System.out.println("no space to add more book");
		}
	}
	public void searchBySrNo()
	{
		System.out.println("search by book");
		int SrNo;
		System.out.println("enter sr no of book");
		SrNo=input.nextInt();
		int flag=0;
		System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
		
        for (int i = 0; i < count; i++) {
        	 
            // if author matches any of its book
        	if (SrNo ==books[i].SrNo) {
                System.out.println(
                		books[i].SrNo + "\t\t"
                    + books[i].bookname + "\t\t"
                    + books[i].autherName+ "\t\t"
                    + books[i].bookQty + "\t\t"
                    + books[i].bookcopy );
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for Serial No "
                               + SrNo + " Found.");
    }
	 public void searchByAuthorName()
	    {
	 
	        // Display message
	        System.out.println(
	            "\t\t\t\tSEARCH BY AUTHOR'S NAME");
	 
	        input.nextLine();
	 
	        System.out.println("Enter Author Name:");
	        String autherName = input.nextLine();
	 
	        int flag = 0;
	 
	        System.out.println(
	            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
	 
	        for (int i = 0; i < count; i++) {
	 
	            // if author matches any of its book
	            if (autherName.equalsIgnoreCase(
	                    books[i].autherName)) {
	 
	                // Print below corresponding credentials
	                System.out.println(
	                		books[i].SrNo + "\t\t"
	                    + books[i].bookname + "\t\t"
	                    + books[i].autherName + "\t\t"
	                    + books[i].bookQty + "\t\t"
	                    + books[i].bookcopy);
	                flag++;
	            }
	        }
	 
	        // Else no book matches for author
	        if (flag == 0)
	            System.out.println("No Books of " + autherName
	                               + " Found.");
	    }
 
    // Method 5
    // To display all books
    public void showAllBooks()
    {
 
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
 
        for (int i = 0; i < count; i++) {
 
            System.out.println(
                books[i].SrNo + "\t\t"
                + books[i].bookname + "\t\t"
                + books[i].autherName + "\t\t"
                + books[i].bookcopy + "\t\t"
                + books[i].bookQty);
        }
    }
 
    // Method 6
    // To edit the book
    public void upgradeBookQty()
    {
 
        System.out.println(
            "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial No of Book");
 
        int sNo = input.nextInt();
 
        for (int i = 0; i < count; i++) {
 
            if (sNo == books[i].SrNo) {
 
                // Display message
                System.out.println(
                    "Enter No of Books to be Added:");
 
                int addingQty = input.nextInt();
                books[i].bookQty += addingQty;
                books[i].bookcopy += addingQty;
 
                return;
            }
        }
    }
 
    // Method 7
    // To create menu
    public void dispMenu()
    {
 
        // Displaying menu
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
            "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
            "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
 
    // Method 8
    // To search the library
    public int isAvailable(int sNo)
    {
 
        for (int i = 0; i < count; i++) {
            if (sNo == books[i].SrNo) {
                if (books[i].bookcopy > 0) {
 
                    System.out.println(
                        "Book is Available.");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }
        }
 
        System.out.println("No Book of Serial Number "
                           + " Available in Library.");
        return -1;
    }
 
    // Method 9
    // To remove the book from the library
    public Book checkOutBook()
    {
 
        System.out.println(
            "Enter Serial No of Book to be Checked Out.");
        int sNo = input.nextInt();
 
        int bookIndex = isAvailable(sNo);
 
        if (bookIndex != -1) {
            books[bookIndex].bookcopy--;
            return books[bookIndex];
        }
        return null;
    }
 
    // Method 10
    // To add the Book to the Library
    public void checkInBook(Book b)
    {
        for (int i = 0; i < count; i++) {
            if (b.equals(books[i])) {
                books[i].bookcopy++;
                return;
            }
        }
    }


		
	}

