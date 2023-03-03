package com.bean;

import java.util.Scanner;

public class Book {
public int SrNo;
public String bookname;
public String autherName;
public int bookQty;
public int bookcopy;
Scanner input=new Scanner(System.in);
public Book()
{
System.out.println("enter the srno of book");
this.SrNo=input.nextInt();
input.nextLine();
System.out.println("enter the bookname");
this.bookname=input.nextLine();
System.out.println("enter the authername");
this.autherName=input.nextLine();
System.out.println("enter the bookQty ");
this.bookQty=input.nextInt();
bookcopy=this.bookQty;

}




}
