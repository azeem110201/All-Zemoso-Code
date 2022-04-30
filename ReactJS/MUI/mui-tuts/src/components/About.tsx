import React, { useState, useEffect } from "react";
import Container from '@mui/material/Container'
import Grid from '@mui/material/Grid'
import { NoteCard } from './NoteCard';

type Props = {};

export const About = (props: Props) => {
  const [notes, setNotes] = useState<any[]>([]);

  useEffect(() => {
    fetch("http://localhost:8000/notes")
      .then(res => res.json())
      .then(data => setNotes(data));
  }, []);

  const handleDelete = async (id: number) => {
    await fetch('http://localhost:8000/notes/' + id, {
      method: 'DELETE'
    })

    // filtering notes based on the id
    const newNotes = notes.filter(note => note.id !== id)
    setNotes(newNotes)
  }

  return (
    <Container>
      <Grid container spacing={3}>
        {notes.map(note => (
          <Grid item xs={12} md={6} lg={4} key={note.id}>
            <NoteCard note={note} handleDelete={handleDelete}/>
          </Grid>
        ))}
      </Grid>
    </Container>
  );
};
