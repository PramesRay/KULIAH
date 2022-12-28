org 0x100
global start 
section .text

start:
    mov ah, 0x9
    mov dx, str
    int 0x21
    
    xor dx, dx      ; mengosongkan dx, dx = 0
    mov ax, 10      ; inisiasi angka pertama (10)
    mov bx, 2       ; inisiasi angka kedua (2) 
    div bx          ; operasi pembagian (div)
                    ; jadi 10 / 2
    add al, 0x30
    mov dl, al
    
    mov ah, 0x2
    int 0x21
    
    mov ah, 0x4C    ; exit
    xor al, al
    int 0x21

section .data
str: db "10 / 2 = $"