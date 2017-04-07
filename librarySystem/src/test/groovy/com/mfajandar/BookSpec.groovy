package com.mfajandar

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
    	when: "A book has a title, subject and an author"
	def abook=new Book(
	title:'Of Mice and Men',
	author:'John Steinbeck',
	subject:'English')

	then:"The to string method will merge them."

	abook.toString() =='Of Mice and Men,John Steinbeck,English'
    }
}
