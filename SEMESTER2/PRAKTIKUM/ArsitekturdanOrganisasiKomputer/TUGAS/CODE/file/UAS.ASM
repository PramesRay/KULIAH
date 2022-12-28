org 0x100
global start

section .text
judul:
	mov ah, 09h
	mov dx, msg1
	int 21h

tulisnama:
	mov ah, 09h
	mov dx, writeName;
	int 21h			

	mov cx, 0dh
	mov si, printName		; memasukan nilai dari username ke dalam source

getName:
	mov ah, 01h
	int 21h					; untuk input data dengan echo
	
	cmp al, 13		
	je tulisnpm				; pindah ke tulis npm jika menekan enter
	
	mov [si], al			; memasukkan char yang dimasukkan kedalam source index
	inc si					; pindah posisi SI dengan melakukan increment
	loop getName;			; melakukan loop selama masih memenuhi

tulisnpm:
	mov ah, 09h
	mov dx, asknpm;
	int 21h			
	
	mov cx, 0dh
	mov si, printNPM		

getnpm:
	mov ah, 01h
	int 21h			
	
	cmp al, 13	 
	je tulisalamat
	
	mov [si], al
	inc si		
	loop getnpm;

tulisalamat:
	mov ah, 09h
	mov dx, writeAddress
	int 21h			
	
	mov cx, 0fh
	mov si, printAddress

getaddress:
	mov ah,01h
	int 21h

	cmp al,0dh
	je tulistl

	mov [si], al
	inc si
	loop getaddress

tulistl:
	mov ah, 09h
	mov dx, writeTL
	int 21h			
	
	mov cx, 0bh
	mov si, TL

gettl:
	mov ah,01h
	int 21h

	cmp al,0dh
	je start

	mov [si], al
	inc si
	loop gettl

start:
	mov ah,3dh				;interrupt untuk membuka file
	int 21h			
	mov [handle], ax	

; Perintah untuk mencetak string msg1
	mov dx, msg1				;nilai yang ada di dx akan dimasukan oleh msg1(ada di section .data)
	mov bx, [handle]			;untuk file handle
	mov cx, 43				    ;jumlah char yang dimasukkan
	mov ah, 40h				    ;interrupt untuk write file
	int 21h
	mov dx, 0

; Perintah untuk menginput nama
	mov dx, msgnama
	mov bx, [handle]
	mov cx, 6
	mov ah, 40h
	int 21h
	mov dx, 0	

; Perintah untuk cetak nama
	mov dx, printName
	mov bx, [handle]
	mov cx, 7
	mov ah, 40h
	int 21h

; Perintah untuk input NPM
	mov dx, writeNPM
	mov bx, [handle]
	mov cx, 5
	mov ah, 40h
	int 21h
	mov dx, 0
	xor dx, dx	

; Perintah untuk cetak NPM
	mov dx, printNPM
	mov bx, [handle]
	mov cx, 12
	mov ah, 40h
	int 21h

; Perintah untuk input asal kota
	mov dx, msgasalkota
	mov bx, [handle]
	mov cx, 11
	mov ah, 40h
	int 21h
	xor dx, dx

; Perintah untuk cetak asalkota
	mov dx, printAddress
	mov bx, [handle]
	mov cx, 10
	mov ah, 40h
	int 21h

; Perintah untuk input tanggal lahir	
	mov dx, msgtlahir
	mov bx, [handle]
	mov cx, 11
	mov ah, 40h
	int 21h
	xor dx, dx

; Perintah cetak tanggal lahir
	mov dx, TL
	mov bx, [handle]
	mov cx, 8
	mov ah, 40h
	int 21h

	mov ah, 3eh				;interrupt untuk close file
	mov dx, [handle]
	int 21h

	mov ah, 4ch	
	mov al, 0 	
	int 21h

section .data

handle:		    dw '?'
msg1:		    db 'Biodata mahasiswa Teknik Informatika UNPAD $'
msg2:		    db 0xA,0xD,'Data berhasil dimasukkan $'
writeName:	    db 0xA,0xD,'Masukkan nama anda          : $'
printName:	    dw '$$$$$'
writeAddress: 	db 0xA,'Masukkan kota asal anda     : $'
printAddress:	dw 0xA,'          '
writeTL:	    db 0xA,'Tanggal lahir anda(ddmmyyyy): $'
TL:		        dw 0xA,'$$$$$$$$$$'
asknpm:		    db 0xA,'Masukkan NPM                : $'
printNPM:	    dw 0xA,'$$$$$$$$$'
msgnama:	    db 0xA,'Nama                        : $'
msgasalkota:	db 0xA,'Asal Kota                   : $'
msgtlahir:	    db 0xA,'Tgl lahir                   : $'
writeNPM:	    db 'NPM   : $'