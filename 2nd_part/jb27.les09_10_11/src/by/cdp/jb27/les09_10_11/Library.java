package by.cdp.jb27.les09_10_11;

import by.cdp.jb27.les09_10_11.print.Book;
import by.cdp.jb27.les09_10_11.print.PeriodicalPublication;
import by.cdp.jb27.les09_10_11.print.Publication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Publication> publicationList = new ArrayList<>();

    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void addPublications(List<Publication> list) {
        publicationList.addAll(list);
    }

    public void addPublication(Publication publication) {
        publicationList.add(publication);
    }

    public Publication getPublication(String title) {
        Publication result = new Publication("Not found", 1, 1, 1, 0);

        for (Publication publication : publicationList) {
            if (publication.getTitle().equalsIgnoreCase(title)) {
                return publication;
            }
        }
        return result;
    }

    public void deletePublication(String title) {
        for (Publication publication : publicationList) {
            if (publication.getTitle().equalsIgnoreCase(title)) {
                publicationList.remove(publication);
                return;
            }
        }
    }

    public List<Publication> findAllBooksByAuthorNameSortedBy(String author, Comparator comparator){
        List<Publication> result = new ArrayList<>();
        publicationList.forEach(publication -> {
            if(publication instanceof Book) {
                if(((Book) publication).getAuthor().contains(author)){
                    result.add(publication);
                }
            }
        });

        Collections.sort(result, comparator);
        return result;
    }

    public void showLibrary() {
        for (Publication publication : publicationList) {
            System.out.print(publication.getId() + " : ");
            System.out.println(publication);
        }
    }

    public static void showLibraryLikeTable(List<Publication> publications) {
        System.out.format("%-4s%-12s%-24s%-10s%-24s%-12s", "ID", "Type", "Title", "Price", "Author/Period", "Publish Date");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                System.out.format("%-4d%-12s%-24s%-10d%-24s%-12s",
                        publication.getId(), "Book", publication.getTitle(), publication.getPrice(), ((Book) publication).getAuthor(), publication.getPublishDate());
            }
            if (publication instanceof PeriodicalPublication) {
                System.out.format("%-4d%-12s%-24s%-10d%-24s%-12s",
                        publication.getId(), "Periodic", publication.getTitle(), publication.getPrice(), ((PeriodicalPublication) publication).getPeriod(), publication.getPublishDate());
            }
            System.out.println();
        }
    }


}
