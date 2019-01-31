package by.cdp.jb27.les09_10_11;

import by.cdp.jb27.les09_10_11.print.Book;
import by.cdp.jb27.les09_10_11.print.PeriodicalPublication;
import by.cdp.jb27.les09_10_11.print.Publication;

import java.util.List;

import static by.cdp.jb27.les09_10_11.Library.showLibraryLikeTable;

public class Les09_10_11 {

    public static void main(String[] args) {

        Library library = new Library();


        library.addPublications(LibraryLoaderFromFile.getBooks());
        library.addPublications(LibraryLoaderFromFile.getPeriodicalPublications());


//        library.addPublication(new Book("Java 8", 100, "Blinov", 2010, 11, 01));
//        library.addPublication(new Book("The Shining", 18, "S. King", 1977, 10, 05));
//        library.addPublication(new Book("The Running Man", 15, "S. King", 1982, 05, 05));
//        library.addPublication(new Book("It", 25, "S. King", 2011, 05, 05));
//        library.addPublication(new Book("Green mile", 20, "S. King", 1996, 05, 05));
//        library.addPublication(new PeriodicalPublication("Komsomolskaya Pravda", 1, "daily", 2019, 01, 10));
//        library.addPublication(new PeriodicalPublication("Play Boy", 10, "monthly", 2018, 06, 01));
//        library.addPublication(new Book("Romeo & Julieta", 100, "W. Shakespeare", 1966, 10, 10));
//        library.addPublication(new Book("Как бросить курить", 100, "А. Карр", 1985, 12, 01));


        library.showLibrary();

        System.out.println("Get book by title:");
        System.out.println(library.getPublication("Romeo & Julieta"));

        System.out.println("Delete book:");
        library.deletePublication("Как бросить курить");
        System.out.println(library.getPublication("Как бросить курить"));


        System.out.println();
        showLibraryLikeTable(library.getPublicationList());

        System.out.println("\n<--- Find all books by author name and print them sorted by publish date:  --->");
        List<Publication> allBooksByAuthorNameSortedByDate = library.findAllBooksByAuthorNameSortedBy("King", new PublishDateComparator());
        showLibraryLikeTable(allBooksByAuthorNameSortedByDate);
        System.out.println("\n<--- Find all books by author name and print them sorted by price:  --->");
        List<Publication> allBooksByAuthorNameSortedByPrice = library.findAllBooksByAuthorNameSortedBy("King", new PriceComparator());
        showLibraryLikeTable(allBooksByAuthorNameSortedByPrice);
    }
}
