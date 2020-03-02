package com.ardianeffendi.toptenuniversities;

import java.util.ArrayList;

public class UniData {
    private static String[] uniNames = {
            "Universitas Indonesia",
            "Institut Teknologi Bandung",
            "Universitas Gadjah Mada",
            "Institut Pertanian Bogor",
            "Universitas Airlangga",
            "Institut Teknologi Sepuluh November",
            "Universitas Binus",
            "Universitas Padjajaran",
            "Universitas Diponegoro",
            "Universitas Brawijaya"
    };

    private static String[] uniDetails = {
            "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, dan kampus utama lainnya terdapat di daerah Salemba di Jakarta Pusat.",
            "Institut Teknologi Bandung (ITB) adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Kampus utama ITB saat ini merupakan lokasi dari sekolah tinggi teknik pertama di Indonesia",
            "Universitas Gadjah Mada merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949. Kampus UGM yang terletak di Yogyakarta merupakan universitas pertama yang didirikan oleh Pemerintah Republik Indonesia setelah Indonesia merdeka.",
            "Institut Pertanian Bogor adalah sebuah perguruan tinggi pertanian negeri yang berkedudukan di Bogor. Sebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia.",
            "Universitas Airlangga adalah sebuah perguruan tinggi negeri yang terletak di Surabaya, Jawa Timur. Universitas ini didirikan tanggal 10 November 1954 bertepatan dengan hari pahlawan yang ke-9.",
            "Institut Teknologi Sepuluh Nopember adalah perguruan tinggi negeri yang terletak di Surabaya. ITS awalnya didirikan oleh Yayasan Perguruan Tinggi Teknik (YPTT) yang diketuai oleh dr. Angka Nitisastro pada tanggal 10 November 1957.",
            "Universitas Bina Nusantara adalah salah satu universitas swasta Indonesia. Universitas ini bernaung di bawah lembaga pendidikan Bina Nusantara.",
            "Universitas Padjadjaran adalah sebuah perguruan tinggi negeri di Bandung, Jawa Barat, Indonesia. Sejak 20 Oktober 2014, status universitas berubah menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) dari sebelumnya berstatus Badan Layanan Umum (BLU).",
            "Universitas Diponegoro disingkat Undip adalah sebuah Perguruan Tinggi Negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. Undip didirikan pada tahun 1956 sebagai Perguruan Tinggi Swasta dan baru mendapat status sebagai Perguruan Tinggi Negeri pada tahun 1961.",
            "Universitas Brawijaya (UB) adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB."
    };

    private static int[] uniImages = {
            R.drawable.ui,
            R.drawable.itb,
            R.drawable.ugm,
            R.drawable.ipb,
            R.drawable.unair,
            R.drawable.its,
            R.drawable.binus,
            R.drawable.unpar,
            R.drawable.undip,
            R.drawable.unbraw
    };

    public static ArrayList<Uni> getListData() {
        ArrayList<Uni> list = new ArrayList<>();
        for (int i=0; i < uniNames.length; i++) {
            Uni uni = new Uni(uniDetails[i], uniDetails[i], uniImages[i]);
            uni.setName(uniNames[i]);
            uni.setDetail(uniDetails[i]);
            uni.setPhoto(uniImages[i]);
            list.add(uni);
        }
        return list;
    }
}
