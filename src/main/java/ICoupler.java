/**
 * 
 */

/**
 * @author mateusmolina
 *
 */
public interface ICoupler {
	// Get force based on deflection (dx)
	public void getF(float dx);
	
	// Get default length (L0)
	public float getL0();
	
	
	
}
