package com.mfajandar

class BootStrap {

    def init = { servletContext ->
	def course1=new Course(
		title:'English',
		code:'a1',
		leader:'Leader Uno',
		department:'Languages',
		description:'The greatest language in the world!',
		studyMode:'hardcore').save()

	def course2=new Course(
		title:'Computing',
		code:'a2',
		leader:'Leader Dos',
		department:'ACES',
		description:'Techy stuff!',
		studyMode:'proper hardcore').save()

	def library1=new Library(
		nameOfBuilding:'Building 1',
		address:'One Street, City, WS15 5TG',
		openingHours:'11-4',
		location:'Yorkshire',
		studySpaces:'4').save()

	def library2=new Library(
		nameOfBuilding:'Building 2',
		address:'Second Street, City, JH15 5TU',
		openingHours:'11-4',
		location:'West Midlands',
		studySpaces:'9').save()

	def librarian1=new Librarian(
		name:'Joe JoJo',
		email:'jj@gmail.com',
		office:'112',
		username:'jj112',
		password:'joesdog',
		telephone:'01132546789',
		library:library2).save()

	def librarian2=new Librarian(
		name:'Marty Mcphareson',
		email:'mm@gmail.com',
		office:'212',
		username:'mm212',
		password:'martyssdog',
		telephone:'01132546786',
		library:library1).save()

	def student1=new Student(
		name:'Raymond Lake',
		email:'rlake@gmail.com',
		username:'rlake',
		password:'lakeysdog',
		studentId:'213487',
		course:course1,
		library:library2).save()

	def student2=new Student(
		name:'Dorothy Smith',
		email:'dsmith@gmail.com',
		username:'dsmith',
		password:'smithysdog',
		studentId:'248259',
		course:course2,
		library:library1).save()

	def book1=new Book(
		title:'Much Ado About Nothing',
		subject:'English',
		author:'William Shakespeare',
		isbn:'a123456789',
		student:student1,
		dateBorrowed:new Date('21/3/2017'),
		returnDate:new Date('28/3/2017'),
		overdue:'TRUE').save()

	def book2=new Book(
		title:'Programming Principles and Practice using C++',
		subject:'Computing',
		author:'Bjarne Stroustrup',
		isbn:'a987654321',
		student:student2,
		dateBorrowed:new Date('1/4/2017'),
		returnDate:new Date('8/4/2017'),
		overdue:'FALSE').save()

	def review1=new BookReview(
		book:book1,
		dateCreated:new Date('3/3/2017'),
		student:student1,
		review:'This raving review is outstanding!').save()

	def review2=new BookReview(
		book:book2,
		dateCreated:new Date('3/2/2017'),
		student:student2,
		review:'This book is boring!').save()


    }
    def destroy = {
    }
}
