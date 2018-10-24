package com.arissandy.satria.modul2_fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //agar fragment dibuat sekali saja
        if (savedInstanceState == null) {
            //membuat object untuk heads
            BodyPartsFragment bodyFragment;
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getHeads());
            bodyFragment.setmListIndex(0);
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            //transaksi fragment heads
            fragmentManager.beginTransaction().add(R.id.heads_container, bodyFragment).commit();


            //membuat object untuk body
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            //transaksi fragment body
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

            //membuat object untuk legs
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setmImageIds(ImageAssets.getLegs());
            bodyFragment.setmListIndex(0);
            //transaksi fragment body
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();
        }
    }
}
