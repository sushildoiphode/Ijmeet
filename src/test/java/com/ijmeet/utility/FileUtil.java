package com.ijmeet.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {

	public static String getProperty(String key) {
		String value = null;
		String path = System.getProperty("user.dir");
		try {
			FileInputStream file = new FileInputStream(path + "\\src\\test\\resources\\ObjectRepository.properties");
			Properties prop = new Properties();
			prop.load(file);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
