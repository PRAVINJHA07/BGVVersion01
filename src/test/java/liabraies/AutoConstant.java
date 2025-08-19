package liabraies;

	
/**
 * @author Pravin
 */
public interface AutoConstant {

	String path = System.getProperty("user.dir");

	String datapropertyfile = path + "\\src\\test\\resources\\data.properties";
	String photoPath = path + "\\src\\test\\resources\\photo\\";
	String excelsheet = path + "\\src\\test\\resources\\testdata.xlsx";

}
