package AdvanceJava;


public class L78 {
    public static void main(String[] args) {
        Status status = Status.Pending;

        switch (status)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            default:
                System.out.println("Done");

        }

        if(status == Status.Running)
        {
            System.out.println("All Good");
        } else if (status == Status.Pending)
        {
            System.out.println("Please Wait");
        } else if (status == Status.Failed)
        {
            System.out.println("Try Again");
        }else
            System.out.println("Done");


    }
}
