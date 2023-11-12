import java.io.Serializable;

public class Trouser extends Armour implements Serializable{

  /* Class Variables */
  private static final long SerialVersionUID = 1L;

  /* Constructors */
  public Trouser(String name, int durability, int defenseRating) {
    super(name, durability, defenseRating);
  }
}