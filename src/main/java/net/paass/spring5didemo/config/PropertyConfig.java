package net.paass.spring5didemo.config;

import net.paass.spring5didemo.examplebeans.FakeDataSource;
import net.paass.spring5didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

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
    fakeDataSource.setUser(user);
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

}
