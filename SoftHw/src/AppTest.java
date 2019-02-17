
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
// test case 1 
	@Test
	public void testcreateEmptyShopcart() {
	//creating empty cart 
		SCart cart = new SCart ();
		Assert.assertEquals(0, cart.getbookCount());
	}
//test case 2
	@Test
	public void testaddonebook() {
	SCart cart = new SCart();
	Book java = new Book(1,"Java Book", 127.0);
	cart.add(java);
	Assert.assertEquals(1, cart.getbookCount());
	Assert.assertEquals(127.0, cart.getTotalCartValue(),0.0);
	}
	 // test case 3 
	@Test
	public void testaddtwobook() {
	SCart cart = new SCart();
	Book java = new Book(1,"Java Book", 127.0);
	Book Web = new Book(1,"Web Book", 100.0);
	cart.add(java);
	cart.add(Web);
	Assert.assertEquals(2, cart.getbookCount());
	Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
}
