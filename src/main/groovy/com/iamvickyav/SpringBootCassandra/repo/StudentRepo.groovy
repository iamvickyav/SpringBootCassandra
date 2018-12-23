package com.iamvickyav.SpringBootCassandra.repo

import com.iamvickyav.SpringBootCassandra.entity.Student
import org.springframework.data.cassandra.repository.CassandraRepository

interface StudentRepo extends CassandraRepository<Student, Integer> {
}
