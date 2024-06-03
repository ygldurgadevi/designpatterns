package factorymethod;

import simplefactory.ILogger;
import simplefactory.InfoLogger;

public class InfoLoggerFactory implements ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new InfoLogger();    }
    
}
