package business;
import java.util.Set;
import beans.Formula;
import beans.Product;
public class Basket {
	private Set<Product> products;
	private Set<Formula> formulas;
	public void addProduct(Product product) {}
	public void removeProduct(Product product) {}
	public Set<Product> getProducts() { return products; }
	public void addFormula(Formula formula) {}
	public void removeFormula(Formula formula) {}
	public Set<Formula> getFormulas() { return formulas; }
}