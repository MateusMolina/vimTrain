package br.eng.mam.vimtrain.api.env;

public interface IVector {
	
	public ICoordinateSystem getCoordinateSystem();
	
	public double getX();
	public double getY();
	public double getZ();
	
	public void setCoordinateSystem(ICoordinateSystem coosys);
	
	public void setX(double x);
	public void setY(double y);
	public void setZ(double z);
	
	public default void set(double x,double y,double z) {
		setX(x);
		setY(y);
		setZ(z);
	}
	public default void setXY(double x, double y) {
		setX(x);
		setY(y);
	}
}
