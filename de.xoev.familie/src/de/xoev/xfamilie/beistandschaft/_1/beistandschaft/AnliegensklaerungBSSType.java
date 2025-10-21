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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anliegensklaerung BSS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hier sind lediglich die Codes v, vu und u zu verwenden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getAnliegenBeistandschaft <em>Anliegen Beistandschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getInhaberElterlicheSorge <em>Inhaber Elterliche Sorge</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAnliegensklaerungBSSType()
 * @model extendedMetaData="name='AnliegensklaerungBSSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnliegensklaerungBSSType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anliegen Beistandschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anliegen Beistandschaft</em>' containment reference.
	 * @see #setAnliegenBeistandschaft(CodeAnliegenBeistandschaftType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAnliegensklaerungBSSType_AnliegenBeistandschaft()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anliegenBeistandschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAnliegenBeistandschaftType getAnliegenBeistandschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getAnliegenBeistandschaft <em>Anliegen Beistandschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anliegen Beistandschaft</em>' containment reference.
	 * @see #getAnliegenBeistandschaft()
	 * @generated
	 */
	void setAnliegenBeistandschaft(CodeAnliegenBeistandschaftType value);

	/**
	 * Returns the value of the '<em><b>Vaterschaft Anerkannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angabe, ob die Vaterschaft anerkannt wurde. Das Element vaterschaftAnerkannt ist nur zu befüllen, wenn für anliegenBeistandschaft u gewählt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaterschaft Anerkannt</em>' attribute.
	 * @see #isSetVaterschaftAnerkannt()
	 * @see #unsetVaterschaftAnerkannt()
	 * @see #setVaterschaftAnerkannt(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAnliegensklaerungBSSType_VaterschaftAnerkannt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vaterschaftAnerkannt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVaterschaftAnerkannt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaterschaft Anerkannt</em>' attribute.
	 * @see #isSetVaterschaftAnerkannt()
	 * @see #unsetVaterschaftAnerkannt()
	 * @see #isVaterschaftAnerkannt()
	 * @generated
	 */
	void setVaterschaftAnerkannt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaterschaftAnerkannt()
	 * @see #isVaterschaftAnerkannt()
	 * @see #setVaterschaftAnerkannt(boolean)
	 * @generated
	 */
	void unsetVaterschaftAnerkannt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vaterschaft Anerkannt</em>' attribute is set.
	 * @see #unsetVaterschaftAnerkannt()
	 * @see #isVaterschaftAnerkannt()
	 * @see #setVaterschaftAnerkannt(boolean)
	 * @generated
	 */
	boolean isSetVaterschaftAnerkannt();

	/**
	 * Returns the value of the '<em><b>Inhaber Elterliche Sorge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhaber Elterliche Sorge</em>' containment reference.
	 * @see #setInhaberElterlicheSorge(CodeInhaberElterlicheSorgeType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getAnliegensklaerungBSSType_InhaberElterlicheSorge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inhaberElterlicheSorge' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeInhaberElterlicheSorgeType getInhaberElterlicheSorge();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType#getInhaberElterlicheSorge <em>Inhaber Elterliche Sorge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhaber Elterliche Sorge</em>' containment reference.
	 * @see #getInhaberElterlicheSorge()
	 * @generated
	 */
	void setInhaberElterlicheSorge(CodeInhaberElterlicheSorgeType value);

} // AnliegensklaerungBSSType
