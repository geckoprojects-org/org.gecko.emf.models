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

import de.xoev.schemata.code.code.Code;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behoerdenkennung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Übernommen aus XInneres: Die Behoerdenkennung fasst die Elemente zusammen, unter denen eine Behörde als Anbieter elektronischer Services im DVDV verzeichnet ist. Sie besteht aus einem Präfix und der eigentlichen Kennung. Grundsätzlich gibt es zu jedem Präfix eine entsprechende Schlüsseltabelle für die Kennung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getPraefix <em>Praefix</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getKennung <em>Kennung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBehoerdenkennungType()
 * @model extendedMetaData="name='BehoerdenkennungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BehoerdenkennungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Praefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Klasse für Behördenkennungen. Die Liste der Präfixe für Behördenkennungen wird durch das Bundesverwaltungsamt (BVA) als koordinierende Stelle für das DVDV verwaltet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Praefix</em>' containment reference.
	 * @see #setPraefix(CodePraefixType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBehoerdenkennungType_Praefix()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='praefix' namespace='##targetNamespace'"
	 * @generated
	 */
	CodePraefixType getPraefix();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getPraefix <em>Praefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Praefix</em>' containment reference.
	 * @see #getPraefix()
	 * @generated
	 */
	void setPraefix(CodePraefixType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element kennzeichnet eine Behörde innerhalb der durch den Präfix bezeichneten Klasse eindeutig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' containment reference.
	 * @see #setKennung(Code)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getBehoerdenkennungType_Kennung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kennung' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getKennung <em>Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' containment reference.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(Code value);

} // BehoerdenkennungType
