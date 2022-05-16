package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.interfaces.*;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl sensor;
    TrainUser user;
    TrainController ctrl;

    @Before
    public void before() {
        ctrl = mock (TrainController.class);
        user = mock(TrainUser.class);
        sensor = new TrainSensorImpl(ctrl, user);
    }

    @Test
    public void ThisIsAnExampleTest() {
        sensor.overrideSpeedLimit(1);
        verify(ctrl, times(1)).setSpeedLimit(1);
    }
}
