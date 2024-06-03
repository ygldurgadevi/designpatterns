package simplefactory;

public class LoggerFactory {

    public static ILogger creatLogger(String type) {
        
        if(type.equals("ERROR"))
            return new ErrorLogger();
        else if(type.equals("DEBUG"))
            return new DebugLogger();
        return new InfoLogger();
    }
    
}
