package br.eng.mam.vimtrain.api.simengine;


public interface ISymEngine {

	public void setup(IEnvironment env);
	public void computeStep();
	public void nextStep();
	
}
