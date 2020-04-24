//package lr2;

public class Java2d {
	
	/**Координата X**/
	private double xCoord;
	/**Координата Y**/
	private double yCoord;
	/**Конструктор инициализации**/
	public Java2d (double x, double y) {
		xCoord=x;
		yCoord=y;
		
	}
	/**Конструктор по умолчанию**/
	public Java2d() {
		this(0.0,0.0);
	}
	/**Возвращение координаты X**/
	public double getX() {
		return xCoord;
	}
	/**Возвращение координаты Y**/
	public double getY() {
		return yCoord;
	}
	
	/**Установка значения координаты X**/
	public void setX(double val) {
		xCoord=val;
	}
	/**Установка значения координаты Y**/
	public void setY(double val) {
		yCoord=val;
	}
	

	
	
	//public double distanceTo(Java2d obj) {
		//double res=Math.round((Math.sqrt(Math.pow(obj.xCoord-xCoord,2)+Math.pow(obj.yCoord-yCoord,2)))*100.0)/100.0;
		//return(res);
	//}

}
