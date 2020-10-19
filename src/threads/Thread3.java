package threads;

public class Thread3 extends Thread {
    public void run(int n){
        System.out.println("Третий поток: "+((int)Math.pow(n,3)));
    }
}
