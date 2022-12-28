function hasil = interpolation(matX, matY, ttkX, idx0, idxN)
    hasil = 0;
    for i = idx0:idxN
        temp = matY(i);
        for j = idx0:idxN
            if (j ~= i)
                temp = temp * (ttkX - matX(j)) / (matX(i) - matX(j)); 
            end
        end
        hasil = hasil + temp;
    end
end

function kasusInterpolasi(matX, matY, ttkX, limitKasus, msg)
    n = length(matX);
    idx0 = 0; 
    idxN = 0;
    
    for idx = 1:n-1
        if ((ttkX - matX(idx))*(ttkX - matX(idx+1)) < 0)
            idx0 = idx;
            idxN = idx+1;
            break;
        end
    end

    if (limitKasus - 1 ~= 0)
        for n = 1 : limitKasus-1
            if idx0 > 1
                idx0 = idx0 - 1;
            else 
                idxN = idxN + 1;
            end
        end
    end
    
    printf("%s\t : %f\n", msg, interpolation(matX, matY, ttkX, idx0, idxN));// output hasil
end

// ------------------------------------------- Main -------------------------------------------
printf("%s\n", "[INPUT]");
matX = input("Masukkan data x                            : ");
matY = input("Masukkan data f(x)                         : ");
ttkX = input("Masukkan titik fungsi yang akan diturunkan : ");
printf("%s\n", "[OUTPUT]");
printf("%s\n", "HASIL INTERPOLASI :");
kasusInterpolasi(matX, matY, ttkX, 1, "Kasus Linear");
kasusInterpolasi(matX, matY, ttkX, 2, "Kasus Kuadrat");
kasusInterpolasi(matX, matY, ttkX, 3, "Kasus Kubik");
