package mcm.edu.ph.liston_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText var1txt, var2txt; //declared the editText boxes
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo; //declared the 4 buttons
    TextView answerTxt;

    double variable1, variable2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//this method is responsible for creating the display we can see in our app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //buttons
        btnAdd = findViewById(R.id.BtnAdd);
        btnSubtract = findViewById(R.id.BtnSubtract);
        btnMultiply = findViewById(R.id.BtnMultiply);
        btnDivide = findViewById(R.id.btndivide);
        btnModulo = findViewById(R.id.btnModulo);


        //answer display
        answerTxt = findViewById(R.id.TxtAnswer);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) { //this method is responsible for doing functions for on-click events


        //variable text boxes
        var1txt = findViewById(R.id.TextVariable1);
        var2txt = findViewById(R.id.TextVariable2);


        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2txt.getText()));




        switch (v.getId()) {
            case R.id.BtnAdd:
                answerTxt.setText(Double.toString(variable1+variable2));
                break;
            case R.id.BtnSubtract:
                answerTxt.setText(Double.toString(variable1-variable2));
                break;
            case R.id.BtnMultiply:
                answerTxt.setText(Double.toString(variable1*variable2));
                break;
            case R.id.btndivide:
                answerTxt.setText(Double.toString(variable1/variable2));
                break;
            case R.id.btnModulo:
                answerTxt.setText(Double.toString(variable1%variable2));
                break;
        }


    }
}