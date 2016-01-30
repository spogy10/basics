package com.example.javaughn.basics;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow((null == getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                double var1 = acceptvar1();
                double var2= acceptvar2();

                double answer = answer(var1, var2);

                TextView ans = (TextView) findViewById(R.id.textView);
                ans.setText(Double.toString(answer));
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public double acceptvar1(){
        EditText editText = (EditText) findViewById(R.id.editText);
        double var1= Double.parseDouble(editText.getText().toString());


        return var1;
    }
    public double acceptvar2() {
        EditText editText = (EditText) findViewById(R.id.editText2);
        double var2 = Double.parseDouble(editText.getText().toString());
        return var2;
    }
    static double answer(double x,double y) {
        double answer;
        answer = x+y;
        return answer;
    }




}
