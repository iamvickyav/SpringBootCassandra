# SpringBoot with Cassandra

## Running Cassandra in Local 
#### To Install Cassandra in Mac
```
brew install Cassandra
```

#### To Start Cassandra

```
cassandra -f
```

#### To access Cassandra from Terminal
```
cqlsh
```

## Getting Started with Cassandra

#### Creating Keyspace
```sql
CREATE KEYSPACE Sample WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};

use Sample;
```

#### Creating Cassandra Table

```sql
CREATE TABLE Student(
    id int,
    name text,
    dept text,
    year_of_joining int,
    PRIMARY KEY (id)
);

CREATE TABLE Staff (
    id int, 
    name text,
    dept text,
    subjects list<text>, 
    PRIMARY KEY (id, dept)
);
```
#### Inserting sample data in Table

```sql
INSERT INTO Student (id, name, dept, year_of_joining) 
VALUES (1, 'Vicky', 'CSE', 2010);

INSERT INTO Staff (id, name, dept, subjects) 
VALUES (1, 'Selvam', 'CSE', ['Compiler Design', 'Operating System']);
```

Ok, now the DB is ready..! Lets start building the Spring Boot part

Go to https://start.spring.io & choose dependecies web, cassandra. Note: Don't chose JPA dependency when you use Cassandra.

In application.properties, give the keyspace name. 

```
spring.data.cassandra.keyspace-name=Sample
```

Create your own Repo interface extending CassandraRepository

```java
interface StudentRepo extends CassandraRepository<Student, Integer> {
}
```
