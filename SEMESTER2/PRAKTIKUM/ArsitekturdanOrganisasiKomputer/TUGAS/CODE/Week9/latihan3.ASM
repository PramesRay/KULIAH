org 0x100

global start

section .text

start:
    mov ax, 169     ; untuk mencetak karakter desimal
    mov bx, 10      ; buat ngebagi (dividend)
    mov cx, 0h      ; buat ngitung jumlah digit

div_by_ten:         ; bagi 10 buat setiap digitnya terus ambil sisanya.
                    ; TAPI kalo langsung di print, outputnya jd kebalik. misal 169 jadi 961
    mov dx, 0h      ; mengosongkan dx
    div bx          ; bagi 10, sisa bakal ada di dx
                    ; biar ga kebalik, push sisa ke stack
    push dx         ; misal buat 169.
                    ; sebelum iterasi: <- stack top:
                    ; iterasi 1: 9 <- stack top
                    ; iterasi 2: 6 9 <- stack top
                    ; iterasi 3: 1 6 9 <- stack top
    inc cx          ; increment jumlah digit
    cmp ax, 0       ; kalo angka udah abis semua berarti ax = 0

jne div_by_ten      ; Jump Not Equal. kalo ax != 0, masih ada angka
                    ; jadi jump lagi keatas

print:
    pop dx          ; karena stack sifatnya LIFO maka yang di ambil 
                    ; adalah digit yang terakhir di push.
                    ; pop (ambil dan hapus) dari stack ke dx
                    ; misal buat 169.
                    ; sebelum iterasi: 1 6 9 <- stack top; dx = gatau apa
                    ; iterasi 1: 6 9 <- stack top; dx = 1
                    ; iterasi 2: 9 <- stack top; dx = 6
                    ; iterasi 3: <- stack top; dx = 9
    add dl, 30h     ; fungsinya untuk mengubah nilai didalam stack menjadi nilai ascii
                    ; misal: kalo 6 ascii-nya 0x36 atau 0x6+ 0x30.
                    ; Masukan ke dl buat di print. 
    mov ah, 2h      ; interrupt buat print 1 character
    int 21h
    dec cx          ; decrement jumlah digit
    jnz print       ; kalo masih ada digit (cx != 0), loop lagi buat print

    mov ah, 4Ch     ; interrupt buat exit
    mov al, 0       
    int 21h