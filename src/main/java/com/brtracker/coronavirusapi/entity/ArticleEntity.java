package com.brtracker.coronavirusapi.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@ToString
public class ArticleEntity {

    @Id
    String url;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    SourceEntity source;

    String author;

    String title;

    @Lob
    @Column(length = 1000)
    String description;

    @Lob
    @Column(length = 1000)
    String urlToImage;

    String publishedAt;

    @Lob
    @Column(length = 100000)
    String content;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;


}
