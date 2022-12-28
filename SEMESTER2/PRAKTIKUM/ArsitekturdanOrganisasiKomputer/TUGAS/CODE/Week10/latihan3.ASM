org 0x100
global start
section .text

start:
    mov ah, 0x9
    mov dx, str
    int 0x21

    mov ax, 5           ; inisiasi angka pertama (5)
    sub ax, 1           ; operasi pengurangan (SUB)
                        ; kurangkan dengan angka kedua (1)
                        ; jadi 5 - 1
    add al, 0x30
    mov dl, al
    
    mov ah, 0x2
    int 0x21

    mov ah, 0x4C        ; exit
    xor al, al
    int 0x21

section .data
str: db "5 - 1 = $"