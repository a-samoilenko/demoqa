package HeadFirst;

public class Book {
    String title;
    String author;
}

class BookTestDrive{
    public static void main(String[] args) {
        Book[] myBooks = new Book[3];
        int x = 0;

        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while(x<3){
           System.out.println(myBooks[x].title + " автор " + myBooks[x].author);
          x++;

        }
    }
}