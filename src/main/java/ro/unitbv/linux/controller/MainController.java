package ro.unitbv.linux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ro.unitbv.linux.entity.Mail;
import ro.unitbv.linux.entity.Role;
import ro.unitbv.linux.entity.UserAccount;
import ro.unitbv.linux.service.CommandService;
import ro.unitbv.linux.service.EmailService;
import ro.unitbv.linux.service.RoleService;
import ro.unitbv.linux.service.UserAccountService;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    RoleService roleService;

    @Autowired
    private EmailService emailService;

    @Autowired
    CommandService commandService;

    @Autowired
    UserAccountService userAccountService;

    @GetMapping(value = "/index")
    public ModelAndView openIndex(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @GetMapping(value = "/distributii")
    public ModelAndView openDistributii(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("distributii");
        return mav;
    }

    @GetMapping(value = "/istoria")
    public ModelAndView openIstoria(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("istoria");
        return mav;
    }

    @GetMapping(value = "/despre")
    public ModelAndView openDespre(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("despre");
        return mav;
    }


    @GetMapping(value = "/login")
    public ModelAndView openLogin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @GetMapping(value = "/register")
    public ModelAndView openRegister(Model model){
        ModelAndView mav = new ModelAndView();
        UserAccount userAccount = new UserAccount();
        List<Role> roleList = roleService.listAllRoles();
        model.addAttribute("user", userAccount);
        model.addAttribute("roleList", roleList);
        mav.setViewName("register");
        return mav;
    }

    @GetMapping("/chat-login")
    public ModelAndView login() {
        return new ModelAndView("/chat-login");
    }

    @GetMapping("/chat")
    public ModelAndView index(String username, HttpServletRequest request) throws UnknownHostException {
        //TODO: add code for login to chatroom.
        //Validation of username
        if (username == null || username == "") {
            username = "test";
        }

        ModelAndView mv = new ModelAndView("/chat");
        mv.addObject("username", username);
        mv.addObject("url", InetAddress.getLocalHost().getHostName() + ":" +  request.getServerPort()+request.getContextPath() + "/chat" );
        return mv;
    }

    @GetMapping(value = "/profile")
    public ModelAndView openProfile(Model model){
        ModelAndView mav = new ModelAndView();
        UserAccount userAccount = new UserAccount();
        List<Role> roleList = roleService.listAllRoles();
        model.addAttribute("user", userAccount);
        model.addAttribute("roleList", roleList);
        mav.setViewName("profile");
        return mav;
    }

    @GetMapping(value = "/wiki")
    public ModelAndView openWiki(Model model){
        model.addAttribute("commands", commandService.getCommands());
        return new ModelAndView("/wiki");
    }

    @RequestMapping(value="/sendMail")
    public ModelAndView sendMail(@ModelAttribute Mail mail, Model model) {
        String done = this.emailService.sendMail(mail);
        String status = "Mail-ul a fost trimis cu succes!";
        model.addAttribute("status",status);
        return new ModelAndView("/despre");
    }

    @GetMapping(value = "/admin")
    public ModelAndView openAdmin(Model model){

        model.addAttribute("commands",commandService.getCommands());
        model.addAttribute("users", userAccountService.getUsers());
        return new ModelAndView("/admin");
    }

    @GetMapping(value = "/CommandAddForm")
    public ModelAndView openCommandForm(){
        return new ModelAndView("/CommandAddForm");
    }
}
