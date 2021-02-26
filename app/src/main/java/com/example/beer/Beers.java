package com.example.beer;

//This class includes the list of Beers using constructor define in Beer.java
public class Beers {
    private static final Beer[] beers = new Beer[]{
            new Beer(1, "Carlsberg", 4.6),
            new Beer(2, "Tuborg", 4.6),
            new Beer(3, "Singha", 5.0),
            new Beer(4, "Heineken", 5.0),
            new Beer(5, "Pilsner Urquell", 4.4),
            new Beer(6, "Zlaty Bazant", 4.7),
            new Beer(7, "Timișoreana", 5.0),
            new Beer(8, "Zagorka Spetsialno", 5.0),
            new Beer(9, "Dreher Classic", 5.2),
            new Beer(10, "Żywiec Porter", 9.5),
            new Beer(11, "Aldaris Zelta", 5.2),
            new Beer(12, "Švyturys Ekstra", 5.2)
    };

    public static Beer[] getAllBeers() {
        return beers;
    }

    private Beers() {
    } // private constructor: no objects from this class
}