package com.mfajandar

class Course {
	String title
	String code
	String leader
	String department
	String description
	String studyMode

    static constraints = {
	title blank:false, nullable:false
	code blank:false, nullable:false
	leader blank:false, nullable:false
	department blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	studyMode blank:false, nullable:false, maxSize:20
    }

String toString() {
	return title
}
}
