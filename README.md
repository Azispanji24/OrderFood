# OrderFood App

Aplikasi OrderFood adalah aplikasi sederhana berbasis Android yang memungkinkan pengguna memilih makanan favorit, melihat detail pesanan, mengisi alamat, hingga melakukan konfirmasi pesanan.
Aplikasi ini dibuat menggunakan Kotlin dan Android Studio, dengan desain sederhana serta navigasi menggunakan Bottom Navigation View.

## Fitur Utama

1. Login dan input nama pengguna

2. Menampilkan daftar makanan dengan gambar dan nama

3. Menampilkan detail pesanan setelah memilih makanan

4. Mengirim pesanan dengan memasukkan alamat

5. Konfirmasi pesanan dan tampilan ucapan terima kasih

6. Navigasi bawah (Home, Order, Profile)

7. Toast interaktif saat memilih makanan atau menekan tombol navigasi

## Struktur Navigasi
Activity	                  - Deskripsi Singkat
1. SplashActivity	         - Menampilkan logo awal aplikasi sebelum masuk ke login
2. LoginActivity	         - Pengguna memasukkan nama untuk melanjutkan ke beranda
3. HomeActivity	         - Menampilkan daftar makanan favorit dalam bentuk card
4. OrderActivity	         - Menampilkan makanan yang dipilih beserta gambar dan tombol kirim
5. AddressActivity	      - Pengguna mengisi alamat pengiriman makanan
6. ConfirmationActivity	   - Menampilkan konfirmasi bahwa pesanan sedang diproses
7. ProfileActivity	      - Menampilkan profil atau data pengguna
8. BottomNavigation	      - Navigasi bawah untuk berpindah antar halaman utama (Home, Order, Profile)
   
## Tampilan Aplikasi

1. Splash Screen  
   <img src="https://github.com/user-attachments/assets/4048d9d8-7368-4630-b805-1df3eebcc4e4" width="300" />

2. Welcome Screen  
   <img src="https://github.com/user-attachments/assets/9aad869a-e131-4ac9-9560-efe888e26f5f" width="300" />

3. Login Screen  
   <img src="https://github.com/user-attachments/assets/cc1200ca-61f0-4ddd-a578-bc3279645e55" width="300" />

4. Register Screen  
   <img src="https://github.com/user-attachments/assets/2cda2d94-c46a-4f68-a31e-f5c8bf867b8f" width="300" />
   
5. Home Screen  
   Menampilkan daftar makanan favorit dengan gambar dan tombol “Pesan”.  
   <img src="https://github.com/user-attachments/assets/7f42aff3-92ca-4b34-85fe-2563a258a6dc" width="300" />

6. Order Screen  
   Menampilkan detail makanan yang dipilih dan tombol “Kirim”.  
   <img src="https://github.com/user-attachments/assets/3de7c52f-4097-42f6-a664-cf6d71485171" width="300" />

7. Address Screen  
   Form untuk memasukkan alamat pengiriman.  
   <img src="https://github.com/user-attachments/assets/6ee2d709-717d-4491-a6e5-296149919972" width="300" />

8. Confirmation Screen  
   Menampilkan pesan konfirmasi bahwa pesanan dikirim.  
   <img src="https://github.com/user-attachments/assets/8dbff445-7d34-4f29-ba37-31c95ebb6b42" width="300" />









## Teknologi yang Digunakan

- Kotlin (Android)

- Android Studio

- Material Design Components

- BottomNavigationView

- Intent & Toast

- LinearLayout, ConstraintLayout, dan CardView

## Cara Menjalankan

1. Clone repository ini:

  git clone https://github.com/username/orderfood.git


2. Buka project di Android Studio

3. Jalankan dengan Emulator atau perangkat Android

## Pengembang

Nama: Azis Panji Gumilang
Universitas: UIN Sunan Gunung Djati Bandung
Jurusan: Teknik Informatika 2023
