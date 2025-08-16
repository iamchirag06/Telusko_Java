package CoreJava;

//method overriding
// in this method overriding, jvm search for method in same class
// then in extended class
public class L56 {
    public static void main(String[] args) {
        Ba obj = new Ba();
        obj.show();
        obj.config();
    }
}
class Ab{
    public void show(){
        System.out.println("In Ab Show");
    }
    public void config(){
        System.out.println("In Ab Config");
    }


}
class Ba extends Ab{
    public void show(){
        System.out.println("In Ba Show");
    }
}