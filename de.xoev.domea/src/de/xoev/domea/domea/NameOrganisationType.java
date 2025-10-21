/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Organisation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NameOrganisation leitet sich von der entsprechenden XÖV-Kernkomponente ab und fasst Angaben zum Namen einer Organisation zusammen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NameOrganisationType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NameOrganisationType#getKurzbezeichnung <em>Kurzbezeichnung</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNameOrganisationType()
 * @model extendedMetaData="name='NameOrganisationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NameOrganisationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der offizielle Name einer Organisation. Entspricht bei registrierten Organisationen dem im Register eingetragenen Namen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameOrganisationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameOrganisationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kurzbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kurzbezeichnung des Namens einer Organisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kurzbezeichnung</em>' attribute.
	 * @see #setKurzbezeichnung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameOrganisationType_Kurzbezeichnung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Kurzbezeichnung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKurzbezeichnung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameOrganisationType#getKurzbezeichnung <em>Kurzbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurzbezeichnung</em>' attribute.
	 * @see #getKurzbezeichnung()
	 * @generated
	 */
	void setKurzbezeichnung(String value);

} // NameOrganisationType
