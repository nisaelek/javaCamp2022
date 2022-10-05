package classesWithAttributes;

public class Product {
	public Product() {
		System.out.println("Yapıcı blok cağırıldı.");
	}
	// this içinde bulunduğum class demek
//Attribute //field
	private String name;
	private int id;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	public String getKod() {
		return this.name.substring(0,1)+id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
}
