package ro.unitbv.linux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ro.unitbv.linux.dto.CommandDto;
import ro.unitbv.linux.dto.UserAccountRegDto;
import ro.unitbv.linux.entity.Command;
import ro.unitbv.linux.entity.Role;
import ro.unitbv.linux.entity.UserAccount;
import ro.unitbv.linux.service.CommandService;
import ro.unitbv.linux.service.UserAccountService;

import java.util.List;

@Controller
public class CommandController {
    @Autowired
    CommandService commandService;

    @GetMapping("/addCommand")
    public String addCommand(@ModelAttribute CommandDto commandDto){
        commandService.saveCommand(commandDto);
        return "redirect:/admin";
    }

    @GetMapping("/editCommand")
    public String editCommand(@ModelAttribute CommandDto commandDto){
        commandService.saveCommand(commandDto);
        return "redirect:/admin";
    }

    @GetMapping(value = "/editCommand/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") int id) throws Exception{
        ModelAndView editCommand = new ModelAndView("CommandEditForm");
        Command command = commandService.getCommandById(id);
        editCommand.addObject("command",command);
        return editCommand;
    }

    @RequestMapping(path = "/deleteCommand/{id}")
    public String deleteCommandById(@PathVariable("id") int id)
    {
        commandService.deleteCommandById(id);
        return "redirect:/admin";
    }
}
