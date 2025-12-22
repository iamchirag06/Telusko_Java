package AdvanceJava;

//Annotation
public class L80 {
    public static void main(String[] args) {
        L80B l80A = new L80B();
        l80A.show();
    }
}
class L80A{
    public void show(){
        System.out.println(" in A Show");
    }
}
class L80B extends L80A{
    @Override
    public void show(){
        System.out.println("in B Show");
    }
}