<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Customer</title>
</head>
<body>
    <form action="/edit/<?= $customer['id'] ?>" method="post">
        <p>First Name : <input type="text" name="first_name" value="<?= $customer['first_name'] ?>"></p>
        <p>Last Name : <input type="text" name="last_name" value="<?= $customer['last_name'] ?>"></p>
        <button type="submit">Update</button>
    </form>
</body>
</html>