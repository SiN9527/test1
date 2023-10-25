package tw.hwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping(path = "/members/{mid}")
	public void processAction(@PathVariable("mid") String memberId) {
		System.out.println("memberId=" + memberId);
	}
	
	
}
