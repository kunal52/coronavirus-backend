package com.brtracker.coronavirusapi.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@ToString
public class SourceEntity {

    @GeneratedValue
    @Id
    private Long sourceId;

    private String id;

    private String name;


}
