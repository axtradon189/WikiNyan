<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>WikiNyan | Paw Here</title>
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="CSS/stylePawHere.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="jQuery/jQuery.js"></script>
	<script>
	$(document).ready(function(){
		$("#btn").click(function(){
		$("#info").slideDown();
		});
		
		$("#btn1").click(function(){
		$("#info").slideUp();
		});
		});

		$(document).ready(function(){
		$("#btn2").click(function(){
		$("#info2").slideDown();
		});
		
		$("#btn3").click(function(){
		$("#info2").slideUp();
		});
		});

		$(document).ready(function(){
		$("#btn4").click(function(){
		$("#info3").slideDown();
		});
		
		$("#btn5").click(function(){
		$("#info3").slideUp();
		});
		});

		$(document).ready(function(){
		$("#btn6").click(function(){
		$("#info4").slideDown();
		});
		
		$("#btn7").click(function(){
		$("#info4").slideUp();
		});
		});

		$(document).ready(function(){
		$("#btn8").click(function(){
		$("#info5").slideDown();
		});
		
		$("#btn9").click(function(){
		$("#info5").slideUp();
		});
		});

		$(document).ready(function(){
		$("#btn10").click(function(){
		$("#info6").slideDown();
		});
		
		$("#btn11").click(function(){
		$("#info6").slideUp();
		});
		});
</script>
<style>
    button
{
	background: #fff;
	color: #000;
	padding: 10px 15px;
	border-radius: 10px;
	text-decoration: none;
	display: inline-block;
        
}
button:hover
{
	background: #FFEFD5;
	transition: 0.5s;
}
</style>
    
</head>
<body>
<!-- Big Banner -->
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
			</div>
		</div>
	</div>
<!-- End Big Banner -->
<br>
<br>
<br>

<!-- Advantage
<center>
	<div id="caption">
	</div>
	<br>
	<img src="../Project/image/cat/0.png" width="400" id="gambar">
	<br>
	<a href="#" onclick=sebelum()>Previous</a>
	<a href="#" onclick="ganti(0)">1</a>
	<a href="#" onclick="ganti(1)">2</a>
	<a href="#" onclick="ganti(2)">3</a>
	<a href="#" onclick="ganti(3)">4</a>
	<a href="#" onclick="ganti(4)">5</a>
	<a href="#" onclick="ganti(5)">6</a>
	<a href="#" onclick=sesudah()>Next</a>
	<script>
		var nomor = 0;
		var caption = document.getElementById('caption');
		var text = ['Ashera', 'Bengal', 'Persia', 'Peterbald', 'Savannah', 'Sphynx'];
		function ganti(angka){
			nomor = angka;
			var lokasi = 'image/cat/' + angka + '.png';
			document.getElementById('gambar').src = lokasi;
			caption.innerHTML = text[angka];
			return false;
		}
		function sebelum(){
			nomor = nomor - 1;
			if(nomor < 0){
				nomor = 5;
			}
			var lokasi = 'image/cat/' + nomor + '.png';
			document.getElementById('gambar').src = lokasi;
			caption.innerHTML = text[nomor];
			return false;
		}
		function sesudah(){
			nomor = nomor + 1;
			if(nomor > 5){
				nomor = 0;
			}
			var lokasi = 'image/cat/' + nomor + '.png';
			document.getElementById('gambar').src = lokasi;
			caption.innerHTML = text[nomor];
			return false;
		}
	</script>
</center>
End Advantage -->
<!-- Slideshow -->
<center>
<section class="slider">
<div class="slider">
<ul>
     <li>
         <img alt="" src="image/cat/1.png"/>
         </a>
     </li>

     <li>
          <img alt="" src="image/cat/2.png"/>
         </a>
     </li>

     <li>
          <img alt="" src="image/cat/3.png"/>
         </a>
     </li>
     <li>
          <img alt="" src="image/cat/5.png"/>
         </a>
     </li>
     <li>
          <img alt="" src="image/cat/6.png"/>
         </a>
     </li>
 </ul>
</div>
<link rel="stylesheet" type="text/css" href="css/header.css">

  <div class="snow2"></div>
  <div class="snow3"></div>
  <div class="snow1"></div>
