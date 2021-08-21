package br.eng.mam.vimtrain.api.system.internal;



/**
 * @author mateus
 *
 * REQ
 * - Should store a single numeric value
 * - Should have a ENUM to identify its type externally
 */
public interface IProperty {
	
	public enum Type {
		VPOS,
		VVEL,
		VACC,
		PRESSURE,
		MASS
		
	}
	
	public void setValue(Object value);
	
	public Object getValue();
}
