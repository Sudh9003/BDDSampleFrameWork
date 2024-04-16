package manager;

import dataProviders.ConfigFileReader;

//This class is used read all the files from a single place.
public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    //This will return the current instance of the file reader manager class.
    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    //This will return the current instance of the config file reader.If there's not existing config file reader object then it will create a new one.
    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}