<html><head><title>Art</title></head>
<body>
<table border=1>
<tr><th>ID</th><th>Name</th><th>Type</th><th>Year</th>
<th>Artist</th></tr>
<?php
include 'db.inc.php';
// Connect to MySQL DBMS
if (!($connection = @ mysql_connect($hostName, $username,
  $password)))
  showerror();
// Use the cars database
if (!mysql_select_db($databaseName, $connection))
  showerror();
 
// Create SQL statement
$query = "SELECT * FROM cars";
// Execute SQL statement
if (!($result = @ mysql_query ($query, $connection)))
  showerror();
// Display results
while ($row = @ mysql_fetch_array($result))
  echo "<tr><td>{$row["id"]}</td>
<td>{$row["make"]}</td>
<td>{$row["model"]}</td>
<td>{$row["year"]}</td>
<td>{$row["price"]}</td></tr>";
?>
</table></body>
</html>