<?php

$host = "localhost";
$usuario = "root";
$senha = "cpsycho05";
$bd = "s_produtos"

$mysqli = new mysqli($host, $usuario, $senha, $bd)

if($mysqli->connect_error)
	echo "falha na conexao:(".$mysqli->connect_error.")".mysqli->connect_error;

?>