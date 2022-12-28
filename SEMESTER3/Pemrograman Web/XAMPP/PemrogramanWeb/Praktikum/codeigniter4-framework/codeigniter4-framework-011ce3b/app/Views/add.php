<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Create Transaction</title>
</head>
<body>
  <h1>Create Transaction</h1>

  <br><br><br>

  <form action="/" method="post">
    <table>
      <tr>
        <td> 
          <label for="key">Key: </label>
        </td>
        <td>
          <input type="text" name="key" placeholder="Ex: makan" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="date">Date: </label>
        </td>
        <td>
          <input type="date" name="date" placeholder="yyyy/mm/dd" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="desc">Description: </label>
        </td>
        <td>
          <input type="text" name="desc" placeholder="Ex: Beli warteg: nasi+kikil+teri" >
        </td>
      </tr>

      <tr> 
        <td>
          <label for="income">Income: </label>
        </td>
        <td>
          <input type="number" name="income" placeholder="Ex: 10000" required>
        </td>
      </tr>

      <tr>
        <td> 
          <label for="number">Expense: </label>
        </td>
        <td>
          <input type="text" name="expense" placeholder="Ex: 10000" required>
        </td>
      </tr>
    </table>
    <button type="submit">SAVE</button>
  </form>

  </body>
</html>