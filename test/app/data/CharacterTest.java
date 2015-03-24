package app.data;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class CharacterTest extends TestCase {
    Character character,characterPos;
    Dimension position;
    int orientation;

    @Before
    public void setUp() throws Exception {
        position = new Dimension(18,19);
        orientation = 12;
        character = new Character();
        characterPos = new Character(position);
    }

    @Test
    public void testGetPosition() throws Exception {
        Assert.assertTrue(characterPos.getPosition().getX() == position.getX() && characterPos.getPosition().getY() == position.getY());
    }

    @Test
    public void testSetPosition() throws Exception {
        characterPos.setPosition(new Dimension(characterPos.getPosition().getX() + 10, characterPos.getPosition().getY() + 5));

        Assert.assertTrue(characterPos.getPosition().getX() == 28 && characterPos.getPosition().getY() == 24);
    }

    @Test
    public void testGetOrientation() throws Exception {
        assertTrue(character.getOrientation() == 0);
    }

    @Test
    public void testSetOrientation() throws Exception {
        character.setOrientation(orientation);
        assertTrue(character.getOrientation() == orientation);
    }
}