# Beans Factory and Java bean configuration.

We have <b>GreetingServiceFactory</b> class which is a factory for <b>GreetingService</b> implementation objects.
Depends on the argument in <b>createGreetingService(String lang)</b> method, it returns the <b>GreetingService</b> implementation of some profile("en", "de", "ru").

<b>GreetingService</b> implementations and <b>GreetingServiceFactory</b> are configured through the <b>GreetingServiceConfig</b> that marked as a <b>@Configuration</b>.
This class contains methods which returns the bean object. Each method has annotations:

- <b>@Bean</b> - marks the returned object as a bean.

- <b>@Primary</b> - sets the injection priority for the @Profile beans.

- <b>@Profile</b> - sets the Profile for the bean.

There is also a <b>GreetingRepository</b> and the implementation of this interface, that annotated with a @Repository.
This implementation is used by the <b>GreetingServiceFactory</b>, which creates an objects of the <b>GreetingService</b> implementations, injecting implementation of <b>GreetingRepository</b> to the constructor, that is used in the <b>sayGreeting()</b> method.