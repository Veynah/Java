package be_bstorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TfBestJava23DemonSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TfBestJava23DemonSpringApplication.class, args);
	}
	/*
	L'injection de dépendance agis un peu comme ça, elle réserve dans un empalcement mémoire une instance
	des composants injectable
	(@Repository, @Service, @Controller, @Component, @Bean, @RestController, @Configuration)
	QU'on va pouvoir injecter via le constructeur dans d'autres composants (Voir dans BookServiceImpl)
	* */

}
