# Profile properties

We can set properties through the <b>application.yml</b> file.

In this .yml file we can set property files <b>depends on profile</b> have been chosen.

<b>For code example, check application.yml file in the resources directory.</b>

<hr>

We can also set properties through the <b>application.properties</b> file.
The way we can set values for different profiles using .properties file - is to create a new .property file for each profile, using <b>application-${profile}.properties</b> pattern.

<b>For code example, check application.properties, application-de.properties, application-ru.properties, application-en.properties files in the resources directory.</b>

<hr>

Usage example: We have profiles for different db's: MySQL, H2, MangoDB etc. We also have property files with properties for db connection, which we set through the <b>application.yml</b> or <b>application-{$profile}.properties</b> file(s).
Changing <b>spring.profiles.active=#MySQL #H2 #MangoDB</b> we managing the connection.

