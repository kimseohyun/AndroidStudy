package com.goodmorningcody.androidstudy;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageGalleryActivity extends Activity {
	LinearLayout galleryLayout;
	
	public void onCreate(Bundle savedInstance ) {
		super.onCreate(savedInstance);
		setContentView(R.layout.image_gallery_activity);
		
		galleryLayout = (LinearLayout)findViewById(R.id.gallery_layout);
		
		// 안녕하세요.
		for( int i=1; i<=4; ++i ) {
			 String fileName = "img_0"+i+".jpg";
			 try {
				InputStream imgStream = getAssets().open(fileName);
				Bitmap bitmap = BitmapFactory.decodeStream(imgStream);
				
				LinearLayout layout = new LinearLayout(getApplicationContext());
				layout.setLayoutParams(new LayoutParams(250, 250));
			    layout.setGravity(Gravity.CENTER);
			     
			    ImageView imageView = new ImageView(getApplicationContext());
			    imageView.setLayoutParams(new LayoutParams(220, 220));
			    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			    imageView.setImageBitmap(bitmap);
			     
			    layout.addView(imageView);
			    galleryLayout.addView(layout);
			    
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
