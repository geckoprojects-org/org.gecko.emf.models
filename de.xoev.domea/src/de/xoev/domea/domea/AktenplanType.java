/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aktenplan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Aktenplan enthält ein aufgabenbezogenes mehrstufiges Ordnungssystem mit einer hierarchischen Gliederung für das Bilden und Kennzeichnen von Akten und Vorgängen sowie das Zuordnen von Dokumenten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getVersion <em>Version</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getGueltigkeit <em>Gueltigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplanType#getAktenplandatei <em>Aktenplandatei</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType()
 * @model extendedMetaData="name='AktenplanType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AktenplanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des Aktenplans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Bezeichnung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplanType#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Typ des Aktenplans, z. B. Teilaktenplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Typ()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplanType#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Version des Aktenplans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplanType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Einheit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AktenplaneinheitAktenplanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Einheit eines Aktenplans, die Auskunft über die hierarchische Strukturierung eines Aktenplans gibt. Eine Aktenplaneinheit entspricht z. B. einer Hauptgruppe, Obergruppe, Gruppe, Untergruppe oder Betreffseinheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einheit</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Einheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einheit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AktenplaneinheitAktenplanType> getEinheit();

	/**
	 * Returns the value of the '<em><b>Gueltigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Gültigkeit des Aktenplans mit Beginn und Ende.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueltigkeit</em>' containment reference.
	 * @see #setGueltigkeit(ZeitraumType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Gueltigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gueltigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getGueltigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplanType#getGueltigkeit <em>Gueltigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueltigkeit</em>' containment reference.
	 * @see #getGueltigkeit()
	 * @generated
	 */
	void setGueltigkeit(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Aktenplandatei</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Datei zum Aktenplan als Primärdokument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenplandatei</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplanType_Aktenplandatei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aktenplandatei' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormatType> getAktenplandatei();

} // AktenplanType
