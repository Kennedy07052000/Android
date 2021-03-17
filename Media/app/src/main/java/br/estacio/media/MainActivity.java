package br.estacio.media;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.StringJoiner;

public class MainActivity extends AppCompatActivity {
    private EditText txtAv1;
    private EditText txtAv2;
    private EditText txtAv3;
    private EditText txtAv4;
    private Button btnVerificar;
    private EditText txtMF;
    private EditText txtMaiorNota;
    private EditText txtMenorNota;
    private TextView textView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAv1 = (EditText) findViewById(R.id.txtAv1);
        txtAv2 = (EditText) findViewById(R.id.txtAv2);
        txtAv3 = (EditText) findViewById(R.id.txtAv3);
        txtAv4 = (EditText) findViewById(R.id.txtAv4);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        txtMF = (EditText) findViewById(R.id.txtMF);
        txtMaiorNota = (EditText) findViewById(R.id.txtMaiorNota);
        txtMenorNota = (EditText) findViewById(R.id.txtMenorNota);
        textView16 = (TextView) findViewById(R.id.textView16);
        String mensagem = null;
        double media;

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Media medias = new Media();

                medias.setAv1(Double.parseDouble(txtAv1.getText().toString()));
                medias.setAv2(Double.parseDouble(txtAv2.getText().toString()));
                medias.setAv3(Double.parseDouble(txtAv3.getText().toString()));
                medias.setAv4(Double.parseDouble(txtAv4.getText().toString()));
                txtMF.setText(Double.toString(medias.media()));
                txtMaiorNota.setText(Double.toString(medias.maior()));
                txtMenorNota.setText(Double.toString(medias.menor()));
                textView16.setText(medias.status());



            }

        });


    }
}