package br.saojudas.sdm21_1.chatcomfirebased3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder{
    TextView dataNomeTextView;
    TextView mensagemTextView;

    public ChatViewHolder(@NonNull View v) {
        super(v);
        this.dataNomeTextView = v.findViewById(R.id.dataNomeTextView);
        this.mensagemTextView = v.findViewById(R.id.mensagemTextView);
    }
}
