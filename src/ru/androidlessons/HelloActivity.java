package ru.androidlessons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.main);
		
		Button button = (Button)findViewById(R.id.hellobtn);
		
		button.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(HelloActivity.this, "Hello world!", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
}