package dataProviders;

import enums.DriverType;
import enums.EnvironmentType;
import exceptions.AutomationFrameworkException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//This class will read all the properties of the configuration.properties file.
public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= "configs/config.properties";

    //The below constructor is getting used to load the properties file.
    public ConfigFileReader(){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new AutomationFrameworkException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    //The below method is used to fetch the local browser driver path from properties file.
    public String getDriverPath(){
        String driverPath = System.getProperty("user.dir")+ properties.getProperty("driverPath");
        if(driverPath!= null) return driverPath;
        else throw new AutomationFrameworkException("driverPath not specified in the Configuration.properties file.");
    }

    //The below method is used to fetch the implicit wait time from properties file.
    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new AutomationFrameworkException("implicitlyWait not specified in the Configuration.properties file.");
    }
    //The below method is used to get the AUT url from properties file.
    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new AutomationFrameworkException("url not specified in the Configuration.properties file.");
    }
    //The below method is used to get the browser type from properties file.
    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
        else throw new AutomationFrameworkException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }
    //This below method is used to get the test environment from properties file.
    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else throw new AutomationFrameworkException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }
    //This below method is used to fetch the specified browser window size from properties file.
    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }
    //This below method is used to get the path of the  report configuration file from properties file.
    public String getReportConfigPath(){
        String reportConfigPath = System.getProperty("user.dir") + properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new AutomationFrameworkException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }


}