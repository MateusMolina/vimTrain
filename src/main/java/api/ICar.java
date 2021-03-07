package api;

public interface ICar {
	
	
	// get default length (L0)
	public double getL0();
	
	// get default mass (M0)
	public double getM0();
	
	public void setCouplers(ICoupler[] couplers);
	
	// get total retardative force based on current published sensors' values
	public double getF();
	
	// get a list of the two installed couplers (0:before, 1:after)
	public ICoupler[] getCouplers();
	
	// get a list of sensors installed in the car
	public ISensor[] getSensors();
	
	// Mandatory Sensors
	// * Displacement
	public ISensor getSensorX();
	
	// * Odometer
	public ISensor getSensorOdometer();

}
