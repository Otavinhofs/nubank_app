package com.otavio.nubankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.otavio.nubankapp.Recycler.MyRvAdapter
import com.otavio.nubankapp.Recycler.RvAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    private lateinit var rvAdapter: MyRvAdapter
    lateinit var dataSource: ArrayList<RvAdapter>
    private var card: View = findViewById(R.id.card)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        init()

    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler)
        recyclerView.setHasFixedSize(true)
        dataSource = ArrayList()
        addDataToList()
        rvAdapter = MyRvAdapter(dataSource)
        recyclerView.adapter = rvAdapter
    }

    private fun addDataToList() {
        dataSource.add(RvAdapter(R.drawable.pix_icon, "Fazer um pix"))
        dataSource.add(RvAdapter(R.drawable.bar_code, "Pagar um boleto"))
        dataSource.add(RvAdapter(R.drawable.deposit_icon, "Fazer um depósito"))
        dataSource.add(RvAdapter(R.drawable.shop_icon, "Faça umas compras"))
    }

    private fun setCardClick() {
        card.setOnClickListener {

        }
    }

}