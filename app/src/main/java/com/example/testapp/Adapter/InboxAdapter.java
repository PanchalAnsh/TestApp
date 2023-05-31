package com.example.testapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testapp.Models.InboxModel;
import com.example.testapp.R;

import java.util.ArrayList;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.viewholder> {

    Context context;
    ArrayList<InboxModel> arrayList = new ArrayList<>();

    public InboxAdapter(Context context, ArrayList<InboxModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public InboxAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholder(LayoutInflater.from(context).inflate(R.layout.inbox_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InboxAdapter.viewholder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).getImg());
        holder.txtshrotmsg.setText(arrayList.get(position).getShortmsg());
        holder.txtmsg.setText(arrayList.get(position).getMsg());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView txtshrotmsg,txtmsg;
        ImageView imageView;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            txtshrotmsg = itemView.findViewById(R.id.txtshrotmasg);
            txtmsg = itemView.findViewById(R.id.txtmsg);
            imageView = itemView.findViewById(R.id.profile_image);
        }
    }
}
