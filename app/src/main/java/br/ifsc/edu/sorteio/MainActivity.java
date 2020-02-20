package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextInical, editTextFinal;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInical = findViewById(R.id.editTextInicial);
        editTextFinal = findViewById(R.id.editTextFinal);
        textViewResultado = findViewById(R.id.textViewResultado);


    }

    public void sortear(View view) {

        int inicial = Integer.parseInt(editTextInical.getText().toString());

        textViewResultado.setText(Integer.toString(inicial));

    }
}
