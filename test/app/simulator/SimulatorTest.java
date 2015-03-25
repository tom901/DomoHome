package app.simulator;

import app.algorithm.BrainCharacter;
import app.algorithm.BrainHome;
import app.data.Data;
import app.data.Dimension;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulatorTest {

    Simulator simulator;
    BrainHome brainHome;
    BrainCharacter brainCharacter;
    Data data;

    @Before
    public void setUp() throws Exception {
        simulator = new Simulator();
        data = new Data();
        brainHome = new BrainHome();
        brainCharacter = new BrainCharacter();
        data.init();

    }

    @Test
    public void testInit() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        assertNotNull(simulator.brainHomeService);
    }

    @Test
    public void testBindBrainCharacterService() throws Exception {
        simulator.bindBrainCharacterService(brainCharacter);
        assertTrue(simulator.brainCharacterService instanceof BrainCharacter);
    }

    @Test
    public void testBindBrainHomeService() throws Exception {
        simulator.bindBrainHomeService(brainHome);
        assertTrue(simulator.brainHomeService instanceof BrainHome);
    }

    @Test
    public void testStart() throws Exception {
//        simulator.start();
//        simulator.pause();
    }

    @Test
    public void testDestroy() throws Exception {

    }

    @Test
    public void testPause() throws Exception {

    }

    @Test
    public void testSetCharacterMove() throws Exception {
        int direc = 1;
        simulator.setCharacterMove(direc);
        assertTrue(simulator.direction == direc);
    }

    @Test
    public void testBindDataService() throws Exception {
        simulator.bindDataService(data);
        assertTrue(simulator.data instanceof Data);
    }

    @Test
    public void testCheckCollision01() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        simulator.setCharacterMove(0);
        simulator.checkCollision();
        assertTrue(simulator.direction == -1);
    }

    @Test
    public void testCheckCollision02() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        simulator.setCharacterMove(1);
        simulator.checkCollision();
        assertTrue(simulator.direction == -1);
    }

    @Test
    public void testCheckCollision03() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        simulator.setCharacterMove(2);
        simulator.checkCollision();
        assertTrue(simulator.direction == -1);
    }

    @Test
    public void testCheckCollision04() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        simulator.setCharacterMove(3);
        simulator.checkCollision();
        assertTrue(simulator.direction == -1);
    }

    @Test
    public void testCheckCollision05() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        simulator.setCharacterMove(6);
        simulator.checkCollision();
        assertTrue(simulator.direction == -1);
    }

    @Test
    public void testMoveLeft() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        double oldX = data.getCharacterPosition().getX();
        simulator.moveLeft();
        double newX = data.getCharacterPosition().getX();
        assertTrue(newX == oldX-1);
    }

    @Test
    public void testMoveRight() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        double oldX = data.getCharacterPosition().getX();
        simulator.moveRight();
        double newX = data.getCharacterPosition().getX();
        assertTrue(newX == oldX+1);
    }

    @Test
    public void testMoveUp() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        double oldY = data.getCharacterPosition().getY();
        simulator.moveUp();
        double newY = data.getCharacterPosition().getY();
        assertTrue(newY == oldY-1);
    }

    @Test
    public void testMoveDown() throws Exception {
        simulator.bindDataService(data);
        simulator.bindBrainHomeService(brainHome);
        simulator.bindBrainCharacterService(brainCharacter);
        simulator.init();
        double oldY = data.getCharacterPosition().getY();
        simulator.moveDown();
        double newY = data.getCharacterPosition().getY();
        assertTrue(newY == oldY+1);
    }

    @Test
    public void testGetPresence() throws Exception {
        simulator.bindDataService(data);
        data.getMainFloor(1);
        data.setCharacterPosition(150, 250);
        boolean presence = simulator.getPresence();
        assertTrue(presence);
    }

    @Test
    public void testSetObjectsOn() throws Exception {
        simulator.bindDataService(data);
        data.getMainFloor(1);
        data.setCharacterPosition(200,100);
        simulator.getPresence();
        simulator.setObjectsOn();
        assertTrue(data.getObjectsOn() != 0);
    }

    @Test
    public void testSetObjectsOnWithParameter() throws Exception {
        simulator.bindDataService(data);
        data.getMainFloor(1);
        data.setCharacterPosition(200,100);
        simulator.getPresence();
        simulator.setObjectsOn(1);
        assertTrue(data.getObjectsOn() != 0);
    }

    @Test
    public void testSetGoTo() throws Exception {
        Dimension dim = new Dimension(43,87);
        simulator.setGoTo(dim);
        assertTrue(simulator.dimToGoTo.equals(dim));
    }

    @Test
    public void testHasArrivedFalse() throws Exception {
        simulator.bindDataService(data);
        Dimension dim = new Dimension(43,87);
        simulator.setGoTo(dim);
        assertFalse(simulator.hasArrived());
    }

    @Test
    public void testHasArrivedTrue() throws Exception {
        simulator.bindDataService(data);
        Dimension dim = new Dimension(10,200);
        simulator.setGoTo(dim);
        assertTrue(simulator.hasArrived());
    }

    @Test
    public void testSetHasArrived() throws Exception {
        simulator.bindDataService(data);
        Dimension dim = new Dimension(10,200);
        simulator.setGoTo(dim);
        simulator.setHasArrived(true);
        assertTrue(simulator.hasArrived());
    }

    @Test
    public void testGoToDirige01() throws Exception {
        double oldX,oldY, newX, newY;
        simulator.bindDataService(data);
        oldX = data.getCharacterPosition().getX();
        oldY = data.getCharacterPosition().getY();
        simulator.setGoTo(new Dimension(48,100));
        simulator.goToDirige();
        newX = data.getCharacterPosition().getX();
        newY = data.getCharacterPosition().getY();
        assertTrue(oldX < newX && oldY > newY);
    }

    @Test
    public void testGoToDirige02() throws Exception {
        double oldX,oldY, newX, newY;
        simulator.bindDataService(data);
        oldX = data.getCharacterPosition().getX();
        oldY = data.getCharacterPosition().getY();
        simulator.setGoTo(new Dimension(6,250));
        simulator.goToDirige();
        newX = data.getCharacterPosition().getX();
        newY = data.getCharacterPosition().getY();
        assertTrue(oldX > newX && oldY < newY);
    }

    @Test
    public void testGoToDirige03() throws Exception {
        double oldX,oldY, newX, newY;
        simulator.bindDataService(data);
        oldX = data.getCharacterPosition().getX();
        oldY = data.getCharacterPosition().getY();
        simulator.setGoTo(new Dimension(250,300));
        simulator.goToDirige();
        newX = data.getCharacterPosition().getX();
        newY = data.getCharacterPosition().getY();
        assertTrue(oldX < newX && oldY < newY);
    }

    @Test
    public void testGoToDirige04() throws Exception {
        double oldX,oldY, newX, newY;
        simulator.bindDataService(data);
        oldX = data.getCharacterPosition().getX();
        oldY = data.getCharacterPosition().getY();
        simulator.setGoTo(new Dimension(10,100));
        simulator.goToDirige();
        newX = data.getCharacterPosition().getX();
        newY = data.getCharacterPosition().getY();
        assertTrue(oldX == newX && oldY > newY);
    }

    @Test
    public void testGoToDirige05() throws Exception {
        double oldX,oldY, newX, newY;
        simulator.bindDataService(data);
        oldX = data.getCharacterPosition().getX();
        oldY = data.getCharacterPosition().getY();
        simulator.setGoTo(new Dimension(48,200));
        simulator.goToDirige();
        newX = data.getCharacterPosition().getX();
        newY = data.getCharacterPosition().getY();
        assertTrue(oldX < newX && oldY == newY);
    }

    @Test
    public void testSetCharacterOrientation() throws Exception {
        simulator.bindDataService(data);
        simulator.setCharacterOrientation(45);
        assertTrue(data.getCharacterOrientation() == 45);
    }
}