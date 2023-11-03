package com.cinar.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cinar.quizapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int soruno = 0, dogru = 0, yanlis = 0;

    private ActivityMainBinding binding;

    // Diğer değişkenlerin tanımlamaları gibi kısmı buraya ekleyin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



    }

    public void btnSonra(View view) {
       binding.btnA.setEnabled(true);
        binding. btnB.setEnabled(true);
        binding. btnC.setEnabled(true);
        binding. btnD.setEnabled(true);

            // Use the button here
        binding.btnSonra.setEnabled(false);
        binding.BtnResim.setVisibility(View.INVISIBLE);
        binding.BtnResim2.setVisibility(View.INVISIBLE);




        soruno++;

            // Use the button here
        binding.TxtSoruNo.setText("Soru no : "+soruno);



            if (soruno == 1) {
                binding.TxtSorular.setText(" Türkiye’de olan iki ilin harfleri aynıdır. Sizce hangileri? ");
                binding.btnA.setText("Ankara ve Antalya");
                binding.btnB.setText("Bursa ve Balıkesir");
                binding.btnC.setText("Aksaray ve Sakarya");
                binding. btnD.setText("Nevşehir ve Balıkesir ");
                binding.TxtCevap.setText("Aksaray ve Sakarya");
            }
        if (soruno == 2)
        {
            binding.TxtSorular.setText(" Chicago'dan hareket eden 43 yolculu bir otobüs kullanıyorsunuz. Pittsburgh´ da 7 yolcu binip, 5 yolcu indi. Cleveland´ da 8 yolcu indi, yolcu tuvalete gidip geldi ve 4 yeni yolcu bindi. 20 saat sonra Philadelphia´ ya vardığınızda şoförün adı neydi? ");
            binding.btnA.setText("Michael Fero");
            binding. btnB.setText("Alex Gutierez");
            binding. btnC.setText("Şoför sizsiniz. Cevap kendi adınız. ");
            binding. btnD.setText("Szymanski");
            binding.TxtCevap.setText("Şoför sizsiniz. Cevap kendi adınız. ");
        }
        if (soruno == 3)
        {
            binding.TxtSorular.setText(" Saatte 2 kere ama Saniyede 1 kere meydana gelen nedir? ");
            binding. btnA.setText("Bebek");
            binding. btnB.setText("A harfi");
            binding. btnC.setText("Meyve");
            binding. btnD.setText("Yumurta");
            binding. TxtCevap.setText("A harfi");
            binding.btnSonra.setText("Sonuçlar");
        }
        if (soruno == 4)
        {
            binding. btnA.setEnabled(false);
            binding. btnB.setEnabled(false);
            binding. btnC.setEnabled(false);
            binding. btnD.setEnabled(false);
            binding.btnSonra.setEnabled(false);
            Toast.makeText(this, "Doğru: "+dogru+"\n"+"Yanlış: "+yanlis, Toast.LENGTH_LONG).show();


        }
        }



    public void btnA(View view) {
        binding.  btnA.setEnabled(false);
        binding.  btnB.setEnabled(false);
        binding.  btnC.setEnabled(false);
        binding.   btnD.setEnabled(false);

        binding.btnSonra.setEnabled(true);



        binding.TxtCevap2.setText(binding.btnA.getText()) ;
        if (binding.TxtCevap2.getText() == binding.TxtCevap.getText())
        {
            dogru++;
            binding.Txtdogru.setText("Doğru : "+dogru);
            binding.BtnResim2.setVisibility(View.VISIBLE);
        }
        else
        {
            yanlis++;
            binding.TxtYanl.setText("Yanlis : "+yanlis);
            binding.BtnResim.setVisibility(View.VISIBLE);
        }

    }
    public void btnB(View view) {

        binding.  btnA.setEnabled(false);
        binding.  btnB.setEnabled(false);
        binding.  btnC.setEnabled(false);
        binding.   btnD.setEnabled(false);

        binding.btnSonra.setEnabled(true);



        binding.TxtCevap2.setText(binding.btnB.getText()) ;
        if (binding.TxtCevap2.getText() == binding.TxtCevap.getText())
        {
            dogru++;
            binding.Txtdogru.setText("Doğru : "+dogru);
            binding.BtnResim2.setVisibility(View.VISIBLE);
        }
        else
        {
            yanlis++;
            binding.TxtYanl.setText("Yanlis : "+yanlis);
            binding.BtnResim.setVisibility(View.VISIBLE);
        }

    }
    public void btnC(View view) {
        binding.  btnA.setEnabled(false);
        binding.  btnB.setEnabled(false);
        binding.  btnC.setEnabled(false);
        binding.   btnD.setEnabled(false);

        binding.btnSonra.setEnabled(true);



        binding.TxtCevap2.setText(binding.btnC.getText()) ;
        if (binding.TxtCevap2.getText() == binding.TxtCevap.getText())
        {
            dogru++;
            binding.Txtdogru.setText("Doğru : "+dogru);
            binding.BtnResim2.setVisibility(View.VISIBLE);
        }
        else
        {
            yanlis++;
            binding.TxtYanl.setText("Yanlis : "+yanlis);
            binding.BtnResim.setVisibility(View.VISIBLE);
        }

    }
    public void btnD(View view) {
        binding.  btnA.setEnabled(false);
        binding.  btnB.setEnabled(false);
        binding.  btnC.setEnabled(false);
        binding.   btnD.setEnabled(false);

        binding.btnSonra.setEnabled(true);



        binding.TxtCevap2.setText(binding.btnD.getText()) ;
        if (binding.TxtCevap2.getText() == binding.TxtCevap.getText())
        {
            dogru++;
            binding.Txtdogru.setText("Doğru : "+dogru);
            binding.BtnResim2.setVisibility(View.VISIBLE);
        }
        else
        {
            yanlis++;
            binding.TxtYanl.setText("Yanlis : "+yanlis);
            binding.BtnResim.setVisibility(View.VISIBLE);
        }


    }




            }
