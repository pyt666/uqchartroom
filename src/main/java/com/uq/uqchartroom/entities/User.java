package com.uq.uqchartroom.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Description TODO
 * @Author pyt
 * @Date 2019/4/2 15:25
 * @Version
 */
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Setter
    @Getter
    @GeneratedValue(generator = "IdGenerator")
    @GenericGenerator(name = "IdGenerator",strategy = "com.uq.uqchartroom.utils.IdGenerator",
            parameters = {})
    private Long id;
    @Setter
    @Getter
    private String username;
    @Setter
    @Getter
    private String userip;
}
