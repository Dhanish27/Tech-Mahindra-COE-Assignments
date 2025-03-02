import React from 'react'
import { Card, CardHeader, CardBody, CardFooter, Heading, Stack, Box, StackDivider, Text, Image, Divider, ButtonGroup, Button } from '@chakra-ui/react'

interface GameCard{
    name:string;
    image:string;
}
function GameCard({name,image}:GameCard) {
  return (
    <Card maxW='sm' style={{margin:"20px"}} >
  <CardBody >
    <Image
      src={image}
      alt='Image Not Loaded'
      borderRadius='lg'
    />
    <Stack mt='6' spacing='3'>
      <Heading size='md'>{name}</Heading>
    </Stack>
  </CardBody>
  <Divider/>
  <CardFooter bg={'blackAlpha.100'}>
    <ButtonGroup spacing='2' >
      <Button variant='solid' colorScheme='blue'>
        Play now
      </Button>
    </ButtonGroup>
  </CardFooter>
</Card>
  )
}

export default GameCard
