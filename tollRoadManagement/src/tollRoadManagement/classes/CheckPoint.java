package tollRoadManagement.classes;

public class CheckPoint 
{
	
	//Fields
	public String name;
	public String address;
	public int positionNumber;
	public final int price = 5;
	
	public CheckPoint(String name, String address, int positionNumber) 
	{
		setName(name);
		setAddress(address);
		setPositionNumber(positionNumber);
	}
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public int getPositionNumber() 
	{
		return positionNumber;
	}

	public void setPositionNumber(int positionNumber) 
	{
		this.positionNumber = positionNumber;
	}
	
	public int getPrice() 
	{
		return price;
	}


	@Override
	public String toString() 
	{
		return "[name=" + name + ", address=" + address + ", positionNumber=" + positionNumber + ", price="
				+ price + "]\n";
	}
	
	


}
