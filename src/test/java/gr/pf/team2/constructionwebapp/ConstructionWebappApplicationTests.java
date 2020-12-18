package gr.pf.team2.constructionwebapp;

import gr.pf.team2.constructionwebapp.configuration.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ConstructionWebappApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConstructionWebappApplicationTests.class);
	List<String> passwordsToBeHased = Arrays.asList("1234","1234","pass789");

	@Autowired
	private SecurityConfig securityConfig;

	@Test
	public void contextLoads() {
		passwordsToBeHased.forEach(password ->
				System.out.println(("Hash value of password " + password + "is :" + securityConfig.passwordEncoder().encode(password))));

	}

}