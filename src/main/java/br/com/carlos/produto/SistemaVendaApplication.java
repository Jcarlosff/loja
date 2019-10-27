package br.com.carlos.produto;


import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"br.com.carlos.produto.controller"})
public class SistemaVendaApplication{


public static void main(String[] args) {
	SpringApplication.run(SistemaVendaApplication.class, args);
}

@Bean
public LocaleResolver localResolver() {
	return new FixedLocaleResolver(new Locale("pt", "BR"));
}



}


