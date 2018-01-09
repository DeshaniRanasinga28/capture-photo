package com.example.ef.capturephoto;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        Bitmap bitmap = getIntent().getExtras().getParcelable("name");
        imageView = (ImageView)findViewById(R.id.ivPhotoView);
        imageView.setImageBitmap(bitmap);
    }
}
