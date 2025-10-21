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
 * A representation of the model object '<em><b>Stiefkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Formular Stiefkindadoption
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getBeratungscode <em>Beratungscode</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenDesZuAdoptierendenKindes <em>Angaben Des Zu Adoptierenden Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getVerbleibenderSorgeberechtigterElternteil <em>Verbleibender Sorgeberechtigter Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAnnehmenderElternteil <em>Annehmender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAbgebenderElternteil <em>Abgebender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType()
 * @model extendedMetaData="name='StiefkindadoptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StiefkindadoptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beratungscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eingabe des Beratungscodes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beratungscode</em>' attribute.
	 * @see #setBeratungscode(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_Beratungscode()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='beratungscode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeratungscode();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getBeratungscode <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beratungscode</em>' attribute.
	 * @see #getBeratungscode()
	 * @generated
	 */
	void setBeratungscode(String value);

	/**
	 * Returns the value of the '<em><b>Datenschutz Und Einwilligung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_DatenschutzUndEinwilligung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzUndEinwilligung' namespace='##targetNamespace'"
	 * @generated
	 */
	DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutz Und Einwilligung</em>' containment reference.
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 */
	void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType value);

	/**
	 * Returns the value of the '<em><b>Angaben Des Zu Adoptierenden Kindes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben des zu adoptierenden Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Des Zu Adoptierenden Kindes</em>' containment reference.
	 * @see #setAngabenDesZuAdoptierendenKindes(AngabenDesZuAdoptierendenKindesType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AngabenDesZuAdoptierendenKindes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenDesZuAdoptierendenKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenDesZuAdoptierendenKindesType getAngabenDesZuAdoptierendenKindes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenDesZuAdoptierendenKindes <em>Angaben Des Zu Adoptierenden Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Des Zu Adoptierenden Kindes</em>' containment reference.
	 * @see #getAngabenDesZuAdoptierendenKindes()
	 * @generated
	 */
	void setAngabenDesZuAdoptierendenKindes(AngabenDesZuAdoptierendenKindesType value);

	/**
	 * Returns the value of the '<em><b>Allgemeine Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Angaben</em>' containment reference.
	 * @see #setAllgemeineAngaben(AllgemeineAngabenStiefkindadoptionType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AllgemeineAngaben()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='allgemeineAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeineAngabenStiefkindadoptionType getAllgemeineAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAllgemeineAngaben <em>Allgemeine Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Angaben</em>' containment reference.
	 * @see #getAllgemeineAngaben()
	 * @generated
	 */
	void setAllgemeineAngaben(AllgemeineAngabenStiefkindadoptionType value);

	/**
	 * Returns the value of the '<em><b>Verbleibender Sorgeberechtigter Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum verbleibenden/sorgeberechtigten Elternteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbleibender Sorgeberechtigter Elternteil</em>' containment reference.
	 * @see #setVerbleibenderSorgeberechtigterElternteil(VerbleibenderSorgeberechtigterElternteilType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_VerbleibenderSorgeberechtigterElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verbleibenderSorgeberechtigterElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	VerbleibenderSorgeberechtigterElternteilType getVerbleibenderSorgeberechtigterElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getVerbleibenderSorgeberechtigterElternteil <em>Verbleibender Sorgeberechtigter Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbleibender Sorgeberechtigter Elternteil</em>' containment reference.
	 * @see #getVerbleibenderSorgeberechtigterElternteil()
	 * @generated
	 */
	void setVerbleibenderSorgeberechtigterElternteil(VerbleibenderSorgeberechtigterElternteilType value);

	/**
	 * Returns the value of the '<em><b>Annehmender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum annehmenden Elternteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annehmender Elternteil</em>' containment reference.
	 * @see #setAnnehmenderElternteil(AnnehmenderElternteilType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AnnehmenderElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='annehmenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnehmenderElternteilType getAnnehmenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAnnehmenderElternteil <em>Annehmender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annehmender Elternteil</em>' containment reference.
	 * @see #getAnnehmenderElternteil()
	 * @generated
	 */
	void setAnnehmenderElternteil(AnnehmenderElternteilType value);

	/**
	 * Returns the value of the '<em><b>Angaben Zur Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Partnerschaft
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Partnerschaft</em>' containment reference.
	 * @see #setAngabenZurPartnerschaft(AngabenZurPartnerschaftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AngabenZurPartnerschaft()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurPartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZurPartnerschaftType getAngabenZurPartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AngabenZuKindernDerFamilie()
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
	 * Weitere Personen im Haushalt (über 18 Jahren)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Personen Im Hauhalt</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_WeiterePersonenImHauhalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weiterePersonenImHauhalt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeiterePersonenImHauhaltType> getWeiterePersonenImHauhalt();

	/**
	 * Returns the value of the '<em><b>Abgebender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum abgebenden Elternteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abgebender Elternteil</em>' containment reference.
	 * @see #setAbgebenderElternteil(AbgebenderElternteilType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_AbgebenderElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abgebenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AbgebenderElternteilType getAbgebenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getAbgebenderElternteil <em>Abgebender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abgebender Elternteil</em>' containment reference.
	 * @see #getAbgebenderElternteil()
	 * @generated
	 */
	void setAbgebenderElternteil(AbgebenderElternteilType value);

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweisdokument(e)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference list.
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_Nachweise()
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_DatenschutzDerFachbehoerde()
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_Signatur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signatur' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturType getSignatur();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getSignatur <em>Signatur</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getStiefkindadoptionType_DigitalerRueckkanal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='digitalerRueckkanal' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalerRueckkanalType getDigitalerRueckkanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.StiefkindadoptionType#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitaler Rueckkanal</em>' containment reference.
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 */
	void setDigitalerRueckkanal(DigitalerRueckkanalType value);

} // StiefkindadoptionType
