//package lr2;

public class Java2d {
	
	/**���������� X**/
	private double xCoord;
	/**���������� Y**/
	private double yCoord;
	/**����������� �������������**/
	public Java2d (double x, double y) {
		xCoord=x;
		yCoord=y;
		
	}
	/**����������� �� ���������**/
	public Java2d() {
		this(0.0,0.0);
	}
	/**����������� ���������� X**/
	public double getX() {
		return xCoord;
	}
	/**����������� ���������� Y**/
	public double getY() {
		return yCoord;
	}
	
	/**��������� �������� ���������� X**/
	public void setX(double val) {
		xCoord=val;
	}
	/**��������� �������� ���������� Y**/
	public void setY(double val) {
		yCoord=val;
	}
	

	
	
	//public double distanceTo(Java2d obj) {
		//double res=Math.round((Math.sqrt(Math.pow(obj.xCoord-xCoord,2)+Math.pow(obj.yCoord-yCoord,2)))*100.0)/100.0;
		//return(res);
	//}

}
