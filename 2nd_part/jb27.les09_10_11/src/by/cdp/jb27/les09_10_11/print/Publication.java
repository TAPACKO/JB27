package by.cdp.jb27.les09_10_11.print;

import java.time.LocalDate;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Publication {

    private static AtomicInteger nextId = new AtomicInteger();
    private int id;
    private String title;
    private int price;
    private LocalDate publishDate;

    public Publication() {
        id = nextId.incrementAndGet();
    }

    public Publication(String title, int year, int month, int day, int price) {
        this.title = title;
        this.price = price;
        publishDate = LocalDate.of(year, month, day);
        id = nextId.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", publish date='" + publishDate + '\'' +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

}
