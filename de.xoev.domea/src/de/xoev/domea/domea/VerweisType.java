/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verweis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Verweis stellt eine inhaltliche Querbeziehung eines Schriftgutobjekts z. B. zu einem anderen Schriftgutobjekt oder zu einem Objekt auf einem Datenspeicher oder einem Datenträger dar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.VerweisType#getXdomeaUUID <em>Xdomea UUID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerweisType#getSGOTyp <em>SGO Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerweisType#getSGOKennzeichen <em>SGO Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VerweisType#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getVerweisType()
 * @model extendedMetaData="name='VerweisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerweisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Xdomea UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die xdomeaUUID des Schriftgutobjektes, zu dem der inhaltliche Querverweis dargestellt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xdomea UUID</em>' attribute.
	 * @see #setXdomeaUUID(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerweisType_XdomeaUUID()
	 * @model dataType="basisnachricht.UUID"
	 *        extendedMetaData="kind='element' name='xdomeaUUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXdomeaUUID();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerweisType#getXdomeaUUID <em>Xdomea UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdomea UUID</em>' attribute.
	 * @see #getXdomeaUUID()
	 * @generated
	 */
	void setXdomeaUUID(String value);

	/**
	 * Returns the value of the '<em><b>SGO Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Typ des Schriftgutobjektes, auf das verwiesen wird. Mögliche Werte sind "Akte", "Dokument" und "Vorgang".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGO Typ</em>' containment reference.
	 * @see #setSGOTyp(SchriftgutobjekttypCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerweisType_SGOTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SGOTyp' namespace='##targetNamespace'"
	 * @generated
	 */
	SchriftgutobjekttypCodeType getSGOTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerweisType#getSGOTyp <em>SGO Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGO Typ</em>' containment reference.
	 * @see #getSGOTyp()
	 * @generated
	 */
	void setSGOTyp(SchriftgutobjekttypCodeType value);

	/**
	 * Returns the value of the '<em><b>SGO Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Kennzeichen des Schriftgutobjektes, auf das verwiesen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SGO Kennzeichen</em>' attribute.
	 * @see #setSGOKennzeichen(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerweisType_SGOKennzeichen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SGOKennzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSGOKennzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerweisType#getSGOKennzeichen <em>SGO Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SGO Kennzeichen</em>' attribute.
	 * @see #getSGOKennzeichen()
	 * @generated
	 */
	void setSGOKennzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Hinweise und Bemerkungen zu diesem Verweis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemerkung</em>' attribute.
	 * @see #setBemerkung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVerweisType_Bemerkung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bemerkung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBemerkung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VerweisType#getBemerkung <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' attribute.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(String value);

} // VerweisType
