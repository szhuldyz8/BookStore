package com.epam.library;

public class Fiction extends Book {
    public Fiction(String title, String author, String publisher, int price, int publicationYear, String type) {
        super(title, author, publisher, price, publicationYear, type);

    }

    @Override
    public void haveArtisticWords() {
        super.haveArtisticWords();
        System.out.println("Fiction use a lot of artistic words");
    }

    @Override
    public void makeFeelEmotions() {
        super.makeFeelEmotions();
        System.out.println("Fiction makes people feel different emotions");
    }
}
