## spring-starter

This is examples of di using the spring framework.

### prerequisite
This uses java 8 which I installed via [sdkman](https://sdkman.io/install):
```
 sdk install java 8.0.272-zulu
```

### setup
I created this using spring [intitializr](https://start.spring.io/#!type=gradle-project&language=groovy&platformVersion=2.3.5.RELEASE&packaging=jar&jvmVersion=11&groupId=com.hibby&artifactId=beginner-spring-boot&name=beginner-spring-boot&description=Demo%20project%20for%20Spring%20Boot&packageName=com.hibby.beginner-spring-boot) 


## tutorial

### MyBean Bean Definition
[This](https://github.com/rmchale/spring-starter-8/blob/main/src/main/groovy/com/hibby/beginnerspringboot/bean/BeanDefinitions.groovy) method is a definition for a spring-bean defined with the @bean annotation.

```
@Configuration
class BeanDefinitions {
    @Bean /* definition for MyBean class */
    MyBean bean() {
        return new MyBean();
    }
}
```

### ClassInjection Bean Definition


[ClassInjection](https://github.com/rmchale/spring-starter-8/blob/main/src/main/groovy/com/hibby/beginnerspringboot/bean/ClassInjection.groovy) is the definition of a spring-bean defined with the @Component annotation.

```
@Component /* this makes this eligible for spring DI */
class ClassInjection {

    String run() {
        return "hi"
    }
}
```

### Autowiring
[LoggingController](https://github.com/rmchale/spring-starter-8/blob/main/src/main/groovy/com/hibby/beginnerspringboot/controller/LoggingController.groovy) is an example of autowiring those beans
```
class LoggingController {

    @Autowired ClassInjection injected;
    @Autowired MyBean myBean

    @RequestMapping("/")
    public String index() {
        log.info("my code {} {}", injected.run(), myBean.run())
        return "Howdy! Check out the Logs to see the output...";
    }
}
```


## build
```
./gradlew build
```

## run
```
java -jar build/libs/beginner-spring-boot-0.0.1-SNAPSHOT.jar
```

## curl
```
curl http://localhost:8080/
Howdy! Check out the Logs to see the output..
```
