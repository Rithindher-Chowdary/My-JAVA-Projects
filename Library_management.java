import java.util.Scanner;
  class Details{
  Scanner obj = new Scanner(System.in);
  String book;
  void Takingbook(){
     System.out.println("enter the required book");
     book = obj.nextLine();
     if(book.equals("java")||book.equals("ads")||book.equals("dmgt")||book.equals("dlco")||book.equals("uhv")){
        System.out.println("required book is available");
      }else{
        System.out.println("required book is not available");
       }
  }
  void Returningbook(){ 
     System.out.println("your book is returned successfully");
     }
  }
 public class Library_management{
   public static void main(String[] args){
     Details object = new Details();  
   Scanner sc = new Scanner(System.in);
      int choice;
      do{
          System.out.println("\n\nEnter your choice:\n1.take book\n2.return book\n3.Exit");
          choice = sc.nextInt();
          switch(choice)
          {
              case 1:object.Takingbook();
              break;
              case 2:object.Returningbook();
              break;
              case 3: System.out.println("exiting....");
              break;
              default:System.out.println("Wrong choice");
          }
      }while(choice!=3);
}}