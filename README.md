### OrderFood App

Aplikasi OrderFood adalah aplikasi sederhana berbasis Android yang memungkinkan pengguna memilih makanan favorit, melihat detail pesanan, mengisi alamat, hingga melakukan konfirmasi pesanan.
Aplikasi ini dibuat menggunakan Kotlin dan Android Studio, dengan desain sederhana serta navigasi menggunakan Bottom Navigation View.

✨ Fitur Utama

Login dan input nama pengguna

Menampilkan daftar makanan dengan gambar dan nama

Menampilkan detail pesanan setelah memilih makanan

Mengirim pesanan dengan memasukkan alamat

Konfirmasi pesanan dan tampilan ucapan terima kasih

Navigasi bawah (Home, Order, Profile)

Toast interaktif saat memilih makanan atau menekan tombol navigasi

🧭 Struktur Navigasi
Activity	Deskripsi Singkat
1. SplashActivity	Menampilkan logo awal aplikasi sebelum masuk ke login
2. LoginActivity	Pengguna memasukkan nama untuk melanjutkan ke beranda
3. HomeActivity	Menampilkan daftar makanan favorit dalam bentuk card
4. OrderActivity	Menampilkan makanan yang dipilih beserta gambar dan tombol kirim
5. AddressActivity	Pengguna mengisi alamat pengiriman makanan
6. ConfirmationActivity	Menampilkan konfirmasi bahwa pesanan sedang diproses
7. ProfileActivity	Menampilkan profil atau data pengguna
8. BottomNavigation	Navigasi bawah untuk berpindah antar halaman utama (Home, Order, Profile)
🖼️ Tampilan Aplikasi
1. Splash Screen

2. Login Screen

3. Home Screen

Menampilkan daftar makanan favorit dengan gambar dan tombol “Pesan”.


4. Order Screen

Menampilkan detail makanan yang dipilih dan tombol “Kirim”.


5. Address Screen

Form untuk memasukkan alamat pengiriman.


6. Confirmation Screen

Menampilkan pesan konfirmasi bahwa pesanan dikirim.


7. Profile Screen

Menampilkan profil pengguna.


8. Bottom Navigation

Navigasi bawah dengan tombol Home, Order, dan Profile.


🛠️ Teknologi yang Digunakan

Kotlin (Android)

Android Studio

Material Design Components

BottomNavigationView

Intent & Toast

LinearLayout, ConstraintLayout, dan CardView

🚀 Cara Menjalankan

Clone repository ini:

git clone https://github.com/username/orderfood.git


Buka project di Android Studio

Jalankan dengan Emulator atau perangkat Android

👨‍💻 Pengembang

Nama: Al Khawarizmi
Universitas: UIN Bandung
Jurusan: Teknik Informatika
