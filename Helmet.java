import java.io.Serializable;

public class Helmet extends Armour implements Serializable {

  /* Class Variables */
  private static final long SerialVersionUID = 1L;

  /* Constructors */
  public Helmet(String name, int durability, int defenseRating) {
    super(name, durability, defenseRating);
  }
}