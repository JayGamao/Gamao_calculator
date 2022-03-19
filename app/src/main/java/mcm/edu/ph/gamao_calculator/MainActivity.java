package mcm.edu.ph.gamao_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtVar1, txtVar2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo;
    TextView answer;
    String showAnswer = "";


    double var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        txtVar1 = findViewById(R.id.FirstVar);
        txtVar2 = findViewById(R.id.SecondVar);

        answer = findViewById(R.id.answer);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnModulo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        // FUNCTIONALITY
        switch (v.getId()) {
            case R.id.btnAdd:
                answer.setText(showAnswerAdd(var1, var2, showAnswer));
                break;
            case R.id.btnSubtract:
                answer.setText(showAnswerSubtract(var1, var2, showAnswer));

                break;
            case R.id.btnDivide:
                answer.setText(showAnswerDivide(var1, var2, showAnswer));

                break;
            case R.id.btnModulo:
                answer.setText(showAnswerModulo(var1, var2, showAnswer));

                break;
            case R.id.btnMultiply:
                answer.setText(showAnswerMultiply(var1, var2, showAnswer));

                break;


        }

    }

    // METHODS
    public String showAnswerAdd(double var1, double var2, String showAnswer) {
        showAnswer = Double.toString(var1 + var2);
        return String.valueOf(var1 + var2);
    }

    public String showAnswerSubtract(double var1, double var2, String showAnswer) {
        showAnswer = Double.toString(var1 - var2);
        return String.valueOf(var1 - var2);
    }

    public String showAnswerDivide(double var1, double var2, String showAnswer) {
        showAnswer = Double.toString(var1 / var2);
        return String.valueOf(var1 / var2);
    }
    public String showAnswerModulo(double var1, double var2, String showAnswer) {
        showAnswer = Double.toString(var1 % var2);
        return String.valueOf(var1 % var2);
    }
    public String showAnswerMultiply(double var1, double var2, String showAnswer) {
        showAnswer = Double.toString(var1 * var2);
        return String.valueOf(var1 * var2);
    }
}





