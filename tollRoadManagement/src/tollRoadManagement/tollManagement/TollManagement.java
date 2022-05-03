package tollRoadManagement.tollManagement;

import java.util.ArrayList;
import java.util.LinkedList;

import tollRoadManagement.classes.Car;
import tollRoadManagement.classes.CheckPoint;

public class TollManagement 
{	
	public final String roadName = "Road 6";
	
	ArrayList<Car> cars = new ArrayList<Car>();

    //Create checkPoints 	
	LinkedList<CheckPoint> checkPoints_1 = new LinkedList<CheckPoint>();
	LinkedList<CheckPoint> checkPoints_2 = new LinkedList<CheckPoint>();
	LinkedList<CheckPoint> checkPoints_3 = new LinkedList<CheckPoint>();
	LinkedList<CheckPoint> checkPoints_4 = new LinkedList<CheckPoint>();
	LinkedList<CheckPoint> checkPoints_5 = new LinkedList<CheckPoint>();
	 
	//Create 5 cars 
	Car focus = new Car(7307313, "Ford", "Focus", "red", checkPoints_1);
	Car auris = new Car(50774485, "Toyota", "Auris", "blue", checkPoints_2);
	Car golf = new Car(21222555, "Volkswagen", "Golf", "green", checkPoints_3);
	Car astra = new Car(34222555, "Opel", "Astra", "gray", checkPoints_4);
	Car leon = new Car(70187111, "Seat", "Leon", "red", checkPoints_5);

	
	public void addCheckPoints() 
	{
		CheckPoint checkPoint_1 = new CheckPoint("HaNegev Junction", "Ir HaBahadim", 1);
		CheckPoint checkPoint_2 = new CheckPoint("Nevatim Interchange", "Nevatim", 2);
		CheckPoint checkPoint_3 = new CheckPoint("Shoket Interchange", "Tel Shoket", 3);
		CheckPoint checkPoint_4 = new CheckPoint("Lehavim Interchangee", "Lehavim", 4);
		CheckPoint checkPoint_5 = new CheckPoint("Rahat Interchange", "Rahat", 5);
		checkPoints_1.add(checkPoint_1);
		checkPoints_1.add(checkPoint_2);
		checkPoints_1.add(checkPoint_3);
		checkPoints_1.add(checkPoint_4);
		checkPoints_1.add(checkPoint_5);

		CheckPoint checkPoint_6 = new CheckPoint("Devira Interchange", "Dvir", 6);
		CheckPoint checkPoint_7 = new CheckPoint("Kama Interchang", "Beit Kama", 7);
		CheckPoint checkPoint_8 = new CheckPoint("Ma'ahaz Interchange", "Beit Kama", 8);
		checkPoints_2.add(checkPoint_4);
		checkPoints_2.add(checkPoint_5);
		checkPoints_2.add(checkPoint_6);
		checkPoints_2.add(checkPoint_7);
		checkPoints_2.add(checkPoint_8);

		CheckPoint checkPoint_9 = new CheckPoint("Kiryat Gat Interchange", "Kiryat Gat", 9);
		CheckPoint checkPoint_10 = new CheckPoint("Sorek Interchang", "Yad Binyamin", 10);
		checkPoints_3.add(checkPoint_7);
		checkPoints_3.add(checkPoint_8);
		checkPoints_3.add(checkPoint_9);

		checkPoints_4.add(checkPoint_7);
		checkPoints_4.add(checkPoint_8);
		checkPoints_4.add(checkPoint_9);
		checkPoints_4.add(checkPoint_10);

		CheckPoint checkPoint_11 = new CheckPoint("Hulda Interchange", "Hulda", 11);
		CheckPoint checkPoint_12 = new CheckPoint("Nesharim Interchange", "Ramla", 12);
		checkPoints_5.add(checkPoint_6);
		checkPoints_5.add(checkPoint_7);
		checkPoints_5.add(checkPoint_8);
		checkPoints_5.add(checkPoint_9);
		checkPoints_5.add(checkPoint_10);
		checkPoints_5.add(checkPoint_11);
		checkPoints_5.add(checkPoint_12);
		
		addCars();
	}
	
	public void addCars()
	{	    
		cars.add(focus);
		cars.add(auris);
		cars.add(golf);
		cars.add(focus);
		cars.add(focus);
	}

	@Override
	public String toString() 
	{
		return "1) " + focus + "\n   " + checkPoints_1+"\n"
				+"2) " + auris + "\n   " + checkPoints_2+"\n"
				 +"3) " + golf + "\n   " + checkPoints_3+"\n"
				  +"4) " + astra + "\n   " + checkPoints_4+"\n"
				   +"5) " + leon + "\n   " + checkPoints_5+"\n";
	}
}
