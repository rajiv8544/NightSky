package com.example.compu1.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

  private static ImageView img;
    private static TextView myloc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click();
        click1();




    }

    public void click()
    {img = (ImageView)findViewById(R.id.imageview);
      img.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this,Main2Activity.class);
              startActivity(intent);
          }
      });

    }

    public void click1()
    { myloc = (TextView)findViewById(R.id.mylocation);
      myloc.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent1 = new Intent(MainActivity.this,Main3Activity.class);
              startActivity(intent1);
          }
      });

    }
}
