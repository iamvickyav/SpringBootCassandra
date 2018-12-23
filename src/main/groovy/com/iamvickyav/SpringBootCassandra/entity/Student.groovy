package com.iamvickyav.SpringBootCassandra.entity

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@Table(value = "Student")
class Student {

    @PrimaryKey
    Integer id

    String name

    String dept

    @Column("year_of_joining")
    Integer yearOfJoining
}