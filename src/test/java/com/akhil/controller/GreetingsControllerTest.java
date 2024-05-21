package com.akhil.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.akhil.Entity.Tourists;
import com.akhil.service.IGreetingsService;

@SpringBootTest
@AutoConfigureMockMvc
public class GreetingsControllerTest {

	@MockBean
	private IGreetingsService ser;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testingGreetings() throws Exception {
		
		Mockito.when(ser.greeting()).thenReturn("Good Mornings");
		
//		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/greet");
//		ResultActions result = mockMvc.perform(request);
//		String resultString = result.andReturn().getResponse().getContentAsString();
//		System.out.println(resultString+ " :result String");
		 Object fresult = mockMvc.perform(MockMvcRequestBuilders.get("/greet"))
				.andReturn()
				.getModelAndView().getModel().get("greet");
		assertEquals("Good Mornings", fresult);
		
	}
	@Test
	public void testingTourist() throws Exception {
		Tourists tourist=new Tourists(101,"Akhil","Gold",599.99);
		Mockito.when(ser.saveData(tourist)).thenReturn("Data Saved");
		
		Object result = mockMvc.perform(MockMvcRequestBuilders.post("/tourist-post")).andReturn()
				.getResponse().getStatus();
//		.getModelAndView().getModel().get("message");
		
		assertEquals(200, result);
	}
}
