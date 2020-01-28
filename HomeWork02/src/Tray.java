
public class Tray implements ShowInfo, OrderService{
	private Goods goods;
	private Integer amount;
	private double price;
	
	public Tray(Goods goods, Integer amount, double price) {
		super();
		this.goods = goods;
		this.amount = amount;
		this.price = price;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("show info tray: " + this.goods);
	}
	@Override
	public void SendMail(Email e) {
		// TODO Auto-generated method stub
		System.out.println("----");
		System.out.println("subject: " + e.getSubject() + "\nbody: " + e.getBody());
	}
	@Override
	public void SetOrder() {
		// TODO Auto-generated method stub
		System.out.println("----");
		System.out.println("your order:" + this.goods.getName() + "\namount: " + this.getAmount() + "\tprice: " + this.getPrice());
		double all = this.getPrice()*this.getAmount();
		System.out.println("in all: " + all);
	}
	
	public void Order(Client client, Email email){
		System.out.println("from: 'from'\tto: " + client.getEmail());
		SendMail(email);
		SetOrder();
	}
}
