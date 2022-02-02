public class BookDemo {
    public static void main(String[] args) {
        Book javaProgrammingLang = new Book("xyz","Java from Beginner to Master","Programming",720);
        Book mathematics = new Book("abcd","Mathematics","Math",500);
        Book databases = new Book("qwerty","DBMS for Beginners along with Practical SQL","databases",850);

        System.out.println(javaProgrammingLang.toString());
        System.out.println(mathematics.toString());
        System.out.println(databases.toString());
    }
}
