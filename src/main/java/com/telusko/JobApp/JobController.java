package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        System.out.println("home is called");
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addjob(jobPost);
        return "success";

    }

    @GetMapping("viewalljobs")
    public String viewJob(Model m){
        List<JobPost> jobs= service.getAlljobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

}
