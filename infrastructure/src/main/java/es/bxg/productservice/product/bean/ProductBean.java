package es.bxg.productservice.product.bean;


import es.bxg.productservice.product.port.IProductCommandPort;
import es.bxg.productservice.product.port.IProductQueryPort;
import es.bxg.productservice.product.service.ProductCommandService;
import es.bxg.productservice.product.service.ProductQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBean {

  @Bean
  public ProductQueryService productQueryService(IProductQueryPort port){
    return new ProductQueryService(port);
  }

  @Bean
  public ProductCommandService productCommandService(IProductCommandPort port){
    return new ProductCommandService(port);
  }

}
