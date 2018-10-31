# Dependency Injection using Spring Framework. @Profile annotation.

We mark the beans as a part of some profile, in our example <b>@Profile("ru")</b> and <b>@Profile("en")</b>,
for having greetings in different languages, in our example Russian and English.

Profile have 2 states:
- <b>Active</b>
- <b>Unactive</b>

We can set this state through the application.properties which is part of resources directory, using:

- <b>For Russian:</b>

<code>
    spring.profiles.active=ru
</code><br><br>


- <b>For English:</b>

<code>
spring.profiles.active=en
</code>
<br><br>
Example of using profiles is changing between MySQL DB and H2 In-memory DB 



