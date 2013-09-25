package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logout);
		
		Button mSignoutBtn = (Button) findViewById(R.id.sign_out_button);
		
		mSignoutBtn.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						System.exit(0);
					}
				});
	}
	
}