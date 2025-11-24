package ie.atu;

import ie.atu.week9.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp()
    {
        account = new BankAccount();
    }

    @Test
    void constructorInitialisation()
    {
        account = new BankAccount("ACC12345", "Daniel", 500);
        assertEquals("ACC12345", account.getAccNo());
        assertEquals("Daniel", account.getName());
        assertEquals(500, account.getBalance());
    }

    @Test
    void constructorNegativeInitialisation()
    {
        Exception ex = assertThrows(IllegalArgumentException.class,()-> new BankAccount("ACC12345", "Daniel", -1));
        assertEquals("Balance must be greater than 0.", ex.getMessage());
    }

// start of 2

    @Test
    void depositPositive() {
        account = new BankAccount("ACC12345", "Daniel", 500);
        account.deposit(100);
        assertEquals(600, account.getBalance());
    }




}