<br>
<br>
</center>
<!-- Feature -->
<div class="feature">
	<h3>WikiNyan Galery</h3>
	<br>
	<div class="box">
		<div class="col-3">
			<img src="image/catIcon/0.jpg" alt="Ashera">
			<h3>Ashera</h3>
			<button id="btn">View More</button>
			<div id="info" style="display:none">
			<p>Kucing jenis Ashera dikenal sebagai kucing hibrida Afrika dan kucing macan Asia. Kucing ini menjadi yang paling langka di dunia karena kecerdasan dan kesetiaannya. Kucing ini disilangkan oleh perusahaan Lifestyle Pets yang berfokus pada hewan peliharaan eksklusif. Harga kucing Ashera sendiri mencapai 20 ribu hingga 100 ribu USD atau sekitar Rp280 juta hingga Rp1,4 miliar.</p>
			<button id="btn1">Close</button>
		</div>

		</div>
		<div class="col-3">
			<img src="image/catIcon/1.jpg" alt="Bengal">
			<h3>Bengal</h3>
			<button id="btn2">View More</button>
			<div id="info2" style="display:none">
			<p>Ras Bengal populer karena keindahan corak bulunya yang seperti harimau dengan pola tutul dan garis. Ditemukan oleh seorang ilmuwan bernama Dr. Centerwall, kucing ini merupakan hasil persilangan dari kucing American Short Hair dan kucing Leopard Asia. Bengal baru dapat dijadikan hewan setelah melalui tiga generasi. Harga kucing Bengal sendiri bisa mencapai 1000 hingga 25 ribu USD atau sekitar Rp14 juta hingga Rp350 juta.</p>
			<button id="btn3">Close</button>
		</div>
		</div>
		<div class="col-3">
			<img src="image/catIcon/2.jpg" alt="Persia">
			<h3>Persia</h3>
			<button id="btn4">View More</button>
			<div id="info3" style="display:none">
			<p>Kucing Persia pertama kali ditemukan tahun 1871 dan diakui secara resmi pada tahun 1890. Kucing ini menjadi salah satu kucing paling populer di kalangan pecinta kucing karena bulunya yang lebat dan wajahnya yang menggemaskan. Kucing Persia sendiri memiliki jenisnya lagi seperti Short Hair Persian, Chinchilla dan Himalaya. Kucing Persia memiliki harga sekitar 1000 - 6000 USD atau Rp14 juta hingga Rp84 juta.</p>
			<button id="btn5">Close</button>
		</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="box">
		<div class="col-3">
			<img src="image/catIcon/3.jpg" alt="Peterbald">
			<h3>Peterbald</h3>
			<button id="btn6">View More</button>
			<div id="info4" style="display:none">
			<p>Ras Peterbald termasuk ras kucing baru yang ditemukan pada tahun 1994 di St. Petesburg, Rusia. Peterbald merupakan persilangan antara kucing Sphynx dan kucing Short Hair. Kucing ini tidak memiliki bulu, karena itu Peterbald harus dirawat secara khusus. Kucing ini bisa kamu miliki dengan merogoh harga sekitar 1000 hingga 5000 USD atau sekitar Rp14 juta hingga Rp70 juta.</p>
			<button id="btn7">Close</button>
		</div>
		</div>
		<div class="col-3">
			<img src="image/catIcon/4.jpg" alt="Savannah">
			<h3>Savannah</h3>
			<button id="btn8">View More</button>
			<div id="info5" style="display:none">
			<p>kucing ini juga berasal dari hibrida Afrika. Kucing ini merupakan hasil dari persilangan kucing domestik dan kucing serval di Afrika. Ashera adalah salah satu dari ras kucing terbesar di dunia. Tingkahnya yang sangat aktif membuat kucing ini membutuhkan ruang yang luas. Harga kucing Savannah mencapai 15 ribu hingga 35 ribu USD atau sekitar Rp210 juta hingga Rp490 juta.</p>
			<button id="btn9">Close</button>
		</div>
		</div>
		<div class="col-3">
			<img src="image/catIcon/5.jpg" alt="Sphynx">
			<h3>Sphynx</h3>
			<button id="btn10">View More</button>
			<div id="info6" style="display:none">
			<p>Kucing Sphynx dulu memiliki nama Canadian Hairless. Kucing jenis ini merupakan salah satu kucing yang memiliki bulu sangat pendek, bahkan terlihat tidak berbulu jika kita lihat sekilas. Sphynx merupakan hasil rekayasa genetik. Nama Sphynx sendiri diambil dari nama patung Sphinx di Mesir. Kisaran harga Sphynx sekitar 1.300 hingga 1.600 USD atau sekitar 18 juta hingga Rp22 juta.</p>
			<button id="btn11">Close</button>
		</div>
		</div>
	</div>
</div>
<!-- End Feature -->

<!-- Footer -->
<div class="footer">
	<div class="box">
		<p><b>WikiNyan</b> &copy; 2019</p>
	</div>
</div>
<!-- End Footer -->
</body>
</html>