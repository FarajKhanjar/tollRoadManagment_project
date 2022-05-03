package tollRoadManagement.tollManagement;

import tollRoadManagement.classes.Car;

public class Runner {

	public static void main(String[] args) 
	{
		TollManagement manage1 = new TollManagement();
		manage1.addCheckPoints();
		manage1.addCars();
		System.out.println("Welcome to "+manage1.roadName+" !");
		System.out.println("Here you can show the toll Management for today\n");

		System.out.println(manage1.toString());
		
	}

}
