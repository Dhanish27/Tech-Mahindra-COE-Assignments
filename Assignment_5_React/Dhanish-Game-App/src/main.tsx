import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import "./index.css";
import { Box, ChakraProvider } from "@chakra-ui/react";

ReactDOM.createRoot(document.getElementById("root") as HTMLElement).render(
  <React.StrictMode>
    <ChakraProvider>
      <Box bg="white" minH="100vh">
        <App />
      </Box>
    </ChakraProvider>
  </React.StrictMode>
);
