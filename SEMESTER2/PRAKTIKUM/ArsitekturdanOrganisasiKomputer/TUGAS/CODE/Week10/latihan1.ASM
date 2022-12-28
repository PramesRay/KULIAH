org 0x100
global start
section .text

start:
    mov ah, 0x9
    mov dx, str
    int 0x21
    
    mov ax, 2
    add ax, 4       ; inisiasi angka pertama (2)
                    ; operasi penjumlahan (ADD)
                    ; tambahkan dengan angka kedua (4)
                    ; jadi 2 + 4
    add al, 0x30
    mov dl, al
    mov ah, 0x2
    int 0x21
    
    mov ah, 0x4C    ; exit
    xor al, al
    int 0x21

section .data
str:    db "2 + 4 = $"