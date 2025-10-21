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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kontoinformationen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu Kontoinformationen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBeantragungJugendhilfe <em>Beantragung Jugendhilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBankverbindung <em>Bankverbindung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getKontoinformationenType()
 * @model extendedMetaData="name='KontoinformationenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KontoinformationenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beantragung Jugendhilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In meiner/unserer Eigenschaft als … beantrage/n ich/wir Jugendhilfe in Form von Leistungen zum Unterhalt gemäß § 39 i. V. m. § 33 SGB VIII und bitte/n um Überweisung der Pflegegeldzahlungen unter Verwendung folgender Bankverbindung:
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beantragung Jugendhilfe</em>' containment reference.
	 * @see #setBeantragungJugendhilfe(CodeEigenschaftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getKontoinformationenType_BeantragungJugendhilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beantragungJugendhilfe' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeEigenschaftType getBeantragungJugendhilfe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBeantragungJugendhilfe <em>Beantragung Jugendhilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beantragung Jugendhilfe</em>' containment reference.
	 * @see #getBeantragungJugendhilfe()
	 * @generated
	 */
	void setBeantragungJugendhilfe(CodeEigenschaftType value);

	/**
	 * Returns the value of the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Bankverbindung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #setBankverbindung(BankverbindungIBANOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getKontoinformationenType_Bankverbindung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bankverbindung' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungIBANOptionalType getBankverbindung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType#getBankverbindung <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #getBankverbindung()
	 * @generated
	 */
	void setBankverbindung(BankverbindungIBANOptionalType value);

} // KontoinformationenType
