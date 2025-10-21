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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutzerkonto Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getVertrauensniveau <em>Vertrauensniveau</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getNachweisNutzerkonto <em>Nachweis Nutzerkonto</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNutzerkontoType()
 * @model extendedMetaData="name='NutzerkontoType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NutzerkontoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNutzerkontoType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Vertrauensniveau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertrauensniveau</em>' containment reference.
	 * @see #setVertrauensniveau(CodeVertrauensniveauType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNutzerkontoType_Vertrauensniveau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vertrauensniveau' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVertrauensniveauType getVertrauensniveau();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getVertrauensniveau <em>Vertrauensniveau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertrauensniveau</em>' containment reference.
	 * @see #getVertrauensniveau()
	 * @generated
	 */
	void setVertrauensniveau(CodeVertrauensniveauType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Nutzerkonto</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Nutzerkonto</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNutzerkontoType_NachweisNutzerkonto()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisNutzerkonto' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisNutzerkonto();

} // NutzerkontoType
