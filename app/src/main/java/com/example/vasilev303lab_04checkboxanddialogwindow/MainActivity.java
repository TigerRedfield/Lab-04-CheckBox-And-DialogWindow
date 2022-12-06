package com.example.vasilev303lab_04checkboxanddialogwindow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        CheckBox[] chk = new CheckBox[4];
        EditText[] num = new EditText[4];
        String rep;

    public void my_on_button_click(View v)
    {
        num[0] = findViewById(R.id.txtnum1);
        num[1] = findViewById(R.id.txtnum2);
        num[2] = findViewById(R.id.txtnum3);
        num[3] = findViewById(R.id.txtnum4);

        chk[0] = findViewById(R.id.chkb1);
        chk[1] = findViewById(R.id.chkb2);
        chk[2] = findViewById(R.id.chkb3);
        chk[3] = findViewById(R.id.chkb4);

        TextView tc = findViewById(R.id.TextChek);

        float[] pr = new float[] {10.0f, 20.0f, 30.0f, 40.0f};
        float sum = 0.0f;

            for (int i = 0; i < 4; i++) {
                if (chk[i].isChecked()) {
                    int q = Integer.parseInt(num[i].getText().toString());
                    float val = q * pr[i];
                    if (q != 0 && q > 0) {
                        sum += q * val;
                        rep += (String.format(" %d: %d x %s = %d x %.2f = %.2f\n",
                                i, q, chk[i].getText().toString(), q, pr[i], val));
                    }
                    else
                    {
                        Toast.makeText(this, "Числа пустые, отрицательные или нулевые запрещены!", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            rep += String.format(" Сумма = %.2f\n\n", sum);
            tc.setText(rep);

}
}

