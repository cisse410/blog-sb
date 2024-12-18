package sn.cisse410.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.cisse410.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByTitleContaining(String title);

}
