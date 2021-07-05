package com.android.dicodingsubmission

object androiddata {
    private val android_Version = arrayOf("Ice Cream Sandwich",
    "Jelly Bean",
    "KitKat",
    "Lollipop",
    "Marshmallow",
    "Nougat",
    "Oreo",
    "Pie",
    "Android 10",
    "Android 11")

    private val androidDetails = arrayOf("SDK Android 4.0.1 (Ice Cream Sandwich), berdasarkan kernel Linux 3.0.1, dirilis pada 19 Oktober 2011. Petinggi Google, Gabe Cohen, menyatakan bahwa Android 4.0 (secara teoretis kompatibel) dengan perangkat Android 2.3x yang diproduksi pada saat itu. Kode sumber untuk Android 4.0 tersedia pada tanggal 14 November 2011.",
        "Google mengumumkan Android 4.1 (Jelly Bean) dalam konferensi Google I/O pada tanggal 27 Juni 2012. Berdasarkan kernel Linux 3.0.31, Jelly Bean adalah pembaruan penting yang bertujuan untuk meningkatkan fungsi dan kinerja antarmuka pengguna (UI), Pembaruan ini diwujudkan dalam (Proyek Butter), perbaikan ini termasuk antisipasi sentuh, triple buffering, perpanjangan waktu vsync, dan peningkatan frame rate hingga 60 fps untuk menciptakan UI yang lebih halus.",
        "Google mengumumkan Android 4.4 KitKat (dinamai dengan izin dari Nestlé dan Hershey) pada 3 September 2013, dengan tanggal rilis 31 Oktober 2013.[108][109] Sebelumnya, rilis berikutnya setelah Jelly Bean diperkirakan akan diberi nomor 5.0 dan dinamai 'Key Lime Pie'",
        "Android 5.0 pertama kali diperkenalkan di bawah codename (Android L) pada 25 Juni 2014 selama presentasi keynote pada konferensi pengembang Google I / O. Di samping Lollipop, presentasi difokuskan pada sejumlah platform Android yang berorientasi dan teknologi baru, termasuk Android TV, pada platform Android Auto, dapat dipakai pada platform komputasi Android Wear, dan platform pelacakan kesehatan Google Fit.",
        "Android 6.0 dan 6.0.1 (Marshmallow) adalah versi utama keenam dari sistem operasi Android dan versi ke 13 dari Android. Pertama kali dirilis sebagai versi beta pada 28 Mei 2015, secara resmi dirilis pada 5 Oktober 2015, dengan perangkat Nexus menjadi yang pertama menerima pembaruan. Marshmallow terutama berfokus pada peningkatan pengalaman pengguna secara keseluruhan dari pendahulunya, Lollipop. Ini memperkenalkan arsitektur izin baru, API baru untuk asisten kontekstual (pertama kali digunakan oleh fitur baru (Now on Tap) untuk memberikan hasil pencarian yang peka terhadap konteks), sistem manajemen daya baru yang mengurangi aktivitas latar belakang ketika perangkat tidak ditangani secara fisik, dukungan asli untuk pengenalan sidik jari dan konektor USB-C, kemampuan untuk memigrasikan data dan aplikasi ke kartu microSD, dan perubahan internal lainnya.",
        "Android (Nougat) (kode nama N dalam pengembangan) adalah rilis 7.0 besar dari sistem operasi Android. Ini pertama kali dirilis sebagai pratinjau pengembang pada tanggal 9 Maret 2016, dengan gambar pabrik untuk perangkat Nexus saat ini, serta dengan (Program Beta Beta) baru yang memungkinkan perangkat yang didukung ditingkatkan versinya ke versi Android Nougat melalui over-the -air update. Rilis terakhir adalah pada tanggal 22 Agustus 2016. Pratinjau akhir pembuatannya dirilis pada tanggal 18 Juli 2016, dengan nomor bangunan NPD90G.",
        "Android Oreo adalah rilis utama ke 8 dari sistem operasi Android. Ini pertama kali dirilis sebagai preview pengembang pada tanggal 21 Maret 2017, dengan gambar pabrik untuk perangkat Nexus dan Pixel saat ini. Pratinjau pengembang terakhir dirilis pada tanggal 24 Juli 2017, dengan rilis stabil pada bulan Agustus 2017.",
        "Android Pie adalah versi utama kesembilan dari sistem operasi Android. Ini pertama kali diumumkan oleh Google pada 7 Maret 2018, dan pratinjau pengembang pertama dirilis pada hari yang sama. Pratinjau kedua, dianggap kualitas beta, dirilis pada 8 Mei 2018. Beta terakhir Android Pie (pratinjau kelima, juga dianggap sebagai [Kandidat Rilis]) dirilis pada 25 Juli 2018. Rilis resmi pertama dirilis pada 6 Agustus 2018.",
        "Android 10 adalah versi utama kesepuluh dari sistem operasi Android. Ini pertama kali diumumkan oleh Google pada 13 Maret 2019, dan beta pertama dirilis pada hari yang sama (dengan nama [Android Q] pada saat itu). Beta kedua dirilis pada 3 April 2019. Beta ketiga dirilis pada konferensi Google I/O pada 7 Mei 2019. Kemudian, pada 5 Juni, Google merilis beta keempat, dengan API final dan SDK (API Level) 29). Pada 10 Juli 2019, Google merilis Beta 5 dengan API 29 SDK terakhir serta optimasi terbaru dan perbaikan bug. Ini adalah kandidat rilis untuk pengujian. Pada tanggal 7 Agustus 2019, Google merilis Beta 6, yang merupakan beta terakhir sebelum pengumuman Android Q. Pada 22 Agustus 2019, Google mengumumkan bahwa versi rilis resmi akan disebut hanya Android 10 yang tak lagi memakai konvensi penggunaan julukan nama dan huruf dessert/makanan pencuci mulut untuk umum. Android 10 sebelumnya akan dikenal sebagai (Queen Cake). Secara internal, Android 10 dikenal sebagai Quince Tart. Versi stabil Android 10 dirilis pada 3 September 2019.",
        "Android 11 adalah rilis utama kesebelas dan versi ke-18 Android, sistem operasi telepon genggam yang dikembangkan oleh Open Handset Alliance yang dipimpin oleh Google. Sistem operasi ini dirilis pada 8 September 2020. Ponsel pertama yang diluncurkan di Eropa dengan Android 11 adalah Vivo X51 5G dan setelah rilis stabil penuhnya, ponsel pertama di dunia yang hadir dengan Android 11 setelah Google Pixel adalah OnePlus 8T. Pada bulan April 2021, 12.44% perangkat Android menjalankan Android 11 (API 30)")

    private val androidImages = intArrayOf(R.drawable.ics,
        R.drawable.jb,
        R.drawable.kk,
        R.drawable.lp,
        R.drawable.mm,
        R.drawable.nougat,
        R.drawable.oreo,
        R.drawable.pie,
        R.drawable.android_10,
        R.drawable.android_11)

    val listData: ArrayList<android>
        get() {
            val list = arrayListOf<android>()
            for (position in android_Version.indices) {
                val and = android()
                and.android_version = android_Version[position]
                and.detail = androidDetails[position]
                and.image = androidImages[position]
                list.add(and)
            }
            return list
        }
}