class  Box{
private long length;
private long breadth;
private long height;

public double innerVolume()
{
return length*breadth*height;
}

}	
class BoxTest{
public void main(String[] arg)
{

long l=Long.parseLong(arg[0]);
long b=Long.parseLong(arg[1]);
long h=Long.parseLong(arg[2]);

Box box=new Box();
/*
System.out.printf("volume of the box is::%.2f%n",innerVolume(l,b,h));*/

	System.out.printf("volume is::%.2f%n",box.innerVolume();

	}
	
}	