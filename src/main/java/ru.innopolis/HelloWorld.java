package ru.innopolis;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by home on 11-Oc -t-16.
 */
public class HelloWorld {

    private static Logger logger=  LoggerFactory.getLogger(HelloWorld.class);
    private  static final String HELLO_WORLD = "helloworld";
    private StreamWriter streamWriter = new WSStreamWriter() ;
    /*public static void main(String[] args){
        logger.info("123");
        Integer i = 2;
        logger.info("Четное число ={}{}",i,i+1);
        logger.trace("msg");
        logger.;
        loadClass
    }*/

    public boolean isHelloWorld(String arg){
        return (arg!=null) ? !HELLO_WORLD.toLowerCase().equals(arg.toLowerCase()) :false;
    }
    public boolean isString(Object arg){
        return (arg!=null) ? arg.getClass().equals(String.class):false;
    }


    public StreamWriter getStreamWriter() {
        return streamWriter;
    }

    public void setStreamWriter(StreamWriter streamWriter) {
        this.streamWriter = streamWriter;
    }

    public Long handle(String arg){
        Long key = this.streamWriter.write(arg);
        logger.info("method handle arg="+arg);
        return key;
    }
}
