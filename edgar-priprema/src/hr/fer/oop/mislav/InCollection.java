package hr.fer.oop.mislav;

public class InCollection extends Book {
    private String booktitle;
    private Person[] editors;
    private int startPage;
    private int endPage;

    public InCollection(Person[] authors, String title, int year, String publisher, String address, String booktitle, Person[] editors, int startPage, int endPage){
        super(authors, title, year, publisher, address, endPage - startPage);
        this.booktitle = booktitle;
        this.editors = editors;
        this.startPage = startPage;
        this.endPage = endPage;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public Person[] getEditors() {
        return editors;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }
}
