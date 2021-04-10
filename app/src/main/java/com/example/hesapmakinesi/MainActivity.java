package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSayiBir;
    EditText edtSayiIki;

    TextView txtSonuc;

    Button btnTopla;
    Button btnCikar;
    Button btnCarp;
    Button btnBol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSayiBir = findViewById(R.id.edt_SayıBir);
        edtSayiIki = findViewById(R.id.edt_SayiIki);

        txtSonuc = findViewById(R.id.txt_Sonuc);

        btnTopla = findViewById(R.id.btn_Topla);
        btnCikar = findViewById(R.id.btn_Cikar);
        btnCarp = findViewById(R.id.btn_Carp);
        btnBol = findViewById(R.id.btn_Bol);

        //Toplama butona tıklandığında nelerin yapılacağını göstereceğiz
        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer sayi1, sayi2, toplam;
                sayi1 = Integer.parseInt(edtSayiBir.getText().toString());
                sayi2 = Integer.parseInt(edtSayiIki.getText().toString());

                toplam = sayi1 + sayi2;

                txtSonuc.setText("= " + toplam.toString());
            }
        });
        //Çıkarma butonuna tıklandığında nelerin yapılacağını göreceğiz
        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer sayi1;
                Integer sayi2;
                Integer cikarma;

                sayi1 = Integer.parseInt(edtSayiBir.getText().toString());
                sayi2 = Integer.parseInt(edtSayiIki.getText().toString());

                cikarma = sayi1 - sayi2;

                txtSonuc.setText("= "+cikarma.toString());
            }
        });
        //Çarpma butonuna tıklandığında nelerin yapılacağını göreceğiz
        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer sayi1;
                Integer sayi2;
                Integer carpim;

                sayi1 = Integer.parseInt(edtSayiBir.getText().toString());
                sayi2 = Integer.parseInt(edtSayiIki.getText().toString());

                carpim = sayi1 * sayi2;

                txtSonuc.setText("= " + carpim.toString());
            }
        });
        //Bölme butonuna tıklandığında nelerin yapılacağını göreceğiz
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double sayi1 = Double.parseDouble(edtSayiBir.getText().toString());
                Double sayi2 = Double.parseDouble(edtSayiIki.getText().toString());

                Double bolum = sayi1 / sayi2;

                txtSonuc.setText("= " + bolum.toString());
            }
        });
    }
}