package ar.edu.utn.frc.tup.lc.iii;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		//Act & Assert
		assertDoesNotThrow(() -> Application.main(new String[]{}), "The app should run without throwing exceptions");
	}

}
