package com.example.clinx;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClinicAdapter extends RecyclerView.Adapter<ClinicAdapter.ViewHolder>

   {
       ModelClassforClinic[] modelClassforClinic;
       Context context;


    public ClinicAdapter(ModelClassforClinic[] modelClassforClinic,MainActivity activity)
    {
        this.modelClassforClinic=modelClassforClinic;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        View view=layoutInflater.inflate(R.layout.firstclinicrecyclerlayout,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        final ModelClassforClinic modelClassforClinic1 = modelClassforClinic[position];

        holder.hospitalImg.setImageResource(modelClassforClinic1.getImg());
        holder.name.setText(modelClassforClinic1.getHospitalname());
        holder.place.setText(modelClassforClinic1.getHospitalplace());
        holder.time.setText(modelClassforClinic1.getHospitaltime());
        holder.genr1.setText(modelClassforClinic1.getHospitalGeneral1());
        holder.genr2.setText(modelClassforClinic1.getHospitalGeneral2());
        holder.genr3.setText(modelClassforClinic1.getHospitalGeneral3());
        holder.genr4.setText(modelClassforClinic1.getHospitalGeneral4());


        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent abcd = new Intent(context, ClinicAdresss.class);
                context.startActivity(abcd);

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelClassforClinic.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView hospitalImg;
        TextView name,place,time,genr1,genr2,genr3,genr4;
        Button btn;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            hospitalImg=itemView.findViewById(R.id.hos_im);
            name=itemView.findViewById(R.id.hospi_name);
            place=itemView.findViewById(R.id.hospi_place);
            time=itemView.findViewById(R.id.hospit_time);
            time=itemView.findViewById(R.id.hospit_time);
            genr1=itemView.findViewById(R.id.hos_gen1);
            genr2=itemView.findViewById(R.id.hos_gen2);
            genr3=itemView.findViewById(R.id.hos_gen3);
            genr4=itemView.findViewById(R.id.hos_gen4);
            btn=itemView.findViewById(R.id.button);








        }
    }
}
