#include "problem_a.hpp"
#include "shape.hpp"

Lingkaran *new_lingkaran(float jari_jari) 
{
  Lingkaran *lingkaran = new Lingkaran;
  lingkaran -> radius = jari_jari;

  return lingkaran;
}

Silinder *new_silinder(const Lingkaran &l, float tinggi) 
{
  Silinder *silinder = new Silinder;
  Lingkaran c = l;
  silinder -> lingkaran = c;
  silinder -> tinggi = tinggi;

  return silinder;
}

void new_silinder(Silinder *s, float jari_jari, float tinggi) 
{
  (s -> lingkaran).radius = jari_jari;
  s -> tinggi = tinggi;
}

void new_balok(Balok *b, float panjang, float lebar, float tinggi) 
{
  b -> panjang = panjang;
  b -> lebar = lebar;
  b -> tinggi = tinggi;
}

float cari_diameter(const Lingkaran &l) 
{
  float diameter;
  Lingkaran lingkaran = l;
  diameter = lingkaran.radius * 2;

  return diameter;
}

float cari_diameter(const Silinder &s) 
{
  float diameter = (s.lingkaran).radius * 2;

  return diameter;
}

float cari_keliling(const Lingkaran &l) 
{
  float d = cari_diameter(l);
  float keliling = pi * d;

  return keliling;
}

float cari_keliling(const Silinder &s) 
{
  return cari_keliling(s.lingkaran);
}

float cari_luas(const Lingkaran &l) 
{
  float luas = (l.radius * l.radius) * pi;

  return luas;
}

float cari_luas(const Silinder &s) 
{
  return cari_luas(s.lingkaran); 
}

float cari_luas(const Balok &b) 
{
  float luas = 2 * ((b.panjang * b.lebar) + (b.panjang * b.tinggi) + (b.lebar * b.tinggi));

  return luas;
}

float cari_volume(const Silinder &s) 
{
  float alas = cari_luas(s.lingkaran);
  float volume = alas * s.tinggi;

  return volume;
}

float cari_volume(const Balok &b) 
{
  float volume = b.panjang*b.lebar*b.tinggi;

  return volume;
}