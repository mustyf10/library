<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Student Library System</title>
    <asset:stylesheet src="home.css" />	
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
   <div id="content" role="main">
	<section class="row colset-2-its">
            <h1>Welcome to Universal Student Library System!</h1>
	<div class ="row">
	<div class="first">
		<h3>Course Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="course" action="create">Courses</g:link>
	</button>
</div>
	<div class="second">
		<h3>Student Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="student" action="create">Student</g:link>
	</button>
</div>
	<div class="first">
		<h3>Librarian Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="librarian" action="create">Librarian</g:link>
	</button>
</div>
	<div class="second">
		<h3>Library Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="library" action="create">Library</g:link>
	</button>
</div>
	<div class="first">
		<h3>Book Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="book" action="create">Books</g:link>
	</button>
</div>
	<div class="second">
		<h3>Book Review Management</h3>
	<p></p>
	<button type="button" class="btn btn-success">
		<g:link controller="BookReview" action="create">Book Reviews</g:link>
	</button>
</div>

</div>
</div>
</body>
</html>
