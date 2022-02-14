package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @RequestMapping("/posts/{id}")
    public Optional<Post> getPost(@PathVariable String id){
        return postService.getPost(id);

    }
    @PostMapping("/posts")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }
    @PutMapping("/posts/{id}")
    public void editPost(@PathVariable String id, @RequestBody Post post){
        postService.editPost(id,post);

    }
    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable String id){
        postService.deletePost(id);

    }

}
