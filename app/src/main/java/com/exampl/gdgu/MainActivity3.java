package com.exampl.gdgu;



import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity3 extends ActionBarActivity {
	
	WebView web;
	
	 private WebView mwebview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main3);
		mwebview = (WebView) findViewById(R.id.webView1);
		WebSettings webSettings = mwebview.getSettings();
		webSettings.setJavaScriptEnabled(true);
		mwebview.loadUrl("https://sites.google.com/site/csedbms2002/file-cabinet");
		mwebview.setWebViewClient(new WebViewClient());
		
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

	

	
}
