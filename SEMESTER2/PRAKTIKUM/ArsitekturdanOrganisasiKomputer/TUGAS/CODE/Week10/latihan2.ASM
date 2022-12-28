org 0x100
global start
section .text

;belom kelar

print:
    pop dx          ; karena stack sifatnya LIFO maka yang diambil adalah digit yang terakhir di push
                    ; pop dari stack ke dx
                    ; misalnya 28
                    ; sebelum iterasi   : 3 8 <- stack top ; dx = gatau apa
                    ; iterasi 1         : 8 <- stack top         ; dx = 3
                    ; iterasi 2         : <- stack top           ; dx = 8
    
    add dl, 30h     ; fungsinya untuk mengubah nilai didalam stack menjadi nilai ascii
                    ; misal: kalo 6 ascii-nya 0x36 atau 0x6 + 0x30
                    ; masukkan ke dl buat diprint
    
    mov ah, 2h      ; interupt buat print 1 karakter
    int 21h         ; menjalankan program
    dec cx          ; decrement jumlah digit
    jnz print       ; (jump if not zero) kalo masih ada digit (cx!=0) loop lagi buat print
                    ; interupt buat exit
    mov ah, 4Ch
    mov al, e       ; return 0
    int 21h         ; interrupt

section .data           ; section untuk menyimpan data
str: db "15+ 23 = $"    ; label str berisi string