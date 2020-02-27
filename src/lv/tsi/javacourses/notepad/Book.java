package lv.tsi.javacourses.notepad;

public class Book extends Record {
    private String title;
    private String isbn;
    private int pageCount;
    private String author;


    @Override
    public void askInfo() {
        title = Asker.askString("Title");
        author = Asker.askString("Author");
        pageCount = Asker.askInt("Page count", 2, Integer.MAX_VALUE);
        isbn = Asker.askString("Isbn");

    }

    @Override
    public String stringContent() {
        return super.stringContent() + "{" +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'';
    }

    @Override
    protected String type() {
        return "Book";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
