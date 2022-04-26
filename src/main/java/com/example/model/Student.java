/*
create jpa Entity with mapping.xml
<entity-mappings xmlns="http://xmlns.jcp.org/xml/ns/persistence/orm" version="2.1">
<description>XML Student mapping</description>

<entity class="com.example.model.Student">
<table name="student" />

<attributes>
<id name="id">
<generated-value strategy="AUTO" />
</id>

<basic name="firstName">
<column name="first_name" length="158" />
</basic>

<basic name="lastName">
<column name="last_name" length="200" />
</basic>
</attributes>
</entity>
</entity-mappings>-->

We can achieve the same result using the java annotations
*/
package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 150)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 250)
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
