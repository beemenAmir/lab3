import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {
    CoffeeMachine c;
    Money m;
    Coffee ce;
    @BeforeEach
    public void init() {
        c = new CoffeeMachine();
        m = new Money();
        ce = new Coffee();
    }

    @Test
    public void coffeeMachineStub(){
        c.Refill(1);
        c.money.increaseMoney();
        assertEquals(c.coffee.stock,2);
        assertEquals(c.makeCoffee(),"enjoy your coffee, have a  great day");
        assertEquals(c.makeCoffee(),"enjoy your coffee, have a  great day");
        assertEquals(c.makeCoffee(),"the machine is out of coffee, please take your money");


    }

    @Test
    public void CoffeeDriver(){
        ce.restock(2);
        assertTrue(ce.checkStock());

    }
    @Test
    public void MoneyDriver(){
        m.increaseMoney();
        m.decreaseMoney();
        assertFalse(m.isEmpty());

    }
    @AfterEach
    public void clean(){
        c=null ;
    }
}