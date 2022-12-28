#pragma once

#include "stack.hpp"
#include <string>
using namespace strukdat::stack;

/**
 * @brief Mengambil element maksimum pada sebuah stack
 * @note Minimal menggunakan method peek, isEmpty dan pop
 * Misal:
 *    Top -> 7 -> 101 -> 58 -> 8 -> 55
 * @example
 *    val = getMax(Top); // 101
 * 
 * @param top         pointer ke puncak stack
 * 
 * @return            data maksimum dari stack
 */
int getMax(Stack<int> top);

/**
 * @brief Menentukan jumlah maksimum yang mungkin dari stack sehingga ketiga stack memiliki jumlah / tinggi yang sama
 * @note Minimal menggunakan method isEmpty dan pop
 * Misal:
 *    Top1 -> 3 -> 2 -> 1 -> 1 -> 1
 *    Top2 -> 4 -> 3 -> 2
 *    Top3 -> 1 -> 1 -> 4 -> 1
 * @example
 *    val = getEqualStack(Top1, Top2, Top3); // 5
 * @explanation
 *    Top1 -> 2 -> 1 -> 1 -> 1
 *    Top2 -> 3 -> 2
 *    Top3 -> 4 -> 1
 * 
 * @param top1        pointer ke puncak stack pertama
 * @param top2        pointer ke puncak stack kedua
 * @param top3        pointer ke puncak stack ketiga
 * 
 * @return            jumlah maksimum stack yang mungkin
 */
int getEqualStack(Stack<int> top1, Stack<int> top2, Stack<int> top3);

/**
 * @brief Memeriksa daftar kurung yang diberikan apakah seimbang (format yang seharusnya) atau tidak
 * @note Minimal menggunakan method peek, isEmpty, push dan pop
 * @example
 *    val1 = isBracketBalanced("{[]}()({[][]}[])"); // true
 *    val2 = isBracketBalanced("{[)}"); // false
 * 
 * @param top         pointer ke puncak stack
 * 
 * @return            'true' jika seimbang dan 'false' jika tidak seimbang
 */
bool isBracketBalanced(const std::string expression);
