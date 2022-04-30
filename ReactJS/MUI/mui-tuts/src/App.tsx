import React from "react";
import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { Home } from "./components/Home";
import { About } from "./components/About";
import { createTheme, ThemeProvider } from "@mui/material";
import { purple } from "@mui/material/colors";
import { Layout } from "./components/Layout";

const theme = createTheme({
  palette: {
    primary: {
      main: "#F9B1A2",
    },
    secondary: purple,
  },
  typography: {
    fontFamily: "Quicksand",
    fontWeightLight: 400,
    fontWeightRegular: 500,
    fontWeightMedium: 600,
    fontWeightBold: 700,
  },
});

const App = () => {
  return (
    <ThemeProvider theme={theme}>
      <Router>
        <Layout>
          <Routes>
            <Route path="/home" element={<Home />} />
            <Route path="/" element={<About />} />
          </Routes>
        </Layout>
      </Router>
    </ThemeProvider>
  );
};

export default App;
