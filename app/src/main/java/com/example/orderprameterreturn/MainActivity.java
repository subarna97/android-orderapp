package com.example.orderprameterreturn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        total = total + 1;
        display(total);
    }

    public void decrement(View view){
        total = total + 1;
        display(total);
    }

    private void display(int total) {
        TextView t = (TextView)findViewById(R.id.quantity_text_view);
        t.setText("" + total);
    }

    public void submitOrder(View view){
        display(total);
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkbox);
        Boolean check = checkBox.isChecked();

        EditText editText =(EditText)findViewById(R.id.name_fild);
        String name = editText.getText().toString();

        String displayamount = "Your Total Amount " + (total * 5 ) + "\n " + check + "\n" + "Name : " + name  ;
        TotalAmount(displayamount);

    }

    private int displayamount(boolean check){
        int baseprice = 5;
        if(check){
            baseprice = baseprice +1;
        }

        return total * baseprice;
    }



    private void TotalAmount(String displayamount) {
        TextView t = (TextView)findViewById(R.id.price_text_view);
        t.setText("" + displayamount);
    }




}