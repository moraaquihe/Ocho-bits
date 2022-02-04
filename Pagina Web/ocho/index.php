<!DOCTYPE html>
<html>

<head>
  <title>8BITS - Website</title>
  <meta charset="utf-8" />
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- css -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400,300,700,800" rel="stylesheet" media="screen">

  <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  <link href="css/style.css" rel="stylesheet" media="screen">
  <link href="color/default.css" rel="stylesheet" media="screen">
</head>

<body>

  <!-- Barra de navegacion -->
  <nav class="navbar navbar-default" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
          <span class="sr-only">Toggle nav</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>

        <!-- Logo text or image -->
        <a class="navbar-brand" href="index.php">8bits</a>

      </div>
      <div class="navigation collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav">
          <li class="current"><a href="#intro">Inicio</a></li>
          <li><a href="#nosotros">Nosotros</a></li>
          <li><a href="#servicios">Servicios</a></li>
          <li><a href="#team">Equipo</a></li>
          <li><a href="#contact">Contactos</a></li>
        </ul>
      </div>
    </div>
  </nav>
 
  <!-- intro area -->
  <section id="intro">
    <div class="intro-container">
      <div id="introCarousel" class="carousel slide carousel-fade" data-ride="carousel">

        <div class="carousel-inner" role="listbox">

          <!-- Slide 1 -->
          <div class="item active">
            <div class="carousel-background"><img src="img/intro/1.jpg" alt=""></div>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown">8BITS Servicio Técnico</h2>
                <p class="animated fadeInUp">Somos estudiantes de la carrera de Informática, realizando un sueño y cumpliendo con nuestro rol de... ¡Hacer lo que nos apasiona!</p>
                <a href="#nosotros" class="btn-get-started animated fadeInUp">Ver más</a>
              </div>
            </div>
          </div>
          
          <!-- Slide 2 -->
          <div class="item">
            <div class="carousel-background"><img src="img/intro/2.jpg" alt=""></div>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown">Creatividad & Tecnología</span></h2>
                <p class="animated fadeInUp">Utilizando tecnología de vanguardia realizamos las diversas tareas que tú nos encomiendas.</p>
                <a href="#nosotros" class="btn-get-started animated fadeInUp">Ver más</a>
              </div>
            </div>
          </div>

          <!-- Slide 3 -->
          <div class="item">
            <div class="carousel-background"><img src="img/intro/3.jpg" alt=""></div>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown">¿Qué esperas para conocernos?</span></h2>
                <p class="animated fadeInUp">Tenemos deseos de saber tus ideas y realizarlas especialmente para ti.</p>
                <a href="#nosotros" class="btn-get-started animated fadeInUp">Ver más</a>
              </div>
            </div>
          </div>

        </div>

        <a class="carousel-control-prev" href="#introCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon fa fa-angle-left" aria-hidden="true"></span>
          <span class="sr-only">Anterior</span>
        </a>

        <a class="carousel-control-next" href="#introCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon fa fa-angle-right" aria-hidden="true"></span>
          <span class="sr-only">Siguiente</span>
        </a>

      </div>
    </div>
  </section><!-- #intro -->

  <!-- About -->
  <section id="nosotros" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>Nosotros</h2>
            <div class="heading-line"></div>
            <p>A lo largo de este tiempo como desarrolladores hemos descubierto un mundo que deseamos mostrarte con nuestros trabajos.</p>
          </div>
        </div>
      </div>
      <div class="row wow fadeInUp">
        <div class="col-md-6 about-img">
          <img src="img/about-img.jpg" alt="">
        </div>

        <div class="col-md-6 content">
          <h2>Siendo amigos desde la Universidad, empieza nuestra aventura programando y demostrando lo que nos apasiona como profesionales.</h2>
          <h3>"Se llamará 8 BITS"</h3>
          <p>
            <!--gg no se que agregar aqui-->
          </p>
        </div>
      </div>
    </div>
  </section>

  <!-- Parallax 1 -->
  <section id="parallax1" class="home-section parallax" data-stellar-background-ratio="0.5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="color-light">
            <h2 class="wow bounceInDown" data-wow-delay="0.5s">Los pequeños detalles hacen la perfección</h2>
            <p class="lead wow bounceInUp" data-wow-delay="1s">¿Quién lo diría, no?</p>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- Servicios -->
  <section id="servicios" class="home-section bg-gray">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>Servicios</h2>
            <div class="heading-line"></div>
            <p>Deseamos que nuestros trabajos llenen tus expectativas</p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-12">

          <ul id="og-grid" class="og-grid">-
            <li>
              <a href="#" data-largesrc="img/works/1.jpg" data-title="Mantenimento & Reparación de equipos" data-description="A veces no nos damos cuenta como clientes, que por no realizar una limpieza estamos deteriorando y quitando la vida útil de nuestros equipos. Es por eso que estamos para ofrecerte lo mejor de lo mejor.">
                <img src="img/works/thumbs/1.jpg" alt="" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/2.jpg" data-title="Venta de Articulos Informáticos" data-description="¡Vendemos articulos sobre pedidos al mejor precio que te puedas imaginar!">
                <img src="img/works/thumbs/2.jpg" alt="" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/3.jpg" data-title="Venta de Software" data-description="¿Necesitas comprar un programa? No te preocupes, tenemos las mejores opciones a tu disposición.">
                <img src="img/works/thumbs/3.jpg" alt="img01" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/4.jpg" data-title="Venta de Juegos" data-description="Existen ocasiones dónde necesitamos un tiempo de ocio, ¿y por qué no? Vive una nueva aventura con cada personaje y ¡diviértete a lo grande!">
                <img src="img/works/thumbs/4.jpg" alt="img01" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/5.jpg" data-title="Desarrollo de Software" data-description="¿Te imaginas una aplicación que agilice el proceso de tu trabajo?">
                <img src="img/works/thumbs/5.jpg" alt="img01" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/6.jpg" data-title="Desarrollo de Paginas Web" data-description="Estamos a la espera de que nos elijas para construir tu imagen virtual y, poder mostrarles a quienés visiten cuál es la visión y misión que tienes.">
                <img src="img/works/thumbs/6.jpg" alt="img01" />
              </a>
            </li>
            <li>
              <a href="#" data-largesrc="img/works/7.jpg" data-title="Asesoria en general" data-description="¿Ya sabés que componente le corresponde a tu computadora? ¿Quieres mejorar el rendimiento de tu máquina? ¿Tienes alguna duda sobre algo en específico? Tu consulta no nos molesta, ¡escríbenos!">
                <img src="img/works/thumbs/7.jpg" alt="img01" />
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </section>

  <!-- Parallax 2 -->
  <section id="parallax2" class="home-section parallax" data-stellar-background-ratio="0.5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="color-light">
            <h2 class="wow bounceInDown" data-wow-delay="0.5s">Los pequeños detalles hacen la perfección</h2>
            <p class="lead wow bounceInUp" data-wow-delay="1s">¿Quién lo diría, no?</p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Team -->
  <section id="team" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>Nuestro Equipo</h2>
            <div class="heading-line"></div>
            <p><!--gg nuevamente no se que escribir aqui--></p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
         
        </div>
        <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3" data-wow-delay="0.1s">
          <div class="box-team wow bounceInUp">
            <img src="img/team/1.jpg" alt="" class="img-circle img-responsive" />
            <h4>Joel Rolón</h4>
            <p>Fundador</p>
          </div>
        </div>
        <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3" data-wow-delay="0.3s">
          <div class="box-team wow bounceInUp">
            <img src="img/team/2.jpg" alt="" class="img-circle img-responsive" />
            <h4>Moraima Aquino</h4>
            <p>Fundadora</p>
          </div>
        </div>
        
        </div>
      </div>
    </div>
  </section>

  <!-- Contact -->
  <section id="contact" class="home-section bg-gray">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>¡Envianos un correo!</h2>
            <div class="heading-line"></div>
            <p>Si tienes alguna duda o simplemente quieres saludarnos, completa el formulario siguiente y te respondemos dentro de las 24 horas, 
              o si deseas, fijate más abajo ahí están nuestros datos.
            </p>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div id="sendmessage">Su mensaje ha sido enviado con éxito. ¡Gracias!</div>
          <div id="errormessage"></div>

          <form action="php/registro.php" method="post" class="form-horizontal contactForm" role="form">
            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="text" name="name" class="form-control" id="name" placeholder="Nombre y Apellido" data-rule="minlen:4"
                  data-msg="Por favor, ingrese su nombre." />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="email" class="form-control" name="email" id="email" placeholder="Correo electronico" data-rule="email"
                  data-msg="Por favor, ingrese un correo válido." />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="tel" class="form-control" name="telefono" id="telefono" placeholder="Celular" data-rule="minlen:9"
                  data-msg="Por favor, ingrese un número de celular." />
                <div class="validation"></div>
              </div>
            </div>
            
            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="text" class="form-control" name="asunto" id="asunto" placeholder="Asunto" data-rule="minlen:4"
                  data-msg="Por favor, ingrese un asunto. (De al menos 8 caracteres)" />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <textarea class="form-control" name="mensage" id="mensage" rows="5" data-rule="required" data-msg="Por favor, escribe algo para nosotros."
                  placeholder="Mensaje"></textarea>
                <div class="validation"></div>
              </div>
            </div>
            <div class="form-group">
              <div class="col-md-offset-2 col-md-8">
                <button type="submit" class="btn btn-theme btn-lg btn-block">Enviar mensaje</button>
              </div>
            </div>
          </form>

        </div>
      </div>

    </div>
  </section>
  <!-- Bottom widget -->
  <section id="bottom-widget" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <div class="contact-widget wow bounceInLeft">
            <i class="fa fa-map-marker fa-4x"></i>
            <h5>Oficina Principal</h5>
            <p>
              San Ignacio Guasu<br/>Centro
            </p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="contact-widget wow bounceInUp">
            <i class="fa fa-phone fa-4x"></i>
            <h5>Telefonos</h5>
            <p>
              +595 972 475 284<br> +595 984 286 899

            </p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="contact-widget wow bounceInRight">
            <i class="fa fa-envelope fa-4x"></i>
            <h5>Correo Electronico</h5>
            <p>
              rolonjoel35@gmail.com<br />moraaquihe@gmail.com
            </p>
          </div>
        </div>
      </div>
      <div class="row mar-top30">
        <div class="col-md-12">
          <h5>Visitanos en nuestras redes sociales</h5>
          <ul class="social-network">
            <li><a href="https://www.facebook.com/8bits.sanignacio">
                <span class="fa-stack fa-2x">
                  <i class="fa fa-circle fa-stack-2x"></i>
                  <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                </span></a>
            </li>
            <li><a href="https:/www.instagram.com/8bits.sanignacio">
                <span class="fa-stack fa-2x">
                  <i class="fa fa-circle fa-stack-2x"></i>
                  <i class="fa fa-instagram fa-stack-1x fa-inverse"></i>
                </span></a>
            </li>
            <li><a href="#">
                <span class="fa-stack fa-2x">
                  <i class="fa fa-circle fa-stack-2x"></i>
                  <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                </span></a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </section>

  <!-- Pie de pagina -->
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <p>Copyright &copy; 8BITS. Todos los derechos reservados.</p>
          <div class="credits">
            Diseñado por <a href="https://facebook.com/8bits.sanignacio">8BITS</a>
          </div>
        </div>
      </div>
    </div>
  </footer>

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- js -->
  <script src="js/jquery.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/wow.min.js"></script>
  <script src="js/jquery.scrollTo.min.js"></script>
  <script src="js/jquery.nav.js"></script>
  <script src="js/modernizr.custom.js"></script>
  <script src="js/grid.js"></script>
  <script src="js/stellar.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Custom Javascript File -->
  

</body>

</html>
