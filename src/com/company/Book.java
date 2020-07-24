package com.company;

public class Book {
    String Bookname;
    String Authorname;
    String Publisher;
    long ISBN;

    public Book(String name, long isbn, String author, String publisher){
        Bookname=name;
        ISBN =isbn;
        Authorname =author;
        Publisher = publisher;
    }

    public String getBookname(){
        return Bookname;
    }

    public void setBookname(String name){
        Bookname = name;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public void setAuthorname(String author) {
        Authorname = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setLastName(int isbn) {
        ISBN = isbn;
    }

    public void getBookInfo() {
        System.out.println("Book Name = "+getBookname());
        System.out.println("ISBN No. = "+ getISBN());
        System.out.println("Author Name = "+ getAuthorname());
        System.out.println("Publisher = "+getPublisher());
    }

    public static void main(String[] args) {
        Book test[] = new Book[30];
        test[0] = new Book(" Continuous Delivery",9780321601919l,"Jez Humble & David Farley "," Addison-Wesley Professional");
        test[1] = new Book(" Algorithms ",978-0321573513,"Robert Sedgewick & Kevin Wayne ","Addison-Wesley Professional");
        test[0].getBookInfo();
    }
}
