import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Goods> goods = new ArrayList<Goods>();
		goods.add(new Goods("g1"));
		goods.add(new Goods("g2"));
		goods.add(new Goods("g3"));
		goods.add(new Goods("g4"));
		for (Goods gs : goods) {
			gs.Show();
		}
		
		Client c1 = new Client("c1@c.c", "c1", "c1");
		
		Tray t = new Tray(goods.get(1), 3, goods.get(1).getPrice());
		Email e = new Email("qwe", "asd");
		t.Order(c1, e);
		
//		Goods g = new Goods("qwe", 123, true);
//		g.Show();
//		e.Show();
	}

}
