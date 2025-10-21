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

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adoptionundpflegekinder Adoption0901 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getKontaktformular <em>Kontaktformular</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getStiefkindadoption <em>Stiefkindadoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getVerwandtenadoption <em>Verwandtenadoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getFremdkindadoption <em>Fremdkindadoption</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type()
 * @model extendedMetaData="name='adoptionundpflegekinder.adoption.0901_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdoptionundpflegekinderAdoption0901Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Kontaktformular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz, Personendaten, Anschrift, dem Anliegen, Datenschutz der Fachbehörde und dem digitalen Rückkanal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontaktformular</em>' containment reference.
	 * @see #setKontaktformular(KontakformularType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type_Kontaktformular()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kontaktformular' namespace='##targetNamespace'"
	 * @generated
	 */
	KontakformularType getKontaktformular();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getKontaktformular <em>Kontaktformular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kontaktformular</em>' containment reference.
	 * @see #getKontaktformular()
	 * @generated
	 */
	void setKontaktformular(KontakformularType value);

	/**
	 * Returns the value of the '<em><b>Nachweise Einreichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Nachweise einreichen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise Einreichen</em>' containment reference.
	 * @see #setNachweiseEinreichen(NachweiseEinreichenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type_NachweiseEinreichen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweiseEinreichen' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseEinreichenType getNachweiseEinreichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise Einreichen</em>' containment reference.
	 * @see #getNachweiseEinreichen()
	 * @generated
	 */
	void setNachweiseEinreichen(NachweiseEinreichenType value);

	/**
	 * Returns the value of the '<em><b>Stiefkindadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Stiefkindadoption
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stiefkindadoption</em>' containment reference.
	 * @see #setStiefkindadoption(StiefkindadoptionType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type_Stiefkindadoption()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stiefkindadoption' namespace='##targetNamespace'"
	 * @generated
	 */
	StiefkindadoptionType getStiefkindadoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getStiefkindadoption <em>Stiefkindadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stiefkindadoption</em>' containment reference.
	 * @see #getStiefkindadoption()
	 * @generated
	 */
	void setStiefkindadoption(StiefkindadoptionType value);

	/**
	 * Returns the value of the '<em><b>Verwandtenadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Verwandtenadoption
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verwandtenadoption</em>' containment reference.
	 * @see #setVerwandtenadoption(VerwandtenadoptionType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type_Verwandtenadoption()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verwandtenadoption' namespace='##targetNamespace'"
	 * @generated
	 */
	VerwandtenadoptionType getVerwandtenadoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getVerwandtenadoption <em>Verwandtenadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verwandtenadoption</em>' containment reference.
	 * @see #getVerwandtenadoption()
	 * @generated
	 */
	void setVerwandtenadoption(VerwandtenadoptionType value);

	/**
	 * Returns the value of the '<em><b>Fremdkindadoption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Fremdkindadoption
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fremdkindadoption</em>' containment reference.
	 * @see #setFremdkindadoption(FremdkindadoptionType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderAdoption0901Type_Fremdkindadoption()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fremdkindadoption' namespace='##targetNamespace'"
	 * @generated
	 */
	FremdkindadoptionType getFremdkindadoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type#getFremdkindadoption <em>Fremdkindadoption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fremdkindadoption</em>' containment reference.
	 * @see #getFremdkindadoption()
	 * @generated
	 */
	void setFremdkindadoption(FremdkindadoptionType value);

} // AdoptionundpflegekinderAdoption0901Type
