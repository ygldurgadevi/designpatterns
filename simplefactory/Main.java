package simplefactory;

public class Main {

    public static void main(String[] args) {
        
        ILogger infoLogger = LoggerFactory.creatLogger("INFO");
        infoLogger.log("message logged");

        ILogger debugLogger = LoggerFactory.creatLogger("DEBUG");
        debugLogger.log("message logged");

        ILogger errorLogger = LoggerFactory.creatLogger("ERROR");
        errorLogger.log("message logged");

    }
    
}
