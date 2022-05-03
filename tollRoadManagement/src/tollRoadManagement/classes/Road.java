package tollRoadManagement.classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Road 
{
	protected final String name = "Road 6";
	protected LinkedList<CheckPoint> checkPoints = new LinkedList<CheckPoint>();
	protected ArrayList<Car> cars = new ArrayList<Car>();
	
	public Road(LinkedList<CheckPoint> checkPoints, ArrayList<Car> cars) 
	{
		this.checkPoints = checkPoints;
		this.cars = cars;
	}

	public LinkedList<CheckPoint> getCheckPoints() 
	{
		return checkPoints;
	}

	public void setCheckPoints(LinkedList<CheckPoint> checkPoints) 
	{
		this.checkPoints = checkPoints;
	}

	public ArrayList<Car> getCars() 
	{
		return cars;
	}

	public void setCars(ArrayList<Car> cars) 
	{
		this.cars = cars;
	}

	public String getName() 
	{
		return name;
	}

	
			
}
