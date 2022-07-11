public class Square implements Shape{
    private int lenght;
    private String Name;

    public Square (int lenght, String Name){
        this.lenght=lenght;
        this.Name=Name;
    }

    @Override
    //�������
    public int Area (){
        return lenght*lenght;
    }
    @Override
    //��������
    public int Perimeter (){
        return 4*lenght;
    }
    //��������
    public String Name (){
        return Name;
    }
}