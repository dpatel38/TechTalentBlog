package com.techtalentsouth.TechTalentBlog.service;

import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import com.techtalentsouth.TechTalentBlog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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

    @Override
    public Iterable<BlogPost> getAllBlogPost() {
        return blogPostRepository.findAll();
    }


    @Override
    public void deletePostById(Long id){
           blogPostRepository.deleteById(id);
    }

    @Override
    public Optional<BlogPost> editPostById(Long id) {
        return blogPostRepository.findById(id);
    }


    @Override
    public BlogPost save(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }




}
