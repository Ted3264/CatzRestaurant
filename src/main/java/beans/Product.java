package beans;
public class Product {
	private String type; // Drink (3x4), Food (3x4), Toy (3)
	private Long id;
	private String name;
	private String description;
	private String size; // small. medium, large
	private String category; // Elite, Street, Diet, Bio
	private String extra; // sardine oil, whale oil, tuna oil
	private int[] prices = new int[6];
	public Product(String type, String name, String description, String size, int[] prices, String category) {
		this.type = type;
		this.name = name;
		this.description = description;
		this.size = size;
		this.prices = prices;
	}
	public Product() {}
	public String getCategory() { return category; }
	public void setCategory(String category) { this.category = category; }
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public String getSize() { return size; }
	public void setSize(String size) { this.size = size; }
	public int[] getPrices() {
		// base price + size price + extra price
		return prices;
	}
	public void setPrices(int[] prices) { this.prices = prices; }
	public String getExtra() { return extra; }
	public void setExtra(String extra) { this.extra = extra; }
}