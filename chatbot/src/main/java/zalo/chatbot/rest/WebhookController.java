package zalo.chatbot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import zalo.chatbot.entity.UserRequest;
import zalo.chatbot.service.ZaloClient;

@RestController
public class WebhookController {

	@PostMapping("/webhook")
	public void post(@RequestBody UserRequest userRequest) {
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			String objectString = mapper.writeValueAsString(userRequest);
//			System.out.println("userRequest="+objectString);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
		System.out.println(userRequest);
		ZaloClient.sendTextMessage(userRequest.getSender().getId(), userRequest.getMessage().getText());
		
	}
	@GetMapping("/webhook")
	public String get() {
		return "WebhookController.get()";
	}
}
