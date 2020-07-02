package beans;
public class Product {
	private ProductType type; // Drink (3x4), Food (3x4), Toy (3)
	private Long id;
	private String name;
	private String description;
	private ProductSize size; // small. medium, large
	private Category category; // Elite, Street, Diet, Organic
	private ProductExtra extra; // sardine oil, whale oil, tuna oil
	private int[] prices = new int[6];
	public Product(ProductType type, String name, String description, ProductSize size, int[] prices, Category category, ProductExtra extra) {
		this.type = type;
		this.name = name;
		this.description = description;
		this.size = size;
		this.prices = prices;
		this.extra = extra;
	}
	public Product() {}
	public Category getCategory() { return category; }
	public void setCategory(Category category) { this.category = category; }
	public ProductType getType() { return type; }
	public void setType(ProductType type) { this.type = type; }
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public ProductSize getSize() { return size; }
	public void setSize(ProductSize size) { this.size = size; }
	public int[] getPrices() {
		// base price + size price + extra price
		return prices;
	}
	public void setPrices(int[] prices) { this.prices = prices; }
	public ProductExtra getExtra() { return extra; }
	public void setExtra(ProductExtra extra) { this.extra = extra; }
}