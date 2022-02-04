package mcm.edu.ph.gamao_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtVar1, txtVar2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEqual;
    TextView answer;

    double var1,var2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);

        txtVar1= findViewById(R.id.FirstVar);
        txtVar2= findViewById(R.id.SecondVar);

        answer = findViewById(R.id.answer);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnEqual.setOnClickListener(this);






    }
    @Override
    public void onClick(View v) {

        txtVar1 = findViewById(R.id.FirstVar);
        txtVar2 = findViewById(R.id.SecondVar);

        var1 = Double.parseDouble(txtVar1.getText().toString());
        var2 = Double.parseDouble(txtVar2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                answer.setText(Double.toString(var1+var2));

                break;
            case R.id.btnSubtract:
                answer.setText(Double.toString(var1-var2));

                break;
            case R.id.btnDivide:
                answer.setText(Double.toString(var1/var2));

                break;
            case R.id.answer:
                answer.setText(Double.toString(var1%var2));

                break;
            case R.id.btnMultiply:
                answer.setText(Double.toString(var1*var2));

                break;

        }

    }

}