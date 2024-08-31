package propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {

	public String getproperties(String property) {
		Properties properties = new Properties();
		 String value=null;
    try {
        FileInputStream fis = new FileInputStream("F:/java_practice/cucumber/propertie_file/config.properties");
        properties.load(fis);
      value =properties.getProperty(property);
       
    } catch (IOException e) {
        e.printStackTrace();
    }
    return  value;
	}	


}
