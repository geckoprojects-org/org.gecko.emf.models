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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType()
 * @model extendedMetaData="name='PostalischeInlandsanschrift.Gebaeudeanschrift.NachweisbezugType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType extends PostalischeInlandsanschriftGebaeudeanschriftType {
	/**
	 * Returns the value of the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #setNachweisbezug(NachweisbezugType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisbezug' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisbezugType getNachweisbezug();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweisbezug</em>' containment reference.
	 * @see #getNachweisbezug()
	 * @generated
	 */
	void setNachweisbezug(NachweisbezugType value);

} // PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType
