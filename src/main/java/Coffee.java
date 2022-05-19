public class Coffee {
int stock=1;
void restock(int m){

    stock+=m;
}
void decreaseStock(){
    stock--;
    }
boolean checkStock(){
    if(stock>0){
        return true;

    }else{
        return false;
    }
}
}
