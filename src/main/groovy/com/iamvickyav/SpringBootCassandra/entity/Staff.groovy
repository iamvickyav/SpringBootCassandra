package com.iamvickyav.SpringBootCassandra.entity

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table(value = "Staff")
class Staff {

    @PrimaryKey
    StaffPrimaryKey pk

    String name

    List<String> subjects
}