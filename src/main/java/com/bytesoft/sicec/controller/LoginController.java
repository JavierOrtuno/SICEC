/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesoft.sicec.controller;

import org.springframework.security.access.annotation.Secured;
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
        return "login";
    }

    /**
     * Get the home page.
     * @return home page
     */
    @RequestMapping(value = {"/common/home.html"}, method = {RequestMethod.GET})
    @Secured("ROLE_USER")
    public String getHome() {
        return "common/helloWorld";
    }

    /**
     * Get the admin home page.
     * @return admin home page
     */
    @Secured("ROLE_ADMIN")
    @RequestMapping(value = {"/admin/admin.html"}, method = {RequestMethod.GET})
    public String getAdminHome() {
        return "admin/helloAdmin";
    }

}
