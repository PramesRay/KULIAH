; header
org 100h
global start
section .text

start:
		mov		ah, 9      	; untuk print output berupa string
		mov		dx, msg     ; memindahkan isi 'msg' ke register dx 
		int		21h         ; lakukan interrupt untuk cetak kalimat

		mov		ah, 0ah     ; buffer diisi dengan input
		mov		dx, buffer  ; memindahkan isi 'buffer' ke dx -> buffer adalah jumlah char yang dapat dimasukkan pada program
		int		21h			; lakukan interrupt
		
		xor		bx, bx          		; sama dengan mov bx, 0 => keduanya mengatur register bx ke 0
		mov		bl, [panjang]  		 	; menyalin isi memori pada alamat 'panjang' ke BL
		mov		byte [teks+bx+1], '$'   ; opcode & operand, byte ptr [] menyimpan nilai 8 bit, dollar sign digunakan untuk merujuk ke alamat saat ini
										; instruksi seperti xor bx, bx atau mov [eax], 0 ukurannya tidak dapat disimpulkan, 
                                        ; jadi diperlukan byte ptr untuk menunjukkan ukuran operan memory yang mengacu pada byte dalam memori

		call	print_nl    ; push print_nl / cetak enter => tanpa print_nl, 'msg' tidak akan muncul ketika 'pir' di print
		
		mov		dx, pir     ; string 'pir' untuk mencetak piramida
		call	print       ; push print
		
		call	print_nl	; push print_nl / cetak enter => memisahkan 'msg' dan 'pir'
		
		xor		bx, bx      ; mengatur ulang bx => return 0 
		
	piramida:
		cmp		bl, byte [panjang] 	; compare panjang dengan bl, jika bl = panjang string, maka jump ke 'exit'
								   	; compare penting agar piramida dapat di print
		jz		exit			   	; jump if zero ke 'exit' => jika tidak ada jump ke exit, -
									; maka output akan looping tanpa berhenti
		
		mov		cl, byte [panjang] 	; memasukkan nilai dari byte [panjang] ke cl
									; digunakan untuk menetukan berapa banyak spasi akan dicetak 
		sub		cl, bl             	; cl = cl - bl => untuk mengurangi jumlah spasi pada tiap baris
		sub		cl, 1              	; cl = cl - 1 = dec cl 
									; digunakan agar spasi yang berkurang pada tiap baris sesuai (panjang - posisi karakter)
		
		cmp		cl, 0              	; apabila cl = 0 maka jump ke 'space2'
		jz		space2		   		; jump if zero ke space 2
		
	space1:					; mengatur jumlah spasi pada setiap baris sebelah kiri			
		mov		dl, 32      ; mengisi register dengan karakter ascii 32 yaitu spasi 
		call 	print_char	; cetak karakter spasi
		loop	space1		; ulang lagi ke 'space'
	
	space2:					; mengatur jumlah bl pada setiap baris sebelah kanan bukan spasi
		mov		cl, bl      ; mencetak sebanyak bl 
		add		cl, bl      ; cl = cl + bl
		add		cl, 1       ; cl = cl + 1
		
	char:
		mov		dl, byte [teks+bx]  ; untuk mencetak karakter perbaris 
									; teks 	=> mengambil 1 value dari karakter
									; bx 	=> mengetahui posisi dari karakter yang diambil oleh teks
		call	print_char    		; cetak karakter       
		loop	char				; looping char agar karakter dapat di print sesuai jumlah perbarisnya 
									; agar dapat membentuk piramid	
		
		call	print_nl			; cetak enter
		
		inc		bx	        		; increment nilai bx (menambahkan 1) agar nilai bx berpindah ke karakter berikutnya
									; jika tidak di increment maka akan terjadi looping terus menerus pada karakter pertama
		jmp		piramida			; jump ke 'piramida' agar tiap karakter dari kata/kalimat yang dimasukkan-
									; dapat ter-print dalam setiap baris agar dapat membentuk piramid
		
exit: 						; untuk exit program atau lanjut
		mov		dx, akhir   ; string 'akhir' untuk mencetak kata
		call	print		; output string
		
		call 	print_nl	; cetak enter
		
		mov		ah, 0       ; mode teks / servis input satu karakter
		int		16h			; laksanakan / dapatkan penekanan tombol dari keyboard 
		cmp		al, 35      ; cek apakah tandanya menujukkan karakter ascii 35, yaitu '#', jika tidak kembali ke start
		jnz		start		; jump if not zero ke 'start'
		
		mov		ax, 4c00h   ; akhir dari program
		int		21h			; lakukan interrupt
			
print_nl:					; sebagai enter / agar kaliamat berikutnya dapat ditaruh di line berikutnya
	mov		dx, new_line	; mengisi register dengan new_line 
	mov		ah, 9           ; cetak kalimat 
	int		21h				; lakukan interrupt
ret
print:
	mov		ah, 9			; cetak kalimat
	int		21h				; lakukan interrupt
ret
print_char:
	mov		ah, 2			; cetak karakter
	int		21h				; lakukan interrupt
ret

section .data
new_line	db		13, 10, '$'					; sama dengan 0xD, 0xA, '$'
												; These two ASCII codes in particular are considered non-printable control characters, 
												; which affect the behavior of the output, even though you don’t see them appear in the output.
buffer		db	    100							; jumlah char yang bisa diinput
panjang		db		0
teks		times 	102 	db	'$'				; times berguna dalam mendefinisikan array, 
												; '102' digunakan agar isi dari 'msg' dapat terulang kembali setelah mencapai 'akhir', 
												; integer tsb dapat mealokasikan memori-
												; dari '$', yaitu alamat dari karakter yang diinput satu persatu
												; sehingga teks dalam program ini dapat mengambil value dari karakter yang dimasukkan 
												
msg		    db		"Masukkan string (Max: 100 karakter): $"	; 'msg' yang berisi kalimat untuk di-output-kan nantinya
pir			db		"Bentuk piramida : $"						; 'pir' yang berisi kalimat untuk di-output-kan nantinya
akhir		db		"Keluar dari Program? (#)$"					; 'akhir' yang berisi kalimat untuk di-output-kan nantinya