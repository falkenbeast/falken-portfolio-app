package com.falkenbeast.falkenportfolioapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Projectadapter extends RecyclerView.Adapter<Projectadapter.ProjectViewHolder> {

    private Projects []  projects;
    Projectadapter (Projects [] projects){
        this.projects = projects;
    }



    @Override
    public int getItemCount() {
        return projects.length;
    }


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


       View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent,false);

        return new ProjectViewHolder(view);
    }              //these are abstract methods needs to be done

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
           holder.bind(projects[position]);
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder{

        ImageView appimage;
        TextView apptile;
        TextView appdescription;




        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            appimage = itemView.findViewById(R.id.itemicon);
            apptile = itemView.findViewById((R.id.itemtitle));
            appdescription = itemView.findViewById((R.id.itemdesc));

        }
        public  void bind (Projects project){
                      apptile.setText(project.name);
                      appdescription.setText(project.description);
                      appimage.setImageResource(project.image);
        }
    }




}
