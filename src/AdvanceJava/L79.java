package AdvanceJava;


enum L79e {
    MacBook(2000) , XPS(2200) , Surface(1500) , ThinkPad(1800) ;

    private int price;

    private L79e(int price){
        this.price = price;
    }
}

public class L79 {
    public static void main(String[] args) {


        L79e lap = L79e.MacBook;
        System.out.println(lap);

    }
}
