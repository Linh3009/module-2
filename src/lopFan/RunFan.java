package lopFan;

public class RunFan {
    public static void main(String[] args) {
        Fan f1 = new Fan(3, true,10, "yellow");

        Fan f2 = new Fan();
        f2.setColor("red");
        System.out.println(f2);

    }
}
