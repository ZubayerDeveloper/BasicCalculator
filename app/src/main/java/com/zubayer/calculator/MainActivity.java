package com.zubayer.calculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class MainActivity extends Activity
{
	private AdView mAdView;
	Button a1,a2,a3,a4,a5,a6,a7,a8,a9,aPlus10,aMinus11,ax12,
	aDivide13,aO14,aEquls15,aExit16,aAbout17,aC18,aDot19,a20,aDel21,
	zoomIn,zoomOut;
	TextView screen,screen2,operator,result;
	EditText edit;
	float m=45;
    float n=35;
	float o=45;
	float p=45;
	double a,b,c;
	int d,e,f;
	Animation animation;
	
    @Override
    protected void onCreate(Bundle bb)
    {
        super.onCreate(bb);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
		//MobileAds.initialize(this, "ca-app-pub-6830488664932459~2199596398");
		Typeface font= Typeface.createFromAsset(getAssets(),"times.ttf");
		mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		
	
		a1=(Button)findViewById(R.id.button1);
		aEquls15=(Button)findViewById(R.id.buttonEquals);
		a2=(Button)findViewById(R.id.button2);
		a3=(Button)findViewById(R.id.button3);
		a4=(Button)findViewById(R.id.button4);
		a5=(Button)findViewById(R.id.button5);
		a6=(Button)findViewById(R.id.button6);
		a7=(Button)findViewById(R.id.button7);
		a8=(Button)findViewById(R.id.button8);
		a9=(Button)findViewById(R.id.button9);
	    aPlus10=(Button)findViewById(R.id.buttonPlus);
		aMinus11=(Button)findViewById(R.id.buttonMinus);
		ax12=(Button)findViewById(R.id.buttonx);
		aDivide13=(Button)findViewById(R.id.buttonDivide);
		aO14=(Button)findViewById(R.id.button0);
		aExit16=(Button)findViewById(R.id.buttonExit);
		aAbout17=(Button)findViewById(R.id.buttonAbout);
		aC18=(Button)findViewById(R.id.buttonC);
		aDot19=(Button)findViewById(R.id.buttonDot);
		a20=(Button)findViewById(R.id.button);
		aDel21=(Button)findViewById(R.id.buttonDel);
		zoomIn=(Button)findViewById(R.id.zoomin);
		zoomOut=(Button)findViewById(R.id.zoomout);
		
		a1.setTypeface(font);a2.setTypeface(font);a3.setTypeface(font);a4.setTypeface(font);
		a5.setTypeface(font);a6.setTypeface(font);a7.setTypeface(font);a8.setTypeface(font);
		a9.setTypeface(font);aPlus10.setTypeface(font);aMinus11.setTypeface(font);
		aDivide13.setTypeface(font);ax12.setTypeface(font);aEquls15.setTypeface(font);
		aExit16.setTypeface(font);aC18.setTypeface(font);aDot19.setTypeface(font);
		aDel21.setTypeface(font);aO14.setTypeface(font);
		aAbout17.setTypeface(font);zoomIn.setTypeface(font);
		zoomOut.setTypeface(font);
		
		
		
		screen=(TextView)findViewById(R.id.text);
		screen2=(TextView)findViewById(R.id.text3);
		operator=(TextView)findViewById(R.id.text2);
		result=(TextView)findViewById(R.id.text4);
		
		screen.setTypeface(font);
		screen2.setTypeface(font);
		operator.setTypeface(font);
		result.setTypeface(font);
		
		
		screen.setTextSize(m);
		operator.setTextSize(n);
		screen2.setTextSize(o);
		result.setTextSize(p);
	
	
	aAbout17.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					Intent i= new Intent(MainActivity.this,Math.class);
					startActivity(i);
				
				}
			});
	
	aC18.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					screen.setText("");
					operator.setText("");
					screen2.setText("");
					result.setText("");								
				}
			});
	//Delete Button
	
	aDel21.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
			
	String text=(screen.getText().toString());
	String text2=(screen2.getText().toString());
	String text3=(operator.getText().toString());
    	//geting string from textView			
				int a,a2,i,i2;
				char bc,bc2;				
				ArrayList<String> d=new ArrayList<>();
				ArrayList<String> d2=new ArrayList<>();
				String e=new String();
				String e2=new String();
			    a=text.length();
			    a2=text2.length();
      //constructing ArrayList from text string 
		
	  for(i=0;i<a;i++){
				bc=text.charAt(i);			
				e= Character.toString(bc);
				d.add(e);
				}		
	
	  for(i2=0;i2<a2;i2++){
		       bc2=text2.charAt(i2);			
		       e2= Character.toString(bc2);
		       d2.add(e2);
	}
	

	//deleting from ArrayList of screen 
		      if(a==0||a2==0){		 
		      }else{
			  d2.remove(a2-1);		 
	          }
			  if(a2==0){
			   operator.setText("");
			  }
			  if(a==0){	  
			  }else if(text3.length()==0){
				d.remove(a-1);
			  }
	        
	//reconstruction of remaining string from ArrayList
	//after deleting char
				int size= d.size();		
				String r=new String();
				for(i=0;i<size;i++){
				r+=d.get(i);		
				}
				//screen2
				int size2= d2.size();		
				String r2=new String();
				for(i2=0;i2<size2;i2++){
					r2+=d2.get(i2);		
					}		
				screen2.setText(r2);	
				screen.setText(r);	
				if(result.getText().toString().length()!=0){
					screen.setText("");
					screen2.setText("");
					operator.setText("");
					result.setText("");
				}
		}
	});
	
	
	aPlus10.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
				onClickOperator("+");
				}
			});	
	aMinus11.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickOperator("-");
				}
			});

	aDivide13.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickOperator("÷");
					}
			});
	ax12.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickOperator("×");
				}
			});

	aEquls15.setOnClickListener(new OnClickListener(){
				public void onClick(View v){

	equalButton();
  }
});
	aDot19.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					String s=screen.getText().toString();
					String s2=operator.getText().toString();
					String s3=screen2.getText().toString();
					String s4=result.getText().toString();
					String update3=(s3+".");
					String update=("0.");
					String update2=(s+".");
					screen.setText(update);
					
					if(s.contains(".")){
						screen.setText(s);
					}
					else if(s.equals("")){		
					}else {	
					screen.setText(update2);						
						}				
					if(s3.length()>13){
						screen2.setText(s3);
						toast();
						}
					
					if(s4!=""){
						
						
						screen.setText("0.");result.setText("");
						screen2.setText("");operator.setText(""); 
					
						}else if(s2.contains("+")||s2.contains("-")||s2.contains("×")||s2.contains("÷")){						       
						screen2.setText(update3);
						screen.setText(s);
						}else{
							if(s.length()>13){
								screen.setText(s);
								toast();
								}else{
							}	
						}	
						
					if(s2.length()==0){
						
					}else if(s3.contains(".")){	
					 if(s4!=""){
						 screen2.setText("");
					 }else{screen2.setText(s3);
					}
					}
					else if(s3.equals("")){			
						screen2.setText(update);
					}else{								
					}
				}	
				
													
			});
	aO14.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("0");      
			 }				
			});
    a1.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("1");
				}
			});

	a2.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("2");
				}
			});
	a3.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("3");
				}
			});
	a4.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("4");
				}
			});
	a5.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("5");
				}
			});
	a6.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("6");
				}
			});
	a7.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("7");
				}
			});
	a8.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					onClickButton("8");
				}
			});
	a9.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					
					onClickButton("9");
				}
			});
	aExit16.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					finish();
				}
			});			
	}
		public void onClickButton(String string){
			String s=screen.getText().toString();
			String update=(s+string);
			String s2=operator.getText().toString();
			String s3=screen2.getText().toString();
			String s4=result.getText().toString();
			String update3=(s3+string);
			
			if(s4!=""){
				screen.setText(string);
				result.setText("");
				screen2.setText("");
				operator.setText("");
			}else if(s2.contains("+")||
			         s2.contains("-")||
					 s2.contains("×")||
					 s2.contains("÷")){	
				 if(s3.length()>14){
					 screen2.setText(s3);
						toast();	
				 }else{	
				 
				screen2.setText(update3);	
				}
			}else{
				if(s.length()>14){
					screen.setText(s);
					toast();
					}else{
					if(s=="0"){
						screen.setText(string);
					}else{
						screen.setText(update);
					}
				}	
			}		
			if(s3=="0"){
				screen2.setText(string);
			}
		}
		
    public void onClickOperator(String string){
		String s4=result.getText().toString();
		String update=(string);
		if(screen.getText().toString().length()==0){

		}else if(screen2.getText().toString().length()!=0){
		}else{

			operator.setText(update);
		}
		if(s4!=""){	
			if(s4.equals("error")){
			}else {

				String eq=	result.getText().toString();
				screen.setText(eq);
				screen2.setText("");
				result.setText("");
				operator.setText(string);
			}
		}
		if((screen.getText().toString()!="")&&(screen2.getText().toString()!="")&&(operator.getText().toString()!="")){
			equalButton();
			screen.setText(result.getText().toString());
			screen2.setText("");
			result.setText("");
			operator.setText(update);
		}
	}
