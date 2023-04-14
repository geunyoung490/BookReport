package com.project.bookreport.domain;

import com.project.bookreport.domain.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
public class Member extends BaseEntity {

    @Column(length = 20)
    private String username;

    private String password;
}