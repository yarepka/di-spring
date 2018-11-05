#Property file and config.

<b>@PropertySource</b> is used to set the path for the properties file, so we can can inject the values, using <b>@Value</b> annotation.

PropertySourcesPlaceholderConfigurer reading the property file, scans for properties and enable us the @Value annotation, BUT it seems like it works good without this class.