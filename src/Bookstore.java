import java.util.Scanner;

/**
 * @author KHUSHI
 * @version 1.0
 */

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Books[] books= new Books[n];
        if(n<=0){
            System.out.print("N/A");
        }
        else{
            scanner.nextLine();
            for (int i=0;i<n;i++){
                String bookName=scanner.nextLine();
                String authorName=scanner.nextLine();
                long isbn=Long.parseLong(scanner.nextLine().trim());
                books[i]=new Books(bookName,authorName,isbn);
            }
            for (int j=0;j<n;j++){
                System.out.println("-----------------------------");
                System.out.println("Book Name:"+"\t"+books[j].getBookName());
                System.out.println("Author Name:"+"\t"+books[j].getAuthorName());
                System.out.println("ISBN:"+"\t"+books[j].getIsbn());
                System.out.println("-----------------------------");
            }
        }scanner.close();
    }
}
class Books{
    private String bookName;
    private String authorName;
    private long isbn;

    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public long getIsbn(){
        return isbn;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setIsbn(long isbn){
        this.isbn=isbn;
    }

    public Books(String bookName,String authorName,long isbn){
        this.bookName=bookName;
        this.authorName=authorName;
        this.isbn=isbn;
    }
}
