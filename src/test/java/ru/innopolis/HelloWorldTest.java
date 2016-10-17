package ru.innopolis;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.api.Expectation;
import org.junit.*;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

/**
 * Created by home on 11-Oct-16.
 */
public class HelloWorldTest {
    private HelloWorld helloWorld;
    private Mockery context ;
    private static Logger log = LoggerFactory.getLogger(HelloWorldTest.class);
    @BeforeClass
    public static void beforeTest(){
        log.info("This is @BeforeClass method");
    }
    @Before
    public void before(){
        log.info("This is @Before method");
        this.helloWorld=new HelloWorld();
        this.context = new Mockery();
    }
    @Ignore
    @Test
    public void testIsHelloWorld(){
        log.info("This is @Test method");
        Assert.assertTrue("arg is not Hello World",this.helloWorld.isHelloWorld("helloWorld"));
    }
    @Ignore
    @Test
    public void testIsString(){
        log.info("This is second @Test method");
        Assert.assertTrue("arg is not String",this.helloWorld.isString("helloWorld"));
    }
    @Test
    public void testHandle(){
        log.info("This is @testHandle");
        StreamWriter sw = new StreamWriter() {
            @Override
            public Long write(String ob) {
                return new Long(16);
            }
        };
        final StreamWriter stream = context.mock(StreamWriter.class);
        context.checking(new Expectations(){{
            oneOf(stream).write("Tatarstan");
            will(returnValue(new Long(16)));
        }});
      //  helloWorld.handle(*) = sw;
        helloWorld.setStreamWriter(stream);
        assertEquals(new Long(16),helloWorld.handle("Tatarstan"));
    }
    @After
    public void after(){
        log.info("This is @After method");
    }

    @AfterClass
    public static void afterTest(){
        log.info("This is @AfterClass method");
    }
}
