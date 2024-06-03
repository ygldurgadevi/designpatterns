package factorymethod;

import simplefactory.ILogger;

public interface ILoggerFactory {
    public ILogger createLogger();
}
