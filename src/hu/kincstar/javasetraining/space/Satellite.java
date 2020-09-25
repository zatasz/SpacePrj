package hu.kincstar.javasetraining.space;

public class Satellite {
    private String registerIdent;
    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent)
    {

    }

    public void modifyDestination(CelestialCoordinates diff, int x, int y, int z)
    {
        try
        {
            if(registerIdent != null && !registerIdent.isEmpty())
            {
                if (Integer.parseInt(registerIdent) == diff.getId())
                {
                 diff.setCorX(x);
                 diff.setCorY(y);
                 diff.setCorZ(z);
                }
            }
        }
        catch (NullPointerException ex)
        {
            throw new NullPointerException("Nem adott meg azonosítót.");
        }
    }
  /*  public String toString()
    {
        return
    }*/
}
