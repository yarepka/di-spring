# Default profile behavior for Spring Context. More on @Profile annotation.

When application.properties:

- <code>spring.profiles.active=</code>

or
- empty

We should have <b>no profiles active</b>, if it's true, we can set the default profile like that:

<code>@Profile({"en", "default"})</code>

or 

<code>@Profile({"de", "default"})</code>

or

<code>@Profile({"ru", "default"})</code>

Depends on which of profiles you want to set as a default one.

<b>Multiple profiles can me active at the same time.<b>





