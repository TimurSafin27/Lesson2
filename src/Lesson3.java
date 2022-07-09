//����� ������ �����������
class Square{
	public double lenght=0;

	//�������
	public double Area (){
		return lenght*lenght;
	}
	
	//��������
	double Perimeter (){
		return 4*lenght;
	}
}

//����� �������
class Rectangle{

	//�������
	public double Area (double lenght, double width){
		return lenght*width;
	}
	
	//��������
	public double Perimeter (double lenght, double width){
		return 2*(lenght+width);
	}
}

//����� �����������
class Hexagon{
	double lenght;

	//�������
	double Area (){
		return 3*Math.sqrt(3)*lenght*lenght/2;
	}
	
	//��������
	double Perimeter (){
		return 6*lenght;
	}
	
	//�����������
	public Hexagon (double l){
		lenght=l;
	}
}

public class Lesson3 {
    public static void main (String[] args){
        Square Sq1 = new Square();
		Sq1.lenght=10;
		System.out.println("������� �����: " + Sq1.Area());
		Rectangle Re1 = new Rectangle();
		System.out.println("������� �����: " + Re1.Area(10,12));
		Hexagon He1 = new Hexagon (12);
		System.out.println("������� �����: " + He1.Area());
    }
}
