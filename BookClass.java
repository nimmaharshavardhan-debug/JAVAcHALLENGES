public class BookClass {
    // Instance variables 
    String Title;
    String author;
    String isbn;
    static int totalBooks = 5;
    

    // Methods 
    void borrowBooks(){
        if(totalBooks<0){
            System.out.println("No book are avaliable");
        }else{
            System.out.println("Max  "+totalBooks+ "are avaliable");
        }
    }
    void returnBook(){
        if(totalBooks==3){
            System.out.println("You must return the atleast one book ");
            System.out.println("Max is three books can be borrowed ! ");
            totalBooks--;
        }else{
            System.out.println("You can take ");
        }
    }

    static void  getTotalBooks(int a ){
        if(totalBooks==a){
            System.out.println("Return total number of books in the library");
        }
        
        

    }

    public static void main(String[] args){
        BookClass book1 = new BookClass();
        BookClass.getTotalBooks(totalBooks);
        book1.Title = "Me and my madness";
        book1.author="Tony";
        book1.isbn="978-93-5900-000-7";
        
        
        System.out.println(book1.Title);
        System.out.println(book1.author);
        System.out.println(book1.isbn);
        System.out.println(BookClass.totalBooks);
        
        
        
    }


}
