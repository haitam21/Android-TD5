package com.example.android_td5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final List<Contact> mContacts;
    private final Context mcontext;


    public ContactsAdapter(List<Contact> Contacts, Context mcontext) {
        this.mContacts = Contacts;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View contactView=inflater.inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(contactView);
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact=mContacts.get(position);

        TextView firstNameTextView=holder.firstName;
        firstNameTextView.setText(contact.getPrenom());

        TextView lastNameTextView=holder.lastName;
        lastNameTextView.setText(contact.getNom());

        ImageView imageViewContact=holder.imageView;
        Glide.with(mcontext).load(contact.getImageUrl()).into(imageViewContact);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstName;
        public TextView lastName;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            firstName=(TextView) itemView.findViewById(R.id.firstName_text);
            lastName= (TextView) itemView.findViewById(R.id.lastName_text);
            imageView=(ImageView) itemView.findViewById(R.id.imageView2);
        }
    }
}
