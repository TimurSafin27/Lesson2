public class Lesson3 {
    public static void main (String[] args){
		Shape Square = new Square (12, "�������");
        Shape Rectangle = new Rectangle (12, 10, "�������������");
        Shape Hexagon = new Hexagon (12, "�������������");
		System.out.println("������� " + Square.Name() + "� �����: " + Square.Area());
        System.out.println("������� " + Rectangle.Name() + "� �����: " + Rectangle.Area());
        System.out.println("������� " + Hexagon.Name() + "� �����: " + Hexagon.Area());

				/*
        Square Sq1 = new Square();
		Sq1.lenght=10;
		System.out.println("������� �����: " + Sq1.Area());
		Rectangle Re1 = new Rectangle();
		System.out.println("������� �����: " + Re1.Area(10,12));
		Hexagon He1 = new Hexagon (12);
		System.out.println("������� �����: " + He1.Area());*/
    }
}
