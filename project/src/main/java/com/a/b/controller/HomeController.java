package com.a.b.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.a.b.service.BBookContentService;
import com.a.b.service.BBookDeleteService;
import com.a.b.service.BBookModifyService;
import com.a.b.service.BBookjoinService;
import com.a.b.service.BBooklistService;
import com.a.b.service.BFormListService;
import com.a.b.service.BOrderService;
import com.a.b.service.BWriteService;
import com.a.b.service.CommonService;
import com.a.b.service.Constant;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	CommonService service;
	
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		model.addAttribute("locale", locale);
		return "home";
	}
	
	@RequestMapping("/bookjoin")
	public String bookjoin(HttpServletRequest request, Model model) {
		System.out.println("bookjoin()");
		
		model.addAttribute("request", request);
		service = new BBookjoinService();
		service.execute(model);
		
		return "redirect:booklist";
	}
	
	
	@RequestMapping("/formList")
	public String formList(Model model) {
		System.out.println("formList()");
		
		service = new BFormListService();
		service.execute(model);
		
		return "formList";
	}
	
	
	
	@RequestMapping("/orders")
	public String orders(Model model) {
		System.out.println("orders()");
		
		service = new BOrderService();
		service.execute(model);
		
		return "orders";	
	}
	
	@RequestMapping("/booklist")
	public String booklist(Model model) {
		System.out.println("booklist()");
		
		service = new BBooklistService();
		service.execute(model);
		
		return "booklist";
	}
	
	@RequestMapping("/book_view")
	public String book_view(Model model) {
		System.out.println("book_view()");
		
		return "book_view";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
	
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		service = new BWriteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		service = new BContentService();
		service.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping("book_content")
	public String book_content(HttpServletRequest request, Model model) {
		System.out.println("book_content()");
		
		model.addAttribute("request", request);
		service = new BBookContentService();
		service.execute(model);
		
		return "book_content";
	}

	@RequestMapping(method=RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		service = new BModifyService();
		service.execute(model);
	
		return "redirect:list";
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/bookmodify")
	public String bookmodify(HttpServletRequest request, Model model) {
		System.out.println("bookmodify()");
		
		model.addAttribute("request", request);
		service = new BBookModifyService();
		service.execute(model);
		
		return "redirect:booklist";
	}

	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		service = new BReplyViewService();
		service.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);
		service = new BReplyService();
		service.execute(model);
	
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		service = new BDeleteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/bookdelete")
	public String bookdelete(HttpServletRequest request, Model model) {
		System.out.println("bookdelete");
		
		model.addAttribute("request", request);
		service = new BBookDeleteService();
		service.execute(model);
		
		return "redirect:booklist";
	}
}
