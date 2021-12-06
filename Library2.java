class CentralLibrary
{   
    
    //there might be one constructor
    int no_of_books;
    String books[];

    CentralLibrary()
    {   
        this. no_of_books=0;
        this.books=new String[100];
    }
    
    void addBook(String book)
    {
        this.books[no_of_books]=book;
        System.out.println(book+"has been added sucessfully");
        no_of_books++;
    }

    void showAvailableBooks()
    {   System.out.println("Available books are");
        for(String b:this.books)
        {
            if(b==null)
            {
                continue;
            }
            System.out.println("*"+b);
        }
    }

    void issuedBooks(String b2)
    {

        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(b2))
            {
                System.out.println("this book "+this.books[i]+"had been issued sucesfully");
                this.books[i]=null;
                return;
            }
            
        }
        System.out.println("This book does not exist in library");
        
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}

public class Library2 
{
    public static void main(String args[])
    {
        CentralLibrary cLb= new CentralLibrary();
        cLb.addBook("Data strucutres and algorithms ");
        cLb.addBook("object oriented programminig");
        cLb.addBook("descrete mathematics");
        cLb.addBook("probability and statistics");
        cLb.showAvailableBooks();
        cLb.issuedBooks("descrete mathematics");
        cLb.issuedBooks("object oriented programming");
        cLb.returnBook("descrete mathematics");

    }
    
}
