org 0x100

global start

section .text

start:
    mov cx, 5h      ; melakukan sebuah perintah sebanyak 5x
    mov dx, hello   ; string hello untuk mencetak kata

loop_start: 
    mov ah, 9h      ; output string
    int 21h 
    dec cx          ; decrement nilai cx
    jnz loop_start  ; Jump Not Zero, kalo cx != 0 jump keatas

    mov ah, 4ch     ; interrupt untuk exit
    mov al, 0       ; return 0
    int 21h

section .data

hello: db "Hello!", 0xD, 0xA, '$'
