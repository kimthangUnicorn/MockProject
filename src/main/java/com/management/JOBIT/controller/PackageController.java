package com.management.JOBIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.management.JOBIT.model.PackageName;
import com.management.JOBIT.model.User;
import com.management.JOBIT.service.UserService;
@Controller
public class PackageController {
	@Autowired
	private UserService userService;

	@GetMapping("/package")
	public String showPackageForm(Model model) {
		// create model attribute to bind form data
		PackageName pack = new PackageName();
		model.addAttribute("package", pack);
		return "regisPackage";
	}

	@PostMapping("/savePack")
	public String savePackage(@ModelAttribute("package") PackageName pack) {
		userService.savePackage(pack);
		return "redirect:/";
	}

//	@GetMapping("/showFormForUpdate/{id}")
//	public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model) {
//		User user = userService.getUserById(id);
//		model.addAttribute("user", user);
//		return "update_user";
//	}	
//
//	@GetMapping("/deleteUser/{id}")
//	public String deleteUser(@PathVariable(value = "id") Integer id) {
//
//		// call delete employee method
//		this.userService.deleteUserById(id);
//		return "redirect:/";
//	}
	
}
