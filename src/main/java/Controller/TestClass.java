package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.TestService;

@RestController
@RequestMapping("/test")
public class TestClass {
	TestService service = new TestService();
	@GetMapping
	public void testService() {
		service.getService();
	}
}
