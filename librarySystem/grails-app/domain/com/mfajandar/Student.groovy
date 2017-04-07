package com.mfajandar

class Student {
	String name
	String email
	String username
	String password
	int studentId
	String course

    static constraints = {
	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false, password:true
	studentId blank:false, nullable:false, unique:true
	course blank:false, nullable:false
    }
}
