There are two classes, CLient.java and Server.java
Register.java, Service.java, Parameters.java, RegisterServices.java and ServiceRegistry.java are the middleware classes.
Service1.java and Service2.java are two sample services created here.

When implementing a service by someone, we need to inherit abstract class Service and create a new class and implement a service. 

Then that service needs to be registered, so we register services in RegisterServices class by method, startRegistering. 

When server class is written an array of ServiceRegistry class needs to be created where we register the services and call startRegistering method to register services. Array size could be decided according to your need. To lookup services use lookup method in Register class and registerService method is called in RegisterServices class to start registering methods.


