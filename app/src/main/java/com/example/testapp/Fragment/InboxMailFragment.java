package com.example.testapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testapp.Adapter.InboxAdapter;
import com.example.testapp.InboxModel;
import com.example.testapp.R;

import java.util.ArrayList;
public class InboxMailFragment extends Fragment {

    RecyclerView recyclerView;
    InboxAdapter inboxAdapter;
    ArrayList<InboxModel> arrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inbox_mail, container, false);

        recyclerView = view.findViewById(R.id.inboxrecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connor - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.two,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.three,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.two,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.three,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));

        inboxAdapter = new InboxAdapter(getContext(),arrayList);
        recyclerView.setAdapter(inboxAdapter);
        return view;
    }
}