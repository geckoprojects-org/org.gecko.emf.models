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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verwendungsnachweispruefung1002 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type#getAuszahlungsantrag <em>Auszahlungsantrag</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschVerwendungsnachweispruefung1002Type()
 * @model extendedMetaData="name='kinderwunsch.verwendungsnachweispruefung.1002_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KinderwunschVerwendungsnachweispruefung1002Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Auszahlungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auszahlungsantrag</em>' containment reference.
	 * @see #setAuszahlungsantrag(AuszahlungsantragType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='auszahlungsantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	AuszahlungsantragType getAuszahlungsantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type#getAuszahlungsantrag <em>Auszahlungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auszahlungsantrag</em>' containment reference.
	 * @see #getAuszahlungsantrag()
	 * @generated
	 */
	void setAuszahlungsantrag(AuszahlungsantragType value);

} // KinderwunschVerwendungsnachweispruefung1002Type
