package AdvanceJava.ExcerciseQues;


public class ExerciseQues {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("WashingMachine");
        // TODO: Print the result of start() for each object
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}
interface Machine{
    String start();
}
abstract class Appliance implements Machine{
    String name;

    public Appliance(String name){
        this.name = name;
    }
}
class Fan extends Appliance{

    public Fan(String name){
        super(name);
    }
    public String start(){
        return "Fan is Running";
    }
}
class WashingMachine extends Appliance{

    public WashingMachine(String name){
        super(name);
    }
    public String start(){
        return "WashingMachine is operating";
    }
}