class Square
{
	public double lenght=0;
	
	public square ()//Конструктор
	{
	
	}
	
	//Площадь
	public double Area () 
	{
		return lenght*lenght;
	}
	
	//Периметр
	double Perimeter () 
	{
		return 4*lenght;
	}
	
}

public class Rectangle //через функции
{
	//Площадь
	public double Area (double lenght, double width) 
	{
		return lenght*width;
	}
	
	//Периметр
	public double Perimeter (double lenght, double width) 
	{
		return 2*(lenght+width);
	}
}

public class Hexagon (double lenght)//Через конструктор
{
	//Площадь
	double Area () 
	{
		return 3*Math.sqrt(3)*lenght*lenght/2;
	}
	
	//Периметр
	double Perimeter () 
	{
		return 6*lenght;
	}
	
	public Hexagon (double l) //Конструктор
	{
		lenght=l;
	}
}

public class Lesson3
{
    public static void main (String[] args)
    {
        Square Sq1 = new Square;
		Sq1.lenght=10;
		System.out.println("Площадь равна: " + Sq1.Area);
		Rectangle Re1 = new Rectangle;
		System.out.println("Площадь равна: " + Re1.Area(10,12));
		Rectangle He1 = new Hexagon (12);
		System.out.println("Площадь равна: " + He1.Area);
    }
}
