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
 * A representation of the model object '<em><b>Postalische Inlandsanschrift Postfachanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland, soweit es sich um eine Postfachanschrift (und nicht um eine Gebäudeanschrift) handelt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostfach <em>Postfach</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getWohnort <em>Wohnort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getZusatzangaben <em>Zusatzangaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftPostfachanschriftType()
 * @model extendedMetaData="name='PostalischeInlandsanschrift.PostfachanschriftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostalischeInlandsanschriftPostfachanschriftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Postfach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfach</em>' attribute.
	 * @see #setPostfach(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftPostfachanschriftType_Postfach()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='postfach' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostfach();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostfach <em>Postfach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfach</em>' attribute.
	 * @see #getPostfach()
	 * @generated
	 */
	void setPostfach(String value);

	/**
	 * Returns the value of the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wohnort</em>' attribute.
	 * @see #setWohnort(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftPostfachanschriftType_Wohnort()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftWohnortType" required="true"
	 *        extendedMetaData="kind='element' name='wohnort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getWohnort <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnort</em>' attribute.
	 * @see #getWohnort()
	 * @generated
	 */
	void setWohnort(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postleitzahl</em>' attribute.
	 * @see #setPostleitzahl(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftPostleitzahlType" required="true"
	 *        extendedMetaData="kind='element' name='postleitzahl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostleitzahl();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostleitzahl <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl</em>' attribute.
	 * @see #getPostleitzahl()
	 * @generated
	 */
	void setPostleitzahl(String value);

	/**
	 * Returns the value of the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zusatzangaben</em>' attribute.
	 * @see #setZusatzangaben(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusatzangaben' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatzangaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getZusatzangaben <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzangaben</em>' attribute.
	 * @see #getZusatzangaben()
	 * @generated
	 */
	void setZusatzangaben(String value);

} // PostalischeInlandsanschriftPostfachanschriftType
