package com.assignment1;

import com.assignment1.controller.UserController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	UserController userController;
	
    /** Called when the activity is first created. */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        
        userController = new UserController();
        
        final EditText usernameEditText = (EditText) findViewById(R.id.loginActivityUsernameEditText);
        final EditText passwordEditText = (EditText) findViewById(R.id.loginActivityPasswordEditText);
        final Button loginButton = (Button) findViewById(R.id.loginActivityLoginButton);
        final Button registButton = (Button) findViewById(R.id.loginActivityRegistButton);
        loginButton.setOnClickListener(new OnClickListener() {
         	@Override
 			public void onClick(View v) {
         		login(usernameEditText.getText().toString(), passwordEditText.getText().toString());
 			}
 		});
        registButton.setOnClickListener(new OnClickListener() {
         	@Override
 			public void onClick(View v) {
         		lauchRegistPacientActivity();
 			}
 		});
    }
    
    public void login(String username, String password)
    {
    	if (userController.login(username, password))
    	{
    		lauchMainActivity();
    	}    	
    }
    
    public void lauchMainActivity()
    {
    	Intent myAction = new Intent(getApplicationContext(),DoctorMainMenuActivity.class);  	
		this.startActivity(myAction);	
		
    }
    

    public void lauchRegistPacientActivity()
    {
    	Intent myAction = new Intent(getApplicationContext(),RegistPacientActivity.class);  	
		this.startActivity(myAction);	
		
    }
}