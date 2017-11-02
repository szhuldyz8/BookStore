package com.epam.library;

public class PoliticalMagazines extends Magazines{
    public PoliticalMagazines(String title, String author, String publisher, int price, int publicationYear, int numberOfVersion) {
        super(title, author, publisher, price, publicationYear, numberOfVersion);

    }

    @Override
    public void usingPoliticianWords() {
        super.usingPoliticianWords();
        System.out.println("That M is using politician words");

    }
}
