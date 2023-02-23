package br.com.userapi;

import br.com.userapi.domain.User;
import br.com.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
										new User(null, "Rafael Costa","rfluiz@gmail.com", "123", 50.5),
									    new User(null, "Marina Costa","marina@gmail.com", "123", 120)
								      )
		        			  );
		//id esta nulo pq quem resolve ele é o banco de dados
	}
}
