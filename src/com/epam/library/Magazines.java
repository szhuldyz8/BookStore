package com.epam.library;

public class Magazines extends BookStore implements Binding, Pages{
    private int numberOfVersion;
    public Magazines(String title, String author, String publisher, int price, int publicationYear, int numberOfVersion) {
        super(title, author, publisher, price, publicationYear);
        this.numberOfVersion = this.numberOfVersion;
    }
    public int getNumberOfVersion() {
        return numberOfVersion;
    }

    public void setNumberOfVersion(int numberOfVersion) {
        this.numberOfVersion = numberOfVersion;
    }
    public void usingPoliticianWords() {
    }
    @Override
    public void makeBinding() {
        System.out.println("Magazines also have two type of bindings: soft and hard");
    }
    @Override
    public void calculatePages() {
        System.out.println("All magazines also have different numbers of pages");
    }

    @Override
    public void haveGenre() {
        super.haveGenre();
        System.out.println("Magazines have their own genre");
    }


}
