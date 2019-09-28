package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.FloatBuffer;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHodoer> {
    List<Contact> contacts;
    IonClickContact ionClickContact;

    public void setIonClickContact(IonClickContact ionClickContact) {
        this.ionClickContact = ionClickContact;
    }

    public ContactAdapter(List<Contact> contact) {
        this.contacts = contact;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHodoer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemcontact, parent, false);
        ViewHodoer viewhoder = new ViewHodoer(view);

        return viewhoder;

    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHodoer holder, final int position) {

        final Contact contact = contacts.get(position);
        holder.numberphone.setText(contact.getNumberphone());
        holder.adress.setText(contact.getAdress());
        holder.day.setText(contact.getDay());
        holder.icon.setImageResource(contact.getIcon());
        holder.numberphone.setTextColor(contact.getMauchu());
        holder.numberphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ionClickContact.onClickname(contact.getNumberphone());



            }
        });
        holder.adress.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ionClickContact.onClickNumber(contact.getAdress());
            }
        }));
        holder.day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ionClickContact.onClickDay(contact.getDay());
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHodoer extends RecyclerView.ViewHolder {
        TextView numberphone, adress,day;
        ImageView icon;

        public ViewHodoer(@NonNull View itemView) {
            super(itemView);
            numberphone = itemView.findViewById(R.id.tv_numberphone);
            adress = itemView.findViewById(R.id.tv_adress);
            day=itemView.findViewById(R.id.tv_day);
            icon=itemView.findViewById(R.id.tv_iconphone);
        }
    }
}
