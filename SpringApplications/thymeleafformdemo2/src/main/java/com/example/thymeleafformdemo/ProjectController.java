package com.example.thymeleafformdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

// sourced from from:
//
// https://attacomsian.com/blog/spring-boot-thymeleaf-form-handling
//

@Controller

public class ProjectController {
	@Autowired
    private HttpSession session;
	
	
	
    @GetMapping("/create-project")
    public String createProjectForm(Model model) {

        model.addAttribute("project", new Project());
        return "create-project";
    }

    @PostMapping("/save-project")
    public String saveProjectSubmission(Model model, Project project) {
    	List <Project> pList = null;
    	if(session.getAttribute("projectList")==null){
    		pList=new ArrayList<>();
    	}
    	else
    	{
    		pList =(List<Project>)session.getAttribute("projectList");
    	}
    			pList.add(project);
    			session.setAttribute("projectList", pList);
    			model.addAttribute("projectList",pList);
    		       
    
        return "result";
    }
}