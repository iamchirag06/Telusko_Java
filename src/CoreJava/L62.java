package CoreJava;

import java.util.Objects;

public class L62 {
    public static void main(String[] args) {

        Laptop_62 obj1 = new Laptop_62();
        obj1.brand = "Lenovo Yoga";
        obj1.price = 13000;

        Laptop_62 obj2 = new Laptop_62();
        obj2.brand = "Lenovo Yoga";
        obj2.price = 13000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}

class Laptop_62 {
    String brand;
    int price;
    String serial;

    @Override
    public String toString() {
        return "Laptop_62{" +
                "serial='" + serial + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop_62 laptop62 = (Laptop_62) o;
        return price == laptop62.price && Objects.equals(brand, laptop62.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

        public boolean equals(Laptop_62 that){
            return this.brand.equals(that.brand) && this.price == that.price;

    }
}