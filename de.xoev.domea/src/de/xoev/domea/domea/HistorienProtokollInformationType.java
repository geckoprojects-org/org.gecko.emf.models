/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historien Protokoll Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Historien- und Protokollinformationen entstehen durch die Bearbeitung von Schriftgutobjekten. Sie protokollieren die Veränderungen an den Metadaten und dem Zustand eines Schriftgutobjektes, die für den Nachweis des Verwaltungshandelns relevant sind - dazu gehören zum Beispiel die Anlage von Vorgängen und Akten, deren Umprotokollierung oder die zdA-Verfügung. Bei der Historisierung werden der alte und der neue Zustand nach der Änderung mit der Angabe des Zeitpunktes und der Uhrzeit der Änderung und der Person, die die Änderung vorgenommen hat, gespeichert.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumName <em>Metadatum Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumAlterWert <em>Metadatum Alter Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumNeuerWert <em>Metadatum Neuer Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAkteur <em>Akteur</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getDatumUhrzeit <em>Datum Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAktion <em>Aktion</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType()
 * @model extendedMetaData="name='HistorienProtokollInformationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HistorienProtokollInformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadatum Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Metadatum, das sich geändert hat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadatum Name</em>' attribute.
	 * @see #setMetadatumName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_MetadatumName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MetadatumName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMetadatumName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumName <em>Metadatum Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadatum Name</em>' attribute.
	 * @see #getMetadatumName()
	 * @generated
	 */
	void setMetadatumName(String value);

	/**
	 * Returns the value of the '<em><b>Metadatum Alter Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert des Metadatums vor der Änderung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadatum Alter Wert</em>' attribute.
	 * @see #setMetadatumAlterWert(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_MetadatumAlterWert()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MetadatumAlterWert' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMetadatumAlterWert();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumAlterWert <em>Metadatum Alter Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadatum Alter Wert</em>' attribute.
	 * @see #getMetadatumAlterWert()
	 * @generated
	 */
	void setMetadatumAlterWert(String value);

	/**
	 * Returns the value of the '<em><b>Metadatum Neuer Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Wert des Metadatums als Ergebnis der Änderung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadatum Neuer Wert</em>' attribute.
	 * @see #setMetadatumNeuerWert(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_MetadatumNeuerWert()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MetadatumNeuerWert' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMetadatumNeuerWert();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumNeuerWert <em>Metadatum Neuer Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadatum Neuer Wert</em>' attribute.
	 * @see #getMetadatumNeuerWert()
	 * @generated
	 */
	void setMetadatumNeuerWert(String value);

	/**
	 * Returns the value of the '<em><b>Akteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Person, die die Änderung vorgenommen hat. Wird die Änderung automatisch durch das System und nicht manuell durch eine Person vorgenommen, so ist das entsprechende System anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Akteur</em>' attribute.
	 * @see #setAkteur(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_Akteur()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Akteur' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAkteur();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAkteur <em>Akteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Akteur</em>' attribute.
	 * @see #getAkteur()
	 * @generated
	 */
	void setAkteur(String value);

	/**
	 * Returns the value of the '<em><b>Datum Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum und die Uhrzeit der erfassten Änderung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Uhrzeit</em>' attribute.
	 * @see #setDatumUhrzeit(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_DatumUhrzeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='DatumUhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatumUhrzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getDatumUhrzeit <em>Datum Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Uhrzeit</em>' attribute.
	 * @see #getDatumUhrzeit()
	 * @generated
	 */
	void setDatumUhrzeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Hinweise und Erläuterungen zu der Änderung eines Metadatums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemerkung</em>' attribute.
	 * @see #setBemerkung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_Bemerkung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bemerkung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBemerkung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getBemerkung <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' attribute.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(String value);

	/**
	 * Returns the value of the '<em><b>Aktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aktion, die die konkrete Änderung des Metadatums näher beschreibt, z. B. gelöscht, neu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktion</em>' attribute.
	 * @see #setAktion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHistorienProtokollInformationType_Aktion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Aktion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAktion <em>Aktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktion</em>' attribute.
	 * @see #getAktion()
	 * @generated
	 */
	void setAktion(String value);

} // HistorienProtokollInformationType
