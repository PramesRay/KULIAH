/*
*    [VAR]
*    mtrxX : matriks yang berisi nilai-nilai koordinat x
*    mtrxY : matriks yang berisi nilai-nilai fungsi dari koordinat x (mtrxX)
*    ttkX : titik x yang menjadi acuan di mana fungsi diturunkan
*    indxStart : start index untuk patokan x dan y 
*    indxEnd : end index untuk patokan x dan y
**/
function hasil = interpolation(mtrxX, mtrxY, ttkX, indxStart, indxEnd)
    // Mencari interpolasi dengan limit indxStart sampai indxEnd >> start
    hasil = 0;
    for i = indxStart:indxEnd
        temp = mtrxY(i); // Assign nilai f(x) yang akan dikali
        for j = indxStart:indxEnd
            // Pengecualian untuk kondisi pengurangan dengan x index itu sendiri
            if (j ~= i)
                // Kalikan nilai yang awalnya f(x) dengan interpolasi per index
                temp = temp * (ttkX - mtrxX(j)) / (mtrxX(i) - mtrxX(j)); 
            end
        end
        hasil = hasil + temp;
    end
end

/*
*    [DESC]
*    Fungsi untuk mencari index x0, x1, x2, dan x4 (sesuai kasus) 
*    serta memanggil fungsi interpolasi dengan limit indxStart sampai indxEnd.
*    Setelah idx ditemukan, panggil fungsi interpolation dan print 
*    hasil interpolasi dari fungsi interpolation
**/
function kasusInterpolasi(mtrxX, mtrxY, ttkX, limitKasus, msg)
    n = length(mtrxX); // panjang matriks (data)
    indxStart = 0; // Inisiasi data
    indxEnd = 0;
    
    // Mencari element x0 dan x1; >> start
    for idx = 1:n-1
        if ((ttkX - mtrxX(idx))*(ttkX - mtrxX(idx+1)) < 0)
            indxStart = idx;
            indxEnd = idx+1;
            break;
        end
    end
    
    /* 
    * Jika limitkasus - 1 = 0, maka berarti kasus adalah linear (1-1 = 0). 
    * Sehingga, x2 ke atas tidak perlu dicari
    * Selain itu adalah kasus kuadratik ke atas
    * >> START
    */
    if (limitKasus - 1 ~= 0)
        for n = 1 : limitKasus-1
            if indxStart > 1
                indxStart = indxStart - 1;
            else 
                indxEnd = indxEnd + 1;
            end
        end
    end
    
    printf("%s\t : %f\n", msg, interpolation(mtrxX, mtrxY, ttkX, indxStart, indxEnd));// output hasil
end

// main():
printf("%s\n", "[INPUT]");
mtrxX = input(" x (Berbentuk Matriks)            : ");
mtrxY = input(" f(x) (Berbentuk Matriks)         : ");
ttkX = input("Titik fungsi yang akan diturunkan : ");
printf("%s\n", "[HASIL INTERPOLASI PER KASUS]");
kasusInterpolasi(mtrxX, mtrxY, ttkX, 1, "Kasus Linear");
kasusInterpolasi(mtrxX, mtrxY, ttkX, 2, "Kasus Kuadrat");
kasusInterpolasi(mtrxX, mtrxY, ttkX, 3, "Kasus Kubik");
