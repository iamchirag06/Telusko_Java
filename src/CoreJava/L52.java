package CoreJava;

//Single Level Inheritance
// AdvCalc ---> Calculator
public class L52 {
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(12, 45);
        int r2 = obj.sub(23, 56);

        int r3 = obj.multi(12, 45);
        int r4 = obj.div(15, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calculator {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
