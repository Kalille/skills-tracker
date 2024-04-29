package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping("hello")
    public String skillsHeader() {
        return "<h1>Skills Tracker<h1>" +
                "<h2>" +
                "<ol>1. Ruby</ol>" +
                "<ol>2. Java</ol>" +
                "<ol>3.  Javascript</ol>" +
                "</h2>";
    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "skills")
    public String skillsPost(@RequestParam String name, @RequestParam String skill1,@RequestParam String skill2,@RequestParam String skill3){

        return "<h1>"+ name + "<h1>" +
                "<h2>" +
                "<ol> 1. " + skill1 + "</ol>" +
                "<ol> 2. " + skill2 +"</ol>" +
                "<ol> 3. " + skill3 + "</ol>" +
                "</h2>";
    }
//    public String createSkills(String name, String skill1, String skill2, String skill3) {
//        return "<h1>Skills Tracker<h1>" +
//                "<h2>" +
//                "<ol>Ruby</ol>" +
//                "<ol> Java</ol>" +
//                "<ol> Javascript</ol>" +
//                "</h2>";
//    }
    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='skills' method='post'>" +
                "<label for=\"name-input\">Name:</label>" +
                "<input type='text' name='name' id='name-input'/>" +
                "<br>" +
                "<label for=\"skill-select1\">My favorite Language:</label>\n" +
                "<select name=\"skill1\" id=\"skill-select1\">\n" +
                "<option value=\"java\" selected>Java</option>\n" +
                "<option value=\"ruby\">Ruby</option>\n" +
                "<option value=\"javascript\">Javascript</option>\n" +
                "</select>\n" +
                "<br>" +
                "<label for=\"skill-select2\">My Second favorite Language:</label>\n" +
                "<select name=\"skill2\" id=\"skill-select2\">\n" +
                "<option value=\"java\" selected>Java</option>\n" +
                "<option value=\"ruby\">Ruby</option>\n" +
                "<option value=\"javascript\">Javascript</option>\n" +
                "</select>\n" +
                "<br>" +
                "<label for=\"skill-select3\">My third favorite Language:</label>\n" +
                "<select name=\"skill3\" id=\"skill-select3\">\n" +
                "<option value=\"java\" selected>Java</option>\n" +
                "<option value=\"ruby\">Ruby</option>\n" +
                "<option value=\"javascript\">Javascript</option>\n" +
                "</select>\n" +
                "<br>" +
                "<input type='submit' value='enter'/>" +
                "</form>" +
                "</body>" +
                "</html>";

    }


}





