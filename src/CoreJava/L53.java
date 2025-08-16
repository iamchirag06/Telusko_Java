package CoreJava;

// Multiple Level Inheritance
// as VryAdvCalc ---> AdvCalc -----> Calculator
public class L53 {
    public static void main(String[] args) {

        VryAdvCalc obj = new VryAdvCalc();
        int r1 = obj.add(3,4);
        int r2 = obj.sub(4,3);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(5,3);
        double r5 = obj.power(3,5);

        System.out.println(r1 +" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
class VryAdvCalc extends AdvCalc{
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}