<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update Transaction</title>
</head>
<body>
<h1>Update Transaction</h1>

<br><br><br>

<form action="/edit/<?=$transactions['key']?>" method="post">
  <table>
    <tr>
      <td> 
        <label for="key">Key: </label>
      </td>
      <td>
        <input type="text" name="key" value="<?= $transactions['key']?>" >
      </td>
    </tr>

    <tr>
      <td> 
        <label for="date">Date: </label>
      </td>
      <td>
        <input type="text" name="date" value="<?= $transactions['date']?>" >
      </td>
    </tr>

    <tr>
      <td> 
        <label for="desc">Description: </label>
      </td>
      <td>
        <input type="date" name="desc" value="<?= $transactions['desc']?>" >
      </td>
    </tr>

    <tr> 
      <td>
        <label for="income">Income: </label>
      </td>
      <td>
        <input type="number" name="income" value="<?= $transactions['income']?>" >
      </td>
    </tr>

    <tr>
      <td> 
        <label for="expense">Expense: </label>
      </td>
      <td>
        <input type="number" name="expense" value="<?= $transactions['expense']?>" >
      </td>
    </tr>
  </table>
  <button type="submit">SAVE</button>
</form>
</body>
</html>