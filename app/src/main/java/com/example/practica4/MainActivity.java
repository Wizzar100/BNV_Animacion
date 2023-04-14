package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int selectedTab = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout likeLayout = findViewById(R.id.likeLayout);
        final LinearLayout notificationLayout = findViewById(R.id.notificationLayout);
        final LinearLayout profileLayout = findViewById(R.id.profileLayout);

        final ImageView homeImage=findViewById(R.id.homeImage);
        final ImageView likeImage=findViewById(R.id.likeImage);
        final ImageView notificationImage=findViewById(R.id.notificationImage);
        final ImageView profileImage=findViewById(R.id.profileImage);

        final TextView homeTxt=findViewById(R.id.homeTxt);
        final TextView likeTxt=findViewById(R.id.likeTxt);
        final TextView notificationTxt=findViewById(R.id.notificationTxt);
        final TextView profileTxt=findViewById(R.id.profileTxt);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer,HomeFragment.class,null)
                .commit();
        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=1){

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,HomeFragment.class,null)
                            .commit();

                    likeTxt.setVisibility(View.GONE);
                    notificationTxt.setVisibility(View.GONE);
                    profileTxt.setVisibility(View.GONE);

                    likeImage.setImageResource(R.drawable.ic_like);
                    notificationImage.setImageResource(R.drawable.ic_notification);
                    profileImage.setImageResource(R.drawable.ic_profile);

                    likeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    homeTxt.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.ic_home_selected);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    selectedTab=1;

                }
            }
        });

        likeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=2){

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,LikeFragment.class,null)
                            .commit();

                    homeTxt.setVisibility(View.GONE);
                    notificationTxt.setVisibility(View.GONE);
                    profileTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    notificationImage.setImageResource(R.drawable.ic_notification);
                    profileImage.setImageResource(R.drawable.ic_profile);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    likeTxt.setVisibility(View.VISIBLE);
                    likeImage.setImageResource(R.drawable.ic_like_selected);
                    likeLayout.setBackgroundResource(R.drawable.round_back_like_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    likeLayout.startAnimation(scaleAnimation);

                    selectedTab=2;

                }
            }
        });

        notificationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=3){

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,NotificationFragment.class,null)
                            .commit();

                    homeTxt.setVisibility(View.GONE);
                    likeTxt.setVisibility(View.GONE);
                    profileTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    likeImage.setImageResource(R.drawable.ic_like);
                    profileImage.setImageResource(R.drawable.ic_profile);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    likeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    notificationTxt.setVisibility(View.VISIBLE);
                    notificationImage.setImageResource(R.drawable.ic_notification_selected);
                    notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    notificationLayout.startAnimation(scaleAnimation);

                    selectedTab=3;

                }
            }
        });

        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=4){
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,ProfileFragment.class,null)
                            .commit();

                    homeTxt.setVisibility(View.GONE);
                    likeTxt.setVisibility(View.GONE);
                    notificationTxt.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.ic_home);
                    likeImage.setImageResource(R.drawable.ic_like);
                    notificationImage.setImageResource(R.drawable.ic_notification);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    likeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    profileTxt.setVisibility(View.VISIBLE);
                    profileImage.setImageResource(R.drawable.ic_profile_selected);
                    profileLayout.setBackgroundResource(R.drawable.round_back_profile_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    profileLayout.startAnimation(scaleAnimation);

                    selectedTab=4;

                }
            }
        });

    }
}