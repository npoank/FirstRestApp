CREATE TABLE Person(
                       id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                       name varchar(100) NOT NULL,
                       age int,
                       email varchar(100)
);


INSERT INTO Person (name, age, email) VALUES ('Jack', 25, 'jack@mail.com');
INSERT INTO Person (name, age, email) VALUES ('Sam', 29, 'sam@mail.com');
INSERT INTO Person (name, age, email) VALUES ('Nick', 19, 'nick@mail.com');