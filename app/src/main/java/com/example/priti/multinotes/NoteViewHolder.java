package com.example.priti.multinotes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NoteViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView content;
    public TextView updateDate;

    public NoteViewHolder(View view){
        super(view);
        title=(TextView) view.findViewById(R.id.noteTitle);
        content=(TextView) view.findViewById(R.id.noteContent);
        updateDate=(TextView) view.findViewById(R.id.dateModified);


    }
}
