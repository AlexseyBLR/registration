package com.compit.registration.controller;


import com.compit.registration.entity.User;
import com.compit.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class AppController {

    @Autowired
    private UserService userService;

    /*
    GO TO REGISTRATION
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String goToRegistration(ModelMap modelMap){
        modelMap.addAttribute("newUser", new User());
        modelMap.addAttribute("updateUser", userService.findByUsername("melescenya"));
        System.out.println(userService.findByUsername("melescenya"));
        return "RegistrationPage";
    }

    /*
    REGISTRATION
     */
    @RequestMapping(value = "/registered", method = RequestMethod.POST)
    public String registration(@ModelAttribute("newUser") User user, BindingResult bindingResult, Model model) {
//        userValidator.validate(userForm, bindingResult);
//        if (bindingResult.hasErrors()) {
//            return "RegistrationPage";
//        }
        System.out.println(user);
//        userService.save(user);
//        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());
        return "User";
    }

}
