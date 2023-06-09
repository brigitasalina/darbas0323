import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();


        Book book = new Book();
        book.setTitle("Grazus gyvenimas");
        book.setPages(105);
        book.setReleaseYear(2000);

        Book b1 = new Book();
        b1.setTitle("Saule sviecia");
        b1.setPages(49);
        b1.setReleaseYear(1989);


        Book b2 = new Book();
        b2.setTitle("Ragana");
        b2.setPages(276);
        b2.setReleaseYear(2023);

        Book book1 = new Book("Gyvenimas grazus", 105, 2000);
        Book book2 = new Book("Saule sviecia", 49, 1989);
        Book book3 = new Book("Ragana", 276, 2023);


        books.add(book);
        books.add(b1);
        books.add(b2);
        books.add(book1);
        books.add(book2);
        books.add(book3);


        for (int i = 0; i < books.size(); i++) {
            Book bookI = books.get(i);
            // System.out.println(bookI);
            System.out.println(books.get(i));
        }
        System.out.println("-------------------");


        ArrayList<Plant> plant = new ArrayList<>();

        Plant a = new Plant();
        a.setTitle("Rope");
        a.setLatinTitle("Brassica rapa");
        a.setAnnual(true);
        a.setContinent("Europa, Azija");
        a.setHeight(55);
        a.setEdible(true);

        Plant b = new Plant();
        b.setTitle("Rukola");
        b.setLatinTitle("Eruca sativa");
        b.setAnnual(false);
        b.setContinent("Azija, Centrine Europa");
        b.setHeight(50);
        b.setEdible(true);

        Plant c = new Plant();
        c.setTitle("Saulegraza");
        c.setLatinTitle("Helianthus");
        c.setAnnual(false);
        c.setContinent("Siaures Amerika");
        c.setHeight(200);
        c.setEdible(true);

        Plant d = new Plant();
        d.setTitle("Kraujalake");
        d.setLatinTitle("Sanguisorba");
        d.setAnnual(true);
        d.setContinent("Europa");
        d.setHeight(90);
        d.setEdible(false);

        Plant plant9 = new Plant("Rope","Brassica rapa", true, "Europa, Azija", 55, true);
        Plant plant8 = new Plant("Rukola", "Eruca sativa", false,"Azija, Centrine Europa", 50, true);


        plant.add(c);
        plant.add(d);
        plant.add(plant9);
        plant.add(plant8);


        for (int i = 0; i < plant.size(); i++) {
//            Plant plant1 = plant.get(i);
            System.out.println(plant.get(i));
        }




    }

}






