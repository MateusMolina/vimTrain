
public interface ICar {
	
	// get default length (L0)
	public float getL0();
	
	// get default mass (M0)
	public float getM0();
	
	public void setCouplers(ICoupler[] couplers);
	
	// get total retardative force based on current published sensors' values
	public float getF();
	
	// get a list of sensors installed in the car
	public ISensor[] getSensors();
	
	// get a list of the two installed couplers (0:before, 1:after)
	public ICoupler[] getCouplers();
	
	// read current GP value through the GP Pressure Sensor
	public float getGPP();

}
