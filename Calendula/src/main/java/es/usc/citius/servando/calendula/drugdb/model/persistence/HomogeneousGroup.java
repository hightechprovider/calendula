/*
 *    Calendula - An assistant for personal medication management.
 *    Copyright (C) 2016 CITIUS - USC
 *
 *    Calendula is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this software.  If not, see <http://www.gnu.org/licenses>.
 */

package es.usc.citius.servando.calendula.drugdb.model.persistence;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * This class was generated automatically.
 * Please check consistency and completion.
 * Replace {} with the appropriate classes and generate methods as needed.
 */
@DatabaseTable(tableName = "HomogeneousGroup")
public class HomogeneousGroup {

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_HOMOGENEOUS_GROUP_ID = "HomogeneousGroupID";
    public static final String COLUMN_NAME = "Name";

    /**
     * Autogenerated ID
     */
    @DatabaseField(columnName = COLUMN_ID, generatedId = true)
    private Long id;
    @DatabaseField(columnName = COLUMN_HOMOGENEOUS_GROUP_ID)
    private String homogeneousGroupID;
    @DatabaseField(columnName = COLUMN_NAME)
    private String name;

    /**
     * Empty constructor, required by ORMLite
     */
    public HomogeneousGroup() {
    }

    public HomogeneousGroup(String homogeneousGroupID, String name) {
        this.homogeneousGroupID = homogeneousGroupID;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomogeneousGroupID() {
        return homogeneousGroupID;
    }

    public void setHomogeneousGroupID(String homogeneousGroupID) {
        this.homogeneousGroupID = homogeneousGroupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
