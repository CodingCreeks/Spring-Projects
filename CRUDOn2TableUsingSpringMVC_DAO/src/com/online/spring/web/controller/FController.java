package com.online.spring.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.spring.web.dao.SupplierDAO;
import com.online.spring.web.model.Address;
import com.online.spring.web.model.Suppliers;
import com.online.spring.web.model.Suppliers_Address;

@Controller
public class FController {

	HttpSession session;
	Suppliers supplier;
	Address address;
	int result = 0;
	String msg = null;
	ModelAndView mv = new ModelAndView();
	Suppliers_Address suppaddr;

	public static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	static SupplierDAO supdao = context.getBean("DBConnect", SupplierDAO.class);

	@RequestMapping("/showloginsupplier.sbc")
	public String showlogin(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("loginsuppliercmd", supaddr);
		return "loginsupplier.jsp";
	}

	@RequestMapping("/showcreateSupplier.sbc")
	public String showcreateSupplier(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("createsuppliercmd", supaddr);
		return "createsupplier.jsp";
	}

	@RequestMapping("/showcreatsupplier.sbc")
	public String showcreatsupplier(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("createsuppliercmd", supaddr);
		return "createsupplier.jsp";
	}

	@RequestMapping("/showaddsupplier.sbc")
	public String showaddsupplier(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("addsuppliercmd", supaddr);
		return "addsupplier.jsp";
	}

	@RequestMapping("/showsearch.sbc")
	public String showsearch(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("searchusercmd", supaddr);
		map.addAttribute("searchcmd", supaddr);
		return "search.jsp";
	}

	@RequestMapping("/showsupplierhomepage.sbc")
	public String showsupplierhomepage(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("supplierhomepagecmd", supaddr);
		return "supplierhomepage.jsp";
	}

	@RequestMapping("/showeditsupplier.sbc")
	public String showeditsupplier(Model map) {
		Suppliers_Address supaddr = new Suppliers_Address();
		map.addAttribute("editsuppliercmd", supaddr);
		return "editsupplier.jsp";
	}

	@RequestMapping("/checksupplierlogin.sbc")
	public ModelAndView checksupplierlogin(@ModelAttribute("loginsuppliercmd") Suppliers_Address supaddr,
			HttpServletRequest request, ModelAndView mv) {
		String errormsg = null;
		HttpSession session = request.getSession();
		result = supdao.checksupplierlogin(supaddr);
		if (result > 0) {
			session.setAttribute("user", supaddr.getUsername());
			mv.setViewName("supplierhomepage.jsp");
		} else {
			errormsg = "Invaild Credentials";
			mv.setViewName("loginsupplier.jsp");
			mv.addObject("error", errormsg);
		}
		return mv;
	}

	@RequestMapping("/insertsupplier.sbc")
	public String insertsupplier(@ModelAttribute("createsuppliercmd") Suppliers_Address supaddr) {
		result = supdao.insertsupplier(supaddr);
		if (result > 0) {
			return "showloginsupplier.sbc";
		}
		return "createsupplier.jsp";
	}

	@RequestMapping("/updatesupplier.sbc")
	public String updatesupplier(@ModelAttribute("editsuppliercmd") Suppliers_Address supaddr) {
		result = supdao.updatesupplier(supaddr);
		if (result > 0) {
			return "getallsuppliers.sbc";
		}
		return "showeditsupplier.sbc";
	}

	@RequestMapping("/addsupplier.sbc")
	public String addsupplier(@ModelAttribute("addsuppliercmd") Suppliers_Address supaddr) {
		result = supdao.insertsupplier(supaddr);
		if (result > 0) {
			return "supplierhomepage.jsp";
		}
		return "addsupplier.jsp";
	}

	@RequestMapping("/getsupplierDataForEdit.sbc")
	public ModelAndView getsupplierDataForEdit(@ModelAttribute("viewallsupplierscmd") Suppliers_Address supaddr) {
		Suppliers_Address supaddress = new Suppliers_Address();
		supaddress = supdao.getsupplierDataForEdit(supaddr);
		ModelAndView mv = new ModelAndView();
		mv.addObject("editsuppliercmd", supaddress);
		mv.setViewName("editsupplier.jsp");
		return mv;
	}

