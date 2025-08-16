package CoreJava;

//Final Keyword
// Used with variable,Method or Class

public class L61 {
    public static void main(String[] args) {
        final int num  = 8;
        // From FINAL variable is used for constant values

        L61a obj = new L61a();
        obj.add(3,4);
        obj.show();

    }
}
//From FINAL class , You can't Inheritance to other class
final class L61a{
    public void show(){
        System.out.println("In L61a");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class L61b{
    
}
