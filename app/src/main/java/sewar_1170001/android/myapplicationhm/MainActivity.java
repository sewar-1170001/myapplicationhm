package sewar_1170001.android.myapplicationhm;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;
//this is test for github
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);
    }



    public void bmiOnClicked(View view) {
        if(weight.getText().toString().isEmpty() || height.getText().toString().isEmpty()){
            result.setText("Fill Height & Weight fields");
        }
        else{
            double heightInMeter = Integer.parseInt(String.valueOf(height.getText()))/100.0 ;
            double bmi = Integer.parseInt(String.valueOf(weight.getText())) / (heightInMeter * heightInMeter );
            String status = null;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi > 18.5 && bmi < 25) {
                status = "Normal";
            } else if (bmi > 25 && bmi < 30) {
                status = "Overweight";
            } else if (bmi == 30 || bmi > 30) {
                status = "Obese";
            }
            result.setText( String. format("%.2f", bmi) + "==>" + status);}

    }
}