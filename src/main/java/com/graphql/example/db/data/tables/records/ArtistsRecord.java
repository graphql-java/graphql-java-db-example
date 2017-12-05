/*
 * This file is generated by jOOQ.
*/
package com.graphql.example.db.data.tables.records;


import com.graphql.example.db.data.tables.Artists;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArtistsRecord extends UpdatableRecordImpl<ArtistsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 2083648366;

    /**
     * Setter for <code>artists.ArtistId</code>.
     */
    public void setArtistid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>artists.ArtistId</code>.
     */
    public Integer getArtistid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>artists.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>artists.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Artists.ARTISTS.ARTISTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Artists.ARTISTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getArtistid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getArtistid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtistsRecord value1(Integer value) {
        setArtistid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtistsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtistsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArtistsRecord
     */
    public ArtistsRecord() {
        super(Artists.ARTISTS);
    }

    /**
     * Create a detached, initialised ArtistsRecord
     */
    public ArtistsRecord(Integer artistid, String name) {
        super(Artists.ARTISTS);

        set(0, artistid);
        set(1, name);
    }
}