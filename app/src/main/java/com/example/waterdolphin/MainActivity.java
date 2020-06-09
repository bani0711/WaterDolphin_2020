package com.example.waterdolphin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
FragmentMain fragmentMain;
FragmentReward fragmentReward;
FragmentGraph fragmentGraph;
FragmentSetting fragmentSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //프래그먼트 생성
        fragmentMain = new FragmentMain();
        fragmentReward = new FragmentReward();
        fragmentGraph = new FragmentGraph();
        fragmentSetting =new FragmentSetting();

        //제일 처음 띄워줄 뷰 세팅
        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout,fragmentMain).commitAllowingStateLoss();

        //bottomNavigationView의 아이콘을 선택했을 때 원하는 프래그먼트가 띄워질 수 있도록 리스너 추가
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //switch 문으로 아이디 받아와서 각 아이디마다 그에 따른 프래그먼트 띄워주기
                switch(menuItem.getItemId()) {
                    case R.id.itemMain : {
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fragmentMain).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.itemReward : {
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fragmentReward).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.itemGraph : {
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fragmentGraph).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.itemSetting : {
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fragmentSetting).commitAllowingStateLoss();
                        return true;
                    }

                    default: return false;
                } //switch end
            } //onNavigationItemSelected end
        }); //setOnNavigationItemSelectedListener end
    }
}