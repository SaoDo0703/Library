package com.java.dao;

import com.java.model.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewspaperManagement {
    Scanner input = new Scanner(System.in);
    private List<Newspaper> newspapers = new ArrayList<>();

    public List<Newspaper> getNewspapers() {

        return newspapers;
    }

    public void updateNewspaper(Newspaper updatedNewspaper) {
        for (Newspaper newspaper: newspapers) {
            if (newspaper.getID() == updatedNewspaper.getID()) {
                System.out.println("1.Edit Producer Of Newspaper");
                System.out.println("2.Edit ReleaseNumber OfNewspaper ");
                System.out.println("3.Edit ReleaseDate Of Newspaper");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.print("Enter New Producer Of Newspaper: ");
                        newspaper.setProducer(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New ReleaseNumber Of Newspaper");
                        newspaper.setReleaseNumber(input.nextInt());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New ReleaseDate Of Newspaper");
                        newspaper.setReleaseDate(input.nextLine());
                        System.out.println("Successful Change !!!");
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

    public Newspaper searchByID(int ID) {
        for (Newspaper newspaper: newspapers) {
            if (newspaper.getID() == ID) {
                return newspaper;
            }
        }
        return null;
    }

    public Newspaper addNewspaper(Newspaper newspaper){
        newspapers.add((Newspaper) newspapers);
        return newspaper;
    }

    public void remove(Newspaper newspaper){
        newspapers.remove(newspapers);
    }



}
