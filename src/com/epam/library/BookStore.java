package com.epam.library;

public  class BookStore {
    String title;
    String author;
    String publisher;
    int price;
    int publicationYear;

    public BookStore (String title, String author, String publisher, int price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.publicationYear = publicationYear;
    }
    public void haveGenre () {

    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

