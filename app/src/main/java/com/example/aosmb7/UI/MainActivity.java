package com.example.aosmb7.UI;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.aosmb7.R;

public class MainActivity extends AppCompatActivity {
FragmentMain fragmentMain = new FragmentMain();
FragmentFirst fragmentFirst = new FragmentFirst();
FragmentSecond fragmentSecond = new FragmentSecond();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, fragmentMain)
                .commit();
    }
    public void onClick(View view){
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.buttonfrmain2first: {
                fTrans.replace(R.id.fragment_container_view, fragmentFirst);
                break;
            }
            case R.id.buttonfrmain2second: {
                fTrans.replace(R.id.fragment_container_view, fragmentSecond);
                break;
            }
            case R.id.buttonfrfirst2main:{
                fTrans.replace(R.id.fragment_container_view, fragmentMain);
                break;
            }
            case R.id.buttonfrsecond2main: {
                fTrans.replace(R.id.fragment_container_view, fragmentMain);
                break;
            }
        }
        fTrans.addToBackStack(null).commit();

    }
}