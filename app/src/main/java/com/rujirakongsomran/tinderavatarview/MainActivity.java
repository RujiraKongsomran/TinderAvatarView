package com.rujirakongsomran.tinderavatarview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.athbk.avatarview.TinderRecyclerView;
import com.rujirakongsomran.tinderavatarview.Adapter.CustomAdapter;
import com.rujirakongsomran.tinderavatarview.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        TinderRecyclerView recyclerView = (TinderRecyclerView) findViewById(R.id.recyclerView);

        initData();

        CustomAdapter adapter = new CustomAdapter(itemList, this);
        recyclerView.initRecyclerView(this, adapter);
    }

    private void initData() {
        Item item = new Item("https://images.pexels.com/photos/3730957/pexels-photo-3730957.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 0);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/4142815/pexels-photo-4142815.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 1);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/2397645/pexels-photo-2397645.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 2);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/3377538/pexels-photo-3377538.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 3);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/1115804/pexels-photo-1115804.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 4);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/3075988/pexels-photo-3075988.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 5);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/3683056/pexels-photo-3683056.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 6);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/2249055/pexels-photo-2249055.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 7);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/3222421/pexels-photo-3222421.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 8);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/4099388/pexels-photo-4099388.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 9);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/3551227/pexels-photo-3551227.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 10);
        itemList.add(item);

        item = new Item("https://images.pexels.com/photos/4033578/pexels-photo-4033578.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500", 11);
        itemList.add(item);
    }
}
