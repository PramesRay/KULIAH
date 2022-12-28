<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
</head>
<body>
    <h1>Register</h1>
    <?php if(session()->get('success')) : ?>
        <p style="color: green; font-size: small;"><?= session()->get('success') ?></p>
    <?php endif; ?>
    <hr>
    <form action="/register" method="post">
        <p>Email <input type="text" name="email" value="<?= set_value('email') ?>"></p>
        <p>Password <input type="password" name="password" value=""></p>
        <p>Confirm Password <input type="password" name="password_confirm" value=""></p>
        <?php if(isset($validation)) : ?>
            <?= $validation->listErrors() ?>
        <?php endif; ?>
        <button type="submit">Register</button>
        <p>
            Already have an acoount? <a href="/">Click here</a> to login
        </p>
    </form>
</body>
</html>