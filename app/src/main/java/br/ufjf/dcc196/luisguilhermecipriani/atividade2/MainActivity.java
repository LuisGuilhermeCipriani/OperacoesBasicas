package br.ufjf.dcc196.luisguilhermecipriani.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button somar;
    private Button subtrair;
    private Button multiplicar;
    private Button dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); //Esconde a barra superior da tela

        numero1 = findViewById(R.id.editTextNumero1);
        numero2 = findViewById(R.id.editTextNumero2);
        resultado = findViewById(R.id.textViewResultado);
        somar = findViewById(R.id.buttonSomar);
        subtrair = findViewById(R.id.buttonSubtrair);
        multiplicar = findViewById(R.id.buttonMultiplicar);
        dividir = findViewById(R.id.buttonDividir);

        Context context = getApplicationContext();
        CharSequence mensagem = "Por favor, informe todos os dados corretamente!";
        int duracao = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context, mensagem, duracao);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float valor1 = Float.parseFloat(numero1.getText().toString());
                    float valor2 = Float.parseFloat(numero2.getText().toString());
                    resultado.setText(String.valueOf(valor1 + valor2));
                }catch (Exception e){
                    toast.show();
                }
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float valor1 = Float.parseFloat(numero1.getText().toString());
                    float valor2 = Float.parseFloat(numero2.getText().toString());
                    resultado.setText(String.valueOf(valor1 - valor2));
                }catch (Exception e){
                    toast.show();
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float valor1 = Float.parseFloat(numero1.getText().toString());
                    float valor2 = Float.parseFloat(numero2.getText().toString());
                    resultado.setText(String.valueOf(valor1 * valor2));
                }catch (Exception e){
                    toast.show();
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float valor1 = Float.parseFloat(numero1.getText().toString());
                    float valor2 = Float.parseFloat(numero2.getText().toString());
                    resultado.setText(String.valueOf(valor1 / valor2));
                }catch (Exception e){
                    toast.show();
                }
            }
        });
    }
}