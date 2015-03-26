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
package app.data.object;

import app.common.ParamFirstFloor;
import app.common.ParamHome;
import app.data.Dimension;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 04/03/15.
 */
public class Radiator extends ObjectHome {
    private Rectangle radiator;
    private Rectangle radiatorMini;

    private Dimension dimRadiator;
    private Dimension dimRadiatorMini;

    public Radiator() {
    }

    @Override
    public Group getGroup() {
        if (this.state) {
            radiator.setFill(Color.RED);
            radiatorMini.setFill(Color.RED);
        } else {
            radiator.setFill(Color.WHITE);
            radiatorMini.setFill(Color.WHITE);
        }
        return this.group;
    }

    @Override
    public Group getGroupMini() {
        if (this.state) {
            radiatorMini.setFill(Color.RED);
        } else {
            radiatorMini.setFill(Color.WHITE);
        }
        return this.groupMini;
    }

    public void setGroup(Dimension dimension, Dimension dimensionMini, boolean stateRadiator, int orientation) {
        super.state = stateRadiator;
        this.dimRadiator = dimension;
        this.dimRadiatorMini = dimensionMini;
        if (orientation == ParamHome.RADIATOR_LANDSCAPE) {
            this.radiator = new Rectangle(dimension.getX(), dimension.getY(), ParamHome.RADIATOR_LANDSCAPE_WIDTH, ParamHome.RADIATOR_LANDSCAPE_HEIGHT);
            this.radiatorMini = new Rectangle(dimensionMini.getX(), dimensionMini.getY(), ParamHome.RADIATOR_MINI_LANDSCAPE_WIDTH, ParamHome.RADIATOR_MINI_LANDSCAPE_HEIGHT);
        } else {
            this.radiator = new Rectangle(dimension.getX(), dimension.getY(), ParamHome.RADIATOR_PORTRAIT_WIDTH, ParamHome.RADIATOR_PORTRAIT_HEIGHT);
            this.radiatorMini = new Rectangle(dimensionMini.getX(), dimensionMini.getY(), ParamHome.RADIATOR_MINI_PORTRAIT_WIDTH, ParamHome.RADIATOR_MINI_PORTRAIT_HEIGHT);
        }
        if (!stateRadiator) {
            radiator.setFill(Color.WHITE);
            radiator.setStroke(Color.RED);
            radiatorMini.setFill(Color.WHITE);
            radiatorMini.setStroke(Color.RED);

        } else {
            radiator.setFill(Color.RED);
            radiator.setStroke(Color.RED);
            radiatorMini.setFill(Color.RED);
            radiatorMini.setStroke(Color.RED);
        }
        super.group.getChildren().add(radiator);
        super.groupMini.getChildren().add(radiatorMini);
    }

    public Group getRadiator() {
        return super.group;
    }

    public Group getRadiatorMini() {
        return super.groupMini;
    }

}
