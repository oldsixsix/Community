package com.community.domain;

import javax.persistence.*;

//使用jpa创建数据结构
//告诉jpa这是一个实体类，和数据表映射的类
@Entity
//指定该实体类和那个参数表绑定，如果省略默认表名是user
@Table(name = "jpa_user")
public class User {

    @Id //告诉jpa这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //并且设置为自增主键
    private  Integer id;

    @Column(name = "lastName",length = 10)
    private  String lastName;

    @Column
    private String email;

}
