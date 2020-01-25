
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("123");
		
		Car[] cars =
			{
				new Car(1, "bmw", "m3", 2002, "blue", 20000, "qw1234as"),
				new Car(2, "bmw", "m5", 2004, "red", 35000, "qw4567as"),
				new Car(3, "audi", "a8", 2006, "grey", 40000, "qw7894as")
			};
		
		CarsOfVendor(cars);
		CarsOfModelBigAge(cars);
		CarsOfYearBigPrice(cars);
		
	}
	
	private static void CarsOfVendor(Car[] cars) {
		System.out.println("---carList of 'audi'---\n");
		for (Car car : cars) {
			if (car.getVendor() == "audi") {
				car.Show();
			}
		}
	}
	
	private static void CarsOfModelBigAge(Car[] cars) {
		System.out.println("\n---carList of 'm5' older 2 years---\n");
		for (Car car : cars) {
			if (car.getModel() == "m5" && car.getYear() < 2018) {
				car.Show();
			}
		}
	}
	
	private static void CarsOfYearBigPrice(Car[] cars) {
		System.out.println("\n---carList of year, price bigger 15000---\n");
		for (Car car : cars) {
			if (car.getYear() == 2002 && car.getPrice() > 10000) {
				car.Show();
			}
		}
	}
	
}
