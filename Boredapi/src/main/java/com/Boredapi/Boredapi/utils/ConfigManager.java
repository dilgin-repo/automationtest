package com.Boredapi.Boredapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	
	private static ConfigManager manager;
	
	private static final Properties prop =new Properties();
	
	private ConfigManager() throws IOException {
		
		InputStream InputStream = ConfigManager.class.getResourceAsStream("../resource/config.properties");
		
		
		prop.load(InputStream);
	}
	public static ConfigManager getInstance() {
		if(manager==null) {
			synchronized (ConfigManager.class) {
				try {
					manager = new ConfigManager();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return manager;
	}
	
	public String getString(String key) {
		return System.getProperty(key,prop.getProperty(key));
	}

} 
