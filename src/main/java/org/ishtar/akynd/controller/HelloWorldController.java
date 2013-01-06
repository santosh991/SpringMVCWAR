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

		// ���ڃ��f���ɁA���b�Z�[�W��ݒ肷��B
		mav.addObject("message1", " Hello World, <strong>Srping MVC 3.0!</strong> ");

		// ���f�����擾���āA���b�Z�[�W��ݒ肷��B
		mav.getModelMap().put("message2", "���b�Z�[�W2�B");
		mav.addObject("currentDate", new Date());

		return mav;
	}

}
