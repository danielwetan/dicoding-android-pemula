package com.dicoding.thesahabas;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class SahabasData {

    private static String[] sahabaNames = {
            "Abu Bakr ash-Shiddiq رضي الله عنه",
            "Umar bin Khattab رضي الله عنه",
            "Utsman bin Affan رضي الله عنه",
            "Ali bin Abi Thalib رضي الله عنه",
            "Thalhah bin Ubaidillah رضي الله عنه",
            "Zubair bin Awwam رضي الله عنه",
            "Abdurrahman bin Auf رضي الله عنه",
            "Sa'ad bin Abi Waqqash رضي الله عنه",
            "Sa'id bin Zaid رضي الله عنه",
            "Abu Ubaidah bin al-Jarrah رضي الله عنه"
    };

    private static String[] sahabaDetails = {
                "Setelah Nabi صلى الله عليه وسلم wafat, Abu Bakar رضي الله عنه menjadi khalifah Islam yang pertama pada tahun 632 hingga tahun 634M. Lahir dengan nama Abdullah bin Abi Quhafah, ia adalah satu di antara empat khalifah yang diberi gelar Khulafaur Rasyidin atau khalifah yang diberi petunjuk."
                    + "\n\nSebagai pemeluk awal Islam, Beliau telah mengambil berbagai peran besar. Melalui ajakannya ia berhasil mengislamkan banyak orang yang di kemudian hari menjadi tokoh-tokoh penting dalam sejarah Islam, di antaranya adalah 'Utsman bin 'Affan رضي الله عنه yang kemudian menjadi khalifah ketiga. Ia juga turut serta dalam berbagai perang seperti Perang Badar (624 M/2 H) dan Perang Uhud (625 M/3 H).",

                "Khalifah kedua Islam (634-644). Umar رضي الله عنه merupakan satu di antara empat orang Khalifah yang digolongkan sebagai Khalifah yang diberi petunjuk (Khulafaur Rasyidin)."
                    +"\n\nPada masa kepemimpinannya, kekhalifahan menjadi salah satu kekuatan besar baru di wilayah Timur Tengah. Selain menaklukan Kekaisaran Sasaniyah hanya dalam kurun waktu dua tahun (642–644), Ia berhasil mengambil alih kepemimpinan dua pertiga wilayah Kekaisaran Romawi Timur.",

                "Khulafaur Rasyidin yang ke-3. Utsman رضي الله عنه adalah seorang yang saudagar yang kaya tetapi sangatlah dermawan. Ia juga berjasa dalam hal membukukan Al-Qur’an. Ia adalah khalifah ketiga yang memerintah dari tahun 644 (umur 69–70 tahun) hingga 656 (selama 11–12 tahun)."
                    + "\n\nIa dikenal sebagai pribadi yang lembut dan murah hati. Sumbangsihnya yang paling menonjol dan sangat melekat padanya adalah kedermawanan dalam memberikan harta. Ia pernah membeli sumur seorang Yahudi dengan harga sangat mahal saat kemarau dan mempersilakan penduduk mengambil air dari sana dengan cuma-cuma. Saat Perang Tabuk meletus, 'Utsman رضي الله عنه turut serta menyumbangkan ratusan unta dan kuda selain uang sejumlah ribuan dirham",

                "Salah seorang pemeluk Islam pertama dan juga keluarga dari Nabi صلى الله عليه وسلم. Ia adalah Khalifah terakhir dari Khulafaur Rasyidin."
                    + "\n\nSebagai salah satu pemeluk Islam awal, 'Ali رضي الله عنه telah terlibat dalam berbagai peran besar sejak masa kenabian, meski usianya terbilang muda bila dibandingkan sahabat utama Nabi yang lain. Ia mengikuti semua perang, kecuali Perang Tabuk, selain sebagai pengusung panji, ia juga berperan sebagai sekretaris dan pembawa pesan Nabi. Ia juga ditunjuk sebagai pemimpin pasukan pada Perang Khaibar.",

                "Sahabat nabi yang berasal dari Quraisy, nama lengkapnya adalah Thalhah bin Abdullah bin Usman bin Kaab bin Said رضي الله عنه. Ia termasuk enam penasihat Nabi صلى الله عليه وسلم dan sepuluh orang yang dijanjikan masuk surga."
                    + "\n\nThalhah رضي الله عنه mengikuti Perang Uhud dan menderita luka parah yang luar biasa. Dia menggunakan dirinya menjadi perisai bagi Nabi صلى الله عليه وسلم dan mengalihkan panah yang akan menancap diri Rasulullah dengan tangannya sehingga semua jari-jarinya terputus. Ia akhirnya meninggal akibat terpanah pada Perang Jamal.",

                "Ia adalah Putra bibi Nabi صلى الله عليه وسلم salah satu sahabat nabi dan termasuk as-Sabiqun al-Awwalun, yaitu salah seorang dari 10 orang yang pertama masuk Islam."
                    + "\n\nKetika pamanya Naufal bin Khuwailid mengetahui Ia telah memeluk Islam, Pamannua sangat marah dan berusaha menyiksanya, Zubair dimasukkan kedalam karung tikar, kemudian dibakar.",

                "Salah seorang dari delapan orang pertama (As-Sabiqunal Aw-Walun) yang menerima agama Islam. Abdurrahman bin Auf berasal رضي الله عنه dari Bani Zuhrah. Salah seorang sahabat Nabi lainnya, yaitu Sa’ad bin Abi Waqqas رضي الله عنه, adalah saudara sepupunya. "
                    + "\n\nAbdurrahman bin Auf رضي الله عنه merupakan salah satu dari sepuluh sahabat yang dijamin masuk surga",

                "Merupakan salah satu yang awal masuk Islam dan salah satu sahabat penting Nabi صلى الله عليه وسلم. Ia berasal dari klan Bani Zuhrah dari suku Quraisy, dan paman Nabi صلى الله عليه وسلم dari garis pihak ibu. Ia memiliki putera bernama Umar bin Sa’ad رضي الله عنه"
                    + "\n\nIa lahir dan besar di kota Mekkah. Ia dikenal sebagai pemuda yang serius dan memiliki pemikiran yang cerdas. Sosoknya tidak terlalu tinggi namun bertubuh tegap dengan potongan rambut pendek. Orang-orang selalu membandingkannya dengan singa muda.",

                "Ia juga dijuluki “Abu al-Aawar”. Ia lahir pada 593-4 masehi dan merupakan beberapa orang pertama yang awal masuk Islam. Said bin Zaid رضي الله عنه adalah sepupu Umar bin Khatthab رضي الله عنه dan menikah dengan saudaranya. Ia masuk Islam pada awal datangnya islam di Mekah. "
                    + "\n\nDia termasuk orang yang awal masuk Islam dan dia sangat menjunjung tingi adab Islam. Sebelum dia masuk Islam dia mengikuti agama ayahnya, Zaid bin Amr bin Nufail, yang mengikuti agama Nabi Ibrahim.\n",

                "Muhajirin dari kaum Quraisy Mekkah yang termasuk paling awal untuk memeluk agama Islam. Ia ikut berhijrah ke Habasyah (saat ini Ethiopia) dan kemudian, Ia hijrah ke Madinah."
                    + "\n\nAbu Ubaidah bin al-Jarrah رضي الله عنه memiliki beberapa keutamaan dalam Islam, di antaranya adalah apa yang diriwayatkan oleh Al-Bukhari dan Muslim bahwa Rasulullah رضي الله عنه bersabda, \"Sesungguhnya setiap umat memiliki amin (orang yang paling amanah/kepercayaan), dan amin umat ini adalah Abu Ubaidah.\""
    };

    private static int[] sahabaImages = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
    };

    static ArrayList<Sahabas> getListData() {
        ArrayList<Sahabas> list = new ArrayList<>();
        for (int position = 0; position < sahabaNames.length; position++) {
            Sahabas sahabas = new Sahabas();
            sahabas.setName(sahabaNames[position]);
            sahabas.setDetail(sahabaDetails[position]);
            sahabas.setPhoto(sahabaImages[position]);
            list.add(sahabas);
        }
        return list;
    }

}
