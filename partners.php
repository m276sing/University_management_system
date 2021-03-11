<?php
 
$servername = "itronixsolutions.com";
$username = "itronnwu_andrapp";
$password = "QwertY2525!!";
$database = "itronnwu_androidapp";
 
 
$con = new mysqli($servername, $username, $password, $database);
 
if($con->connect_error) 
{
    die("Connection failed: " . $conn->connect_error);
}
 
 $sql = "select image1 from images";
 
 $res = mysqli_query($con,$sql);
 
 
 $result = array();
  
 while($row = mysqli_fetch_array($res))
 {
         array_push($result,array('url'=>$row['image1']));
}
 
 echo json_encode(array("result"=>$result));
 
 mysqli_close($con);
 
 
?>