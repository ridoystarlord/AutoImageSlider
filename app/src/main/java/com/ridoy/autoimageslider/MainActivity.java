package com.ridoy.autoimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<SliderItem> itemList;
    testAdapter adapter;
    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList=new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

//        SliderView sliderView = findViewById(R.id.imageSlider);
//
//        SliderAdapter adapter = new SliderAdapter(this,);
//        adapter.addItem(new SliderItem("This is simple Description 1","https://images.unsplash.com/photo-1566650554919-44ec6bbe2518?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmVhdXRpZnVsJTIwYW5pbWFsfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80"));
//        adapter.addItem(new SliderItem("This is simple Description 2","https://images.unsplash.com/photo-1598755257130-c2aaca1f061c?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8d2lsZCUyMGFuaW1hbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80"));
//        adapter.addItem(new SliderItem("This is simple Description 3","https://images.pexels.com/photos/47547/squirrel-animal-cute-rodents-47547.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
//        sliderView.setSliderAdapter(adapter);
//
//        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
//        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
//        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
//        sliderView.setIndicatorSelectedColor(Color.WHITE);
//        sliderView.setIndicatorUnselectedColor(Color.GRAY);
//        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
//        sliderView.startAutoCycle();

        itemList.add(new SliderItem("This is simple Description 1","https://emperorempire.com/wp-content/uploads/2020/09/Free-Sync-vs-G-Sync-feature.png"));
        itemList.add(new SliderItem("This is simple Description 2","https://emperorempire.com/wp-content/uploads/2021/01/Alienware-25-Gaming-Monitor.png"));
        itemList.add(new SliderItem("This is simple Description 3","https://emperorempire.com/wp-content/uploads/2021/01/ASUS-TUF-Gaming-VG279QM.png"));

        adapter=new testAdapter(this,itemList);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.startAutoCycle();
    }
}