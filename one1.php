<?php
$con=mysqli_connect("localhost","root","","manpreet")or die("connection not create");

echo $name=$_REQUEST['name'];
echo $email=$_REQUEST['email'];
echo $contact=$_REQUEST['contact'];
echo $course=$_REQUEST['course'];
echo $quer=$_REQUEST['query1'];


$query="insert into itro(name , email , contact , course , query) values('$name','$email','$contact','$course','$quer')";



if(mysqli_query($con,$query))
{

echo	$result['status']="true";
}
else
{
echo	$result['status']="false";
}
  json_encode($result);

?>