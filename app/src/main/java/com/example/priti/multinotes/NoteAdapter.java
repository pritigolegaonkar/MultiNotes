package com.example.priti.multinotes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteViewHolder> {

    private ArrayList<Note> notesList;
    private MainActivity mainActivity;
    private int pos;

    public NoteAdapter(MainActivity mainAct, ArrayList<Note> noteList) {
        mainActivity = mainAct;
        notesList = noteList;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_list_view, parent, false);
        itemView.setOnClickListener(mainActivity);
        itemView.setOnLongClickListener(mainActivity);
        return new NoteViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        Note an=notesList.get(position);
        holder.title.setText(an.getNoteTitle());
        holder.content.setText(an.getNoteContent());
        holder.updateDate.setText(an.getLastUpdateDate());
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }
}
