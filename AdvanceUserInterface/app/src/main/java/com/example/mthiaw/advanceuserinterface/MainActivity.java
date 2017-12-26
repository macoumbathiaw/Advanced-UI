package com.example.mthiaw.advanceuserinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //find the Editext
        final EditText editText = (EditText) findViewById(R.id.editText);

        /**
         * Find the TextView view
         */

        final TextView textView = (TextView) findViewById(R.id.textView);

        //Find the Button
        Button button = (Button) findViewById(R.id.button);

        //Create a onClicklistener to listen to an event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Set the text from the EditText inside the TextView using the Button
                 */

                textView.setText(editText.getText());

            }
        });

    }
}
