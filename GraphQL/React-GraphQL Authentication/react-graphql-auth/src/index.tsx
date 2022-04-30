import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import ApolloWrapper from "./ApolloWrapper";
import Auth0ProviderWithHistory from "./auth/auth0-provider-with-history";
import { BrowserRouter } from "react-router-dom";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Auth0ProviderWithHistory>
        <ApolloWrapper>
          <App />
        </ApolloWrapper>
      </Auth0ProviderWithHistory>
    </BrowserRouter>
  </React.StrictMode>
);

reportWebVitals();
