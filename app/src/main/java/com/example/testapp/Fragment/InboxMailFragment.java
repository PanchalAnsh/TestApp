package com.example.testapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testapp.Adapter.InboxAdapter;
import com.example.testapp.Models.InboxModel;
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
        arrayList.add(new InboxModel(R.drawable.two,"Summer BBQ 4","to Alex,Scott,Jennifer - Wish I Could come, but I'm out of town this weekends."));
        arrayList.add(new InboxModel(R.drawable.three,"Oui Oui","Sandra Adams - Do you have Paris recommendations? Have you ever been?"));
        arrayList.add(new InboxModel(R.drawable.one,"Birthday gift","Trevor Hansen - Have any ideas about what we should get Heldi for her birthday?"));
        arrayList.add(new InboxModel(R.drawable.two,"Recipe to try","Britta Holt - We should eat this:Gratch Squash, Corn and tomatillo Tacos,etc.."));
        arrayList.add(new InboxModel(R.drawable.three,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));
        arrayList.add(new InboxModel(R.drawable.one,"Brunch this weekend?","ali Connors - i'll be in your neighborhood doing errands this weekend. Do you Want..."));

        inboxAdapter = new InboxAdapter(getContext(),arrayList);
        recyclerView.setAdapter(inboxAdapter);
        return view;
    }
}