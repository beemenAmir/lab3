public class CoffeeMachine {
Money money = new Money();
Coffee coffee = new Coffee();
String states="idle";
void Refill(int s){
    coffee.restock(s);
}
String makeCoffee(){
    money.increaseMoney();
    switch(states){
        case "idle":
            if(!money.isEmpty()){
                states = "idle";
                return "please insert money to receive coffee";
            }else{
                states = "busy";
            }

        case "busy":
            if(coffee.checkStock()) {
                coffee.decreaseStock();
                money.decreaseMoney();
                return"enjoy your coffee, have a  great day";
            }else{
                money.decreaseMoney();
                return "the machine is out of coffee, please take your money";

            }
        default:
            return "";
    }
}

}
