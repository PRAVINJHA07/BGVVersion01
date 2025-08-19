package liabraies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class FileUtilies {

	
	public String getPropertyFile(String key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(AutoConstant.datapropertyfile));
		return p.getProperty(key);

	}
}
