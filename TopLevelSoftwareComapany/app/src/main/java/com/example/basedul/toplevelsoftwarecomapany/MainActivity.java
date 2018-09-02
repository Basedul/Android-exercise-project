package com.example.basedul.toplevelsoftwarecomapany;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*Oncreate method. It is overriden*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*For string array access form strings.xml file*/
        Resources res = getResources();
        String companyName[] = res.getStringArray(R.array.CompanyNames);//company name
        String companyLink[] = res.getStringArray(R.array.CompanyLinks);//company link
        TypedArray companyPic = getResources().obtainTypedArray(R.array.CompanyPic);//company pic

        final ArrayList<AllInformation> arrayList = new ArrayList<>();//array list
        for(int i = 0; i < companyName.length; i++){//add in array list
            arrayList.add(new AllInformation(companyName[i], companyLink[i], companyPic.getResourceId(i, -1)));
        }


        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);

        ListView listView = (ListView)findViewById(R.id.listViewInMainActivity);
        listView.setAdapter(customAdapter);//adapter set



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//list item click
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (arrayList.get(i).getS()){

                    case "BrainStation_23":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Kaz software":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Reve systems":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Data Soft":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Magnito Digital":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "NewsCred":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Arobil":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "TherapBD":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Wide space":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;
                    case "Selise":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;

                    case "Vizrt":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;

                    case "Escenic":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;

                    case "bKash":
                        intent = new Intent(getApplicationContext(), ShowWebsite.class);
                        intent.putExtra("Websitename", arrayList.get(i).getS1());
                        startActivity(intent);
                        break;

                }
            }
        });


    }

}
