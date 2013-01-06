package org.ishtar.akynd.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author tatsunori.hasegawa.1029@gmail.com
 */
@Controller
public class HelloWorldController {

	/**
	 * aa
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		ModelAndView mav = new ModelAndView("/helloView");

		// 直接モデルに、メッセージを設定する。
		mav.addObject("message1", " Hello World, <strong>Srping MVC 3.0!</strong> ");

		// モデルを取得して、メッセージを設定する。
		mav.getModelMap().put("message2", "メッセージ2。");
		mav.addObject("currentDate", new Date());

		return mav;
	}

}
