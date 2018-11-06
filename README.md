# Multiple Property files

You can set multiple property files with <b>@PropertySources()</b> annotation.

Example:<code>
    @PropertySource({@PropertySource("classpath:YOUR_PROPERTY_FILE"), @PropertySource("classpath:YOUR_SECOND_PROPERTY_FILE")})
</code>

You can also do that with <b>@PropertySource</b> annotation. 

Example:<code>
    @PropertySource({"YOUR_PROP_FILE", "YOUR_SECOND_PROP_FILE})
</code>
 