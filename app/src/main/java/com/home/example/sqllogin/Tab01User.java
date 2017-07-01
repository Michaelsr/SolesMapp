package com.home.example.sqllogin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.home.example.sqllogin.bean.User;
import com.home.example.sqllogin.dao.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HPINTEL on 04/06/2017.
 */

public class Tab01User extends Fragment{

    private DatabaseHelper databaseHelper;
    public static List<User> listUser= new ArrayList<User>();
    public int userId=0;
    ListView listView;
    public int ID=0;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view= inflater.inflate(R.layout.tab01_user, container, false);

        listView = (ListView)view.findViewById(R.id.listView);
        databaseHelper  = new DatabaseHelper(getContext().getApplicationContext());
        listUser = databaseHelper.getAllUser();


        int layout = android.R.layout.simple_list_item_1;
        final ArrayAdapter<User> arrayAdapter = new ArrayAdapter<User>(getActivity(),layout, listUser);
        listView.setAdapter(arrayAdapter);


        return view;
    }

}
