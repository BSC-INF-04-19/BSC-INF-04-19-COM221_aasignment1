import java.util.Scanner;
public class Main{
  public static void main(String[]args){

    // generate roandom numbers
    int number1 =(int)(Math.random()*10);
     int number2 =(int)(Math.random()*10);
      int number3 =(int)(Math.random()*10);
    

    // input values
      Scanner keyboard = new Scanner(System.in);

      // instances
      StudentAccount account=new StudentAccount();

    // options for undergradute and postgraduate
      System.out.println("       SELECT YOUR OPTION");
      System.out.println("1.  undergraduate account");
      System.out.println("2.  postgraduate account");
      int choice = keyboard.nextInt();
   // if the choice is undergraduate account

   if(choice ==1){
     System.out.println("     SELECT YOUR OPTION");
     System.out.println("--------------------------------------");
     System.out.println("1.   create account");
     System.out.println("2.    apply for the loan");
     System.out.println("3.     check the balance");
     System.out.println("4.    Exit");
     
      //  if the choice is creating the account
     int choice1=keyboard.nextInt();
      
      // creating the undergraduate account
     if( choice1==1){
       System.out.println("Enter your name");
       String name=keyboard.next();

       System.out.println("Enter year of study");
       int yearOfStudy=keyboard.nextInt();
       
      System.out.println("Enter the program");
      String program=keyboard.next();

      System.out.println("Enter substistence amount");
      double substistence=keyboard.nextDouble();

      System.out.println("Enter stationary amount");
      double stationary=keyboard.nextDouble();

      String account1= "UG" +number1+number2+number3;
      System.out.println(".........Your acount details.........");
      System.out.println("");
      System.out.println("name     year    program  loanAmount  accountNumber");
      System.out.println(name + "  " + yearOfStudy + "    " +program + "    " + (account.getTuitionRate()*substistence+substistence)+ " "+ account1);
     
     System.out.println("account has been created successfully !!!!!");
      
      // account menu
      System.out.println("..........WELCOME TO THE UNDERGRADUATE ACCOUNT.........");
      System.out.println("1. check your account balance: ");
      System.out.println("2. create another account: ");
      System.out.println("3. payback: ");

     int choice2 = keyboard.nextInt();
      if (choice2==1){
        System.out.println("Your account balance is " + (account.getTuitionRate()*  substistence+ substistence));
      }

     }} // if postgradute is chosen
   else if(choice==2){
       System.out.println("      SELECT YOUR OPTION");
System.out.println("--------------------------------------------");
System.out.println("1. Create account");
System.out.println("2. Apply for the loan");
System.out.println("3. Check balance");
System.out.println("4. Exit");

int choice1 = keyboard.nextInt();

//  creating postgraduate account
//if(choice1 ==1){
 //System.out.println("Enter your name");
 //String name = keyboard.next();
 
//System.out.println("Enter year of study");
//int yearOfStudy =  keyboard.nextInt();
 //System.out.println("Enter your program of study");
 //String program = keyboard.next();
//System.out.println("Enter subsitence amount");
//double substistence = keyboard.nextDouble();
//System.out.println("Enter statioanay amount");
//double stationary = keyboard.nextDouble();//

   } 
   
  



    else{
       System.out.println(" account does not exist");
     
  
}

  }}