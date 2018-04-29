<?php
/*
* db.inc.php
* These are the DBMS credentials and the database name
*/
$hostName = "localhost:/usr/cis/var/triton.sock";
$databaseName = "art";  (replace with your database name)
$username = "rshiko1db";             (replace with your database username)
$password = "Cosc*xkdd";               (replace with your database password)
// Show an error and stop the script
function showerror()
{
if (mysql_error())
die("Error " . mysql_errno() . " : " . mysql_error());
else
die ("Could not connect to the DBMS");
}
?>