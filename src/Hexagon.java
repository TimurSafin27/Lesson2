public class Hexagon {
    double lenght;

    //Площадь
    double Area (){
        return 3*Math.sqrt(3)*lenght*lenght/2;
    }

    //Периметр
    double Perimeter (){
        return 6*lenght;
    }

    //Конструктор
    public Hexagon (double l){
        lenght=l;
    }
}
