package util;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    public ConfigFileReader(){
        FileInputStream fileInputStream;
        properties = new Properties();
        String configFilePath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
        try {
            fileInputStream = new FileInputStream(configFilePath);
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getConfigPropertyValue(String key){
            return properties.getProperty(key);
    }
}
