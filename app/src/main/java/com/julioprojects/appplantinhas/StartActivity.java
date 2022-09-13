package com.julioprojects.appplantinhas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.julioprojects.appplantinhas.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {

    private ActivityStartBinding binding;
    private Animation animate_btn, animate_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clicks();
        animations();

    }

    private void animations() {

        animate_btn = AnimationUtils.loadAnimation(this, R.anim.animate_btn);
        animate_text = AnimationUtils.loadAnimation(this, R.anim.animate_text);

        binding.btnCircle.setAnimation(animate_btn);
        binding.btnArrow.setAnimation(animate_btn);
        binding.tvStart.setAnimation(animate_text);
        //

    }

    private void clicks() {
        binding.constraintStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   startActivity(new Intent(this,));
            }
        });

    }
}