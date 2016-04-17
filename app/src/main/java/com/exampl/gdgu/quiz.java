package com.exampl.gdgu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class quiz extends ActionBarActivity {
	
	WebView web;
	ProgressBar progressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);
		
		
		
		
		
		
			Intent i= new Intent(Intent.ACTION_VIEW,Uri.parse("https://sites.google.com/site/csedbms2002/system/app/pages/search?scope=search-site&q=quiz"));
		startActivity(i);
		
		this.web = (WebView)this.findViewById(R.id.webView1);
		this.web.loadUrl("https://sites.google.com/site/csedbms2002/system/app/pages/search?scope=search-site&q=quiz");
		
		
		
		}
	
	

	

	
}
