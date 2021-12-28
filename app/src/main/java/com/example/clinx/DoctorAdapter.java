package com.example.clinx;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder>

{
   DoctorModel[] doctorModels;
    Context context;


    public DoctorAdapter(DoctorModel[] doctorModels,MainActivity activity)
    {
        this.doctorModels=doctorModels;
        this.context=activity;
    }

    @NonNull
    @Override
    public DoctorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        View view=layoutInflater.inflate(R.layout.second_recycler,parent,false);
        DoctorAdapter.ViewHolder viewHolder=new DoctorAdapter.ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull DoctorAdapter.ViewHolder holder, int position)
    {
        final DoctorModel doctorModel1 = doctorModels[position];

        holder.hospitalImg.setImageResource(doctorModel1.getImg());
        holder.name.setText(doctorModel1.getDoctorname());
        holder.place.setText(doctorModel1.getHospitalplace());
        holder.time.setText(doctorModel1.getHospitaltime());
        holder.genr1.setText(doctorModel1.getHospitalGeneral1());
        holder.genr2.setText(doctorModel1.getHospitalGeneral2());
        holder.genr3.setText(doctorModel1.getHospitalGeneral3());
        holder.genr4.setText(doctorModel1.getHospitalGeneral4());
        holder.genr4.setText(doctorModel1.getHospitalGeneral4());
        holder.rat.setText(doctorModel1.getStarlecvel());


        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent abcd = new Intent(context, DoctorAddress.class);
                context.startActivity(abcd);

            }
        });

    }

    @Override
    public int getItemCount() {
        return doctorModels.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView hospitalImg;
        TextView name,place,time,genr1,genr2,genr3,genr4,rat;
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
            rat=itemView.findViewById(R.id.rating);



        }
    }
}
