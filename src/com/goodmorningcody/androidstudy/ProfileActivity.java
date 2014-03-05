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
	    
	    Button goToFacebook = (Button)findViewById(R.id.profile_go_to_facebook);	    
	    goToFacebook.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/okieyun"));
				startActivity(browserIntent);
			}
		});
	    
	    Button goToGallery = (Button)findViewById(R.id.profile_go_to_gallery);	    
	    goToGallery.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent galleryIntent = new Intent(getApplicationContext(), ImageGalleryActivity.class);
				startActivity(galleryIntent);
			}
		});
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(getApplicationContext(), "Destroy", Toast.LENGTH_LONG).show();
	}
}
