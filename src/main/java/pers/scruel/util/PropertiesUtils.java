package pers.scruel.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Loads properties.
 *
 * @author Scruel Tao <scruel@vip.qq.com>
 */
public class PropertiesUtils {
  private static final Properties properties = new Properties();
  private static boolean debug = false;

  public static Properties getProperties() throws IOException {
    // properties.load(QiNiuUtils.class.getClassLoader().getResourceAsStream("config.properties"));
      if (debug) {
        properties.load(new FileInputStream("C:\\Users\\scruel\\Desktop\\TOOL\\auto\\clipIt\\config.properties"));
      }
      else {
        properties.load(new FileInputStream("config.properties"));
      }
    return properties;
  }

  public static boolean isDebug() {
    return debug;
  }
}