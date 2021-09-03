package com.java.dao;

import com.java.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    Scanner input = new Scanner(System.in);
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {

        return books;
    }


    public void updateBook(Book updatedBook) {
        for (Book book: books) {
            if (book.getID() == updatedBook.getID()) {
                System.out.println("1.Edit Author Of Book");
                System.out.println("2.Edit Page Of Book");
                System.out.println("3.Edit Producer Of Book ");
                System.out.println("4.Edit Release Number Of Book");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Enter New Author Of Book");
                        book.setAuthor(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New Page Of Book");
                        book.setPage(Integer.parseInt(input.nextLine()));
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New Producer Of Book");
                        book.setProducer(input.nextLine());
                        System.out.println("-----------------------");
                        break;
                    case 4:
                        System.out.println("Enter New Release Number");
                        book.setReleaseNumber(Integer.parseInt(input.nextLine()));
                        System.out.println("-----------------------");
                        break;
                    default:
                        System.err.println("Please Select The Information To Be Corrected !!!");
                }
            } else{
                System.out.println("Not Found");
            }
        }
    }

    public Book searchByID(int ID) {
        for (Book book: books) {
            if (book.getID() == ID) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

}
