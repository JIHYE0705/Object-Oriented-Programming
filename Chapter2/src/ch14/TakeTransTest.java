package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		
		Subway greenSubway  = new Subway(2);
			
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		bus500.showBusInfo();
		
		Student studentE = new Student("Edward", 20000);
		Taxi taxi = new Taxi("잘나간다 운수");
		studentE.takeTaxi(taxi, 10000);
		
		studentE.showInfo();
		taxi.showTaxiInfo();
		
		
		
	}

}
