package com.exampl.gdgu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	
	public void lectureclick(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
		startActivity(intent);
		
		overridePendingTransition(R.animator.animation1,R.animator.animation2);
	}
	
	public void assignmentclick(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
		startActivity(intent);
		
		overridePendingTransition(R.animator.animation1,R.animator.animation2);
	}
	
	public void quizclick(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
		startActivity(intent);
		
		overridePendingTransition(R.animator.animation1,R.animator.animation2);
	}
	
	public void labclick(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
		startActivity(intent);
		
		overridePendingTransition(R.animator.animation1,R.animator.animation2);
	}
	
	public void annclick(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
		startActivity(intent);
		
		
		overridePendingTransition(R.animator.animation1,R.animator.animation2);
	}
	
	public void back(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity0.class);
		startActivity(intent);
	}
	
	public void home(View sender)
	{
		Intent intent=new Intent(getApplicationContext(),MainActivity.class);
		startActivity(intent);
	}


	
}
