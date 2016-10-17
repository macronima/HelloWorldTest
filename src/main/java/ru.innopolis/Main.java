package ru.innopolis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main() {
        LoggableClassLoader classLoader = new LoggableClassLoader(getClassLoader());
    }
//comment
    public static ClassLoader getClassLoader() {
        return Main.getClassLoader();
    }
}