package com.example.recyclerview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
Contact contact1,contact2,contact3,contact4,contact5;
List<Contact> contacts;
ContactAdapter contactAdapter;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rvlist);
        contacts=new ArrayList<>();
        final Contact contact1=new Contact("12/9/2019","090 4362979","Việt Nam",R.drawable.phone,R.color.colorAccent2);
        final Contact contact2=new Contact("12/9/2019","094 4713700","Việt Nam",R.drawable.phone,R.color.colorAccent2);
        final Contact contact3=new Contact("12/9/2019","097 3868721","Việt Nam",R.drawable.phone,R.color.colorAccent2);
        final Contact contact4=new Contact("12/9/2019","Me vo","Việt Nam",R.drawable.phone,R.color.colorAccent2);
        final Contact contact5=new Contact("11/9/2019","Binh Tran","Messenger video",R.drawable.facetime,R.color.colorAccent2);
        final Contact contact6=new Contact("11/9/2019","Hùng Vpbank A","điện thoại",R.drawable.phone,R.color.colorAccent2);
        final Contact contact7=new Contact("11/9/2019","Me vo","di động",R.drawable.phone,R.color.colorAccent2);
        final Contact contact8=new Contact("11/9/2019","Me vo","di động",0,getColor(R.color.colorAccent6));
        final Contact contact9=new Contact("11/9/2019","Con Gái (2)","di dong",R.drawable.phone,R.color.colorAccent2);

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);
        contacts.add(contact9);

        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getBaseContext(),1,RecyclerView.VERTICAL,false);

        contactAdapter=new ContactAdapter(contacts);




    contactAdapter.setIonClickContact(new IonClickContact() {
        @Override
        public void onClickname(String numberphone) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        //    intent.putExtra("t1", (Parcelable) getBaseContext());
            intent.putExtra("ten",numberphone);
            startActivity(intent);
            Toast.makeText(getBaseContext(),numberphone,Toast.LENGTH_LONG).show();
        }

        @Override
        public void onClickNumber(String adress) {

        }

        @Override
        public void onClickDay(String day) {

        }
    });




        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);

    }
}
