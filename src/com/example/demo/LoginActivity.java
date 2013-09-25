package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity implements View.OnClickListener{ 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		          
//		EditText mUserName = (EditText) findViewById(R.id.username);
//		EditText mPwd = (EditText) findViewById(R.id.password);
		
		Button msignInBtn = (Button)findViewById(R.id.sign_in_button);         
		msignInBtn.setOnClickListener(this);   
		
		}     
	
	public void onClick(View v) {        
		switch (v.getId()) {          
		case R.id.sign_in_button:
				Intent intent = new Intent(this, LogoutActivity.class);             
				startActivity(intent);
			break;        
		default:             
			break;         
		} 
	}
}
