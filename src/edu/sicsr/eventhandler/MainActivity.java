package edu.sicsr.eventhandler;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button1;
	private EditText name;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		button1 = (Button) findViewById(R.id.button1);
		name = (EditText) findViewById(R.id.name);
		OnClickListener listener = new OnClickListener() {
		
			
			
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
Toast.makeText(getApplicationContext(),"button clicked", Toast.LENGTH_LONG).show();
			}
		};
				button1.setOnClickListener(listener);
		  
	
	}

}