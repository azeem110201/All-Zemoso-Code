import { Auth0Provider } from "@auth0/auth0-react";
import { useNavigate } from "react-router-dom";
import React from "react";

type Props = {
  children: React.ReactNode;
};

const Auth0ProviderWithHistory = (props: Props) => {
  let navigate = useNavigate();
  const domain = process.env.REACT_APP_AUTH0_DOMAIN as string;
  const clientId = process.env.REACT_APP_AUTH0_CLIENT_ID as string;
  const audience = process.env.REACT_APP_AUTH0_AUDIENCE as string;

  const onRedirectCallback = (appState: any) => {
    navigate(appState?.targetUrl || window.location.pathname);
  };
  return (
    <Auth0Provider
      domain={domain}
      clientId={clientId}
      redirectUri={window.location.origin}
      audience={audience}
      onRedirectCallback={onRedirectCallback}
    >
      {props.children}
    </Auth0Provider>
  );
};

export default Auth0ProviderWithHistory;
