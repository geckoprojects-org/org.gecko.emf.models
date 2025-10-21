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
 * A representation of the model object '<em><b>Terminwunsch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Terminwunsch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getWochentag <em>Wochentag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getUhrzeit <em>Uhrzeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTerminwunschType()
 * @model extendedMetaData="name='TerminwunschType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TerminwunschType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wochentag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Wochentag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wochentag</em>' attribute list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTerminwunschType_Wochentag()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='wochentag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getWochentag();

	/**
	 * Returns the value of the '<em><b>Uhrzeit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uhrzeit</em>' attribute list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getTerminwunschType_Uhrzeit()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='uhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUhrzeit();

} // TerminwunschType
