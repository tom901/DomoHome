/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: engine/Engine.java 2015-03-11 buixuan.
 * Modified 2015/03/26 by :
 * - nicolas.didier.fd@gmail.com
 * - leslie.cha@hotmail.fr
 * - thomas.paraison@me.com
 * ******************************************************/

package app.algorithm;

import app.services.BrainService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;

import java.util.Random;

/**
 * Created by Nicolas on 17/03/2015.
 */
public class BrainCharacter implements BrainService, RequireSimulatorService {

    private SimulatorService simulator;
    private Random randomMove;
    private int compteur;

    public BrainCharacter() {
        //simulator = new Simulator();
        randomMove = new Random();
    }

    @Override
    public void activation() {
        compteur = 0;
    }

    @Override
    public void step() {
//        simulator.setRoomCharacterIsIn();
        compteur++;
        // Si le paramètre de setCharacterMove est 0 : gauche, 1 : droite, 2 : haut, 3 : bas
        if (compteur < 150) {
            switch (randomMove.nextInt(4)) {
                case 0: // Move left
//                    simulator.setCharacterMove(0);
                    simulator.setCharacterMove(3);
                    break;
                case 1: // Move right
                    simulator.setCharacterMove(1);
                    break;
                case 2: // Move up
//                    simulator.setCharacterMove(2);
                    simulator.setCharacterMove(3);
                    break;
                case 3: // Move bottom
                    simulator.setCharacterMove(3);
                    break;
            }
        } else if (compteur > 149 && compteur < 700) {
            switch (randomMove.nextInt(4)) {
                case 0: // Move left
                    if (compteur % 2 == 0) {
                        simulator.setCharacterMove(2);
                    } else {
                        simulator.setCharacterMove(3);
                    }
                    break;
                case 1: // Move right
                    simulator.setCharacterMove(1);
                    break;
                case 2: // Move up
                    simulator.setCharacterMove(1);
                    break;
                case 3: // Move bottom
                    simulator.setCharacterMove(1);
                    break;
            }
        } else if (compteur > 699 && compteur < 1000) {
            switch (randomMove.nextInt(4)) {
                case 0: // Move left
                    if (compteur % 2 == 0) {
                        simulator.setCharacterMove(0);
                    } else {
                        simulator.setCharacterMove(1);
                    }
                    break;
                case 1: // Move right
                    simulator.setCharacterMove(2);
                    break;
                case 2: // Move up
                    simulator.setCharacterMove(2);
                    break;
                case 3: // Move bottom
                    simulator.setCharacterMove(2);
                    break;
            }
        } else if (compteur > 999 && compteur < 1500) {
            switch (randomMove.nextInt(4)) {
                case 0: // Move left
                    if (compteur % 2 == 0) {
                        simulator.setCharacterMove(2);
                    } else {
                        simulator.setCharacterMove(3);
                    }
                    break;
                case 1: // Move right
                    simulator.setCharacterMove(0);
                    break;
                case 2: // Move up
                    simulator.setCharacterMove(0);
                    break;
                case 3: // Move bottom
                    simulator.setCharacterMove(0);
                    break;
            }
        } else if (compteur > 1499 && compteur < 1800) {
            switch (randomMove.nextInt(4)) {
                case 0: // Move left
                    if (compteur % 2 == 0) {
                        simulator.setCharacterMove(0);
                    } else {
                        simulator.setCharacterMove(1);
                    }
                    break;
                case 1: // Move right
                    simulator.setCharacterMove(3);
                    break;
                case 2: // Move up
                    simulator.setCharacterMove(3);
                    break;
                case 3: // Move bottom
                    simulator.setCharacterMove(3);
                    break;
            }
            if (compteur == 1799) {
                compteur = 150;
            }
        }
//        System.out.println("Compteur : " + compteur);
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}
