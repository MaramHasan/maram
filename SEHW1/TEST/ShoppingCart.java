
import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart {
 
	
	private List<Product> productList = new ArrayList<>();
	private double totalCartValue;
	// ÚÇÓÇÓ äÚÑÝ ÚÏÏ ÇáßÊÈ Çááí ÇÔÊÑíäÇåã 
	public int getProductCount() {
		return productList.size();
	}
 
	// ÈÏí ÇÖíÝ Úáì ÇáÔæÈäÛ ßÇÑÊ ßÊÇÈ ÌÏíÏ
	public void addProduct(Product product) {
		productList.add(product);
	}
	// áÍÊì ÇÑÌÚ ÇáÓÚÑ Çáßáí ááßÊÈ Çááí ÈÇáÔæÈäÌ ßÇÑÊ ÊÇÚÊí 
	public double getTotalCartValue() {
		if (productList.size() > 0) {
			for (Product product : productList) {
				totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		return totalCartValue;
}
}