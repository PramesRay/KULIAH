<?php
    include("config.php");

    $sql = "DELETE FROM identitas WHERE npm=:npm";
    $query = $conn->prepare($sql);
    $query->execute([':npm' => $_GET['npm']]);

    echo "<script>alert('Data telah berhasil dihapus!');</script>";
    header("Location: index.php");
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <title>Edit Data</title>
</head>
<body>
    <div class="box">
        <img src="./assets/img/unpad.png" alt="himatif" class="logo">
        <div class="header satu">
            Form Biodata Mahasiswa
        </div>
        <div class="header dua">
            Universitas Padjadjaran
        </div>
        <button class="btn-custom create" type="submit" id="submit" onclick="location.href='index.php'">Home</button>
        <form action="editData.php" method="post" name="formUpdate" class="mt-3">
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label for="npm">NPM*</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="npm" 
                        name="npm" 
                        placeholder="140810XXXXXX" 
                        required
                    >
                </div>
                <div class="col-md-6 mb-3">
                    <label for="nama">Nama Lengkap*</label>
                    <input 
                        type="text" 
                        class="form-control" 
                        id="nama" 
                        name="nama" 
                        placeholder="Nama Lengkap" 
                        required
                    >
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 mb-3">
                    <label for="email">Email*</label>
                    <div class="input-group">
                        <input type="text" class="form-control" id="email" name="email" placeholder="Email"
                            aria-describedby="inputGroupPrepend" required>
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="inputGroupPrepend">@mail.unpad.ac.id</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 mb-3">
                    <label for="tgl_lahir">Tanggal Lahir*</label><br>
                    <input 
                        type="date"
                        class="form-control"
                        id="tgl_lahir"
                        name="tgl_lahir"
                        required
                    >
                </div>
                <div class="col-md-4 mb-3">
                    <label for="jk">Jenis Kelamin*</label>
                    <div>
                        <input 
                            type="radio" 
                            class="btn-check" 
                            name="jk" 
                            id="primary-outlined" 
                            value="L"
                            autocomplete="off"
                        >
                        <label class="btn btn-outline-primary" for="primary-outlined">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-gender-male" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M9.5 2a.5.5 0 0 1 0-1h5a.5.5 0 0 1 .5.5v5a.5.5 0 0 1-1 0V2.707L9.871 6.836a5 5 0 1 1-.707-.707L13.293 2H9.5zM6 6a4 4 0 1 0 0 8 4 4 0 0 0 0-8z"/>
                            </svg>
                            LAKI - LAKI
                        </label>
                        <input 
                            type="radio" 
                            class="btn-check" 
                            name="jk" 
                            id="danger-outlined" 
                            value="P"
                            autocomplete="off"
                        >
                        <label class="btn btn-outline-danger" for="danger-outlined">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-gender-female" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M8 1a4 4 0 1 0 0 8 4 4 0 0 0 0-8zM3 5a5 5 0 1 1 5.5 4.975V12h2a.5.5 0 0 1 0 1h-2v2.5a.5.5 0 0 1-1 0V13h-2a.5.5 0 0 1 0-1h2V9.975A5 5 0 0 1 3 5z"/>
                            </svg>
                            PEREMPUAN
                        </label>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-mb-3">
                    <label for="alamat">Alamat*</label><br>
                    <div class="input-group">
                        <textarea
                            class="form-control" 
                            id="alamat" 
                            name="alamat"
                            required
                        >
                        </textarea>
                    </div>
                </div>
            </div>
            <div class="row justify-content-start">
                <div class="col mt-3">
                    <button class="btn-custom create" type="submit" name="Update">Update</button>
                </div>
            </div>
        </form>
    </div>
</body>
</html>