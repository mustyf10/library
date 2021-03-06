package com.mfajandar

class Book {
	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	Student student
	Boolean overdue

static hasMany=[bookReviews:BookReview,libraries:Library]
static belongsTo=Library

String toString(){
	"$title,$subject,$author"
}

    static constraints = {
	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false, unique:true
    }
}
