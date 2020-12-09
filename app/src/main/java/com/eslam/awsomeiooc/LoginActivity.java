package com.eslam.awsomeiooc;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;

public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.login)
    ViewGroup login;
    @BindView(R.id.emailBlur)
    BlurView blur_email;
    @BindView(R.id.passBlur)
    BlurView blur_pass;
    @BindView(R.id.facebookBlur)
    BlurView blur_facebook;
    @BindView(R.id.googleBlur)
    BlurView blur_google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        final float radius = 25f;
        final Drawable windowBackground = getWindow().getDecorView().getBackground();

        blur_email.setupWith(login)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);

        blur_pass.setupWith(login)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(this))

                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
        blur_facebook.setupWith(login)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(this))

                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
        blur_google.setupWith(login)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new RenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);


    }

    public void back_btn(View view) {
        Intent intent =new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void facebookPage(View view) {
        Intent intent = new Intent(LoginActivity.this,FacebookPage.class);
        startActivity(intent);
    }
}
