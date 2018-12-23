package com.iamvickyav.SpringBootCassandra.repo

import com.iamvickyav.SpringBootCassandra.entity.Staff
import com.iamvickyav.SpringBootCassandra.entity.StaffPrimaryKey
import org.springframework.data.cassandra.repository.CassandraRepository

interface StaffRepo extends CassandraRepository<Staff, StaffPrimaryKey>{
}
