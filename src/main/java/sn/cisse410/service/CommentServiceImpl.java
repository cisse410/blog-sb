package sn.cisse410.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import sn.cisse410.entity.Comment;
import sn.cisse410.entity.Post;
import sn.cisse410.repository.CommentRepository;
import sn.cisse410.repository.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public Comment createComment(Long postId, String postedBy, String content) {
        Optional<Post> postOptional = postRepository.findById(postId);
        if (postOptional.isPresent()) {
            Comment comment = new Comment();
            comment.setPost(postOptional.get());
            comment.setContent(content);
            comment.setPostedBy(postedBy);
            comment.setCreatedAt(new Date());

            return commentRepository.save(comment);
        } else {
            throw new EntityNotFoundException("Article non trouvé");
        }
    }
}
