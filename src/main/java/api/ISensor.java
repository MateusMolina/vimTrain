package api;
/**
 * 
 */

/**
 * @author mateusmolina
 *
 */
public interface ISensor {
	// General PUB Sensor implementation
	public void pub(double value);
	
	// Reads the last published value
	public double read();

}
