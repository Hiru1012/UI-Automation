/*
 * Project: dynamedics-test-automation
 * Created Date: Thursday March 31st 2022
 * Author: pabeywickrama
 * -----
 * Last Modified: Tuesday May 10th 2022 4:56:03 pm
 * Modified By: pabeywickrama at pabeywickrama@mitrai.com
 * -----
 * Copyright (c) 2022 Mitra Sparks
 * -----
 * HISTORY:
 */


package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    private Properties getData(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName + ".properties").getFile());
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public String getProperty(String fileName, String key) {
        return getData(fileName).getProperty(key);


    }
}
