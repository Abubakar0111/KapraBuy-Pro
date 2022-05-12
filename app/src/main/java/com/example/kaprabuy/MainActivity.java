package com.example.kaprabuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.kaprabuy.Fragment.HomeFragment;
import com.example.kaprabuy.Fragment.NotificationFragment;
import com.example.kaprabuy.Fragment.PostFragment;
import com.example.kaprabuy.Fragment.ProfileFragment;
import com.example.kaprabuy.Fragment.SearchFragment;
import com.example.kaprabuy.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,new HomeFragment());
        transaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                
                switch (i){
                    case 0:
                        transaction.replace(R.id.container,new HomeFragment());
                        
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        transaction.replace(R.id.container,new NotificationFragment());

                        Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        transaction.replace(R.id.container,new PostFragment());

                        Toast.makeText(MainActivity.this, "Add Post", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        transaction.replace(R.id.container,new SearchFragment());

                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        transaction.replace(R.id.container,new ProfileFragment());

                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;
                }
                transaction.commit();
            }
        });
    }
}