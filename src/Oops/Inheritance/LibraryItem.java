package Oops.Inheritance;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("One item is borrowed");
    }

    public void returnItem(){
        System.out.println("One book is returned");
    }
}
