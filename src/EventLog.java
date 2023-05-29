import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLog {
	FileHandler fileHander;
	LogManager logmanager;
	Logger logger;
	public EventLog(String name) {
		try {
			logmanager=LogManager.getLogManager();
			logger =logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHander=new FileHandler(name);
			fileHander.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHander);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void log(String message) {
		logger.info(message);
	}
}
