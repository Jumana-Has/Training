function Car(props)
{
  const{brand}=props
  const text = `I am a ${brand} Car!`;
  return(
    <h2>{text}</h2>
  );
}
export default Car;