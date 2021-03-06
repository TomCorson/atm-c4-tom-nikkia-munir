import java.util.HashMap;

public class User {
    public static Integer pin;
    public static String name;
    public static Checking checking = new Checking();
    public static Saving savings = new Saving();
    public static Investment investment = new Investment();
    private boolean hasCheck = false;
    private boolean hasSavings = false;
    private boolean hasInvestment = false;
    public User(String name, Integer pin) {
        this.name = name;
        this.pin = pin;

    }
    public void setHasChecking(boolean b){
        this.hasCheck = b;
    }
    public boolean getHasChecking(){
        return this.hasCheck;
    }
    public void setHasSavings(boolean b){
        this.hasSavings = b;
    }
    public boolean getHasSavings(){
        return this.hasSavings;
    }
    public void setHasInvestment(boolean b){
        this.hasInvestment = b;
    }
    public boolean getHasInvestment(){
        return this.hasInvestment;
    }

    public User() {
    }
    public Double getCheckingBalance() {
        return checking.getBalance();
    }
    public double checkingWithdraw(double withdraw){
        return checking.removeBalance(withdraw);
    }
    public void checkingDeposit(double deposit){
        checking.setBalance(deposit);
    }

    public Double getSavingBalance() {
        return savings.getBalance();
    }

    public double savingsWithdraw(double withdraw){
        return savings.removeBalance(withdraw);
    }

    public void savingsDeposit(double deposit) { savings.setBalance(deposit);}


    /**
     *
     * investment methods
     */



    public Double getInvestmentBalance() {
        return investment.getBalance();
    }
    public double investmentWithdraw(double withdraw){
        return investment.removeBalance(withdraw);
    }
    public void investmentDeposit(double deposit){
        investment.setBalance(deposit);
    }


    public String toString() {
        return "User name: " + this.name + "\nUser pin: " + this.pin;
    }

    public String closeCheck(){
       if(checking.getBalance() == 0){
           return "Account successfully closed";
       }
       else {
           return "Please withdraw all funds from your account before closing";
       }
    }
    public String closeSaving(){
        if(savings.getBalance() == 0){
            return "Account successfully closed";
        }
        else {
            return "Please withdraw all funds from your account before closing";
        }
    }
    public String closeInvestment(){
        if(investment.getBalance() == 0){
            return "Account successfully closed";
        }
        else {
            return "Please withdraw all funds from your account before closing";
        }
    }
}
