package creational.factorymethod.factorymethod1;

public class FactoryMethodUsage1 {

	public static void main(String[] args) {

		Logger logger = LoggerProviderFactory.getLoggingProvider(Log4jLogger.class);
		logger.logMessage("hello");

		logger = LoggerProviderFactory.getLoggingProvider(SLF4JLogger.class);
		logger.logMessage("hello");
	}

}
