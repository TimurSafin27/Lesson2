public class Hexagon {
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
