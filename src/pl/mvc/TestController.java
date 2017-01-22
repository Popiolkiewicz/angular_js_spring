/**
 * 
 */
package pl.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hubert
 *
 */
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "view";
	}
}
