import Car from './Car';
import Apple from './Apple';
function Garage()
{
    const brand='BMW';
  return(
    <>
    <h1>Who lives inside my Garage?</h1>
    <Car brand={brand} />
    <Apple/>
    </>
  );
}
export default Garage;