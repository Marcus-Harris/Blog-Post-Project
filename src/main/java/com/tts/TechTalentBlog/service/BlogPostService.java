package com.tts.TechTalentBlog.service;

import com.tts.TechTalentBlog.model.BlogPost;

import java.util.Optional;

// this service is going to serve as a contract
// for our implementation
public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

    Iterable<BlogPost> getAllBlogPosts();

    void deletePostById(Long id);
}