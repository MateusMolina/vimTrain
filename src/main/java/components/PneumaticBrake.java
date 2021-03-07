package components;
/**
 * 
 */

import api.IBrake;
import api.ISensor;

/**
 * @author mateusmolina
 *
 */
public class PneumaticBrake implements IBrake {
	protected ISensor SensorManGP = new GeneralSensor(GeneralSensor.MANOMETER, "MAN_GP");
	protected ISensor SensorManMainRes = new GeneralSensor(GeneralSensor.MANOMETER, "MAN_MAINRES");
	protected ISensor SensorManEmerRes = new GeneralSensor(GeneralSensor.MANOMETER, "MAN_EMERRES");

	// MainRes
	private double MainResP = 0; 
	private double MainResV = 0.7; //m³
	
	// EmerRes
	private double EmerResP = 0;
	private double EmerResV = 0.7; //m³
	
	// Triple Valve	
	private int TripleValvePos = 0;
	private int RelievePos = 0;
	
	// Cylinder Pars.
	private double CylArea = 0.3; //m³
	
	// Mechanical Pars.
	private double Leverage = 5.0;
	private double FrictionCoef = 0.3;
	
	
	public double getF() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	private double 
	

}
