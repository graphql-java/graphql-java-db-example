/*
 * This file is generated by jOOQ.
*/
package com.graphql.example.db.data;


import com.graphql.example.db.data.tables.Albums;
import com.graphql.example.db.data.tables.Artists;
import com.graphql.example.db.data.tables.Customers;
import com.graphql.example.db.data.tables.Employees;
import com.graphql.example.db.data.tables.Genres;
import com.graphql.example.db.data.tables.InvoiceItems;
import com.graphql.example.db.data.tables.Invoices;
import com.graphql.example.db.data.tables.MediaTypes;
import com.graphql.example.db.data.tables.PlaylistTrack;
import com.graphql.example.db.data.tables.Playlists;
import com.graphql.example.db.data.tables.Tracks;
import com.graphql.example.db.data.tables.records.AlbumsRecord;
import com.graphql.example.db.data.tables.records.ArtistsRecord;
import com.graphql.example.db.data.tables.records.CustomersRecord;
import com.graphql.example.db.data.tables.records.EmployeesRecord;
import com.graphql.example.db.data.tables.records.GenresRecord;
import com.graphql.example.db.data.tables.records.InvoiceItemsRecord;
import com.graphql.example.db.data.tables.records.InvoicesRecord;
import com.graphql.example.db.data.tables.records.MediaTypesRecord;
import com.graphql.example.db.data.tables.records.PlaylistTrackRecord;
import com.graphql.example.db.data.tables.records.PlaylistsRecord;
import com.graphql.example.db.data.tables.records.TracksRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AlbumsRecord, Integer> IDENTITY_ALBUMS = Identities0.IDENTITY_ALBUMS;
    public static final Identity<ArtistsRecord, Integer> IDENTITY_ARTISTS = Identities0.IDENTITY_ARTISTS;
    public static final Identity<CustomersRecord, Integer> IDENTITY_CUSTOMERS = Identities0.IDENTITY_CUSTOMERS;
    public static final Identity<EmployeesRecord, Integer> IDENTITY_EMPLOYEES = Identities0.IDENTITY_EMPLOYEES;
    public static final Identity<GenresRecord, Integer> IDENTITY_GENRES = Identities0.IDENTITY_GENRES;
    public static final Identity<InvoiceItemsRecord, Integer> IDENTITY_INVOICE_ITEMS = Identities0.IDENTITY_INVOICE_ITEMS;
    public static final Identity<InvoicesRecord, Integer> IDENTITY_INVOICES = Identities0.IDENTITY_INVOICES;
    public static final Identity<MediaTypesRecord, Integer> IDENTITY_MEDIA_TYPES = Identities0.IDENTITY_MEDIA_TYPES;
    public static final Identity<PlaylistsRecord, Integer> IDENTITY_PLAYLISTS = Identities0.IDENTITY_PLAYLISTS;
    public static final Identity<TracksRecord, Integer> IDENTITY_TRACKS = Identities0.IDENTITY_TRACKS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AlbumsRecord> PK_ALBUMS = UniqueKeys0.PK_ALBUMS;
    public static final UniqueKey<ArtistsRecord> PK_ARTISTS = UniqueKeys0.PK_ARTISTS;
    public static final UniqueKey<CustomersRecord> PK_CUSTOMERS = UniqueKeys0.PK_CUSTOMERS;
    public static final UniqueKey<EmployeesRecord> PK_EMPLOYEES = UniqueKeys0.PK_EMPLOYEES;
    public static final UniqueKey<GenresRecord> PK_GENRES = UniqueKeys0.PK_GENRES;
    public static final UniqueKey<InvoiceItemsRecord> PK_INVOICE_ITEMS = UniqueKeys0.PK_INVOICE_ITEMS;
    public static final UniqueKey<InvoicesRecord> PK_INVOICES = UniqueKeys0.PK_INVOICES;
    public static final UniqueKey<MediaTypesRecord> PK_MEDIA_TYPES = UniqueKeys0.PK_MEDIA_TYPES;
    public static final UniqueKey<PlaylistTrackRecord> PK_PLAYLIST_TRACK = UniqueKeys0.PK_PLAYLIST_TRACK;
    public static final UniqueKey<PlaylistsRecord> PK_PLAYLISTS = UniqueKeys0.PK_PLAYLISTS;
    public static final UniqueKey<TracksRecord> PK_TRACKS = UniqueKeys0.PK_TRACKS;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AlbumsRecord, ArtistsRecord> FK_ALBUMS_ARTISTS_1 = ForeignKeys0.FK_ALBUMS_ARTISTS_1;
    public static final ForeignKey<CustomersRecord, EmployeesRecord> FK_CUSTOMERS_EMPLOYEES_1 = ForeignKeys0.FK_CUSTOMERS_EMPLOYEES_1;
    public static final ForeignKey<EmployeesRecord, EmployeesRecord> FK_EMPLOYEES_EMPLOYEES_1 = ForeignKeys0.FK_EMPLOYEES_EMPLOYEES_1;
    public static final ForeignKey<InvoiceItemsRecord, InvoicesRecord> FK_INVOICE_ITEMS_INVOICES_1 = ForeignKeys0.FK_INVOICE_ITEMS_INVOICES_1;
    public static final ForeignKey<InvoiceItemsRecord, TracksRecord> FK_INVOICE_ITEMS_TRACKS_1 = ForeignKeys0.FK_INVOICE_ITEMS_TRACKS_1;
    public static final ForeignKey<InvoicesRecord, CustomersRecord> FK_INVOICES_CUSTOMERS_1 = ForeignKeys0.FK_INVOICES_CUSTOMERS_1;
    public static final ForeignKey<PlaylistTrackRecord, PlaylistsRecord> FK_PLAYLIST_TRACK_PLAYLISTS_1 = ForeignKeys0.FK_PLAYLIST_TRACK_PLAYLISTS_1;
    public static final ForeignKey<PlaylistTrackRecord, TracksRecord> FK_PLAYLIST_TRACK_TRACKS_1 = ForeignKeys0.FK_PLAYLIST_TRACK_TRACKS_1;
    public static final ForeignKey<TracksRecord, AlbumsRecord> FK_TRACKS_ALBUMS_1 = ForeignKeys0.FK_TRACKS_ALBUMS_1;
    public static final ForeignKey<TracksRecord, MediaTypesRecord> FK_TRACKS_MEDIA_TYPES_1 = ForeignKeys0.FK_TRACKS_MEDIA_TYPES_1;
    public static final ForeignKey<TracksRecord, GenresRecord> FK_TRACKS_GENRES_1 = ForeignKeys0.FK_TRACKS_GENRES_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AlbumsRecord, Integer> IDENTITY_ALBUMS = createIdentity(Albums.ALBUMS, Albums.ALBUMS.ALBUMID);
        public static Identity<ArtistsRecord, Integer> IDENTITY_ARTISTS = createIdentity(Artists.ARTISTS, Artists.ARTISTS.ARTISTID);
        public static Identity<CustomersRecord, Integer> IDENTITY_CUSTOMERS = createIdentity(Customers.CUSTOMERS, Customers.CUSTOMERS.CUSTOMERID);
        public static Identity<EmployeesRecord, Integer> IDENTITY_EMPLOYEES = createIdentity(Employees.EMPLOYEES, Employees.EMPLOYEES.EMPLOYEEID);
        public static Identity<GenresRecord, Integer> IDENTITY_GENRES = createIdentity(Genres.GENRES, Genres.GENRES.GENREID);
        public static Identity<InvoiceItemsRecord, Integer> IDENTITY_INVOICE_ITEMS = createIdentity(InvoiceItems.INVOICE_ITEMS, InvoiceItems.INVOICE_ITEMS.INVOICELINEID);
        public static Identity<InvoicesRecord, Integer> IDENTITY_INVOICES = createIdentity(Invoices.INVOICES, Invoices.INVOICES.INVOICEID);
        public static Identity<MediaTypesRecord, Integer> IDENTITY_MEDIA_TYPES = createIdentity(MediaTypes.MEDIA_TYPES, MediaTypes.MEDIA_TYPES.MEDIATYPEID);
        public static Identity<PlaylistsRecord, Integer> IDENTITY_PLAYLISTS = createIdentity(Playlists.PLAYLISTS, Playlists.PLAYLISTS.PLAYLISTID);
        public static Identity<TracksRecord, Integer> IDENTITY_TRACKS = createIdentity(Tracks.TRACKS, Tracks.TRACKS.TRACKID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AlbumsRecord> PK_ALBUMS = createUniqueKey(Albums.ALBUMS, "pk_albums", Albums.ALBUMS.ALBUMID);
        public static final UniqueKey<ArtistsRecord> PK_ARTISTS = createUniqueKey(Artists.ARTISTS, "pk_artists", Artists.ARTISTS.ARTISTID);
        public static final UniqueKey<CustomersRecord> PK_CUSTOMERS = createUniqueKey(Customers.CUSTOMERS, "pk_customers", Customers.CUSTOMERS.CUSTOMERID);
        public static final UniqueKey<EmployeesRecord> PK_EMPLOYEES = createUniqueKey(Employees.EMPLOYEES, "pk_employees", Employees.EMPLOYEES.EMPLOYEEID);
        public static final UniqueKey<GenresRecord> PK_GENRES = createUniqueKey(Genres.GENRES, "pk_genres", Genres.GENRES.GENREID);
        public static final UniqueKey<InvoiceItemsRecord> PK_INVOICE_ITEMS = createUniqueKey(InvoiceItems.INVOICE_ITEMS, "pk_invoice_items", InvoiceItems.INVOICE_ITEMS.INVOICELINEID);
        public static final UniqueKey<InvoicesRecord> PK_INVOICES = createUniqueKey(Invoices.INVOICES, "pk_invoices", Invoices.INVOICES.INVOICEID);
        public static final UniqueKey<MediaTypesRecord> PK_MEDIA_TYPES = createUniqueKey(MediaTypes.MEDIA_TYPES, "pk_media_types", MediaTypes.MEDIA_TYPES.MEDIATYPEID);
        public static final UniqueKey<PlaylistTrackRecord> PK_PLAYLIST_TRACK = createUniqueKey(PlaylistTrack.PLAYLIST_TRACK, "pk_playlist_track", PlaylistTrack.PLAYLIST_TRACK.PLAYLISTID, PlaylistTrack.PLAYLIST_TRACK.TRACKID);
        public static final UniqueKey<PlaylistsRecord> PK_PLAYLISTS = createUniqueKey(Playlists.PLAYLISTS, "pk_playlists", Playlists.PLAYLISTS.PLAYLISTID);
        public static final UniqueKey<TracksRecord> PK_TRACKS = createUniqueKey(Tracks.TRACKS, "pk_tracks", Tracks.TRACKS.TRACKID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AlbumsRecord, ArtistsRecord> FK_ALBUMS_ARTISTS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_ARTISTS, Albums.ALBUMS, "fk_albums_artists_1", Albums.ALBUMS.ARTISTID);
        public static final ForeignKey<CustomersRecord, EmployeesRecord> FK_CUSTOMERS_EMPLOYEES_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_EMPLOYEES, Customers.CUSTOMERS, "fk_customers_employees_1", Customers.CUSTOMERS.SUPPORTREPID);
        public static final ForeignKey<EmployeesRecord, EmployeesRecord> FK_EMPLOYEES_EMPLOYEES_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_EMPLOYEES, Employees.EMPLOYEES, "fk_employees_employees_1", Employees.EMPLOYEES.REPORTSTO);
        public static final ForeignKey<InvoiceItemsRecord, InvoicesRecord> FK_INVOICE_ITEMS_INVOICES_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_INVOICES, InvoiceItems.INVOICE_ITEMS, "fk_invoice_items_invoices_1", InvoiceItems.INVOICE_ITEMS.INVOICEID);
        public static final ForeignKey<InvoiceItemsRecord, TracksRecord> FK_INVOICE_ITEMS_TRACKS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_TRACKS, InvoiceItems.INVOICE_ITEMS, "fk_invoice_items_tracks_1", InvoiceItems.INVOICE_ITEMS.TRACKID);
        public static final ForeignKey<InvoicesRecord, CustomersRecord> FK_INVOICES_CUSTOMERS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_CUSTOMERS, Invoices.INVOICES, "fk_invoices_customers_1", Invoices.INVOICES.CUSTOMERID);
        public static final ForeignKey<PlaylistTrackRecord, PlaylistsRecord> FK_PLAYLIST_TRACK_PLAYLISTS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_PLAYLISTS, PlaylistTrack.PLAYLIST_TRACK, "fk_playlist_track_playlists_1", PlaylistTrack.PLAYLIST_TRACK.PLAYLISTID);
        public static final ForeignKey<PlaylistTrackRecord, TracksRecord> FK_PLAYLIST_TRACK_TRACKS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_TRACKS, PlaylistTrack.PLAYLIST_TRACK, "fk_playlist_track_tracks_1", PlaylistTrack.PLAYLIST_TRACK.TRACKID);
        public static final ForeignKey<TracksRecord, AlbumsRecord> FK_TRACKS_ALBUMS_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_ALBUMS, Tracks.TRACKS, "fk_tracks_albums_1", Tracks.TRACKS.ALBUMID);
        public static final ForeignKey<TracksRecord, MediaTypesRecord> FK_TRACKS_MEDIA_TYPES_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_MEDIA_TYPES, Tracks.TRACKS, "fk_tracks_media_types_1", Tracks.TRACKS.MEDIATYPEID);
        public static final ForeignKey<TracksRecord, GenresRecord> FK_TRACKS_GENRES_1 = createForeignKey(com.graphql.example.db.data.Keys.PK_GENRES, Tracks.TRACKS, "fk_tracks_genres_1", Tracks.TRACKS.GENREID);
    }
}
