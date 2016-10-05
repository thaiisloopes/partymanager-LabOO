package com.algaworks.partymanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.algaworks.partymanager.PartyManagerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PartyManagerApplication.class)
@WebAppConfiguration
public class PartyManagerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
