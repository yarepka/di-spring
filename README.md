# How to access the OS environment values? 

The way we can do it is by creating the field of the class <b>Environment</b> with <b>@Autowired</b> annotation and running the <b>getProperty(String key)</b> method.

We can also set evnironment properties through the Intelij IDEA and access them on the need.

We can store db settings in property files, company name, server settings etc., that we can easily change through one file, property file is really handy thing.