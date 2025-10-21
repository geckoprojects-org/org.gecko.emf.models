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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragdetails Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weitere Angaben zum Antrag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getAntrag <em>Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsType()
 * @model extendedMetaData="name='AntragdetailsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragdetailsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Antrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabeliste für sonstige Anträge - aus Kommunenliste, z. B. einmalige Leistungen beantragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antrag</em>' containment reference.
	 * @see #setAntrag(EObject)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsType_Antrag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antrag' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAntrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getAntrag <em>Antrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag</em>' containment reference.
	 * @see #getAntrag()
	 * @generated
	 */
	void setAntrag(EObject value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informationen zum Antrag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsType_Information()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='information' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsType#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

} // AntragdetailsType
