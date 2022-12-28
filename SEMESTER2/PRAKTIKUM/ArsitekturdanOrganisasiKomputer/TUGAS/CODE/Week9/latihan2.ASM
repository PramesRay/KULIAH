org 0x100

global start

section .text

start:
    mov ax, 1
    mov cx, 2   ; melakukan sebuah perintah
    mov dx, 0   ; kosongin dulu dx, sesuai dokumentasi
    div cx      ; bagi ax oleh cx
    cmp dx, 0   ; dx berisi sisa pembagian
                ; kalo cmp-nya true maka nilai flag ZF = 1
    jz even     ; je (jump if equal), kalo nilai ZF = 0 (cmp = false)
                ; loncat ke label even

    mov dx, ganjil  ; kalo true langsung dieksekusi 
    jmp print       ; loncat ke label print

even:
    mov dx, genap; kalo genap loncat kesini
    
print:
    mov ah, 9h  ; interupt buat output string
    int 21h
    mov ah, 4Ch ; interupt buat exit
    mov al, 0
    int 21h

section .data
ganjil: db" Ganjil!", exD, 0xA, '$' genap: db" Genap!", OxD, 0xA, '$'