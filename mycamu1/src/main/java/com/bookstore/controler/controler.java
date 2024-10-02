package com.bookstore.controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.detail;
import com.bookstore.dto.adddto;
import com.bookstore.dto.addstudentdto;
import com.bookstore.servie.deatailserive;

import jakarta.servlet.http.HttpSession;

@Controller
public class controler {
	@Autowired
    private  deatailserive detailService;
 
   @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
    	//detail user = detailService.findByUsernameAndPassword(username, password);
    	detail user = detailService.findByUsernameAndPassword(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            switch (user.getRole()) {
                case "ROLE_USER":
                    return "user_home";
                case "ROLE_MANAGER":
                    return "manager_home";
                case "ROLE_TEACHER":
                    return "teacher_home";
                default:
                    model.addAttribute("error", "Role not recognized");
                    return "login";
            }
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
        }
    @GetMapping("/instrution")
    public String instruction() {
        return "instrution";  // This should correspond to instruction.html
    }
  
    @GetMapping("/annuncement")
    public String annuncement() {
        return "annuncement";  // This should correspond to instruction.html
    }
    @GetMapping("/feelback")
    public String feelback() {
        return "feelback";  // This should correspond to instruction.html
    }
    @GetMapping("/mylearing")
    public String mylearing() {
        return "mylearing";  // This should correspond to instruction.html
    }
    @GetMapping("/paynow")
public String paynow() {
        return "paynow";  // This should correspond to instruction.html
    }
    @GetMapping("/thankyou")
    public String thankyou() {
  	        return "thankyou";  // This should correspond to instruction.html
  	    }
    @GetMapping("/add")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new adddto());
        return "add";
    }
   

    @PostMapping("/add")
    public String registerUserAccount(@ModelAttribute("user") adddto registrationDto) {
    	detailService.save(registrationDto);
        return "thankyou";
    }
    @GetMapping("/addstudent")
    public String showRegistrationForm1(Model model) {
        model.addAttribute("user", new addstudentdto());
        model.addAttribute("suceefull", "regrister");
        return "addstudent";
    }

    @PostMapping("/addstudent")
    public String registerUserAccount1(@ModelAttribute("user") addstudentdto registrationDto1,Model model) {
    	detailService.save(registrationDto1);
    	 model.addAttribute("suceefull", "regrister");
        return "thankyou";
    }
}

