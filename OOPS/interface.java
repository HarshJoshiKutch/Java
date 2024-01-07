interface Info{
    static final String language ="Java";
    public void display();
}
public void display(){
    System.out.println(language + "is awesome");
}
class interface implements Info  {
    public static void main(String[] args) {
    Simple obj= new Simple();
    obj.display()
    }
}
