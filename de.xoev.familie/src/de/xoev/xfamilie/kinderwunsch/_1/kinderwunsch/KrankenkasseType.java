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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Krankenkasse Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getArtKrankenkasse <em>Art Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameKrankenkasse <em>Name Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameBeihilfestelle <em>Name Beihilfestelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameHeilfuersorge <em>Name Heilfuersorge</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKrankenkasseType()
 * @model extendedMetaData="name='KrankenkasseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KrankenkasseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Krankenkasse</em>' containment reference.
	 * @see #setArtKrankenkasse(CodeVersicherungsartType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKrankenkasseType_ArtKrankenkasse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVersicherungsartType getArtKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getArtKrankenkasse <em>Art Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Krankenkasse</em>' containment reference.
	 * @see #getArtKrankenkasse()
	 * @generated
	 */
	void setArtKrankenkasse(CodeVersicherungsartType value);

	/**
	 * Returns the value of the '<em><b>Name Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Krankenkasse</em>' attribute.
	 * @see #setNameKrankenkasse(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKrankenkasseType_NameKrankenkasse()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='nameKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameKrankenkasse <em>Name Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Krankenkasse</em>' attribute.
	 * @see #getNameKrankenkasse()
	 * @generated
	 */
	void setNameKrankenkasse(String value);

	/**
	 * Returns the value of the '<em><b>Name Beihilfestelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Beihilfestelle</em>' attribute.
	 * @see #setNameBeihilfestelle(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKrankenkasseType_NameBeihilfestelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='nameBeihilfestelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameBeihilfestelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameBeihilfestelle <em>Name Beihilfestelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Beihilfestelle</em>' attribute.
	 * @see #getNameBeihilfestelle()
	 * @generated
	 */
	void setNameBeihilfestelle(String value);

	/**
	 * Returns the value of the '<em><b>Name Heilfuersorge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Heilfuersorge</em>' attribute.
	 * @see #setNameHeilfuersorge(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getKrankenkasseType_NameHeilfuersorge()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='nameHeilfuersorge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameHeilfuersorge();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameHeilfuersorge <em>Name Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Heilfuersorge</em>' attribute.
	 * @see #getNameHeilfuersorge()
	 * @generated
	 */
	void setNameHeilfuersorge(String value);

} // KrankenkasseType
