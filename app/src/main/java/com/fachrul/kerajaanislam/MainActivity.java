package com.fachrul.kerajaanislam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bukafragment(new HomeFragment());
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId()==R.id.home){
                    bukafragment(new HomeFragment());
                    return true;
                }
                if (menuItem.getItemId()==R.id.tokoh){
                    bukafragment(new TokohFragment());
                    return true;
                }
                if (menuItem.getItemId()==R.id.kuis){
                    bukafragment(new QuizFragment());
                    return true;
                }
                return false;
            }
        });
    }

    Boolean bukafragment(Fragment fragment){
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
