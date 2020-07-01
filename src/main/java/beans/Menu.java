package beans;
import java.util.List;
public class Menu { // 1 menu for each category, displayed after clicking on the welcome page page
	private List<Product> products;
	private List<Formula> formulas;
	public Menu(List<Product> products, List<Formula> formulas) {
		this.products = products;
		this.formulas = formulas;
	}
	public Menu() {}
	public List<Product> getProducts() { return products; }
	public void setProducts(List<Product> products) { this.products = products; }
	public List<Formula> getFormulas() { return formulas; }
	public void setFormulas(List<Formula> formulas) { this.formulas = formulas; }
}