//package lr2;
import java.util.Objects;

public class Java3d extends Java2d{

	/**Координата Z**/
	private double zCoord;
	public Java3d(double x, double y, double z) {
	super(x, y);
	zCoord=z;
	}
	
	
	/**Конструктор по умолчанию**/
	public Java3d() {
		super();
		this.zCoord=0.0;
		//this(0.0,0.0,0.0);
	}

	/**Возвращение координаты Z**/
	public double getZ() {
		return zCoord;
	}
	/**Установка значения координаты Z**/
	public void setZ(double val) {
		zCoord=val;
	}
	@Override
	public boolean equals(Object obj) {
	
	if(getClass()!=obj.getClass())
		return false;
	
	Java3d p3 = (Java3d) obj;
	if((Objects.equals(this.getX(), p3.getX()))||(Objects.equals(this.getY(), p3.getY())) ||(Objects.equals(this.getZ(), p3.getZ()))){
			
				return false;
	}
	
		return true;	

	}
	
	
	
	public double distanceTo(Java3d obj) {
		double res=Math.round((Math.sqrt(Math.pow(obj.getX()-this.getX(),2)+Math.pow(obj.getY()-this.getY(),2)+Math.pow(obj.getZ()-this.getZ(),2)))*100.0)/100.0;
		return(res);
	}
	
	

}
