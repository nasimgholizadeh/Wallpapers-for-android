package com.nasim.portraitwallpapers;

import android.app.WallpaperManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Context context = this;
    private int image = 0;
    private ImageView mainImage;
    private Button btnNext, btnPrev, btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        //bind views
        mainImage=findViewById(R.id.imageView);
        btnNext=findViewById(R.id.btn_next);
        btnPrev=findViewById(R.id.btn_prev);
        btnSet=findViewById(R.id.btn_set);
        //set a default image in imageView
        mainImage.setImageResource(R.drawable.a);
        //call functions when each button clicked
        btnNext.setOnClickListener(v -> next());
        btnPrev.setOnClickListener(v -> prev());
        btnSet.setOnClickListener(v -> setWallpaper());
    }

    //function for next button
    public void next() {
        image = (image + 1) % 10;
        char ch = (char)(image + '0');
        switch (ch) {
            case '0':
                mainImage.setImageResource(R.drawable.a);
                break;
            case '1':
                mainImage.setImageResource(R.drawable.b);
                break;
            case '2':
                mainImage.setImageResource(R.drawable.c);
                break;
            case '3':
                mainImage.setImageResource(R.drawable.d);
                break;
            case '4':
                mainImage.setImageResource(R.drawable.e);
                break;
            case '5':
                mainImage.setImageResource(R.drawable.f);
                break;
            case '6':
                mainImage.setImageResource(R.drawable.g);
                break;
            case '7':
                mainImage.setImageResource(R.drawable.h);
                break;
            case '8':
                mainImage.setImageResource(R.drawable.i);
                break;
            case '9':
                mainImage.setImageResource(R.drawable.j);
                break;
            default:
        }
    }

    //function for prev button
    public void prev() {
        image = (10 + image - 1) % 10;
        char ch = (char)(image + '0');
        switch (ch) {
            case '0':
                mainImage.setImageResource(R.drawable.a);
                break;
            case '1':
                mainImage.setImageResource(R.drawable.b);
                break;
            case '2':
                mainImage.setImageResource(R.drawable.c);
                break;
            case '3':
                mainImage.setImageResource(R.drawable.d);
                break;
            case '4':
                mainImage.setImageResource(R.drawable.e);
                break;
            case '5':
                mainImage.setImageResource(R.drawable.f);
                break;
            case '6':
                mainImage.setImageResource(R.drawable.g);
                break;
            case '7':
                mainImage.setImageResource(R.drawable.h);
                break;
            case '8':
                mainImage.setImageResource(R.drawable.i);
                break;
            case '9':
                mainImage.setImageResource(R.drawable.j);
                break;
            default:
        }
    }

    //function for set button
    public void setWallpaper() {
        WallpaperManager myWallpaper = WallpaperManager.getInstance(context);
        char ch = (char)(image + '0');
        switch (ch) {
            case '0':
                try {
                    myWallpaper.setResource(R.raw.a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '1':
                try {
                    myWallpaper.setResource(R.raw.b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '2':
                try {
                    myWallpaper.setResource(R.raw.c);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '3':
                try {
                    myWallpaper.setResource(R.raw.d);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '4':
                try {
                    myWallpaper.setResource(R.raw.e);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '5':
                try {
                    myWallpaper.setResource(R.raw.f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '6':
                try {
                    myWallpaper.setResource(R.raw.g);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '7':
                try {
                    myWallpaper.setResource(R.raw.h);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '8':
                try {
                    myWallpaper.setResource(R.raw.i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case '9':
                try {
                    myWallpaper.setResource(R.raw.j);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
        }
        Toast.makeText(context,"Done!",Toast.LENGTH_LONG).show();
    }
}