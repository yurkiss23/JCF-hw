
public class Goods implements ShowInfo{
	private String name;
	private double price;
	private boolean available;
	
	public Goods(String name) {
		super();
		this.name = name;
	}
	public Goods(String name, double price, boolean available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("show info goods: " + this.name);
	}
	
	
}
