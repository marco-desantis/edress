<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>EDress</title>
	<link rel="icon" href="./img/logo_1.png"/>
</head>
<body>
<header>
	<div id="firstbar">
		<a href="#footer">
			<img id="reso-img" src="./img/reso.png" alt="reso"/>
			<span title="Non sei soddisfatto dei prodotti ricevuti? Nessun problema: hai 100 giorni per restituirli! Su EDRESS il reso &egrave; sempre gratuito.">
						 Diritto di restituzione entro 100 giorni</span>
		</a>
		<a href="#footer">
			<img id="spedizione-img" src="./img/spedizione.png" alt="spedizione"/>
			<span title="Spedizione gratuita per ordini a partire da 25.00&euro;. Per ordini inferiori, il costo &egrave; di 3.50&euro;">
				Spedizione e reso gratuiti
			</span>
		</a>
		<a href="/aiuto.html">
			<img id="help-img" src="./img/help.png" alt="help"/>
			<span> Aiuto e contatti </span>
		</a>
	</div>
	<nav class='wrapper'>
		<ul class='leftside'>
			<li>
				<a href="/donna-home/" class="ed-navicat-header_genere"> Donna </a>
			</li>
			<li>
				<a href="/uomo-home/"> Uomo </a>
			</li>
		</ul>
		<a href="/EDRESS/index.jsp">
			<img id="logo-img" src="./img/logo_n.png" alt="logo">
		</a>
		<ul class='rightside'>
			<li>
				<a href="/EDRESS/register.jsp">
					<img src="./img/accesso.png" alt="accesso">
					<span>Accedi</span>
				</a>
				<div class="arrow-up"></div>

				<div class="login-form">
					<form action="post">
						<label>Username</label>
						<div>
							<input type="text" placeholder="Username" required>
						</div>
						<label>Password</label>
						<div>
							<input type="password" placeholder="Password" required>
						</div>
						<div>
							<input type="submit" value="Log In">
						</div>
						<div>
							<a href="#"
							   style="text-decoration: none;position: relative;top: 20px;font-size: 16px;color: gray;">Lost
								Your Password</a>
						</div>
					</form>
				</div>

			</li>

			<script src="js\log.js">
			</script>

			<li>
				<a href="/EDRESS/desideriList.jsp">
					<img src="./img/desiderio.png" alt="desiderio">
					<span>Desideri</span>
				</a>
			</li>
			<li>
				<a href="/EDRESS/carrello.jpeg">
					<img src="./img/carrello.png" alt="carrello">
					<span>Carrello</span>
				</a>
			</li>
		</ul>
	</nav>
	<div id='menu' class='wrapper'>
		<ul>
			<li>
				<a> Abbigliamento</a>
				<div>
					<div class="wrapper">
						<ul>
							<li> UOMO </li>
							<li><a> T-shirt & Polo </a></li>
							<li><a> Camicie </a></li>
							<li><a> Giacche </a></li>
							<li><a> Maglieria & Felpe </a></li>
							<li><a> Cappotti </a></li>
							<li><a> Jeans </a></li>
							<li><a> Pantaloni </a></li>
							<li><a> Completi </a></li>
						</ul>
						<ul>
							<li> DONNA </li>
							<li><a> T-shirt & Top </a></li>
							<li><a> Camicie </a></li>
							<li><a> Giacche </a></li>
							<li><a> Vestiti </a></li>
							<li><a> Felpe </a></li>
							<li><a> Jeans </a></li>
							<li><a> Pantaloni </a></li>
							<li><a> Gonne </a></li>
						</ul>
					</div>
				</div>
			</li>
			<li>
				<a>Accessori</a>
			</li>
			<li>
				<a> Offerte </a>
				<div>
					<div class="wrapper">
						<ul>
							<li> ABBIGLIAMENTO </li>
							<li><a> T-shirt & Polo </a></li>
							<li><a> Jeans </a></li>
							<li><a> Camicie </a></li>
							<li><a> Pantaloni </a></li>
						</ul>
						<ul>
							<li> BRAND </li>
							<li><a> ... tutti i brand </a></li>
							<li><a> Adidas </a></li>
							<li><a> Nike </a></li>
							<li><a> Carhartt </a></li>
							<li><a> Timberland </a></li>
							<li><a> Vans </a></li>
						</ul>
						<ul>
							<li> ALTRE CATEGORIE </li>
							<li><a> Accessori </a></li>
						</ul>
					</div>
				</div>
			</li>
			<li>
				<a> Novità </a>
			</li>
		</ul>
		<form>
			<input type="search" id="search-box" placeholder="Ricerca">
			<span>
    			<img id="img-serch" src="./img/search2.png" alt="serch">
  			</span>
		</form>
	</div>
</header>
