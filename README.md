configurator-test
=================

Examples of how to use configurator in standalon app and servelet/Spring context.

ConfigExposingServletContextListener
------------------------------------
This is an example of exposing configs from a properties file as a Map inside of JSP.  Map keys/values are updated dynamically when the properties file is refreshed.

spring-app.xml
--------------
This is an example of using FileConfigProperties as a Spring PropertyPlaceholderConfigurer so as to configure beans dynamically.

