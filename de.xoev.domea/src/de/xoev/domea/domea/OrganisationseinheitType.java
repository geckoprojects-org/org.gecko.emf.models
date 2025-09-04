/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisationseinheit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Organisationseinheit leitet sich von der entsprechenden XÖV-Kernkomponente ab. Sie fasst Angaben zur Darstellung der internen hierarchischen Organisationsstruktur einer Institution zusammen, z. B. zur Darstellung von Abteilungen, Referaten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.OrganisationseinheitType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getOrganisationseinheitType()
 * @model extendedMetaData="name='OrganisationseinheitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OrganisationseinheitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Bezeichnung der Organisationseinheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getOrganisationseinheitType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.OrganisationseinheitType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OrganisationseinheitType
