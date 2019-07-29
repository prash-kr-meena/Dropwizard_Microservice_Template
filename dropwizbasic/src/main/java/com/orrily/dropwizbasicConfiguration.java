package com.orrily;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;

public class dropwizbasicConfiguration extends Configuration {
    // TODO: implement service configuration
}


/*
*
* Although Dropwizard doesn’t have any special Maven plug-ins on its own, << look at the pom.xml that was generated >>.
* We see that the Dropwizard dependencies are on the classpath    and     that we’ll be using the maven-shade-plugin to package up our JAR as an uber JAR.
* This means all of our project’s dependencies will be unpacked (i.e., all dependency JARs unpacked) and combined into a single JAR that our build will create.
*
* For that JAR, we use the maven-jar-plugin to make it executable.
*
* One plug-in we do want to add is the exec-maven-plugin.
* With Spring Boot we were able to just run our microservice with mvn spring-boot:run.
*  We want to be able to do the same thing with our Dropwizard application, so let’s add the following plug-in within the <build> section of the pom.xml

*/
