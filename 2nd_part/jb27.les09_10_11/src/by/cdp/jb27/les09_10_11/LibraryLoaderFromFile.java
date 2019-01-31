package by.cdp.jb27.les09_10_11;

import by.cdp.jb27.les09_10_11.print.Book;
import by.cdp.jb27.les09_10_11.print.PeriodicalPublication;
import by.cdp.jb27.les09_10_11.print.Publication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryLoaderFromFile {

    private static String booksFile = "src/by/cdp/jb27/les09_10_11/resources/books.csv";
    private static String periodicsFile = "src/by/cdp/jb27/les09_10_11/resources/periodics.csv";

    public static List<Publication> getBooks() {
        List<Publication> bookList = new ArrayList<>();
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(booksFile))) {

            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                Book book = new Book();
                book.setTitle(strings[0]);
                book.setPrice(Integer.valueOf(strings[1]));
                book.setAuthor(strings[2]);
                book.setPublishDate(LocalDate.parse(strings[3]));
                bookList.add(book);
            }

        } catch (IOException e) {
            System.out.println("Can't find books file!");
            System.out.println((e.getMessage()));
        }
        return bookList;
    }

    public static List<Publication> getPeriodicalPublications() {
        List<Publication> publicationList = new ArrayList<>();
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(periodicsFile))) {

            while ((line = br.readLine()) != null) {
                String[] strings = line.split(",");
                PeriodicalPublication publication = new PeriodicalPublication();
                publication.setTitle(strings[0]);
                publication.setPrice(Integer.valueOf(strings[1]));
                publication.setPeriod(strings[2]);
                publication.setPublishDate(LocalDate.parse(strings[3]));
                publicationList.add(publication);
            }

        } catch (IOException e) {
            System.out.println("Can't find periodic publications file!");
            System.out.println((e.getMessage()));
        }
        return publicationList;
    }
}
