package com.epam.library;

public class Book extends BookStore implements Pages, Binding {
    private String type;
    public Book(String title, String author, String publisher, int price, int publicationYear, String type) {
        super(title, author, publisher, price, publicationYear);
                this.type = this.type;
    }
    public void haveArtisticWords() {

    }
     public  void makeFeelEmotions() {

    }

    @Override
    public void makeBinding() {
        System.out.println("Make binding of book hard or soft");
    }

    @Override
    public void calculatePages() {
        System.out.println("Books have different numbers of pages");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void haveGenre() {
        super.haveGenre();
        System.out.println("Books have genre");
    }
}
