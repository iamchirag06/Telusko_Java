package CoreJava;

public class L52 {
    public static void main(String[] args) {


        Calculator obj = new Calculator();
        int r1 = obj.add(12,45);
        int r2 = obj.sub(23,56);

        System.out.println(r1 +" "+r2);
    }
}
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}