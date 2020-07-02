package beans;
import java.util.List;
public class Order {
	private Long idOrder;
	private Long primaryKeyId;
	private OrderState state;
	private List<Product> products;
	private List<Formula> formulas;
	private String specialRequest;
	private Boolean delivery = true; // true = take away, false = on site
	public Order(Long idOrder, OrderState state, List<Product> products, List<Formula> formulas, String specialRequest, Boolean delivery) {
		this.idOrder = idOrder;
		this.state = state;
		this.products = products;
		this.formulas = formulas;
		this.specialRequest = specialRequest;
		this.delivery = delivery;
	}
	public Order() {}
	public Long getPrimaryKeyId() { return primaryKeyId; }
	public void setPrimaryKeyId(Long primaryKeyId) { this.primaryKeyId = primaryKeyId; }
	public Long getIdOrder() { return idOrder; }
	public void setIdOrder(Long idOrder) { this.idOrder = idOrder; }
	public OrderState getState() { return state; }
	public void setState(OrderState state) { this.state = state; }
	public List<Product> getProducts() { return products; }
	public void setProducts(List<Product> products) { this.products = products; }
	public List<Formula> getFormulas() { return formulas; }
	public void setFormulas(List<Formula> formulas) { this.formulas = formulas; }
	public String getSpecialRequest() { return specialRequest; }
	public void setSpecialRequest(String specialRequest) { this.specialRequest = specialRequest; }
	public Boolean getDelivery() { return delivery; }
	public void setDelivery(Boolean delivery) { this.delivery = delivery; }
}