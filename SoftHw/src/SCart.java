import java.util.ArrayList;
import java.util.List;

public class SCart {
	private List<Book> BookList = new ArrayList<>();
	private double totalCartValue;
	public int getbookCount() {
		// TODO Auto-generated method stub
		return BookList.size();
	}

	public double getTotalCartValue() {
		// TODO Auto-generated method stub
		if (BookList.size() > 0) {
			for (Book book : BookList) {
				totalCartValue = totalCartValue + book.getTotalPrice();
			}
		}
		return totalCartValue;
	}

	public void add(Book java) {
		// TODO Auto-generated method stub
		BookList.add(java);
	}

}
