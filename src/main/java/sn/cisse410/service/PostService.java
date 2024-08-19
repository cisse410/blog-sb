package sn.cisse410.service;

import java.util.List;

import sn.cisse410.entity.Post;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();
}
