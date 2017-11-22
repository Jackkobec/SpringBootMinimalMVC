package com.gmail.jackkobec.representation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MainMvcController {
	// inject from application.properties - property: getIndexPage.message
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value = "/")
	public String getIndexPage(final Map<String, Object> model) {

		model.put("message", this.message);

		return "welcome";
	}
}