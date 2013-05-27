package com.mycompany.gcm;

import android.app.*;
import android.os.*;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity implements OnClickListener
{
    Button b;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b = (Button) findViewById(R.id.button);


        b.setOnClickListener(this);
        b.setText("Is that you John Wayne?");
    }

    @Override
    public void onClick(View target)
    {
        if(b.getText().equals("Is that you John Wayne?"))
            b.setText("Is this me?");
        else
            b.setText("Is that you John Wayne?");

    }
}