
import java.util.Scanner;



public class Lab2 {
	public static double computeArea(Java3d obj1, Java3d obj2, Java3d obj3) {
		double a=obj2.distanceTo(obj1);
		double b=obj3.distanceTo(obj2);
		double c=obj1.distanceTo(obj3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		double p=(a+b+c)/2;
		double S=Math.round((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100.00)/100.00;
		return S;
		
		
	}
	public static void main(String[] args) {
	
		
		
		
		
			 Scanner s=new Scanner(System.in);
			 System.out.println("X1:" );
			 double x1=s.nextDouble();
			 System.out.println("Y1:" );
			 double y1=s.nextDouble();
			 System.out.println("Z1:" );
			 double z1=s.nextDouble();
			 
			 
			 System.out.println("X2:" );
			 double x2=s.nextDouble();
			 System.out.println("Y2:" );
			 double y2=s.nextDouble();
			 System.out.println("Z2:" );
			 double z2=s.nextDouble();
			 
			 System.out.println("X3:" );
			 double x3=s.nextDouble();
			 System.out.println("Y3:" );
			 double y3=s.nextDouble();
			 System.out.println("Z3:" );
			 double z3=s.nextDouble();
			 
			 
			 Java3d Point1=new Java3d(x1,y1,z1);
			 Java3d Point2=new Java3d(x2,y2,z2);
			 Java3d Point3=new Java3d(x3,y3,z3);
			 
			 System.out.println(Point1.getX()+" "+ Point1.getY()+ " "+Point1.getZ());
			 System.out.println(Point2.getX()+" "+ Point2.getY()+ " "+Point2.getZ());
			 System.out.println(Point3.getX()+" "+ Point3.getY()+ " "+Point3.getZ());
			 
			 
			 
			 if((!Point1.equals(Point2))||(!Point2.equals(Point3))||(!Point3.equals(Point1)))
			 
				 System.out.println("Найдены равные координаты");
				 
			 
			 else if (Point1.equals(Point2)&&Point2.equals(Point3)&&Point3.equals(Point1))
				 System.out.println("Площадь треугольника: "+computeArea(Point1, Point2, Point3));
			 
	}
				
				 
	   
	

}
