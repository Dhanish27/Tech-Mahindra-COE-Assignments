import {
  Grid,
  GridItem,
  Button,
  Heading,
  Image,
  Flex,
} from "@chakra-ui/react";
import Navbar from "./Components/NavBar";
import GameList from "./Components/GameList";
import DrawerSideTab from "./Components/DrawerSideTab";
import { useState } from "react";
import DhanishCar from "../src/assets/DhanishCar.png";
import Footer from "./Components/Footer";

function App() {
  const [isSidebarOpen, setSidebarOpen] = useState(false);

  return (
    <>
      <Grid
        templateAreas={`"nav nav"
                        "side main"
                        "footer footer"`} // Footer placed at the bottom
        templateColumns={isSidebarOpen ? "250px 1fr" : "0px 1fr"} // Sidebar width
        templateRows={"auto 1fr auto"} // Ensures footer stays at bottom
        minH="100vh" // Full viewport height
        transition="all 0.3s ease-in-out"
      >
        {/* Navbar with Sidebar Toggle Button */}
        <GridItem
          area={"nav"}
          bg={"blackAlpha.800"}
          p={2}
          display="flex"
          justifyContent="space-between"
        >
          <Navbar />
          <Flex align="center" gap={2}>
            <Heading>Dhanish Game App</Heading>
            <Image src={DhanishCar} boxSize="60px" />
          </Flex>

          <Button
            colorScheme="teal"
            margin={"30px"}
            onClick={() => setSidebarOpen(!isSidebarOpen)}
          >
            {isSidebarOpen ? "Close SearchBar" : "Open SearchBar"}
          </Button>
        </GridItem>

        {/* Sidebar */}
        <GridItem area={"side"} bg={"gray.700"} overflow="hidden">
          {isSidebarOpen && <DrawerSideTab />}
        </GridItem>

        {/* Main Content */}
        <GridItem area={"main"} bg={"black"}>
          <GameList />
        </GridItem>

        {/* Footer (Separate Row) */}
        <GridItem area={"footer"} bg={"gray.800"}>
          <Footer />
        </GridItem>
      </Grid>
    </>
  );
}

export default App;
