package app.data;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest extends TestCase {
    Character character;
    Dimension position;

    @Before
    public void setUp() throws Exception {
        position = new Dimension(18,19);
        character = new Character(position);
    }

    @Test
    public void testGetPosition() throws Exception {
        Assert.assertTrue(character.getPosition().getX() == position.getX() && character.getPosition().getY() == position.getY());
    }

    @Test
    public void testSetPosition() throws Exception {
        character.setPosition(new Dimension(character.getPosition().getX() + 10, character.getPosition().getY() + 5));

        Assert.assertTrue(character.getPosition().getX() == 28 && character.getPosition().getY() == 24);
    }

    @Test
    public void testMove() throws Exception {

    }

    @Test
    public void testRotationRight() throws Exception {

    }

    @Test
    public void testRotationLeft() throws Exception {

    }

    @Test
    public void testCheckStraightAHead() throws Exception {

    }
}