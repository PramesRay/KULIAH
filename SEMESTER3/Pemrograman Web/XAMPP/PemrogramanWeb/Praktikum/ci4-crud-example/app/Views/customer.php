<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD Customer</title>
</head>
<body>
    <a href="/new">Add New Customer</a>
    <table>
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach($customers as $row) : ?>
            <tr>
                <td><?= $row['first_name']; ?></td>
                <td><?= $row['last_name']; ?></td>
                <td><a href="/edit/<?= $row['id']; ?>">Edit</a></td>
                <td><a href="/delete/<?= $row['id']; ?>">Delete</a></td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</body>
</html>