import React from 'react'
import Card from '@mui/material/Card';
import CardHeader from '@mui/material/CardHeader';
import CardContent from '@mui/material/CardContent';
import IconButton from '@mui/material/IconButton'
import Typography from '@mui/material/Typography'
import DeleteOutlined from '@mui/icons-material/DeleteOutlined'
import { makeStyles } from "@mui/styles";
import Avatar from '@mui/material/Avatar'
import { yellow, green, pink, blue } from '@mui/material/colors'

type NoteProps = {
    note:{
        title: string,
        details: string,
        category: string,
        id: number
    },
    handleDelete: (id: number) => void; 

}

const useStyles = makeStyles({
    avatar: {
      backgroundColor: (props: NoteProps) => {
        if (props.note.category === 'work') {
          return yellow[700]
        }
        if (props.note.category === 'money') {
          return green[500]
        }
        if (props.note.category === 'todos') {
          return pink[500]
        }
        return blue[500]
      },
    }
  })

export const NoteCard = (props: NoteProps) => {
    const classes = useStyles(props)
  return (
    <div>
        <Card elevation={1}>
        <CardHeader
          avatar={
            <Avatar className={classes.avatar}>
              {props.note.category[0].toUpperCase()}
            </Avatar>}
          action={
            <IconButton onClick={() => props.handleDelete(props.note.id)}>
              <DeleteOutlined />
            </IconButton>
          }
          title={props.note.title}
          subheader={props.note.category}
        />
        <CardContent>
          <Typography variant="body2" color="textSecondary">
            { props.note.details }
          </Typography>
        </CardContent>
      </Card>
    </div>
  )
}