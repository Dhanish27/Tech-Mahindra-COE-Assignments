import React, { Fragment, useEffect, useState } from "react";
import axios from "axios";
import { SimpleGrid, Box, Text, Center } from "@chakra-ui/react";
import GameCard from "./GameCard";
import ReactPaginate from "react-paginate";
import PreviousButton from "./PreviousButton";
import NextButton from "./NextButton";
import "./CSS/Pagination.css";
import { c } from "framer-motion/dist/types.d-6pKw1mTI";

interface Game {
  id: number;
  name: string;
  background_image: string;
}

function GameList() {
  const [games, setGames] = useState<Game[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);
  const [currentPage, setCurrentPage] = useState(0);
  const itemsPerPage = 9; // Show 9 games per page

  useEffect(() => {
    axios
      .get<{ results: Game[] }>(
        "https://api.rawg.io/api/games?key=4351bea07fb346c7b6fe46fbe0e291e9"
      )
      .then((response) => {
        setGames(response.data.results);
        setLoading(false);
      })
      .catch((error) => {
        setError(error.message);
        setLoading(false);
      });
  }, []);

  if (loading) return <p>Loading...</p>;
  if (error) return <p>Error fetching games: {error}</p>;

  // Pagination logic
  const totalPages = Math.ceil(games.length / itemsPerPage);
  const displayedGames = games.slice(
    currentPage * itemsPerPage,
    (currentPage + 1) * itemsPerPage
  );

  const handlePageChange = (event: { selected: number }) => {
    setCurrentPage(event.selected);
  };

  return (
    <Box bg="gray.600" minH="100vh" p="20px" >
      <SimpleGrid columns={[1, 2, 3]} spacing="20px">
        {displayedGames.map((game) => (
          <GameCard
            key={game.id}
            name={game.name}
            image={game.background_image}
          />
        ))}
      </SimpleGrid>

      {/* Pagination Component */}
      <ReactPaginate
        previousLabel={<PreviousButton />}
        nextLabel={<NextButton />}
        pageCount={totalPages}
        marginPagesDisplayed={2}
        pageRangeDisplayed={3}
        onPageChange={handlePageChange}
        containerClassName={"pagination"}
        activeClassName={"active"}
        pageClassName={"page-item"}
        breakClassName={"break"}
      />
    </Box>
  );
}

export default GameList;
