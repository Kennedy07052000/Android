package br.estacio.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    private EditText txtCusto;
    private Button btnVerificar;
    private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCusto = (EditText)findViewById(R.id.txtCusto);
        btnVerificar = (Button)findViewById(R.id.btnVerificar);
        txtMensagem = (TextView)findViewById(R.id.txtMensagem);
        String mensagem = null;

        btnVerificar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double custoFabrica = Double.parseDouble(txtCusto.getText().toString());
                String mensagem = null;
                double custoConsumidor;
                double valorTotal;

                valorTotal = custoFabrica + (custoFabrica*0.45) + (custoFabrica*0.28);
                mensagem = "Custo do veículo ao consumidor será de: "+valorTotal;
                txtMensagem.setText(mensagem);
            }
        });
    }
}