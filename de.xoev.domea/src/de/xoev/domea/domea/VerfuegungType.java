/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verfuegung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Verfügung ist ein Mittel zur Steuerung der Bearbeitung eines Schriftgutobjektes in einem Beteiligungsschritt. Die Bearbeitung eines Geschäftsvorfalls wird durch förmliche und abschließend gezeichnete Verfügungen eingeleitet, fortgeführt und abgeschlossen. Gegenstand von Verfügungen können insbesondere sein: Entwürfe von Schreiben Beteiligung anderer Organisationseinheiten Hinweise zur Sicherung eines ausreichenden schriftlichen Nachweises der Bearbeitung Abschließende Verfügung zur weiteren Bearbeitung oder zu deren Abschluss (Schlussverfügung)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getErsteller <em>Ersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getAdressat <em>Adressat</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getErstellungsdatum <em>Erstellungsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getErstellungsuhrzeit <em>Erstellungsuhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getVerfuegung <em>Verfuegung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getTerminDatum <em>Termin Datum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getTerminUhrzeit <em>Termin Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerfuegungType#getNotiz <em>Notiz</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType()
 * @model extendedMetaData="name='VerfuegungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerfuegungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontaktes, durch die der Erlasser der Verfügung bestimmt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ersteller</em>' containment reference.
	 * @see #setErsteller(KontaktType)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Ersteller()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ersteller' namespace='##targetNamespace'"
	 * @generated
	 */
	KontaktType getErsteller();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getErsteller <em>Ersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ersteller</em>' containment reference.
	 * @see #getErsteller()
	 * @generated
	 */
	void setErsteller(KontaktType value);

	/**
	 * Returns the value of the '<em><b>Adressat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die spezifische Ausprägung eines Kontaktes, durch die der Leser der Verfügung bestimmt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adressat</em>' containment reference.
	 * @see #setAdressat(KontaktType)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Adressat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Adressat' namespace='##targetNamespace'"
	 * @generated
	 */
	KontaktType getAdressat();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getAdressat <em>Adressat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adressat</em>' containment reference.
	 * @see #getAdressat()
	 * @generated
	 */
	void setAdressat(KontaktType value);

	/**
	 * Returns the value of the '<em><b>Erstellungsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Erstellungsdatum der Verfügung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erstellungsdatum</em>' attribute.
	 * @see #setErstellungsdatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Erstellungsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='Erstellungsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getErstellungsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getErstellungsdatum <em>Erstellungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erstellungsdatum</em>' attribute.
	 * @see #getErstellungsdatum()
	 * @generated
	 */
	void setErstellungsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Erstellungsuhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Erstellungsuhrzeit der Verfügung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erstellungsuhrzeit</em>' attribute.
	 * @see #setErstellungsuhrzeit(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Erstellungsuhrzeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='Erstellungsuhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getErstellungsuhrzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getErstellungsuhrzeit <em>Erstellungsuhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erstellungsuhrzeit</em>' attribute.
	 * @see #getErstellungsuhrzeit()
	 * @generated
	 */
	void setErstellungsuhrzeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Verfuegung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die textuelle Beschreibung der Verfügung, z. B. zur Kenntnis, zur Mitzeichnung, zur Bearbeitung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verfuegung</em>' attribute.
	 * @see #setVerfuegung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Verfuegung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Verfuegung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVerfuegung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getVerfuegung <em>Verfuegung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verfuegung</em>' attribute.
	 * @see #getVerfuegung()
	 * @generated
	 */
	void setVerfuegung(String value);

	/**
	 * Returns the value of the '<em><b>Termin Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das vom Ersteller für die Erledigung der Verfügung festgelegte Datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termin Datum</em>' attribute.
	 * @see #setTerminDatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_TerminDatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='TerminDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTerminDatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getTerminDatum <em>Termin Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termin Datum</em>' attribute.
	 * @see #getTerminDatum()
	 * @generated
	 */
	void setTerminDatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Termin Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die vom Ersteller für die Erledigung der Verfügung festgelegte Uhrzeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termin Uhrzeit</em>' attribute.
	 * @see #setTerminUhrzeit(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_TerminUhrzeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='TerminUhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTerminUhrzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getTerminUhrzeit <em>Termin Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termin Uhrzeit</em>' attribute.
	 * @see #getTerminUhrzeit()
	 * @generated
	 */
	void setTerminUhrzeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Notiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Hinweise oder Erläuterungen zu einer Verfügung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notiz</em>' attribute.
	 * @see #setNotiz(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerfuegungType_Notiz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Notiz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotiz();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerfuegungType#getNotiz <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notiz</em>' attribute.
	 * @see #getNotiz()
	 * @generated
	 */
	void setNotiz(String value);

} // VerfuegungType
