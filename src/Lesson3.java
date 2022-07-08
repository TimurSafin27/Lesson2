class square
{
	double lenght;
	
	square (double l)
	{
	lenght = l;
	}
	
	//Площадь
	double area () 
	{
		return lenght*lenght;
	}
	
	//Периметр
	double Perimeter () 
	{
		return 4*lenght;
	}
	
}

class rectangle (double lenght, double width)
{
	//Площадь
	double area () 
	{
		return lenght*width;
	}
	
	//Периметр
	double Perimeter () 
	{
		return 2*(lenght+width);
	}
}

class hexagon (double lenght)
{
	//Площадь
	double area () 
	{
		return 3*Math.sqrt(3)*lenght*lenght/2;
	}
	
	//Периметр
	double Perimeter () 
	{
		return 6*lenght;
	}
}

public class Lesson3
{
    public static void main (String[] args)
    {
        //Потом
    }
}
