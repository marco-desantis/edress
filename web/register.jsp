<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<link rel="stylesheet" href="log_reg.css">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
<link rel="stylesheet" href="log_reg.css">
</head>
<body>
  <script src="js/log_reg.js"></script>
  <div class="flexin">

  <div class="tabs tabs-style-flip">
    <nav>
      <ul>
        <li><a href="#section-flip-1"><span><i class="fa fa-lock"></i> Login</span></a></li>
        <li><a href="#section-flip-2"><span><i class="fa fa-user-plus"></i> Sign Up</span></a></li>
      </ul>
    </nav>
    <div class="content-wrap">
      <section id="section-flip-1">

        <form class="ui large form"  action="login">
          <div class="ui segment">
            <h2 class="ui header">Log-In</h2>
            <div class="field">
              <div class="ui left icon input">
                <i class="user icon"></i>
                <input type="text" name="email" placeholder="E-mail address">
              </div>
            </div>
            <div class="field">
              <div class="ui left icon input">
                <i class="lock icon"></i>
                <input type="password" name="password" placeholder="Password">
              </div>
            </div>
            <div class="ui fluid large orange submit button">LOGIN</div>
          </div>
          <div class="ui error message"></div>
        </form>

        <div class="ui message">
          Non hai ancora un account? <a href="#">REGISTRATI</a>
        </div>
      </section>
      <section id="section-flip-2">

        <form class="ui large form" action="register">
          <div class="ui segment">
            <h2 class="ui header">Sign up for an Account</h2>
            <div class="field">
              <div class="ui left icon input">
                <i class="user icon"></i>
                <input type="text" name="email" placeholder="E-mail address">
              </div>
            </div>
            <div class="field">
              <div class="ui left icon input">
                <i class="lock icon"></i>
                <input type="password" name="password" placeholder="Choose a Password">
              </div>
            </div>
            <div class="ui fluid large teal submit button">REGISTER</div>
          </div>
          <div class="ui error message"></div>
          <div class="g-recaptcha" style="width: 100%" data-sitekey="6Lcd4RcTAAAAAFdohXyb7LRFrEDkSua3VlVx8IBb"></div>
        </form>
        <div class="ui message">
          Already have an account? <a href="#">LOG IN</a>
        </div>
      </section>
    </div>
    <!-- /content -->
  </div>
  <!-- /tabs -->
</div>


</body>
</html>