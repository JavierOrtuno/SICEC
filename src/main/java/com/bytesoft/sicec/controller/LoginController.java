/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesoft.sicec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller component for login.
 */
@Controller
public class LoginController {

    /**
     * Get the login Page.
     * @return login page
     */
    @RequestMapping(value = {"/login.html", "/"}, method = {RequestMethod.GET})
    public String getLoginPage() {
        return "login/login";
    }

    /**
     * Get the home page.
     * @return home page
     */
    @RequestMapping(value = {"/home.html"}, method = {RequestMethod.GET})
    public String getHome() {
        return "helloWorld";
    }
}
