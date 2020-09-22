package Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    public static Object get(String filePath, String keyWord){
        Properties prop = new Properties();
        String value = null;
        try {
            InputStream inputStream = PropertiesUtil.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
