class areaC
{
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("area of the circle is ="+z+" sq units");

        
       
    }
    void area(float x)
    {
        System.out.println("area of the square is = "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("area of the rectangle is = "+x*y+" sq units");

	  System.out.println("area of the rectangle is = "+x*y+" sq units");

        System.out.println("area of the rectangle is ");
    }
    
}
class areaCalculation
{
     public static void main(String args[]) 
	{
	   var obj = new areaC();
	 System.out.println("area of the rectangle is ");

	   obj.area(Double.parseDouble(args[0]));
	   obj.area(Float.parseFloat(args[1]),Float.parseFloat(args[2]));
	   obj.area(Float.parseFloat(args[3]));
        }
}