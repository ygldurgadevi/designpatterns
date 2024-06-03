package factorymethod;

import simplefactory.ILogger;

public class Main {

    public static void main(String[] args) {
        
        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        ILogger infoLogger =  infoLoggerFactory.createLogger();

        infoLogger.log("message logged");
    }
    
}
