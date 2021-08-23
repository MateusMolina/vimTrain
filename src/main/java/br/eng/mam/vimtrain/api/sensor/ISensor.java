package br.eng.mam.vimtrain.api.sensor;

import java.util.function.Function;

public interface ISensor {

	public String getShortID();

	// TODO to be implemented
	public void setProxy();
	
	public void setFunction(Function<?, ?> function);
	
	public double computeValue();
	
	public void publish();
}
