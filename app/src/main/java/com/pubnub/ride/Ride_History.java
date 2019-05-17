package com.pubnub.ride;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RidehistoryAdapter;
import model.RidehistoryModel;

public class Ride_History extends AppCompatActivity {

    private RidehistoryAdapter ridehistoryAdapter;
    private RecyclerView recyclerview;
    private ArrayList<RidehistoryModel> ridehistoryModelArrayList;

    Integer i1[]={R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black,R.drawable.pin_black};
    Integer i2[]={R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted,R.drawable.rect_dotted};
    Integer i3[]={R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue,R.drawable.navigatiob_blue};
    String txtmall[]={"688 Folsom St","725 Folsom St","688 Folsom St","688 Folsom St","725 Folsom St"};
    String txthome[]={"Home","Work","Home","Home","Work"};
    String txtdate[]={"01 May 2019","02 May 2019","04 May 2018","07 May 2018","09 May 2018"};
    String txtprice[]={"$12.94","$14.52","$11.45","$17.34","$22.25"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride__history);

        recyclerview=findViewById(R.id.recycler1);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Ride_History.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        ridehistoryModelArrayList = new ArrayList<>();

        for (int i=0;i<i1.length;i++){

            RidehistoryModel listModel = new RidehistoryModel(i1[i],i2[i],i3[i],txtmall[i],txthome[i],txtdate[i],txtprice[i]);

            ridehistoryModelArrayList.add(listModel);

        }
        ridehistoryAdapter = new RidehistoryAdapter(Ride_History.this,ridehistoryModelArrayList);
        recyclerview.setAdapter(ridehistoryAdapter);



    }
}
