package com.java.model;

import java.util.Objects;

public abstract class Document {
    protected int ID;
    protected String producer;
    protected int releaseNumber;

    public Document(int ID, String producer, int releaseNumber) {
        this.ID = ID;
        this.producer = producer;
        this.releaseNumber = releaseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return ID == document.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public int getID() {
        return ID;
    }

    public abstract double calcualateCost();

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ID=" + ID +
                ", producer='" + producer + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
