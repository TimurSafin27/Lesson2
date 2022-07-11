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
    //�������
    public int Area (){
        return lenght*width;
    }
    @Override
    //��������
    public int Perimeter (){
        return 2*(lenght+width);
    }
    //��������
    public String Name (){
        return Name;
    }
}