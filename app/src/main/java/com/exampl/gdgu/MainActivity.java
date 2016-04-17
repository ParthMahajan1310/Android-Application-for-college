package com.exampl.gdgu;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Spinner sp,sp1;
	String[] str,str1;
	String temp,temp1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sp=(Spinner)findViewById(R.id.Spinner1);
		str=getResources().getStringArray(R.array.strArr);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str);
		sp.setAdapter(adapter);
		sp.setBackgroundColor(Color.LTGRAY);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				int index= arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), str[index]+" selected", Toast.LENGTH_SHORT).show();
				temp=str[index];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		sp1=(Spinner)findViewById(R.id.spinner2);
		str1=getResources().getStringArray(R.array.strArr1);
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str1);
		sp1.setAdapter(adapter1);
		sp1.setBackgroundColor(Color.LTGRAY);
		
		sp1.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				int index1= arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(), str1[index1]+" selected", Toast.LENGTH_SHORT).show();
				temp1=str1[index1];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		Button btn1=(Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				if(temp.equals("select")||temp1.equals("select") )
				{
				Toast.makeText(getBaseContext(),"Plese select any option", Toast.LENGTH_LONG).show();
				}
				else
				{
				Intent intent=new Intent(getApplicationContext(),MainActivity0.class);
				intent.putExtra("t",temp);
				intent.putExtra("t1",temp1);
				startActivity(intent);
				overridePendingTransition(R.animator.animation1,R.animator.animation2);
				}
				
			}
		 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		TextView textview =(TextView)findViewById(R.id.textView1);
		textview.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD);
		textview.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
	
		return true;
	}
	
	
		
	}

	

