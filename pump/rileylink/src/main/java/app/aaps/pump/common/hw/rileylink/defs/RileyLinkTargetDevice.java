package app.aaps.pump.common.hw.rileylink.defs;


import app.aaps.pump.common.hw.rileylink.R;

/**
 * Created by andy on 5/19/18.
 */

public enum RileyLinkTargetDevice {
    MedtronicPump(R.string.rileylink_target_device_medtronic, true), //
    Omnipod(R.string.rileylink_target_device_omnipod, false);

    private final int resourceId;
    private final boolean tuneUpEnabled;

    RileyLinkTargetDevice(int resourceId, boolean tuneUpEnabled) {
        this.resourceId = resourceId;
        this.tuneUpEnabled = tuneUpEnabled;
    }

    public boolean isTuneUpEnabled() {
        return tuneUpEnabled;
    }

    public int getResourceId() {
        return resourceId;
    }
}
