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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Institution Unterhaltstitel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information zu einer anderen Person, bei der der Unterhaltstitel liegt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getInstitutionUnterhaltstitelType()
 * @model extendedMetaData="name='InstitutionUnterhaltstitelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InstitutionUnterhaltstitelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name der anderen Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getInstitutionUnterhaltstitelType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anschrift der anderen Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getInstitutionUnterhaltstitelType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird genauer beschrieben, wo der Unterhaltstitel liegt. Es kann auch eine Institution sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' attribute.
	 * @see #setBezeichnung(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getInstitutionUnterhaltstitelType_Bezeichnung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bezeichnung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezeichnung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.InstitutionUnterhaltstitelType#getBezeichnung <em>Bezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' attribute.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(String value);

} // InstitutionUnterhaltstitelType
