package br.ufjf.dcc196.luisguilhermecipriani.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    }
}