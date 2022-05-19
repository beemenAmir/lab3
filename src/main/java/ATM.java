public class ATM {
    double balance = 0;
    void setBalance(double x){
        balance = x;
    }
    double withdraw(double w){
        return balance-=w;
    }
    double deposit(double d){
        return balance+=d;
    }
    double operation(int x, double amount){
        if(x == 1){
            balance = deposit(amount);
        }else if(x==2) {
            balance = withdraw(amount);
        }
return balance;
    }
}
