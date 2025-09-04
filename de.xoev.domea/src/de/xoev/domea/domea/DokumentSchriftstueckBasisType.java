/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dokument Schriftstueck Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DokumentSchriftstueckBasisType enthält die Metadatenfelder für den Austausch von Dokumenten einschließlich der allgemeinen Metadaten, anwendungsspezifischer Metadaten, Historien- und Protokollinformationen sowie Informationen zum internen Geschäftsgang. In der Objekthierarchie des Organisationskonzepts elektronische Verwaltungsarbeit ist das Dokument die kleinste logische Einheit des Schriftguts. Es wird analog oder elektronisch erstellt und verwaltet. Dabei entspricht der Begriff „Dokument“ nicht nur den ehemaligen Papierdokumenten, sondern kann daneben jede andere digitale Form von Informationen beinhalten. Es kann aus einem Objekt (ein Schriftstück, z. B. ein Schreiben oder ein Bild) oder mehreren Einzelobjekten (Schriftstücke, z. B. mehrere Bilder, eine Datei mit integrierten Bildern, Text und Tabellen, gemischte Inhalte aus mehreren Quellen) bestehen. Zum Dokument gehören zudem alle ergänzenden Angaben (Metadaten), die zum Verständnis der Primärdokumente notwendig sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getFremdesGeschaeftszeichen <em>Fremdes Geschaeftszeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPosteingangsdatum <em>Posteingangsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPostausgangsdatum <em>Postausgangsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getDatumDesSchreibens <em>Datum Des Schreibens</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBezug <em>Bezug</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHier <em>Hier</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBearbeiter <em>Bearbeiter</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getVerweis <em>Verweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnlage <em>Anlage</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getWeitererKontakt <em>Weiterer Kontakt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType()
 * @model extendedMetaData="name='DokumentSchriftstueckBasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DokumentSchriftstueckBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Identifikation werden zur systemübergreifend eindeutigen Identifizierung des Dokuments spezifische Merkmale übergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation</em>' containment reference.
	 * @see #setIdentifikation(IdentifikationObjektType)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Identifikation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Identifikation' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationObjektType getIdentifikation();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getIdentifikation <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation</em>' containment reference.
	 * @see #getIdentifikation()
	 * @generated
	 */
	void setIdentifikation(IdentifikationObjektType value);

	/**
	 * Returns the value of the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über AllgemeineMetadaten werden allgemeine Metadaten zu einem Dokument angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Metadaten</em>' containment reference.
	 * @see #setAllgemeineMetadaten(AllgemeineMetadatenType)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_AllgemeineMetadaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllgemeineMetadaten' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeineMetadatenType getAllgemeineMetadaten();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Metadaten</em>' containment reference.
	 * @see #getAllgemeineMetadaten()
	 * @generated
	 */
	void setAllgemeineMetadaten(AllgemeineMetadatenType value);

	/**
	 * Returns the value of the '<em><b>Fremdes Geschaeftszeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Geschäftszeichen des Dokuments im absendenden System, das im Zuge eines Nachrichtentransfers übermittelt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fremdes Geschaeftszeichen</em>' attribute.
	 * @see #setFremdesGeschaeftszeichen(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FremdesGeschaeftszeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFremdesGeschaeftszeichen();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getFremdesGeschaeftszeichen <em>Fremdes Geschaeftszeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fremdes Geschaeftszeichen</em>' attribute.
	 * @see #getFremdesGeschaeftszeichen()
	 * @generated
	 */
	void setFremdesGeschaeftszeichen(String value);

	/**
	 * Returns the value of the '<em><b>Posteingangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Posteingangsdatum eines Eingangsdokumentes. Es ist relevant beim Austausch von Dokumenten im Vorgangs- oder Aktenzusammenhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Posteingangsdatum</em>' attribute.
	 * @see #setPosteingangsdatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Posteingangsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Posteingangsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPosteingangsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPosteingangsdatum <em>Posteingangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posteingangsdatum</em>' attribute.
	 * @see #getPosteingangsdatum()
	 * @generated
	 */
	void setPosteingangsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Postausgangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Postausgangsdatum eines Ausgangsdokumentes. Es ist relevant beim Austausch von Dokumenten im Vorgangs- oder Aktenzusammenhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postausgangsdatum</em>' attribute.
	 * @see #setPostausgangsdatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Postausgangsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Postausgangsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPostausgangsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPostausgangsdatum <em>Postausgangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postausgangsdatum</em>' attribute.
	 * @see #getPostausgangsdatum()
	 * @generated
	 */
	void setPostausgangsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Datum Des Schreibens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum des Schreibens, z. B. das Datum eines Briefes. Es handelt sich nicht um das Erstellungs- oder Veränderungsdatum des Primärdokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Des Schreibens</em>' attribute.
	 * @see #setDatumDesSchreibens(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_DatumDesSchreibens()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='DatumDesSchreibens' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatumDesSchreibens();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getDatumDesSchreibens <em>Datum Des Schreibens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Des Schreibens</em>' attribute.
	 * @see #getDatumDesSchreibens()
	 * @generated
	 */
	void setDatumDesSchreibens(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Bezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der konkrete Bezug eines Dokuments, z. B. "Ihr Schreiben vom ..."
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug</em>' attribute.
	 * @see #setBezug(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Bezug()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bezug' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezug();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBezug <em>Bezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug</em>' attribute.
	 * @see #getBezug()
	 * @generated
	 */
	void setBezug(String value);

	/**
	 * Returns the value of the '<em><b>Hier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "Hier" wird zur Konkretisierung des Betreffs verwendet. Auch als Unterbetreff bekannt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hier</em>' attribute.
	 * @see #setHier(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Hier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Hier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHier();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHier <em>Hier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hier</em>' attribute.
	 * @see #getHier()
	 * @generated
	 */
	void setHier(String value);

	/**
	 * Returns the value of the '<em><b>Bearbeiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die für die Bearbeitung zuständige Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeiter</em>' attribute.
	 * @see #setBearbeiter(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Bearbeiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bearbeiter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBearbeiter();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBearbeiter <em>Bearbeiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeiter</em>' attribute.
	 * @see #getBearbeiter()
	 * @generated
	 */
	void setBearbeiter(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Dokumenttyp dient der weiteren Spezifikation des Dokumentes. Der Typ ist relevant beim Austausch von Dokumenten im Vorgangs- oder Aktenzusammenhang. Zulässige Werte sind z. B. Erlass, Vermerk, Bericht, Bescheid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Typ()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.HistorienProtokollInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über HistorienProtokollInformation werden die zur Historisierung und Protokollierung relevanten Metadaten zu einem Dokument angegeben, in der die Veränderungen an den beschreibenden Attributen und dem Zustand des Dokumentes erfasst werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Historien Protokoll Information</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_HistorienProtokollInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistorienProtokollInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HistorienProtokollInformationType> getHistorienProtokollInformation();

	/**
	 * Returns the value of the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.GeschaeftsgangType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Geschäftsgangs, über die der interne Geschäftsgang am Dokument nachgewiesen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interner Geschaeftsgang</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_InternerGeschaeftsgang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternerGeschaeftsgang' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeschaeftsgangType> getInternerGeschaeftsgang();

	/**
	 * Returns the value of the '<em><b>Verweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.VerweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Verweis stellt eine inhaltliche Querbeziehung eines Schriftgutobjekts z. B. zu einem anderen Schriftgutobjekt oder zu einem Objekt auf einem Datenspeicher oder einem Datenträger dar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verweis</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Verweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VerweisType> getVerweis();

	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnlageDokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein dem Dokument zugeordnetes Anlagendokument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Anlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anlage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnlageDokumentType> getAnlage();

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KontaktType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontakts, der die Informationen zum Autor des Dokumentes enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autor</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Autor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Autor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KontaktType> getAutor();

	/**
	 * Returns the value of the '<em><b>Leser</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KontaktType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontakts, der die Informationen zum Leser des Dokumentes enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leser</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_Leser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Leser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KontaktType> getLeser();

	/**
	 * Returns the value of the '<em><b>Weiterer Kontakt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KontaktType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontakts, der die Informationen zu einem weiteren Beteiligten enthält, der nicht Leser oder Autor des Dokuments ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weiterer Kontakt</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_WeitererKontakt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeitererKontakt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KontaktType> getWeitererKontakt();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterungXML darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist. Die AnwendungsspezifischeErweiterungXML bietet die Möglichkeit, mittels Einbindung externer XML-Schemata diese Metadaten zu spezifizieren. Es können beliebige XML-Schemata mit unterschiedlichen Namensräumen angegeben werden. Die XML-Schema-Validierung der weiterführenden Metadaten erfolgt innerhalb der xdomea-Nachricht selbst "lax".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType)
	 * @see de.xoev.domea.domea.DomeaPackage#getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterungXML' namespace='##targetNamespace'"
	 * @generated
	 */
	AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 */
	void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType value);

} // DokumentSchriftstueckBasisType
