package com.yondus.arrow;

import com.yondus.arrow.controllers.ArrowController;
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
@WebMvcTest(ArrowController.class)
public class ArrowControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void yonduControllerShouldReturnStatusOKAndTheResponseShouldBeAsExpected() throws Exception {
		mockMvc.perform(get("/yondu/?distance=20.0&time=5.0"))
				.andExpect(status().isOk())
				.andExpect((jsonPath("$.distance").value("20.0")))
				.andExpect((jsonPath("$.time").value("5.0")))
				.andExpect((jsonPath("$.speed").value("4.0")));
	}

	@Test
	public void yonduControllerShouldReturnStatusBadRequestAndTheResponseShouldBeError() throws Exception {
		mockMvc.perform(get("/yondu"))
				.andExpect(status().isBadRequest())
				.andExpect((jsonPath("$.message").value("Missing params")));
	}
}
