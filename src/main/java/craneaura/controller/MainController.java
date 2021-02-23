package craneaura.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(path = "/")
	public String getMain() throws Exception {
		String hostName = InetAddress.getLocalHost().getHostName();
		return "Hello World! You're in " + hostName;
	}
}
