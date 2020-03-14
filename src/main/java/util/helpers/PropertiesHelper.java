package util.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

    private static Properties prop = new Properties();

    private static void loadPropertiesFile(String fileName) {
        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String getProperty(String fileName, String key) {
        loadPropertiesFile(fileName);
        return prop.getProperty(key);
    }
}
