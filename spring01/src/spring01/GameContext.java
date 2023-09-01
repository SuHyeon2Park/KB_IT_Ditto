package spring01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바에서 bean설정
@Configuration
public class GameContext {
	@Bean
	public NumberGuess guess() {
		return new NumberGuess();
	}
}
