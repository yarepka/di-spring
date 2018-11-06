# YAML used with spring-boot

We can put the properties from <b>application.properties</b> to the <b>application.yml</b> and describe them in <b>YAML</b>.
We can get them later in the same way we've been getting properties from <b>application.property</b> file, using <b>PropertyConfig</b> class where fields marked with <b>@Value("key")</b> to set the property values as field values.