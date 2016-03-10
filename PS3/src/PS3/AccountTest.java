package PS3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	Account a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testWithdraw() {
		double bal = 20000 - 2500;
		try {
			System.out.println("\nWithdrawing $100...");
			a.withdraw(2500.00);
			System.out.println("\nWithdrawing $600...");
			a.withdraw(100000.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
		assertEquals(a.getBalance(), bal, 0.01);
	}

	@Test
	public void testDeposit() {
		double bal = a.getBalance();
		a.deposit(3000);
		assertEquals(a.getBalance(), bal + 3000, 0.01);
	}

	@Test
	public void testPrint() {
		System.out.println(a.getBalance());
		System.out.println(a.getMonthlyInterestRate());
		System.out.println(a.getDateCreated());
	}

	@Test
	public void addCoverage() {
		Account a = new Account();
		a.setid(1);
		a.getid();
		a.setBalance(100);
		a.getAnnualInterestRate();
	}
}
