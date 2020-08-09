package com.example.hello

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*
import java.net.PasswordAuthentication
import java.util.jar.Attributes
import kotlinx.android.synthetic.main.activity_main.etPassword as etPassword1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvRegister.setOnClickListener{
            val intent=Intent(baseContext,RegistrationActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            var Name :String =etFirstName.text.toString()
            var Password :String =etPassword.text.toString()
            Toast.makeText(baseContext,Password,Toast.LENGTH_SHORT).show()


        }











    }
}