package com.techtalentsouth.TechTalentBlog.controller;

import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import com.techtalentsouth.TechTalentBlog.repository.BlogPostRepository;
import com.techtalentsouth.TechTalentBlog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {

    @Autowired
    BlogPostService blogPostService;

//    public BlogPostController(BlogPostService blogPostService) {
//        this.blogPostService = blogPostService;
//    }

    @GetMapping(value="/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }

//    private BlogPost blogPost;

    @PostMapping(value = "/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostService.addNewBlogPost(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }
}
