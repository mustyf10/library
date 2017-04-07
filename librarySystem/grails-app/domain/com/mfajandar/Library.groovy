package com.mfajandar

class Library {
	String nameOfBuilding
	String address
	String openingHours
	String location
	int studySpaces

    static constraints = {
	nameOfBuilding blank:false, nullable:false
	address blank:false, nullable:false, widget:'textarea'
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false, minSize:1, maxSize:50
    }
}
