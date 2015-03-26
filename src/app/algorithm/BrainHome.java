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

/**
 * Created by Nicolas on 21/03/2015.
 */
public class BrainHome implements /*BrainHomeService*/BrainService, RequireSimulatorService {
    private SimulatorService simulator;

    @Override
    public void activation() {
    }

    @Override
    public void step() {
        if (simulator.getPresence()) {
            simulator.setObjectsOn();
        }
//        simulator.setObjectsOn(0);
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}
