package com.techtalentsouth.TechTalentBlog.service;

import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import java.util.Optional;


//this service is going to serve as a contract
//for our implementation
public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

    Iterable<BlogPost> getAllBlogPost();

    void deletePostById(Long id);

    Optional<BlogPost> editPostById(Long id);

    BlogPost save(BlogPost blogPost);

    Optional<BlogPost> viewPostById(Long id);





}
