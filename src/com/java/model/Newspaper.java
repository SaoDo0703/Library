package com.java.model;


public class Newspaper extends Document {
    private String releaseDate;

    public Newspaper(int ID, String producer, int releaseNumber,String releaseDate) {
        super(ID, producer, releaseNumber);
        this.releaseDate=releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public double calcualateCost() {
        return 15000;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "ID=" + ID +
                ", producer='" + producer + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
