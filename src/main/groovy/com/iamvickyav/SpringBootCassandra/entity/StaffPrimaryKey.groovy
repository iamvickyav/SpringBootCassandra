package com.iamvickyav.SpringBootCassandra.entity

import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn

@PrimaryKeyClass
class StaffPrimaryKey {

    @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.PARTITIONED)
    Integer id

    @PrimaryKeyColumn(name = "dept", type = PrimaryKeyType.CLUSTERED)
    String dept
}
