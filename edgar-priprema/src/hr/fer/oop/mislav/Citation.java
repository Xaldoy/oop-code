package hr.fer.oop.mislav;

public abstract class Citation {
	private Person[] authors;
    private String title;
    private int year;

    public Citation(Person[] authors, String title, int year) {
        this.authors = authors;
        this.title = title;
        this.year = year;
    }

    public Person[] getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    abstract int getPagesCount();
}
