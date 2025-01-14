package es.bxg.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoaderApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoaderApplication.class, args);
  }

//  @Bean
//  public CommandLineRunner keepAlive() {
//    return args -> {
//      System.out.println("Aplicación iniciada. Esperando...");
//      Thread.currentThread().join(); // Mantiene la aplicación activa
//    };
//  }

}
