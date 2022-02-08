public class UGaccount{

    // private instance variables
    private double substistence=0.11;
    private double stationaryRate=0.15;

    // constructors

    public UGaccount(){

    }
    public UGaccount(double substistence, double stationaryRate, double tuitionRate, double loanAmount, int yearOfStudy, String name, String program, int accountNumber){

        // invoke superclass' constructor
        super();
            this.substistence=substistence;
            this.stationaryRate=stationaryRate;

        }
      // public UGaccount(){
          //  super(double tuitionRate,double loanAmount,int yearOfStudy,String name,String program,int accountNumber);
          //this.substistence=substistence;
         // this.stationaryRate=stationaryRate;
      // }
        // getters and setters
        public double getSubstistence(){
            return substistence;
        }
        public double getStationaryRate(){
            return stationaryRate;
        }
       
        public String toString(){
            return "This is Undergraduate account";
        }
    }
