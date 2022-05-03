package tollRoadManagement.classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Car 
{
	//Fields
	protected final long plateNumber;
	protected String type;
	protected String model;
	protected String color;
    protected static LinkedList<CheckPoint> checkPoints = new LinkedList<CheckPoint>();
	
    public Car(long plateNumber, String type, String model, String color,LinkedList<CheckPoint> checkPoints) 
    {
		this.plateNumber = plateNumber;
		this.type = type;
		this.model = model;
		this.color = color;
		setCheckPoints(checkPoints);
	}

	private long getPlateNumber() 
	{
		return plateNumber;
	}

	private String getType() 
	{
		return type;
	}

	private String getModel() 
	{
		return model;
	}

	private String getColor() 
	{
		return color;
	}

	public static LinkedList<CheckPoint> getCheckPoints() 
	{
		return checkPoints;
	}

	private void setType(String type) 
	{
		this.type = type;
	}

	private void setModel(String model) 
	{
		this.model = model;
	}

	private void setColor(String color) 
	{
		this.color = color;
	}

	public void setCheckPoints(LinkedList<CheckPoint> checkPoints) 
	{
		this.checkPoints = checkPoints;
	}

	@Override
	public String toString() {
		return "plateNumber=" + plateNumber + ", type=" + type + ", model=" + model + ", color=" + color
				+ "\n   checkPoints=";
	}
    
	
}
