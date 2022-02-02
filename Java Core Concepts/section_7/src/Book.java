public class Book {
    private String authorName;
    private String title;
    private String genre;
    private int totalPages;

    Book(String authorName, String title, String genre, int totalPages){
        this.authorName = authorName;
        this.title = title;
        this.genre = genre;
        this.totalPages = totalPages;
    }

    @Override
    public String toString(){
        return "The title of the book is " + this.title + " and it's author is " + this.authorName + " and it belong to genre " + this.genre + " and have total page count of" + this.totalPages;
    }

    public String getAuthor(){
        return this.authorName;
    }
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getNumPages(){
        return this.totalPages;
    }


}
