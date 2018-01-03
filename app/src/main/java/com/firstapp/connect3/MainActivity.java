package com.firstapp.connect3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int user = 0,zx=0;
    int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int wp[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int q[]=new int[3];
    public void drop(View v) {
        ImageView i = (ImageView) v;
        int y = Integer.parseInt(i.getTag().toString());

        if (user == 0) {
            if (a[y] == 0) {
                i.setTranslationY(-1000f);
                i.setImageResource(R.drawable.yellow);
                i.animate().translationYBy(1000f).setDuration(0);
                user = 1;
                a[y] = 1;
            } else {
                          }
        } else if (user == 1) {
            if (a[y] == 0) {
                i.setTranslationY(-1000f);
                i.setImageResource(R.drawable.red);
                i.animate().translationYBy(1000f).setDuration(0);
                user = 0;
                a[y] = 2;
            } else {

            }
        }
    for(int o=0;o<8;o++){
            for(int c=0;c<3;c++) {
                q[c] = wp[o][c];
            }
                  int m=0;
            int q1=q[m];
            int q2=q[m+1];
            int q3=q[m+2];
          if(a[q1]==1) {
              if (a[q1] == a[q2] && a[q2] == a[q3] && a[q1] == a[q3]){
                  LinearLayout ll=(LinearLayout)findViewById(R.id.l1);
                  ll.setAlpha(1f);
                  TextView tt=(TextView)findViewById(R.id.t2);
                  zx=1;
                  tt.setText("HORRAY!!!");
                  TextView ty=(TextView)findViewById(R.id.t3);
                  ty.setText("Yellow WON");
                  GridLayout gg=(GridLayout)findViewById(R.id.gridLayout);
                  gg.setAlpha(0f);
          }
          }
            else if(a[q1]==2)
          {if (a[q1] == a[q2] && a[q2] == a[q3] && a[q1] == a[q3]){
              LinearLayout ll=(LinearLayout)findViewById(R.id.l1);
              ll.setAlpha(1f);
              zx=1;
              TextView tt=(TextView)findViewById(R.id.t2);
              tt.setText("HORRAY!!");
              TextView tr=(TextView)findViewById(R.id.t3);
              tr.setText("Red WON");
              GridLayout gg=(GridLayout)findViewById(R.id.gridLayout);
              gg.setAlpha(0f);
          }
          }
    }
    if(zx!=1){
    int la=0;
    for(int n=0;n<9;n++){

        if(a[n]!=0)
            la++;}
    if(la==9)
    {     LinearLayout ll=(LinearLayout)findViewById(R.id.l1);
        ll.setAlpha(1f);
        TextView tt=(TextView)findViewById(R.id.t2);
        tt.setText("WELL PLAYED!!");
        TextView tr=(TextView)findViewById(R.id.t3);
        tr.setText("Try Again");
        GridLayout gg=(GridLayout)findViewById(R.id.gridLayout);
        gg.setAlpha(0f);

    }}
         }
public void ppp(View v) {
    LinearLayout ll=(LinearLayout)findViewById(R.id.l1);
    ll.setAlpha(0f);
     user = 0;
    for(int f=0;f<9;f++){
        a[f]=0;
    }

    GridLayout gg=(GridLayout)findViewById(R.id.gridLayout);
    for(int k=0;k<gg.getChildCount();k++)
    {
        ((ImageView)gg.getChildAt(k)).setImageResource(0);
    }
    gg.setAlpha(1f);

}
}


