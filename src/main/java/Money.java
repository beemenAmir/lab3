public class Money {
int m = 0;
void increaseMoney(){
    m++;
}
void decreaseMoney(){
        m--;
    }
boolean isEmpty(){
   if(m>0){
       return true;
   }else{
       return false;
   }
}

}
