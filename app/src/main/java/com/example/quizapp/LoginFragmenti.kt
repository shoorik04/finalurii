package com.example.a52finaluri

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.quizapp.R
import com.google.firebase.auth.FirebaseAuth


class LoginFragmenti : Fragment(R.layout.fragment_log_in) {
    private lateinit var mail : EditText
    private lateinit var pass : EditText
    private lateinit var btnlogin : Button
    private lateinit var register : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        mail=view.findViewById(R.id.loginmail)
        pass=view.findViewById(R.id.loginpass)
        btnlogin=view.findViewById(R.id.login)
        register=view.findViewById(R.id.register)


        val navController = Navigation.findNavController(view)


        register.setOnClickListener{

            val registracia = LoginFragmentiDirections.actionLoginFragmentiToRegisterFragmenti()
            navController.navigate(registracia)

        }


        btnlogin.setOnClickListener{
            val email = mail.text.toString()
            val password = pass.text.toString()


            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this@LoginFragmenti.requireActivity(), "გთხოვთ, შეიყვანეთ Email და პაროლი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        val intent = Intent (this@LoginFragmenti.requireContext(), MainActivityMenu::class.java)
                        startActivity(intent)

                    }
                    else {
                        Toast.makeText(this@LoginFragmenti.requireActivity(), "გთხოვთ, შეიყვანეთ სწორი Email და პაროლი", Toast.LENGTH_SHORT).show()
                    }
                }}}}
