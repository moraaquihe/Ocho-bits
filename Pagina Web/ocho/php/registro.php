<?php
    //Conexión a la BD
  $host="localhost";
  $user="root";
  $password="1234";
  $db="ochodatabase";
  $con = new mysqli($host,$user,$password,$db);
    if($con->connect_error){
        die("Conexión fallida: " . $con->connect_error);
    }
        $nombre = $_POST["name"];
		$email = $_POST["email"];
		$asunto = $_POST["asunto"];
		$celular = $_POST["telefono"];
        $mensaje = $_POST["mensage"];
    //Realizamos el insert de alumnos.
    $sql = "INSERT INTO mensajes(nombre_apellido, email, celular, asunto, mensaje, estado) VALUES('$nombre', '$email', '$celular', '$asunto', '$mensaje', 'PENDIENTE')";
    $query1 = $con->query($sql);
    if($query1!= null){
			print "<script>alert(\"Mensaje enviado\");window.location='../ochoWeb/index.php';</script>";
	}else{
        print "<script>alert(\"No se ha enviado el mensaje\");window.location='../ochoWeb/index.php';</script>";
    }
	$con->close();
  ?>