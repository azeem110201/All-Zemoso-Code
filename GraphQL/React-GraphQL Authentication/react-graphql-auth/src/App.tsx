import "./App.css";
import { useQuery, gql } from "@apollo/client";
import Todo from "./Todo";
import AddTodo from "./AddTodo";
import { useAuth0 } from "@auth0/auth0-react";

export const TODOS_QUERY = gql`
  query TODOS_QUERY {
    todos {
      title
      id
    }
  }
`;

function App() {
  const { data, loading, error } = useQuery(TODOS_QUERY);
  const { isLoading, isAuthenticated, loginWithRedirect, user, logout } =
    useAuth0();

  if (loading) {
    return <>Loading.....</>;
  }
  return (
    <div className="App">
      {isAuthenticated ? (
        <>
          <button onClick={() => logout()}>Logout</button>
          <AddTodo />
          {data.todos.map((todo: any, index: number) => {
            return <Todo key={index} id={todo.id} title={todo.title} />;
          })}
        </>
      ) : (
        <button onClick={() => loginWithRedirect()}>Login</button>
      )}
    </div>
  );
}

export default App;
