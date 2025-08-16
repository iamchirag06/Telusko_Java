package CoreJava;

//TypeCasting

class L63A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class L63B extends  L63A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class L63 {
    public static void main(String[] args) {

        //Parent reference with child Object
        L63A obj = new L63B();  //UpCasting
        obj.show1();

        //Child reference
        L63B obj1 = (L63B) obj;  //DownCasting
        obj1.show2();

    }
}
