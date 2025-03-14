import java.util.Scanner;
  class Accountdetails{
     String name="Rithindher";
     int accno=1234567890;
     int balance=25000;
     String Branch="Ananthapur";
     int withdrawl;
     Scanner obj = new Scanner(System.in);
 void Account_details(){
     System.out.println("Account holder name : "+name);
     System.out.println("Account number : "+accno);
     System.out.println("Account balance :"+balance);
      System.out.println("your Branch :"+Branch);
     }
 void Checkbalance(){
     System.out.println("your balance :"+balance);
     }
  void depositmoney(){
     System.out.println("enter money to be deposited:");
     int money = obj.nextInt();
     balance = balance+money;
     System.out.println("Balance after your deposit :"+balance);
     }
 void withdrawmoney(){
      System.out.println("enter money to be withdrawl :");
      int withdrawl = obj.nextInt();
      balance = balance-withdrawl;
       System.out.println("remaining balance after withdrawl:"+balance);
      }
     }

public class ATM_Simulation{
  public static void main(String[] args){
   Accountdetails object = new Accountdetails();
   Scanner sc = new Scanner(System.in);
      int choice;
      do{
          System.out.println("\n\nEnter your choice:\n1.Account details\n2.balance check\n3.Deposit\n4.withdral\n5.Exit");
          choice = sc.nextInt();
          switch(choice)
          {
              case 1: object.Account_details();
              break;
              case 2: object.Checkbalance();
              break;
              case 3: object.depositmoney();
              break;
              case 4: object.withdrawmoney();
              break;
              case 5: System.out.println("Exited....");
              break;
              default:System.out.println("Wrong choice");
          }
      }while(choice!=5);
}}