org 0x100
section .text

start:
        mov		ah, 9       ; untuk print output berupa string
        mov		dx, msg     ; memindahkan isi 'msg' ke register dx 
        int		21h         ; lakukan interrupt untuk cetak kalimat
        call print_nl

        mov             ah, 2h      ; untuk mencetak karakter
        mov             dl, 48      ; mengisi register dengan karakter asci
        mov             cx, 10      ; melakukan sebuah perintah sebanyak 10x

Ulang:
        int             21h         ; menjalankan program dan mencetak karakter pada register dl
        inc             dl          ; menambah register dl (+1)
        loop            Ulang       ; ya looping

exit: 				    ; untuk exit program atau lanjut
        call print_nl
        mov		ah, 9       ; untuk print output berupa string
	mov		dx, akhir   ; string 'akhir' untuk mencetak kata
	int		21h         ; lakukan interrupt untuk cetak kalimat


	mov		ah, 0       ; mode teks / servis input satu karakter
	int		16h	    ; laksanakan / dapatkan penekanan tombol dari keyboard 
	cmp		al, 35      ; cek apakah tandanya menujukkan karakter ascii 35, yaitu '#', jika tidak kembali ke start
	jnz		start	    ; jump if not zero ke 'start'
		
	mov		ax, 4c00h   ; akhir dari program
	int		21h	    ; lakukan interrupt

print_nl:				; sebagai enter / agar kaliamat berikutnya dapat ditaruh di line berikutnya
	mov		dx, new_line	; mengisi register dengan new_line 
	mov		ah, 9           ; cetak kalimat 
	int		21h		; lakukan interrupt
ret

section .data
new_line	    db		13, 10, '$'			; sama dengan 0xD, 0xA, '$'
msg		    db		"Angka(1-9): $"	                ; 'msg' yang berisi kalimat untuk di-output-kan nantinya
akhir		    db		"Ingin keluar program? (#)$"	; 'akhir' yang berisi kalimat untuk di-output-kan nantinya
