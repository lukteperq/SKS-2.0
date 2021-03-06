package no.hist.tdat.database.verktoy;

import no.hist.tdat.javabeans.Bruker;
import no.hist.tdat.javabeans.Oving;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Klassen BrukerKoordinerer tar i mot data fra databaser, slik at spørringer retunerer
 * objekter av typen Bruker.
 *
 * @author vimCnett
 */
public class OvingKoordinerer implements RowMapper<Oving>{
    /**
     * Denne metoden er en mal på hvordan Bruker objekter skal opprettes ved henting fra database.
     * @param resultSet settes av Spring, og er resultatet fra database-spørringen
     * @param rowNum sier hvor langt i resultsettet vi har kommet
     * @return et Bruker-objekt ut i fra datane i databasen.
     * @throws java.sql.SQLException exception blir tatt hånd om av rammeverket.
     */
    @Override
    public Oving mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        System.out.println("oppretter øving i ovingskoordinerer");
        Oving oving = new Oving();
        oving.setOvingnr(resultSet.getInt("oving_nr"));
        if(resultSet.getInt("godkjent")>0) {
            oving.setGodkjent( resultSet.getInt("godkjent")>0 ? true:false);
            oving.setGodkjentAv(resultSet.getString("godkjent_av"));
            oving.setGodkjentTid(resultSet.getDate("godkjent_tid"));
        }
        return oving;
    }
}
