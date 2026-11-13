package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utilityFetchProperty {

    public static String fetchPropertyValue(String key) throws IOException {
        FileInputStream file=new FileInputStream("src/test/resources/properties/config.properties");
        //copy properties file path(content root) (input stream is used to read the file_

        Properties property=new Properties(); //creating object of properties class is used to load property file
        property.load(file);  //loading property file
        return property.get(key).toString(); //fetching the value of key and converting to string
    }
}
