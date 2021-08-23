package br.eng.mam.vimtrain.api.simengine;

import java.util.List;

import br.eng.mam.vimtrain.api.sensor.ISensor;
import br.eng.mam.vimtrain.api.system.train.ITrain;
import br.eng.mam.vimtrain.api.track.ITrack;

public interface IEnvironment {
	
	public ITrain getTrain();
	
	public ITrack getTrack();
	
	public List<ISensor> getSensors();
	
	public void addSensor(ISensor sensor);

}
