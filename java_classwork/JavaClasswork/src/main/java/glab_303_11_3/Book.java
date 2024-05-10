package glab_303_11_3;

public class Book {
    private int number;
    private String name;
    private String author;
    private String category;

    // Constructor with args
    public Book(int number, String name, String author, String category) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }

    // Constructor without args
    public Book(){

    }

    //region Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //endregion
}
