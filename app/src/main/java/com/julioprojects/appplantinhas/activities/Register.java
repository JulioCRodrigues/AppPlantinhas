package com.julioprojects.appplantinhas.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.julioprojects.appplantinhas.R;
import com.julioprojects.appplantinhas.databinding.ActivityRegisterBinding;
import com.julioprojects.appplantinhas.model.Users;

public class Register extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private FirebaseDatabase database;
    private DatabaseReference reference;
    private FirebaseAuth auth;
    private Users user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Instancias

        // Init auth
        auth = FirebaseAuth.getInstance();

        // Init database
        database = FirebaseDatabase.getInstance();

        // Init user model
        user = new Users();

        // Registrar usuário
        binding.imageRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser(binding.editTextEmail.getText().toString(), binding.editTextPassword.getText().toString());
            }
        });
    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            // Populando o objeto user para inserir no banco de dados

                            user.setName(binding.editTextName.getText().toString());
                            user.setEmail(binding.editTextEmail.getText().toString());
                            user.setPassword(binding.editTextPassword.getText().toString());


                            userInsertDatabase(user);
                            Toast.makeText(Register.this, "Usuário criado com sucesso!", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(Register.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    private void userInsertDatabase(Users user) {

        reference = database.getReference("users");

        String key = reference.child("users").push().getKey();

        user.setUid(key);

        // Salvando no banco de dados
        reference.child(key).setValue(user);

    }
}