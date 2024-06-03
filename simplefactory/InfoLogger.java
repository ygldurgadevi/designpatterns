package simplefactory;

public class InfoLogger implements  ILogger{

    @Override
    public void log(String msg) {
        System.out.println("INFO LEVEL LOG: " + msg);
    }
    
}
