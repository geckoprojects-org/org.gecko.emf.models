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
 * A representation of the model object '<em><b>Sonstige Antraege Senden Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Formular sonstige Anträge senden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAntragdetails <em>Antragdetails</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getPflegekinder <em>Pflegekinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType()
 * @model extendedMetaData="name='SonstigeAntraegeSendenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SonstigeAntraegeSendenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_DatenschutzUndEinwilligung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzUndEinwilligung' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 */
	void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType value);

	/**
	 * Returns the value of the '<em><b>Allgemeine Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Angaben</em>' containment reference.
	 * @see #setAllgemeineAngaben(AllgemeineAngabenPflegeType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_AllgemeineAngaben()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='allgemeineAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeineAngabenPflegeType getAllgemeineAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Angaben</em>' containment reference.
	 * @see #getAllgemeineAngaben()
	 * @generated
	 */
	void setAllgemeineAngaben(AllgemeineAngabenPflegeType value);

	/**
	 * Returns the value of the '<em><b>Antragdetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Angaben zum Antrag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragdetails</em>' containment reference.
	 * @see #setAntragdetails(AntragdetailsType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_Antragdetails()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragdetails' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragdetailsType getAntragdetails();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getAntragdetails <em>Antragdetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragdetails</em>' containment reference.
	 * @see #getAntragdetails()
	 * @generated
	 */
	void setAntragdetails(AntragdetailsType value);

	/**
	 * Returns the value of the '<em><b>Pflegekinder</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den Pflegekindern
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflegekinder</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_Pflegekinder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pflegekinder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PflegekindType> getPflegekinder();

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweisdokument(e)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_Nachweise()
	 * @model containment="true"
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_DatenschutzDerFachbehoerde()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzDerFachbehoerde' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatenschutzUndEinwilligungType> getDatenschutzDerFachbehoerde();

	/**
	 * Returns the value of the '<em><b>Signatur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information zur elektronischen Signatur
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatur</em>' containment reference.
	 * @see #setSignatur(SignaturType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_Signatur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signatur' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturType getSignatur();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getSignatur <em>Signatur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatur</em>' containment reference.
	 * @see #getSignatur()
	 * @generated
	 */
	void setSignatur(SignaturType value);

	/**
	 * Returns the value of the '<em><b>Digitaler Rueckkanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum digitalen Rückkanal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #setDigitalerRueckkanal(DigitalerRueckkanalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getSonstigeAntraegeSendenType_DigitalerRueckkanal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='digitalerRueckkanal' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalerRueckkanalType getDigitalerRueckkanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 */
	void setDigitalerRueckkanal(DigitalerRueckkanalType value);

} // SonstigeAntraegeSendenType
