package com.molfar.notepad.callbacks;

import com.molfar.notepad.model.Note;

public interface NoteEventListener {


    void onNoteClick(Note note);


    void onNoteLongClick(Note note);
}
