package CoreJava;

//StringBuffer and StringBuilder
public class L40 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Chirag");
        System.out.println(sb.length());

        sb.append(" Singh");
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);

        sb.insert(3,"Chirag");
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb.length());




    }
}
