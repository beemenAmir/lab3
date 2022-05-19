import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

        Watch watch = new Watch();
        char[] arr = {'a','b','a','d','c','a'};

        @Test
        void setStateTest() {
            assertEquals("NORMAL", watch.States(arr[0]));
            for(int i= 1; i<=3;i++){
                if(i==3){
                    assertEquals("NORMAL", watch.States(arr[i]));

                }else {

                    assertEquals("ALARM", watch.States(arr[i]));
                }


            }





            assertEquals("UPDATE", watch.States(arr[4]));



            assertEquals("NORMAL", watch.States(arr[5]));


        }
    }

