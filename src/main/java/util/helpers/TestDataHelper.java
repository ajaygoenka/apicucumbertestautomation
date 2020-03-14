package util.helpers;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestDataHelper {

    public static final String DB_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    public static String getTestPropertiesFile() {
        String fileName = "../test.properties";
        File file = new File(fileName);
        if (!file.exists()) {
            fileName = "test.properties";
        }
        return fileName;
    }

    public static boolean isDateFormatValid(String expectedDateFormat, String value) {
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(expectedDateFormat);
            date = simpleDateFormat.parse(value);
            if (!value.equals(simpleDateFormat.format(date))) {
                date = null;
            }
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        return date != null;
    }


}
