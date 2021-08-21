package br.eng.mam.vimtrain.api.system.internal;

import java.util.List;

import br.eng.mam.vimtrain.api.system.ISystem;

/**
 * @author mateus
 * 
 * REQ
 * - Composed within a single system
 * - Must connect the main system to one or more systems
 * - Must contain a single State
 * - Should be externally identifiable
 */
public interface IPort {
	
	// Should also run the counterpart method
	public void connectPort(IPort port);
	
	public void setState(IState state);
	
	public IState getState();
	
	public ISystem getMainSys();
	
	public List<IPort> getConnectedPorts();
	
}
