package beans;
public class Formula {
	private Long idFormula;
	private Product drink;
	private Product food;
	private Category category;
	public Formula() {}
	public Formula(Product drink, Product food, Category category) {
		this.drink = drink;
		this.food = food;
		this.category = category;
	}
	public Long getIdFormula() { return idFormula; }
	public void setIdFormula(Long idFormula) { this.idFormula = idFormula; }
	public Product getDrink() { return drink; }
	public void setDrink(Product drink) { this.drink = drink; }
	public Product getFood() { return food; }
	public void setFood(Product food) { this.food = food; }
	public Category getCategory() { return category; }
	public void setCategory(Category category) { this.category = category; }
}