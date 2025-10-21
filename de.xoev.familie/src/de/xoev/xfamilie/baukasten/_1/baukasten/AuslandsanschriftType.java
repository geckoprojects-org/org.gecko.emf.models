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
 * A representation of the model object '<em><b>Auslandsanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Auslandsanschrift.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getStaat <em>Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getAnschriftszeile <em>Anschriftszeile</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAuslandsanschriftType()
 * @model extendedMetaData="name='AuslandsanschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuslandsanschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Staates der Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staat</em>' containment reference.
	 * @see #setStaat(CodeStaatType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAuslandsanschriftType_Staat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staat' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getStaat();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getStaat <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staat</em>' containment reference.
	 * @see #getStaat()
	 * @generated
	 */
	void setStaat(CodeStaatType value);

	/**
	 * Returns the value of the '<em><b>Anschriftszeile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freitextangabe zur Auslandsanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschriftszeile</em>' attribute list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAuslandsanschriftType_Anschriftszeile()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" lower="2" upper="5"
	 *        extendedMetaData="kind='element' name='anschriftszeile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAnschriftszeile();

} // AuslandsanschriftType
