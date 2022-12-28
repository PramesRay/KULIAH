org 0x100
global start 
section .text

start:
    mov ah, 0x9
    mov dx, str
    int 0x21
    
    mov ax, 3       ; inisiasi angka pertama (3)
    mov bx, 2       ; inisiasi angka kedua (2)
    
    mul bx          ; operasi perkalian (mul)
                    ; jadi 2 x 3
    add al, 0x30
    mov dl, al
    
    mov ah, 0x2
    int 0x21
    
    mov ah, 0x4C    ; exit
    xor al, al
    int 0x21

section .data
str: db "3 x 2 = $"