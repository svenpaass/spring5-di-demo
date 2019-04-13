package net.paass.spring5didemo.config;

import net.paass.spring5didemo.examplebeans.FakeDataSource;
import net.paass.spring5didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({ "classpath:datasource.properties", "classpath:jms.properties" })
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

  @Autowired
  Environment env;

  @Value("${database.username}")
  String user;

  @Value("${database.password}")
  String password;

  @Value("${database.url}")
  String url;

  @Value("${net.paass.jms.username}")
  String jmsUsername;

  @Value("${net.paass.jms.password}")
  String jmsPassword;

  @Value("${net.paass.jms.url}")
  String jmsUrl;


  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();

    if ( env.getProperty("USERNAME") != null ) {
      fakeDataSource.setUser(env.getProperty("USERNAME"));
    } else {
      fakeDataSource.setUser(user);
    }
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUsername(jmsUsername);
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    return fakeJmsBroker;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    return propertySourcesPlaceholderConfigurer;
  }

}
