package com.a.b.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.a.b.service.BookContentService;
import com.a.b.service.BookDeleteService;
import com.a.b.service.BookModifyService;
import com.a.b.service.BookjoinService;
import com.a.b.service.BooklistService;
import com.a.b.service.ContentService;
import com.a.b.service.DeleteService;
import com.a.b.service.FormDeleteService;
import com.a.b.service.FormListService;
import com.a.b.service.FormModifyService;
import com.a.b.service.RentalService;
import com.a.b.service.ReplyService;
import com.a.b.service.ReplyViewService;
import com.a.b.service.WriteService;
import com.a.b.service.CommonService;
import com.a.b.service.Constant;
import com.a.b.service.ListService;
import com.a.b.service.ModifyService;

@Controller
public class HomeController {
	
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
		service = new BookjoinService();
		service.execute(model);
		
		return "redirect:booklist";
	}
	
	
	@RequestMapping("/formList")
	public String formList(Model model) {
		System.out.println("formList()");
		
		service = new FormListService();
		service.execute(model);
		
		return "formList";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		service = new ListService();
		service.execute(model);
		
		return "list";	
	}
	
	@RequestMapping("/orders")
	public String orders(Model model) {
		System.out.println("orders()");
		
		service = new RentalService();
		service.execute(model);
		
		return "orders";	
	}
	
	@RequestMapping("/booklist")
	public String booklist(Model model) {
		System.out.println("booklist()");
		
		service = new BooklistService();
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
		service = new WriteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", request);
		service = new ContentService();
		service.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping("book_content")
	public String book_content(HttpServletRequest request, Model model) {
		System.out.println("book_content()");
		
		model.addAttribute("request", request);
		service = new BookContentService();
		service.execute(model);
		
		return "book_content";
	}

	@RequestMapping(method=RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		service = new ModifyService();
		service.execute(model);
	
		return "redirect:list";
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/bookmodify")
	public String bookmodify(HttpServletRequest request, Model model) {
		System.out.println("bookmodify()");
		
		model.addAttribute("request", request);
		service = new BookModifyService();
		service.execute(model);
		
		return "redirect:booklist";
	}

	@RequestMapping(method=RequestMethod.POST, value = "/formModify")
	public String formModify(HttpServletRequest request, Model model) {
		System.out.println("formModify()");
		
		model.addAttribute("request", request);
		service = new FormModifyService();
		service.execute(model);
		
		return "redirect:formList";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");
		
		model.addAttribute("request", request);
		service = new ReplyViewService();
		service.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request", request);
		service = new ReplyService();
		service.execute(model);
	
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		service = new DeleteService();
		service.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/bookdelete")
	public String bookdelete(HttpServletRequest request, Model model) {
		System.out.println("bookdelete");
		
		model.addAttribute("request", request);
		service = new BookDeleteService();
		service.execute(model);
		
		return "redirect:booklist";
	}
	
	@RequestMapping("/formdelete")
	public String formdelete(HttpServletRequest request, Model model) {
		System.out.println("formdelete");
		
		model.addAttribute("request", request);
		service = new FormDeleteService();
		service.execute(model);
		
		return "redirect:formList";
	}
	
}
