import java.util.Date;

class Blog {
    private String title;
    private String author;
    private StringBuilder blogText;
    private Date publishedDate;


    public Blog(String title, String author, StringBuilder blogText, Date publishedDate) {
        this.title = title;
        this.author = author;
        this.blogText = blogText;
        this.publishedDate = publishedDate;
    }

    public String getBlogText() {

        return this.blogText.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {

        return this.author;
    }

    public Date getPublishedDateForTheBook() {

        return this.publishedDate;
    }

    public void editBlogPost(String editedText) {

        this.blogText.append(editedText);
    }


}

public class Naming_StringBuilder {
    public static void main(String[] args) {
        Blog blog = new Blog("Java","ABC", new StringBuilder("Java is a compiled and interpreted language. "), new Date());
        blog.editBlogPost("Java is a platform independent language");

        System.out.println(blog.getBlogText());

        System.out.println(blog.getPublishedDateForTheBook());
    }
}
