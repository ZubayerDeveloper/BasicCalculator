package com.zubayer.calculator;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Math extends Activity
{
	@Override
	public void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.math);
	
	TextView text=(TextView)findViewById(R.id.about);
	Typeface font= Typeface.createFromAsset(getAssets(),"times.ttf");
		text.setTypeface(font);
		}
	public void back(View v){
	   onBackPressed();
	}
}
