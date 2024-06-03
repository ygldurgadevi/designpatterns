package factorymethod;

import simplefactory.DebugLogger;
import simplefactory.ILogger;

public class DebugLoggerFactory implements ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
    
    
}
