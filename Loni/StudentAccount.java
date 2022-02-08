public class StudentAccount{

    // variables
    private double tuitionRate;
    private double loanAmount;
    private int yearOfStudy;
    private String name;
    private String program;
    private int accountNumber;

    // constructors

    public StudentAccount(){
        this.tuitionRate=0.1;
        this.loanAmount=loanAmount;
        this.yearOfStudy=yearOfStudy;
        this.name=name;
        this.program=program;
        this.accountNumber=accountNumber;
    }
    public StudentAccount(double tuitionRate, double loanAmount,int yearOfStudy, String name, String program,int accountNumber){
        this.tuitionRate=tuitionRate;
        this.loanAmount=loanAmount;
        this.yearOfStudy=yearOfStudy;
        this.name=name;
        this.program=program;
        this.accountNumber=accountNumber;
    }

    // getters and setters
    public double getTuitionRate(){
        return this.tuitionRate;
    }
    public double getLoanAmount(){
        return this.loanAmount;
    }
    public int getYearOfStudy(){
        return this.yearOfStudy;
    }
    public String getName(){
        return name;
    }
    public String getProgram(){
      return this.program;
   
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void SetAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy=yearOfStudy;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setProgram(String program){
        this.program=program;
    }

}