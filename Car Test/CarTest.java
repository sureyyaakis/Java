public class CarTest {
	
		public static void main(String[] args) {
			Car c1 = new Car("Ford","Taurus", 2007);
			System.out.println(c1);
			c1.setModel("Explorer");
			System.out.println(c1);
			
			Car car2 = new Car("Nissan", "Murano" , 2004);
			Car car3 = new Car("Infinity", "Mazda" , 2013);
			Car car4 = new Car("Toyota", "Corolla" , 1996);
			  
			car2.setModel("Altima");
			car2.setYear(1997);
			System.out.println(car2);
			
			car3.setMake("Hybrid");
			car3.setModel("Fiat");
			System.out.println(car3);
			
			car4.setYear(2018);
			System.out.println(car4);
			
		}
}
