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
 * A representation of the model object '<em><b>Adoptionundpflegekinder Pflegekinder0902 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getKontaktformular <em>Kontaktformular</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPflegeperson <em>Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getSonstigeAntraegeSenden <em>Sonstige Antraege Senden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getBeitragsuebernahmeUnfallversicherung <em>Beitragsuebernahme Unfallversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getAlterssicherungPflegeperson <em>Alterssicherung Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPauschalbetragVollzeitpflege <em>Pauschalbetrag Vollzeitpflege</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type()
 * @model extendedMetaData="name='adoptionundpflegekinder.pflegekinder.0902_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdoptionundpflegekinderPflegekinder0902Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Kontaktformular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Datenschutz, Personendaten, Anschrift, dem Anliegen, Datenschutz der Fachbehörde und dem digitalen Rückkanal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontaktformular</em>' containment reference.
	 * @see #setKontaktformular(KontakformularType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_Kontaktformular()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kontaktformular' namespace='##targetNamespace'"
	 * @generated
	 */
	KontakformularType getKontaktformular();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getKontaktformular <em>Kontaktformular</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_NachweiseEinreichen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweiseEinreichen' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseEinreichenType getNachweiseEinreichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getNachweiseEinreichen <em>Nachweise Einreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise Einreichen</em>' containment reference.
	 * @see #getNachweiseEinreichen()
	 * @generated
	 */
	void setNachweiseEinreichen(NachweiseEinreichenType value);

	/**
	 * Returns the value of the '<em><b>Pflegeperson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Pflegeperson
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflegeperson</em>' containment reference.
	 * @see #setPflegeperson(PflegepersonType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_Pflegeperson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pflegeperson' namespace='##targetNamespace'"
	 * @generated
	 */
	PflegepersonType getPflegeperson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPflegeperson <em>Pflegeperson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pflegeperson</em>' containment reference.
	 * @see #getPflegeperson()
	 * @generated
	 */
	void setPflegeperson(PflegepersonType value);

	/**
	 * Returns the value of the '<em><b>Sonstige Antraege Senden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular sonstige Anträge senden
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Antraege Senden</em>' containment reference.
	 * @see #setSonstigeAntraegeSenden(SonstigeAntraegeSendenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_SonstigeAntraegeSenden()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sonstigeAntraegeSenden' namespace='##targetNamespace'"
	 * @generated
	 */
	SonstigeAntraegeSendenType getSonstigeAntraegeSenden();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getSonstigeAntraegeSenden <em>Sonstige Antraege Senden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstige Antraege Senden</em>' containment reference.
	 * @see #getSonstigeAntraegeSenden()
	 * @generated
	 */
	void setSonstigeAntraegeSenden(SonstigeAntraegeSendenType value);

	/**
	 * Returns the value of the '<em><b>Beitragsuebernahme Unfallversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Beitragsübernahme der Unfallversicherung von Pflegepersonen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beitragsuebernahme Unfallversicherung</em>' containment reference.
	 * @see #setBeitragsuebernahmeUnfallversicherung(BeitragsuebernahmeUnfallversicherungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_BeitragsuebernahmeUnfallversicherung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beitragsuebernahmeUnfallversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	BeitragsuebernahmeUnfallversicherungType getBeitragsuebernahmeUnfallversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getBeitragsuebernahmeUnfallversicherung <em>Beitragsuebernahme Unfallversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beitragsuebernahme Unfallversicherung</em>' containment reference.
	 * @see #getBeitragsuebernahmeUnfallversicherung()
	 * @generated
	 */
	void setBeitragsuebernahmeUnfallversicherung(BeitragsuebernahmeUnfallversicherungType value);

	/**
	 * Returns the value of the '<em><b>Alterssicherung Pflegeperson</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular Altersvorsorge von Pflegepersonen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alterssicherung Pflegeperson</em>' containment reference.
	 * @see #setAlterssicherungPflegeperson(AlterssicherungPflegepersonType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_AlterssicherungPflegeperson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alterssicherungPflegeperson' namespace='##targetNamespace'"
	 * @generated
	 */
	AlterssicherungPflegepersonType getAlterssicherungPflegeperson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getAlterssicherungPflegeperson <em>Alterssicherung Pflegeperson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alterssicherung Pflegeperson</em>' containment reference.
	 * @see #getAlterssicherungPflegeperson()
	 * @generated
	 */
	void setAlterssicherungPflegeperson(AlterssicherungPflegepersonType value);

	/**
	 * Returns the value of the '<em><b>Pauschalbetrag Vollzeitpflege</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formular monatlicher Pauschalbetrag in der Vollzeitpflege
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pauschalbetrag Vollzeitpflege</em>' containment reference.
	 * @see #setPauschalbetragVollzeitpflege(PauschalbetragVollzeitpflegeType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAdoptionundpflegekinderPflegekinder0902Type_PauschalbetragVollzeitpflege()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pauschalbetragVollzeitpflege' namespace='##targetNamespace'"
	 * @generated
	 */
	PauschalbetragVollzeitpflegeType getPauschalbetragVollzeitpflege();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type#getPauschalbetragVollzeitpflege <em>Pauschalbetrag Vollzeitpflege</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pauschalbetrag Vollzeitpflege</em>' containment reference.
	 * @see #getPauschalbetragVollzeitpflege()
	 * @generated
	 */
	void setPauschalbetragVollzeitpflege(PauschalbetragVollzeitpflegeType value);

} // AdoptionundpflegekinderPflegekinder0902Type
