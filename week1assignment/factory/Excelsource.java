package week1assignment.factory;
import java.util.logging.Logger;
public class Excelsource implements TestDataProvider {
	
	public static final Logger logger = Logger.getLogger(Excelsource.class.getName());

	@Override
	public boolean Initializesource() {
		logger.info("Open the Excel File in the specified location");
		return true;
	}

	@Override
	public boolean readdata() {
		logger.info("Read the data from the Excel covering all rows and columns");
		return true;
	}

	@Override
	public boolean Closesource() {
		logger.info("Close the Excel file");
		return true;
	}
	
	

}
