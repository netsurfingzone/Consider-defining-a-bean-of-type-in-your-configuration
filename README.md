# Consider-defining-a-bean-of-type-in-your-configuration
Consider defining a bean of type in your configuration

See a detailed and depth tutorial here.

https://www.javatute.com/jpa/consider-defining-a-bean-of-type-in-your-configuration/


Below points may helps to fix this error.

Use @Service and @Repository annotation with appropriate classes.
Use @EnableJpaRepositories(basePackages = “com.netsurfingzone.repository”)
Use @ComponentScan annotation
Make sure we have proper spring data jpa dependency.