	@RequestMapping("/removesupplier.sbc")
	public String removesupplier(@ModelAttribute("viewallsupplierscmd") Suppliers_Address supaddr) {
		result = supdao.removesupplier(supaddr);
		if (result > 0) {
			return "getallsuppliers.sbc";
		}
		return "getallsuppliers.sbc";
	}

	@RequestMapping("/getallsuppliers.sbc")
	public String getallsuppliers(Model map) {
		List<Suppliers_Address> lsupaddr = new ArrayList<Suppliers_Address>();
		Suppliers_Address supaddr = new Suppliers_Address();
		lsupaddr = supdao.getallsuppliers();
		map.addAttribute("supplierslist", lsupaddr);
		map.addAttribute("viewallsupplierscmd", supaddr);
		map.addAttribute("searchsupplierscmd", supaddr);
		mv.setViewName("viewallsuppliers.jsp");
		return "viewallsuppliers.jsp";
	}
	
	@RequestMapping("searchsupplierID.sbc")
	public ModelAndView searchsupplierid(@ModelAttribute("searchcmd") Suppliers_Address lsuppaddr, ModelAndView mv, Model map) {

		System.out.println("SupplierID in controller :" + lsuppaddr.getSupplierID());

		if (lsuppaddr.getSupplierID() != 0) {
			result = supdao.searchsupplierid(lsuppaddr);
			if (result > 0) {
				msg = "Already SupplierID Existing ------!";
				map.addAttribute("searchsuppliercmd", lsuppaddr);
				mv.addObject("message", msg);
				mv.setViewName("showsearch.sbc");
				return mv;

			} else {
				msg = "Invaild SupplierID---!";
				map.addAttribute("searchsupplierscmd", lsuppaddr);
				mv.addObject("message", msg);
				mv.setViewName("showsearch.sbc");
				return mv;
			}
		} else {
			msg = "Please enter the supplierID you want to Search............";
			map.addAttribute("searchsupplierscmd", lsuppaddr);
			mv.addObject("message", msg);
			mv.setViewName("showsearch.sbc");
			return mv;
		}
	}
	@RequestMapping("searchsupplierid.sbc")
	public ModelAndView searchsuppliersid(@ModelAttribute("searchsupplierscmd") Suppliers_Address lsuppaddr, ModelAndView mv) {
		
		System.out.println("SupplierID in controller :" + lsuppaddr.getSupplierID());
		
		if (lsuppaddr.getSupplierID() != 0) {
			result = supdao.searchsupplierid(lsuppaddr);
			if (result > 0) {
				msg = "Already SupplierID Existing ------!";
				Suppliers_Address supaddr = new Suppliers_Address();
				supaddr=supdao.getsupplierDataForEdit(lsuppaddr);
				System.out.println("SupplierID in after getmethod :" + supaddr.getSupplierID());
				mv.addObject("searchsuppliercmd", supaddr);
				mv.addObject("message", msg);
				mv.setViewName("searchsupplier.jsp");
				return mv;
				
			} else {
				msg = "Invaild SupplierID---!";
				mv.addObject("message", msg);
				mv.setViewName("getallsuppliers.sbc");
				return mv;
			}
		} else {
			msg = "Please enter the supplierID you want to Search............";
			mv.addObject("message", msg);
			mv.setViewName("getallsuppliers.sbc");
			return mv;
		}
	}

	@RequestMapping("/checkusername.sbc")
	public ModelAndView checkusename(@ModelAttribute("searchusercmd") Suppliers_Address supaddr, ModelAndView mv) {
		String message = null;
		System.out.println("UserName :" + supaddr.getUsername());
		result = supdao.checkuser(supaddr);
		if (result > 0) {
			message = "Found the Username";
			mv.addObject("message", message);
			mv.setViewName("showsearch.sbc");
		} else {
			message = "Username not available";
			mv.setViewName("showsearch.sbc");
			mv.addObject("message", message);
		}
		return mv;
	}

	@RequestMapping("/logoutsupplier.sbc")
	public String logoutsupplier(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "showloginsupplier.sbc";
	}

}
