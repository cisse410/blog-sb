package sn.cisse410.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.cisse410.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
