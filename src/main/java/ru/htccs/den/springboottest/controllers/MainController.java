package ru.htccs.den.springboottest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Контроллер для сопоставления, страница по умолчанию для ввода логина и пароля
 */
@Controller
public class MainController {

    /*@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
    public ModelAndView welcomePage(Model model) {
        ModelAndView retValue = new ModelAndView();
        //retValue.setViewName("welcomePage");
        return retValue;
    }*/

    @RequestMapping(value={ "/login" }, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView retValue = new ModelAndView();
        return retValue;
    }

}
