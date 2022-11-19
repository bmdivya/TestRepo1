public class Triangle{

    private double side1;
    private double side2;
    private double side3;	
    
    public void surfaceArea(double x1, double x2, double x3)
        {
        double area=0;
        double s= (side1+side2+side3)/2;
        area= s*(s-side1)*(s-side2)*(s-side3);
        System.out.println("Surface Area is: "+ area);	
        }	
    public void perimeter(double x1, double x2, double x3)
        {
        double peri=0;
        peri = side1+side2+side3;
        System.out.println("Perimeter is: "+ peri);		
        }
    
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.surfaceArea(3,5,8);
        t.perimeter(10,4,7);
        }
    }