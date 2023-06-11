package pl.whuzar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.whuzar.member.User;
import pl.whuzar.repositories.UserRepository;

@SpringBootApplication
public class BookshelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshelfApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
//            User user = new User("Wojciech", "Huzar", 19, "wojtekhuzar@gmail.com", 735250007, "passuser", "whuzaru", "ROLE_USER");
//            userRepository.save(user);
        };
    }

}
