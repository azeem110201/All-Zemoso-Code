import React, { useState } from "react";

type Props = {};

export const TextUtils = (props: Props) => {
  const [text, setText] = useState<string>("");

  const handleTextChange = (
    event: React.ChangeEvent<HTMLTextAreaElement>
  ): void => {
    setText(event.target.value);
  };

  const changeToUpperCase = (text: string): void => {
    setText(text.toUpperCase());
  };

  const changeToLowerCase = (text: string): void => {
    setText(text.toLowerCase());
  };

  const clearText = (text: string): void => {
    setText("");
  };

  const copyToClipboard = (text: string): void => {
    navigator.clipboard.writeText(text);
    alert("Copied to clipboard");
  };
  return (
    <div>
      <div className="container">
        <div className="mb-3 my-5">
          <h2>Enter Text Here....</h2>
          <textarea
            className="form-control"
            value={text}
            onChange={handleTextChange}
            id="exampleFormControlTextarea1"
            rows={6}
          ></textarea>
        </div>
        <button
          type="button"
          className="btn btn-primary mx-3"
          onClick={() => {
            changeToUpperCase(text);
          }}
        >
          Change to upper case
        </button>
        <button
          type="button"
          className="btn btn-primary mx-3"
          onClick={() => {
            changeToLowerCase(text);
          }}
        >
          Change to lower case
        </button>
        <button
          type="button"
          className="btn btn-primary mx-3"
          onClick={() => {
            clearText(text);
          }}
        >
          Clear text
        </button>
        <button
          type="button"
          className="btn btn-primary mx-3"
          onClick={() => {
            copyToClipboard(text);
          }}
        >
          Copy to clipboard
        </button>
      </div>

      <div className="container my-5">
        <h3>Text Summary</h3>
        <p>
          {text.split(" ").length - 1} words and {text.length} character
        </p>
      </div>
    </div>
  );
};
