package inheritance;
interface Logger {
	void log(String message);
	default void defaultLog() {
		System.out.println("Logging default message");
	}
}
class FileLogger implements Logger {
	@Override
	public void log(String message) {
	    System.out.println("Logging to file: " + message);
	}
}
class ConsoleLogger implements Logger {
	@Override
	public void log(String message) {
	    System.out.println("Logging to console: " + message);
	}
}

public class Main2 {
	public static void main(String[] args) {
		FileLogger fileLogger = new FileLogger();
		ConsoleLogger consoleLogger = new ConsoleLogger();
		fileLogger.log("Message logged in file");
		fileLogger.defaultLog();
		System.out.println();
		        
		consoleLogger.log("Message logged in console");
		consoleLogger.defaultLog();
	}
}
