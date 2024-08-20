package sn.cisse410.service;

import java.util.List;

import sn.cisse410.entity.Post;

public interface PostService {

    /**
     * @param post
     * @return
     */
    Post savePost(Post post);

    /**
     * @return
     */
    List<Post> getAllPosts();

    /**
     * @param id
     * @return
     */
    Post getPostById(Long id);

    /**
     * @param id
     */
    void likePost(Long id);

    /**
     * @param name
     * @return
     */
    List<Post> searchByName(String title);
}
