import java.util.Random;
import threads.*;

public class Main {
    public static void main(String[] args) throws InterruptedException{
	    Random rand = new Random();
	    Thread2 t2 = new Thread2();
	    Thread3 t3 = new Thread3();
	    t2.start();
	    t3.start();
	    while(true)
        {
            int n = rand.nextInt(10);
            System.out.println("Первый поток: "+n);
            if (n%2==0) {
                t2.run(n);
                t2.join();
            }
            else
            {
                t3.run(n);
                t3.join();
            }
            Thread.sleep(1000); //приостанавливает поток на секунду
        }
    }
}
