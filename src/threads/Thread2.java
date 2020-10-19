package threads;

public class Thread2 extends Thread {
    public void run(int n)
    {
        System.out.println("Второй поток: "+(int)Math.pow(n,2));
    }
}
