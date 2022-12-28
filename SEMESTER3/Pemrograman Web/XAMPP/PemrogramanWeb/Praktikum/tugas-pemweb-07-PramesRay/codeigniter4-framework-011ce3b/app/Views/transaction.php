<?php
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Finance Management</title>
    <style>
      body {
        font-family:monospace;
      }

      h1 {
        text-align: center;
      }

      a {
        text-decoration: none;
        color: black;
      }

      #table {
        border-collapse: collapse;
        width: 100%;
      }

      #table td, #table th {
        border: 1px solid #ddd;
        padding: 8px;
      }

      #table tr:nth-child(even){background-color: #f2f2f2;}

      #table tr:hover {background-color: #ddd;}

      #table th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color:cadetblue;
        color: white;
      }
    </style>

  </head>
  
  <body>
    <h1><a href="">FINANCE MANAGEMENT WEBSITE</a></h1>
    
    <br><br>

    <table id="table">
      <thead>
        <th>KEY</th>
        <th>DATE</th>
        <th>DESCRIPTION</th>
        <th>INCOME</th>
        <th>EXPENSE</th>
        <th>OPTION</th>
      </thead>

      <tbody>
        <?php foreach($transactions as $row) :?>
          <tr>
            <td><?= $row['key'];?></td>
            <td><?= $row['date'];?></td>
            <td><?= $row['desc'];?></td>
            <td><?= $row['income'];?></td>
            <td><?= $row['expense'];?></td>
            <td>
              <a href="/edit/<?=$row['key'];?>">Edit | </a>
              <a href="/delete/<?=$row['key'];?>">Delete</a>
            </td>
          </tr>
        <?php endforeach; ?>
      </tbody>
    </table>

    <br>

    <table id="table">
      <body>
          <td style="text-align: center"><a href="/new">[NEW TRANSACTION]</a></td>
      </body>
    </table>
    
    <br>

    <table id="table">
      <body>
          <td style="text-align: center"><a href="logout">[LOGOUT]</a></td>
      </body>
    </table>
    
    
  </body>
</html>