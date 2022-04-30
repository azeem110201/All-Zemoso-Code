import React, { useState } from "react";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
import Container from "@mui/material/Container";
import KeyboardArrowRightIcon from "@mui/material/Icon";
import { makeStyles } from "@mui/styles";
import Radio from '@mui/material/Radio'
import RadioGroup from '@mui/material/RadioGroup'
import FormControlLabel from '@mui/material/FormControlLabel'
import FormControl from '@mui/material/FormControl'
import FormLabel from '@mui/material/FormLabel'
import { useNavigate } from 'react-router-dom'

type Props = {};

const useStyles = makeStyles({
  field: {
    marginTop: 20,
    marginBottom: 20,
    display: "block",
  },
});

export const Home = (props: Props) => {
  const classes = useStyles();
  const navigate = useNavigate()
  const [title, setTitle] = useState<string>("");
  const [details, setDetails] = useState<string>("");
  const [titleError, setTitleError] = useState<boolean>(false);
  const [detailsError, setDetailsError] = useState<boolean>(false);
  const [category, setCategory] = useState<string>('money')

  const handleSubmit = (e: React.FormEvent): void => {
    e.preventDefault();
    setTitleError(false);
    setDetailsError(false);

    if (title === "") {
      setTitleError(true);
    }
    if (details === "") {
      setDetailsError(true);
    }
    if (title && details) {
      fetch("http://localhost:8000/notes", {
        method: 'POST',
        headers: {"Content-type": "application/json"},
        body: JSON.stringify({ title, details, category })
      }).then(() => navigate("/home"))
    }
  };

  return (
    <Container>
      <Typography
        variant="h6"
        color="textSecondary"
        component="h2"
        gutterBottom
      >
        Create a New Note
      </Typography>

      <form noValidate autoComplete="off" onSubmit={handleSubmit}>
        <TextField
          className={classes.field}
          onChange={(e) => setTitle(e.target.value)}
          label="Note Title"
          variant="outlined"
          color="secondary"
          fullWidth
          required
          error={titleError}
        />
        <TextField
          className={classes.field}
          onChange={(e) => setDetails(e.target.value)}
          label="Details"
          variant="outlined"
          color="secondary"
          multiline
          rows={4}
          fullWidth
          required
          error={detailsError}
        />

        <FormControl className={classes.field}>
          <FormLabel color={"info"}>Note Category</FormLabel>
          <RadioGroup
            value={category}
            onChange={(e) => setCategory(e.target.value)}
          >
            <FormControlLabel value="money" control={<Radio />} label="Money" />
            <FormControlLabel value="todos" control={<Radio />} label="Todos" />
            <FormControlLabel
              value="reminders"
              control={<Radio />}
              label="Reminders"
            />
            <FormControlLabel value="work" control={<Radio />} label="Work" />
          </RadioGroup>
        </FormControl>

        <Button
          type="submit"
          color="secondary"
          variant="contained"
          className={classes.field}
          endIcon={<KeyboardArrowRightIcon />}
        >
          Submit
        </Button>
      </form>
    </Container>
  );
};
