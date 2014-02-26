package com.goodmorningcody.androidstudy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ProfileActivity extends Activity {
	
	class MyOnClickListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		}
	};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.profile_activity);
	    
	    //findViewById(R)
	    Button goToFacebook = (Button)findViewById(R.id.profile_go_to_facebook);
	    
		// 0
	    goToFacebook.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/okieyun"));
				startActivity(browserIntent);
			}
		});

	    
	    // 1
	    OnClickListener onClickListner = new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/okieyun"));
				startActivity(browserIntent);
			}
		};
		goToFacebook.setOnClickListener(onClickListner);
		
	    // 2
		MyOnClickListener myListener = new MyOnClickListener();
		goToFacebook.setOnClickListener(myListener);
		
	    finish();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(getApplicationContext(), "Destroy", Toast.LENGTH_LONG).show();
	}
}
