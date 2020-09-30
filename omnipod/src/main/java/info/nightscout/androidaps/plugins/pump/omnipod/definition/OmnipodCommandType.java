package info.nightscout.androidaps.plugins.pump.omnipod.definition;

import info.nightscout.androidaps.plugins.pump.omnipod.R;

/**
 * Created by andy on 4.8.2019
 */
public enum OmnipodCommandType {
    ACTIVATE_POD(R.string.omnipod_cmd_activate_pod), // First step of Pod change
    INSERT_CANNULA(R.string.omnipod_cmd_insert_cannula), // Second step of Pod change
    DEACTIVATE_POD(R.string.omnipod_cmd_deactivate_pod), //
    SET_BASAL_PROFILE(R.string.omnipod_cmd_set_basal_schedule), //
    SET_BOLUS(R.string.omnipod_cmd_set_bolus), //
    CANCEL_BOLUS(R.string.omnipod_cmd_cancel_bolus), //
    SET_TEMPORARY_BASAL(R.string.omnipod_cmd_set_tbr), //
    CANCEL_TEMPORARY_BASAL(R.string.omnipod_cmd_cancel_tbr_by_driver), //
    DISCARD_POD(R.string.omnipod_cmd_discard_pod), //
    GET_POD_STATUS(R.string.omnipod_cmd_get_pod_status), //
    SET_TIME(R.string.omnipod_cmd_set_time), //
    CONFIGURE_ALERTS(R.string.omnipod_cmd_configure_alerts), //
    ACKNOWLEDGE_ALERTS(R.string.omnipod_cmd_acknowledge_alerts), //
    READ_POD_PULSE_LOG(R.string.omnipod_cmd_read_pulse_log), //
    SUSPEND_DELIVERY(R.string.omnipod_cmd_suspend_delivery),
    RESUME_DELIVERY(R.string.omnipod_cmd_resume_delivery);

    private int resourceId;

    OmnipodCommandType(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }
}
