package br.eng.mam.vimtrain.api.system.train;

import br.eng.mam.vimtrain.api.system.ISystem;
import br.eng.mam.vimtrain.api.system.bus.IBus;

public interface ITrain extends ISystem {
	
	public IBus getPneumaticBus();
}
