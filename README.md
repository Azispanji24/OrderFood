###OrderFood App
Aplikasi Android sederhana bertema Order Food 🍔🍕 yang memungkinkan pengguna memilih makanan favorit, melihat detail pesanan, mengisi alamat, dan melakukan konfirmasi.
Project ini dibuat menggunakan Kotlin, XML Layout, dan Android Studio, dengan navigasi berbasis BottomNavigationView dan Intent antar Activity.

🧩 Fitur Utama

Pilih makanan favorit dari daftar menu 🍩🍦🍣

Lihat detail pesanan beserta gambar makanan

Isi alamat pengiriman sebelum konfirmasi

Navigasi bawah (Home, Order, Profile) di setiap layar

Desain responsif dan tampilan bersih menggunakan ConstraintLayout & ScrollView

🧠 Teknologi yang Digunakan
Komponen	Deskripsi
Bahasa Pemrograman	Kotlin
UI Layout	XML (ConstraintLayout, LinearLayout, ScrollView)
Navigasi	BottomNavigationView
Library Tambahan	de.hdodenhof:circleimageview untuk gambar berbentuk lingkaran
IDE	Android Studio Iguana atau lebih baru
🏗️ Struktur Activity (8 Screen)
1️⃣ SplashActivity

Menampilkan logo dan nama aplikasi saat pertama kali dibuka.


2️⃣ LoginActivity

User memasukkan username untuk masuk ke aplikasi.


3️⃣ HomeActivity

Menampilkan daftar makanan dengan gambar dan deskripsi.
Pengguna bisa memilih salah satu makanan, lalu menekan tombol Lanjut (melayang di kanan bawah) untuk memesan.


4️⃣ OrderActivity

Menampilkan pesanan pengguna (nama dan gambar makanan yang dipilih).
Tersedia tombol Kirim untuk lanjut ke halaman pengisian alamat.


5️⃣ AddressActivity

User mengisi alamat lengkap untuk pengiriman pesanan.
Setelah itu menekan tombol Konfirmasi.


6️⃣ ConfirmationActivity

Menampilkan ringkasan pesanan (nama user, makanan, dan alamat).
Berfungsi sebagai halaman konfirmasi akhir sebelum pesanan dikirim.


7️⃣ ProfileActivity

Menampilkan profil sederhana user (nama, dan mungkin informasi akun).


8️⃣ SuccessActivity

Menampilkan pesan sukses setelah pesanan dikirim.
Biasanya berisi animasi atau ikon centang ✅.


⚙️ Cara Menjalankan

Clone repository ini

git clone https://github.com/username/orderfood-app.git


Buka di Android Studio

Jalankan di Emulator atau Perangkat Fisik

Pastikan Gradle dan SDK sudah terupdate

🧾 Struktur Folder Utama
app/
 ├─ java/lat/pam/orderfood/
 │   ├─ SplashActivity.kt
 │   ├─ LoginActivity.kt
 │   ├─ HomeActivity.kt
 │   ├─ OrderActivity.kt
 │   ├─ AddressActivity.kt
 │   ├─ ConfirmationActivity.kt
 │   ├─ ProfileActivity.kt
 │   └─ SuccessActivity.kt
 │
 ├─ res/
 │   ├─ layout/
 │   │   ├─ activity_home.xml
 │   │   ├─ activity_order.xml
 │   │   ├─ activity_address.xml
 │   │   ├─ activity_confirmation.xml
 │   │   ├─ activity_profile.xml
 │   │   ├─ activity_success.xml
 │   │   └─ activity_login.xml
 │   └─ drawable/
 │       ├─ donut_circle.png
 │       ├─ burger.png
 │       ├─ pizza.png
 │       └─ lainnya...
 │
 ├─ AndroidManifest.xml
 └─ build.gradle

🧑‍🎨 Preview Tampilan

Berikut contoh tampilan dari beberapa activity (ganti dengan tangkapan layar milikmu)

Home	Order	Confirmation

	
	
🧑‍💻 Pengembang

Nama: Al Khawarizmi
Kampus: UIN Bandung – Informatika
Semester: 4
Deskripsi: Mahasiswa yang tertarik pada pengembangan front-end dan desain UI modern ✨
