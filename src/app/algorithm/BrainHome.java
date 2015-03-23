package app.algorithm;

import app.services.BrainHomeService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;

/**
 * Created by Nicolas on 21/03/2015.
 */
public class BrainHome implements BrainHomeService, RequireSimulatorService {
    private SimulatorService simulator;

    @Override
    public void activation() {
        simulator.getObjectsDoors(0);
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
