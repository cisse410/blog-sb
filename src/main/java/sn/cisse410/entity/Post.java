package sn.cisse410.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    @Column(length = 5000)
    private String content;

    private String author;

    private String image;

    private Date createdAt;

    private int likeCount;

    private int viewCount;

    private List<String> tags;
}
