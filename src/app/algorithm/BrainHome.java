package app.algorithm;

import app.services.BrainService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;

/**
 * Created by Nicolas on 21/03/2015.
 */
public class BrainHome implements BrainService, RequireSimulatorService {
    private SimulatorService simulator;

    @Override
    public void activation() {

    }

    @Override
    public void step() {
//        if (simulator.getDetect())
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}
