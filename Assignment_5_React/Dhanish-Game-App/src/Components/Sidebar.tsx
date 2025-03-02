import { VStack, Image, Text, position } from "@chakra-ui/react";
import GooglePlay from "../assets/GooglePlay.png";
import { Heading } from "@chakra-ui/react";
function Sidebar() {
  return (
    <>
    
      <VStack justifyContent={"space-between"} padding={"6px"} margin={"0px"}>
        <Heading as="h2" size="xl" color={'blackAlpha.900'} padding={'10px'}>
           Games Info
        </Heading>
        <Text>Grand Theft Auto V</Text>
        <Text>The Witcher 3: Wild Hunt</Text>
        <Text>Portal 2</Text>
        <Text>Counter-Strike: Global Offensive</Text>
        <Text>Tomb Raider (2013)</Text>
        <Text>Portal</Text>
        <Text>Left 4 Dead 2</Text>
        <Text>The Elder Scrolls V: Skyrim</Text>
        <Text>Red Dead Redemption 2</Text>
        <Text>BioShock Infinite</Text>
        <Text>Half-Life 2</Text>
        <Text>Borderlands 2</Text>
        <Text>Life is Strange</Text>
        <Text>BioShock</Text>
        <Text>Destiny 2</Text>
        <Text>PAYDAY 2</Text>
        <Text>Fallout 4</Text>
        <Text>God of War (2018)</Text>
        <Text>Team Fortress 2</Text>
        <Text>Limbo</Text>
        <Text>I am David</Text>
        <Text>Kizhadila Serupu Adi</Text>
        <Text>Adventures of Dhanish</Text>
        <Text>Jai Rider</Text>
        <Text>Aswin Co-Rider</Text>
        <Text>Abineshum CTSum</Text>
        <Text>Clash of Clans</Text>
        <Text>Clash Royale</Text>
        <Text>Subway Surfer</Text>
        <Text>Temple Run</Text>
        <Text>Free Fire</Text>
        <Text>PUBG</Text>
        <Text>Cake Mania</Text>
        <Text>Farm Frency</Text>
        <Text>Granny</Text>
        <Text>One Piece</Text>
        <Text>Naruto</Text>
        <Image src={GooglePlay} boxSize={"80px"}></Image>
        <Text alignContent={"center"}>Connect to Google Play</Text>
      </VStack>
      
    </>
  );
}
export default Sidebar;
