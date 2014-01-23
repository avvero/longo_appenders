import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fxdev-belyaev-ay
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static final void main (String... var) {
        for (int x = 0; x < 100; x++) {
            new Thread(new Tee("Alpha " + x)).start();
            new Thread(new Tee("Betta " + x)).start();
            new Thread(new Tee("Gamma " + x)).start();
        }
    }


    static class Tee implements Runnable {

        String name;

        Tee(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int x = 0; x < 10; x++) {
                log.info(name +" Test1  " + x);
                log.info(name +" Test2  " + x);
                log.info(name +" Test3  " + x);
                log.info(name +" Test4  " + x);
                log.info(name +" Test5  " + x);
            }
        }
    }

}
