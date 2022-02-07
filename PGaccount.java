public class PGaccount{

    private double substistence=0.15;
    private double researchgrant;

// constructors
  public PGaccount(){

  }
  public PGaccount(double substistence, double researchgrant, double tuitionRate, double loanAmount, int yearOfStudy, String name, String program, int accountNumber){

     // invoke superclass' constructor
        super();
            this.substistence=substistence;
            this.researchgrant=researchgrant;
}
public double getSubstistence(){
    return substistence;
}
public double getResearchgrant(){
    return researchgrant;
}
public void setResearchgrant(double researchgrant){
    this.researchgrant=researchgrant;
}
public String toString(){
    return "This is postgraduate account";
}
}