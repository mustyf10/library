package com.mfajandar

class BookReview {
	Book book
	Date dateCreated
	Student student
	String review

static belongsTo=Book

    static constraints = {
	book blank:false, nullable:false
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }

String toString() {
	return book
}
}
