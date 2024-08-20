package sn.cisse410.service;

import sn.cisse410.entity.Comment;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);
}
