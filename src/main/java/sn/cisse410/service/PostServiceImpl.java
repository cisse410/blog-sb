package sn.cisse410.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import sn.cisse410.entity.Post;
import sn.cisse410.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setCreatedAt(new Date());

        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        Optional<Post> pt = postRepository.findById(id);
        if (pt.isPresent()) {
            Post post = pt.get();
            post.setViewCount(post.getViewCount() + 1);
            return postRepository.save(post);
        } else {
            throw new EntityNotFoundException("Aucun article trouvé");
        }
    }
}
