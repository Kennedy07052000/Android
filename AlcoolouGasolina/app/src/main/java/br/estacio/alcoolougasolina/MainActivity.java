package br.estacio.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText txtAlcool;
    private EditText txtGasolina;
    private Button btnVerificar;
    private TextView txtvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar e vincular os objetos da tela com os atributos da classe
        txtAlcool = (EditText)findViewById(R.id.txtAlcool);
        txtGasolina = (EditText)findViewById(R.id.txtGasolina);
        btnVerificar = (Button)findViewById(R.id.btnVerificar);
        txtvMensagem = (TextView)findViewById(R.id.txtvMensagem);
        String msg = null;

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Pegando o valor digitado dos campos de álcool e gasolina e convertendo para
                //variáveis do tipo double para que possamos fazer os cálculo necessários.
                double valorAlcool = Double.parseDouble(txtAlcool.getText().toString());
                double valorGasol = Double.parseDouble(txtGasolina.getText().toString());
                String msg = null;

                //Cálculo álcool ou gasol:
                //resultado = alcool/gasolina -> resultado <= 0.7(é melhor usar alcool), senão usa gasolina

                double resultado = valorAlcool/valorGasol;
                if(resultado <= 0.7)
                {
                    //Adicionar uma resposta para o textView e aí vai aparecer na tela para o usuário.
                    msg = "É melhor abastecer com Ácool";
                    txtvMensagem.setText(msg);
                }else
                    {
                        msg = "É melhor abastecer com Gasolina";
                        txtvMensagem.setText(msg);
                    }

                //Mostrando a mensagem de uma outra forma
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}