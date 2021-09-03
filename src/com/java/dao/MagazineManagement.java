package com.java.dao;

import com.java.model.Magazine;
import com.java.model.Newspaper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MagazineManagement {
    private List<Magazine> magazines = new ArrayList<>();
    Scanner input = new Scanner(System.in); //đc Sao

    public List<Magazine> getmagazines() {

        return magazines;
    }

    public void updateMagazine(Magazine updatedMagazine) {
        for (Magazine magazine: magazines) {
            if (magazine.getID() == updatedMagazine.getID()) {
                System.out.println("1.Edit Producer Of Magazine");
                System.out.println("2.Edit ReleaseNumber Of Magazine ");
                System.out.println("3.Edit ReleaseMonth Of Magazine");
                System.out.println("4.Edit IssueNumber Of Magazine ");
                System.out.println("Please Select The Information To Be Corrected !!!");
                System.out.println("Choose is: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose){
                    case 1:
                        System.out.print("Enter New Producer Of Magazine: ");
                        magazine.setProducer(input.nextLine());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("Enter New ReleaseNumber Of Magazine");
                        magazine.setReleaseNumber(input.nextInt());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 3:
                        System.out.println("Enter New ReleaseMonth Of Magazine");
                        magazine.setReleaseNumber(input.nextInt());
                        System.out.println("Successful Change !!!");
                        System.out.println("-----------------------");
                        break;
                    case 4:
                        System.out.println("Enter New IssueNumber Of Magazine");
                        magazine.setReleaseNumber(input.nextInt());
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

    public Magazine searchByID(int ID) {
        for (Magazine magazine: magazines) {
            if (magazine.getID() == ID) {
                return magazine;
            }
        }
        return null;
    }

    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public void remove(Magazine magazine){
        magazines.remove(magazines);
    }




}
