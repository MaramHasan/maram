
import org.junit.Assert;
import org.junit.Test;
 
public class ShoppingCartAppTest {
	@Test
	// creating empty shopping cart
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();// create object of shopping cart
		Assert.assertEquals(0, cart.getProductCount()); // 
	}
	// adding one book 
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("Java Book", 1, 127.0); // create object of book (name , quantity , price) 
		cart.addProduct(product); // ÷›‰« «·ﬂ «» ⁄ «·‘Ê»‰Ã ﬂ«—  
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(127.0, cart.getTotalCartValue(),0.0);
	}
// adding other book 	
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product java = new Product("java Book", 1, 127.0);// «·«Ê·
		Product web = new Product("Web design Book", 1, 100.0);//«·À«‰Ì
		cart.addProduct(java);
		cart.addProduct(web);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
}
