package com.epam.library;

public class Main {
    public static void main (String[] args) {
        Book book1 = new Book("Flower for algernon", "Daniel Keyes", "Azbuka", 1590, 2001, "soft");
       book1.calculatePages();
     book1.makeBinding();
     Fiction fiction_one = new Fiction("The Master and Margarita", "Michail Bulgakov", "Sunrise", 2500, 1997, "hard");
     fiction_one.haveArtisticWords();
     fiction_one.makeFeelEmotions();
     PoliticalMagazines politicalMagazines_one = new PoliticalMagazines("Forbes", "Bertie Charles Forbes", "Penguin", 2150, 2017, 3);
     politicalMagazines_one.usingPoliticianWords();
     AudioBook audioBook1 = new AudioBook("The portrait of dorian Grey", "Oskar Wilde", "Flower", 2400, 1980, "two hours");
     audioBook1.haveGenre();
     Magazines magazines_one = new Magazines("Oila", "Karabayer Ernar", "Kalamkas", 1580, 2016, 7);
     magazines_one.calculatePages();
     magazines_one.makeBinding();
     magazines_one.haveGenre();
     }
    }

