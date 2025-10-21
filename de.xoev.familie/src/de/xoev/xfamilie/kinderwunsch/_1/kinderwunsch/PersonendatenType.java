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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personendaten Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getWohnsitz <em>Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getKrankenkasse <em>Krankenkasse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getPersonendatenType()
 * @model extendedMetaData="name='PersonendatenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersonendatenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getPersonendatenType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Wohnsitz</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wohnsitz</em>' containment reference list.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getPersonendatenType_Wohnsitz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wohnsitz' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WohnsitzType> getWohnsitz();

	/**
	 * Returns the value of the '<em><b>Krankenkasse</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krankenkasse</em>' containment reference list.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getPersonendatenType_Krankenkasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='krankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KrankenkasseType> getKrankenkasse();

} // PersonendatenType
