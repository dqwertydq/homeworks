package javaapplication90;

public class book {
    String title;
    int yearWritting;
    int yearPublish;
    Author author;

    @Override
    public String toString() {
        return "book{" + "title=" + title + ", yearWritting=" + yearWritting + ", yearPublish=" + yearPublish + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYearWritting() {
        return yearWritting;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
    String publisher;
}
