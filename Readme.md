PENJELASAN LAPORAN PRAKTIKUM_2 PBO

TUGAS:
Membuat class Makhluk hidup dan turunannya, dibuat dengan diagram. Didalamnya
class harus ada minimal 3 buah konstruktor dan ada super dan thisnya.

1. Membuat class Parent dengan nama makhlukHidup

Didalam kelas makhlukHidup ini terdapat beberapa atribut seperti nama,
alatPernapasan, usia, jumlahkaki, jenismakanan, dan tempat hidup. Tetapi atribut ini
sifatnya masih private sehingga diperlukan sebuah method agar bisa diakses secar
public. Caranya adalah klik kanan, kemudian pilih refactor, encapsulate field, setelah
itu centang getter dan setter dari semua atribut tersebut lalu klik refactor, maka akan
secara otomatis membuat method sendiri.

2. Membuat kelas turunan yang namanya Hewan
Didalam kelas ini kelas hewan mewarisi kelas makhlukHidup dimana semua kode yang
ada dimakhlukhidup juga bisa diakses oleh hewan tanpa perlu menulis kodenya terlebih
dahulu, hal ini ditandai dengan kata Extends pada baris kedua. Selain itu terdapat
sebuah konstruktor dan super. Dimana super berfungsi untuk memanggil atribut yang
ada dalam kelas makhlukHidup.

3. Kemudian membuat kelas child dari kelas Hewan
	a. Class HewanAir
	b. Class HewanAmfibi
	c. Class HewanDarat

4. Terakhir, Membuat kelas baru bernama Kucing yang akan digunakan sebagai output.