public void zoomIn(View v){
	screen.setTextSize(++m);
	screen2.setTextSize(++o);
	operator.setTextSize(++n);
	result.setTextSize(++p);
	
	screen.setTextSize(++m);
	screen2.setTextSize(++o);
	operator.setTextSize(++n);
	result.setTextSize(++p);
	
	screen.setTextSize(++m);
	screen2.setTextSize(++o);
	operator.setTextSize(++n);
	result.setTextSize(++p);
	
}
public void zoomOut(View v){
		screen.setTextSize(--m);
		screen2.setTextSize(--o);
		operator.setTextSize(--n);
		result.setTextSize(--p);
		
	screen.setTextSize(--m);
	screen2.setTextSize(--o);
	operator.setTextSize(--n);
	result.setTextSize(--p);
	
	screen.setTextSize(--m);
	screen2.setTextSize(--o);
	operator.setTextSize(--n);
	result.setTextSize(--p);
	}
public void toast(){
	Toast t= Toast.makeText(getApplicationContext(),"Maximum input reached", Toast.LENGTH_SHORT);
	t.setGravity(Gravity.TOP,0,350);
	t.show();
		
	}
	public void equalButton(){
		try{

			String s1=screen.getText().toString();
			String s2=screen2.getText().toString();
			String op=operator.getText().toString();
			String r=result.getText().toString();
			String update;
			if(op.contains("+")){
				if(s1.contains(".")||s2.contains(".")){
					a= Double.parseDouble(s1);
					b= Double.parseDouble(s2);
					c=(a+b);
					update= Double.toString(c);
					result.setText(update);
				}else{
					d= Integer.parseInt(s1);
					e= Integer.parseInt(s2);
					f=(d+e);
					update= Integer.toString(f);
					result.setText(update);
				}
			}
			if(op.contains("-")){
				if(s1.contains(".")||s2.contains(".")){
					a= Double.parseDouble(s1);
					b= Double.parseDouble(s2);
					c=(a-b);
					update= Double.toString(c);
					result.setText(update);
				}else{
					d= Integer.parseInt(s1);
					e= Integer.parseInt(s2);
					f=(d-e);
					update= Integer.toString(f);
					result.setText(update);
				}
			}

			if(op.contains("÷")){
				a= Double.parseDouble(s1);
				b= Double.parseDouble(s2);
				c=(a/b);
				update= Double.toString(c);
				result.setText(update);
			}
			if(op.contains("×")){
				if(s1.contains(".")||s2.contains(".")){
					a= Double.parseDouble(s1);
					b= Double.parseDouble(s2);
					c=(a*b);
					update= Double.toString(c);
					result.setText(update);
				}else{
					d= Integer.parseInt(s1);
					e= Integer.parseInt(s2);
					f=(d*e);
					update= Integer.toString(f);
					result.setText(update);
				}
			}
			if((op.contains("+")||op.contains("-")||op.contains("×")||op.contains("÷"))&&s2==""){
				operator.setText("");
				result.setText(s1);
			}
			if(screen.getText().toString().length()!=0&&screen2.getText().toString().length()==0&&operator.getText().toString().length()==0&&result.getText().toString().length()==0){
				result.setText(screen.getText().toString());
			}

		}catch(Exception e) {
			try {
				operator.setText("");
				screen.setText(screen.getText().toString() + "");
				result.setText(screen.getText().toString());
			} catch (Exception ex) {

				if (screen.getText().toString().length() == 0 && screen2.getText().toString().length() == 0 && operator.getText().toString().length() == 0 && result.getText().toString().length() == 0) {

				}

			}
		}
	}
}
