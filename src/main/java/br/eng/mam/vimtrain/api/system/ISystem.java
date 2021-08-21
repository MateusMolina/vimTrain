package br.eng.mam.vimtrain.api.system;


import java.util.List;
import java.util.Map;

import br.eng.mam.vimtrain.api.qualifiers.Executable;
import br.eng.mam.vimtrain.api.system.internal.IPort;

/**
 * @author mateus
 * 
 * REQ
 * - Must have subsystems
 * - Must be executable
 * - Must have ports
 *
 */
public interface ISystem extends Executable {
	
	public void addPort(String portid, IPort port);

	public void addSubsys(ISystem sys, IPort port);
	
	public void clearPort(IPort port);
	
	public List<ISystem> getSubsys();
	
	public Map<String, IPort>  getPorts();
	
	

	
} 