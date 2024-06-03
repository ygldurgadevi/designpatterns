package factorymethod;

import simplefactory.ErrorLogger;
import simplefactory.ILogger;

public class ErrorLoggerFactory implements ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
    
    
}
