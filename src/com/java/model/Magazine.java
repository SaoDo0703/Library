package com.java.model;

public class Magazine extends Document{
    private String releaseMonth;
    private int issueNumber;

    public Magazine(int ID, String producer, int releaseNumber,String releaseMonth,int issueNumber) {
        super(ID, producer, releaseNumber);
        this.releaseMonth= releaseMonth;
        this.issueNumber=issueNumber;
    }

    @Override
    public int getReleaseNumber() {
        return super.getReleaseNumber();
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public double calcualateCost() {
        return 20000;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "ID=" + ID +
                ", producer='" + producer + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", releaseMonth='" + releaseMonth + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
