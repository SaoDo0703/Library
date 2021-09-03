package com.java.main;

import com.java.dao.BookManagement;
import com.java.dao.MagazineManagement;
import com.java.dao.NewspaperManagement;
import com.java.model.Book;
import com.java.model.Magazine;
import com.java.model.Newspaper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        List<Book> bookList = bookManagement.getBooks();
        MagazineManagement magazineManagement = new MagazineManagement();
        List<Magazine> magazineList = magazineManagement.getmagazines();
        NewspaperManagement newspaperManagement = new NewspaperManagement();
        List<Newspaper> newspaperList = newspaperManagement.getNewspapers();

        Scanner input = new Scanner(System.in);

        System.out.println("Select The Document Type, pls");
        System.out.println("1.Books");
        System.out.println("2.Magazine");
        System.out.println("3.Newspaper");
        System.out.println("---------------------");
        System.out.println("Enter Choice Of You ");
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            System.out.println("Welcome To The List Of Book");
            System.out.println("---------------------------");
            do {
                menuBook();
                System.out.println("Enter Choose Of You : ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    case 1:
                        Book book = inputBook();
                        bookManagement.addBook(book);
                        break;
                    case 2:
                        System.out.println("Enter ID You Need Remove Now");
                        int inputID = Integer.parseInt(input.nextLine());
                        Book book1 = bookManagement.searchByID(inputID);
                        if (book1 == null) {
                            System.out.println("Not Found ID You Need, Pls Review");
                        } else {
                            bookManagement.removeBook(book1);
                            System.out.println("Deleted !!");
                            System.out.println("-------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID Of Book You Need Update Now");
                        int newID = Integer.parseInt(input.nextLine());
                        Book book2 = bookManagement.searchByID(newID);
                        if (book2 == null) {
                            System.out.println("Not Found ID You Enter, Pls Review");
                            break;
                        } else {
                            System.out.println("Here's The Book Information You Need");
                            showBook(book2);
                            bookManagement.updateBook(book2);
                            System.out.println("Successful Update !!");
                        }
                        break;
                    case 4:
                        Collections.sort(bookList, new Comparator<Book>() {
                            @Override
                            public int compare(Book o1, Book o2) {
                                if (o1.getPage() > o2.getPage()) {
                                    return -1;
                                } else if (o1.getPage() < o2.getPage()) {
                                    return 1;
                                } else {
                                    return 0;
                                }
                            }
                        });
                        for (Book book3 : bookList) {
                            showBook(book3);
                        }
                        break;
                    case 5:
                        for (Book book3 : bookList) {
                            System.out.println("Here's The Book Information You Need");
                            showBook(book3);
                        }
                        break;
                    case 6:
                        menuBook();
                        break;
                    case 7:
                        System.out.println("GoodBye~~");
                        break;
                    default:
                        System.err.println("Please Choose In 7 Option Of Book ");
                }

            } while (choice != 7);
        }
        if (choice == 2) {
            System.out.println("Welcome To The List Of Magazine");
            System.out.println("---------------------------");
            do {
                menuMagazine();
                System.out.println("Enter Choose Of You : ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    case 1:
                        Magazine magazine = inputMagazine();
                        magazineManagement.addMagazine(magazine);
                        break;
                    case 2:
                        System.out.println("Enter ID You Need Remove");
                        int newID = Integer.parseInt(input.nextLine());
                        Magazine magazine1 = magazineManagement.searchByID(newID);
                        if(magazine1 == null){
                            System.out.println("Not Found ID");
                        }else{
                            magazineManagement.remove(magazine1);
                            System.out.println("Deleted !!!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID You Need Remove");
                        int inputID = Integer.parseInt(input.nextLine());
                        Magazine magazine2 = magazineManagement.searchByID(inputID);
                        if(magazine2 == null){
                            System.out.println("Not Found ID");
                            break;
                        }else{
                            System.out.println("Here's The Magazine Information You Need");
                            showMagazine(magazine2);
                            magazineManagement.updateMagazine(magazine2);
                            System.out.println("Successful Update !! ");
                        }
                        break;
                    case 4:
                        Collections.sort(magazineList, new Comparator<Magazine>() {
                            @Override
                            public int compare(Magazine o1, Magazine o2) {
                                int imp = o1.getReleaseMonth().compareTo(o2.getReleaseMonth());
                                if(imp >=0){
                                    return -1;
                                }else{
                                    return 1;
                                }
                            }
                        });
                        for(Magazine magazine3 : magazineList){
                            showMagazine(magazine3);
                        }
                        break;
                    case 6:
                        for(Magazine magazine3 : magazineList){
                            System.out.println("Here's The Magazine Information You Need");
                            showMagazine(magazine3);
                        }
                        break;
                    case 7:
                        menuMagazine();
                        break;
                    case 8:
                        System.out.println("GoodBye ~~");
                        break;
                    default:
                        System.err.println("Please Choose In Six Option");
                }
            }while (choice !=8);
        }
        if(choice ==3){
            do {
                menuNewspaper();
                System.out.println("-------------------------------");
                System.out.println("Welcome To The List Of Newspaper.");
                System.out.println("Enter Choose Of You For Newspaper");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        Newspaper newspaper = inputNewspaper();
                        newspaperManagement.addNewspaper(newspaper);
                        break;
                    case 2:
                        System.out.println("Enter ID You Need Delete !!");
                        int inputID = Integer.parseInt(input.nextLine());
                        Newspaper newspaper1 = newspaperManagement.searchByID(inputID);
                        if(newspaper1 == null){
                            System.out.println("Not Found ListNewspaper You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            newspaperManagement.remove(newspaper1);
                            System.out.println("Deleted !!!!!!");
                            System.out.println("------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID Of Newspaper You Need Update");
                        int enterID = Integer.parseInt(input.nextLine());
                        Newspaper newspaper2 = newspaperManagement.searchByID(enterID);
                        if(newspaper2 == null){
                            System.out.println("Not Found ListMagazine You Need, Pls Review !!");
                            System.out.println("----------------------------------------");
                            break;
                        }else{
                            System.out.println("Here's The Newspaper Information You Need.");
                            showNewspaper(newspaper2);
                            System.out.println("---------------------------");
                            newspaperManagement.updateNewspaper(newspaper2);
                            System.out.println("Successful Updates !!!");
                            System.out.println("-----------------------");
                        }
                        break;
                    case 4:
                        Collections.sort(newspaperList, new Comparator<Newspaper>() {
                            @Override
                            public int compare(Newspaper o1, Newspaper o2) {
                                int sao = o1.getReleaseDate().compareTo(o2.getReleaseDate());
                                if(sao >=0){
                                    return -1;
                                }else{
                                    return 1;
                                }
                            }
                        });
                        for(Newspaper newspaper3 : newspaperList){
                            showNewspaper(newspaper3);
                            System.out.println("After Sort !!");
                        }
                        break;
                    case 5:
                        for(Newspaper newspaper3 : newspaperList){
                            showNewspaper(newspaper3);
                        }
                        System.out.println("--------------------------");
                        break;
                    case 6:
                        menuNewspaper();
                        break;
                    case 7:
                        System.out.println("GoodBye~~");
                        break;
                    default:
                        System.out.println("Choose One Of Six Options.");
                }
            }while (choice !=6);
        }
        if(choice <1 || choice>3){
            System.err.println("There Are Only Three Types Of Documents, I Hope You Review Them.");
        }
    }


    public static void menuBook(){
        System.out.println("1.Add Information Of  Book");
        System.out.println("2.Remove Information Of Book");
        System.out.println("3.Update Information Of Book Now");
        System.out.println("4.Sort Book Base On Cost");
        System.out.println("5.Display all");
        System.out.println("6.Show Menu");
        System.out.println("7.Exits");
    }
    public static void menuMagazine(){
        System.out.println("1.Add Information Of  Magazine");
        System.out.println("2.Remove Information Of Magazine");
        System.out.println("3.Update Information Of Magazine Now");
        System.out.println("4.Sort magazine by month");
        System.out.println("5.Display all");
        System.out.println("6.Show Menu");
        System.out.println("7.Exits");
    }
    public static void menuNewspaper(){
        System.out.println("1.Add Information Of  Newspaper");
        System.out.println("2.Remove Information Of Newspaper");
        System.out.println("3.Update Information Of Newspaper Now");
        System.out.println("4.Sort newspaper by release number");
        System.out.println("5.Display all");
        System.out.println("6.Show Menu");
        System.out.println("7.Exits");
    }
    public static Book inputBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(input.nextLine());
        System.out.println("Enter Producer : ");
        String producer = input.nextLine();
        System.out.println("Enter ReleaseNumber: ");
        int releaseNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter Author: ");
        String author = input.nextLine();
        System.out.println("Enter Page: ");
        int page = Integer.parseInt(input.nextLine());
        return new Book(ID,producer,releaseNumber,author,page);
    }

    public static void showBook (Book book){
        System.out.println(book.toString());
    }

    public static Magazine inputMagazine(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(input.nextLine());
        System.out.println("Enter Producer : ");
        String producer = input.nextLine();
        System.out.println("Enter ReleaseNumber: ");
        int releaseNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter ReleaseMonth: ");
        String releaseMonth = input.nextLine();
        System.out.println("Enter IssueNumber: ");
        int issueNumber = Integer.parseInt(input.nextLine());
        return new Magazine(ID,producer,releaseNumber,releaseMonth,issueNumber);
    }
    public static void showMagazine(Magazine magazine){
        System.out.println(magazine.toString());
    }

    public static Newspaper inputNewspaper(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int ID = Integer.parseInt(input.nextLine());
        System.out.println("Enter Producer : ");
        String producer = input.nextLine();
        System.out.println("Enter ReleaseNumber: ");
        int releaseNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter ReleaseDate: ");
        String releaseDate = input.nextLine();
        return new Newspaper(ID,producer,releaseNumber,releaseDate);
    }

    public static void showNewspaper(Newspaper newspaper){
        System.out.println(newspaper.toString());
    }
}



