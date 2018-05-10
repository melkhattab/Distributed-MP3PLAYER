// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `Lecteurmp3.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Lecteurmp3;

public interface Manager extends com.zeroc.Ice.Object
{
    boolean ajouterMorceau(String titre, String genre, String auteur, String adresse, com.zeroc.Ice.Current current);

    Morceau[] rechMorceauxParArtiste(String artiste, com.zeroc.Ice.Current current);

    Morceau[] rechMorceauxParGenre(String genre, com.zeroc.Ice.Current current);

    boolean rechMorceauParTitre(String titre, com.zeroc.Ice.Current current);

    boolean rechMorceauParLocation(String location, com.zeroc.Ice.Current current);

    int supprimerMorceauxParArtiste(String artiste, com.zeroc.Ice.Current current);

    int supprimerMorceauxParGenre(String genre, com.zeroc.Ice.Current current);

    boolean supprimerMorceauParTitre(String titre, com.zeroc.Ice.Current current);

    boolean supprimerMorceauParLocation(String location, com.zeroc.Ice.Current current);

    int[] streamSound(String soundName, int duration, com.zeroc.Ice.Current current);

    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::Lecteurmp3::Manager"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::Lecteurmp3::Manager";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_ajouterMorceau(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_titre;
        String iceP_genre;
        String iceP_auteur;
        String iceP_adresse;
        iceP_titre = istr.readString();
        iceP_genre = istr.readString();
        iceP_auteur = istr.readString();
        iceP_adresse = istr.readString();
        inS.endReadParams();
        boolean ret = obj.ajouterMorceau(iceP_titre, iceP_genre, iceP_auteur, iceP_adresse, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_rechMorceauxParArtiste(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_artiste;
        iceP_artiste = istr.readString();
        inS.endReadParams();
        Morceau[] ret = obj.rechMorceauxParArtiste(iceP_artiste, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        listMorceauxHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_rechMorceauxParGenre(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_genre;
        iceP_genre = istr.readString();
        inS.endReadParams();
        Morceau[] ret = obj.rechMorceauxParGenre(iceP_genre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        listMorceauxHelper.write(ostr, ret);
        ostr.writePendingValues();
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_rechMorceauParTitre(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_titre;
        iceP_titre = istr.readString();
        inS.endReadParams();
        boolean ret = obj.rechMorceauParTitre(iceP_titre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_rechMorceauParLocation(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_location;
        iceP_location = istr.readString();
        inS.endReadParams();
        boolean ret = obj.rechMorceauParLocation(iceP_location, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_supprimerMorceauxParArtiste(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_artiste;
        iceP_artiste = istr.readString();
        inS.endReadParams();
        int ret = obj.supprimerMorceauxParArtiste(iceP_artiste, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_supprimerMorceauxParGenre(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_genre;
        iceP_genre = istr.readString();
        inS.endReadParams();
        int ret = obj.supprimerMorceauxParGenre(iceP_genre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_supprimerMorceauParTitre(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_titre;
        iceP_titre = istr.readString();
        inS.endReadParams();
        boolean ret = obj.supprimerMorceauParTitre(iceP_titre, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_supprimerMorceauParLocation(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_location;
        iceP_location = istr.readString();
        inS.endReadParams();
        boolean ret = obj.supprimerMorceauParLocation(iceP_location, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_streamSound(Manager obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_soundName;
        int iceP_duration;
        iceP_soundName = istr.readString();
        iceP_duration = istr.readInt();
        inS.endReadParams();
        int[] ret = obj.streamSound(iceP_soundName, iceP_duration, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeIntSeq(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    final static String[] _iceOps =
    {
        "ajouterMorceau",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "rechMorceauParLocation",
        "rechMorceauParTitre",
        "rechMorceauxParArtiste",
        "rechMorceauxParGenre",
        "streamSound",
        "supprimerMorceauParLocation",
        "supprimerMorceauParTitre",
        "supprimerMorceauxParArtiste",
        "supprimerMorceauxParGenre"
    };

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_ajouterMorceau(this, in, current);
            }
            case 1:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 5:
            {
                return _iceD_rechMorceauParLocation(this, in, current);
            }
            case 6:
            {
                return _iceD_rechMorceauParTitre(this, in, current);
            }
            case 7:
            {
                return _iceD_rechMorceauxParArtiste(this, in, current);
            }
            case 8:
            {
                return _iceD_rechMorceauxParGenre(this, in, current);
            }
            case 9:
            {
                return _iceD_streamSound(this, in, current);
            }
            case 10:
            {
                return _iceD_supprimerMorceauParLocation(this, in, current);
            }
            case 11:
            {
                return _iceD_supprimerMorceauParTitre(this, in, current);
            }
            case 12:
            {
                return _iceD_supprimerMorceauxParArtiste(this, in, current);
            }
            case 13:
            {
                return _iceD_supprimerMorceauxParGenre(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}
