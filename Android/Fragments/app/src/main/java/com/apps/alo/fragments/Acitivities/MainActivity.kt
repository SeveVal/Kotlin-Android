package com.apps.alo.fragments.Acitivities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.apps.alo.fragments.Fragments.DataFragment
import com.apps.alo.fragments.Fragments.DetailsFragment
import com.apps.alo.fragments.R

class MainActivity : FragmentActivity(), DataFragment.DataLister {
    override fun enviarDatos(text: String) {

        val dFragment = supportFragmentManager.findFragmentById(R.id.detailsFragment) as DetailsFragment
        dFragment.renderizar(text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
