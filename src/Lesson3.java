public class Lesson3 {
    public static void main (String[] args){
        Square Sq1 = new Square();
		Sq1.lenght=10;
		System.out.println("Площадь равна: " + Sq1.Area());
		Rectangle Re1 = new Rectangle();
		System.out.println("Площадь равна: " + Re1.Area(10,12));
		Hexagon He1 = new Hexagon (12);
		System.out.println("Площадь равна: " + He1.Area());
    }
}
