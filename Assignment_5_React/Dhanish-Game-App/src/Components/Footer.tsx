import { Box, Text, Flex, Divider } from "@chakra-ui/react";

function Footer() {
  return (
    <Box as="footer" bg="gray.800" color="white" py={4} mt={10}>
      <Divider mb={3} />
      <Flex justify="center" align="center" direction="column">
        <Text fontSize="sm">© {new Date().getFullYear()} Dhanish Game App. All rights reserved.</Text>
        <Text fontSize="xs">Built with ❤️ using React, Chakra UI & Sukumar Teaching</Text>
      </Flex>
    </Box>
  );
}

export default Footer;
