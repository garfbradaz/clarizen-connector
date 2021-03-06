/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model.flat;

import com.clarizen.api.EntityId;

public class UserGroupFlat extends ClarizenEntityCustomFieldsFlat {
    
        private String description;
        private Integer subGroupsCount;
        private Double availability;
        private Integer stopwatchesCount;
        private EntityId entityType;
        private Boolean organizationUnit;
        private EntityId directManager;
        private EntityId timeZone;
        private EntityId language;

        public String getDescription() {
            return description;
        }
        public Integer getSubGroupsCount() {
            return subGroupsCount;
        }
        public Double getAvailability() {
            return availability;
        }
        public Integer getStopwatchesCount() {
            return stopwatchesCount;
        }
        public EntityId getEntityType() {
            return entityType;
        }
        public Boolean getOrganizationUnit() {
            return organizationUnit;
        }
        public EntityId getDirectManager() {
            return directManager;
        }
        public EntityId getTimeZone() {
            return timeZone;
        }
        public EntityId getLanguage() {
            return language;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public void setSubGroupsCount(Integer subGroupsCount) {
            this.subGroupsCount = subGroupsCount;
        }
        public void setAvailability(Double availability) {
            this.availability = availability;
        }
        public void setStopwatchesCount(Integer stopwatchesCount) {
            this.stopwatchesCount = stopwatchesCount;
        }
        public void setEntityType(EntityId entityType) {
            this.entityType = entityType;
        }
        public void setOrganizationUnit(Boolean organizationUnit) {
            this.organizationUnit = organizationUnit;
        }
        public void setDirectManager(EntityId directManager) {
            this.directManager = directManager;
        }
        public void setTimeZone(EntityId timeZone) {
            this.timeZone = timeZone;
        }
        public void setLanguage(EntityId language) {
            this.language = language;
        }
}
