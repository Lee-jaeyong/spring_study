package com.java.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.ex.VO.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user/users", method = RequestMethod.GET)
	public ModelAndView user(@ModelAttribute("memberVO") @Valid MemberVO memberVo, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		System.out.println(memberVo.getUserId());
		System.out.println(memberVo.getPassword());

		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
		}

		mav.setViewName("home");
		
		return mav;
	}
}
