package com.epam.library;

public class AudioBook extends BookStore{
    private String duration;
    public AudioBook(String title, String author, String publisher, int price, int publicationYear, String two_hours) {
        super(title, author, publisher, price, publicationYear);
        this.duration = duration;
    }

    @Override
    public void haveGenre() {
        super.haveGenre();
        System.out.println("Audio Books also divided into Genres");
    }
}
