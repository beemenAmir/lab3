import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM a;
    @BeforeEach
    public void init() {
        a = new ATM();

    }
@Test
    void atmStub(){
    a.setBalance(3000);
    assertEquals(a.operation(1,2000),5000);
    assertEquals(a.operation(2,3000),2000);
}
@Test
    void withdrawStub(){
        a.setBalance(2000);
        assertEquals(a.withdraw(1000),1000);
}
    @Test
    void depositStub(){
        a.setBalance(2000);
        assertEquals(a.deposit(1000),3000);
    }

}