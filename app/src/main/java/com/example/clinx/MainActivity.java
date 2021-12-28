package com.example.clinx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.filterby,
                R.layout.support_simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);



      recyclerView=findViewById(R.id.firstRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        ModelClassforClinic[] modelClassforClinics=new ModelClassforClinic[]

                {
                        new ModelClassforClinic(" Al-Amir Hospital","25, Kuwait city"," Open 24 Hours"
                        ,"ds","General Checkup","Surgery Specalist",
                                "Kidney Expert",
                                "Bone Specalist",R.drawable.hos2),

                        new ModelClassforClinic(" Al-Amir Hospital","25, Kuwait city"," Open 24 Hours"
                                ,"ds","General Checkup","Surgery Specalist",
                                "Kidney Expert",
                                "Bone Specalist",R.drawable.hos3),

                        new ModelClassforClinic(" Al-Amir Hospital","25, Kuwait city"," Open 24 Hours"
                                ,"ds","General Checkup","Surgery Specalist",
                                "Kidney Expert",
                                "Bone Specalist",R.drawable.hos4),

                        new ModelClassforClinic(" Al-Amir Hospital","25, Kuwait city"," Open 24 Hours"
                                ,"ds","General Checkup","Surgery Specalist",
                                "Kidney Expert",
                                "Bone Specalist",R.drawable.hos7),

                        new ModelClassforClinic(" Al-Amir Hospital","25, Kuwait city"," Open 24 Hours"
                                ,"ds","General Checkup","Surgery Specalist",
                                "Kidney Expert",
                                "Bone Specalist",R.drawable.hos2)

                };

        ClinicAdapter clinicAdapter= new ClinicAdapter(modelClassforClinics,MainActivity.this);

        recyclerView.setAdapter(clinicAdapter);





        recyclerView2=findViewById(R.id.recyleforoctor);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


       DoctorModel[] doctorModels=new DoctorModel[]

                {
                        new DoctorModel("Al Khaleel lbn jaleel","Al-Amir Hospital"," 25, Kuwait city"
                                ,"General Checkup","Surgery Specalist","Kidney Expert",
                                "Bone Specalist",
                                "4.5",R.drawable.doc1),

                        new DoctorModel("Al Khaleel lbn jaleel","Al-Amir Hospital"," 25, Kuwait city"
                                ,"General Checkup","Surgery Specalist","Kidney Expert",
                                "Bone Specalist",
                                "4.5",R.drawable.doc2),

                        new DoctorModel("Al Khaleel lbn jaleel","Al-Amir Hospital"," 25, Kuwait city"
                                ,"General Checkup","Surgery Specalist","Kidney Expert",
                                "Bone Specalist",
                                "4.5",R.drawable.doc3),

                        new DoctorModel("Al Khaleel lbn jaleel","25, Kuwait city"," 25, Kuwait city"
                                ,"General Checkup","Surgery Specalist","Kidney Expert",
                                "Bone Specalist",
                                "4.5",R.drawable.doc4),

                        new DoctorModel("Al Khaleel lbn jaleel","Al-Amir Hospital"," 25, Kuwait city"
                                ,"General Checkup","Surgery Specalist","Kidney Expert",
                                "Bone Specalist",
                                "4.5",R.drawable.doc6),

                };

        DoctorAdapter doctorAdapter= new DoctorAdapter(doctorModels,MainActivity.this);

        recyclerView2.setAdapter(doctorAdapter);





    }
}