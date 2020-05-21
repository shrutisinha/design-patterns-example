package example.designpatterns;

import exmple.designpatterns.creational.singleton.SpringNotSingleton;
import exmple.designpatterns.creational.singleton.Singleton;
import exmple.designpatterns.creational.singleton.SpringSingleton;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@SpringBootApplication
public class SpringDesignPatternsApplicationTests {

    @Autowired
    SpringSingleton springSingleton1;

    @Autowired
    SpringSingleton springSingleton2;

    @Autowired
    @Qualifier("prototype1")
    SpringNotSingleton prototype1;

    @Autowired
    @Qualifier("prototype2")
    SpringNotSingleton prototype2;

    @Test
    public void prototypeObjectsShouldNotBeEquals() {
        SpringNotSingleton prototype1 =new SpringNotSingleton();
        SpringNotSingleton prototype2 =new SpringNotSingleton();
        Assert.assertNotSame(prototype1, prototype2);
    }

    @Test
    public void singletonObjectsShouldBeEquals() {

//        SpringSingleton springSingleton1 =new SpringSingleton();
//        SpringSingleton springSingleton2 =new SpringSingleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

//      Checking if the Singleton objects are definitely one, the same object
        Assert.assertSame(singleton1, singleton2);

//      Checking if the spring components are definitely singletons
        Assert.assertSame(springSingleton1, springSingleton2);
    }
}
