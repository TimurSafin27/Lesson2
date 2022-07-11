public class Lesson3 {
    public static void main (String[] args){
		Shape Square = new Square (12, "квадрат");
        Shape Rectangle = new Rectangle (12, 10, "прямоугольник");
        Shape Hexagon = new Hexagon (12, "шестиугольник");
		System.out.println("Площадь " + Square.Name() + "а равна: " + Square.Area());
        System.out.println("Площадь " + Rectangle.Name() + "а равна: " + Rectangle.Area());
        System.out.println("Площадь " + Hexagon.Name() + "а равна: " + Hexagon.Area());

				/*
        Square Sq1 = new Square();
		Sq1.lenght=10;
		System.out.println("Площадь равна: " + Sq1.Area());
		Rectangle Re1 = new Rectangle();
		System.out.println("Площадь равна: " + Re1.Area(10,12));
		Hexagon He1 = new Hexagon (12);
		System.out.println("Площадь равна: " + He1.Area());*/
    }
}
