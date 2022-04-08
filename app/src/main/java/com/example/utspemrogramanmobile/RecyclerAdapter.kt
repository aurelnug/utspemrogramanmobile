package com.example.utspemrogramanmobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf(
        "Barista", "Chef", "Dokter", "Guru", "Masinis",
        "Nahkoda", "Pengusaha", "Pilot", "Pramugari", "Programmer"
    )

    private var details = arrayOf(
        "Barista adalah sebutan untuk \nseseorang yang pekerjaannya \nmembuat dan menyajikan kopi \nkepada pelanggan.",
        "Jurutama masak atau chef adalah \npekerja atau tukang masak \nprofesional yang terlatih dan mahir \ndalam semua aspek penyiapan \nmakanan, yang biasanya berfokus \npada hidangan tertentu.",
        "Dokter adalah seseorang yang karena \nkeilmuannya berusaha \nmenyembuhkan orang-orang yang \nsakit. Tidak semua orang yang menyembuhkan penyakit bisa disebut dokter.",
        "guru adalah merujuk sebagai \npendidik profesional dengan tugas \nutama mendidik, mengajar, \nmembimbing, mengarahkan, melatih, \nmenilai, dan mengevaluasi peserta \ndidik",
        "Masinis adalah orang yang \nbertanggung jawab untuk \nmenjalankan kereta api.",
        "Nakhoda adalah perwira laut yang memegang komando tertinggi di atas kapal niaga atau kapten kapal.",
        "Pengusaha adalah seseorang, \nkelompok, ataupun lembaga yang \nmelakukan kegiatan jual, beli, atau \nsewa sesuatu.",
        "Pilot, pengemudi pesawat terbang, penerbang atau juru terbang adalah \nsebutan untuk orang yang \nmengemudikan atau mengawaki \npesawat terbang",
        "Awak kabin, juga dikenal sebagai pramugara/pramugari atau air \nhost/air hostess, adalah bagian dari \nawak pesawat dalam penerbangan komersial, dalam banyak pesawat jet bisnis, dan beberapa pesawat udara \nmilik pemerintahan.",
        "Programmer adalah seseorang yang bertugas untuk membuat suatu \nsistem, aplikasi, atau program menggunakan bahasa pemrograman."
    )

    private val images = intArrayOf(
        R.drawable.barista,
        R.drawable.chef,
        R.drawable.dokter,
        R.drawable.guru,
        R.drawable.masinis,
        R.drawable.nahkoda,
        R.drawable.pengusaha,
        R.drawable.pilot,
        R.drawable.pramugari,
        R.drawable.programmer
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}