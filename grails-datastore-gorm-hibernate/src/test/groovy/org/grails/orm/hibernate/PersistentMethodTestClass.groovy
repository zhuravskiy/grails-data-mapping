package org.grails.orm.hibernate

class PersistentMethodTestClass {
    Long id
    Long version

    String firstName
    String lastName
    Integer age
    boolean active = true

    static constraints = {
        firstName(size:4..15)
    }
}
