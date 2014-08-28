<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Sucesso! - TechBin</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
				<link rel="shortcut icon" href="images/logtop.png" />
		
	</head>
	<body class="no-sidebar">

		<!-- Header -->
			<div id="header-wrapper">
				<div id="header" class="container">
					
					<!-- Logo -->
						<h1 id="logo"><a href="index.html"><img src="images/logo.png" alt=""  style="width:11.5em ;heigth:11.5em;"></a></h1>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li>
									<a href="">Empresa</a>
									<ul>
										<li><a href="historico.html">Historico</a></li>
										<li><a href="espaco.html">Espaço Físico</a></li>
										<li><a href="#"></a></li>

									</ul>
								</li>
								<li><a href="left-sidebar.html">Posicionamento</a></li>
								<li class="break"><a href="right-sidebar.html">Notícias</a></li>
								<li><a href="Contato.html">Contato</a></li>
							</ul>
						</nav>

				</div>
			</div>

		<!-- Main -->
			

		<!-- Footer -->
			<div id="footer-wrapper">
				<div id="footer" class="container">
					<header class="major">
						<%String nome = (String)request.getAttribute("nomedocontato"); %>
						<h2>Menssagem Enviada Com Sucesso!</h2>
						<p>Porfavor Aguarde Nossa Resposta </p>
						<h3><%out.println(nome); %></h3>
					</header>
					<div class="row">
						<section class="6u">
							
						
						</section>
						
					</div>
				</div>
				<div id="copyright" class="container">
					<ul class="menu">
						<li>&copy; TechBin. Todos os direitos reservados.</li><li>Design: <a href="http://facebook.com/Edwardhll">Eduardo Andrade</a></li>
					</ul>
				</div>
			</div>

	</body>
</html>