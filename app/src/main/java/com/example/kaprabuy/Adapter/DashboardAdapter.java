package com.example.kaprabuy.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kaprabuy.Model.DasboardModel;
import com.example.kaprabuy.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.viewHolder>{

    ArrayList<DasboardModel> list;
    Context context;

    public DashboardAdapter(ArrayList<DasboardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

   View view= LayoutInflater.from(context).inflate(R.layout.dashboard_rv,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
     DasboardModel model= list.get(position);
     holder.profile.setImageResource(model.getProfile());
     holder.postImage.setImageResource(model.getPostImage());
     holder.name.setText(model.getName());
     holder.about.setText(model.getName());
     holder.like.setText(model.getName());
     holder.comment.setText(model.getComment());
     holder.share.setText(model.getShare());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
               ImageView profile,postImage,save;
               TextView name,about,comment,like,share;


            public viewHolder(@NonNull View itemView) {
                super(itemView);

                profile = itemView.findViewById(R.id.profile_image);
                postImage=itemView.findViewById(R.id.postimage);
                save=itemView.findViewById(R.id.save);
                name=itemView.findViewById(R.id.username);
                about=itemView.findViewById(R.id.about);
                comment=itemView.findViewById(R.id.comment);
                share=itemView.findViewById(R.id.sharee);






            }
        }
        }


