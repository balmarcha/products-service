package es.bxg.productservice.color.bean;

import es.bxg.productservice.color.port.IColorCommandPort;
import es.bxg.productservice.color.port.IColorQueryPort;
import es.bxg.productservice.color.service.ColorCommandService;
import es.bxg.productservice.color.service.ColorQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorBean {

  @Bean
  public ColorQueryService colorQueryService(IColorQueryPort port){
    return new ColorQueryService(port);
  }

  @Bean
  public ColorCommandService colorCommandService(IColorCommandPort port){
    return new ColorCommandService(port);
  }

}
