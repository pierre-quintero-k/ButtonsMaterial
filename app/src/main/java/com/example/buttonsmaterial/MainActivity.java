package com.example.buttonsmaterial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.buttonsmaterial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;
    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        button1= binding.airplaneBtn;
        button2= binding.pictureBtn;
        button3= binding.levelBtn;
        button4= binding.syncBtn;
        button5= binding.unlockedBtn;
        button6= binding.pausedBtn;

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.airplaneBtn:
                Toast.makeText(this, button1.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.pictureBtn:
                Toast.makeText(this, button2.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.levelBtn:
                Toast.makeText(this, button3.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.syncBtn:
                Toast.makeText(this, button4.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.unlockedBtn:
                Toast.makeText(this, button5.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.pausedBtn:
                Toast.makeText(this, button6.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}