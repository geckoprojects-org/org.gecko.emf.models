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
 * A representation of the model object '<em><b>Fremdkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Datenschutz, Personendaten, Anschrift, dem Anliegen, Datenschutz der Fachbehörde und dem digitalen Rückkanal
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getBeratungscode <em>Beratungscode</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAuseinandersetzungThemaAdoption <em>Auseinandersetzung Thema Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType()
 * @model extendedMetaData="name='FremdkindadoptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FremdkindadoptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eingabe des Beratungscodes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beratungscode</em>' attribute.
	 * @see #setBeratungscode(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_Beratungscode()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='beratungscode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeratungscode();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getBeratungscode <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beratungscode</em>' attribute.
	 * @see #getBeratungscode()
	 * @generated
	 */
	void setBeratungscode(String value);

	/**
	 * Returns the value of the '<em><b>Allgemeine Angaben</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Angaben</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_AllgemeineAngaben()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='allgemeineAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AllgemeineAngabenFremdkindadoptionType> getAllgemeineAngaben();

	/**
	 * Returns the value of the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Partnerschaft
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Partnerschaft</em>' containment reference.
	 * @see #setAngabenZurPartnerschaft(AngabenZurPartnerschaftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_AngabenZurPartnerschaft()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurPartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZurPartnerschaftType getAngabenZurPartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Partnerschaft</em>' containment reference.
	 * @see #getAngabenZurPartnerschaft()
	 * @generated
	 */
	void setAngabenZurPartnerschaft(AngabenZurPartnerschaftType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zu Kindern Der Familie</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Kindern in der Familie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zu Kindern Der Familie</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_AngabenZuKindernDerFamilie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenZuKindernDerFamilie' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenZuKindernDerFamilieType> getAngabenZuKindernDerFamilie();

	/**
	 * Returns the value of the '<em><b>Weitere Personen Im Hauhalt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Personen im Haushalt (über 18 Jahren).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Personen Im Hauhalt</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_WeiterePersonenImHauhalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weiterePersonenImHauhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeiterePersonenImHauhaltType> getWeiterePersonenImHauhalt();

	/**
	 * Returns the value of the '<em><b>Auseinandersetzung Thema Adoption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seit wann setzen Sie sich mit einer Adoption auseinander? Was sind die Gründe, warum Sie sich jetzt bewerben?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auseinandersetzung Thema Adoption</em>' attribute.
	 * @see #setAuseinandersetzungThemaAdoption(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_AuseinandersetzungThemaAdoption()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='auseinandersetzungThemaAdoption' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuseinandersetzungThemaAdoption();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getAuseinandersetzungThemaAdoption <em>Auseinandersetzung Thema Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auseinandersetzung Thema Adoption</em>' attribute.
	 * @see #getAuseinandersetzungThemaAdoption()
	 * @generated
	 */
	void setAuseinandersetzungThemaAdoption(String value);

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweisdokument(e)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_Nachweise()
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_DatenschutzDerFachbehoerde()
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_Signatur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signatur' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturType getSignatur();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getSignatur <em>Signatur</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_DigitalerRueckkanal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='digitalerRueckkanal' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalerRueckkanalType getDigitalerRueckkanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 */
	void setDigitalerRueckkanal(DigitalerRueckkanalType value);

	/**
	 * Returns the value of the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_DatenschutzUndEinwilligung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzUndEinwilligung' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 */
	void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType value);

	/**
	 * Returns the value of the '<em><b>Aertzliche Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Befinden Sie sich zurzeit in ärztlicher Behandlung wegen einem unerfüllten Kinderwunsch?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aertzliche Behandlung</em>' attribute.
	 * @see #isSetAertzlicheBehandlung()
	 * @see #unsetAertzlicheBehandlung()
	 * @see #setAertzlicheBehandlung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getFremdkindadoptionType_AertzlicheBehandlung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='aertzlicheBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAertzlicheBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aertzliche Behandlung</em>' attribute.
	 * @see #isSetAertzlicheBehandlung()
	 * @see #unsetAertzlicheBehandlung()
	 * @see #isAertzlicheBehandlung()
	 * @generated
	 */
	void setAertzlicheBehandlung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAertzlicheBehandlung()
	 * @see #isAertzlicheBehandlung()
	 * @see #setAertzlicheBehandlung(boolean)
	 * @generated
	 */
	void unsetAertzlicheBehandlung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aertzliche Behandlung</em>' attribute is set.
	 * @see #unsetAertzlicheBehandlung()
	 * @see #isAertzlicheBehandlung()
	 * @see #setAertzlicheBehandlung(boolean)
	 * @generated
	 */
	boolean isSetAertzlicheBehandlung();

} // FremdkindadoptionType
