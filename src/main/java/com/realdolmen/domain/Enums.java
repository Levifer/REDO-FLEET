package com.realdolmen.domain;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
public class Enums {

    public enum Roles {
        EMPLOYEE_APPROVED("employee.name"),
        FLEET_MANAGER("manager.name");

        private final String label;

        Roles(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Status {
        APPROVED("employee.Approved"),
        DISAPPROVED("employee.Disapproved");

        private final String label;

        Status(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

}
