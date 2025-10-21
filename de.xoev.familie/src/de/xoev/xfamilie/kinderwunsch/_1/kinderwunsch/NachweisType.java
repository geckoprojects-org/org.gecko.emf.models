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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden <em>Nachweis Vorhanden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweisType()
 * @model extendedMetaData="name='NachweisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweis Vorhanden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Vorhanden</em>' attribute.
	 * @see #isSetNachweisVorhanden()
	 * @see #unsetNachweisVorhanden()
	 * @see #setNachweisVorhanden(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweisType_NachweisVorhanden()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='nachweisVorhanden' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNachweisVorhanden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden <em>Nachweis Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Vorhanden</em>' attribute.
	 * @see #isSetNachweisVorhanden()
	 * @see #unsetNachweisVorhanden()
	 * @see #isNachweisVorhanden()
	 * @generated
	 */
	void setNachweisVorhanden(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden <em>Nachweis Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNachweisVorhanden()
	 * @see #isNachweisVorhanden()
	 * @see #setNachweisVorhanden(boolean)
	 * @generated
	 */
	void unsetNachweisVorhanden();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden <em>Nachweis Vorhanden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nachweis Vorhanden</em>' attribute is set.
	 * @see #unsetNachweisVorhanden()
	 * @see #isNachweisVorhanden()
	 * @see #setNachweisVorhanden(boolean)
	 * @generated
	 */
	boolean isSetNachweisVorhanden();

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis</em>' containment reference.
	 * @see #setNachweis(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweisType_Nachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#getNachweis <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis</em>' containment reference.
	 * @see #getNachweis()
	 * @generated
	 */
	void setNachweis(NachweisdokumentType value);

} // NachweisType
