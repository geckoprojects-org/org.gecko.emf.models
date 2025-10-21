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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konfigurationsfragen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt <em>Gleicher Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#getAngabenZurBehandlung <em>Angaben Zur Behandlung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKonfigurationsfragenType()
 * @model extendedMetaData="name='KonfigurationsfragenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KonfigurationsfragenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Gleicher Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfung, ob Antragsteller im gleichen Haushalt wohnen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleicher Haushalt</em>' attribute.
	 * @see #isSetGleicherHaushalt()
	 * @see #unsetGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKonfigurationsfragenType_GleicherHaushalt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='gleicherHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGleicherHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleicher Haushalt</em>' attribute.
	 * @see #isSetGleicherHaushalt()
	 * @see #unsetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @generated
	 */
	void setGleicherHaushalt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @generated
	 */
	void unsetGleicherHaushalt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gleicher Haushalt</em>' attribute is set.
	 * @see #unsetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @generated
	 */
	boolean isSetGleicherHaushalt();

	/**
	 * Returns the value of the '<em><b>Angaben Zur Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Zur Behandlung</em>' containment reference.
	 * @see #setAngabenZurBehandlung(ArtDerBehandlungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKonfigurationsfragenType_AngabenZurBehandlung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtDerBehandlungType getAngabenZurBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#getAngabenZurBehandlung <em>Angaben Zur Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Behandlung</em>' containment reference.
	 * @see #getAngabenZurBehandlung()
	 * @generated
	 */
	void setAngabenZurBehandlung(ArtDerBehandlungType value);

} // KonfigurationsfragenType
