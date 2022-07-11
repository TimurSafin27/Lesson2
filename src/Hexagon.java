import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon implements Shape{
    private int lenght;
    private String Name;

    public Hexagon (int lenght, String Name){
        this.lenght=lenght;
        this.Name=Name;
    }

    @Override
    //Площадь
    public int Area (){
        double d;
        d=3*Math.sqrt(3)*lenght*lenght/2;
        double newDouble2 = new BigDecimal(d).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
        int i = (int)newDouble2;
        return i;
    }

    //Периметр
    @Override
    public int Perimeter (){
        return 6*lenght;
    }
    //Название
    public String Name (){
        return Name;
    }
}