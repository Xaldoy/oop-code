package hr.fer.oop;

public class BankReceivingSystem implements ReceivingSystem{
	
	int urgentcount;
	int nonurgentcount;
	boolean employeebusy;
	public static int customercount;
	
	public BankReceivingSystem() {
		employeebusy = false;
		urgentcount = 0;
		nonurgentcount = 0;
		customercount = 0;
	}
	
	@Override
	public void customerArrived(boolean urgent) {
		customercount++;
		if(urgent)urgentcount++;
		else nonurgentcount++;
		calculateEmployeeStatus();
	}

	@Override
	public void customerLeft(boolean urgent) {
		if(urgent)urgentcount--;
		else nonurgentcount--;
		calculateEmployeeStatus();
	}

	@Override
	public void calculateEmployeeStatus() {
		if(urgentcount != 0 || nonurgentcount != 0)
			employeebusy = true; 
		else employeebusy = false;
	}

	@Override
	public int getUrgentListSize() {
		return urgentcount;
	}

	@Override
	public int getNonUrgentListSize() {
		return nonurgentcount;
	}

	@Override
	public boolean isEmployeeOccupied() {
		return employeebusy;
	}

	@Override
	public int getNumberOfArrivedCustomers() {
		return customercount;
	}

}
