/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeine Metadaten Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AllgemeineMetadaten enthält die Metadaten, die der allgemeinen Charakterisierung eines Schriftgutobjektes dienen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBetreff <em>Betreff</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getKennzeichen <em>Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getFederfuehrung <em>Federfuehrung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenfuehrung <em>Aktenfuehrung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getGeheimhaltung <em>Geheimhaltung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getMedium <em>Medium</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenplaneinheit <em>Aktenplaneinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getStrukturpfad <em>Strukturpfad</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufe <em>Datenschutzstufe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufeCode <em>Datenschutzstufe Code</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType()
 * @model extendedMetaData="name='AllgemeineMetadatenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeineMetadatenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Betreff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Betreff des Schriftgutobjektes, z. B. für eine Akte der Aktentitel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betreff</em>' attribute.
	 * @see #setBetreff(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Betreff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Betreff' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetreff();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBetreff <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreff</em>' attribute.
	 * @see #getBetreff()
	 * @generated
	 */
	void setBetreff(String value);

	/**
	 * Returns the value of the '<em><b>Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aus dem Aktenplan abgeleitete Kennung des Schriftgutobjektes zur Identifikation und Zuordnung zum Schriftgut in einer Behörde. Bei Akten ist das Kennzeichen das Aktenzeichen, es setzt sich zusammen aus dem zugehörigen Aktenplankennzeichen und einer eindeutigen Ordnungsnummer. Auf Vorgangsebene ist das Kennzeichen das Vorgangszeichen, das sich aus dem Aktenzeichen sowie einer zusätzlichen Nummer für den Vorgang zusammensetzt. Auf Dokumentebene wird als Kennzeichen das Geschäftszeichen verwendet. Dies besteht in der Regel aus dem Aktenzeichen resp. Vorgangszeichen, einer laufenden Nummer sowie der Organisationskurzbezeichnung der zuständigen Organisationseinheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzeichen</em>' attribute.
	 * @see #setKennzeichen(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Kennzeichen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Kennzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getKennzeichen <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzeichen</em>' attribute.
	 * @see #getKennzeichen()
	 * @generated
	 */
	void setKennzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Federfuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Organisationseinheit mit der Hauptverantwortung bzw. der Zuständigkeit für einen Geschäftsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Federfuehrung</em>' attribute.
	 * @see #setFederfuehrung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Federfuehrung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Federfuehrung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFederfuehrung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getFederfuehrung <em>Federfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federfuehrung</em>' attribute.
	 * @see #getFederfuehrung()
	 * @generated
	 */
	void setFederfuehrung(String value);

	/**
	 * Returns the value of the '<em><b>Aktenfuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Organisationseinheit mit der Hauptverantwortung bzw. der Zuständigkeit für die Aktenführung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenfuehrung</em>' attribute.
	 * @see #setAktenfuehrung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Aktenfuehrung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Aktenfuehrung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenfuehrung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenfuehrung <em>Aktenfuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenfuehrung</em>' attribute.
	 * @see #getAktenfuehrung()
	 * @generated
	 */
	void setAktenfuehrung(String value);

	/**
	 * Returns the value of the '<em><b>Geheimhaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Geheimhaltung beschreibt, welche Kriterien z. B. für die Weitergabe und Veröffentlichung eines Schriftgutobjekts beachtet werden müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geheimhaltung</em>' containment reference.
	 * @see #setGeheimhaltung(GeheimhaltungType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Geheimhaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geheimhaltung' namespace='##targetNamespace'"
	 * @generated
	 */
	GeheimhaltungType getGeheimhaltung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getGeheimhaltung <em>Geheimhaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geheimhaltung</em>' containment reference.
	 * @see #getGeheimhaltung()
	 * @generated
	 */
	void setGeheimhaltung(GeheimhaltungType value);

	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusätzliches Feld zur Übermittlung weiterer Informationen in einem konkreten Geschäftsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemerkung</em>' attribute.
	 * @see #setBemerkung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Bemerkung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bemerkung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBemerkung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBemerkung <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' attribute.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(String value);

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Medium beschreibt, ob es sich um ein Papier- und/oder elektronisches Dokument handelt. Mögliche Werte sind "Papier", "Elektronisch" oder "Hybrid".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference.
	 * @see #setMedium(MediumCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Medium' namespace='##targetNamespace'"
	 * @generated
	 */
	MediumCodeType getMedium();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getMedium <em>Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium</em>' containment reference.
	 * @see #getMedium()
	 * @generated
	 */
	void setMedium(MediumCodeType value);

	/**
	 * Returns the value of the '<em><b>Aktenplaneinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aktenplaneinheit, dem das Schriftgutobjekt zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenplaneinheit</em>' containment reference.
	 * @see #setAktenplaneinheit(AktenplaneinheitType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Aktenplaneinheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aktenplaneinheit' namespace='##targetNamespace'"
	 * @generated
	 */
	AktenplaneinheitType getAktenplaneinheit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenplaneinheit <em>Aktenplaneinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenplaneinheit</em>' containment reference.
	 * @see #getAktenplaneinheit()
	 * @generated
	 */
	void setAktenplaneinheit(AktenplaneinheitType value);

	/**
	 * Returns the value of the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitpunkt der letzten Änderung, die an dem Objekt selbst bzw. an einem darunterliegenden Objekt vorgenommen wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitpunkt Letzte Aenderung</em>' attribute.
	 * @see #setZeitpunktLetzteAenderung(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_ZeitpunktLetzteAenderung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ZeitpunktLetzteAenderung' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitpunktLetzteAenderung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitpunkt Letzte Aenderung</em>' attribute.
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 */
	void setZeitpunktLetzteAenderung(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Strukturpfad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Pfades im System zu einem Schriftgutobjekt, um zusätzliche interne Strukturebenen über (Teil-)Akte und (Teil-)Vorgang hinaus darstellen zu können. Das Objekt, dessen Pfad betrachtet wird, ist nicht selbst Teil des Pfades. Das erste Pfadelement entspricht dem obersten Element in der Struktur - meist die Akte. Die weiteren Elemente folgen hierarchisch von oben nach unten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strukturpfad</em>' containment reference.
	 * @see #setStrukturpfad(StrukturpfadType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Strukturpfad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Strukturpfad' namespace='##targetNamespace'"
	 * @generated
	 */
	StrukturpfadType getStrukturpfad();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getStrukturpfad <em>Strukturpfad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strukturpfad</em>' containment reference.
	 * @see #getStrukturpfad()
	 * @generated
	 */
	void setStrukturpfad(StrukturpfadType value);

	/**
	 * Returns the value of the '<em><b>Datenschutzstufe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Datenschutzstufe des Schriftgutobjekts oder Schriftstücks als Text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutzstufe</em>' attribute.
	 * @see #setDatenschutzstufe(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_Datenschutzstufe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Datenschutzstufe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatenschutzstufe();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufe <em>Datenschutzstufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzstufe</em>' attribute.
	 * @see #getDatenschutzstufe()
	 * @generated
	 */
	void setDatenschutzstufe(String value);

	/**
	 * Returns the value of the '<em><b>Datenschutzstufe Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Datenschutzstufe des Schriftgutobjekts bzw. Schriftstücks als Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutzstufe Code</em>' containment reference.
	 * @see #setDatenschutzstufeCode(DatenschutzstufeCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAllgemeineMetadatenType_DatenschutzstufeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatenschutzstufeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzstufeCodeType getDatenschutzstufeCode();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufeCode <em>Datenschutzstufe Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzstufe Code</em>' containment reference.
	 * @see #getDatenschutzstufeCode()
	 * @generated
	 */
	void setDatenschutzstufeCode(DatenschutzstufeCodeType value);

} // AllgemeineMetadatenType
