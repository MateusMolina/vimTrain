/**
 * 
 */

/**
 * @author mateusmolina
 *
 */
public interface ISensor {
	// General PUB Sensor implementation
	public void pub(float value);
	
	// Reads the last published value
	public float read();

}
