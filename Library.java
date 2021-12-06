import java.util.Scanner;

class Librarian
{
    public int num_of_books=200;
    public int issued_books=5;
    public String books="My grandma , ramayan ,mahabharata , panchtantra, engineering maths ,data structures and algorithm , object oritented programing ,data science AI,machine learning";
    public String registered_users="rahul , sanjana ,raghav,sanjay,priya,manjulika ,sardar , neha, kajal,pranshu,ashi";
    public void infomation()
    {
        System.out.print("No. of books present in the library : "+num_of_books);
        System.out.print("\nissed books in the library :"+issued_books);
        System.out.print("\nBooks : "+books);
        System.out.print("\nRegistered users list "+registered_users);
    } 

}


class User extends Library
{   
    Scanner sc = new Scanner(System.in);
    public void details()
    {   System.out.print("\nName :");
        int borrow_book;
        String book_name;
        String name=sc.next();
        System.out.println("Name of borrower :"+name);
        System.out.print("No of borrowerd book:");
        borrow_book=sc.nextInt();
        System.out.println("Borrowerd book  "+borrow_book);
        System.out.println("book name");
        book_name=sc.next();
        System.out.println("Book name "+book_name);
    }

}


public class Library
{
    public static void main(String args[])
    {
        Librarian lb =new Librarian();
        lb.infomation();
        User ul= new User();
        ul.details();

    }
}