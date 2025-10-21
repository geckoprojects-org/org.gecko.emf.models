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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postalische Inlandsanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland. Es können entweder Angaben zu einer Gebäudeanschrift oder zu einer Postfachanschrift übermittelt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getGebaeude <em>Gebaeude</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftType()
 * @model extendedMetaData="name='PostalischeInlandsanschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostalischeInlandsanschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Postfach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben für die Übermittlung einer Postfachanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postfach</em>' containment reference.
	 * @see #setPostfach(PostalischeInlandsanschriftPostfachanschriftType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftType_Postfach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postfach' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftPostfachanschriftType getPostfach();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getPostfach <em>Postfach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfach</em>' containment reference.
	 * @see #getPostfach()
	 * @generated
	 */
	void setPostfach(PostalischeInlandsanschriftPostfachanschriftType value);

	/**
	 * Returns the value of the '<em><b>Gebaeude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben für die Übermittlung einer Gebäudeanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gebaeude</em>' containment reference.
	 * @see #setGebaeude(PostalischeInlandsanschriftGebaeudeanschriftType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftType_Gebaeude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gebaeude' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftType getGebaeude();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getGebaeude <em>Gebaeude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gebaeude</em>' containment reference.
	 * @see #getGebaeude()
	 * @generated
	 */
	void setGebaeude(PostalischeInlandsanschriftGebaeudeanschriftType value);

} // PostalischeInlandsanschriftType
