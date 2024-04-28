package com.example.parcialpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navegacion: BottomNavigationView

    private val opcionMenuSeleccionada = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId) {
            R.id.fragmento3 -> {
                supportFragmentManager.commit {
                    replace<TercerFragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento4 -> {
                supportFragmentManager.commit {
                    replace<CuartoFragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento5 -> {
                supportFragmentManager.commit {
                    replace<QuintoFragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento6 -> {
                supportFragmentManager.commit {
                    replace<SextoFragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<TercerFragmento>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnNavigationItemSelectedListener(opcionMenuSeleccionada)

    }

}