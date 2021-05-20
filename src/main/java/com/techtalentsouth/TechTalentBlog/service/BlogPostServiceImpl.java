package com.techtalentsouth.TechTalentBlog.service;

import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import com.techtalentsouth.TechTalentBlog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

//    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }

    @Override
    public BlogPost addNewBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }
}
