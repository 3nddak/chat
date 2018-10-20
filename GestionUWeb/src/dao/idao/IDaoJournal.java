package dao.idao;

import java.sql.ResultSet;

public interface IDaoJournal extends IDao{
	public int insertJournal();
	public int suppMouvement(String idmouv);
	public int suppEcriture(String idjournal);
	public int insertJournalCode(String idcodejournal);
	public int insertJournal(String numcpte,String iduser,String liboperation,int solde,char sens,String date,int idoperation,String ref,int idmouv,String budget);
	public int insertJournal(String numcpte,String iduser,String liboperation,int solde,char sens,String date,int idoperation,String ref,int idmouv,String budget,int valide);
	public int insertJournal(String numcpte,String iduser,String liboperation,int solde,char sens,String date,int idoperation,String ref,int idmouv,String budget,int valide,String centreCout);
	public int insertJournal(String numcpte,String iduser,String liboperation,int solde,char sens,String date,int idoperation,String ref,int idmouv,String budget,int valide,String centre,String dateval);
	public int insertJournal(String numcpte,String iduser,String liboperation,double solde,char sens,String date,int idoperation,String ref,int idmouv,String budget,int valide,String centre,String dateval);
	public int insertJournal(String numcpte,String iduser,String liboperation,double solde,String sens,String date,int idoperation,String ref,int idmouv,String budget,int valide,String centre,String dateval);
	public int insertJournalCodeReport(String idcodejournal,int montantReport,String numerocpte,char sens);
	public int insertMouvement(String date,String cleinsert,String reference,String datevaleur);
	public int insertMouvement(String date,String cleinsert,String reference,String datevaleur,int idexo);
	public int insertlotComptable(String reference,String datelot);
	public int insertlotComptableAgence(String reference,String datelot,String idagencelot);
	public int insertGrilleAgence(String iduser,String idperiode,String typegrille,String libellegrille,String datedebut,String idagence,String datefin);
	public int insertVirementmultiple(String iduser,String numcompte,String libvir,String numvirmult,String datevirmult,double montant,String idagenceUser);
	public int insertHistoModele(String idgrille,String dateoperation,String etatmodele,String dateprel);
	public int insertGrilleEcritureAgence(String idgrille,String numcompte,String libgrilleecri,String sens,double montant,String idagence,String codebudget);
	public int insertMouvementValide(String date,String cleinsert,String reference,String datevaleur,int idoperation,String centreCout,String valide);
	public int insertMouvementVirMult(String date,String cleinsert,String reference,String datevaleur,int idoperation,String centreCout,String valide,String virmult);
	public int insertionMouvementValide(String date,String cleinsert,String reference,String datevaleur,int idoperation,String centreCout,String valide);
	public int insertMouvement(String date,String cleinsert,String reference,String datevaleur,String centre);
	public int modifMouvement(String code,int id);
	public int insertMouvementValide(String date,String cleinsert,String reference,String valide);
	public String insertionMouvementValideB(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur,String centre,int seqbordereau);
	public String insertionMouvementValide(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur, String centre, int idop);
	public String updateMouvementValide(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur, String centre, int idop);
	public String insertMouvValide(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur,String centre,String codejournal,int idop);
	public String updateMouvValide(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur,String centre,String codejournal,int idop);
	public int insertMouvementValideB(String date,String cleinsert,String reference,String valide,String datevaleur,String centre);
	public int modifierEcriture(String id,String libelle,String valeur,String date,char sens,String reference,String codebudget,String codejournal);
	public int modifEcriture(String id,int idmouv,String numcompte,String libelle,int solde,String sens,String date,String ref,String budget,String centrecout);
	public int modifEcritureBis(String id,int idmouv,String numcompte,String libelle,double solde,String sens,String date,String ref,String budget,String centrecout);
	public int modifEcriture(String id,String numcompte,String libelle,int solde);
	public int ValidMouvement(String id,String valide);
	public int ValidLettrage(String id);
	public int ValidEcriture(String id,String valide);
	public int UpdateDateValeur(String id,String datevaleur);
	public int UpdateCodeLettrageO(String id);
	public double selectLettrageId(String id);
	public String selectSensLettrageId(String id);
	public String selectRefLettrageId(String id);
	public int verifEcriture(int idmouv,int montant);
	public int verifEcriture(int idmouv);
	public int SoldeMouvement(int idmouv);
	public int historiserJournal(String numcpte,String iduser,String liboperation,double solde,String sens,String date,int idoperation,String ref,int idmouv,String budget,int valide,String centre,String dateval,String idUserSupp,String dateSupp);
	public String historiserMouvement(int idMouv,String date,String cleinsert,String reference,String valide,String datevaleur,String centre,String codejournal,int idop, String idexo, String idlotmouvement,String idUserSupp,String dateSupp);
	public int updateOperationMouv(int idmouv,int idop);
	public int updateLotValide(String id,String valide);
	public int updateVirmultiple(String id,String valide);
	public int updateGrilleActive(String id,String valide);
	public int updateGrillesaisie(String id,double montant,String libelle);
	public void cloturelot(String idlot,String datejour,int agencetravail);
	public void clotureVirmult(String idvirmult,String datejour,String idUser,String idagence,int agencetravail);
	public void comptatlotCompteClient(String numcpte,double montant,String datejour);
	public void activergrille(String grilleid,String datejour,String iduser,int agencetravail);
	public void activerModele(String grilleid,String datejour,String iduser,String etatmodele,String dateoper,int agencetravail);
	public ResultSet ligneReference(String ref);
	public ResultSet journalParCompte(String numcompte, String date1, String date2);
	public double SommeEcritureCompte(String numcompte, String date1, String date2, String sens);
	public double SommeEcritureComptePrec(String numcompte, String date1, String sens);
	public String AjoutMoisDateEN(String date1,int nbmois);
	public int NbJourDifferenceEN(String date1,String date2);
	public ResultSet journalDatValCompte(String numCpte, String date1, String date2);
	public String maxDateDav(String numCpte, String date1);
	public int histoSoldeDavid(String numCpte, String date1);
	public double SoldeDav(String numCpte, String date1);
	public double SoldeDat(String numCpte, String date1);
	public double SoldeDatValDav(String numCpte, String date1, double solde);
	public double SoldeDatValDat(String numCpte, String date1, double solde);
	public double SoldeDebValDav(String numCpte, String date1, String date2);
}
