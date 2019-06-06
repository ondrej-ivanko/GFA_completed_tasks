package com.controllertest.user;

import com.controllertest.user.controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void GuardianControllerCheckingGetGrootEndPointWhenCorrect() throws Exception {
//		String result = "{ \"received\" : \"a message\", \"translated\" : \"I am groot.\" }";
		mockMvc.perform(get("/groot?message=somemessage"))
				.andExpect(status().isOk())
				.andExpect((jsonPath("$.received").value("somemessage")))
				.andExpect((jsonPath("$.translated").value("I am groot")));
	}

	public void GuardianControllerCheckingGetGrootEndPointWhenFalse() throws Exception {
		mockMvc.perform(get("/groot"))
				.andExpect(status().isBadRequest())
				.andExpect((jsonPath("$.received").value("")))
				.andExpect((jsonPath("$.error").value("I am groot")));
	}


}
