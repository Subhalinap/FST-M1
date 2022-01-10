package Activities;

abstract class Book {
    String title;

    abstract void setTitle(String s);
    public String getTitle()
    {
        return title;
    }
}

 class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {

    public static void main(String[] args) {
        String title = "Hover Car Racer";
        Book newbook = new MyBook();
        newbook.setTitle(title);

        System.out.println("The title of the book is: " + newbook.getTitle());
    }
}
