package ru.innopolis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Permission;
import java.security.Policy;

/**
 * Created by home on 17-Oct-16.
 */
public class LoggableClassLoader extends ClassLoader{
    private static Logger logger = LoggerFactory.getLogger(LoggableClassLoader.class);

    LoggableClassLoader(ClassLoader parent){
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        logger.info("info" + name);
        return null;
    }

    public static void main(){
    }
}
