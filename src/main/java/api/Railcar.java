/**
 * 
 */
package api;

/**
 * @author mateusmolina
 *
 */
import components.GeneralSensor;
import components.PneumaticBrake;

public abstract class Railcar implements ICar {
	
	protected ICoupler[] Couplers;
	protected IBrake PneumaticBrake = new PneumaticBrake();
	protected ISensor SensorX = new GeneralSensor(GeneralSensor.DISPLACEMENT, "DISPLACEMENT1");
	protected ISensor SensorOdometer = new GeneralSensor(GeneralSensor.ODOMETER, "ODOMETER1");
	
	
	// Pars
	private double M0;
	private double M;
	
	public Railcar(double M0) {
		this.M0 = M0;
		this.M = M0;
	}
	
	// Mass controllers
	public void loadCar(double loadMass) {
		this.M += loadMass;
	}
	
	public double getM0() {
		// TODO Auto-generated method stub
		return M0;
	}
	public double getM() {
		// TODO Auto-generated method stub
		return M;
	}
	
	public double getL0() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCouplers(ICoupler[] couplers) {
		// TODO Auto-generated method stub

	}

	public double getF() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ICoupler[] getCouplers() {
		// TODO Auto-generated method stub
		return null;
	}

	public ISensor[] getSensors() {
		// TODO Auto-generated method stub
		return null;
	}

	public ISensor getSensorX() {
		// TODO Auto-generated method stub
		return this.SensorX;
	}

	public ISensor getSensorOdometer() {
		// TODO Auto-generated method stub
		return this.SensorOdometer;
	}

	public IBrake getPneumaticBrake() {
		return PneumaticBrake;
	}

}
