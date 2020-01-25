
public class Car implements ShowInfo {
	private Integer id;
	private String vendor;
	private String model;
	private Integer year;
	private String color;
	private double price;
	private String number;
	
	public Car(Integer id, String vendor, String model,
			Integer year, String color, double price, String number) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.number = number;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.printf(
				"id: %s\tvendor: %s\tmodel: %s\nyear: %s\tcolor: %s\tprice: %s\nnumber: %s\n", 
				id, vendor, model, year, color, price, number);
	}
	
	
}
