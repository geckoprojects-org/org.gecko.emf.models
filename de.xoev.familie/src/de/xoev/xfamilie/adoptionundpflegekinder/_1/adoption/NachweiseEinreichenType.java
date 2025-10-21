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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise Einreichen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Formular Nachweise einreichen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getAntragsteller <em>Antragsteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType()
 * @model extendedMetaData="name='NachweiseEinreichenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseEinreichenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType_DatenschutzUndEinwilligung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzUndEinwilligung' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 */
	void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType value);

	/**
	 * Returns the value of the '<em><b>Antragsteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum/zur Antragsteller:in
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragsteller</em>' containment reference.
	 * @see #setAntragsteller(AntragstellerType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType_Antragsteller()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragsteller' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellerType getAntragsteller();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getAntragsteller <em>Antragsteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragsteller</em>' containment reference.
	 * @see #getAntragsteller()
	 * @generated
	 */
	void setAntragsteller(AntragstellerType value);

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweisdokument(e)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType_Nachweise()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweise' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisType> getNachweise();

	/**
	 * Returns the value of the '<em><b>Datenschutz Der Fachbehoerde</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz der Fachbehörde
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutz Der Fachbehoerde</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType_DatenschutzDerFachbehoerde()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzDerFachbehoerde' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatenschutzUndEinwilligungType> getDatenschutzDerFachbehoerde();

	/**
	 * Returns the value of the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum digitalen Rückkanal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #setDigitalerRueckkanal(DigitalerRueckkanalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getNachweiseEinreichenType_DigitalerRueckkanal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='digitalerRueckkanal' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalerRueckkanalType getDigitalerRueckkanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 */
	void setDigitalerRueckkanal(DigitalerRueckkanalType value);

} // NachweiseEinreichenType
