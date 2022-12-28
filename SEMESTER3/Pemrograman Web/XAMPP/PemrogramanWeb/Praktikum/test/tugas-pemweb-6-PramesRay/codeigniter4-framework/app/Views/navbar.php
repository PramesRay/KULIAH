<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container">
    <div class="collapse navbar-collapse" id="navbarNav"> 
      <ul class="navbar-nav">
        <?php $isActivePage = fn($x) => uri_string() == $x ? 'active' : ''; ?>
        <li class="nav-item">
          <a class="nav-link <?= $isActivePage('/'); ?>" href="./home">HOME</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-01-PramesRay/Input.html">Tugas-01</a>
        </li>
        <li class="nav-item">
          <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-02-PramesRay/Tokoh.html">Tugas-02</a>
        </li>
        <li class="nav-item">
          <a>Tugas-04</a>
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-04-PramesRay/bio.html">Soal-1</a>
            </li>
            <li class="nav-item">
              <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-04-PramesRay/calc.html">Soal-2</a>
            </li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link <?= $isActivePage('about'); ?>" href="">Tugas-05</a>
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-05-PramesRay/FormBarang/form.html">Soal-1</a>
            </li>
            <li class="nav-item">
              <a class="nav-link <?= $isActivePage('about'); ?>" href="./tugas-pemweb-05-PramesRay/Mahasiswa/mahasiswa">Soal-2</a>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>