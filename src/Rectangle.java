public class Rectangle implements Shape {
    private int lenght;
    private int width;
    private String Name;

    public Rectangle (int lenght, int width, String Name){
        this.lenght=lenght;
        this.width=width;
        this.Name=Name;
    }
    @Override
    //Площадь
    public int Area (){
        return lenght*width;
    }
    @Override
    //Периметр
    public int Perimeter (){
        return 2*(lenght+width);
    }
    //Название
    public String Name (){
        return Name;
    }
}