public class Bankacc{
    String accountNum;
    String accountholder;
    double balence;
//Constuctor 
    Banckacc(String accontNum,String accountholder){
        this.accountNum=accontNum;
        this.accountholder=accountholder;
        this.balence=0;
    }
    //deposit
    public void deposit(double amount){
        if(amount>0){
            balence+=amount;
            System.out.println("Transcation is succsfully completed");
            System.out.println("________________________________________");
            System.out.println("Your balence is :: "+balence);


        }else{
            System.out.println("________________________________________");
            System.out.println("Invalid Amont place enter right amount");
        }
    }
    public void withdraw(double amount){
        if(balence>=amount){
            baleance-=amount;
            System.out.println("Your transaction is succusfully completed");
            System.out.println("__________________________________________");
            System.out.println("your current accont ballence is :: "+balence);
        }else{
            System.out.println("Your can not get this Money");
        }
    }
    public void display(){
        System.out.println("____________________________________");
        System.out.println("Your accont corent balence is :: "+balence);
    }
}