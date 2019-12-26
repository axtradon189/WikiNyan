<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="author" content="Adib, Farrell, Waskito">
	<meta name="description" content="WikiNyan">
	<title>WikiNyan | Home</title>
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="CSS/style.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
	<script src="..\Project\jQuery"></script>

	<script>
		$(document).ready(function(){
			$("#").click(function(){
				$(this).hide();
			});
		});
	</script>
	<!--<script>
		var nama = prompt('Masukan Nama Anda :');
		alert('Hai hai, ' + nama);
		alert('Enjoy our web yaa');
	</script>-->
</head>
<style>
	html {
		scroll-behavior: smooth;
	}

	#section{

	}
</style>
<body>
<!-- Big Banner -->
<div id="div">
<div class="big-banner">
	<div class="menu">
		<div class="box">
			<div class="logo">
				<h1>Wiki<span class="red">Nyan</span></span></h1>
			</div>
			<div class="menulist">
				<a href="index.jsp">Home</a>
				<a href="MeoHere.jsp">Paw Here</a>
				<a href="forum.jsp">Meow Forum</a>
                                <a href="LoginAdmin.jsp">Login As Admin |</a>
                                <a href="LoginMember.jsp">Login As Member</a>
			</div>
		</div>
	</div>
	<div class="banner-text">
		<div class="box">
			<h1>Welcome to <span class="bold">WikiNyan</span></h1>
		<a href="#section" class="btn-scroll">Scroll Down</a>
		</div>
	</div>
</div>
<!-- End Big Banner -->


<!-- Contenct -->
<div class="advantage" id="section">
	<div class="box">
		<div class="col-300">
			<h1>Apa itu WikiNyan?</h1>
			<p>WikiNyan adalah website untuk mengenalkan jenis-jenis ras kucing kepada para pembaca, dan menginfluence pembaca agar lebih suka / tertarik pada kucing muehehe. Check our instagram for more cuteness</p>
			<a href="https://www.instagram.com/wiki_nyan/" class="btn-more">Find More</a>
		</div>
		<div class="col-600">
			<img src="image/bggg.jpg" alt="WikiNyan">
		</div>
	</div>
</div>
<!-- End Content -->

<!-- About Us -->
<div class="feature">
	<div class="box">
		<center><h3>About Us</h3></center>
		<br>
		<div class="col-3">
			<img src="image/icon/Picture3.png" alt="Farrell Marston">
			<h3>Farrell Marston</h3>
			<p>Editor</p>
			<a href="https://www.instagram.com/axtradon/"><img src="image/icon/ig.png"></a>
		</div>
		<div class="col-3">
			<img src="image/icon/Picture2.png" alt="M. Adib Alfaini Afifi">
			<h3>Muhammad Adib Alfaini Afifi</h3>
			<p>Founder</p>
			<a href="https://www.instagram.com/adibalfaini.af/"><img src="image/icon/ig.png"></a>
		</div>
		<div class="col-3">
			<img src="image/icon/Picture1.png" alt="Waskito Melianto">
			<h3>Waskito Melianto</h3>
			<p>Co-Founder</p>
			<a href="https://www.instagram.com/wmelianto/"><img src="image/icon/ig.png"></a>
		</div>
	</div>
</div>
<!-- End About Us -->

<!-- Footer -->
<div class="footer">
	<div class="box">
		<p><b>WikiNyan</b> &copy; 2019</p>
	</div>
</div>
</div>
<!-- End Footer -->
</body	>
</html>