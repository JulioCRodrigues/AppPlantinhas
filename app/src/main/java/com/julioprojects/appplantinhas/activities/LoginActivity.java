package com.julioprojects.appplantinhas.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.julioprojects.appplantinhas.R;
import com.julioprojects.appplantinhas.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private FirebaseAuth auth;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        // Recuperando instancia
        auth = FirebaseAuth.getInstance();


        // Ações de clique
        binding.tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });
        
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.edtEmail.getText().toString().isEmpty() || binding.edtSenha.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Preencha os campos para continuar!", Toast.LENGTH_SHORT).show();
                } else {
                    startLogin(binding.edtEmail.getText().toString(), binding.edtSenha.getText().toString());
                }
            }
        });


    }

    private void startLogin(String email, String password) {
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Falha ao autenticar!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void openRegister() {
        startActivity(new Intent(LoginActivity.this, Register.class));
    }
}