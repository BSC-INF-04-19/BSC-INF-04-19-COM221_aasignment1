import java.util.Scanner;


public class Main{
  public static void main(String[]args){

    // generate random numbers
    int number1=(int)(Math.random() *10);
    int number2=(int)(Math.random() *10);
    int number3=(int)(Math.random() *10);
    boolean run = true;

    // input values
    Scanner keyboard = new Scanner(System.in);

    // instances
    StudentAccount x = new StudentAccount();

    //prompt the user to choose the account
    System.out.println("-------------SELECT ACCOUNT OPTIONS---------");
    System.out.println("1. undergraduate");
    System.out.println("2. postgraduate");

    // declare choice
    int choice = keyboard.nextInt();

    // if choice is undergraduate
    if(choice==1){
      System.out.println("******** WELCOME TO UNDERGRADUATE ACCOUNT****");
      System.out.println("**********************************************");
      System.out.println("1. create account");
      System.out.println("2. apply for a loan");
      System.out.println("3. check balancec");
      System.out.println("4. exit");

      int choice1=keyboard.nextInt();
      if(choice1==1){

          // creating account
        System.out.println("Enter your name");
        String name=keyboard.next();
        System.out.println("Enter year of study");
        int year=keyboard.nextInt();
        System.out.println("Enter account number");
        int accountnumber=keyboard.nextInt();
        System.out.println("Enter your program");
        String program= keyboard.next();
        System.out.println("Enter subsistence amount");
        double subsistence=keyboard.nextDouble();
        System.out.println("Enter stationary amount");
        double stationary=keyboard.nextDouble();
        System.out.println("Enter the tuition amount");
        double tuition=keyboard.nextDouble();
        System.out.println("");

        // total loan
        double loanAmount=(subsistence+stationary+tuition);
        String account1= "UG"+number1+number2+number3;

        System.out.println("***************************");

        System.out.println("");
        System.out.println("name : " + "  " + name );
        System.out.println("");
        System.out.println("year of study : " + program);
        System.out.println("");
        System.out.println("subsistence amount : " + subsistence + " MK");
        System.out.println("");
        System.out.println("Stationary mount : " + stationary + "MK");
        System.out.println("");
        System.out.println("tuition fee amount : " + tuition + "Mk");
        System.out.println("");
        System.out.println("account number : " + accountnumber);


        System.out.println("");
        System.out.println("----------------------------------------");
        
        System.out.println("Account number : " + accountnumber + "\n\nTotal loan amount: " + loanAmount);
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("...........ENTER YOUR CHOICE..........");
        System.out.println("1.Apply loan");
        System.out.println("2. check account balance");
        System.out.println("3.create another");
        System.out.println("4.payback");

        int choice2= keyboard.nextInt();

        if(choice2==1){
          System.out.println("you have successfully applied for a loan");
           if(choice2==2){
             System.out.println("your account balance is" + loanAmount);
             
           }
        }
        else if(choice2==2){
          System.out.println("currently your balance is 0.00");
        }
        else if (choice==3){
          System.out.println("loading");
        }

      }}
       
     else if(choice==2){
       System.out.println("***********WELCOME TO POSTGRADUATE ACCOUNT*******");
       System.out.println("--------------------------------------------------");
       System.out.println("1. Create account");
       System.out.println("2. Apply loan");
       System.out.println("3. Check balance");
       System.out.println("4. Exit");

       int choice2=keyboard.nextInt();
       if(choice2==1){

          // creating postgraduate account
          System.out.println("Enter your name:");
          String name=keyboard.next();
          System.out.println("Enter year of study:");
          int year1=keyboard.nextInt();
          System.out.println("Enter the program:");
          String program1=keyboard.next();
          System.out.println("Enter subsistence amount:");
          double subsistence=keyboard.nextDouble();
          System.out.println("Enter tuition:");
          double tuition1=keyboard.nextDouble();
          System.out.println("Enter the research grant:");
          double researchGrant=keyboard.nextDouble();
          if( researchGrant >100000){
            System.out.println("invalid, enter again:");
            researchGrant=keyboard.nextDouble();

          }
          else if(researchGrant<50000){
            System.out.println("invalid, enter again");
          }
          double loanAmount=(subsistence+tuition1);
          double balance=(loanAmount+researchGrant);

          // showing account 
          String account2="PG" + number1+number2+number3;
          System.out.println("");
          PGaccount y= new PGaccount();
        
          System.out.println("SUCCESSFULLY CREATED POSTGRADUATE ACCOUNT ");

          // 
          System.out.println("**************************************");
          System.out.println("");
          System.out.println("name: " + " " + name);
          System.out.println("");
          System.out.println("Year of study:" + year1);
          System.out.println("");
          System.out.println("Program:" + program1);
          System.out.println("");
          System.out.println("Subsistence amount:" + subsistence);
          System.out.println("");
          System.out.println("Researchgrant: " + researchGrant);
          System.out.println("");
          System.out.println("Tuition fee:" + tuition1);

          System.out.println("");
          System.out.println("----------------------------------------------");
          System.out.println("Account number:" + " " + account2+ "\n\nTotal loan amount is " + loanAmount);
          System.out.println("***********************************************");
          System.out.println("");
          System.out.println("*********ENTER YOUR CHOICE***********");
          System.out.println("1. Apply loan");
          System.out.println("2.Check account balance");
          System.out.println("3.Create another account");
          System.out.println("4. payback");

          
            
          }
         
         
       }
     }


  }
  
  
