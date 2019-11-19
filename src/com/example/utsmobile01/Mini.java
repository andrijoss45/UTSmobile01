package com.example.utsmobile01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Mini extends Activity{
	
	CheckBox c1,c2,c3,c4;
	Button bt1,bt2;
	TextView tv2, tv4;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_mini);
	        
	        c1 = (CheckBox) findViewById(R.id.cb1);
	        c2 = (CheckBox) findViewById(R.id.cb2);
	        c3 = (CheckBox) findViewById(R.id.cb3);
	        c4 = (CheckBox) findViewById(R.id.cb4);
	        bt1 = (Button) findViewById(R.id.bt1);
	        bt2 = (Button) findViewById(R.id.bt2);
	        tv2 = (TextView) findViewById(R.id.tv2);
	        tv4 = (TextView) findViewById(R.id.tv4);
	        
	        
	        bt1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					if(!c1.isChecked() && !c2.isChecked())
					{
						Toast.makeText(getApplicationContext(), "pilih salah satu jawaban  ", Toast.LENGTH_LONG).show();
					}else{
						String a = "";
						if (c1.isChecked()){
							a += "Ya selamat anda benar";
							
						}
						String b = "";
						if(c2.isChecked()){
							b += "Anda Buta memilih tidak";
						}
						
						tv2.setText("anda memilih:\n" + a + "" + b + "");
					}
				}
			});
	        
bt2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					if(!c3.isChecked() && !c4.isChecked())
					{
						Toast.makeText(getApplicationContext(), "pilih salah satu jawaban  ", Toast.LENGTH_LONG).show();
					}else{
						String c = "";
						if (c3.isChecked()){
							c += "Ya selamat anda benar";
							
						}
						String d = "";
						if(c4.isChecked()){
							d += "Anda Buta memilih tidak";
						}
						
						tv4.setText("anda memilih:\n" + c + "" + d + "");
				}
			}
	        
	    });


}
}