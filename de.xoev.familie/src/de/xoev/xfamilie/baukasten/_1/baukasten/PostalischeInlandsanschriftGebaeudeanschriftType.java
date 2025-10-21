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
 * A representation of the model object '<em><b>Postalische Inlandsanschrift Gebaeudeanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland, soweit es sich um eine Gebäudeanschrift (und nicht um eine Postfachanschrift) handelt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType#getHausnummernBis <em>Hausnummern Bis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftGebaeudeanschriftType()
 * @model extendedMetaData="name='PostalischeInlandsanschrift.GebaeudeanschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostalischeInlandsanschriftGebaeudeanschriftType extends PostalischeInlandsanschriftBasisType {
	/**
	 * Returns the value of the '<em><b>Hausnummern Bis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hausnummern Bis</em>' containment reference.
	 * @see #setHausnummernBis(HausnummernBisType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hausnummern.bis' namespace='##targetNamespace'"
	 * @generated
	 */
	HausnummernBisType getHausnummernBis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType#getHausnummernBis <em>Hausnummern Bis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummern Bis</em>' containment reference.
	 * @see #getHausnummernBis()
	 * @generated
	 */
	void setHausnummernBis(HausnummernBisType value);

} // PostalischeInlandsanschriftGebaeudeanschriftType
