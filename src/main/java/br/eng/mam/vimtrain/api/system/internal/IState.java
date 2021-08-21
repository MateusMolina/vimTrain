package br.eng.mam.vimtrain.api.system.internal;

import java.util.Map;

/**
 * @author mateus
 * 
 * REQ
 * - Must store multiple variables
 * - The variables should be accessible independent to each other
 */
public interface IState {
	
	public void addProp(IProperty.Type proptype, IProperty prop);
	
	
	public IProperty getProp(IProperty.Type proptype);
	
	
	public Map<IProperty.Type, IProperty> getProps();

}
