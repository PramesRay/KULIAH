#pragma once

/**
 * Gunakan konstanta ini untuk perhitungan yang melibatkan pi.
 * Tidak usah mendeklarasikan lagi.
 */
const float pi = 3.14f;

/**
 * @brief Tipe data lingkaran
 */
struct Lingkaran {
  float radius;
};

/**
 * @brief Tipe data silinder
 */
struct Silinder {
  Lingkaran lingkaran;
  float tinggi;
};

/**
 * @brief Tipe data balok
 */
struct Balok {
  float panjang, lebar, tinggi;
};