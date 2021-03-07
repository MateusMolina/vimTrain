/**
 * 
 */
package components;

import api.ISensor;

/**
 * @author mateusmolina
 *
 */
public class GeneralSensor implements ISensor {
	
	public static final int DISPLACEMENT = 0;
	public static final int ODOMETER = 1;
	public static final int MANOMETER = 2;
	public static final int ACCELEROMETER = 3;
	public static final int DYNAMOMETER = 4;
	
	private int SensorType;
	
	private double LastPubValue;
	
	public GeneralSensor(int SensorType, String ID) {
		this.SensorType = SensorType;
		
	}

	public void pub(double PubValue) {
		this.LastPubValue = PubValue;

	}

	public double read() {
		return this.LastPubValue;
	}

	public float getSensorType() { return this.SensorType; }
}
