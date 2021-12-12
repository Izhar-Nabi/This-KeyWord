package ConditionNo2;

public class Keyword {
    void show(int a){
        this.secondMethod();
        int z=a;
        System.out.println("Show Method");
        System.out.println(z);
    }
    void secondMethod(){
        System.out.println("2nd Method");
    }
    public static void main(String []args){
        Keyword obj = new Keyword();
        obj.show(20);
    }
}
