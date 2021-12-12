package KeyWords;

public class Keytypes {
    String Name;
    int age;
    Keytypes(String Name, int age){
        System.out.println("Constructor Area");
        this.Name=Name;
        this.age=age;
    }
    void show(){
        System.out.println(Name+" "+ age+"");
    }
    public static void main(String []args){
        Keytypes type= new Keytypes("Popt",21);
        type.show();
        System.out.println("Instance variable ");
    } }
