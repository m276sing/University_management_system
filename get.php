<?php

$servername = "localhost";
$username = "root";
$password = "";
$database = "manpreet";
 
 
$conn = new mysqli($servername, $username, $password, $database);
 
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
 
 
 
$itronix = array(); 

$sql = "SELECT description FROM itronix";

$stmt = $conn->prepare($sql);
 

$stmt->execute();
 

$stmt->bind_result($description);
 
while($stmt->fetch()){
 
 $temp = [
 'description' => $description];
 
 array_push($itronix, $temp);
}
 
echo json_encode($itronix);
?>