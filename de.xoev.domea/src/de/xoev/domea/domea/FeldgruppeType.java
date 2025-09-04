/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feldgruppe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Feldgruppe gruppiert mehrere Felder als anwendungsspezifische Metadaten beim Austausch eines Schriftgutobjektes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.FeldgruppeType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldgruppeType#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldgruppeType#getUnterfeldgruppe <em>Unterfeldgruppe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.FeldgruppeType#getFeld <em>Feld</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getFeldgruppeType()
 * @model extendedMetaData="name='FeldgruppeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeldgruppeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name der Feldgruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldgruppeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldgruppeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Hinweise und Erläuterungen zu einer Feldgruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldgruppeType_Beschreibung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Beschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.FeldgruppeType#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Unterfeldgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FeldgruppeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Unterfeldgruppe erfolgt die hierarchische Unterteilung einer Feldgruppe in weitere Feldgruppen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterfeldgruppe</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldgruppeType_Unterfeldgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unterfeldgruppe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldgruppeType> getUnterfeldgruppe();

	/**
	 * Returns the value of the '<em><b>Feld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FeldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Feld erfolgt die Unterteilung einer Feldgruppe in konkrete Felder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feld</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getFeldgruppeType_Feld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Feld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldType> getFeld();

} // FeldgruppeType
