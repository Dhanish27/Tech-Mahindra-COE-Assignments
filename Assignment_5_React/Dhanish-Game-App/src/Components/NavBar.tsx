import { HStack, Image } from "@chakra-ui/react";
import Pagelogo from "../assets/PageLogo.png";

function Navbar() {
  return (
    <>
      <HStack justifyContent={"space-between"} padding={"6px"}margin={'0px'} >
        <Image src={Pagelogo} boxSize={'80px'} ></Image>
      </HStack>
    </>
  );
}
export default Navbar;
