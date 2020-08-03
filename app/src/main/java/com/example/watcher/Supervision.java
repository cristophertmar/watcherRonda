package com.example.watcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;


import java.io.IOException;

public class Supervision extends AppCompatActivity  {

    Spinner spinner;
    ImageView mImagenview;
    Button mChooseBtn, btn_guardar;
    Uri imageUri;

    private static final int PICK_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_supervision );

        spinner = findViewById( R.id.sp_resultado );
        mImagenview = findViewById( R.id.iv_imagen );
        mChooseBtn = findViewById( R.id.btn_changeImg );
        btn_guardar = findViewById( R.id.btn_guardar );

        btn_guardar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "Guardando cambios...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        } );

        mChooseBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent galeria = new Intent();
                galeria.setType( "image/*" );
                galeria.setAction( Intent.ACTION_GET_CONTENT );

                startActivityForResult( Intent.createChooser( galeria, "Seleccionar Imagen" ), PICK_IMAGE );

            }



            /*
            private void pickImageFromGallery() {

                Intent intent = new Intent( Intent.ACTION_PICK );
                intent.setType( "image/*" );
                startActivityForResult( intent, IMAGE_PICK_CODE  );

            }



            @Override
            public void onRequestPermissionResult (int requestcode, @NonNull String[] permission, @NonNull int[] grantResults) {
                switch ( requestcode) {
                    case PERMISSION_CODE: {
                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED ) {
                            pickImageFromGallery();
                        }

                    }
                }
            }*/




        } );


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.Resultado, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter( adapter );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );

        if( requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null  ) {
            imageUri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                mImagenview.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}